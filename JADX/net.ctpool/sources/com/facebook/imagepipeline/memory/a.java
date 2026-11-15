package com.facebook.imagepipeline.memory;

import G1.G;
import G1.H;
import O0.l;
import O0.n;
import O0.q;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements R0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f10674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final R0.d f10675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final G f10676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SparseArray f10677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set f10678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C0202a f10680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final C0202a f10681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final H f10682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10683j;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a$a, reason: collision with other inner class name */
    static class C0202a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10685b;

        C0202a() {
        }

        public void a(int i7) {
            int i8;
            int i9 = this.f10685b;
            if (i9 < i7 || (i8 = this.f10684a) <= 0) {
                P0.a.M("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i7), Integer.valueOf(this.f10685b), Integer.valueOf(this.f10684a));
            } else {
                this.f10684a = i8 - 1;
                this.f10685b = i9 - i7;
            }
        }

        public void b(int i7) {
            this.f10684a++;
            this.f10685b += i7;
        }
    }

    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i7, int i8, int i9, int i10) {
            super("Pool hard cap violation? Hard cap = " + i7 + " Used size = " + i8 + " Free size = " + i9 + " Request size = " + i10);
        }
    }

    public a(R0.d dVar, G g7, H h7) {
        this.f10674a = getClass();
        this.f10675b = (R0.d) l.g(dVar);
        G g8 = (G) l.g(g7);
        this.f10676c = g8;
        this.f10682i = (H) l.g(h7);
        this.f10677d = new SparseArray();
        if (g8.f1189f) {
            q();
        } else {
            u(new SparseIntArray(0));
        }
        this.f10678e = n.b();
        this.f10681h = new C0202a();
        this.f10680g = new C0202a();
    }

    private synchronized void h() {
        try {
            l.i(!s() || this.f10681h.f10685b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void i(SparseIntArray sparseIntArray) {
        this.f10677d.clear();
        for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
            int iKeyAt = sparseIntArray.keyAt(i7);
            this.f10677d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(o(iKeyAt), sparseIntArray.valueAt(i7), 0, this.f10676c.f1189f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.b l(int i7) {
        return (com.facebook.imagepipeline.memory.b) this.f10677d.get(i7);
    }

    private synchronized void q() {
        try {
            SparseIntArray sparseIntArray = this.f10676c.f1186c;
            if (sparseIntArray != null) {
                i(sparseIntArray);
                this.f10679f = false;
            } else {
                this.f10679f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void u(SparseIntArray sparseIntArray) {
        try {
            l.g(sparseIntArray);
            this.f10677d.clear();
            SparseIntArray sparseIntArray2 = this.f10676c.f1186c;
            if (sparseIntArray2 != null) {
                for (int i7 = 0; i7 < sparseIntArray2.size(); i7++) {
                    int iKeyAt = sparseIntArray2.keyAt(i7);
                    this.f10677d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(o(iKeyAt), sparseIntArray2.valueAt(i7), sparseIntArray.get(iKeyAt, 0), this.f10676c.f1189f));
                }
                this.f10679f = false;
            } else {
                this.f10679f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void v() {
        if (P0.a.u(2)) {
            P0.a.z(this.f10674a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f10680g.f10684a), Integer.valueOf(this.f10680g.f10685b), Integer.valueOf(this.f10681h.f10684a), Integer.valueOf(this.f10681h.f10685b));
        }
    }

    @Override // R0.f, S0.g
    public void a(Object obj) {
        H h7;
        l.g(obj);
        int iN = n(obj);
        int iO = o(iN);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarL = l(iN);
                if (this.f10678e.remove(obj)) {
                    if (bVarL != null && !bVarL.f() && !s() && t(obj)) {
                        bVarL.h(obj);
                        this.f10681h.b(iO);
                        this.f10680g.a(iO);
                        this.f10682i.g(iO);
                        if (P0.a.u(2)) {
                            P0.a.x(this.f10674a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                        }
                        v();
                    }
                    if (bVarL != null) {
                        bVarL.b();
                    }
                    if (P0.a.u(2)) {
                        P0.a.x(this.f10674a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    }
                    j(obj);
                    this.f10680g.a(iO);
                    h7 = this.f10682i;
                } else {
                    P0.a.h(this.f10674a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    j(obj);
                    h7 = this.f10682i;
                }
                h7.e(iO);
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract Object f(int i7);

    synchronized boolean g(int i7) {
        if (this.f10683j) {
            return true;
        }
        G g7 = this.f10676c;
        int i8 = g7.f1184a;
        int i9 = this.f10680g.f10685b;
        if (i7 > i8 - i9) {
            this.f10682i.f();
            return false;
        }
        int i10 = g7.f1185b;
        if (i7 > i10 - (i9 + this.f10681h.f10685b)) {
            x(i10 - i7);
        }
        if (i7 <= i8 - (this.f10680g.f10685b + this.f10681h.f10685b)) {
            return true;
        }
        this.f10682i.f();
        return false;
    }

    @Override // R0.f
    public Object get(int i7) throws Throwable {
        Object objF;
        Object objP;
        h();
        int iM = m(i7);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarK = k(iM);
                if (bVarK != null && (objP = p(bVarK)) != null) {
                    l.i(this.f10678e.add(objP));
                    int iN = n(objP);
                    int iO = o(iN);
                    this.f10680g.b(iO);
                    this.f10681h.a(iO);
                    this.f10682i.b(iO);
                    v();
                    if (P0.a.u(2)) {
                        P0.a.x(this.f10674a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objP)), Integer.valueOf(iN));
                    }
                    return objP;
                }
                int iO2 = o(iM);
                if (!g(iO2)) {
                    throw new c(this.f10676c.f1184a, this.f10680g.f10685b, this.f10681h.f10685b, iO2);
                }
                this.f10680g.b(iO2);
                if (bVarK != null) {
                    bVarK.e();
                }
                try {
                    objF = f(iM);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f10680g.a(iO2);
                            com.facebook.imagepipeline.memory.b bVarK2 = k(iM);
                            if (bVarK2 != null) {
                                bVarK2.b();
                            }
                            q.c(th);
                            objF = null;
                        } finally {
                        }
                    }
                }
                synchronized (this) {
                    try {
                        l.i(this.f10678e.add(objF));
                        y();
                        this.f10682i.a(iO2);
                        v();
                        if (P0.a.u(2)) {
                            P0.a.x(this.f10674a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objF)), Integer.valueOf(iM));
                        }
                    } finally {
                    }
                }
                return objF;
            } finally {
            }
        }
    }

    protected abstract void j(Object obj);

    synchronized com.facebook.imagepipeline.memory.b k(int i7) {
        try {
            com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) this.f10677d.get(i7);
            if (bVar == null && this.f10679f) {
                if (P0.a.u(2)) {
                    P0.a.w(this.f10674a, "creating new bucket %s", Integer.valueOf(i7));
                }
                com.facebook.imagepipeline.memory.b bVarW = w(i7);
                this.f10677d.put(i7, bVarW);
                return bVarW;
            }
            return bVar;
        } finally {
        }
    }

    protected abstract int m(int i7);

    protected abstract int n(Object obj);

    protected abstract int o(int i7);

    protected synchronized Object p(com.facebook.imagepipeline.memory.b bVar) {
        return bVar.c();
    }

    protected void r() {
        this.f10675b.a(this);
        this.f10682i.c(this);
    }

    synchronized boolean s() {
        boolean z6;
        z6 = this.f10680g.f10685b + this.f10681h.f10685b > this.f10676c.f1185b;
        if (z6) {
            this.f10682i.d();
        }
        return z6;
    }

    protected boolean t(Object obj) {
        l.g(obj);
        return true;
    }

    com.facebook.imagepipeline.memory.b w(int i7) {
        return new com.facebook.imagepipeline.memory.b(o(i7), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, this.f10676c.f1189f);
    }

    synchronized void x(int i7) {
        try {
            int i8 = this.f10680g.f10685b;
            int i9 = this.f10681h.f10685b;
            int iMin = Math.min((i8 + i9) - i7, i9);
            if (iMin <= 0) {
                return;
            }
            if (P0.a.u(2)) {
                P0.a.y(this.f10674a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i7), Integer.valueOf(this.f10680g.f10685b + this.f10681h.f10685b), Integer.valueOf(iMin));
            }
            v();
            for (int i10 = 0; i10 < this.f10677d.size() && iMin > 0; i10++) {
                com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) l.g((com.facebook.imagepipeline.memory.b) this.f10677d.valueAt(i10));
                while (iMin > 0) {
                    Object objG = bVar.g();
                    if (objG == null) {
                        break;
                    }
                    j(objG);
                    int i11 = bVar.f10686a;
                    iMin -= i11;
                    this.f10681h.a(i11);
                }
            }
            v();
            if (P0.a.u(2)) {
                P0.a.x(this.f10674a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i7), Integer.valueOf(this.f10680g.f10685b + this.f10681h.f10685b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void y() {
        if (s()) {
            x(this.f10676c.f1185b);
        }
    }

    public a(R0.d dVar, G g7, H h7, boolean z6) {
        this(dVar, g7, h7);
        this.f10683j = z6;
    }
}
