package com.pj.wallet.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SubTabContainer_SubTabContainerUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.view.impl.SubTabContainer>, com.pj.wallet.client.view.impl.SubTabContainer.SubTabContainerUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.view.impl.SubTabContainer owner) {

    com.pj.wallet.client.view.impl.SubTabContainer_SubTabContainerUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.view.impl.SubTabContainer_SubTabContainerUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.view.impl.SubTabContainer_SubTabContainerUiBinderImpl_GenBundle.class);
    com.pj.wallet.client.view.impl.SubTabContainer_SubTabContainerUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.pj.wallet.client.resources.WalletResources res = (com.pj.wallet.client.resources.WalletResources) GWT.create(com.pj.wallet.client.resources.WalletResources.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.pj.wallet.client.ui.tab.SubTabPanel tabPanel = (com.pj.wallet.client.ui.tab.SubTabPanel) GWT.create(com.pj.wallet.client.ui.tab.SubTabPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());


    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(tabPanel, domId0Element);


    owner.tabPanel = tabPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
