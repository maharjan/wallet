package com.pj.wallet.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ChangePasswordView_ChangePasswordViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.pj.wallet.client.view.impl.ChangePasswordView>, com.pj.wallet.client.view.impl.ChangePasswordView.ChangePasswordViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<label>Change Password</label> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.pj.wallet.client.view.impl.ChangePasswordView owner) {

    com.pj.wallet.client.view.impl.ChangePasswordView_ChangePasswordViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.pj.wallet.client.view.impl.ChangePasswordView_ChangePasswordViewUiBinderImpl_GenBundle) GWT.create(com.pj.wallet.client.view.impl.ChangePasswordView_ChangePasswordViewUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.pj.wallet.client.validation.component.TextBox oldPassword = (com.pj.wallet.client.validation.component.TextBox) GWT.create(com.pj.wallet.client.validation.component.TextBox.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.pj.wallet.client.validation.component.TextBox newPassword = (com.pj.wallet.client.validation.component.TextBox) GWT.create(com.pj.wallet.client.validation.component.TextBox.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.pj.wallet.client.validation.component.TextBox confirmNewPassword = (com.pj.wallet.client.validation.component.TextBox) GWT.create(com.pj.wallet.client.validation.component.TextBox.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button submitButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1, domId2, domId3).asString());

    oldPassword.setRequired(true);
    oldPassword.setValidate(true);
    newPassword.setRequired(true);
    newPassword.setValidate(true);
    confirmNewPassword.setRequired(true);
    confirmNewPassword.setValidate(true);
    submitButton.setText("Submit");
    submitButton.setTitle("Submit");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(oldPassword, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(newPassword, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(confirmNewPassword, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(submitButton, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSubmitButtonClicked(event);
      }
    };
    submitButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.confirmNewPassword = confirmNewPassword;
    owner.newPassword = newPassword;
    owner.oldPassword = oldPassword;
    owner.submitButton = submitButton;

    return f_HTMLPanel1;
  }
}
