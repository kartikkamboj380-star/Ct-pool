package w1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import w1.n;
import w1.x;

/* JADX INFO: loaded from: classes.dex */
public class w implements n, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m f22658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f22659b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f22661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x.a f22662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O0.o f22663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected y f22664g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22667j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f22660c = new WeakHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22665h = SystemClock.uptimeMillis();

    class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f22668a;

        a(D d7) {
            this.f22668a = d7;
        }

        @Override // w1.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f22666i ? aVar.f22649f : this.f22668a.a(aVar.f22645b.j());
        }
    }

    class b implements S0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f22670a;

        b(n.a aVar) {
            this.f22670a = aVar;
        }

        @Override // S0.g
        public void a(Object obj) {
            w.this.y(this.f22670a);
        }
    }

    public w(D d7, x.a aVar, O0.o oVar, n.b bVar, boolean z6, boolean z7) {
        this.f22661d = d7;
        this.f22658a = new m(A(d7));
        this.f22659b = new m(A(d7));
        this.f22662e = aVar;
        this.f22663f = oVar;
        this.f22664g = (y) O0.l.h((y) oVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f22666i = z6;
        this.f22667j = z7;
    }

    private D A(D d7) {
        return new a(d7);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean i(int i7) {
        boolean z6;
        if (i7 <= this.f22664g.f22676e) {
            if (k() <= this.f22664g.f22673b - 1) {
                z6 = l() <= this.f22664g.f22672a - i7;
            }
        }
        return z6;
    }

    private synchronized void j(n.a aVar) {
        O0.l.g(aVar);
        O0.l.i(aVar.f22646c > 0);
        aVar.f22646c--;
    }

    private synchronized void m(n.a aVar) {
        O0.l.g(aVar);
        O0.l.i(!aVar.f22647d);
        aVar.f22646c++;
    }

    private synchronized void n(n.a aVar) {
        O0.l.g(aVar);
        O0.l.i(!aVar.f22647d);
        aVar.f22647d = true;
    }

    private synchronized void o(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n((n.a) it.next());
            }
        }
    }

    private synchronized boolean p(n.a aVar) {
        if (aVar.f22647d || aVar.f22646c != 0) {
            return false;
        }
        this.f22658a.g(aVar.f22644a, aVar);
        return true;
    }

    private void q(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                S0.a.g(x((n.a) it.next()));
            }
        }
    }

    private void t(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u((n.a) it.next());
            }
        }
    }

    private synchronized void v() {
        if (this.f22665h + this.f22664g.f22677f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f22665h = SystemClock.uptimeMillis();
        this.f22664g = (y) O0.l.h((y) this.f22663f.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized S0.a w(n.a aVar) {
        m(aVar);
        return S0.a.W(aVar.f22645b.j(), new b(aVar));
    }

    private synchronized S0.a x(n.a aVar) {
        O0.l.g(aVar);
        return (aVar.f22647d && aVar.f22646c == 0) ? aVar.f22645b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(n.a aVar) {
        boolean zP;
        S0.a aVarX;
        O0.l.g(aVar);
        synchronized (this) {
            j(aVar);
            zP = p(aVar);
            aVarX = x(aVar);
        }
        S0.a.g(aVarX);
        if (!zP) {
            aVar = null;
        }
        s(aVar);
        v();
        r();
    }

    private synchronized ArrayList z(int i7, int i8) {
        int iMax = Math.max(i7, 0);
        int iMax2 = Math.max(i8, 0);
        if (this.f22658a.b() <= iMax && this.f22658a.e() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f22658a.b() <= iMax && this.f22658a.e() <= iMax2) {
                break;
            }
            Object objC = this.f22658a.c();
            if (objC != null) {
                this.f22658a.h(objC);
                arrayList.add((n.a) this.f22659b.h(objC));
            } else {
                if (!this.f22667j) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f22658a.b()), Integer.valueOf(this.f22658a.e())));
                }
                this.f22658a.j();
            }
        }
        return arrayList;
    }

    @Override // w1.x
    public synchronized boolean b(O0.m mVar) {
        return !this.f22659b.d(mVar).isEmpty();
    }

    @Override // w1.x
    public void c(Object obj) {
        O0.l.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f22658a.h(obj);
                if (aVar != null) {
                    this.f22658a.g(obj, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w1.x
    public S0.a d(Object obj, S0.a aVar) {
        return h(obj, aVar, null);
    }

    @Override // w1.x
    public int e(O0.m mVar) {
        ArrayList arrayListI;
        ArrayList arrayListI2;
        synchronized (this) {
            arrayListI = this.f22658a.i(mVar);
            arrayListI2 = this.f22659b.i(mVar);
            o(arrayListI2);
        }
        q(arrayListI2);
        t(arrayListI);
        v();
        r();
        return arrayListI2.size();
    }

    @Override // w1.x
    public S0.a get(Object obj) {
        n.a aVar;
        S0.a aVarW;
        O0.l.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f22658a.h(obj);
                n.a aVar2 = (n.a) this.f22659b.a(obj);
                aVarW = aVar2 != null ? w(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        u(aVar);
        v();
        r();
        return aVarW;
    }

    public S0.a h(Object obj, S0.a aVar, n.b bVar) {
        n.a aVar2;
        S0.a aVarW;
        S0.a aVarX;
        O0.l.g(obj);
        O0.l.g(aVar);
        v();
        synchronized (this) {
            try {
                aVar2 = (n.a) this.f22658a.h(obj);
                n.a aVar3 = (n.a) this.f22659b.h(obj);
                aVarW = null;
                if (aVar3 != null) {
                    n(aVar3);
                    aVarX = x(aVar3);
                } else {
                    aVarX = null;
                }
                int iA = this.f22661d.a(aVar.j());
                if (i(iA)) {
                    n.a aVarA = this.f22666i ? n.a.a(obj, aVar, iA, bVar) : n.a.b(obj, aVar, bVar);
                    this.f22659b.g(obj, aVarA);
                    aVarW = w(aVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        S0.a.g(aVarX);
        u(aVar2);
        r();
        return aVarW;
    }

    public synchronized int k() {
        return this.f22659b.b() - this.f22658a.b();
    }

    public synchronized int l() {
        return this.f22659b.e() - this.f22658a.e();
    }

    public void r() {
        ArrayList arrayListZ;
        synchronized (this) {
            y yVar = this.f22664g;
            int iMin = Math.min(yVar.f22675d, yVar.f22673b - k());
            y yVar2 = this.f22664g;
            arrayListZ = z(iMin, Math.min(yVar2.f22674c, yVar2.f22672a - l()));
            o(arrayListZ);
        }
        q(arrayListZ);
        t(arrayListZ);
    }

    private static void s(n.a aVar) {
    }

    private static void u(n.a aVar) {
    }
}
