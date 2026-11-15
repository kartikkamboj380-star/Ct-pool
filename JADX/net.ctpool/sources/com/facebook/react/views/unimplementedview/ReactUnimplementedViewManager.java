package com.facebook.react.views.unimplementedview;

import android.view.View;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewGroupManager;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactUnimplementedViewManager.REACT_CLASS)
public final class ReactUnimplementedViewManager extends ViewGroupManager<com.facebook.react.views.unimplementedview.a> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "UnimplementedNativeView";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @InterfaceC2218a(name = "name")
    public final void setName(com.facebook.react.views.unimplementedview.a aVar, String str) {
        k.f(aVar, "view");
        k.f(str, "name");
        aVar.setName(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.unimplementedview.a createViewInstance(C0872e0 c0872e0) {
        k.f(c0872e0, "reactContext");
        return new com.facebook.react.views.unimplementedview.a(c0872e0);
    }
}
