package com.reactnativecommunity.webview;

import a5.C0519b;
import a5.C0520c;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.google.android.gms.common.internal.ImagesContract;
import com.reactnativecommunity.webview.d;
import com.reactnativecommunity.webview.l;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class f extends WebViewClient {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f18249e = "RNCWebViewClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f18250a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d.c f18251b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f18252c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected a f18253d = null;

    protected WritableMap a(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", o.a(webView));
        writableMapCreateMap.putString(ImagesContract.URL, str);
        writableMapCreateMap.putBoolean("loading", (this.f18250a || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    protected void b(WebView webView, String str) {
        int iA = o.a(webView);
        AbstractC0884k0.c((ReactContext) webView.getContext(), iA).c(new a5.d(iA, a(webView, str)));
    }

    public void c(a aVar) {
        this.f18253d = aVar;
    }

    public void d(String str) {
        this.f18252c = str;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z6) {
        super.doUpdateVisitedHistory(webView, str, z6);
        ((d) webView).g(webView, new a5.f(o.a(webView), a(webView, str)));
    }

    public void e(d.c cVar) {
        this.f18251b = cVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.f18250a) {
            return;
        }
        ((d) webView).a();
        b(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f18250a = false;
        ((d) webView).b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i7, String str, String str2) {
        String str3 = this.f18252c;
        if (str3 != null && str2.equals(str3) && i7 == -1 && str.equals("net::ERR_FAILED")) {
            d(null);
            return;
        }
        super.onReceivedError(webView, i7, str, str2);
        this.f18250a = true;
        b(webView, str2);
        WritableMap writableMapA = a(webView, str2);
        writableMapA.putDouble("code", i7);
        writableMapA.putString("description", str);
        int iA = o.a(webView);
        AbstractC0884k0.c((ReactContext) webView.getContext(), iA).c(new C0520c(iA, writableMapA));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        a aVar = this.f18253d;
        if (aVar != null) {
            httpAuthHandler.proceed(aVar.f18200a, aVar.f18201b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapA = a(webView, webResourceRequest.getUrl().toString());
            writableMapA.putInt("statusCode", webResourceResponse.getStatusCode());
            writableMapA.putString("description", webResourceResponse.getReasonPhrase());
            int iA = o.a(webView);
            AbstractC0884k0.c((ReactContext) webView.getContext(), iA).c(new C0519b(iA, writableMapA));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        if (url == null || url2 == null) {
            return;
        }
        if (!url.equalsIgnoreCase(url2)) {
            Log.w(f18249e, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
            return;
        }
        int primaryError = sslError.getPrimaryError();
        onReceivedError(webView, primaryError, "SSL error: " + (primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid"), url2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (renderProcessGoneDetail.didCrash()) {
            Log.e(f18249e, "The WebView rendering process crashed.");
        } else {
            Log.w(f18249e, "The WebView rendering process was killed by the system.");
        }
        if (webView == null) {
            return true;
        }
        WritableMap writableMapA = a(webView, webView.getUrl());
        writableMapA.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        int iA = o.a(webView);
        AbstractC0884k0.c((ReactContext) webView.getContext(), iA).c(new a5.i(iA, writableMapA));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        d dVar = (d) webView;
        if (dVar.getReactApplicationContext().getJavaScriptContextHolder().get() == 0 || dVar.f18228t == null) {
            P0.a.G(f18249e, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.f18251b.b(true);
            int iA = o.a(webView);
            AbstractC0884k0.c((ReactContext) webView.getContext(), iA).c(new a5.j(iA, a(webView, str)));
            return true;
        }
        androidx.core.util.c cVarB = l.f18286s.b();
        Double d7 = (Double) cVarB.f7261a;
        double dDoubleValue = d7.doubleValue();
        AtomicReference atomicReference = (AtomicReference) cVarB.f7262b;
        WritableMap writableMapA = a(webView, str);
        writableMapA.putDouble("lockIdentifier", dDoubleValue);
        dVar.f(writableMapA);
        try {
            synchronized (atomicReference) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    while (atomicReference.get() == l.d.a.UNDECIDED) {
                        if (SystemClock.elapsedRealtime() - jElapsedRealtime > 250) {
                            P0.a.G(f18249e, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                            l.f18286s.c(d7);
                            return false;
                        }
                        atomicReference.wait(250L);
                    }
                    boolean z6 = atomicReference.get() == l.d.a.SHOULD_OVERRIDE;
                    l.f18286s.c(d7);
                    return z6;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e7) {
            P0.a.k(f18249e, "shouldOverrideUrlLoading was interrupted while waiting for result.", e7);
            l.f18286s.c(d7);
            return false;
        }
    }
}
