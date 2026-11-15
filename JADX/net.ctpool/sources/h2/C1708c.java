package h2;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: h2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1708c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final WeakHashMap f19591g = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f19592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f19593b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f19594c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f19595d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f19596e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f19597f = new SparseArray();

    /* JADX INFO: renamed from: h2.c$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C1706a f19598m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f19599n;

        a(C1706a c1706a, int i7) {
            this.f19598m = c1706a;
            this.f19599n = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1708c.this.o(this.f19598m, this.f19599n);
        }
    }

    /* JADX INFO: renamed from: h2.c$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f19601m;

        b(int i7) {
            this.f19601m = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = C1708c.this.f19593b.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(this.f19601m);
            }
        }
    }

    private C1708c(ReactContext reactContext) {
        this.f19592a = new WeakReference(reactContext);
    }

    public static C1708c f(ReactContext reactContext) {
        WeakHashMap weakHashMap = f19591g;
        C1708c c1708c = (C1708c) weakHashMap.get(reactContext);
        if (c1708c != null) {
            return c1708c;
        }
        C1708c c1708c2 = new C1708c(reactContext);
        weakHashMap.put(reactContext, c1708c2);
        return c1708c2;
    }

    private void k(int i7) {
        Runnable runnable = (Runnable) this.f19597f.get(i7);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.f19597f.remove(i7);
        }
    }

    private void m(final int i7, long j7) {
        Runnable runnable = new Runnable() { // from class: h2.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f19589m.i(i7);
            }
        };
        this.f19597f.append(i7, runnable);
        UiThreadUtil.runOnUiThread(runnable, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(C1706a c1706a, int i7) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) O1.a.d((ReactContext) this.f19592a.get(), "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.f11401o && !c1706a.e()) {
                throw new IllegalStateException("Tried to start task " + c1706a.c() + " while in foreground, but this is not allowed.");
            }
            this.f19595d.add(Integer.valueOf(i7));
            this.f19596e.put(Integer.valueOf(i7), new C1706a(c1706a));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i7, c1706a.c(), c1706a.a());
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            if (c1706a.d() > 0) {
                m(i7, c1706a.d());
            }
            Iterator it = this.f19593b.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(i7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(d dVar) {
        this.f19593b.add(dVar);
        Iterator it = this.f19595d.iterator();
        while (it.hasNext()) {
            dVar.b(((Integer) it.next()).intValue());
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized void i(int i7) {
        boolean zRemove = this.f19595d.remove(Integer.valueOf(i7));
        this.f19596e.remove(Integer.valueOf(i7));
        k(i7);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new b(i7));
        }
    }

    public boolean g() {
        return this.f19595d.size() > 0;
    }

    public synchronized boolean h(int i7) {
        return this.f19595d.contains(Integer.valueOf(i7));
    }

    public void j(d dVar) {
        this.f19593b.remove(dVar);
    }

    public synchronized boolean l(int i7) {
        C1706a c1706a = (C1706a) this.f19596e.get(Integer.valueOf(i7));
        O1.a.b(c1706a != null, "Tried to retrieve non-existent task config with id " + i7 + ".");
        e eVarB = c1706a.b();
        if (!eVarB.a()) {
            return false;
        }
        k(i7);
        UiThreadUtil.runOnUiThread(new a(new C1706a(c1706a.c(), c1706a.a(), c1706a.d(), c1706a.e(), eVarB.c()), i7), eVarB.b());
        return true;
    }

    public synchronized int n(C1706a c1706a) {
        int iIncrementAndGet;
        iIncrementAndGet = this.f19594c.incrementAndGet();
        o(c1706a, iIncrementAndGet);
        return iIncrementAndGet;
    }
}
