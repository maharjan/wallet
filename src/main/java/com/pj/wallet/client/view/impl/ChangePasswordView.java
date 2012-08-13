package com.pj.wallet.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.pj.wallet.client.validation.component.TextBox;
import com.pj.wallet.client.view.ChangePassword;

public class ChangePasswordView extends ViewImpl implements ChangePassword {

	private static ChangePasswordViewUiBinder uiBinder = GWT.create(ChangePasswordViewUiBinder.class);

	interface ChangePasswordViewUiBinder extends UiBinder<Widget, ChangePasswordView> {
	}

	private Widget widget;
	private ChangePasswordUiHandler uiHandler;

	@UiField
	TextBox oldPassword;
	@UiField
	TextBox newPassword;
	@UiField
	TextBox confirmNewPassword;
	@UiField
	Button submitButton;

	public ChangePasswordView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@UiHandler("submitButton")
	public void onSubmitButtonClicked(ClickEvent evt) {
		if (validate()) {
			if (!newPassword.getInputText().equals(confirmNewPassword.getInputText())) {
				// setErrorMessage("Password don't match");
				newPassword.clear();
				confirmNewPassword.clear();
			} else {
			}
		} else {
		}
	}

	private boolean validate() {
		boolean valid = true;
		valid = oldPassword.validate() && valid;
		valid = newPassword.validate() && valid;
		valid = confirmNewPassword.validate() && valid;
		return valid;
	}

	@Override
	public Widget asWidget() {
		return this.widget;
	}

	@Override
	public void setUiHandlers(ChangePasswordUiHandler uiHandlers) {
		this.uiHandler = uiHandlers;
	}

}
