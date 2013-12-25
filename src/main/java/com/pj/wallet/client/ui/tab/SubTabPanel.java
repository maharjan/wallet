package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;

public class SubTabPanel extends BaseTabPanel {

	private static SubTabPanelUiBinder uiBinder = GWT.create(SubTabPanelUiBinder.class);

	interface SubTabPanelUiBinder extends UiBinder<Widget, SubTabPanel> {
	}

	public SubTabPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	protected BaseTab createNewTab(TabData tabData) {
		return new SubTab(tabData);
	}

	@Override
	public void changeTab(Tab tab, TabData tabData, String historyToken) {
		// TODO Auto-generated method stub
		
	}
}
