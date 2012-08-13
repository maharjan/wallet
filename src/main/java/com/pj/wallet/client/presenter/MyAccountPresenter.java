package com.pj.wallet.client.presenter;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.RequestTabs;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.TabContentProxy;
import com.pj.wallet.client.mvp.MainNameToken;
import com.pj.wallet.client.mvp.WalletGinjector;
import com.pj.wallet.client.view.AccountBase;

public class MyAccountPresenter extends SubContainerPresenterBase<AccountBase, MyAccountPresenter.AccountProxy> implements AccountBase.AccountBaseViewUiHandlers{

	@Inject
	public MyAccountPresenter(EventBus eventBus, AccountBase view, AccountProxy proxy) {
		super(eventBus, view, proxy, TYPE_SetTabContent, TYPE_RequestTabs);
	}

	@ProxyCodeSplit
	public interface AccountProxy extends TabContentProxy<MyAccountPresenter> {

	}

	@TabInfo(container = MainPagePresenter.class, priority = 0, nameToken = MainNameToken.USER_TRANSACTION)
	static String getTabLabel(WalletGinjector ginjector) {
		return ginjector.walletConstants().myWallet();
	}

	/**
	 * This will be the event sent to our "unknown" child presenters, in order
	 * for them to register their tabs.
	 */
	@RequestTabs
	public static final Type<RequestTabsHandler> TYPE_RequestTabs = new Type<RequestTabsHandler>();

	@ContentSlot
	public static final Type<RevealContentHandler<?>> TYPE_SetTabContent = new Type<RevealContentHandler<?>>();

}
