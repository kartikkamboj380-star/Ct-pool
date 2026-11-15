package com.reactnativecommunity.webview;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class o extends FrameLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f18308n = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f18309m;

    public static final class a {
        private a() {
        }

        public final int a(WebView webView) {
            w5.k.f(webView, "webView");
            Object parent = webView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                return view.getId();
            }
            return -1;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, d dVar) {
        super(context);
        w5.k.f(context, "context");
        w5.k.f(dVar, "webView");
        dVar.setBackgroundColor(0);
        addView(dVar);
        View childAt = getChildAt(0);
        w5.k.d(childAt, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView");
        this.f18309m = (d) childAt;
    }

    public static final int a(WebView webView) {
        return f18308n.a(webView);
    }

    public final d getWebView() {
        return this.f18309m;
    }
}
