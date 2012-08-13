package com.pj.wallet.client.ui.tab;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SubTab_SubTabUiBinderImpl_GenBundle_en_StaticClientBundleGenerator implements com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenBundle {
  private static SubTab_SubTabUiBinderImpl_GenBundle_en_StaticClientBundleGenerator _instance0 = new SubTab_SubTabUiBinderImpl_GenBundle_en_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GG5ICJDEJ{float:" + ("right")  + ";padding:" + ("17px"+ " " +"0")  + ";font-weight:" + ("11px")  + ";}.GG5ICJDCJ{font-weight:" + ("normal")  + ";}.GG5ICJDEJ a,.GG5ICJDEJ a:visited,.GG5ICJDEJ a:hover{text-decoration:" + ("none")  + ";}.GG5ICJDCJ a{margin:" + ("10px")  + ";padding:" + ("10px")  + ";color:" + ("#000")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:") + (("5px")  + ";-webkit-box-shadow:" + ("inset"+ " " +"1px"+ " " +"1px"+ " " +"2px"+ " " +"1px"+ " " +"#999")  + ";box-shadow:" + ("inset"+ " " +"1px"+ " " +"1px"+ " " +"2px"+ " " +"1px"+ " " +"#999")  + ";}.GG5ICJDDJ a{margin:" + ("10px")  + ";padding:" + ("10px")  + ";font-weight:" + ("normal")  + ";color:" + ("#000")  + ";}.GG5ICJDDJ a:hover{margin:" + ("10px")  + ";padding:" + ("10px")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("5px") ) + (";-webkit-box-shadow:" + ("1px"+ " " +"1px"+ " " +"2px"+ " " +"1px"+ " " +"#333")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"2px"+ " " +"0"+ " " +"#333")  + ";}")) : ((".GG5ICJDEJ{float:" + ("left")  + ";padding:" + ("17px"+ " " +"0")  + ";font-weight:" + ("11px")  + ";}.GG5ICJDCJ{font-weight:" + ("normal")  + ";}.GG5ICJDEJ a,.GG5ICJDEJ a:visited,.GG5ICJDEJ a:hover{text-decoration:" + ("none")  + ";}.GG5ICJDCJ a{margin:" + ("10px")  + ";padding:" + ("10px")  + ";color:" + ("#000")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:") + (("5px")  + ";-webkit-box-shadow:" + ("inset"+ " " +"1px"+ " " +"1px"+ " " +"2px"+ " " +"1px"+ " " +"#999")  + ";box-shadow:" + ("inset"+ " " +"1px"+ " " +"1px"+ " " +"2px"+ " " +"1px"+ " " +"#999")  + ";}.GG5ICJDDJ a{margin:" + ("10px")  + ";padding:" + ("10px")  + ";font-weight:" + ("normal")  + ";color:" + ("#000")  + ";}.GG5ICJDDJ a:hover{margin:" + ("10px")  + ";padding:" + ("10px")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("5px") ) + (";-webkit-box-shadow:" + ("1px"+ " " +"1px"+ " " +"2px"+ " " +"1px"+ " " +"#333")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"2px"+ " " +"0"+ " " +"#333")  + ";}"));
      }
      public java.lang.String active(){
        return "GG5ICJDCJ";
      }
      public java.lang.String inactive(){
        return "GG5ICJDDJ";
      }
      public java.lang.String tab(){
        return "GG5ICJDEJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.pj.wallet.client.ui.tab.SubTab_SubTabUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
