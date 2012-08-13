package com.pj.wallet.client.validation;

import com.pj.wallet.client.resources.WalletResources;

public class ValidationInputBox<T> {
	private boolean required = false;
	private int minimum = 0;
	private int maximum = 0;
	private boolean alphabetic = false;
	private boolean alphaNumeric = false;
	public String errorMessage = "";
	private final IValidationInputBox<T> validationInputBox;

	public ValidationInputBox(IValidationInputBox<T> validationInputBox) {
		this.validationInputBox = validationInputBox;
	}

	public void showInvalid() {
		validationInputBox.asWidget().addStyleName(WalletResources.INSTANCE.walletCss().error());
	}

	public ValidationErrorCode removeInvalid() {
		errorMessage = "";
		validationInputBox.asWidget().removeStyleName(WalletResources.INSTANCE.walletCss().error());
		return ValidationErrorCode.VALID;
	}

	private ValidationErrorCode getValidationMessage(ValidationErrorCode validation) {
		showInvalid();
		errorMessage = ValidationMessages.getErrorMessage(validation.toString());
		return validation;
	}

	public ValidationErrorCode validate() {
		if (required && validationInputBox.getText().isEmpty()) {
			return getValidationMessage(ValidationErrorCode.REQUIRED);
		}
		// check for whitespace only
		// if (required && validationInputBox.getText().startsWith("\\s+")) {
		// return getValidationMessage(ValidationErrorCode.WHITESPACES);
		// }

		if (maximum > 0 && validationInputBox.getText().length() > maximum) {
			return getValidationMessage(ValidationErrorCode.LENGTH_LONG);
		}
		if (required && minimum > 0 && validationInputBox.getText().length() < minimum || !required && minimum > 0
				&& !validationInputBox.getText().isEmpty() && validationInputBox.getText().length() < minimum) {
			return getValidationMessage(ValidationErrorCode.LENGTH_SHORT);
		}
		return removeInvalid();
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public boolean isAlphabetic() {
		return alphabetic;
	}

	public void setAlphabetic(boolean alphabetic) {
		this.alphabetic = alphabetic;
	}

	public boolean isAlphaNumeric() {
		return alphaNumeric;
	}

	public void setAlphaNumeric(boolean alphaNumeric) {
		this.alphaNumeric = alphaNumeric;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
