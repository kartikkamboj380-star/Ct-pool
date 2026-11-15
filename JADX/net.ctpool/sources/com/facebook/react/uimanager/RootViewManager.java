package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RootView";

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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "reactContext");
        return new FrameLayout(c0872e0);
    }
}
