package com.pj.wallet.shared.exceptions;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ValidationError implements IsSerializable {
	
	private String field;
	private String code;

	public ValidationError() {}
	
	public ValidationError(String field,String code) {
		this.field = field;
		this.code = code;
	}
	
	public String getField() {
		return field;
	}
	
	public String getCode() {
		return code;
	}

}
