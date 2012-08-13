package com.pj.wallet.client.validation.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TextBox_TextBoxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenBundle {
  private static TextBox_TextBoxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new TextBox_TextBoxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GG5ICJDFJ{width:" + ("100%")  + ";float:" + ("right")  + ";color:" + ("#f00")  + ";font-size:" + ("12px")  + ";}")) : ((".GG5ICJDFJ{width:" + ("100%")  + ";float:" + ("left")  + ";color:" + ("#f00")  + ";font-size:" + ("12px")  + ";}"));
      }
      public java.lang.String html(){
        return "GG5ICJDFJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.pj.wallet.client.validation.component.TextBox_TextBoxUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
