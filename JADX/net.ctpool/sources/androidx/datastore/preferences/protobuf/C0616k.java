package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import com.google.android.gms.common.ConnectionResult;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0616k implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0615j f7654a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7655a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f7655a = iArr;
            try {
                iArr[r0.b.f7723v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7655a[r0.b.f7722u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7655a[r0.b.f7720s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7655a[r0.b.f7711C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7655a[r0.b.f7713E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7655a[r0.b.f7709A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7655a[r0.b.f7721t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7655a[r0.b.f7718q.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7655a[r0.b.f7712D.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7655a[r0.b.f7714F.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7655a[r0.b.f7719r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7655a[r0.b.f7724w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C0616k(AbstractC0615j abstractC0615j) {
        AbstractC0615j abstractC0615j2 = (AbstractC0615j) AbstractC0629y.b(abstractC0615j, "output");
        this.f7654a = abstractC0615j2;
        abstractC0615j2.f7646a = this;
    }

    public static C0616k P(AbstractC0615j abstractC0615j) {
        C0616k c0616k = abstractC0615j.f7646a;
        return c0616k != null ? c0616k : new C0616k(abstractC0615j);
    }

    private void Q(int i7, boolean z6, Object obj, H.a aVar) {
        this.f7654a.N0(i7, 2);
        this.f7654a.P0(H.b(aVar, Boolean.valueOf(z6), obj));
        H.e(this.f7654a, aVar, Boolean.valueOf(z6), obj);
    }

    private void R(int i7, H.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Integer) it.next()).intValue();
            i8++;
        }
        Arrays.sort(iArr);
        for (int i9 = 0; i9 < size; i9++) {
            int i10 = iArr[i9];
            Object obj = map.get(Integer.valueOf(i10));
            this.f7654a.N0(i7, 2);
            this.f7654a.P0(H.b(aVar, Integer.valueOf(i10), obj));
            H.e(this.f7654a, aVar, Integer.valueOf(i10), obj);
        }
    }

    private void S(int i7, H.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = ((Long) it.next()).longValue();
            i8++;
        }
        Arrays.sort(jArr);
        for (int i9 = 0; i9 < size; i9++) {
            long j7 = jArr[i9];
            Object obj = map.get(Long.valueOf(j7));
            this.f7654a.N0(i7, 2);
            this.f7654a.P0(H.b(aVar, Long.valueOf(j7), obj));
            H.e(this.f7654a, aVar, Long.valueOf(j7), obj);
        }
    }

    private void T(int i7, H.a aVar, Map map) {
        switch (a.f7655a[aVar.f7532a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i7, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i7, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i7, aVar, map);
                return;
            case 7:
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
            case 10:
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                S(i7, aVar, map);
                return;
            case 12:
                U(i7, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f7532a);
        }
    }

    private void U(int i7, H.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            strArr[i8] = (String) it.next();
            i8++;
        }
        Arrays.sort(strArr);
        for (int i9 = 0; i9 < size; i9++) {
            String str = strArr[i9];
            Object obj = map.get(str);
            this.f7654a.N0(i7, 2);
            this.f7654a.P0(H.b(aVar, str, obj));
            H.e(this.f7654a, aVar, str, obj);
        }
    }

    private void V(int i7, Object obj) {
        if (obj instanceof String) {
            this.f7654a.L0(i7, (String) obj);
        } else {
            this.f7654a.f0(i7, (AbstractC0612g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.b0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iD = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iD += AbstractC0615j.d(((Boolean) list.get(i9)).booleanValue());
        }
        this.f7654a.P0(iD);
        while (i8 < list.size()) {
            this.f7654a.c0(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.O0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iR = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iR += AbstractC0615j.R(((Integer) list.get(i9)).intValue());
        }
        this.f7654a.P0(iR);
        while (i8 < list.size()) {
            this.f7654a.P0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.J0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iM = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM += AbstractC0615j.M(((Long) list.get(i9)).longValue());
        }
        this.f7654a.P0(iM);
        while (i8 < list.size()) {
            this.f7654a.K0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i7, long j7) {
        this.f7654a.J0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i7, float f7) {
        this.f7654a.p0(i7, f7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i7) {
        this.f7654a.N0(i7, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.H0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iK = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iK += AbstractC0615j.K(((Integer) list.get(i9)).intValue());
        }
        this.f7654a.P0(iK);
        while (i8 < list.size()) {
            this.f7654a.I0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i7, int i8) {
        this.f7654a.j0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.x0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iX = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iX += AbstractC0615j.x(((Long) list.get(i9)).longValue());
        }
        this.f7654a.P0(iX);
        while (i8 < list.size()) {
            this.f7654a.y0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.j0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iK = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iK += AbstractC0615j.k(((Integer) list.get(i9)).intValue());
        }
        this.f7654a.P0(iK);
        while (i8 < list.size()) {
            this.f7654a.k0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.h0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0615j.i(((Double) list.get(i10)).doubleValue());
        }
        this.f7654a.P0(i9);
        while (i8 < list.size()) {
            this.f7654a.i0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i7, H.a aVar, Map map) {
        if (this.f7654a.Y()) {
            T(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f7654a.N0(i7, 2);
            this.f7654a.P0(H.b(aVar, entry.getKey(), entry.getValue()));
            H.e(this.f7654a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i7, int i8) {
        this.f7654a.H0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void N(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f7654a.f0(i7, (AbstractC0612g) list.get(i8));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i7, Object obj, e0 e0Var) {
        this.f7654a.s0(i7, (O) obj, e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.p0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iQ = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iQ += AbstractC0615j.q(((Float) list.get(i9)).floatValue());
        }
        this.f7654a.P0(iQ);
        while (i8 < list.size()) {
            this.f7654a.q0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i7, int i8) {
        this.f7654a.O0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void c(int i7, Object obj) {
        if (obj instanceof AbstractC0612g) {
            this.f7654a.C0(i7, (AbstractC0612g) obj);
        } else {
            this.f7654a.B0(i7, (O) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i7, int i8) {
        this.f7654a.l0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i7, double d7) {
        this.f7654a.h0(i7, d7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.F0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int I6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            I6 += AbstractC0615j.I(((Long) list.get(i9)).longValue());
        }
        this.f7654a.P0(I6);
        while (i8 < list.size()) {
            this.f7654a.G0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.Q0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iT = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iT += AbstractC0615j.T(((Long) list.get(i9)).longValue());
        }
        this.f7654a.P0(iT);
        while (i8 < list.size()) {
            this.f7654a.R0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i7, long j7) {
        this.f7654a.n0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a i() {
        return s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i7, List list, e0 e0Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            z(i7, list.get(i8), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof D)) {
            while (i8 < list.size()) {
                this.f7654a.L0(i7, (String) list.get(i8));
                i8++;
            }
        } else {
            D d7 = (D) list;
            while (i8 < list.size()) {
                V(i7, d7.R0(i8));
                i8++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i7, List list, e0 e0Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            O(i7, list.get(i8), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i7, String str) {
        this.f7654a.L0(i7, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i7, long j7) {
        this.f7654a.Q0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.v0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iV = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iV += AbstractC0615j.v(((Integer) list.get(i9)).intValue());
        }
        this.f7654a.P0(iV);
        while (i8 < list.size()) {
            this.f7654a.w0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i7, long j7) {
        this.f7654a.x0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i7, boolean z6) {
        this.f7654a.b0(i7, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i7, int i8) {
        this.f7654a.D0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i7) {
        this.f7654a.N0(i7, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i7, int i8) {
        this.f7654a.v0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.n0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iO = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iO += AbstractC0615j.o(((Long) list.get(i9)).longValue());
        }
        this.f7654a.P0(iO);
        while (i8 < list.size()) {
            this.f7654a.o0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void v(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.D0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iG = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iG += AbstractC0615j.G(((Integer) list.get(i9)).intValue());
        }
        this.f7654a.P0(iG);
        while (i8 < list.size()) {
            this.f7654a.E0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i7, AbstractC0612g abstractC0612g) {
        this.f7654a.f0(i7, abstractC0612g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i7, long j7) {
        this.f7654a.F0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void y(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f7654a.l0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f7654a.N0(i7, 2);
        int iM = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM += AbstractC0615j.m(((Integer) list.get(i9)).intValue());
        }
        this.f7654a.P0(iM);
        while (i8 < list.size()) {
            this.f7654a.m0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i7, Object obj, e0 e0Var) {
        this.f7654a.z0(i7, (O) obj, e0Var);
    }
}
