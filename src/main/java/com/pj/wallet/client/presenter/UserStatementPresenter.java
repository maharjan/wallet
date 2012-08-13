package com.pj.wallet.client.presenter;


import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.annotations.TitleFunction;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.pj.wallet.client.mvp.MainNameToken;
import com.pj.wallet.client.mvp.WalletGinjector;
import com.pj.wallet.client.view.UserStatement;

public class UserStatementPresenter extends Presenter<UserStatement, UserStatementPresenter.UserStatementProxy> implements UserStatement.UserStatementUiHandlers{

	@Inject
	public UserStatementPresenter(EventBus eventBus, UserStatement view, UserStatementProxy proxy) {
		super(eventBus, view, proxy);
		getView().setUiHandlers(this);
	}
	
	@ProxyCodeSplit
	@NameToken(MainNameToken.USER_TRANSACTION)
	public interface UserStatementProxy extends TabContentProxyPlace<UserStatementPresenter> {

	}

	@TabInfo(container = MyAccountPresenter.class)
	static TabData getTabLabel(WalletGinjector ginjector) {
		return new TabDataBasic(ginjector.walletConstants().userStatement(), 0);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, MyAccountPresenter.TYPE_SetTabContent, this);
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@TitleFunction
	public String getTranslatedTitle(WalletGinjector gInjector) {
		return gInjector.walletConstants().userStatement();
	}
}
