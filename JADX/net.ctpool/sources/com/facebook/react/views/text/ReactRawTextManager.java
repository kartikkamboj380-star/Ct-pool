package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewManager;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactRawTextManager.REACT_CLASS)
public class ReactRawTextManager extends ViewManager<View, e> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<e> getShadowNodeClass() {
        return e.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createShadowNodeInstance() {
        return new e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(C0872e0 c0872e0) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
}
