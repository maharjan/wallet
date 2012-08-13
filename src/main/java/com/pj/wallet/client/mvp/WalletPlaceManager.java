package com.pj.wallet.client.mvp;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;

public class WalletPlaceManager extends PlaceManagerImpl{
	private final PlaceRequest defaultPlaceRequest;
	
	@Inject
	public WalletPlaceManager(EventBus eventBus, TokenFormatter tokenFormatter, @DefaultPlace String nameToken) {
		super(eventBus, tokenFormatter);
		this.defaultPlaceRequest = new PlaceRequest(nameToken);
	}

	@Override
	public void revealDefaultPlace() {
		revealPlace(this.defaultPlaceRequest);
	}

}
