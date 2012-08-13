package com.pj.wallet.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class UserStatementView_UserStatementViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.view.impl.UserStatementView>, com.pj.wallet.client.view.impl.UserStatementView.UserStatementViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.view.impl.UserStatementView owner) {

    com.pj.wallet.client.view.impl.UserStatementView_UserStatementViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.view.impl.UserStatementView_UserStatementViewUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.view.impl.UserStatementView_UserStatementViewUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTML f_HTML2 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());

    f_HTML2.setText("GWT CONTENT IS HERE");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_HTML2, domId0Element);



    return f_HTMLPanel1;
  }
}
