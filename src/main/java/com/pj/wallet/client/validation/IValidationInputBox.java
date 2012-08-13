package com.pj.wallet.client.validation;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;

public interface IValidationInputBox<T> extends IsWidget, HasText {

	/**
	 * Validate text box for input.
	 * 
	 * @return
	 */
	ValidationErrorCode validate();

	void showInvalid();

	void removeInvalid();

	String getErrorMessage();

}
