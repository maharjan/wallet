package com.pj.wallet.client.mvp;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.pj.wallet.client.i18n.WalletConstants;
import com.pj.wallet.client.presenter.ChangePasswordPresenter;
import com.pj.wallet.client.presenter.MainPagePresenter;
import com.pj.wallet.client.presenter.MyAccountPresenter;
import com.pj.wallet.client.presenter.UserStatementPresenter;

@GinModules({ WalletMainModule.class })
public interface WalletGinjector extends Ginjector{
	PlaceManager getPlaceManager();

	EventBus getEventBus();
	
	WalletConstants walletConstants();
	//Main Presenter
	Provider<MainPagePresenter> getMainPagePresenter();
	
	// Main tab presenter
	AsyncProvider<MyAccountPresenter> getMyAccountPresnter();
	
	//sub tab presenter
	AsyncProvider<UserStatementPresenter> getUserStatement();
	
	AsyncProvider<ChangePasswordPresenter> getChangePassword();
}
