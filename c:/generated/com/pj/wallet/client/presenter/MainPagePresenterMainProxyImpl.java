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

public class MainPagePresenterMainProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyImpl<MainPagePresenter> implements com.pj.wallet.client.presenter.MainPagePresenter.MainProxy, com.gwtplatform.mvp.client.DelayedBind, com.gwtplatform.mvp.client.proxy.LockInteractionHandler {
  
  private com.pj.wallet.client.mvp.WalletGinjector ginjector;
  
  public MainPagePresenterMainProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.pj.wallet.client.mvp.WalletGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    presenter = new StandardProvider<MainPagePresenter>( ginjector.getMainPagePresenter() );
    
    RevealContentHandler<MainPagePresenter> revealContentHandler = new RevealContentHandler<MainPagePresenter>( eventBus, this );
    getEventBus().addHandler( MainPagePresenter.TYPE_SetMainContent, revealContentHandler );
    getEventBus().addHandler( com.gwtplatform.mvp.client.proxy.LockInteractionEvent.getType(), this );
  }
  
  @Override
  public final void onLockInteraction( final com.gwtplatform.mvp.client.proxy.LockInteractionEvent event ) {
    getPresenter( new NotifyingAsyncCallback<MainPagePresenter>(getEventBus()) {
      @Override
      public void success(final MainPagePresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onLockInteraction( event );
          }
        } );
      }
    } );
  }
}
