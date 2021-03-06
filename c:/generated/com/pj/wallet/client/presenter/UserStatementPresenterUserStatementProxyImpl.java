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
import com.gwtplatform.mvp.client.proxy.GetPlaceTitleEvent;
import java.lang.Throwable;

public class UserStatementPresenterUserStatementProxyImpl extends com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl<UserStatementPresenter> implements com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.pj.wallet.client.mvp.WalletGinjector ginjector;
  
  public static class WrappedProxy
  extends com.gwtplatform.mvp.client.proxy.TabContentProxyImpl<UserStatementPresenter> implements com.gwtplatform.mvp.client.DelayedBind {
    
    private com.pj.wallet.client.mvp.WalletGinjector ginjector;
    
    public WrappedProxy() {
    }
    
    @Override
    public void delayedBind(Ginjector baseGinjector) {
      ginjector = (com.pj.wallet.client.mvp.WalletGinjector)baseGinjector;
      bind(ginjector.getPlaceManager(),
          ginjector.getEventBus());
      requestTabsEventType = com.pj.wallet.client.presenter.MyAccountPresenter.TYPE_RequestTabs;
      tabData = getTabDataInternal(ginjector);
      targetHistoryToken = "!usertransaction";
      addRequestTabsHandler();
      presenter = new CodeSplitProvider<UserStatementPresenter>( ginjector.getUserStatement() );
    }
    
    protected TabData getTabDataInternal(com.pj.wallet.client.mvp.WalletGinjector ginjector) {
        return UserStatementPresenter.getTabLabel( ginjector);
    }
  }
  
  public UserStatementPresenterUserStatementProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.pj.wallet.client.mvp.WalletGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    WrappedProxy wrappedProxy = GWT.create(WrappedProxy.class);
    wrappedProxy.delayedBind( ginjector ); 
    proxy = wrappedProxy; 
    String nameToken = "!usertransaction"; 
    place = new com.gwtplatform.mvp.client.proxy.PlaceImpl( nameToken );
  }
  
  protected void getPlaceTitle(final GetPlaceTitleEvent event) {
    getPresenter( new NotifyingAsyncCallback<UserStatementPresenter>(getEventBus()){
        public void success(UserStatementPresenter p ) {
          String title = p.getTranslatedTitle( ginjector);
          event.getHandler().onSetPlaceTitle( title );
         }
        public void failure(Throwable t) { event.getHandler().onSetPlaceTitle(null); }
      } );
    }
  }
