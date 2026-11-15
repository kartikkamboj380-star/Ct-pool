package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C0872e0;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactVirtualTextViewManager.REACT_CLASS)
public class ReactVirtualTextViewManager extends BaseViewManager<View, p> {
    public static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(C0872e0 c0872e0) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public p createShadowNodeInstance() {
        return new p();
    }
}
