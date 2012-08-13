package com.pj.wallet.server.remoting;

import java.text.MessageFormat;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.context.ServletContextAware;


import com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.server.rpc.RPC;
import com.google.gwt.user.server.rpc.RPCRequest;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pj.wallet.server.exception.ClientException;
import com.pj.wallet.shared.exceptions.AuthenticationRequiredException;

public class GwtServletWrapper extends RemoteServiceServlet implements ServletContextAware {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(GwtServletWrapper.class);

	private final Object remoteService;

	private ServletContext servletContext;

	public GwtServletWrapper(Object remoteService) {
		this.remoteService = remoteService;
	}

	@Override
	public ServletContext getServletContext() {
		return servletContext;
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Override
	public String processCall(String payload) throws SerializationException {
		Class<?> remoteServiceClass = remoteService.getClass();
		String remoteServiceName = remoteServiceClass.getSimpleName();

		RPCRequest rpcRequest = RPC.decodeRequest(payload, remoteServiceClass);

		try {
			// delegate work to the spring injected service
			String result = RPC.invokeAndEncodeResponse(remoteService, rpcRequest.getMethod(), rpcRequest.getParameters());

			if (logger.isTraceEnabled()) {
//				logger.trace("{}.{}: {}", new Object[] { remoteServiceName, rpcRequest.getMethod().getName(), StringUtils.abbreviate(result, 1000) });
			}
			return result;
		} catch (IncompatibleRemoteServiceException ex) {
			if (logger.isDebugEnabled()) {
				logger.error(MessageFormat.format("error on calling {0}.{1}", remoteServiceName, rpcRequest.getMethod().getName()), ex);
			}

			return RPC.encodeResponseForFailure(null, ex);
		} catch (RuntimeException ex) {
			if (logger.isDebugEnabled()) {
				logger.error(MessageFormat.format("error on calling {0}.{1}", remoteServiceName, rpcRequest.getMethod().getName()), ex);
			}

			if (ex.getCause() instanceof AccessDeniedException) {
				return RPC.encodeResponseForFailure(null, new AuthenticationRequiredException(ex.getMessage()));
			}

			return RPC.encodeResponseForFailure(null, new ClientException(ex.getMessage()));
		}
	}
}
