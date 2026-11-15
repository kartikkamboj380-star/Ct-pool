package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final m0 f7657f = new m0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f7659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f7660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7662e;

    private m0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i7 = this.f7658a;
        int[] iArr = this.f7659b;
        if (i7 == iArr.length) {
            int i8 = i7 + (i7 < 4 ? 8 : i7 >> 1);
            this.f7659b = Arrays.copyOf(iArr, i8);
            this.f7660c = Arrays.copyOf(this.f7660c, i8);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    public static m0 e() {
        return f7657f;
    }

    private static int h(int[] iArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        return i8;
    }

    private static int i(Object[] objArr, int i7) {
        int iHashCode = 17;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return iHashCode;
    }

    static m0 k(m0 m0Var, m0 m0Var2) {
        int i7 = m0Var.f7658a + m0Var2.f7658a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f7659b, i7);
        System.arraycopy(m0Var2.f7659b, 0, iArrCopyOf, m0Var.f7658a, m0Var2.f7658a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f7660c, i7);
        System.arraycopy(m0Var2.f7660c, 0, objArrCopyOf, m0Var.f7658a, m0Var2.f7658a);
        return new m0(i7, iArrCopyOf, objArrCopyOf, true);
    }

    static m0 l() {
        return new m0();
    }

    private static void p(int i7, Object obj, s0 s0Var) {
        int iA = r0.a(i7);
        int iB = r0.b(i7);
        if (iB == 0) {
            s0Var.p(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            s0Var.h(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            s0Var.w(iA, (AbstractC0612g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C0630z.d());
            }
            s0Var.d(iA, ((Integer) obj).intValue());
        } else if (s0Var.i() == s0.a.ASCENDING) {
            s0Var.s(iA);
            ((m0) obj).q(s0Var);
            s0Var.F(iA);
        } else {
            s0Var.F(iA);
            ((m0) obj).q(s0Var);
            s0Var.s(iA);
        }
    }

    void a() {
        if (!this.f7662e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i7 = this.f7658a;
        return i7 == m0Var.f7658a && c(this.f7659b, m0Var.f7659b, i7) && d(this.f7660c, m0Var.f7660c, this.f7658a);
    }

    public int f() {
        int iS;
        int i7 = this.f7661d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7658a; i9++) {
            int i10 = this.f7659b[i9];
            int iA = r0.a(i10);
            int iB = r0.b(i10);
            if (iB == 0) {
                iS = AbstractC0615j.S(iA, ((Long) this.f7660c[i9]).longValue());
            } else if (iB == 1) {
                iS = AbstractC0615j.n(iA, ((Long) this.f7660c[i9]).longValue());
            } else if (iB == 2) {
                iS = AbstractC0615j.f(iA, (AbstractC0612g) this.f7660c[i9]);
            } else if (iB == 3) {
                iS = (AbstractC0615j.P(iA) * 2) + ((m0) this.f7660c[i9]).f();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C0630z.d());
                }
                iS = AbstractC0615j.l(iA, ((Integer) this.f7660c[i9]).intValue());
            }
            i8 += iS;
        }
        this.f7661d = i8;
        return i8;
    }

    public int g() {
        int i7 = this.f7661d;
        if (i7 != -1) {
            return i7;
        }
        int iD = 0;
        for (int i8 = 0; i8 < this.f7658a; i8++) {
            iD += AbstractC0615j.D(r0.a(this.f7659b[i8]), (AbstractC0612g) this.f7660c[i8]);
        }
        this.f7661d = iD;
        return iD;
    }

    public int hashCode() {
        int i7 = this.f7658a;
        return ((((527 + i7) * 31) + h(this.f7659b, i7)) * 31) + i(this.f7660c, this.f7658a);
    }

    public void j() {
        this.f7662e = false;
    }

    final void m(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f7658a; i8++) {
            Q.c(sb, i7, String.valueOf(r0.a(this.f7659b[i8])), this.f7660c[i8]);
        }
    }

    void n(int i7, Object obj) {
        a();
        b();
        int[] iArr = this.f7659b;
        int i8 = this.f7658a;
        iArr[i8] = i7;
        this.f7660c[i8] = obj;
        this.f7658a = i8 + 1;
    }

    void o(s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            for (int i7 = this.f7658a - 1; i7 >= 0; i7--) {
                s0Var.c(r0.a(this.f7659b[i7]), this.f7660c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f7658a; i8++) {
            s0Var.c(r0.a(this.f7659b[i8]), this.f7660c[i8]);
        }
    }

    public void q(s0 s0Var) {
        if (this.f7658a == 0) {
            return;
        }
        if (s0Var.i() == s0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f7658a; i7++) {
                p(this.f7659b[i7], this.f7660c[i7], s0Var);
            }
            return;
        }
        for (int i8 = this.f7658a - 1; i8 >= 0; i8--) {
            p(this.f7659b[i8], this.f7660c[i8], s0Var);
        }
    }

    private m0(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f7661d = -1;
        this.f7658a = i7;
        this.f7659b = iArr;
        this.f7660c = objArr;
        this.f7662e = z6;
    }
}
