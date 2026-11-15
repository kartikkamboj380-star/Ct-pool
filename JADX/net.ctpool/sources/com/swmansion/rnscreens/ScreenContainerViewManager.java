package com.swmansion.rnscreens;

import F2.C0360l;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.ViewGroupManager;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ScreenContainerViewManager.REACT_CLASS)
public final class ScreenContainerViewManager extends ViewGroupManager<n> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenContainer";
    private final A0 delegate = new C0360l(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C0895v createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        w5.k.f(reactApplicationContext, "context");
        return new G(reactApplicationContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.delegate;
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
    public n createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "reactContext");
        return new n(c0872e0);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public void removeAllViews(n nVar) {
        w5.k.f(nVar, "parent");
        nVar.w();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(n nVar, View view, int i7) {
        w5.k.f(nVar, "parent");
        w5.k.f(view, "child");
        if (!(view instanceof C1599l)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens".toString());
        }
        nVar.d((C1599l) view, i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(n nVar, int i7) {
        w5.k.f(nVar, "parent");
        return nVar.l(i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(n nVar) {
        w5.k.f(nVar, "parent");
        return nVar.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(n nVar, int i7) {
        w5.k.f(nVar, "parent");
        nVar.y(i7);
    }
}
