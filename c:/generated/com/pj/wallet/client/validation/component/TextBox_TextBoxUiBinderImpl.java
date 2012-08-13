package com.pj.wallet.client.validation.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TextBox_TextBoxUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.validation.component.TextBox>, com.pj.wallet.client.validation.component.TextBox.TextBoxUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.validation.component.TextBox owner) {

    com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenBundle.class);
    com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.pj.wallet.client.resources.WalletResources res = (com.pj.wallet.client.resources.WalletResources) GWT.create(com.pj.wallet.client.resources.WalletResources.class);
    com.google.gwt.user.client.ui.Label label = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.pj.wallet.client.validation.ValidatingTextBox input = (com.pj.wallet.client.validation.ValidatingTextBox) GWT.create(com.pj.wallet.client.validation.ValidatingTextBox.class);
    com.google.gwt.user.client.ui.HTML error = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
    com.google.gwt.user.client.ui.FlowPanel panel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);

    panel.add(label);
    panel.add(input);
    error.setStyleName("" + style.html() + "");
    panel.add(error);
    panel.setStyleName("" + res.walletCss().inputLong() + "");



    owner.error = error;
    owner.input = input;
    owner.label = label;
    owner.panel = panel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return panel;
  }
}
