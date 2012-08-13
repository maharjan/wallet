package com.pj.wallet.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.pj.wallet.client.mvp.WalletGinjector;
import com.pj.wallet.client.resources.WalletResources;

public class MainApp implements EntryPoint {
	public final WalletGinjector ginjector = GWT.create(WalletGinjector.class);
	@Override
	public void onModuleLoad() {
		WalletResources.INSTANCE.walletCss().ensureInjected();

		RootPanel loader = RootPanel.get("loader");
		loader.setStyleName("in-loader");

		DelayedBindRegistry.bind(ginjector);
		ginjector.getPlaceManager().revealCurrentPlace();
	}

}
