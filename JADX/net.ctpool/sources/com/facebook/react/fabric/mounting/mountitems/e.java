package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import i5.q;
import j5.AbstractC1787F;
import java.util.Map;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11757a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11758b = AbstractC1787F.i(q.a("View", ReactViewManager.REACT_CLASS), q.a("Image", ReactImageManager.REACT_CLASS), q.a("ScrollView", ReactScrollViewManager.REACT_CLASS), q.a("Slider", "RCTSlider"), q.a("ModalHostView", ReactModalHostManager.REACT_CLASS), q.a("Paragraph", ReactTextViewManager.REACT_CLASS), q.a("Text", "RCText"), q.a("RawText", ReactRawTextManager.REACT_CLASS), q.a("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), q.a("ShimmeringView", "RKShimmeringView"), q.a("TemplateView", "RCTTemplateView"), q.a("AxialGradientView", "RCTAxialGradientView"), q.a("Video", "RCTVideo"), q.a("Map", "RCTMap"), q.a("WebView", "RCTWebView"), q.a("Keyframes", "RCTKeyframes"), q.a("ImpressionTrackingView", "RCTImpressionTrackingView"));

    private e() {
    }

    public static final String a(String str) {
        k.f(str, "componentName");
        String str2 = (String) f11758b.get(str);
        return str2 == null ? str : str2;
    }
}
