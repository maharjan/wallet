package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainTabPanel_MainTabPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.ui.tab.MainTabPanel>, com.pj.wallet.client.ui.tab.MainTabPanel.MainTabPanelUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <div style='clear: both;'></div>")
    SafeHtml html1(String arg0);
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
    @Template("<span id='{0}'></span>")
    SafeHtml html3(String arg0);
     
    @Template("<span id='{0}'></span>")
    SafeHtml html4(String arg0);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html5(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.ui.tab.MainTabPanel owner) {

    com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenBundle.class);
    com.pj.wallet.client.resources.WalletResources res = (com.pj.wallet.client.resources.WalletResources) GWT.create(com.pj.wallet.client.resources.WalletResources.class);
    com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.FlowPanel tabPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel4 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId3).asString());
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel3 = new com.google.gwt.user.client.ui.HTMLPanel(template.html2(domId2).asString());
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template.html3(domId1).asString());
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.FlowPanel tabContentContainer = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel mainContainer = new com.google.gwt.user.client.ui.HTMLPanel(template.html4(domId5).asString());
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html5(domId0, domId4).asString());

    f_HTMLPanel4.setStyleName("" + res.walletCss().menuMain() + "");
    f_HTMLPanel3.setStyleName("" + res.walletCss().headerMain() + "");
    f_HTMLPanel2.setStyleName("" + style.gap() + "");
    mainContainer.setStyleName("" + res.walletCss().mainBody() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    UiBinderUtil.TempAttachment attachRecord2 = UiBinderUtil.attachToDom(f_HTMLPanel3.getElement());
    UiBinderUtil.TempAttachment attachRecord3 = UiBinderUtil.attachToDom(f_HTMLPanel4.getElement());
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord3.detach();
    f_HTMLPanel4.addAndReplaceElement(tabPanel, domId3Element);
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord2.detach();
    f_HTMLPanel3.addAndReplaceElement(f_HTMLPanel4, domId2Element);
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord1.detach();
    f_HTMLPanel2.addAndReplaceElement(f_HTMLPanel3, domId1Element);
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    UiBinderUtil.TempAttachment attachRecord4 = UiBinderUtil.attachToDom(mainContainer.getElement());
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    attachRecord4.detach();
    mainContainer.addAndReplaceElement(tabContentContainer, domId5Element);
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_HTMLPanel2, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(mainContainer, domId4Element);


    owner.mainContainer = mainContainer;
    owner.tabContentContainer = tabContentContainer;
    owner.tabPanel = tabPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
