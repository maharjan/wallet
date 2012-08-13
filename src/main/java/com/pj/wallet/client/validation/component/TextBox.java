package com.pj.wallet.client.validation.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.pj.wallet.client.resources.WalletResources;
import com.pj.wallet.client.validation.ValidatingTextBox;
import com.pj.wallet.client.validation.ValidationErrorCode;

public class TextBox extends Composite implements HasCaption {

	private static TextBoxUiBinder uiBinder = GWT.create(TextBoxUiBinder.class);

	interface TextBoxUiBinder extends UiBinder<Widget, TextBox> {
	}

	@UiField
	FlowPanel panel;
	@UiField
	Label label;
	@UiField
	ValidatingTextBox input;
	@UiField
	HTML error;

	private boolean validate = false;
	private boolean required = false;
	private boolean alpha = false;
	private boolean numeric = false;
	private boolean alphanumeric = false;

	public TextBox() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public String getCaption() {
		return label.getText();
	}

	@Override
	public void setCaption(String caption) {
		label.setText(caption);
	}

	/**
	 * Perform Validation for given attribute
	 * 
	 * @return
	 */
	public boolean validate() {
		boolean valid = true;
		if (validate) {
			input.setRequired(required);
			input.setAlphabetic(alpha);
			input.setAlphaNumeric(alphanumeric);
			valid = input.validate().equals(ValidationErrorCode.VALID) && valid;
			error.setText(input.getErrorMessage());
		}
		return valid;
	}

	/**
	 * Get item value
	 * 
	 * @return
	 */
	public String getInputText() {
		return input.getText().trim();
	}

	/**
	 * Set value to item
	 * 
	 * @param text
	 */
	public void setInputText(String text) {
		input.setText(text.trim());
	}

	public String getErrorText() {
		return error.getText().trim();
	}

	/**
	 * Set error message(if any) for input widget
	 * 
	 * @param text
	 */
	public void setErrorText(String text) {
		input.addStyleName(WalletResources.INSTANCE.walletCss().error());
		error.setText(text.trim());
	}

	public boolean isValidate() {
		return validate;
	}


	/**
	 * Set parameter validate as true or false
	 * 
	 * @param value
	 */
	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	/**
	 * Set parameter required as true or false
	 * 
	 * @param value
	 */
	public void setRequired(boolean value) {
		required = value;
	}

	/**
	 * Set parameter alphabetic as true or false
	 * 
	 * @param value
	 */
	public void setAlphabetic(boolean value) {
		alpha = value;
	}

	public void setAlphaNumeric(boolean value) {
		alphanumeric = value;
	}

	/**
	 * Set parameter numeric as true or false
	 * 
	 * @param value
	 */
	public void setNumeric(boolean value) {
		numeric = value;
	}

	/**
	 * Set parameter maxLength value
	 * 
	 * @param value
	 */
	public void setMaximumLength(int length) {
		input.setMaxLength(length);
	}

	/**
	 * Set parameter minLength value
	 * 
	 * @param value
	 */
	public void setMinimumLength(int length) {
		input.setMinimumLength(length);
	}

	/**
	 * 
	 * @param style
	 */
	public void setPanelStyle(String style) {
		panel.setStyleName(style);
	}

	/**
	 * Set css style for input widget
	 * 
	 * @param style
	 */
	public void setItemStyle(String style) {
		input.setStyleName(style);
	}

	/**
	 * Set css style for error message
	 * 
	 * @param style
	 */
	public void setErrorStyle(String style) {
		error.setStyleName(style);
	}

	/**
	 * Set css style for input label widget
	 * 
	 * @param style
	 */
	public void setLabelStyle(String style) {
		label.setStyleName(style);
	}

	/**
	 * Set default css style for error widget
	 */
	public void setErrorStyle() {
		error.setStyleName(WalletResources.INSTANCE.walletCss().errorMessage());
	}

	/**
	 * Set css style for panel that layers input, error & label widget.
	 */
	public void setInputPanelStyle(String style) {
		panel.setStyleName(style);
	}

	public void clear() {
		error.setText("");
		setInputText("");
		input.removeInvalid();
	}

}
