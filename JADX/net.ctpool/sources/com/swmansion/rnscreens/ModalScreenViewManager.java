package com.swmansion.rnscreens;

import android.view.View;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ModalScreenViewManager.REACT_CLASS)
public final class ModalScreenViewManager extends ScreenViewManager {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSModalScreen";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.swmansion.rnscreens.ScreenViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }
}
