package com.swmansion.rnscreens;

import F2.C0363o;
import F2.InterfaceC0364p;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewGroupManager;
import i2.InterfaceC1741a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<x> implements InterfaceC0364p {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final A0 delegate = new C0363o(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void logNotAvailable(String str) {
        Log.w("[RNScreens]", str + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return S1.f.e("topAttached", S1.f.d("registrationName", "onAttached"), "topDetached", S1.f.d("registrationName", "onDetached"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.r
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public x createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "reactContext");
        return new x(c0872e0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(x xVar) {
        w5.k.f(xVar, "parent");
        super.onAfterUpdateTransaction(xVar);
        xVar.i();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(x xVar) {
        w5.k.f(xVar, "view");
        xVar.d();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public void removeAllViews(x xVar) {
        w5.k.f(xVar, "parent");
        xVar.j();
    }

    @Override // F2.InterfaceC0364p
    public void setBackButtonDisplayMode(x xVar, String str) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(x xVar, boolean z6) {
        w5.k.f(xVar, "config");
        xVar.setBackButtonInCustomView(z6);
    }

    @Override // F2.InterfaceC0364p
    public void setBackTitle(x xVar, String str) {
        logNotAvailable("backTitle");
    }

    @Override // F2.InterfaceC0364p
    public void setBackTitleFontFamily(x xVar, String str) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // F2.InterfaceC0364p
    public void setBackTitleFontSize(x xVar, int i7) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // F2.InterfaceC0364p
    public void setBackTitleVisible(x xVar, boolean z6) {
        logNotAvailable("backTitleVisible");
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(x xVar, Integer num) {
        w5.k.f(xVar, "config");
        xVar.setBackgroundColor(num);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(customType = "Color", name = "color")
    public void setColor(x xVar, Integer num) {
        w5.k.f(xVar, "config");
        xVar.setTintColor(num != null ? num.intValue() : 0);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "direction")
    public void setDirection(x xVar, String str) {
        w5.k.f(xVar, "config");
        xVar.setDirection(str);
    }

    @Override // F2.InterfaceC0364p
    public void setDisableBackButtonMenu(x xVar, boolean z6) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "hidden")
    public void setHidden(x xVar, boolean z6) {
        w5.k.f(xVar, "config");
        xVar.setHidden(z6);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "hideBackButton")
    public void setHideBackButton(x xVar, boolean z6) {
        w5.k.f(xVar, "config");
        xVar.setHideBackButton(z6);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "hideShadow")
    public void setHideShadow(x xVar, boolean z6) {
        w5.k.f(xVar, "config");
        xVar.setHideShadow(z6);
    }

    @Override // F2.InterfaceC0364p
    public void setLargeTitle(x xVar, boolean z6) {
        logNotAvailable("largeTitle");
    }

    @Override // F2.InterfaceC0364p
    public void setLargeTitleBackgroundColor(x xVar, Integer num) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // F2.InterfaceC0364p
    public void setLargeTitleColor(x xVar, Integer num) {
        logNotAvailable("largeTitleColor");
    }

    @Override // F2.InterfaceC0364p
    public void setLargeTitleFontFamily(x xVar, String str) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // F2.InterfaceC0364p
    public void setLargeTitleFontSize(x xVar, int i7) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // F2.InterfaceC0364p
    public void setLargeTitleFontWeight(x xVar, String str) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // F2.InterfaceC0364p
    public void setLargeTitleHideShadow(x xVar, boolean z6) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "title")
    public void setTitle(x xVar, String str) {
        w5.k.f(xVar, "config");
        xVar.setTitle(str);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(customType = "Color", name = "titleColor")
    public void setTitleColor(x xVar, Integer num) {
        w5.k.f(xVar, "config");
        if (num != null) {
            xVar.setTitleColor(num.intValue());
        }
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "titleFontFamily")
    public void setTitleFontFamily(x xVar, String str) {
        w5.k.f(xVar, "config");
        xVar.setTitleFontFamily(str);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "titleFontSize")
    public void setTitleFontSize(x xVar, int i7) {
        w5.k.f(xVar, "config");
        xVar.setTitleFontSize(i7);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "titleFontWeight")
    public void setTitleFontWeight(x xVar, String str) {
        w5.k.f(xVar, "config");
        xVar.setTitleFontWeight(str);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "topInsetEnabled")
    public void setTopInsetEnabled(x xVar, boolean z6) {
        w5.k.f(xVar, "config");
        xVar.setTopInsetEnabled(z6);
    }

    @Override // F2.InterfaceC0364p
    @InterfaceC2218a(name = "translucent")
    public void setTranslucent(x xVar, boolean z6) {
        w5.k.f(xVar, "config");
        xVar.setTranslucent(z6);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(x xVar, View view, int i7) {
        w5.k.f(xVar, "parent");
        w5.k.f(view, "child");
        if (!(view instanceof y)) {
            throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
        }
        xVar.b((y) view, i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(x xVar, int i7) {
        w5.k.f(xVar, "parent");
        return xVar.e(i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(x xVar) {
        w5.k.f(xVar, "parent");
        return xVar.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(x xVar, int i7) {
        w5.k.f(xVar, "parent");
        xVar.k(i7);
    }
}
