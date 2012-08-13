package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SubTab_SubTabUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.ui.tab.SubTab>, com.pj.wallet.client.ui.tab.SubTab.SubTabUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.ui.tab.SubTab owner) {

    com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenBundle.class);
    com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Hyperlink hyperlink = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);

    hyperlink.addStyleName("" + style.tab() + "");
    hyperlink.addStyleName("" + style.inactive() + "");



    owner.hyperlink = hyperlink;
    owner.style = style;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return hyperlink;
  }
}
