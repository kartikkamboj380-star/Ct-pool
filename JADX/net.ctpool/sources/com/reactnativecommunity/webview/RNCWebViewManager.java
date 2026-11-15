package com.reactnativecommunity.webview;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public class RNCWebViewManager extends ViewGroupManager<o> {
    private final j mRNCWebViewManagerImpl = new j();

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return this.mRNCWebViewManagerImpl.g();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = S1.f.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", S1.f.d("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", S1.f.d("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", S1.f.d("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", S1.f.d("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", S1.f.d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", S1.f.d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(com.facebook.react.views.scroll.h.h(com.facebook.react.views.scroll.h.f12991p), S1.f.d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", S1.f.d("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", S1.f.d("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", S1.f.d("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", S1.f.d("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @InterfaceC2218a(name = "allowFileAccess")
    public void setAllowFileAccess(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.m(oVar, z6);
    }

    @InterfaceC2218a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.n(oVar, z6);
    }

    @InterfaceC2218a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.o(oVar, z6);
    }

    @InterfaceC2218a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.p(oVar, z6);
    }

    @InterfaceC2218a(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.q(oVar, z6);
    }

    @InterfaceC2218a(name = "androidLayerType")
    public void setAndroidLayerType(o oVar, String str) {
        this.mRNCWebViewManagerImpl.r(oVar, str);
    }

    @InterfaceC2218a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.s(oVar, str);
    }

    @InterfaceC2218a(name = "basicAuthCredential")
    public void setBasicAuthCredential(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.t(oVar, readableMap);
    }

    @InterfaceC2218a(name = "cacheEnabled")
    public void setCacheEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.u(oVar, z6);
    }

    @InterfaceC2218a(name = "cacheMode")
    public void setCacheMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.v(oVar, str);
    }

    @InterfaceC2218a(name = "domStorageEnabled")
    public void setDomStorageEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.w(oVar, z6);
    }

    @InterfaceC2218a(name = "downloadingMessage")
    public void setDownloadingMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.x(str);
    }

    @InterfaceC2218a(name = "forceDarkOn")
    public void setForceDarkOn(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.y(oVar, z6);
    }

    @InterfaceC2218a(name = "geolocationEnabled")
    public void setGeolocationEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.z(oVar, z6);
    }

    @InterfaceC2218a(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.A(oVar, z6);
    }

    @InterfaceC2218a(name = "hasOnScroll")
    public void setHasOnScroll(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.B(oVar, z6);
    }

    @InterfaceC2218a(name = "incognito")
    public void setIncognito(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.C(oVar, z6);
    }

    @InterfaceC2218a(name = "injectedJavaScript")
    public void setInjectedJavaScript(o oVar, String str) {
        this.mRNCWebViewManagerImpl.D(oVar, str);
    }

    @InterfaceC2218a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(o oVar, String str) {
        this.mRNCWebViewManagerImpl.E(oVar, str);
    }

    @InterfaceC2218a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.F(oVar, z6);
    }

    @InterfaceC2218a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.G(oVar, z6);
    }

    @InterfaceC2218a(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(o oVar, String str) {
        this.mRNCWebViewManagerImpl.H(oVar, str);
    }

    @InterfaceC2218a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.I(oVar, z6);
    }

    @InterfaceC2218a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.J(oVar, z6);
    }

    @InterfaceC2218a(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.K(str);
    }

    @InterfaceC2218a(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.L(oVar, z6);
    }

    @InterfaceC2218a(name = "menuItems")
    public void setMenuCustomItems(o oVar, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.M(oVar, readableArray);
    }

    @InterfaceC2218a(name = "messagingEnabled")
    public void setMessagingEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.N(oVar, z6);
    }

    @InterfaceC2218a(name = "messagingModuleName")
    public void setMessagingModuleName(o oVar, String str) {
        this.mRNCWebViewManagerImpl.O(oVar, str);
    }

    @InterfaceC2218a(name = "minimumFontSize")
    public void setMinimumFontSize(o oVar, int i7) {
        this.mRNCWebViewManagerImpl.P(oVar, i7);
    }

    @InterfaceC2218a(name = "mixedContentMode")
    public void setMixedContentMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.Q(oVar, str);
    }

    @InterfaceC2218a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.R(oVar, z6);
    }

    @InterfaceC2218a(name = "overScrollMode")
    public void setOverScrollMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.S(oVar, str);
    }

    @InterfaceC2218a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.T(oVar, z6);
    }

    @InterfaceC2218a(name = "scalesPageToFit")
    public void setScalesPageToFit(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.U(oVar, z6);
    }

    @InterfaceC2218a(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.V(oVar, z6);
    }

    @InterfaceC2218a(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.W(oVar, z6);
    }

    @InterfaceC2218a(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.X(oVar, z6);
    }

    @InterfaceC2218a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.Y(oVar, z6);
    }

    @InterfaceC2218a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.Z(oVar, z6);
    }

    @InterfaceC2218a(name = "source")
    public void setSource(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.a0(oVar, readableMap, false);
    }

    @InterfaceC2218a(name = "textZoom")
    public void setTextZoom(o oVar, int i7) {
        this.mRNCWebViewManagerImpl.b0(oVar, i7);
    }

    @InterfaceC2218a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.c0(oVar, z6);
    }

    @InterfaceC2218a(name = "userAgent")
    public void setUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.d0(oVar, str);
    }

    @InterfaceC2218a(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(o oVar, boolean z6) {
        this.mRNCWebViewManagerImpl.f0(oVar, z6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C0872e0 c0872e0, o oVar) {
        oVar.getWebView().setWebViewClient(new f());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public o createViewInstance(C0872e0 c0872e0) {
        return this.mRNCWebViewManagerImpl.d(c0872e0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(o oVar) {
        this.mRNCWebViewManagerImpl.k(oVar);
        super.onDropViewInstance(oVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(o oVar, String str, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.l(oVar, str, readableArray);
        super.receiveCommand(oVar, str, readableArray);
    }

    public o createViewInstance(C0872e0 c0872e0, d dVar) {
        return this.mRNCWebViewManagerImpl.e(c0872e0, dVar);
    }
}
