package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SubTabPanel_SubTabPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.ui.tab.SubTabPanel>, com.pj.wallet.client.ui.tab.SubTabPanel.SubTabPanelUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <div style='clear: both;'></div>")
    SafeHtml html1(String arg0);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html2(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.ui.tab.SubTabPanel owner) {

    com.pj.wallet.client.ui.tab.SubTabPanel_SubTabPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.ui.tab.SubTabPanel_SubTabPanelUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.ui.tab.SubTabPanel_SubTabPanelUiBinderImpl_GenBundle.class);
    com.pj.wallet.client.resources.WalletResources res = (com.pj.wallet.client.resources.WalletResources) GWT.create(com.pj.wallet.client.resources.WalletResources.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.FlowPanel tabPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId1).asString());
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.FlowPanel tabContentContainer = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html2(domId0, domId2).asString());

    f_HTMLPanel2.setStyleName("" + res.walletCss().submenuMain() + "");
    tabContentContainer.setStyleName("" + res.walletCss().subTabContainer() + "");
    f_HTMLPanel1.setStyleName("" + res.walletCss().headerMain() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord1.detach();
    f_HTMLPanel2.addAndReplaceElement(tabPanel, domId1Element);
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_HTMLPanel2, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(tabContentContainer, domId2Element);


    owner.tabContentContainer = tabContentContainer;
    owner.tabPanel = tabPanel;

    return f_HTMLPanel1;
  }
}
