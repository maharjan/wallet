package com.pj.wallet.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwtplatform.mvp.client.proxy.NotifyingAsyncCallback;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.common.client.CodeSplitProvider;
import com.gwtplatform.common.client.CodeSplitBundleProvider;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.DelayedBind;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;

public class MyAccountPresenterAccountProxyImpl extends com.gwtplatform.mvp.client.proxy.TabContentProxyImpl<MyAccountPresenter> implements com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.pj.wallet.client.mvp.WalletGinjector ginjector;
  
  public MyAccountPresenterAccountProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.pj.wallet.client.mvp.WalletGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    requestTabsEventType = com.pj.wallet.client.presenter.MainPagePresenter.TYPE_RequestTabs;
    tabData = getTabDataInternal(ginjector);
    targetHistoryToken = "!usertransaction";
    addRequestTabsHandler();
    presenter = new CodeSplitProvider<MyAccountPresenter>( ginjector.getMyAccountPresnter() );
    
    RevealContentHandler<MyAccountPresenter> revealContentHandler = new RevealContentHandler<MyAccountPresenter>( eventBus, this );
    getEventBus().addHandler( MyAccountPresenter.TYPE_SetTabContent, revealContentHandler );
  }
  
  protected TabData getTabDataInternal(com.pj.wallet.client.mvp.WalletGinjector ginjector) {
      return new TabDataBasic(MyAccountPresenter.getTabLabel( ginjector), 0);
  }
}
