package com.pj.wallet.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class WalletResources_default_StaticClientBundleGenerator implements com.pj.wallet.client.resources.WalletResources {
  private static WalletResources_default_StaticClientBundleGenerator _instance0 = new WalletResources_default_StaticClientBundleGenerator();
  private void homeIconInitializer() {
    homeIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "homeIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      0, 0, 24, 20, false, false
    );
  }
  private static class homeIconInitializer {
    static {
      _instance0.homeIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return homeIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource homeIcon() {
    return homeIconInitializer.get();
  }
  private void menuGradInitializer() {
    menuGrad = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "menuGrad",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_Horizontal),
      0, 0, 2, 49, false, false
    );
  }
  private static class menuGradInitializer {
    static {
      _instance0.menuGradInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return menuGrad;
    }
  }
  public com.google.gwt.resources.client.ImageResource menuGrad() {
    return menuGradInitializer.get();
  }
  private void walletCssInitializer() {
    walletCss = new com.pj.wallet.client.resources.WalletCssResource() {
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
        return "walletCss";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GG5ICJDEI{clear:" + ("both")  + ";}.GG5ICJDHI{width:" + ("100%")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.GG5ICJDKI{height:" + ((WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";margin:" + ("0"+ " " +"100px")  + ";position:" + ("relative")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:") + (("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";padding:" + ("0")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("5px"+ " " +"5px"+ " " +"0"+ " " +"0")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDMI{height:" + ((WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";position:" + ("relative") ) + (";margin:" + ("-3px"+ " " +"100px"+ " " +"0")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("0"+ " " +"0"+ " " +"5px"+ " " +"5px")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDJI{margin:" + ("2px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:") + (("0")  + ";}.GG5ICJDLI{width:" + ("950px")  + ";margin:" + ("10px"+ " " +"120px"+ " " +"10px"+ " " +"100px")  + ";float:" + ("right")  + ";}.GG5ICJDFI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";font-size:" + ("13px")  + ";padding:" + ("1px"+ " " +"2px")  + ";height:" + ("20px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#f00")  + " !important;}.GG5ICJDGI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";height:" + ("auto") ) + (";font-size:" + ("14px")  + ";color:" + ("#f00")  + ";padding:" + ("15px"+ " " +"0"+ " " +"10px"+ " " +"0")  + ";text-align:" + ("center")  + ";}.GG5ICJDII{width:" + ("250px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:" + ("0")  + ";float:" + ("right")  + ";padding-bottom:" + ("7px")  + ";}")) : ((".GG5ICJDEI{clear:" + ("both")  + ";}.GG5ICJDHI{width:" + ("100%")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.GG5ICJDKI{height:" + ((WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";margin:" + ("0"+ " " +"100px")  + ";position:" + ("relative")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:") + (("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";padding:" + ("0")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("5px"+ " " +"5px"+ " " +"0"+ " " +"0")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDMI{height:" + ((WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_default_StaticClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";position:" + ("relative") ) + (";margin:" + ("-3px"+ " " +"100px"+ " " +"0")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("0"+ " " +"0"+ " " +"5px"+ " " +"5px")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDJI{margin:" + ("2px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:") + (("0")  + ";}.GG5ICJDLI{width:" + ("950px")  + ";margin:" + ("10px"+ " " +"100px"+ " " +"10px"+ " " +"120px")  + ";float:" + ("left")  + ";}.GG5ICJDFI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";font-size:" + ("13px")  + ";padding:" + ("1px"+ " " +"2px")  + ";height:" + ("20px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#f00")  + " !important;}.GG5ICJDGI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";height:" + ("auto") ) + (";font-size:" + ("14px")  + ";color:" + ("#f00")  + ";padding:" + ("15px"+ " " +"0"+ " " +"10px"+ " " +"0")  + ";text-align:" + ("center")  + ";}.GG5ICJDII{width:" + ("250px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:" + ("0")  + ";float:" + ("left")  + ";padding-bottom:" + ("7px")  + ";}"));
      }
      public java.lang.String clear(){
        return "GG5ICJDEI";
      }
      public java.lang.String error(){
        return "GG5ICJDFI";
      }
      public java.lang.String errorMessage(){
        return "GG5ICJDGI";
      }
      public java.lang.String headerMain(){
        return "GG5ICJDHI";
      }
      public java.lang.String inputLong(){
        return "GG5ICJDII";
      }
      public java.lang.String mainBody(){
        return "GG5ICJDJI";
      }
      public java.lang.String menuMain(){
        return "GG5ICJDKI";
      }
      public java.lang.String subTabContainer(){
        return "GG5ICJDLI";
      }
      public java.lang.String submenuMain(){
        return "GG5ICJDMI";
      }
    }
    ;
  }
  private static class walletCssInitializer {
    static {
      _instance0.walletCssInitializer();
    }
    static com.pj.wallet.client.resources.WalletCssResource get() {
      return walletCss;
    }
  }
  public com.pj.wallet.client.resources.WalletCssResource walletCss() {
    return walletCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "2F6F7616219715533EA56B4F3FC1036A.cache.png";
  private static final java.lang.String bundledImage_Horizontal = GWT.getModuleBaseURL() + "AAE1181AE06F8185231EEC23115F3FD8.cache.png";
  private static com.google.gwt.resources.client.ImageResource homeIcon;
  private static com.google.gwt.resources.client.ImageResource menuGrad;
  private static com.pj.wallet.client.resources.WalletCssResource walletCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      homeIcon(), 
      menuGrad(), 
      walletCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("homeIcon", homeIcon());
        resourceMap.put("menuGrad", menuGrad());
        resourceMap.put("walletCss", walletCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'homeIcon': return this.@com.pj.wallet.client.resources.WalletResources::homeIcon()();
      case 'menuGrad': return this.@com.pj.wallet.client.resources.WalletResources::menuGrad()();
      case 'walletCss': return this.@com.pj.wallet.client.resources.WalletResources::walletCss()();
    }
    return null;
  }-*/;
}
