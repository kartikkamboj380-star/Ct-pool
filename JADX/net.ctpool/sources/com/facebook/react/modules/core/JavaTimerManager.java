package com.facebook.react.modules.core;

import S1.k;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.a;
import h2.C1708c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.InterfaceC1872c;

/* JADX INFO: loaded from: classes.dex */
public class JavaTimerManager implements LifecycleEventListener, h2.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReactApplicationContext f11813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1872c f11814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.facebook.react.modules.core.a f11815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final X1.e f11816p;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private c f11825y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f11817q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f11818r = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicBoolean f11821u = new AtomicBoolean(true);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f11822v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f f11823w = new f();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final d f11824x = new d();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11826z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f11811A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f11812B = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final PriorityQueue f11819s = new PriorityQueue(11, new a());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SparseArray f11820t = new SparseArray();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            long j7 = eVar.f11837d - eVar2.f11837d;
            if (j7 == 0) {
                return 0;
            }
            return j7 < 0 ? -1 : 1;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f11828m;

        b(boolean z6) {
            this.f11828m = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (JavaTimerManager.this.f11818r) {
                try {
                    if (this.f11828m) {
                        JavaTimerManager.this.z();
                    } else {
                        JavaTimerManager.this.q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private class c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private volatile boolean f11830m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f11831n;

        public c(long j7) {
            this.f11831n = j7;
        }

        public void a() {
            this.f11830m = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            if (this.f11830m) {
                return;
            }
            long jC = k.c() - (this.f11831n / 1000000);
            long jA = k.a() - jC;
            if (16.666666f - jC < 1.0f) {
                return;
            }
            synchronized (JavaTimerManager.this.f11818r) {
                z6 = JavaTimerManager.this.f11812B;
            }
            if (z6) {
                JavaTimerManager.this.f11814n.callIdleCallbacks(jA);
            }
            JavaTimerManager.this.f11825y = null;
        }
    }

    private class d implements Choreographer.FrameCallback {
        private d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            if (!JavaTimerManager.this.f11821u.get() || JavaTimerManager.this.f11822v.get()) {
                c cVar = JavaTimerManager.this.f11825y;
                if (cVar != null) {
                    cVar.a();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.f11825y = javaTimerManager.new c(j7);
                JavaTimerManager.this.f11813m.runOnJSQueueThread(JavaTimerManager.this.f11825y);
                JavaTimerManager.this.f11815o.m(a.b.IDLE_EVENT, this);
            }
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f11836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f11837d;

        private e(int i7, long j7, int i8, boolean z6) {
            this.f11834a = i7;
            this.f11837d = j7;
            this.f11836c = i8;
            this.f11835b = z6;
        }
    }

    private class f implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WritableArray f11838a;

        private f() {
            this.f11838a = null;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            if (!JavaTimerManager.this.f11821u.get() || JavaTimerManager.this.f11822v.get()) {
                long j8 = j7 / 1000000;
                synchronized (JavaTimerManager.this.f11817q) {
                    while (!JavaTimerManager.this.f11819s.isEmpty() && ((e) JavaTimerManager.this.f11819s.peek()).f11837d < j8) {
                        try {
                            e eVar = (e) JavaTimerManager.this.f11819s.poll();
                            if (this.f11838a == null) {
                                this.f11838a = Arguments.createArray();
                            }
                            this.f11838a.pushInt(eVar.f11834a);
                            if (eVar.f11835b) {
                                eVar.f11837d = ((long) eVar.f11836c) + j8;
                                JavaTimerManager.this.f11819s.add(eVar);
                            } else {
                                JavaTimerManager.this.f11820t.remove(eVar.f11834a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (this.f11838a != null) {
                    JavaTimerManager.this.f11814n.callTimers(this.f11838a);
                    this.f11838a = null;
                }
                JavaTimerManager.this.f11815o.m(a.b.TIMERS_EVENTS, this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTimerManager(ReactApplicationContext reactApplicationContext, InterfaceC1872c interfaceC1872c, com.facebook.react.modules.core.a aVar, X1.e eVar) {
        this.f11813m = reactApplicationContext;
        this.f11814n = interfaceC1872c;
        this.f11815o = aVar;
        this.f11816p = eVar;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.f11811A) {
            this.f11815o.o(a.b.IDLE_EVENT, this.f11824x);
            this.f11811A = false;
        }
    }

    private void r() {
        C1708c c1708cF = C1708c.f(this.f11813m);
        if (this.f11826z && this.f11821u.get() && !c1708cF.g()) {
            this.f11815o.o(a.b.TIMERS_EVENTS, this.f11823w);
            this.f11826z = false;
        }
    }

    private static boolean u(e eVar, long j7) {
        return !eVar.f11835b && ((long) eVar.f11836c) < j7;
    }

    private void v() {
        if (!this.f11821u.get() || this.f11822v.get()) {
            return;
        }
        r();
    }

    private void w() {
        synchronized (this.f11818r) {
            try {
                if (this.f11812B) {
                    z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void y() {
        if (this.f11826z) {
            return;
        }
        this.f11815o.m(a.b.TIMERS_EVENTS, this.f11823w);
        this.f11826z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.f11811A) {
            return;
        }
        this.f11815o.m(a.b.IDLE_EVENT, this.f11824x);
        this.f11811A = true;
    }

    @Override // h2.d
    public void a(int i7) {
        if (C1708c.f(this.f11813m).g()) {
            return;
        }
        this.f11822v.set(false);
        r();
        v();
    }

    @Override // h2.d
    public void b(int i7) {
        if (this.f11822v.getAndSet(true)) {
            return;
        }
        y();
        w();
    }

    @R1.a
    public void createTimer(int i7, long j7, boolean z6) {
        e eVar = new e(i7, (k.b() / 1000000) + j7, (int) j7, z6);
        synchronized (this.f11817q) {
            this.f11819s.add(eVar);
            this.f11820t.put(i7, eVar);
        }
    }

    @R1.a
    public void deleteTimer(int i7) {
        synchronized (this.f11817q) {
            try {
                e eVar = (e) this.f11820t.get(i7);
                if (eVar == null) {
                    return;
                }
                this.f11820t.remove(i7);
                this.f11819s.remove(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        r();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f11821u.set(true);
        r();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.f11821u.set(false);
        y();
        w();
    }

    public void s(int i7, int i8, double d7, boolean z6) {
        long jA = k.a();
        long j7 = (long) d7;
        if (this.f11816p.n() && Math.abs(j7 - jA) > 60000) {
            this.f11814n.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j7 - jA) + ((long) i8));
        if (i8 != 0 || z6) {
            createTimer(i7, jMax, z6);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        this.f11814n.callTimers(writableArrayCreateArray);
    }

    @R1.a
    public void setSendIdleEvents(boolean z6) {
        synchronized (this.f11818r) {
            this.f11812B = z6;
        }
        UiThreadUtil.runOnUiThread(new b(z6));
    }

    boolean t(long j7) {
        synchronized (this.f11817q) {
            try {
                e eVar = (e) this.f11819s.peek();
                if (eVar == null) {
                    return false;
                }
                if (u(eVar, j7)) {
                    return true;
                }
                Iterator it = this.f11819s.iterator();
                while (it.hasNext()) {
                    if (u((e) it.next(), j7)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        this.f11813m.removeLifecycleEventListener(this);
        r();
        q();
    }
}
