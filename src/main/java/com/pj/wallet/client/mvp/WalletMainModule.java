package com.pj.wallet.client.mvp;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.RootPresenter;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;
import com.pj.wallet.client.presenter.ChangePasswordPresenter;
import com.pj.wallet.client.presenter.MainPagePresenter;
import com.pj.wallet.client.presenter.MyAccountPresenter;
import com.pj.wallet.client.presenter.MyRootpresenter;
import com.pj.wallet.client.presenter.UserStatementPresenter;
import com.pj.wallet.client.view.AccountBase;
import com.pj.wallet.client.view.ChangePassword;
import com.pj.wallet.client.view.UserStatement;
import com.pj.wallet.client.view.impl.AccountBaseView;
import com.pj.wallet.client.view.impl.ChangePasswordView;
import com.pj.wallet.client.view.impl.MainPageView;
import com.pj.wallet.client.view.impl.UserStatementView;

public class WalletMainModule extends AbstractPresenterModule{

	@Override
	protected void configure() {
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(TokenFormatter.class).to(ParameterTokenFormatter.class).in(Singleton.class);
		bind(RootPresenter.class).to(MyRootpresenter.class).asEagerSingleton();
		bind(PlaceManager.class).to(WalletPlaceManager.class).in(Singleton.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(MainNameToken.USER_TRANSACTION);
		// Main Page
		bindPresenter(MainPagePresenter.class, MainPagePresenter.MainPage.class, MainPageView.class, MainPagePresenter.MainProxy.class);
		// main tab content
		bindPresenter(MyAccountPresenter.class, AccountBase.class, AccountBaseView.class, MyAccountPresenter.AccountProxy.class);
		
		//sub tab content
		bindPresenter(UserStatementPresenter.class, UserStatement.class, UserStatementView.class, UserStatementPresenter.UserStatementProxy.class);
		
		bindPresenter(ChangePasswordPresenter.class, ChangePassword.class, ChangePasswordView.class, ChangePasswordPresenter.ChangePasswordProxy.class);
	}

}
