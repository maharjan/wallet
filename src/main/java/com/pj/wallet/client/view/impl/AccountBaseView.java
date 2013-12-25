package com.pj.wallet.client.view.impl;


import com.google.gwt.user.client.ui.Widget;
import com.pj.wallet.client.presenter.MyAccountPresenter;
import com.pj.wallet.client.view.AccountBase;

public class AccountBaseView extends SubTabContainer implements AccountBase {

	@Override
	public void setUiHandlers(AccountBaseViewUiHandlers uiHandlers) {
	}

//	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == MyAccountPresenter.TYPE_SetTabContent) {
			tabPanel.setPanelContent(content);
		} else {
			super.setInSlot(slot, content);
		}
	}

}
