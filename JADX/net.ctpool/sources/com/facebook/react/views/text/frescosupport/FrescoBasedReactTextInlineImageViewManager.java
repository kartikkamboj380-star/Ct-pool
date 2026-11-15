package com.facebook.react.views.text.frescosupport;

import android.view.View;
import c1.c;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C0872e0;
import g1.AbstractC1687b;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
public class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final AbstractC1687b mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(C0872e0 c0872e0) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<a> getShadowNodeClass() {
        return a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager(AbstractC1687b abstractC1687b, Object obj) {
        this.mDraweeControllerBuilder = abstractC1687b;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createShadowNodeInstance() {
        AbstractC1687b abstractC1687bI = this.mDraweeControllerBuilder;
        if (abstractC1687bI == null) {
            abstractC1687bI = c.i();
        }
        return new a(abstractC1687bI, this.mCallerContext);
    }
}
