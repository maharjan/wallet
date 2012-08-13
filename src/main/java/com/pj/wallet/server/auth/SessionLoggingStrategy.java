package com.pj.wallet.server.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.authentication.session.ConcurrentSessionControlStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.security.web.session.HttpSessionDestroyedEvent;

import com.pj.wallet.server.api.UserSessionApi;


public class SessionLoggingStrategy implements SessionAuthenticationStrategy, ApplicationListener<HttpSessionDestroyedEvent> {

	private final ConcurrentSessionControlStrategy concurrentSessionControlStrategy;

	private final Logger logger = LoggerFactory.getLogger(SessionLoggingStrategy.class);

	private final UserSessionApi userSessionApi;

	public SessionLoggingStrategy(ConcurrentSessionControlStrategy concurrentSessionControlStrategy, UserSessionApi userSessionApi) {
		this.concurrentSessionControlStrategy = concurrentSessionControlStrategy;
		this.userSessionApi = userSessionApi;
	}

	@Override
	public void onAuthentication(Authentication authentication, HttpServletRequest request, HttpServletResponse response) throws SessionAuthenticationException {
		concurrentSessionControlStrategy.onAuthentication(authentication, request, response);

		logger.debug("User logged in from: " + request.getRemoteAddr());

		Object principal = authentication.getPrincipal();
		if (principal instanceof UserDetailsWrapper) {
			userSessionApi.userLoggedIn(((UserDetailsWrapper) principal).getUser().getId(), request.getSession(false).getId());
		}
	}

	@Override
	public void onApplicationEvent(HttpSessionDestroyedEvent event) {
		HttpSession session = event.getSession();
		Object context = session.getAttribute("SPRING_SECURITY_CONTEXT");
		if (context instanceof SecurityContext) {
			SecurityContext securityContext = (SecurityContext) context;
			Authentication authentication = securityContext.getAuthentication();
			Object principal = authentication.getPrincipal();
			if (principal instanceof UserDetailsWrapper) {
				userSessionApi.userLoggedOut(((UserDetailsWrapper) principal).getUser().getId(), event.getSession().getId());
			}
		}
	}
}
