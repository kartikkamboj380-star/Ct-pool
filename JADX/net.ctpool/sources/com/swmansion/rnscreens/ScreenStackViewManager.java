package com.swmansion.rnscreens;

import F2.C0366s;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.ViewGroupManager;
import i2.InterfaceC1741a;
import j5.AbstractC1787F;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ScreenStackViewManager.REACT_CLASS)
public final class ScreenStackViewManager extends ViewGroupManager<t> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenStack";
    private final A0 delegate = new C0366s(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void prepareOutTransition(C1599l c1599l) {
        if (c1599l != null) {
            c1599l.k();
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

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC1787F.j(i5.q.a("topFinishTransitioning", AbstractC1787F.j(i5.q.a("registrationName", "onFinishTransitioning"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        AbstractC1595h.f18392a.b();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.r
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public t createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "reactContext");
        return new t(c0872e0);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(t tVar, View view, int i7) {
        w5.k.f(tVar, "parent");
        w5.k.f(view, "child");
        if (!(view instanceof C1599l)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen".toString());
        }
        C1599l c1599l = (C1599l) view;
        AbstractC1595h.f18392a.a(c1599l.getId(), c1599l);
        tVar.d(c1599l, i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(t tVar, int i7) {
        w5.k.f(tVar, "parent");
        return tVar.l(i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(t tVar) {
        w5.k.f(tVar, "parent");
        return tVar.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(t tVar, int i7) {
        w5.k.f(tVar, "parent");
        C1599l c1599lL = tVar.l(i7);
        prepareOutTransition(c1599lL);
        tVar.y(i7);
        AbstractC1595h.f18392a.c(c1599lL.getId());
    }
}
