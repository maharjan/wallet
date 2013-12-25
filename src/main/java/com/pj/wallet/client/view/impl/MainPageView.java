package com.pj.wallet.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.ViewImpl;
import com.pj.wallet.client.presenter.MainPagePresenter;
import com.pj.wallet.client.presenter.MainPagePresenter.MainPage;
import com.pj.wallet.client.ui.tab.MainTabPanel;

public class MainPageView extends ViewImpl implements MainPage {

	private static MainPageViewUiBinder uiBinder = GWT.create(MainPageViewUiBinder.class);

	interface MainPageViewUiBinder extends UiBinder<Widget, MainPageView> {
	}

	private Widget widget;
	@UiField
	MainTabPanel tabPanel;

	public MainPageView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return this.widget;
	}

	public void setInSlot(Object slot, Widget content) {
		if (slot == MainPagePresenter.TYPE_SetMainContent) {
			tabPanel.setPanelContent(content);
		} else {
			super.setInSlot(slot, content);
		}
	}

	@Override
	public Tab addTab(TabData tabData, String historyToken) {
		return tabPanel.addTab(tabData, historyToken);
	}

	@Override
	public void removeTab(Tab tab) {
		tabPanel.removeTab(tab);
	}

	@Override
	public void removeTabs() {
		tabPanel.removeTabs();
	}

	@Override
	public void setActiveTab(Tab tab) {
		tabPanel.setActiveTab(tab);
	}

	@Override
	public void changeTab(Tab tab, TabData tabData, String historyToken) {
		// TODO Auto-generated method stub

	}

}
