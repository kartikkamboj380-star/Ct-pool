package com.reactnativecommunity.webview;

import android.R;
import android.content.ComponentCallbacks2;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.google.android.gms.common.internal.ImagesContract;
import com.reactnativecommunity.webview.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m2.InterfaceC1876g;
import m2.InterfaceC1877h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends WebChromeClient implements LifecycleEventListener {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final FrameLayout.LayoutParams f18203z = new FrameLayout.LayoutParams(-1, -1, 17);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected d f18204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected View f18205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected WebChromeClient.CustomViewCallback f18206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected PermissionRequest f18207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected List f18208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected GeolocationPermissions.Callback f18209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f18210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f18211t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected List f18212u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected d.c f18213v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f18214w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected boolean f18215x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC1877h f18216y = new InterfaceC1877h() { // from class: com.reactnativecommunity.webview.b
        @Override // m2.InterfaceC1877h
        public final boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
            return this.f18202m.d(i7, strArr, iArr);
        }
    };

    class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f18217a;

        a(WebView webView) {
            this.f18217a = webView;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("targetUrl", str);
            WebView webView2 = this.f18217a;
            ((d) webView2).g(webView2, new a5.h(o.a(this.f18217a), writableMapCreateMap));
            return true;
        }
    }

    public c(d dVar) {
        this.f18204m = dVar;
    }

    private InterfaceC1876g b() {
        ComponentCallbacks2 currentActivity = this.f18204m.getThemedReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof InterfaceC1876g) {
            return (InterfaceC1876g) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(int i7, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        List list;
        List list2;
        List list3;
        List list4;
        GeolocationPermissions.Callback callback;
        String str;
        this.f18211t = false;
        boolean z6 = false;
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String str2 = strArr[i8];
            boolean z7 = iArr[i8] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = this.f18209r) != null && (str = this.f18210s) != null) {
                if (z7) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                this.f18209r = null;
                this.f18210s = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z7 && (list4 = this.f18208q) != null) {
                    list4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z6 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z7 && (list3 = this.f18208q) != null) {
                    list3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z6 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z7 && (list2 = this.f18208q) != null) {
                    list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z6 = true;
            }
        }
        if (z6 && (permissionRequest = this.f18207p) != null && (list = this.f18208q) != null) {
            permissionRequest.grant((String[]) list.toArray(new String[0]));
            this.f18207p = null;
            this.f18208q = null;
        }
        if (this.f18212u.isEmpty()) {
            return true;
        }
        e(this.f18212u);
        return false;
    }

    private synchronized void e(List list) {
        if (this.f18211t) {
            this.f18212u.addAll(list);
            return;
        }
        InterfaceC1876g interfaceC1876gB = b();
        this.f18211t = true;
        interfaceC1876gB.p((String[]) list.toArray(new String[0]), 3, this.f18216y);
        this.f18212u.clear();
    }

    protected ViewGroup c() {
        return (ViewGroup) this.f18204m.getThemedReactContext().getCurrentActivity().findViewById(R.id.content);
    }

    public void f(boolean z6) {
        this.f18214w = z6;
    }

    public void g(boolean z6) {
        this.f18215x = z6;
    }

    public void h(d.c cVar) {
        this.f18213v = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f18215x) {
            webView2.setWebViewClient(new a(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (androidx.core.content.b.a(this.f18204m.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f18209r = callback;
        this.f18210s = str;
        e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        View view = this.f18205n;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.f18205n.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f18208q = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i7 = 0;
        while (true) {
            String str = null;
            if (i7 >= length) {
                break;
            }
            String str2 = resources[i7];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.f18214w) {
                    this.f18208q.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (androidx.core.content.b.a(this.f18204m.getThemedReactContext(), str) == 0) {
                    this.f18208q.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f18208q.toArray(new String[0]));
            this.f18208q = null;
        } else {
            this.f18207p = permissionRequest;
            e(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i7) {
        super.onProgressChanged(webView, i7);
        String url = webView.getUrl();
        if (this.f18213v.a()) {
            return;
        }
        int iA = o.a(webView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", iA);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putString(ImagesContract.URL, url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble("progress", i7 / 100.0f);
        AbstractC0884k0.c(this.f18204m.getThemedReactContext(), iA).c(new a5.e(iA, writableMapCreateMap));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((RNCWebViewModule) this.f18204m.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }
}
