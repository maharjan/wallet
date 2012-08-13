package com.pj.wallet.shared.exceptions;

import java.io.Serializable;

public class ServiceTransactionRepeatedException extends ClientException implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String message;

	private final long serviceTransactionId;

	public ServiceTransactionRepeatedException(long sid, String message) {
		this.serviceTransactionId = sid;
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public long getServiceTransactionId() {
		return serviceTransactionId;
	}

}
