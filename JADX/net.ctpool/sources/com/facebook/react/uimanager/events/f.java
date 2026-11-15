package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.core.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class f implements e, LifecycleEventListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final Comparator f12500C = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ReactApplicationContext f12505o;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile ReactEventEmitter f12516z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f12503m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f12504n = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final LongSparseArray f12506p = new LongSparseArray();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f12507q = S1.f.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f12508r = new c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f12509s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CopyOnWriteArrayList f12510t = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final CopyOnWriteArrayList f12511u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d f12512v = new d();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicInteger f12513w = new AtomicInteger();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.facebook.react.uimanager.events.d[] f12514x = new com.facebook.react.uimanager.events.d[16];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f12515y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private short f12501A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile boolean f12502B = false;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.facebook.react.uimanager.events.d dVar, com.facebook.react.uimanager.events.d dVar2) {
            if (dVar == null && dVar2 == null) {
                return 0;
            }
            if (dVar == null) {
                return -1;
            }
            if (dVar2 == null) {
                return 1;
            }
            long timestampMs = dVar.getTimestampMs() - dVar2.getTimestampMs();
            if (timestampMs == 0) {
                return 0;
            }
            return timestampMs < 0 ? -1 : 1;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.F();
        }
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P2.a.c(0L, "DispatchEventsRunnable");
            try {
                P2.a.d(0L, "ScheduleDispatchFrameCallback", f.this.f12513w.getAndIncrement());
                f.this.f12502B = false;
                O1.a.c(f.this.f12516z);
                synchronized (f.this.f12504n) {
                    try {
                        if (f.this.f12515y > 0) {
                            if (f.this.f12515y > 1) {
                                Arrays.sort(f.this.f12514x, 0, f.this.f12515y, f.f12500C);
                            }
                            for (int i7 = 0; i7 < f.this.f12515y; i7++) {
                                com.facebook.react.uimanager.events.d dVar = f.this.f12514x[i7];
                                if (dVar != null) {
                                    P2.a.d(0L, dVar.getEventName(), dVar.getUniqueID());
                                    dVar.dispatchModern(f.this.f12516z);
                                    dVar.dispose();
                                }
                            }
                            f.this.A();
                            f.this.f12506p.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = f.this.f12511u.iterator();
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).a();
                }
            } finally {
                P2.a.g(0L);
            }
        }
    }

    private class d implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f12519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12520b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.a();
            }
        }

        private d() {
            this.f12519a = false;
            this.f12520b = false;
        }

        private void c() {
            if (ReactFeatureFlags.enableFabricRendererExclusively) {
                return;
            }
            com.facebook.react.modules.core.a.h().m(a.b.TIMERS_EVENTS, f.this.f12512v);
        }

        public void a() {
            if (this.f12519a) {
                return;
            }
            this.f12519a = true;
            c();
        }

        public void b() {
            if (this.f12519a) {
                return;
            }
            if (f.this.f12505o.isOnUiQueueThread()) {
                a();
            } else {
                f.this.f12505o.runOnUiQueueThread(new a());
            }
        }

        public void d() {
            this.f12520b = true;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            UiThreadUtil.assertOnUiThread();
            if (this.f12520b) {
                this.f12519a = false;
            } else {
                c();
            }
            P2.a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                f.this.E();
                if (!f.this.f12502B) {
                    f.this.f12502B = true;
                    P2.a.j(0L, "ScheduleDispatchFrameCallback", f.this.f12513w.get());
                    f.this.f12505o.runOnJSQueueThread(f.this.f12508r);
                }
            } finally {
                P2.a.g(0L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(ReactApplicationContext reactApplicationContext) {
        this.f12505o = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f12516z = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        Arrays.fill(this.f12514x, 0, this.f12515y, (Object) null);
        this.f12515y = 0;
    }

    private long B(int i7, String str, short s6) {
        short sShortValue;
        Short sh = (Short) this.f12507q.get(str);
        if (sh != null) {
            sShortValue = sh.shortValue();
        } else {
            short s7 = this.f12501A;
            this.f12501A = (short) (s7 + 1);
            this.f12507q.put(str, Short.valueOf(s7));
            sShortValue = s7;
        }
        return C(i7, sShortValue, s6);
    }

    private static long C(int i7, short s6, short s7) {
        return ((((long) s6) & 65535) << 32) | ((long) i7) | ((((long) s7) & 65535) << 48);
    }

    private void D() {
        if (this.f12516z != null) {
            this.f12512v.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        synchronized (this.f12503m) {
            synchronized (this.f12504n) {
                for (int i7 = 0; i7 < this.f12509s.size(); i7++) {
                    try {
                        com.facebook.react.uimanager.events.d dVar = (com.facebook.react.uimanager.events.d) this.f12509s.get(i7);
                        if (dVar.canCoalesce()) {
                            long jB = B(dVar.getViewTag(), dVar.getEventName(), dVar.getCoalescingKey());
                            Integer num = (Integer) this.f12506p.get(jB);
                            com.facebook.react.uimanager.events.d dVar2 = null;
                            if (num == null) {
                                this.f12506p.put(jB, Integer.valueOf(this.f12515y));
                            } else {
                                com.facebook.react.uimanager.events.d dVar3 = this.f12514x[num.intValue()];
                                com.facebook.react.uimanager.events.d dVarCoalesce = dVar.coalesce(dVar3);
                                if (dVarCoalesce != dVar3) {
                                    this.f12506p.put(jB, Integer.valueOf(this.f12515y));
                                    this.f12514x[num.intValue()] = null;
                                    dVar2 = dVar3;
                                    dVar = dVarCoalesce;
                                } else {
                                    dVar2 = dVar;
                                    dVar = null;
                                }
                            }
                            if (dVar != null) {
                                z(dVar);
                            }
                            if (dVar2 != null) {
                                dVar2.dispose();
                            }
                        } else {
                            z(dVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f12509s.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        UiThreadUtil.assertOnUiThread();
        this.f12512v.d();
    }

    private void z(com.facebook.react.uimanager.events.d dVar) {
        int i7 = this.f12515y;
        com.facebook.react.uimanager.events.d[] dVarArr = this.f12514x;
        if (i7 == dVarArr.length) {
            this.f12514x = (com.facebook.react.uimanager.events.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        com.facebook.react.uimanager.events.d[] dVarArr2 = this.f12514x;
        int i8 = this.f12515y;
        this.f12515y = i8 + 1;
        dVarArr2[i8] = dVar;
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(int i7, RCTEventEmitter rCTEventEmitter) {
        this.f12516z.register(i7, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void b(i iVar) {
        this.f12510t.add(iVar);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void c(com.facebook.react.uimanager.events.d dVar) {
        O1.a.b(dVar.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator it = this.f12510t.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(dVar);
        }
        synchronized (this.f12503m) {
            this.f12509s.add(dVar);
            P2.a.j(0L, dVar.getEventName(), dVar.getUniqueID());
        }
        D();
    }

    @Override // com.facebook.react.uimanager.events.e
    public void d() {
        D();
    }

    @Override // com.facebook.react.uimanager.events.e
    public void e(com.facebook.react.uimanager.events.a aVar) {
        this.f12511u.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void f(com.facebook.react.uimanager.events.a aVar) {
        this.f12511u.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void g() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.uimanager.events.e
    public void h(int i7, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f12516z.register(i7, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void i(int i7) {
        this.f12516z.unregister(i7);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        D();
    }
}
