package com.pj.wallet.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class WalletResources_en_InlineClientBundleGenerator implements com.pj.wallet.client.resources.WalletResources {
  private static WalletResources_en_InlineClientBundleGenerator _instance0 = new WalletResources_en_InlineClientBundleGenerator();
  private void homeIconInitializer() {
    homeIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "homeIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
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
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GG5ICJDEI{clear:" + ("both")  + ";}.GG5ICJDHI{width:" + ("100%")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.GG5ICJDKI{height:" + ((WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";margin:" + ("0"+ " " +"100px")  + ";position:" + ("relative")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:") + (("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";padding:" + ("0")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("5px"+ " " +"5px"+ " " +"0"+ " " +"0")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDMI{height:" + ((WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";position:" + ("relative") ) + (";margin:" + ("-3px"+ " " +"100px"+ " " +"0")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("0"+ " " +"0"+ " " +"5px"+ " " +"5px")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDJI{margin:" + ("2px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:") + (("0")  + ";}.GG5ICJDLI{width:" + ("950px")  + ";margin:" + ("10px"+ " " +"120px"+ " " +"10px"+ " " +"100px")  + ";float:" + ("right")  + ";}.GG5ICJDFI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";font-size:" + ("13px")  + ";padding:" + ("1px"+ " " +"2px")  + ";height:" + ("20px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#f00")  + " !important;}.GG5ICJDGI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";height:" + ("auto") ) + (";font-size:" + ("14px")  + ";color:" + ("#f00")  + ";padding:" + ("15px"+ " " +"0"+ " " +"10px"+ " " +"0")  + ";text-align:" + ("center")  + ";}.GG5ICJDII{width:" + ("250px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:" + ("0")  + ";float:" + ("right")  + ";padding-bottom:" + ("7px")  + ";}")) : ((".GG5ICJDEI{clear:" + ("both")  + ";}.GG5ICJDHI{width:" + ("100%")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.GG5ICJDKI{height:" + ((WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";margin:" + ("0"+ " " +"100px")  + ";position:" + ("relative")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:") + (("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";padding:" + ("0")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("5px"+ " " +"5px"+ " " +"0"+ " " +"0")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDMI{height:" + ((WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getSafeUri().asString() + "\") -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getLeft() + "px -" + (WalletResources_en_InlineClientBundleGenerator.this.menuGrad()).getTop() + "px  repeat-x")  + ";position:" + ("relative") ) + (";margin:" + ("-3px"+ " " +"100px"+ " " +"0")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";font-family:" + ("\"proximaNova\""+ ","+ " " +"Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"Lucida"+ " " +"Grande")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#aaa")  + ";list-style:" + ("none")  + ";-webkit-border-radius:" + ("5px")  + ";border-radius:" + ("0"+ " " +"0"+ " " +"5px"+ " " +"5px")  + ";-webkit-box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0"+ " " +"#555")  + ";}.GG5ICJDJI{margin:" + ("2px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:") + (("0")  + ";}.GG5ICJDLI{width:" + ("950px")  + ";margin:" + ("10px"+ " " +"100px"+ " " +"10px"+ " " +"120px")  + ";float:" + ("left")  + ";}.GG5ICJDFI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";font-size:" + ("13px")  + ";padding:" + ("1px"+ " " +"2px")  + ";height:" + ("20px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#f00")  + " !important;}.GG5ICJDGI{font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";height:" + ("auto") ) + (";font-size:" + ("14px")  + ";color:" + ("#f00")  + ";padding:" + ("15px"+ " " +"0"+ " " +"10px"+ " " +"0")  + ";text-align:" + ("center")  + ";}.GG5ICJDII{width:" + ("250px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";padding:" + ("0")  + ";float:" + ("left")  + ";padding-bottom:" + ("7px")  + ";}"));
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAUCAQAAAA9vDUIAAAAAXNSR0IArs4c6QAAAAJiS0dEAP+Hj8y/AAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH3AcfCyYqB0JIPgAAAbxJREFUKM+Fkr1rUwEUxX/n5rXa1sFYnayrg5ODUpWCdhKLi4JOLrr4DyhExMUP0M1RJ0EEwa9JhECnImq11FIqSMC2thR0KokWUtu84/ASTZPQ3uUOh3Puufce2FAC8ugEU3zgCFuVsnaXH7oSV/lKoQPaQhmgyLwOA2hIJR7Rz1PeMMZutbKFBljkPX1AN10QeY0zwXRMxLdMBCJrpke+yLyecZQVzjPLDKfSZQ/qbchByK3enqiiY30CnqvElD7rIw8gSWI45uK7DtR9CJOL2k/mdMZLsTN9J1NFCIu0rNNeiX28cC9DLkMYztXKGk2GvaTBdJxUVUKSJUt5FzmYLvqkvjDJWchxk4IKvp6ucUN3tKo/CtmSQMbq1QjbGYuXruqakhzHdd+v1KXHjMQvrUtGqu8liZpyPsR+j/IpZtnTOO4l7sWCQ27/jy28y5cpNp1VUsWSrfrhggCMQQJqDZ3kn4qUYSaosGxpr3OyEUZgNxP+zyeYSS8AeJteu1/amKJoi1MPD+vvXPVv4RY4OkR2PRsF7MDaktDswO1gbBb2TiINwjTdm5AELDQRBJPczrx3rDVuUcq0/wLH/Zu1rAZ04gAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAxCAYAAADwWHgnAAAAmElEQVR42l2O2QnAMAxDs/94gcyR+w64SAGX9qPmWZbUmDmnnHPEANZaF/beF/ARxhhiMHrvYmqt94QEU1CYwl1PUN9CnFprP2AzjGzWX3w8qhAgs/nzHo3rm0spPw+VnPNbSAWQUrrNBHhijGKw0YMBlT18GDYFmrER4Akh3Lj2ECCzB5v3/sYJ8PAED+PqwWDcWivOOXkAZm56uJsF8BUAAAAASUVORK5CYII=";
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
