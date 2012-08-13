package com.pj.wallet.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainPageView_MainPageViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.view.impl.MainPageView>, com.pj.wallet.client.view.impl.MainPageView.MainPageViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.view.impl.MainPageView owner) {

    com.pj.wallet.client.view.impl.MainPageView_MainPageViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.view.impl.MainPageView_MainPageViewUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.view.impl.MainPageView_MainPageViewUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.pj.wallet.client.ui.tab.MainTabPanel tabPanel = (com.pj.wallet.client.ui.tab.MainTabPanel) GWT.create(com.pj.wallet.client.ui.tab.MainTabPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());


    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(tabPanel, domId0Element);


    owner.tabPanel = tabPanel;

    return f_HTMLPanel1;
  }
}
