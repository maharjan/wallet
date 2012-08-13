package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MainTabPanel_MainTabPanelUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenBundle {
  private static MainTabPanel_MainTabPanelUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new MainTabPanel_MainTabPanelUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GG5ICJDPI{padding-top:" + ("5px")  + ";}.GG5ICJDBJ{color:" + ("white")  + ";font-weight:" + ("bold")  + ";text-decoration:" + ("none")  + ";margin-left:" + ("1px")  + ";}.GG5ICJDAJ{margin-top:" + ("0")  + ";margin-right:" + ("1px")  + ";float:" + ("right")  + ";}")) : ((".GG5ICJDPI{padding-top:" + ("5px")  + ";}.GG5ICJDBJ{color:" + ("white")  + ";font-weight:" + ("bold")  + ";text-decoration:" + ("none")  + ";margin-right:" + ("1px")  + ";}.GG5ICJDAJ{margin-top:" + ("0")  + ";margin-left:" + ("1px")  + ";float:" + ("left")  + ";}"));
      }
      public java.lang.String gap(){
        return "GG5ICJDPI";
      }
      public java.lang.String image(){
        return "GG5ICJDAJ";
      }
      public java.lang.String imgText(){
        return "GG5ICJDBJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.pj.wallet.client.ui.tab.MainTabPanel_MainTabPanelUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
