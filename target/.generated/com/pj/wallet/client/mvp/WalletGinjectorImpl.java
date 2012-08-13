package com.pj.wallet.client.mvp;

import com.google.gwt.core.client.GWT;

public class WalletGinjectorImpl implements com.pj.wallet.client.mvp.WalletGinjector {
  public com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter> getChangePassword() {
    return get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$ChangePasswordPresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.event.shared.EventBus getEventBus() {
    return get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter> getMainPagePresenter() {
    return get_Key$type$com$google$inject$Provider$com$pj$wallet$client$presenter$MainPagePresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter> getMyAccountPresnter() {
    return get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$MyAccountPresenter$$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter> getUserStatement() {
    return get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$UserStatementPresenter$$_annotation$$none$$();
  }
  
  public com.pj.wallet.client.i18n.WalletConstants walletConstants() {
    return get_Key$type$com$pj$wallet$client$i18n$WalletConstants$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.UserStatement declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.view.UserStatement create_Key$type$com$pj$wallet$client$view$UserStatement$_annotation$$none$$() {
    return get_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.UserStatement declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.view.UserStatement get_Key$type$com$pj$wallet$client$view$UserStatement$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$view$UserStatement$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.UserStatementPresenter$UserStatementProxy declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private void memberInject_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$(com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy injectee) {
    
  }
  
  private com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy create_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy.class);
    assert created instanceof com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy;
    com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy result = (com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy) created;
    
    memberInject_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy get_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.impl.AccountBaseView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private void memberInject_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$(com.pj.wallet.client.view.impl.AccountBaseView injectee) {
    
  }
  
  private com.pj.wallet.client.view.impl.AccountBaseView create_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.view.impl.AccountBaseView.class);
    assert created instanceof com.pj.wallet.client.view.impl.AccountBaseView;
    com.pj.wallet.client.view.impl.AccountBaseView result = (com.pj.wallet.client.view.impl.AccountBaseView) created;
    
    memberInject_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.view.impl.AccountBaseView singleton_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private com.pj.wallet.client.view.impl.AccountBaseView get_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MyAccountPresenter declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$(com.pj.wallet.client.presenter.MyAccountPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.pj.wallet.client.presenter.MyAccountPresenter com$pj$wallet$client$presenter$MyAccountPresenter_MyAccountPresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.pj.wallet.client.view.AccountBase _1, com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy _2) {
    return new com.pj.wallet.client.presenter.MyAccountPresenter(_0, _1, _2);
  }
  
  private com.pj.wallet.client.presenter.MyAccountPresenter create_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$() {
    com.pj.wallet.client.presenter.MyAccountPresenter result = com$pj$wallet$client$presenter$MyAccountPresenter_MyAccountPresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$view$AccountBase$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$());
    memberInject_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.MyAccountPresenter singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private com.pj.wallet.client.presenter.MyAccountPresenter get_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for java.lang.String declared at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:34)
   */
  private java.lang.String create_Key$type$java$lang$String$_annotation$$com$pj$wallet$client$mvp$DefaultPlace$() {
    return "!usertransaction";
  }
  
  
  /**
   * Binding for java.lang.String declared at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:34)
   */
  private java.lang.String get_Key$type$java$lang$String$_annotation$$com$pj$wallet$client$mvp$DefaultPlace$() {
    return create_Key$type$java$lang$String$_annotation$$com$pj$wallet$client$mvp$DefaultPlace$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.PlaceManager declared at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:32)
   */
  private com.gwtplatform.mvp.client.proxy.PlaceManager create_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    return get_Key$type$com$pj$wallet$client$mvp$WalletPlaceManager$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:32)
   */
  private com.gwtplatform.mvp.client.proxy.PlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.gwt.event.shared.SimpleEventBus, annotation=[none]]
   */
  private void memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(com.google.gwt.event.shared.SimpleEventBus injectee) {
    
  }
  
  private com.google.gwt.event.shared.SimpleEventBus create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.event.shared.SimpleEventBus.class);
    assert created instanceof com.google.gwt.event.shared.SimpleEventBus;
    com.google.gwt.event.shared.SimpleEventBus result = (com.google.gwt.event.shared.SimpleEventBus) created;
    
    memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.gwt.event.shared.SimpleEventBus, annotation=[none]]
   */
  private com.google.gwt.event.shared.SimpleEventBus get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.TokenFormatter declared at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:30)
   */
  private com.gwtplatform.mvp.client.proxy.TokenFormatter create_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    return get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.proxy.TokenFormatter singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:30)
   */
  private com.gwtplatform.mvp.client.proxy.TokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.EventBus declared at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:29)
   */
  private com.google.gwt.event.shared.EventBus create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    return get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  private com.google.gwt.event.shared.EventBus singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:29)
   */
  private com.google.gwt.event.shared.EventBus get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.ChangePasswordPresenter$ChangePasswordProxy declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private void memberInject_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$(com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy injectee) {
    
  }
  
  private com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy create_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy.class);
    assert created instanceof com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy;
    com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy result = (com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy) created;
    
    memberInject_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy get_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MyRootpresenter$MyRootView declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.presenter.MyRootpresenter$MyRootView, annotation=[none]]
   */
  private void memberInject_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$MyRootView$_annotation$$none$$(com.pj.wallet.client.presenter.MyRootpresenter.MyRootView injectee) {
    
  }
  
  private com.pj.wallet.client.presenter.MyRootpresenter.MyRootView create_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$MyRootView$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.presenter.MyRootpresenter.MyRootView.class);
    assert created instanceof com.pj.wallet.client.presenter.MyRootpresenter.MyRootView;
    com.pj.wallet.client.presenter.MyRootpresenter.MyRootView result = (com.pj.wallet.client.presenter.MyRootpresenter.MyRootView) created;
    
    memberInject_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$MyRootView$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MyRootpresenter$MyRootView declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.presenter.MyRootpresenter$MyRootView, annotation=[none]]
   */
  private com.pj.wallet.client.presenter.MyRootpresenter.MyRootView get_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$MyRootView$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$MyRootView$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.RootPresenter declared at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:31)
   */
  private com.gwtplatform.mvp.client.RootPresenter create_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$() {
    return get_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.RootPresenter singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:31)
   */
  private com.gwtplatform.mvp.client.RootPresenter get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.impl.UserStatementView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private void memberInject_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$(com.pj.wallet.client.view.impl.UserStatementView injectee) {
    
  }
  
  private com.pj.wallet.client.view.impl.UserStatementView create_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.view.impl.UserStatementView.class);
    assert created instanceof com.pj.wallet.client.view.impl.UserStatementView;
    com.pj.wallet.client.view.impl.UserStatementView result = (com.pj.wallet.client.view.impl.UserStatementView) created;
    
    memberInject_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.view.impl.UserStatementView singleton_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private com.pj.wallet.client.view.impl.UserStatementView get_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$view$impl$UserStatementView$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.ChangePassword declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.view.ChangePassword create_Key$type$com$pj$wallet$client$view$ChangePassword$_annotation$$none$$() {
    return get_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.ChangePassword declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.view.ChangePassword get_Key$type$com$pj$wallet$client$view$ChangePassword$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$view$ChangePassword$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.view.impl.ChangePasswordView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private void memberInject_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$(com.pj.wallet.client.view.impl.ChangePasswordView injectee) {
    
  }
  
  private com.pj.wallet.client.view.impl.ChangePasswordView create_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.view.impl.ChangePasswordView.class);
    assert created instanceof com.pj.wallet.client.view.impl.ChangePasswordView;
    com.pj.wallet.client.view.impl.ChangePasswordView result = (com.pj.wallet.client.view.impl.ChangePasswordView) created;
    
    memberInject_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.view.impl.ChangePasswordView singleton_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private com.pj.wallet.client.view.impl.ChangePasswordView get_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$view$impl$ChangePasswordView$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter> create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$MyAccountPresenter$$_annotation$$none$$() {
    return new com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<com.pj.wallet.client.presenter.MyAccountPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$_annotation$$none$$()); 
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.MyAccountPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$MyAccountPresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$MyAccountPresenter$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter> create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$ChangePasswordPresenter$$_annotation$$none$$() {
    return new com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<com.pj.wallet.client.presenter.ChangePasswordPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$()); 
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.ChangePasswordPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$ChangePasswordPresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$ChangePasswordPresenter$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_ParameterTokenFormatter_methodInjection() {
    return new com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter();
  }
  
  private com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter create_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$() {
    com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter result = com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_ParameterTokenFormatter_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter, annotation=[none]]
   */
  private com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MyRootpresenter declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.presenter.MyRootpresenter, annotation=[none]]
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$_annotation$$none$$(com.pj.wallet.client.presenter.MyRootpresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.pj.wallet.client.presenter.MyRootpresenter com$pj$wallet$client$presenter$MyRootpresenter_MyRootpresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.pj.wallet.client.presenter.MyRootpresenter.MyRootView _1) {
    return new com.pj.wallet.client.presenter.MyRootpresenter(_0, _1);
  }
  
  private com.pj.wallet.client.presenter.MyRootpresenter create_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$_annotation$$none$$() {
    com.pj.wallet.client.presenter.MyRootpresenter result = com$pj$wallet$client$presenter$MyRootpresenter_MyRootpresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$MyRootView$_annotation$$none$$());
    memberInject_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MyRootpresenter declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.presenter.MyRootpresenter, annotation=[none]]
   */
  private com.pj.wallet.client.presenter.MyRootpresenter get_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$presenter$MyRootpresenter$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MainPagePresenter$MainProxy declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private void memberInject_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$(com.pj.wallet.client.presenter.MainPagePresenter.MainProxy injectee) {
    
  }
  
  private com.pj.wallet.client.presenter.MainPagePresenter.MainProxy create_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.presenter.MainPagePresenter.MainProxy.class);
    assert created instanceof com.pj.wallet.client.presenter.MainPagePresenter.MainProxy;
    com.pj.wallet.client.presenter.MainPagePresenter.MainProxy result = (com.pj.wallet.client.presenter.MainPagePresenter.MainProxy) created;
    
    memberInject_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.MainPagePresenter.MainProxy singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private com.pj.wallet.client.presenter.MainPagePresenter.MainProxy get_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.UserStatementPresenter declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$(com.pj.wallet.client.presenter.UserStatementPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.pj.wallet.client.presenter.UserStatementPresenter com$pj$wallet$client$presenter$UserStatementPresenter_UserStatementPresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.pj.wallet.client.view.UserStatement _1, com.pj.wallet.client.presenter.UserStatementPresenter.UserStatementProxy _2) {
    return new com.pj.wallet.client.presenter.UserStatementPresenter(_0, _1, _2);
  }
  
  private com.pj.wallet.client.presenter.UserStatementPresenter create_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$() {
    com.pj.wallet.client.presenter.UserStatementPresenter result = com$pj$wallet$client$presenter$UserStatementPresenter_UserStatementPresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$view$UserStatement$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$());
    memberInject_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.UserStatementPresenter singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private com.pj.wallet.client.presenter.UserStatementPresenter get_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MainPagePresenter$MainPage declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.presenter.MainPagePresenter.MainPage create_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainPage$_annotation$$none$$() {
    return get_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MainPagePresenter$MainPage declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.presenter.MainPagePresenter.MainPage get_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainPage$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainPage$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.i18n.WalletConstants declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.i18n.WalletConstants, annotation=[none]]
   */
  private void memberInject_Key$type$com$pj$wallet$client$i18n$WalletConstants$_annotation$$none$$(com.pj.wallet.client.i18n.WalletConstants injectee) {
    
  }
  
  private com.pj.wallet.client.i18n.WalletConstants create_Key$type$com$pj$wallet$client$i18n$WalletConstants$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.i18n.WalletConstants.class);
    assert created instanceof com.pj.wallet.client.i18n.WalletConstants;
    com.pj.wallet.client.i18n.WalletConstants result = (com.pj.wallet.client.i18n.WalletConstants) created;
    
    memberInject_Key$type$com$pj$wallet$client$i18n$WalletConstants$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.i18n.WalletConstants declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.i18n.WalletConstants, annotation=[none]]
   */
  private com.pj.wallet.client.i18n.WalletConstants get_Key$type$com$pj$wallet$client$i18n$WalletConstants$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$i18n$WalletConstants$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter> declared at:
   *   Implicit binding for Key[type=com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter>, annotation=[none]]
   */
  private com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter> create_Key$type$com$google$inject$Provider$com$pj$wallet$client$presenter$MainPagePresenter$$_annotation$$none$$() {
    return new com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter>() { 
      public com.pj.wallet.client.presenter.MainPagePresenter get() { 
        return get_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$();
      }
    };
  }
  
  
  /**
   * Binding for com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter> declared at:
   *   Implicit binding for Key[type=com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter>, annotation=[none]]
   */
  private com.google.inject.Provider<com.pj.wallet.client.presenter.MainPagePresenter> get_Key$type$com$google$inject$Provider$com$pj$wallet$client$presenter$MainPagePresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$inject$Provider$com$pj$wallet$client$presenter$MainPagePresenter$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.AutobindDisable declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.AutobindDisable, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(com.gwtplatform.mvp.client.AutobindDisable injectee) {
    
  }
  
  private native com.gwtplatform.mvp.client.AutobindDisable com$gwtplatform$mvp$client$AutobindDisable_AutobindDisable_methodInjection() /*-{
    return @com.gwtplatform.mvp.client.AutobindDisable::new()();
  }-*/;
  
  private com.gwtplatform.mvp.client.AutobindDisable create_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$() {
    com.gwtplatform.mvp.client.AutobindDisable result = com$gwtplatform$mvp$client$AutobindDisable_AutobindDisable_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(result);
    return result;
  }
  
  private com.gwtplatform.mvp.client.AutobindDisable singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.AutobindDisable, annotation=[none]]
   */
  private com.gwtplatform.mvp.client.AutobindDisable get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.AccountBase declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.view.AccountBase create_Key$type$com$pj$wallet$client$view$AccountBase$_annotation$$none$$() {
    return get_Key$type$com$pj$wallet$client$view$impl$AccountBaseView$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.AccountBase declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.pj.wallet.client.view.AccountBase get_Key$type$com$pj$wallet$client$view$AccountBase$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$view$AccountBase$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MyAccountPresenter$AccountProxy declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private void memberInject_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$(com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy injectee) {
    
  }
  
  private com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy create_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy.class);
    assert created instanceof com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy;
    com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy result = (com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy) created;
    
    memberInject_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private com.pj.wallet.client.presenter.MyAccountPresenter.AccountProxy get_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.view.impl.MainPageView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private void memberInject_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$(com.pj.wallet.client.view.impl.MainPageView injectee) {
    
  }
  
  private com.pj.wallet.client.view.impl.MainPageView create_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$() {
    Object created = GWT.create(com.pj.wallet.client.view.impl.MainPageView.class);
    assert created instanceof com.pj.wallet.client.view.impl.MainPageView;
    com.pj.wallet.client.view.impl.MainPageView result = (com.pj.wallet.client.view.impl.MainPageView) created;
    
    memberInject_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.view.impl.MainPageView singleton_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private com.pj.wallet.client.view.impl.MainPageView get_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$view$impl$MainPageView$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.MainPagePresenter declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private native void com$pj$wallet$client$presenter$AbstractMainPagePresenter_placeManager_fieldInjection(com.pj.wallet.client.presenter.AbstractMainPagePresenter injectee, com.gwtplatform.mvp.client.proxy.PlaceManager value) /*-{
    injectee.@com.pj.wallet.client.presenter.AbstractMainPagePresenter::placeManager = value;
  }-*/;
  
  private void memberInject_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$(com.pj.wallet.client.presenter.MainPagePresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    com$pj$wallet$client$presenter$AbstractMainPagePresenter_placeManager_fieldInjection(injectee, get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    
  }
  
  private com.pj.wallet.client.presenter.MainPagePresenter com$pj$wallet$client$presenter$MainPagePresenter_MainPagePresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.pj.wallet.client.presenter.MainPagePresenter.MainPage _1, com.pj.wallet.client.presenter.MainPagePresenter.MainProxy _2) {
    return new com.pj.wallet.client.presenter.MainPagePresenter(_0, _1, _2);
  }
  
  private com.pj.wallet.client.presenter.MainPagePresenter create_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$() {
    com.pj.wallet.client.presenter.MainPagePresenter result = com$pj$wallet$client$presenter$MainPagePresenter_MainPagePresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainPage$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$());
    memberInject_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.MainPagePresenter singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private com.pj.wallet.client.presenter.MainPagePresenter get_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter> create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$UserStatementPresenter$$_annotation$$none$$() {
    return new com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<com.pj.wallet.client.presenter.UserStatementPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$_annotation$$none$$()); 
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.pj.wallet.client.presenter.UserStatementPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$UserStatementPresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$pj$wallet$client$presenter$UserStatementPresenter$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.mvp.WalletPlaceManager declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.mvp.WalletPlaceManager, annotation=[none]]
   */
  private void memberInject_Key$type$com$pj$wallet$client$mvp$WalletPlaceManager$_annotation$$none$$(com.pj.wallet.client.mvp.WalletPlaceManager injectee) {
    
  }
  
  private com.pj.wallet.client.mvp.WalletPlaceManager com$pj$wallet$client$mvp$WalletPlaceManager_WalletPlaceManager_methodInjection(com.google.gwt.event.shared.EventBus _0, com.gwtplatform.mvp.client.proxy.TokenFormatter _1, java.lang.String _2) {
    return new com.pj.wallet.client.mvp.WalletPlaceManager(_0, _1, _2);
  }
  
  private com.pj.wallet.client.mvp.WalletPlaceManager create_Key$type$com$pj$wallet$client$mvp$WalletPlaceManager$_annotation$$none$$() {
    com.pj.wallet.client.mvp.WalletPlaceManager result = com$pj$wallet$client$mvp$WalletPlaceManager_WalletPlaceManager_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$(), get_Key$type$java$lang$String$_annotation$$com$pj$wallet$client$mvp$DefaultPlace$());
    memberInject_Key$type$com$pj$wallet$client$mvp$WalletPlaceManager$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.pj.wallet.client.mvp.WalletPlaceManager declared at:
   *   Implicit binding for Key[type=com.pj.wallet.client.mvp.WalletPlaceManager, annotation=[none]]
   */
  private com.pj.wallet.client.mvp.WalletPlaceManager get_Key$type$com$pj$wallet$client$mvp$WalletPlaceManager$_annotation$$none$$() {
    return create_Key$type$com$pj$wallet$client$mvp$WalletPlaceManager$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.pj.wallet.client.presenter.ChangePasswordPresenter declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection____(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$(com.pj.wallet.client.presenter.ChangePasswordPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection____(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.pj.wallet.client.presenter.ChangePasswordPresenter com$pj$wallet$client$presenter$ChangePasswordPresenter_ChangePasswordPresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.pj.wallet.client.view.ChangePassword _1, com.pj.wallet.client.presenter.ChangePasswordPresenter.ChangePasswordProxy _2) {
    return new com.pj.wallet.client.presenter.ChangePasswordPresenter(_0, _1, _2);
  }
  
  private com.pj.wallet.client.presenter.ChangePasswordPresenter create_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$() {
    com.pj.wallet.client.presenter.ChangePasswordPresenter result = com$pj$wallet$client$presenter$ChangePasswordPresenter_ChangePasswordPresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$view$ChangePassword$_annotation$$none$$(), get_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$());
    memberInject_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.pj.wallet.client.presenter.ChangePasswordPresenter singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private com.pj.wallet.client.presenter.ChangePasswordPresenter get_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$ = create_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$_annotation$$none$$;
  }
  
  public WalletGinjectorImpl() {
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
    get_Key$type$com$pj$wallet$client$presenter$UserStatementPresenter$UserStatementProxy$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
    get_Key$type$com$pj$wallet$client$presenter$ChangePasswordPresenter$ChangePasswordProxy$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.pj.wallet.client.mvp.WalletMainModule.configure(WalletMainModule.java:31)
    get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
    get_Key$type$com$pj$wallet$client$presenter$MainPagePresenter$MainProxy$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
    get_Key$type$com$pj$wallet$client$presenter$MyAccountPresenter$AccountProxy$_annotation$$none$$();
    
  }
  
}
