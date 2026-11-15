package com.facebook.react.runtime;

import X1.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b2.InterfaceC0675a;
import c2.InterfaceC0711a;
import com.facebook.react.ComponentCallbacks2C0827j;
import com.facebook.react.EnumC0826i;
import com.facebook.react.InterfaceC0917y;
import com.facebook.react.InterfaceC0918z;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.C0835a;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerModule;
import e2.C1619a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m2.InterfaceC1871b;
import u2.C2131f;
import u2.C2132g;
import u2.InterfaceC2126a;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public class ReactHostImpl implements InterfaceC0917y {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final AtomicInteger f12079C = new AtomicInteger(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private C2131f f12080A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private C2131f f12081B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0841g f12083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentFactory f12084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X1.e f12085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f12086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f12087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QueueThreadExceptionHandler f12088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f12089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ComponentCallbacks2C0827j f12090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f12092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Collection f12093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0835a f12094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ReactInstance f12095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C0835a f12096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicReference f12097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicReference f12098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C0838d f12099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c0 f12100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f12101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private EnumC0826i f12102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MemoryPressureListener f12103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private InterfaceC1871b f12104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f12105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ReactHostInspectorTarget f12106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C2131f f12107z;

    class a implements e.a {
        a() {
        }

        @Override // X1.e.a
        public void a() {
            UiThreadUtil.assertOnUiThread();
            if (ReactHostImpl.this.f12106y != null) {
                ReactHostImpl.this.f12106y.sendDebuggerResumeCommand();
            }
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ReactInstance f12109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReactContext f12110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f12111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactInstance f12112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0837c f12113e;

        b(ReactInstance reactInstance, C0837c c0837c) {
            this.f12112d = reactInstance;
            this.f12113e = c0837c;
            this.f12109a = reactInstance;
            this.f12110b = c0837c;
            this.f12111c = ReactHostImpl.this.f12080A != null;
        }
    }

    class c implements X1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.devsupport.B f12116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2132g f12117c;

        c(String str, com.facebook.react.devsupport.B b7, C2132g c2132g) {
            this.f12115a = str;
            this.f12116b = b7;
            this.f12117c = c2132g;
        }

        @Override // X1.a
        public void a() {
            ReactHostImpl.this.u1("loadJSBundleFromMetro()", "Creating BundleLoader");
            this.f12117c.d(JSBundleLoader.createCachedBundleFromNetworkLoader(this.f12115a, this.f12116b.k()));
        }

        @Override // X1.a
        public void b(Exception exc) {
            this.f12117c.c(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {
        void a(ReactInstance reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e {
        ReactInstance a(C2131f c2131f, String str);
    }

    public ReactHostImpl(Context context, InterfaceC0841g interfaceC0841g, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z6, boolean z7) {
        this.f12089h = Collections.synchronizedSet(new HashSet());
        this.f12093l = Collections.synchronizedList(new ArrayList());
        this.f12094m = new C0835a(C2131f.m(null));
        this.f12096o = new C0835a();
        this.f12097p = new AtomicReference();
        this.f12098q = new AtomicReference(new WeakReference(null));
        C0838d c0838d = new C0838d(false);
        this.f12099r = c0838d;
        this.f12100s = new c0(c0838d);
        this.f12101t = f12079C.getAndIncrement();
        this.f12102u = null;
        this.f12105x = Collections.synchronizedSet(new HashSet());
        this.f12107z = null;
        this.f12080A = null;
        this.f12081B = null;
        this.f12082a = context;
        this.f12083b = interfaceC0841g;
        this.f12084c = componentFactory;
        this.f12086e = executor;
        this.f12087f = executor2;
        this.f12088g = new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.j
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                this.f12195a.B0(exc);
            }
        };
        this.f12090i = new ComponentCallbacks2C0827j(context);
        this.f12091j = z6;
        this.f12092k = z7;
        if (z7) {
            this.f12085d = new C0836b(this, context, interfaceC0841g.g());
        } else {
            this.f12085d = new com.facebook.react.devsupport.f0();
        }
    }

    private void B1(Activity activity) {
        this.f12097p.set(activity);
        if (activity != null) {
            this.f12098q.set(new WeakReference(activity));
        }
    }

    private void D1(String str, ReactInstance reactInstance) {
        u1(str, "Restarting previously running React Native Surfaces");
        synchronized (this.f12089h) {
            try {
                Iterator it = this.f12089h.iterator();
                while (it.hasNext()) {
                    reactInstance.A((e0) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private C2131f E0() {
        t1("isMetroRunning()");
        final C2132g c2132g = new C2132g();
        f().u(new X1.g() { // from class: com.facebook.react.runtime.P
            @Override // X1.g
            public final void a(boolean z6) {
                this.f12074a.k1(c2132g, z6);
            }
        });
        return c2132g.a();
    }

    private void F1(String str, ReactInstance reactInstance) {
        u1(str, "Stopping all React Native surfaces");
        synchronized (this.f12089h) {
            try {
                for (e0 e0Var : this.f12089h) {
                    reactInstance.B(e0Var);
                    e0Var.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object G0(String str, d dVar, C2131f c2131f) {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance == null) {
            x1(str, "Execute: reactInstance is null. Dropping work.");
            return null;
        }
        dVar.a(reactInstance);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void H0(C2131f c2131f) {
        if (!c2131f.s()) {
            return null;
        }
        B0(c2131f.n());
        return null;
    }

    private void H1(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.f12106y;
                O1.a.b(reactHostInspectorTarget != null && reactHostInspectorTarget.isValid(), "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
        if (this.f12100s.a() == LifecycleState.f11399m) {
            e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2131f I1() {
        return J1(0, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean J0(String str, d dVar, C2131f c2131f) {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance == null) {
            x1(str, "Execute: reactInstance is null. Dropping work.");
            return Boolean.FALSE;
        }
        dVar.a(reactInstance);
        return Boolean.TRUE;
    }

    private C2131f J1(final int i7, final int i8) {
        if (this.f12080A != null) {
            u1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return this.f12080A;
        }
        if (this.f12081B != null) {
            if (i7 < i8) {
                u1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + i7 + ").");
                return this.f12081B.v(new InterfaceC2126a() { // from class: com.facebook.react.runtime.u
                    @Override // u2.InterfaceC2126a
                    public final Object a(C2131f c2131f) {
                        return this.f12218a.r1(i7, i8, c2131f);
                    }
                }, this.f12086e);
            }
            x1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.");
        }
        return w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K0(WeakReference weakReference, int i7) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.q(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(final WeakReference weakReference, final int i7) {
        this.f12086e.execute(new Runnable() { // from class: com.facebook.react.runtime.s
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.K0(weakReference, i7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance M0(String str, String str2, String str3, C2131f c2131f, String str4) {
        StringBuilder sb;
        String str5;
        String string;
        ReactInstance reactInstance = (ReactInstance) c2131f.o();
        ReactInstance reactInstance2 = this.f12095n;
        String str6 = "Stage: " + str4;
        String str7 = str + " reason: " + str2;
        if (c2131f.s()) {
            string = str + ": ReactInstance task faulted. " + str6 + ". " + ("Fault reason: " + c2131f.n().getMessage()) + ". " + str7;
        } else {
            if (c2131f.q()) {
                sb = new StringBuilder();
                sb.append(str);
                str5 = ": ReactInstance task cancelled. ";
            } else {
                if (reactInstance != null) {
                    if (reactInstance2 != null && reactInstance != reactInstance2) {
                        x1(str3, str + ": Detected two different ReactInstances. Returning old. " + str6 + ". " + str7);
                    }
                    return reactInstance;
                }
                sb = new StringBuilder();
                sb.append(str);
                str5 = ": ReactInstance task returned null. ";
            }
            sb.append(str5);
            sb.append(str6);
            sb.append(". ");
            sb.append(str7);
            string = sb.toString();
        }
        x1(str3, string);
        return reactInstance2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f N0(String str, Exception exc, C2131f c2131f) {
        return s0(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f O0(final String str, final Exception exc) {
        if (this.f12080A == null) {
            return s0(str, exc);
        }
        u1("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return this.f12080A.k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.i
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12192a.N0(str, exc, c2131f);
            }
        }, this.f12086e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0() {
        UiThreadUtil.assertOnUiThread();
        InterfaceC1871b interfaceC1871b = this.f12104w;
        if (interfaceC1871b != null) {
            interfaceC1871b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f Q0(C2131f c2131f) {
        return ((Boolean) c2131f.o()).booleanValue() ? s1() : C2131f.m(this.f12083b.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ JSBundleLoader R0() {
        return this.f12083b.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f S0(e eVar, String str, C2131f c2131f) {
        u1("getOrCreateDestroyTask()", "Starting React Native destruction");
        ReactInstance reactInstanceA = eVar.a(c2131f, "1: Starting destroy");
        H1(reactInstanceA);
        if (this.f12092k) {
            u1("getOrCreateDestroyTask()", "DevSupportManager cleanup");
            this.f12085d.m();
        }
        ReactContext reactContext = (ReactContext) this.f12096o.b();
        if (reactContext == null) {
            x1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        u1("getOrCreateDestroyTask()", "Move ReactHost to onHostDestroy()");
        this.f12100s.b(reactContext);
        return C2131f.m(reactInstanceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f T0(e eVar, C2131f c2131f) {
        ReactInstance reactInstanceA = eVar.a(c2131f, "2: Stopping surfaces");
        if (reactInstanceA == null) {
            x1("getOrCreateDestroyTask()", "Skipping surface shutdown: ReactInstance null");
            return c2131f;
        }
        F1("getOrCreateDestroyTask()", reactInstanceA);
        synchronized (this.f12089h) {
            this.f12089h.clear();
        }
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f U0(e eVar, C2131f c2131f) {
        HashSet hashSet;
        eVar.a(c2131f, "3: Executing Before Destroy Listeners");
        synchronized (this.f12105x) {
            hashSet = new HashSet(this.f12105x);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC2171a) it.next()).invoke();
        }
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f V0(e eVar, String str, C2131f c2131f) {
        eVar.a(c2131f, "4: Destroying ReactContext");
        ReactContext reactContext = (ReactContext) this.f12096o.b();
        if (reactContext == null) {
            x1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        u1("getOrCreateDestroyTask()", "Destroying MemoryPressureRouter");
        this.f12090i.b(this.f12082a);
        if (reactContext != null) {
            u1("getOrCreateDestroyTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        B1(null);
        J2.c.d().c();
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f W0(e eVar, C2131f c2131f) {
        ReactInstance reactInstanceA = eVar.a(c2131f, "5: Destroying ReactInstance");
        if (reactInstanceA == null) {
            x1("getOrCreateDestroyTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            u1("getOrCreateDestroyTask()", "Destroying ReactInstance");
            reactInstanceA.i();
        }
        u1("getOrCreateDestroyTask()", "Resetting ReactContext ref ");
        this.f12096o.d();
        u1("getOrCreateDestroyTask()", "Resetting ReactInstance task ref");
        this.f12094m.d();
        u1("getOrCreateDestroyTask()", "Resetting ReactInstance ptr");
        this.f12095n = null;
        u1("getOrCreateDestroyTask()", "Resetting Preload task ref");
        this.f12107z = null;
        u1("getOrCreateDestroyTask()", "Resetting destroy task ref");
        this.f12081B = null;
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void X0(String str, C2131f c2131f) {
        if (c2131f.s()) {
            y1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task faulted. Fault reason: " + c2131f.n().getMessage() + ". Destroy reason: " + str, c2131f.n());
        }
        if (!c2131f.q()) {
            return null;
        }
        x1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str);
        return null;
    }

    private C2131f Y(String str, final d dVar, Executor executor) {
        final String str2 = "callAfterGetOrCreateReactInstance(" + str + ")";
        if (executor == null) {
            executor = j0();
        }
        return v0().u(new InterfaceC2126a() { // from class: com.facebook.react.runtime.V
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12143a.G0(str2, dVar, c2131f);
            }
        }, executor).h(new InterfaceC2126a() { // from class: com.facebook.react.runtime.W
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12146a.H0(c2131f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0837c Y0() {
        u1("getOrCreateReactContext()", "Creating BridgelessReactContext");
        return new C0837c(this.f12082a, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z0() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    private C2131f a0(String str, final d dVar, Executor executor) {
        final String str2 = "callWithExistingReactInstance(" + str + ")";
        if (executor == null) {
            executor = j0();
        }
        return ((C2131f) this.f12094m.a()).u(new InterfaceC2126a() { // from class: com.facebook.react.runtime.k
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12196a.J0(str2, dVar, c2131f);
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b a1(C2131f c2131f) {
        JSBundleLoader jSBundleLoader = (JSBundleLoader) c2131f.o();
        C0837c c0837cT0 = t0();
        X1.e eVarF = f();
        c0837cT0.setJSExceptionHandler(eVarF);
        u1("getOrCreateReactInstanceTask()", "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(c0837cT0, this.f12083b, this.f12084c, eVarF, this.f12088g, this.f12092k, u0());
        this.f12095n = reactInstance;
        reactInstance.s();
        MemoryPressureListener memoryPressureListenerB0 = b0(reactInstance);
        this.f12103v = memoryPressureListenerB0;
        this.f12090i.a(memoryPressureListenerB0);
        u1("getOrCreateReactInstanceTask()", "Loading JS Bundle");
        reactInstance.x(jSBundleLoader);
        u1("getOrCreateReactInstanceTask()", "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
        eVarF.p(c0837cT0);
        c0837cT0.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.J
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.Z0();
            }
        });
        return new b(reactInstance, c0837cT0);
    }

    private MemoryPressureListener b0(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.N
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i7) {
                this.f12069a.L0(weakReference, i7);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance b1(C2131f c2131f) {
        ReactInstance reactInstance = ((b) c2131f.o()).f12109a;
        ReactContext reactContext = ((b) c2131f.o()).f12110b;
        boolean z6 = ((b) c2131f.o()).f12111c;
        boolean z7 = this.f12100s.a() == LifecycleState.f11401o;
        if (!z6 || z7) {
            this.f12100s.e(reactContext, g0());
        } else {
            this.f12100s.d(reactContext, g0());
        }
        InterfaceC0918z[] interfaceC0918zArr = (InterfaceC0918z[]) this.f12093l.toArray(new InterfaceC0918z[this.f12093l.size()]);
        u1("getOrCreateReactInstanceTask()", "Executing ReactInstanceEventListeners");
        for (InterfaceC0918z interfaceC0918z : interfaceC0918zArr) {
            if (interfaceC0918z != null) {
                interfaceC0918z.a(reactContext);
            }
        }
        return reactInstance;
    }

    private e c0(final String str, final String str2, final String str3) {
        return new e() { // from class: com.facebook.react.runtime.v
            @Override // com.facebook.react.runtime.ReactHostImpl.e
            public final ReactInstance a(C2131f c2131f, String str4) {
                return this.f12221a.M0(str, str3, str2, c2131f, str4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f c1() {
        u1("getOrCreateReactInstanceTask()", "Start");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        return n0().u(new InterfaceC2126a() { // from class: com.facebook.react.runtime.H
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12064a.a1(c2131f);
            }
        }, this.f12086e).u(new InterfaceC2126a() { // from class: com.facebook.react.runtime.I
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12065a.b1(c2131f);
            }
        }, this.f12087f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f d1(e eVar, String str, C2131f c2131f) {
        u1("getOrCreateReloadTask()", "Starting React Native reload");
        ReactInstance reactInstanceA = eVar.a(c2131f, "1: Starting reload");
        H1(reactInstanceA);
        ReactContext reactContext = (ReactContext) this.f12096o.b();
        if (reactContext == null) {
            x1("getOrCreateReloadTask()", "ReactContext is null. Reload reason: " + str);
        }
        if (reactContext != null && this.f12100s.a() == LifecycleState.f11401o) {
            u1("getOrCreateReloadTask()", "Calling ReactContext.onHostPause()");
            reactContext.onHostPause();
        }
        return C2131f.m(reactInstanceA);
    }

    private void e0() {
        ReactHostInspectorTarget reactHostInspectorTarget = this.f12106y;
        if (reactHostInspectorTarget != null) {
            reactHostInspectorTarget.close();
            this.f12106y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f e1(e eVar, C2131f c2131f) {
        ReactInstance reactInstanceA = eVar.a(c2131f, "2: Surface shutdown");
        if (reactInstanceA == null) {
            x1("getOrCreateReloadTask()", "Skipping surface shutdown: ReactInstance null");
            return c2131f;
        }
        F1("getOrCreateReloadTask()", reactInstanceA);
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f f1(e eVar, C2131f c2131f) {
        HashSet hashSet;
        eVar.a(c2131f, "3: Executing Before Destroy Listeners");
        synchronized (this.f12105x) {
            hashSet = new HashSet(this.f12105x);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC2171a) it.next()).invoke();
        }
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f g1(e eVar, C2131f c2131f) {
        eVar.a(c2131f, "4: Destroying ReactContext");
        if (this.f12103v != null) {
            u1("getOrCreateReloadTask()", "Removing memory pressure listener");
            this.f12090i.d(this.f12103v);
        }
        ReactContext reactContext = (ReactContext) this.f12096o.b();
        if (reactContext != null) {
            u1("getOrCreateReloadTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        if (this.f12092k && reactContext != null) {
            u1("getOrCreateReloadTask()", "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            this.f12085d.D(reactContext);
        }
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f h1(e eVar, C2131f c2131f) {
        ReactInstance reactInstanceA = eVar.a(c2131f, "5: Destroying ReactInstance");
        if (reactInstanceA == null) {
            x1("getOrCreateReloadTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            u1("getOrCreateReloadTask()", "Destroying ReactInstance");
            reactInstanceA.i();
        }
        u1("getOrCreateReloadTask()", "Resetting ReactContext ref");
        this.f12096o.d();
        u1("getOrCreateReloadTask()", "Resetting ReactInstance task ref");
        this.f12094m.d();
        u1("getOrCreateReloadTask()", "Resetting ReactInstance ptr");
        this.f12095n = null;
        u1("getOrCreateReloadTask()", "Resetting preload task ref");
        this.f12107z = null;
        return w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f i1(e eVar, C2131f c2131f) {
        ReactInstance reactInstanceA = eVar.a(c2131f, "7: Restarting surfaces");
        if (reactInstanceA == null) {
            x1("getOrCreateReloadTask()", "Skipping surface restart: ReactInstance null");
            return c2131f;
        }
        D1("getOrCreateReloadTask()", reactInstanceA);
        return c2131f;
    }

    private Executor j0() {
        return C1619a.e() ? C2131f.f22498i : this.f12086e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f j1(String str, C2131f c2131f) {
        if (c2131f.s()) {
            y1("getOrCreateReloadTask()", "Error during reload. ReactInstance task faulted. Fault reason: " + c2131f.n().getMessage() + ". Reload reason: " + str, c2131f.n());
        }
        if (c2131f.q()) {
            x1("getOrCreateReloadTask()", "Error during reload. ReactInstance task cancelled. Reload reason: " + str);
        }
        u1("getOrCreateReloadTask()", "Resetting reload task ref");
        this.f12080A = null;
        return c2131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(C2132g c2132g, boolean z6) {
        u1("isMetroRunning()", "Async result = " + z6);
        c2132g.d(Boolean.valueOf(z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(String str, int i7, String str2, Callback callback, ReactInstance reactInstance) {
        u1(str, "Execute");
        reactInstance.z(i7, str2);
        ((Callback) O1.a.c(callback)).invoke(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f m1(String str, C2131f c2131f) {
        return x0(str);
    }

    private C2131f n0() {
        t1("getJSBundleLoader()");
        return (this.f12092k && this.f12091j) ? E0().v(new InterfaceC2126a() { // from class: com.facebook.react.runtime.K
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12066a.Q0(c2131f);
            }
        }, this.f12086e) : C2131f.c(new Callable() { // from class: com.facebook.react.runtime.L
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12067a.R0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f n1(C2131f c2131f) {
        if (!c2131f.s()) {
            return c2131f;
        }
        Exception excN = c2131f.n();
        if (this.f12092k) {
            this.f12085d.handleException(excN);
        }
        this.f12083b.d(excN);
        return s0("Reload failed", excN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f o1(final String str) {
        C2131f c2131fX0;
        if (this.f12081B != null) {
            u1("reload()", "Waiting for destroy to finish, before reloading React Native.");
            c2131fX0 = this.f12081B.k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.w
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12225a.m1(str, c2131f);
                }
            }, this.f12086e);
        } else {
            c2131fX0 = x0(str);
        }
        return c2131fX0.t().k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.x
            @Override // u2.InterfaceC2126a
            public final Object a(C2131f c2131f) {
                return this.f12227a.n1(c2131f);
            }
        }, this.f12086e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(String str, e0 e0Var, ReactInstance reactInstance) {
        u1(str, "Execute");
        reactInstance.A(e0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(String str, e0 e0Var, ReactInstance reactInstance) {
        u1(str, "Execute");
        reactInstance.B(e0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2131f r1(int i7, int i8, C2131f c2131f) {
        return J1(i7 + 1, i8);
    }

    private C2131f s0(final String str, Exception exc) {
        t1("getOrCreateDestroyTask()");
        y1("getOrCreateDestroyTask()", str, exc);
        final e eVarC0 = c0("Destroy", "getOrCreateDestroyTask()", str);
        if (this.f12081B == null) {
            this.f12081B = ((C2131f) this.f12094m.a()).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.n
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12202a.S0(eVarC0, str, c2131f);
                }
            }, this.f12087f).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.o
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12205a.T0(eVarC0, c2131f);
                }
            }, this.f12086e).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.p
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12207a.U0(eVarC0, c2131f);
                }
            }, this.f12087f).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.q
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12209a.V0(eVarC0, str, c2131f);
                }
            }, this.f12087f).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.r
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12212a.W0(eVarC0, c2131f);
                }
            }, this.f12086e).h(new InterfaceC2126a() { // from class: com.facebook.react.runtime.t
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12216a.X0(str, c2131f);
                }
            });
        }
        return this.f12081B;
    }

    private C2131f s1() {
        t1("loadJSBundleFromMetro()");
        C2132g c2132g = new C2132g();
        com.facebook.react.devsupport.B b7 = (com.facebook.react.devsupport.B) f();
        String strQ = b7.k0().q((String) O1.a.c(b7.l0()));
        b7.L0(strQ, new c(strQ, b7, c2132g));
        return c2132g.a();
    }

    @R1.a
    private void setPausedInDebuggerMessage(String str) {
        if (str == null) {
            this.f12085d.g();
        } else {
            this.f12085d.i(str, new a());
        }
    }

    private C0837c t0() {
        return (C0837c) this.f12096o.c(new C0835a.InterfaceC0216a() { // from class: com.facebook.react.runtime.M
            @Override // com.facebook.react.runtime.C0835a.InterfaceC0216a
            public final Object get() {
                return this.f12068a.Y0();
            }
        });
    }

    private void t1(String str) {
        this.f12099r.a("ReactHost{" + this.f12101t + "}." + str);
    }

    private ReactHostInspectorTarget u0() {
        if (this.f12106y == null && InspectorFlags.getFuseboxEnabled()) {
            this.f12106y = new ReactHostInspectorTarget(this);
        }
        return this.f12106y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1(String str, String str2) {
        this.f12099r.a("ReactHost{" + this.f12101t + "}." + str + ": " + str2);
    }

    private C2131f v0() {
        return C2131f.d(new Callable() { // from class: com.facebook.react.runtime.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12201a.I1();
            }
        }, this.f12086e).j(new U());
    }

    private void v1(ReactContext reactContext) {
        this.f12100s.b(reactContext);
        if (reactContext == null) {
            e0();
        }
        B1(null);
    }

    private C2131f w0() {
        t1("getOrCreateReactInstanceTask()");
        return (C2131f) this.f12094m.c(new C0835a.InterfaceC0216a() { // from class: com.facebook.react.runtime.G
            @Override // com.facebook.react.runtime.C0835a.InterfaceC0216a
            public final Object get() {
                return this.f12063a.c1();
            }
        });
    }

    private C2131f x0(final String str) {
        t1("getOrCreateReloadTask()");
        x1("getOrCreateReloadTask()", str);
        final e eVarC0 = c0("Reload", "getOrCreateReloadTask()", str);
        if (this.f12080A == null) {
            this.f12080A = ((C2131f) this.f12094m.a()).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.y
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12228a.d1(eVarC0, str, c2131f);
                }
            }, this.f12087f).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.z
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12231a.e1(eVarC0, c2131f);
                }
            }, this.f12086e).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.A
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12047a.f1(eVarC0, c2131f);
                }
            }, this.f12087f).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.B
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12049a.g1(eVarC0, c2131f);
                }
            }, this.f12087f).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.C
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12052a.h1(eVarC0, c2131f);
                }
            }, this.f12086e).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.E
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12059a.i1(eVarC0, c2131f);
                }
            }, this.f12086e).k(new InterfaceC2126a() { // from class: com.facebook.react.runtime.F
                @Override // u2.InterfaceC2126a
                public final Object a(C2131f c2131f) {
                    return this.f12061a.j1(str, c2131f);
                }
            }, this.f12086e);
        }
        return this.f12080A;
    }

    private void x1(String str, String str2) {
        y1(str, str2, null);
    }

    private void y1(String str, String str2, Throwable th) {
        String str3 = "raiseSoftException(" + str + ")";
        u1(str3, str2);
        if (th != null) {
            ReactSoftExceptionLogger.logSoftException("ReactHost", new ReactNoCrashSoftException(str3 + ": " + str2, th));
            return;
        }
        ReactSoftExceptionLogger.logSoftException("ReactHost", new ReactNoCrashSoftException(str3 + ": " + str2));
    }

    FabricUIManager A0() {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance == null) {
            return null;
        }
        return reactInstance.p();
    }

    public InterfaceC0675a A1(final String str) {
        return C2131f.d(new Callable() { // from class: com.facebook.react.runtime.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12199a.o1(str);
            }
        }, this.f12086e).j(new U());
    }

    void B0(Exception exc) {
        String str = "handleHostException(message = \"" + exc.getMessage() + "\")";
        t1(str);
        if (this.f12092k) {
            this.f12085d.handleException(exc);
        }
        d0(str, exc);
        this.f12083b.d(exc);
    }

    boolean C0(Class cls) {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance != null) {
            return reactInstance.r(cls);
        }
        return false;
    }

    public void C1(EnumC0826i enumC0826i) {
        this.f12102u = enumC0826i;
    }

    boolean D0() {
        return this.f12095n != null;
    }

    InterfaceC0675a E1(final e0 e0Var) {
        final String str = "startSurface(surfaceId = " + e0Var.n() + ")";
        u1(str, "Schedule");
        X(e0Var);
        return Y(str, new d() { // from class: com.facebook.react.runtime.Q
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f12076a.p1(str, e0Var, reactInstance);
            }
        }, this.f12086e);
    }

    boolean F0(String str) {
        synchronized (this.f12089h) {
            try {
                Iterator it = this.f12089h.iterator();
                while (it.hasNext()) {
                    if (((e0) it.next()).j().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    InterfaceC0675a G1(final e0 e0Var) {
        final String str = "stopSurface(surfaceId = " + e0Var.n() + ")";
        u1(str, "Schedule");
        f0(e0Var);
        return a0(str, new d() { // from class: com.facebook.react.runtime.S
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f12137a.q1(str, e0Var, reactInstance);
            }
        }, this.f12086e).t();
    }

    void X(e0 e0Var) {
        t1("attachSurface(surfaceId = " + e0Var.n() + ")");
        synchronized (this.f12089h) {
            this.f12089h.add(e0Var);
        }
    }

    C2131f Z(final String str, final String str2, final NativeArray nativeArray) {
        return a0("callFunctionOnModule(\"" + str + "\", \"" + str2 + "\")", new d() { // from class: com.facebook.react.runtime.O
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                reactInstance.callFunctionOnModule(str, str2, nativeArray);
            }
        }, null);
    }

    @Override // com.facebook.react.InterfaceC0917y
    public InterfaceC0711a a(Context context, String str, Bundle bundle) {
        e0 e0Var = new e0(context, str, bundle);
        f0 f0Var = new f0(context, e0Var);
        f0Var.setShouldLogContentAppeared(true);
        e0Var.d(f0Var);
        e0Var.c(this);
        return e0Var;
    }

    @Override // com.facebook.react.InterfaceC0917y
    public void b(Activity activity, InterfaceC1871b interfaceC1871b) {
        this.f12104w = interfaceC1871b;
        w1(activity);
    }

    @Override // com.facebook.react.InterfaceC0917y
    public void c(Context context) {
        AppearanceModule appearanceModule;
        ReactContext reactContextH0 = h0();
        if (reactContextH0 == null || (appearanceModule = (AppearanceModule) reactContextH0.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    @Override // com.facebook.react.InterfaceC0917y
    public void d(Activity activity) {
        t1("onHostPause(activity)");
        ReactContext reactContextH0 = h0();
        Activity activityG0 = g0();
        if (activityG0 != null) {
            String simpleName = activityG0.getClass().getSimpleName();
            String simpleName2 = activity == null ? "null" : activity.getClass().getSimpleName();
            O1.a.b(activity == activityG0, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + simpleName2);
        }
        this.f12104w = null;
        this.f12100s.c(reactContextH0, activityG0);
    }

    public InterfaceC0675a d0(final String str, final Exception exc) {
        return C2131f.d(new Callable() { // from class: com.facebook.react.runtime.T
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12140a.O0(str, exc);
            }
        }, this.f12086e).j(new U());
    }

    @Override // com.facebook.react.InterfaceC0917y
    public void e(Activity activity) {
        t1("onHostDestroy(activity)");
        if (g0() == activity) {
            v1(h0());
        }
    }

    @Override // com.facebook.react.InterfaceC0917y
    public X1.e f() {
        return (X1.e) O1.a.c(this.f12085d);
    }

    void f0(e0 e0Var) {
        t1("detachSurface(surfaceId = " + e0Var.n() + ")");
        synchronized (this.f12089h) {
            this.f12089h.remove(e0Var);
        }
    }

    @Override // com.facebook.react.InterfaceC0917y
    public boolean g() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.l(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    Activity g0() {
        return (Activity) this.f12097p.get();
    }

    public ReactContext h0() {
        return (ReactContext) this.f12096o.b();
    }

    InterfaceC1871b i0() {
        return new InterfaceC1871b() { // from class: com.facebook.react.runtime.h
            @Override // m2.InterfaceC1871b
            public final void c() {
                this.f12190m.P0();
            }
        };
    }

    com.facebook.react.uimanager.events.e k0() {
        ReactInstance reactInstance = this.f12095n;
        return reactInstance == null ? com.facebook.react.uimanager.events.b.j() : reactInstance.j();
    }

    CallInvokerHolder l0() {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        x1("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready");
        return null;
    }

    JavaScriptContextHolder m0() {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance != null) {
            return reactInstance.k();
        }
        return null;
    }

    Activity o0() {
        WeakReference weakReference = (WeakReference) this.f12098q.get();
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Override // com.facebook.react.InterfaceC0917y
    public void onActivityResult(Activity activity, int i7, int i8, Intent intent) {
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + i7 + "\", resultCode = \"" + i8 + "\", data = \"" + intent + "\")";
        ReactContext reactContextH0 = h0();
        if (reactContextH0 != null) {
            reactContextH0.onActivityResult(activity, i7, i8, intent);
        } else {
            x1(str, "Tried to access onActivityResult while context is not ready");
        }
    }

    @Override // com.facebook.react.InterfaceC0917y
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        String str = "onNewIntent(intent = \"" + intent + "\")";
        ReactContext reactContextH0 = h0();
        if (reactContextH0 == null) {
            x1(str, "Tried to access onNewIntent while context is not ready");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextH0.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextH0.onNewIntent(g0(), intent);
    }

    @Override // com.facebook.react.InterfaceC0917y
    public void onWindowFocusChange(boolean z6) {
        String str = "onWindowFocusChange(hasFocus = \"" + z6 + "\")";
        ReactContext reactContextH0 = h0();
        if (reactContextH0 != null) {
            reactContextH0.onWindowFocusChange(z6);
        } else {
            x1(str, "Tried to access onWindowFocusChange while context is not ready");
        }
    }

    NativeModule p0(Class cls) {
        if (cls == UIManagerModule.class) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose("ReactHost", new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance != null) {
            return reactInstance.l(cls);
        }
        return null;
    }

    NativeModule q0(String str) {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance != null) {
            return reactInstance.m(str);
        }
        return null;
    }

    Collection r0() {
        ReactInstance reactInstance = this.f12095n;
        return reactInstance != null ? reactInstance.n() : new ArrayList();
    }

    public void w1(Activity activity) {
        t1("onHostResume(activity)");
        B1(activity);
        this.f12100s.d(h0(), g0());
    }

    public ReactQueueConfiguration y0() {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance != null) {
            return reactInstance.o();
        }
        return null;
    }

    RuntimeExecutor z0() {
        ReactInstance reactInstance = this.f12095n;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        x1("getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready");
        return null;
    }

    C2131f z1(final int i7, final String str, final Callback callback) {
        final String str2 = "registerSegment(segmentId = \"" + i7 + "\", path = \"" + str + "\")";
        u1(str2, "Schedule");
        return a0(str2, new d() { // from class: com.facebook.react.runtime.D
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f12054a.l1(str2, i7, str, callback, reactInstance);
            }
        }, null);
    }

    public ReactHostImpl(Context context, InterfaceC0841g interfaceC0841g, ComponentFactory componentFactory, boolean z6, boolean z7) {
        this(context, interfaceC0841g, componentFactory, Executors.newSingleThreadExecutor(), C2131f.f22499j, z6, z7);
    }
}
