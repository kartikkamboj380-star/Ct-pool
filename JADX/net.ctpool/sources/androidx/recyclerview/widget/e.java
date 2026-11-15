package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final ThreadLocal f8828q = new ThreadLocal();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static Comparator f8829r = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f8831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f8832o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f8830m = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList f8833p = new ArrayList();

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f8841d;
            if ((recyclerView == null) != (cVar2.f8841d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z6 = cVar.f8838a;
            if (z6 != cVar2.f8838a) {
                return z6 ? -1 : 1;
            }
            int i7 = cVar2.f8839b - cVar.f8839b;
            if (i7 != 0) {
                return i7;
            }
            int i8 = cVar.f8840c - cVar2.f8840c;
            if (i8 != 0) {
                return i8;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f8836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8837d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i7, int i8) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i8 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i9 = this.f8837d;
            int i10 = i9 * 2;
            int[] iArr = this.f8836c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f8836c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[i9 * 4];
                this.f8836c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f8836c;
            iArr4[i10] = i7;
            iArr4[i10 + 1] = i8;
            this.f8837d++;
        }

        void b() {
            int[] iArr = this.f8836c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f8837d = 0;
        }

        void c(RecyclerView recyclerView, boolean z6) {
            this.f8837d = 0;
            int[] iArr = this.f8836c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f8544y;
            if (recyclerView.f8542x == null || oVar == null || !oVar.u0()) {
                return;
            }
            if (z6) {
                if (!recyclerView.f8526p.p()) {
                    oVar.p(recyclerView.f8542x.c(), this);
                }
            } else if (!recyclerView.l0()) {
                oVar.o(this.f8834a, this.f8835b, recyclerView.f8533s0, this);
            }
            int i7 = this.f8837d;
            if (i7 > oVar.f8604m) {
                oVar.f8604m = i7;
                oVar.f8605n = z6;
                recyclerView.f8522n.K();
            }
        }

        boolean d(int i7) {
            if (this.f8836c != null) {
                int i8 = this.f8837d * 2;
                for (int i9 = 0; i9 < i8; i9 += 2) {
                    if (this.f8836c[i9] == i7) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i7, int i8) {
            this.f8834a = i7;
            this.f8835b = i8;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f8841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8842e;

        c() {
        }

        public void a() {
            this.f8838a = false;
            this.f8839b = 0;
            this.f8840c = 0;
            this.f8841d = null;
            this.f8842e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f8830m.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView = (RecyclerView) this.f8830m.get(i8);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f8531r0.c(recyclerView, false);
                i7 += recyclerView.f8531r0.f8837d;
            }
        }
        this.f8833p.ensureCapacity(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f8830m.get(i10);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f8531r0;
                int iAbs = Math.abs(bVar.f8834a) + Math.abs(bVar.f8835b);
                for (int i11 = 0; i11 < bVar.f8837d * 2; i11 += 2) {
                    if (i9 >= this.f8833p.size()) {
                        cVar = new c();
                        this.f8833p.add(cVar);
                    } else {
                        cVar = (c) this.f8833p.get(i9);
                    }
                    int[] iArr = bVar.f8836c;
                    int i12 = iArr[i11 + 1];
                    cVar.f8838a = i12 <= iAbs;
                    cVar.f8839b = iAbs;
                    cVar.f8840c = i12;
                    cVar.f8841d = recyclerView2;
                    cVar.f8842e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(this.f8833p, f8829r);
    }

    private void c(c cVar, long j7) {
        RecyclerView.C cI = i(cVar.f8841d, cVar.f8842e, cVar.f8838a ? Long.MAX_VALUE : j7);
        if (cI == null || cI.f8557b == null || !cI.s() || cI.t()) {
            return;
        }
        h((RecyclerView) cI.f8557b.get(), j7);
    }

    private void d(long j7) {
        for (int i7 = 0; i7 < this.f8833p.size(); i7++) {
            c cVar = (c) this.f8833p.get(i7);
            if (cVar.f8841d == null) {
                return;
            }
            c(cVar, j7);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i7) {
        int iJ = recyclerView.f8528q.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            RecyclerView.C cF0 = RecyclerView.f0(recyclerView.f8528q.i(i8));
            if (cF0.f8558c == i7 && !cF0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j7) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f8499O && recyclerView.f8528q.j() != 0) {
            recyclerView.T0();
        }
        b bVar = recyclerView.f8531r0;
        bVar.c(recyclerView, true);
        if (bVar.f8837d != 0) {
            try {
                androidx.core.os.o.a("RV Nested Prefetch");
                recyclerView.f8533s0.f(recyclerView.f8542x);
                for (int i7 = 0; i7 < bVar.f8837d * 2; i7 += 2) {
                    i(recyclerView, bVar.f8836c[i7], j7);
                }
            } finally {
                androidx.core.os.o.b();
            }
        }
    }

    private RecyclerView.C i(RecyclerView recyclerView, int i7, long j7) {
        if (e(recyclerView, i7)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f8522n;
        try {
            recyclerView.F0();
            RecyclerView.C cI = uVar.I(i7, false, j7);
            if (cI != null) {
                if (!cI.s() || cI.t()) {
                    uVar.a(cI, false);
                } else {
                    uVar.B(cI.f8556a);
                }
            }
            recyclerView.H0(false);
            return cI;
        } catch (Throwable th) {
            recyclerView.H0(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f8830m.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.isAttachedToWindow() && this.f8831n == 0) {
            this.f8831n = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f8531r0.e(i7, i8);
    }

    void g(long j7) {
        b();
        d(j7);
    }

    public void j(RecyclerView recyclerView) {
        this.f8830m.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.o.a("RV Prefetch");
            if (!this.f8830m.isEmpty()) {
                int size = this.f8830m.size();
                long jMax = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = (RecyclerView) this.f8830m.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f8832o);
                    this.f8831n = 0L;
                    androidx.core.os.o.b();
                }
            }
        } finally {
            this.f8831n = 0L;
            androidx.core.os.o.b();
        }
    }
}
