package com.pj.wallet.client.validation;

import java.util.HashMap;
import java.util.Map;

public class ValidationMessages {
	
	private static Map<String, String> message = new HashMap<String, String>();

	public static void setUpValidationMessages() {
		message.put(ValidationErrorCode.REQUIRED.toString(), "Required");
		message.put(ValidationErrorCode.ALPHA_NUMERIC.toString(), "Must be alpha numeric");
	}
	
	public static String getErrorMessage(String errorCode) {
		setUpValidationMessages();
		return message.get(errorCode);
	}
}
