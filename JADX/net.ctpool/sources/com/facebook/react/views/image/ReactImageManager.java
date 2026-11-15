package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.SimpleViewManager;
import g1.AbstractC1687b;
import i2.InterfaceC1741a;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactImageManager.REACT_CLASS)
public class ReactImageManager extends SimpleViewManager<h> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private final f mCallerContextFactory;
    private AbstractC1687b mDraweeControllerBuilder;
    private a mGlobalImageLoadListener;

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
    }

    @Deprecated
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractC1687b getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = c1.c.i();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(S1.f.h(b.g(4), S1.f.d("registrationName", "onLoadStart"), b.g(5), S1.f.d("registrationName", "onProgress"), b.g(2), S1.f.d("registrationName", "onLoad"), b.g(1), S1.f.d("registrationName", "onError"), b.g(3), S1.f.d("registrationName", "onLoadEnd")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC2218a(name = "accessible")
    public void setAccessible(h hVar, boolean z6) {
        hVar.setFocusable(z6);
    }

    @InterfaceC2218a(name = "blurRadius")
    public void setBlurRadius(h hVar, float f7) {
        hVar.setBlurRadius(f7);
    }

    @InterfaceC2218a(customType = "Color", name = "borderColor")
    public void setBorderColor(h hVar, Integer num) {
        hVar.setBorderColor(num == null ? 0 : num.intValue());
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(h hVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        if (i7 == 0) {
            hVar.setBorderRadius(f7);
        } else {
            hVar.p(f7, i7 - 1);
        }
    }

    @InterfaceC2218a(name = "borderWidth")
    public void setBorderWidth(h hVar, float f7) {
        hVar.setBorderWidth(f7);
    }

    @InterfaceC2218a(name = "defaultSrc")
    public void setDefaultSource(h hVar, String str) {
        hVar.setDefaultSource(str);
    }

    @InterfaceC2218a(name = "fadeDuration")
    public void setFadeDuration(h hVar, int i7) {
        hVar.setFadeDuration(i7);
    }

    @InterfaceC2218a(name = "headers")
    public void setHeaders(h hVar, ReadableMap readableMap) {
        hVar.setHeaders(readableMap);
    }

    @InterfaceC2218a(name = "internal_analyticTag")
    public void setInternal_AnalyticsTag(h hVar, String str) {
    }

    @InterfaceC2218a(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(h hVar, boolean z6) {
        hVar.setShouldNotifyLoadEvents(z6);
    }

    @InterfaceC2218a(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(h hVar, String str) {
        hVar.setLoadingIndicatorSource(str);
    }

    @InterfaceC2218a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(h hVar, Integer num) {
        hVar.setOverlayColor(num == null ? 0 : num.intValue());
    }

    @InterfaceC2218a(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(h hVar, boolean z6) {
        hVar.setProgressiveRenderingEnabled(z6);
    }

    @InterfaceC2218a(name = "resizeMethod")
    public void setResizeMethod(h hVar, String str) {
        c cVar;
        if (str == null || "auto".equals(str)) {
            cVar = c.f12775m;
        } else if ("resize".equals(str)) {
            cVar = c.f12776n;
        } else {
            if (!"scale".equals(str)) {
                hVar.setResizeMethod(c.f12775m);
                P0.a.G("ReactNative", "Invalid resize method: '" + str + "'");
                return;
            }
            cVar = c.f12777o;
        }
        hVar.setResizeMethod(cVar);
    }

    @InterfaceC2218a(name = "resizeMode")
    public void setResizeMode(h hVar, String str) {
        hVar.setScaleType(d.c(str));
        hVar.setTileMode(d.d(str));
    }

    @InterfaceC2218a(name = "resizeMultiplier")
    public void setResizeMultiplier(h hVar, float f7) {
        if (f7 < 0.01f) {
            P0.a.G("ReactNative", "Invalid resize multiplier: '" + f7 + "'");
        }
        hVar.setResizeMultiplier(f7);
    }

    @InterfaceC2218a(name = "source")
    public void setSource(h hVar, ReadableArray readableArray) {
        hVar.setSource(readableArray);
    }

    @InterfaceC2218a(name = "src")
    public void setSrc(h hVar, ReadableArray readableArray) {
        setSource(hVar, readableArray);
    }

    @InterfaceC2218a(customType = "Color", name = "tintColor")
    public void setTintColor(h hVar, Integer num) {
        if (num == null) {
            hVar.clearColorFilter();
        } else {
            hVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(AbstractC1687b abstractC1687b, a aVar, f fVar) {
        this.mDraweeControllerBuilder = abstractC1687b;
        this.mCallerContext = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(C0872e0 c0872e0) {
        return new h(c0872e0, getDraweeControllerBuilder(), null, getCallerContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h hVar) {
        super.onAfterUpdateTransaction(hVar);
        hVar.o();
    }

    @Deprecated
    public ReactImageManager(AbstractC1687b abstractC1687b, a aVar, Object obj) {
        this.mDraweeControllerBuilder = abstractC1687b;
        this.mCallerContext = obj;
    }

    public ReactImageManager(AbstractC1687b abstractC1687b, f fVar) {
        this(abstractC1687b, (a) null, fVar);
    }

    @Deprecated
    public ReactImageManager(AbstractC1687b abstractC1687b, Object obj) {
        this(abstractC1687b, (a) null, obj);
    }
}
