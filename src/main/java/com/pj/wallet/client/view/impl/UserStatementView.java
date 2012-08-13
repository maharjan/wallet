package com.pj.wallet.client.view.impl;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.pj.wallet.client.view.UserStatement;

public class UserStatementView extends ViewImpl implements UserStatement {

	private static UserStatementViewUiBinder uiBinder = GWT
			.create(UserStatementViewUiBinder.class);

	interface UserStatementViewUiBinder extends
			UiBinder<Widget, UserStatementView> {
	}

	private Widget widget;
	private UserStatementUiHandlers uiHandlers;

	public UserStatementView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return this.widget;
	}

	@Override
	public void setUiHandlers(UserStatementUiHandlers uiHandlers) {
		this.uiHandlers = uiHandlers;
	}

}
