package com.facebook.react.uimanager;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, C0895v> {
    @Override // com.facebook.react.uimanager.ViewManager
    public C0895v createShadowNodeInstance() {
        return new C0895v();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C0895v> getShadowNodeClass() {
        return C0895v.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t6, Object obj) {
        w5.k.f(t6, "root");
    }
}
