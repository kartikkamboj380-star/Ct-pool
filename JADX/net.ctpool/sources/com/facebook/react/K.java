package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C0801e;
import com.facebook.react.jscexecutor.JSCExecutor;
import g2.C1692a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m2.InterfaceC1871b;
import q2.AbstractC1988a;

/* JADX INFO: loaded from: classes.dex */
public class K {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f11096B = "K";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSBundleLoader f11100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f11101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f11102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Application f11103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.facebook.react.devsupport.F f11105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LifecycleState f11108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSExceptionHandler f11109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Activity f11110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC1871b f11111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private X1.b f11113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JavaScriptExecutorFactory f11114q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private UIManagerProvider f11117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map f11118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private T.a f11119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private S1.j f11120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private X1.c f11121x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11098a = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11115r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11116s = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private EnumC0826i f11122y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d2.b f11123z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private X1.h f11097A = null;

    K() {
    }

    private JavaScriptExecutorFactory c(String str, String str2, Context context) {
        H.K(context);
        EnumC0826i enumC0826i = this.f11122y;
        if (enumC0826i != null) {
            if (enumC0826i == EnumC0826i.f11781n) {
                HermesExecutor.a();
                return new com.facebook.hermes.reactexecutor.a();
            }
            JSCExecutor.b();
            return new C1692a(str, str2);
        }
        try {
            try {
                HermesExecutor.a();
                return new com.facebook.hermes.reactexecutor.a();
            } catch (UnsatisfiedLinkError unused) {
                JSCExecutor.b();
                return new C1692a(str, str2);
            }
        } catch (UnsatisfiedLinkError e7) {
            P0.a.j(f11096B, "Unable to load neither the Hermes nor the JSC native library. Your application is not built correctly and will fail to execute");
            if (e7.getMessage().contains("__cxa_bad_typeid")) {
                throw e7;
            }
            return null;
        }
    }

    public K a(M m7) {
        this.f11098a.add(m7);
        return this;
    }

    public H b() {
        String str;
        O1.a.d(this.f11103f, "Application property has not been set with this builder");
        if (this.f11108k == LifecycleState.f11401o) {
            O1.a.d(this.f11110m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z6 = true;
        O1.a.b((!this.f11104g && this.f11099b == null && this.f11100c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f11101d == null && this.f11099b == null && this.f11100c == null) {
            z6 = false;
        }
        O1.a.b(z6, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = this.f11103f.getPackageName();
        String strD = AbstractC1988a.d();
        Application application = this.f11103f;
        Activity activity = this.f11110m;
        InterfaceC1871b interfaceC1871b = this.f11111n;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f11114q;
        JavaScriptExecutorFactory javaScriptExecutorFactoryC = javaScriptExecutorFactory == null ? c(packageName, strD, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader jSBundleLoaderCreateAssetLoader = this.f11100c;
        if (jSBundleLoaderCreateAssetLoader == null && (str = this.f11099b) != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(this.f11103f, str, false);
        }
        JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
        String str2 = this.f11101d;
        List list = this.f11098a;
        boolean z7 = this.f11104g;
        com.facebook.react.devsupport.F c0801e = this.f11105h;
        if (c0801e == null) {
            c0801e = new C0801e();
        }
        return new H(application, activity, interfaceC1871b, javaScriptExecutorFactoryC, jSBundleLoader, str2, list, z7, c0801e, this.f11106i, this.f11107j, this.f11102e, (LifecycleState) O1.a.d(this.f11108k, "Initial lifecycle state was not set"), this.f11109l, null, this.f11112o, this.f11113p, this.f11115r, this.f11116s, this.f11117t, this.f11118u, this.f11119v, this.f11120w, this.f11121x, this.f11123z, this.f11097A);
    }

    public K d(Application application) {
        this.f11103f = application;
        return this;
    }

    public K e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f11099b = str2;
        this.f11100c = null;
        return this;
    }

    public K f(d2.b bVar) {
        this.f11123z = bVar;
        return this;
    }

    public K g(X1.c cVar) {
        this.f11121x = cVar;
        return this;
    }

    public K h(com.facebook.react.devsupport.F f7) {
        this.f11105h = f7;
        return this;
    }

    public K i(LifecycleState lifecycleState) {
        this.f11108k = lifecycleState;
        return this;
    }

    public K j(String str) {
        if (!str.startsWith("assets://")) {
            return k(JSBundleLoader.createFileLoader(str));
        }
        this.f11099b = str;
        this.f11100c = null;
        return this;
    }

    public K k(JSBundleLoader jSBundleLoader) {
        this.f11100c = jSBundleLoader;
        this.f11099b = null;
        return this;
    }

    public K l(EnumC0826i enumC0826i) {
        this.f11122y = enumC0826i;
        return this;
    }

    public K m(JSExceptionHandler jSExceptionHandler) {
        this.f11109l = jSExceptionHandler;
        return this;
    }

    public K n(String str) {
        this.f11101d = str;
        return this;
    }

    public K o(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f11114q = javaScriptExecutorFactory;
        return this;
    }

    public K p(boolean z6) {
        this.f11112o = z6;
        return this;
    }

    public K q(X1.h hVar) {
        this.f11097A = hVar;
        return this;
    }

    public K r(T.a aVar) {
        this.f11119v = aVar;
        return this;
    }

    public K t(boolean z6) {
        this.f11106i = z6;
        return this;
    }

    public K u(S1.j jVar) {
        this.f11120w = jVar;
        return this;
    }

    public K v(UIManagerProvider uIManagerProvider) {
        this.f11117t = uIManagerProvider;
        return this;
    }

    public K w(boolean z6) {
        this.f11104g = z6;
        return this;
    }

    public K s(X1.i iVar) {
        return this;
    }
}
