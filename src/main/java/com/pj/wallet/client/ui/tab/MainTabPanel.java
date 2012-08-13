package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.TabData;

public class MainTabPanel extends BaseTabPanel {

	private static MainTabPanelUiBinder uiBinder = GWT.create(MainTabPanelUiBinder.class);

	interface MainTabPanelUiBinder extends UiBinder<Widget, MainTabPanel> {
	}
	
	@UiField
	HTMLPanel mainContainer;

	public MainTabPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	protected BaseTab createNewTab(TabData tabData) {
		return new MainTab(tabData);
	}

}
