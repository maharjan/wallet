package com.pj.wallet.client.validation;

import com.google.gwt.user.client.ui.TextBox;

public class ValidatingTextBox extends TextBox implements IValidationInputBox<String> {
	private final ValidationInputBox<String> validation;

	public ValidatingTextBox() {
		validation = new ValidationInputBox<String>(this);
	}

	@Override
	public ValidationErrorCode validate() {
		return validation.validate();
	}
	
	@Override
	public String getErrorMessage() {
		return validation.getErrorMessage();
	}

	@Override
	public void showInvalid() {
		validation.showInvalid();
	}

	@Override
	public void removeInvalid() {
		validation.removeInvalid();
	}

	public void setRequired(boolean value) {
		validation.setRequired(value);
	}

	public void setMaximumLength(int value) {
		validation.setMaximum(value);
	}

	public void setMinimumLength(int value) {
		validation.setMinimum(value);
	}

	public void setAlphabetic(boolean value) {
		validation.setAlphabetic(value);
	}

	public void setAlphaNumeric(boolean value) {
		validation.setAlphaNumeric(value);
	}
}
