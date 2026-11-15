package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0630z;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.r0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0614i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0613h f7639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7642d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7643a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f7643a = iArr;
            try {
                iArr[r0.b.f7723v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7643a[r0.b.f7727z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7643a[r0.b.f7716o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7643a[r0.b.f7710B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7643a[r0.b.f7722u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7643a[r0.b.f7721t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7643a[r0.b.f7717p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7643a[r0.b.f7720s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7643a[r0.b.f7718q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7643a[r0.b.f7726y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7643a[r0.b.f7711C.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7643a[r0.b.f7712D.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7643a[r0.b.f7713E.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7643a[r0.b.f7714F.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7643a[r0.b.f7724w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7643a[r0.b.f7709A.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7643a[r0.b.f7719r.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C0614i(AbstractC0613h abstractC0613h) {
        AbstractC0613h abstractC0613h2 = (AbstractC0613h) AbstractC0629y.b(abstractC0613h, "input");
        this.f7639a = abstractC0613h2;
        abstractC0613h2.f7599d = this;
    }

    public static C0614i Q(AbstractC0613h abstractC0613h) {
        C0614i c0614i = abstractC0613h.f7599d;
        return c0614i != null ? c0614i : new C0614i(abstractC0613h);
    }

    private Object R(r0.b bVar, Class cls, C0620o c0620o) {
        switch (a.f7643a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(i());
            case 2:
                return C();
            case 3:
                return Double.valueOf(m());
            case 4:
                return Integer.valueOf(s());
            case 5:
                return Integer.valueOf(h());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(H());
            case 8:
                return Integer.valueOf(E());
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return Long.valueOf(M());
            case 10:
                return U(cls, c0620o);
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return Integer.valueOf(I());
            case 12:
                return Long.valueOf(j());
            case 13:
                return Integer.valueOf(v());
            case 14:
                return Long.valueOf(w());
            case 15:
                return N();
            case 16:
                return Integer.valueOf(l());
            case 17:
                return Long.valueOf(c());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object S(e0 e0Var, C0620o c0620o) {
        int i7 = this.f7641c;
        this.f7641c = r0.c(r0.a(this.f7640b), 4);
        try {
            Object objH = e0Var.h();
            e0Var.b(objH, this, c0620o);
            e0Var.c(objH);
            if (this.f7640b == this.f7641c) {
                return objH;
            }
            throw C0630z.g();
        } finally {
            this.f7641c = i7;
        }
    }

    private Object T(e0 e0Var, C0620o c0620o) throws C0630z {
        int iC = this.f7639a.C();
        AbstractC0613h abstractC0613h = this.f7639a;
        if (abstractC0613h.f7596a >= abstractC0613h.f7597b) {
            throw C0630z.h();
        }
        int iL = abstractC0613h.l(iC);
        Object objH = e0Var.h();
        this.f7639a.f7596a++;
        e0Var.b(objH, this, c0620o);
        e0Var.c(objH);
        this.f7639a.a(0);
        r5.f7596a--;
        this.f7639a.k(iL);
        return objH;
    }

    private void W(int i7) throws C0630z {
        if (this.f7639a.d() != i7) {
            throw C0630z.k();
        }
    }

    private void X(int i7) throws C0630z.a {
        if (r0.b(this.f7640b) != i7) {
            throw C0630z.d();
        }
    }

    private void Y(int i7) throws C0630z {
        if ((i7 & 3) != 0) {
            throw C0630z.g();
        }
    }

    private void Z(int i7) throws C0630z {
        if ((i7 & 7) != 0) {
            throw C0630z.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void A(List list) throws C0630z.a {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void B(List list) throws C0630z.a {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public AbstractC0612g C() throws C0630z.a {
        X(2);
        return this.f7639a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void D(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0625u) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw C0630z.d();
                }
                this.f7639a.s();
                throw null;
            }
            Y(this.f7639a.C());
            this.f7639a.d();
            this.f7639a.s();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 2) {
            int iC = this.f7639a.C();
            Y(iC);
            int iD = this.f7639a.d() + iC;
            do {
                list.add(Float.valueOf(this.f7639a.s()));
            } while (this.f7639a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw C0630z.d();
        }
        do {
            list.add(Float.valueOf(this.f7639a.s()));
            if (this.f7639a.e()) {
                return;
            } else {
                iB = this.f7639a.B();
            }
        } while (iB == this.f7640b);
        this.f7642d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int E() throws C0630z.a {
        X(0);
        return this.f7639a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void F(List list, e0 e0Var, C0620o c0620o) throws C0630z.a {
        int iB;
        if (r0.b(this.f7640b) != 3) {
            throw C0630z.d();
        }
        int i7 = this.f7640b;
        do {
            list.add(S(e0Var, c0620o));
            if (this.f7639a.e() || this.f7642d != 0) {
                return;
            } else {
                iB = this.f7639a.B();
            }
        } while (iB == i7);
        this.f7642d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean G() {
        int i7;
        if (this.f7639a.e() || (i7 = this.f7640b) == this.f7641c) {
            return false;
        }
        return this.f7639a.E(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public float H() throws C0630z.a {
        X(5);
        return this.f7639a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int I() throws C0630z.a {
        X(5);
        return this.f7639a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void J(List list) throws C0630z.a {
        int iB;
        if (r0.b(this.f7640b) != 2) {
            throw C0630z.d();
        }
        do {
            list.add(C());
            if (this.f7639a.e()) {
                return;
            } else {
                iB = this.f7639a.B();
            }
        } while (iB == this.f7640b);
        this.f7642d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void K(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0617l) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 1) {
                this.f7639a.o();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            Z(this.f7639a.C());
            this.f7639a.d();
            this.f7639a.o();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 1) {
            do {
                list.add(Double.valueOf(this.f7639a.o()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iC = this.f7639a.C();
        Z(iC);
        int iD = this.f7639a.d() + iC;
        do {
            list.add(Double.valueOf(this.f7639a.o()));
        } while (this.f7639a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void L(List list, e0 e0Var, C0620o c0620o) throws C0630z.a {
        int iB;
        if (r0.b(this.f7640b) != 2) {
            throw C0630z.d();
        }
        int i7 = this.f7640b;
        do {
            list.add(T(e0Var, c0620o));
            if (this.f7639a.e() || this.f7642d != 0) {
                return;
            } else {
                iB = this.f7639a.B();
            }
        } while (iB == i7);
        this.f7642d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long M() throws C0630z.a {
        X(0);
        return this.f7639a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String N() throws C0630z.a {
        X(2);
        return this.f7639a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void O(List list) throws C0630z {
        int iB;
        if (list instanceof F) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 1) {
                this.f7639a.r();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            Z(this.f7639a.C());
            this.f7639a.d();
            this.f7639a.r();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 1) {
            do {
                list.add(Long.valueOf(this.f7639a.r()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iC = this.f7639a.C();
        Z(iC);
        int iD = this.f7639a.d() + iC;
        do {
            list.add(Long.valueOf(this.f7639a.r()));
        } while (this.f7639a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object P(e0 e0Var, C0620o c0620o) throws C0630z.a {
        X(3);
        return S(e0Var, c0620o);
    }

    public Object U(Class cls, C0620o c0620o) throws C0630z.a {
        X(2);
        return T(a0.a().c(cls), c0620o);
    }

    public void V(List list, boolean z6) throws C0630z.a {
        int iB;
        int iB2;
        if (r0.b(this.f7640b) != 2) {
            throw C0630z.d();
        }
        if (!(list instanceof D) || z6) {
            do {
                list.add(z6 ? N() : y());
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        D d7 = (D) list;
        do {
            d7.W(C());
            if (this.f7639a.e()) {
                return;
            } else {
                iB2 = this.f7639a.B();
            }
        } while (iB2 == this.f7640b);
        this.f7642d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object a(e0 e0Var, C0620o c0620o) throws C0630z.a {
        X(2);
        return T(e0Var, c0620o);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void b(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0628x) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.x();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.x();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f7639a.x()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Integer.valueOf(this.f7639a.x()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long c() throws C0630z.a {
        X(0);
        return this.f7639a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long d() throws C0630z.a {
        X(1);
        return this.f7639a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void e(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0628x) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw C0630z.d();
                }
                this.f7639a.v();
                throw null;
            }
            Y(this.f7639a.C());
            this.f7639a.d();
            this.f7639a.v();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 2) {
            int iC = this.f7639a.C();
            Y(iC);
            int iD = this.f7639a.d() + iC;
            do {
                list.add(Integer.valueOf(this.f7639a.v()));
            } while (this.f7639a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw C0630z.d();
        }
        do {
            list.add(Integer.valueOf(this.f7639a.v()));
            if (this.f7639a.e()) {
                return;
            } else {
                iB = this.f7639a.B();
            }
        } while (iB == this.f7640b);
        this.f7642d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void f(List list) throws C0630z {
        int iB;
        if (list instanceof F) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.y();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.y();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f7639a.y()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Long.valueOf(this.f7639a.y()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void g(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0628x) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.C();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.C();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f7639a.C()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Integer.valueOf(this.f7639a.C()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int h() throws C0630z.a {
        X(5);
        return this.f7639a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean i() throws C0630z.a {
        X(0);
        return this.f7639a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long j() throws C0630z.a {
        X(1);
        return this.f7639a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void k(List list) throws C0630z {
        int iB;
        if (list instanceof F) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.D();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.D();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f7639a.D()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Long.valueOf(this.f7639a.D()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int l() throws C0630z.a {
        X(0);
        return this.f7639a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public double m() throws C0630z.a {
        X(1);
        return this.f7639a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void n(List list) throws C0630z {
        int iB;
        if (list instanceof F) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.u();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.u();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f7639a.u()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Long.valueOf(this.f7639a.u()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void o(List list) throws C0630z {
        int iB;
        if (list instanceof F) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 1) {
                this.f7639a.w();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            Z(this.f7639a.C());
            this.f7639a.d();
            this.f7639a.w();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 1) {
            do {
                list.add(Long.valueOf(this.f7639a.w()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iC = this.f7639a.C();
        Z(iC);
        int iD = this.f7639a.d() + iC;
        do {
            list.add(Long.valueOf(this.f7639a.w()));
        } while (this.f7639a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void p(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0628x) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.t();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.t();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f7639a.t()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Integer.valueOf(this.f7639a.t()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void q(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0628x) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.p();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.p();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f7639a.p()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Integer.valueOf(this.f7639a.p()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f7639a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(Map map, H.a aVar, C0620o c0620o) throws C0630z.a {
        X(2);
        int iL = this.f7639a.l(this.f7639a.C());
        Object objR = aVar.f7533b;
        Object objR2 = aVar.f7535d;
        while (true) {
            try {
                int iZ = z();
                if (iZ == Integer.MAX_VALUE || this.f7639a.e()) {
                    break;
                }
                if (iZ == 1) {
                    objR = R(aVar.f7532a, null, null);
                } else if (iZ != 2) {
                    try {
                        if (!G()) {
                            throw new C0630z("Unable to parse map entry.");
                        }
                    } catch (C0630z.a unused) {
                        if (!G()) {
                            throw new C0630z("Unable to parse map entry.");
                        }
                    }
                } else {
                    objR2 = R(aVar.f7534c, aVar.f7535d.getClass(), c0620o);
                }
            } catch (Throwable th) {
                this.f7639a.k(iL);
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int s() throws C0630z.a {
        X(0);
        return this.f7639a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int t() {
        return this.f7640b;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void u(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0628x) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw C0630z.d();
                }
                this.f7639a.q();
                throw null;
            }
            Y(this.f7639a.C());
            this.f7639a.d();
            this.f7639a.q();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 2) {
            int iC = this.f7639a.C();
            Y(iC);
            int iD = this.f7639a.d() + iC;
            do {
                list.add(Integer.valueOf(this.f7639a.q()));
            } while (this.f7639a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw C0630z.d();
        }
        do {
            list.add(Integer.valueOf(this.f7639a.q()));
            if (this.f7639a.e()) {
                return;
            } else {
                iB = this.f7639a.B();
            }
        } while (iB == this.f7640b);
        this.f7642d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int v() throws C0630z.a {
        X(0);
        return this.f7639a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long w() throws C0630z.a {
        X(0);
        return this.f7639a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void x(List list) throws C0630z {
        int iB;
        if (list instanceof AbstractC0610e) {
            androidx.appcompat.app.y.a(list);
            int iB2 = r0.b(this.f7640b);
            if (iB2 == 0) {
                this.f7639a.m();
                throw null;
            }
            if (iB2 != 2) {
                throw C0630z.d();
            }
            this.f7639a.C();
            this.f7639a.d();
            this.f7639a.m();
            throw null;
        }
        int iB3 = r0.b(this.f7640b);
        if (iB3 == 0) {
            do {
                list.add(Boolean.valueOf(this.f7639a.m()));
                if (this.f7639a.e()) {
                    return;
                } else {
                    iB = this.f7639a.B();
                }
            } while (iB == this.f7640b);
            this.f7642d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C0630z.d();
        }
        int iD = this.f7639a.d() + this.f7639a.C();
        do {
            list.add(Boolean.valueOf(this.f7639a.m()));
        } while (this.f7639a.d() < iD);
        W(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String y() throws C0630z.a {
        X(2);
        return this.f7639a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int z() {
        int i7 = this.f7642d;
        if (i7 != 0) {
            this.f7640b = i7;
            this.f7642d = 0;
        } else {
            this.f7640b = this.f7639a.B();
        }
        int i8 = this.f7640b;
        return (i8 == 0 || i8 == this.f7641c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : r0.a(i8);
    }
}
