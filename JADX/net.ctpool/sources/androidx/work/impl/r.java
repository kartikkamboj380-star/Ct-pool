package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public class r implements InterfaceC0665e, androidx.work.impl.foreground.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f9456y = l0.i.i("Processor");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f9458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.work.a f9459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC2034b f9460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WorkDatabase f9461q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f9465u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map f9463s = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f9462r = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Set f9466v = new HashSet();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f9467w = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PowerManager.WakeLock f9457m = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Object f9468x = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map f9464t = new HashMap();

    private static class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private InterfaceC0665e f9469m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final q0.m f9470n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private X3.d f9471o;

        a(InterfaceC0665e interfaceC0665e, q0.m mVar, X3.d dVar) {
            this.f9469m = interfaceC0665e;
            this.f9470n = mVar;
            this.f9471o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f9471o.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f9469m.l(this.f9470n, zBooleanValue);
        }
    }

    public r(Context context, androidx.work.a aVar, InterfaceC2034b interfaceC2034b, WorkDatabase workDatabase, List list) {
        this.f9458n = context;
        this.f9459o = aVar;
        this.f9460p = interfaceC2034b;
        this.f9461q = workDatabase;
        this.f9465u = list;
    }

    private static boolean i(String str, K k7) {
        if (k7 == null) {
            l0.i.e().a(f9456y, "WorkerWrapper could not be found for " + str);
            return false;
        }
        k7.g();
        l0.i.e().a(f9456y, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ q0.u m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f9461q.k().b(str));
        return this.f9461q.j().q(str);
    }

    private void o(final q0.m mVar, final boolean z6) {
        this.f9460p.a().execute(new Runnable() { // from class: androidx.work.impl.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f9453m.l(mVar, z6);
            }
        });
    }

    private void s() {
        synchronized (this.f9468x) {
            try {
                if (!(!this.f9462r.isEmpty())) {
                    try {
                        this.f9458n.startService(androidx.work.impl.foreground.b.g(this.f9458n));
                    } catch (Throwable th) {
                        l0.i.e().d(f9456y, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f9457m;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f9457m = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC0665e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void l(q0.m mVar, boolean z6) {
        synchronized (this.f9468x) {
            try {
                K k7 = (K) this.f9463s.get(mVar.b());
                if (k7 != null && mVar.equals(k7.d())) {
                    this.f9463s.remove(mVar.b());
                }
                l0.i.e().a(f9456y, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z6);
                Iterator it = this.f9467w.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0665e) it.next()).l(mVar, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void b(String str, l0.e eVar) {
        synchronized (this.f9468x) {
            try {
                l0.i.e().f(f9456y, "Moving WorkSpec (" + str + ") to the foreground");
                K k7 = (K) this.f9463s.remove(str);
                if (k7 != null) {
                    if (this.f9457m == null) {
                        PowerManager.WakeLock wakeLockB = r0.x.b(this.f9458n, "ProcessorForegroundLck");
                        this.f9457m = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f9462r.put(str, k7);
                    androidx.core.content.b.n(this.f9458n, androidx.work.impl.foreground.b.e(this.f9458n, k7.d(), eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void c(String str) {
        synchronized (this.f9468x) {
            this.f9462r.remove(str);
            s();
        }
    }

    @Override // androidx.work.impl.foreground.a
    public boolean d(String str) {
        boolean zContainsKey;
        synchronized (this.f9468x) {
            zContainsKey = this.f9462r.containsKey(str);
        }
        return zContainsKey;
    }

    public void g(InterfaceC0665e interfaceC0665e) {
        synchronized (this.f9468x) {
            this.f9467w.add(interfaceC0665e);
        }
    }

    public q0.u h(String str) {
        synchronized (this.f9468x) {
            try {
                K k7 = (K) this.f9462r.get(str);
                if (k7 == null) {
                    k7 = (K) this.f9463s.get(str);
                }
                if (k7 == null) {
                    return null;
                }
                return k7.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f9468x) {
            zContains = this.f9466v.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z6;
        synchronized (this.f9468x) {
            try {
                z6 = this.f9463s.containsKey(str) || this.f9462r.containsKey(str);
            } finally {
            }
        }
        return z6;
    }

    public void n(InterfaceC0665e interfaceC0665e) {
        synchronized (this.f9468x) {
            this.f9467w.remove(interfaceC0665e);
        }
    }

    public boolean p(v vVar) {
        return q(vVar, null);
    }

    public boolean q(v vVar, WorkerParameters.a aVar) {
        q0.m mVarA = vVar.a();
        final String strB = mVarA.b();
        final ArrayList arrayList = new ArrayList();
        q0.u uVar = (q0.u) this.f9461q.runInTransaction(new Callable() { // from class: androidx.work.impl.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9450a.m(arrayList, strB);
            }
        });
        if (uVar == null) {
            l0.i.e().k(f9456y, "Didn't find WorkSpec for id " + mVarA);
            o(mVarA, false);
            return false;
        }
        synchronized (this.f9468x) {
            try {
                if (k(strB)) {
                    Set set = (Set) this.f9464t.get(strB);
                    if (((v) set.iterator().next()).a().a() == mVarA.a()) {
                        set.add(vVar);
                        l0.i.e().a(f9456y, "Work " + mVarA + " is already enqueued for processing");
                    } else {
                        o(mVarA, false);
                    }
                    return false;
                }
                if (uVar.f() != mVarA.a()) {
                    o(mVarA, false);
                    return false;
                }
                K kB = new K.c(this.f9458n, this.f9459o, this.f9460p, this, this.f9461q, uVar, arrayList).d(this.f9465u).c(aVar).b();
                X3.d dVarC = kB.c();
                dVarC.e(new a(this, vVar.a(), dVarC), this.f9460p.a());
                this.f9463s.put(strB, kB);
                HashSet hashSet = new HashSet();
                hashSet.add(vVar);
                this.f9464t.put(strB, hashSet);
                this.f9460p.b().execute(kB);
                l0.i.e().a(f9456y, getClass().getSimpleName() + ": processing " + mVarA);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r(String str) {
        K k7;
        boolean z6;
        synchronized (this.f9468x) {
            try {
                l0.i.e().a(f9456y, "Processor cancelling " + str);
                this.f9466v.add(str);
                k7 = (K) this.f9462r.remove(str);
                z6 = k7 != null;
                if (k7 == null) {
                    k7 = (K) this.f9463s.remove(str);
                }
                if (k7 != null) {
                    this.f9464t.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zI = i(str, k7);
        if (z6) {
            s();
        }
        return zI;
    }

    public boolean t(v vVar) {
        K k7;
        String strB = vVar.a().b();
        synchronized (this.f9468x) {
            try {
                l0.i.e().a(f9456y, "Processor stopping foreground work " + strB);
                k7 = (K) this.f9462r.remove(strB);
                if (k7 != null) {
                    this.f9464t.remove(strB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i(strB, k7);
    }

    public boolean u(v vVar) {
        String strB = vVar.a().b();
        synchronized (this.f9468x) {
            try {
                K k7 = (K) this.f9463s.remove(strB);
                if (k7 == null) {
                    l0.i.e().a(f9456y, "WorkerWrapper could not be found for " + strB);
                    return false;
                }
                Set set = (Set) this.f9464t.get(strB);
                if (set != null && set.contains(vVar)) {
                    l0.i.e().a(f9456y, "Processor stopping background work " + strB);
                    this.f9464t.remove(strB);
                    return i(strB, k7);
                }
                return false;
            } finally {
            }
        }
    }
}
