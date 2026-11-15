package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.C0872e0;
import j0.AbstractC1772b;
import j0.AbstractC1773c;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f18256A = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f18262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f18264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f18265i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18257a = "RNCWebViewManagerImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f18258b = new g() { // from class: com.reactnativecommunity.webview.i
        @Override // com.reactnativecommunity.webview.g
        public final void a(WebView webView) {
            j.j(webView);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f18266j = "UTF-8";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f18267k = "text/html";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f18268l = "POST";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f18269m = "about:blank";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f18270n = "Downloading";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f18271o = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f18272p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f18273q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f18274r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f18275s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f18276t = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f18277u = 6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f18278v = 7;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f18279w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f18280x = 1000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f18281y = 1001;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f18282z = 1002;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends com.reactnativecommunity.webview.c {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    public static final class c extends com.reactnativecommunity.webview.c {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        final /* synthetic */ Activity f18283A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f18284B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Activity activity, int i7) {
            super(dVar);
            this.f18283A = activity;
            this.f18284B = i7;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (this.f18205n == null) {
                return;
            }
            ViewGroup viewGroupC = c();
            (viewGroupC.getRootView() != this.f18204m.getRootView() ? this.f18204m.getRootView() : this.f18204m).setVisibility(0);
            this.f18283A.getWindow().clearFlags(512);
            viewGroupC.removeView(this.f18205n);
            this.f18206o.onCustomViewHidden();
            this.f18205n = null;
            this.f18206o = null;
            this.f18283A.setRequestedOrientation(this.f18284B);
            this.f18204m.getThemedReactContext().removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            w5.k.f(view, "view");
            w5.k.f(customViewCallback, "callback");
            if (this.f18205n != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f18205n = view;
            this.f18206o = customViewCallback;
            this.f18283A.setRequestedOrientation(-1);
            this.f18205n.setSystemUiVisibility(7942);
            this.f18283A.getWindow().setFlags(512, 512);
            this.f18205n.setBackgroundColor(-16777216);
            ViewGroup viewGroupC = c();
            viewGroupC.addView(this.f18205n, com.reactnativecommunity.webview.c.f18203z);
            (viewGroupC.getRootView() != this.f18204m.getRootView() ? this.f18204m.getRootView() : this.f18204m).setVisibility(8);
            this.f18204m.getThemedReactContext().addLifecycleEventListener(this);
        }
    }

    private final void e0(o oVar) {
        WebSettings settings;
        String str;
        d webView = oVar.getWebView();
        if (this.f18264h != null) {
            settings = webView.getSettings();
            str = this.f18264h;
        } else if (this.f18265i == null) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
            return;
        } else {
            settings = webView.getSettings();
            str = this.f18265i;
        }
        settings.setUserAgentString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar, j jVar, String str, String str2, String str3, String str4, long j7) {
        w5.k.f(dVar, "$webView");
        w5.k.f(jVar, "this$0");
        dVar.setIgnoreErrFailedForThisURL(str);
        RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) dVar.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
        if (rNCWebViewModule == null) {
            return;
        }
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String strA = p.a(str, str3, str4);
            w5.k.c(strA);
            String strB = k.a().b(strA, "_");
            String str5 = "Downloading " + strB;
            try {
                URL url = new URL(str);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e7) {
                Log.w(jVar.f18257a, "Error getting cookie for DownloadManager", e7);
            }
            request.addRequestHeader("User-Agent", str2);
            request.setTitle(strB);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strB);
            rNCWebViewModule.setDownloadRequest(request);
            if (rNCWebViewModule.grantFileDownloaderPermissions(jVar.h(), jVar.i())) {
                rNCWebViewModule.downloadFile(jVar.h());
            }
        } catch (IllegalArgumentException e8) {
            Log.w(jVar.f18257a, "Unsupported URI, aborting download", e8);
        }
    }

    private final void g0(d dVar) {
        Activity currentActivity = dVar.getThemedReactContext().getCurrentActivity();
        if (this.f18259c && currentActivity != null) {
            c cVar = new c(dVar, currentActivity, currentActivity.getRequestedOrientation());
            cVar.f(this.f18260d);
            cVar.g(this.f18263g);
            dVar.setWebChromeClient(cVar);
            return;
        }
        com.reactnativecommunity.webview.c cVar2 = (com.reactnativecommunity.webview.c) dVar.getWebChromeClient();
        if (cVar2 != null) {
            cVar2.onHideCustomView();
        }
        b bVar = new b(dVar);
        bVar.f(this.f18260d);
        bVar.g(this.f18263g);
        dVar.setWebChromeClient(bVar);
    }

    private final String h() {
        String str = this.f18261e;
        return str == null ? this.f18270n : str;
    }

    private final String i() {
        String str = this.f18262f;
        return str == null ? this.f18271o : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WebView webView) {
    }

    public final void A(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        this.f18263g = z6;
        g0(webView);
    }

    public final void B(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().setHasScrollEvent(z6);
    }

    public final void C(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        if (z6) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    public final void D(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().f18221m = str;
    }

    public final void E(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().f18222n = str;
    }

    public final void F(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().f18225q = z6;
    }

    public final void G(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().f18224p = z6;
    }

    public final void H(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().setInjectedJavaScriptObject(str);
    }

    public final void I(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z6);
    }

    public final void J(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setJavaScriptEnabled(z6);
    }

    public final void K(String str) {
        this.f18262f = str;
    }

    public final void L(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z6);
    }

    public final void M(o oVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList;
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        if (readableArray == null) {
            arrayList = null;
        } else {
            arrayList = readableArray.toArrayList();
            w5.k.d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        }
        webView.setMenuCustomItems(arrayList);
    }

    public final void N(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().setMessagingEnabled(z6);
    }

    public final void O(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().f18227s = str;
    }

    public final void P(o oVar, int i7) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setMinimumFontSize(i7);
    }

    public final void Q(o oVar, String str) {
        WebSettings settings;
        int i7;
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        if (str == null || w5.k.b("never", str)) {
            settings = webView.getSettings();
            i7 = 1;
        } else if (w5.k.b("always", str)) {
            settings = webView.getSettings();
            i7 = 0;
        } else {
            if (!w5.k.b("compatibility", str)) {
                return;
            }
            settings = webView.getSettings();
            i7 = 2;
        }
        settings.setMixedContentMode(i7);
    }

    public final void R(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().f18233y = z6;
    }

    public final void S(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        int i7 = 0;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1414557169) {
                str.equals("always");
            } else if (iHashCode != 104712844) {
                if (iHashCode == 951530617 && str.equals("content")) {
                    i7 = 1;
                }
            } else if (str.equals("never")) {
                i7 = 2;
            }
        }
        webView.setOverScrollMode(i7);
    }

    public final void T(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setSaveFormData(!z6);
    }

    public final void U(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z6);
        webView.getSettings().setUseWideViewPort(z6);
    }

    public final void V(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setBuiltInZoomControls(z6);
    }

    public final void W(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setDisplayZoomControls(z6);
    }

    public final void X(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setSupportMultipleWindows(z6);
    }

    public final void Y(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().setHorizontalScrollBarEnabled(z6);
    }

    public final void Z(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().setVerticalScrollBarEnabled(z6);
    }

    public final void a0(o oVar, ReadableMap readableMap, boolean z6) {
        byte[] bytes;
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                String string2 = readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "";
                w5.k.c(string);
                webView.loadDataWithBaseURL(string2, string, this.f18267k, this.f18266j, null);
                return;
            }
            if (readableMap.hasKey("uri")) {
                String string3 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !w5.k.b(url, string3)) {
                    if (readableMap.hasKey("method") && F5.g.p(readableMap.getString("method"), this.f18268l, true)) {
                        if (readableMap.hasKey("body")) {
                            String string4 = readableMap.getString("body");
                            try {
                                w5.k.c(string4);
                                Charset charsetForName = Charset.forName("UTF-8");
                                w5.k.e(charsetForName, "forName(...)");
                                bytes = string4.getBytes(charsetForName);
                                w5.k.e(bytes, "getBytes(...)");
                            } catch (UnsupportedEncodingException unused) {
                                w5.k.c(string4);
                                bytes = string4.getBytes(F5.d.f1104b);
                                w5.k.e(bytes, "getBytes(...)");
                            }
                        } else {
                            bytes = null;
                        }
                        if (bytes == null) {
                            bytes = new byte[0];
                        }
                        w5.k.c(string3);
                        webView.postUrl(string3, bytes);
                        return;
                    }
                    HashMap map = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        if (z6) {
                            ReadableArray array = readableMap.getArray("headers");
                            w5.k.c(array);
                            for (Object obj : array.toArrayList()) {
                                w5.k.d(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                                HashMap map2 = (HashMap) obj;
                                String str = (String) map2.get("name");
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = (String) map2.get("value");
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Locale locale = Locale.ENGLISH;
                                w5.k.e(locale, "ENGLISH");
                                String lowerCase = str.toLowerCase(locale);
                                w5.k.e(lowerCase, "toLowerCase(...)");
                                if (w5.k.b("user-agent", lowerCase)) {
                                    webView.getSettings().setUserAgentString(str2);
                                } else {
                                    map.put(str, str2);
                                }
                            }
                        } else {
                            ReadableMap map3 = readableMap.getMap("headers");
                            w5.k.c(map3);
                            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map3.keySetIterator();
                            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                                Locale locale2 = Locale.ENGLISH;
                                w5.k.e(locale2, "ENGLISH");
                                String lowerCase2 = strNextKey.toLowerCase(locale2);
                                w5.k.e(lowerCase2, "toLowerCase(...)");
                                if (w5.k.b("user-agent", lowerCase2)) {
                                    webView.getSettings().setUserAgentString(map3.getString(strNextKey));
                                } else {
                                    map.put(strNextKey, map3.getString(strNextKey));
                                }
                            }
                        }
                    }
                    w5.k.c(string3);
                    webView.loadUrl(string3, map);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(this.f18269m);
    }

    public final void b0(o oVar, int i7) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setTextZoom(i7);
    }

    public final d c(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "context");
        return new d(c0872e0);
    }

    public final void c0(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(oVar.getWebView(), z6);
    }

    public final o d(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "context");
        return e(c0872e0, c(c0872e0));
    }

    public final void d0(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        this.f18264h = str;
        e0(oVar);
    }

    public final o e(C0872e0 c0872e0, final d dVar) {
        w5.k.f(c0872e0, "context");
        w5.k.f(dVar, "webView");
        g0(dVar);
        c0872e0.addLifecycleEventListener(dVar);
        this.f18258b.a(dVar);
        WebSettings settings = dVar.getSettings();
        w5.k.e(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dVar.setDownloadListener(new DownloadListener() { // from class: com.reactnativecommunity.webview.h
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
                j.f(dVar, this, str, str2, str3, str4, j7);
            }
        });
        return new o(c0872e0, dVar);
    }

    public final void f0(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        WebView.setWebContentsDebuggingEnabled(z6);
    }

    public final Map g() {
        return S1.f.a().b("goBack", Integer.valueOf(this.f18272p)).b("goForward", Integer.valueOf(this.f18273q)).b("reload", Integer.valueOf(this.f18274r)).b("stopLoading", Integer.valueOf(this.f18275s)).b("postMessage", Integer.valueOf(this.f18276t)).b("injectJavaScript", Integer.valueOf(this.f18277u)).b("loadUrl", Integer.valueOf(this.f18278v)).b("requestFocus", Integer.valueOf(this.f18279w)).b("clearFormData", Integer.valueOf(this.f18280x)).b("clearCache", Integer.valueOf(this.f18281y)).b("clearHistory", Integer.valueOf(this.f18282z)).a();
    }

    public final void k(o oVar) {
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.c();
        webView.f18220B = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void l(o oVar, String str, ReadableArray readableArray) {
        w5.k.f(oVar, "viewWrapper");
        w5.k.f(str, "commandId");
        w5.k.f(readableArray, "args");
        d webView = oVar.getWebView();
        switch (str.hashCode()) {
            case -1241591313:
                if (str.equals("goBack")) {
                    webView.goBack();
                    return;
                }
                return;
            case -948122918:
                if (str.equals("stopLoading")) {
                    webView.stopLoading();
                    return;
                }
                return;
            case -934641255:
                if (str.equals("reload")) {
                    webView.reload();
                    return;
                }
                return;
            case -759238347:
                if (str.equals("clearCache")) {
                    webView.clearCache(readableArray.getBoolean(0));
                    return;
                }
                return;
            case -318289731:
                if (str.equals("goForward")) {
                    webView.goForward();
                    return;
                }
                return;
            case -265032709:
                if (str.equals("clearFormData")) {
                    webView.clearFormData();
                    return;
                }
                return;
            case 336631465:
                if (str.equals("loadUrl")) {
                    webView.f18234z.b(false);
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                return;
            case 903120263:
                if (str.equals("clearHistory")) {
                    webView.clearHistory();
                    return;
                }
                return;
            case 1280029577:
                if (str.equals("requestFocus")) {
                    webView.requestFocus();
                    return;
                }
                return;
            case 1490029383:
                if (str.equals("postMessage")) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", readableArray.getString(0));
                        webView.h("(function () {var event;var data = " + jSONObject + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                        return;
                    } catch (JSONException e7) {
                        throw new RuntimeException(e7);
                    }
                }
                return;
            case 2104576510:
                if (str.equals("injectJavaScript")) {
                    webView.h(readableArray.getString(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void m(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setAllowFileAccess(z6);
    }

    public final void n(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setAllowFileAccessFromFileURLs(z6);
    }

    public final void o(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z6);
    }

    public final void p(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        this.f18259c = z6;
        g0(webView);
    }

    public final void q(o oVar, boolean z6) {
        WebChromeClient webChromeClient;
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        this.f18260d = z6;
        if (Build.VERSION.SDK_INT < 26 || (webChromeClient = webView.getWebChromeClient()) == null || !(webChromeClient instanceof com.reactnativecommunity.webview.c)) {
            return;
        }
        ((com.reactnativecommunity.webview.c) webChromeClient).f(z6);
    }

    public final void r(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().setLayerType(w5.k.b(str, "hardware") ? 2 : w5.k.b(str, "software") ? 1 : 0, null);
    }

    public final void s(o oVar, String str) {
        String str2;
        w5.k.f(oVar, "viewWrapper");
        if (str != null) {
            str2 = WebSettings.getDefaultUserAgent(oVar.getWebView().getContext()) + " " + str;
        } else {
            str2 = null;
        }
        this.f18265i = str2;
        e0(oVar);
    }

    public final void t(o oVar, ReadableMap readableMap) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().setBasicAuthCredential((readableMap != null && readableMap.hasKey("username") && readableMap.hasKey("password")) ? new com.reactnativecommunity.webview.a(readableMap.getString("username"), readableMap.getString("password")) : null);
    }

    public final void u(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setCacheMode(z6 ? -1 : 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void v(o oVar, String str) {
        w5.k.f(oVar, "viewWrapper");
        WebSettings settings = oVar.getWebView().getSettings();
        int i7 = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i7 = 2;
                    }
                    break;
                case -1215135800:
                    str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i7 = 1;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i7 = 3;
                    }
                    break;
            }
        }
        settings.setCacheMode(i7);
    }

    public final void w(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setDomStorageEnabled(z6);
    }

    public final void x(String str) {
        this.f18261e = str;
    }

    public final void y(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        d webView = oVar.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (AbstractC1773c.a("FORCE_DARK")) {
                AbstractC1772b.b(webView.getSettings(), z6 ? 2 : 0);
            }
            if (z6 && AbstractC1773c.a("FORCE_DARK_STRATEGY")) {
                AbstractC1772b.c(webView.getSettings(), 2);
            }
        }
    }

    public final void z(o oVar, boolean z6) {
        w5.k.f(oVar, "viewWrapper");
        oVar.getWebView().getSettings().setGeolocationEnabled(z6);
    }
}
