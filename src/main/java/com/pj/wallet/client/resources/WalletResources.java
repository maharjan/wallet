package com.pj.wallet.client.resources;


import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

public interface WalletResources extends ClientBundle{
	public static final WalletResources INSTANCE = GWT.create(WalletResources.class);

	@Source("wallet.css")
	WalletCssResource walletCss();
	
	@Source("images/nav_back.png")
	@ImageOptions(repeatStyle = RepeatStyle.Horizontal)
	ImageResource menuGrad();
	
	@Source("images/home.png")
	@ImageOptions(repeatStyle = RepeatStyle.None)
	ImageResource homeIcon();
}
