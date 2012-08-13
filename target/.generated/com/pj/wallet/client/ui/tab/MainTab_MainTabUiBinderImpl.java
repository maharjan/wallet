package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainTab_MainTabUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.ui.tab.MainTab>, com.pj.wallet.client.ui.tab.MainTab.MainTabUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.ui.tab.MainTab owner) {

    com.pj.wallet.client.ui.tab.MainTab_MainTabUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.ui.tab.MainTab_MainTabUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.ui.tab.MainTab_MainTabUiBinderImpl_GenBundle.class);
    com.pj.wallet.client.ui.tab.MainTab_MainTabUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Hyperlink hyperlink = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);

    hyperlink.addStyleName("" + style.tab() + "");
    hyperlink.addStyleName("" + style.inactive() + "");



    owner.hyperlink = hyperlink;
    owner.style = style;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return hyperlink;
  }
}
