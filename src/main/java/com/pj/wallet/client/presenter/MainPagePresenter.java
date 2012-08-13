package com.pj.wallet.client.presenter;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;

public class MainPagePresenter extends AbstractMainPagePresenter<MainPagePresenter.MainPage, MainPagePresenter.MainProxy>{

	@Inject
	public MainPagePresenter(EventBus eventBus, MainPage view, MainPagePresenter.MainProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void refresh() {
		super.refresh();
	}

	@ProxyStandard
	public interface MainProxy extends Proxy<MainPagePresenter> {
	}
	
	public interface MainPage extends AbstractMainPagePresenter.MainView{
		
	}
}
