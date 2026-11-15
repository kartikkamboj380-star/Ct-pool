package com.reactnativecommunity.webview;

import a5.C0518a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends WebView implements LifecycleEventListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected List f18219A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    WebChromeClient f18220B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f18221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f18222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected C0243d f18223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f18224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f18225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f18226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f18227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected RNCWebViewMessagingModule f18228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected f f18229u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f18230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private K2.b f18231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected boolean f18232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected boolean f18233y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected c f18234z;

    class a extends ActionMode.Callback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMode.Callback f18235a;

        /* JADX INFO: renamed from: com.reactnativecommunity.webview.d$a$a, reason: collision with other inner class name */
        class C0242a implements ValueCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MenuItem f18237a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WritableMap f18238b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActionMode f18239c;

            C0242a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f18237a = menuItem;
                this.f18238b = writableMap;
                this.f18239c = actionMode;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String string;
                Map map = (Map) d.this.f18219A.get(this.f18237a.getItemId());
                this.f18238b.putString("label", (String) map.get("label"));
                this.f18238b.putString("key", (String) map.get("key"));
                try {
                    string = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    string = "";
                }
                this.f18238b.putString("selectedText", string);
                d dVar = d.this;
                dVar.g(dVar, new C0518a(o.a(d.this), this.f18238b));
                this.f18239c.finish();
            }
        }

        a(ActionMode.Callback callback) {
            this.f18235a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            d.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0242a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i7 = 0; i7 < d.this.f18219A.size(); i7++) {
                menu.add(0, i7, i7, (CharSequence) ((Map) d.this.f18219A.get(i7)).get("label"));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f18235a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ WebView f18241m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f18242n;

        b(WebView webView, String str) {
            this.f18241m = webView;
            this.f18242n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = d.this.f18229u;
            if (fVar == null) {
                return;
            }
            WebView webView = this.f18241m;
            WritableMap writableMapA = fVar.a(webView, webView.getUrl());
            writableMapA.putString("data", this.f18242n);
            d dVar = d.this;
            if (dVar.f18228t != null) {
                dVar.e(writableMapA);
            } else {
                dVar.g(this.f18241m, new a5.g(o.a(this.f18241m), writableMapA));
            }
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18244a = false;

        protected c() {
        }

        public boolean a() {
            return this.f18244a;
        }

        public void b(boolean z6) {
            this.f18244a = z6;
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.d$d, reason: collision with other inner class name */
    protected class C0243d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18245a = "RNCWebViewBridge";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f18246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f18247c;

        C0243d(d dVar) {
            this.f18246b = dVar;
        }

        public void a(String str) {
            this.f18247c = str;
        }

        @JavascriptInterface
        public String injectedObjectJson() {
            return this.f18247c;
        }

        @JavascriptInterface
        public void postMessage(String str) {
            if (this.f18246b.getMessagingEnabled()) {
                this.f18246b.i(str);
            } else {
                P0.a.G(this.f18245a, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public d(C0872e0 c0872e0) {
        super(c0872e0);
        this.f18224p = true;
        this.f18225q = true;
        this.f18226r = false;
        this.f18230v = false;
        this.f18232x = false;
        this.f18233y = false;
        this.f18228t = (RNCWebViewMessagingModule) ((C0872e0) getContext()).b().getJSModule(RNCWebViewMessagingModule.class);
        this.f18234z = new c();
    }

    public void a() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f18221m) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f18221m + ";\n})();");
    }

    public void b() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f18222n) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f18222n + ";\n})();");
    }

    protected void c() {
        setWebViewClient(null);
        destroy();
    }

    protected C0243d d(d dVar) {
        if (this.f18223o == null) {
            C0243d c0243d = new C0243d(dVar);
            this.f18223o = c0243d;
            addJavascriptInterface(c0243d, "ReactNativeWebView");
        }
        return this.f18223o;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.f18220B;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    protected void e(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f18227s);
        this.f18228t.onMessage(writableNativeMap);
    }

    protected boolean f(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f18227s);
        this.f18228t.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    protected void g(WebView webView, com.facebook.react.uimanager.events.d dVar) {
        AbstractC0884k0.c(getThemedReactContext(), o.a(webView)).c(dVar);
    }

    public boolean getMessagingEnabled() {
        return this.f18226r;
    }

    public f getRNCWebViewClient() {
        return this.f18229u;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().b();
    }

    public C0872e0 getThemedReactContext() {
        return (C0872e0) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f18220B;
    }

    protected void h(String str) {
        evaluateJavascript(str, null);
    }

    public void i(String str) {
        getThemedReactContext();
        if (this.f18229u != null) {
            post(new b(this, str));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str);
        if (this.f18228t != null) {
            e(writableMapCreateMap);
        } else {
            g(this, new a5.g(o.a(this), writableMapCreateMap));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        if (this.f18232x) {
            if (this.f18231w == null) {
                this.f18231w = new K2.b();
            }
            if (this.f18231w.c(i7, i8)) {
                g(this, com.facebook.react.views.scroll.g.e(o.a(this), com.facebook.react.views.scroll.h.f12991p, i7, i8, this.f18231w.a(), this.f18231w.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (this.f18230v) {
            g(this, new com.facebook.react.uimanager.events.c(o.a(this), i7, i8));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18233y) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
        this.f18229u.c(aVar);
    }

    public void setHasScrollEvent(boolean z6) {
        this.f18232x = z6;
    }

    public void setIgnoreErrFailedForThisURL(String str) {
        this.f18229u.d(str);
    }

    public void setInjectedJavaScriptObject(String str) {
        if (getSettings().getJavaScriptEnabled()) {
            d(this).a(str);
        }
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f18219A = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z6) {
        if (this.f18226r == z6) {
            return;
        }
        this.f18226r = z6;
        if (z6) {
            d(this);
        }
    }

    public void setNestedScrollEnabled(boolean z6) {
        this.f18233y = z6;
    }

    public void setSendContentSizeChangeEvents(boolean z6) {
        this.f18230v = z6;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f18220B = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof com.reactnativecommunity.webview.c) {
            ((com.reactnativecommunity.webview.c) webChromeClient).h(this.f18234z);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof f) {
            f fVar = (f) webViewClient;
            this.f18229u = fVar;
            fVar.e(this.f18234z);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        return this.f18219A == null ? super.startActionMode(callback, i7) : super.startActionMode(new a(callback), i7);
    }
}
