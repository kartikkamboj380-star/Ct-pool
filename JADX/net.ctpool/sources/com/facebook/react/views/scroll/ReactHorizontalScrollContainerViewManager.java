package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.views.view.ReactClippingViewManager;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
public final class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<K2.c> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public K2.c createViewInstance(C0872e0 c0872e0) {
        k.f(c0872e0, "context");
        return new K2.c(c0872e0);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
