package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0629y;
import androidx.datastore.preferences.protobuf.C0630z;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class S implements e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f7540r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f7541s = p0.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f7542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f7543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f7546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f7551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f7552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f7553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final U f7554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E f7555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final l0 f7556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC0621p f7557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final J f7558q;

    private S(int[] iArr, Object[] objArr, int i7, int i8, O o6, boolean z6, boolean z7, int[] iArr2, int i9, int i10, U u6, E e7, l0 l0Var, AbstractC0621p abstractC0621p, J j7) {
        this.f7542a = iArr;
        this.f7543b = objArr;
        this.f7544c = i7;
        this.f7545d = i8;
        this.f7548g = o6 instanceof AbstractC0627w;
        this.f7549h = z6;
        this.f7547f = abstractC0621p != null && abstractC0621p.e(o6);
        this.f7550i = z7;
        this.f7551j = iArr2;
        this.f7552k = i9;
        this.f7553l = i10;
        this.f7554m = u6;
        this.f7555n = e7;
        this.f7556o = l0Var;
        this.f7557p = abstractC0621p;
        this.f7546e = o6;
        this.f7558q = j7;
    }

    private boolean A(Object obj, int i7, int i8) {
        List list = (List) p0.A(obj, Q(i7));
        if (list.isEmpty()) {
            return true;
        }
        e0 e0VarR = r(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!e0VarR.d(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    private boolean B(Object obj, int i7, int i8) {
        Map mapH = this.f7558q.h(p0.A(obj, Q(i7)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f7558q.c(q(i8)).f7534c.e() != r0.c.MESSAGE) {
            return true;
        }
        e0 e0VarC = null;
        for (Object obj2 : mapH.values()) {
            if (e0VarC == null) {
                e0VarC = a0.a().c(obj2.getClass());
            }
            if (!e0VarC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i7) {
        long jX = X(i7) & 1048575;
        return p0.x(obj, jX) == p0.x(obj2, jX);
    }

    private boolean D(Object obj, int i7, int i8) {
        return p0.x(obj, (long) (X(i8) & 1048575)) == i7;
    }

    private static boolean E(int i7) {
        return (i7 & 268435456) != 0;
    }

    private static List F(Object obj, long j7) {
        return (List) p0.A(obj, j7);
    }

    private static long G(Object obj, long j7) {
        return p0.y(obj, j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r0 = r16.f7552k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r0 >= r16.f7553l) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r13 = n(r19, r16.f7551j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r13 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void H(l0 l0Var, AbstractC0621p abstractC0621p, Object obj, d0 d0Var, C0620o c0620o) {
        Object objH;
        long jQ;
        List listE;
        List listE2;
        List listE3;
        List listE4;
        List listE5;
        List listE6;
        List listE7;
        List listE8;
        List listE9;
        List listE10;
        List listE11;
        List listE12;
        List listE13;
        List listE14;
        Object objN = null;
        C0623s c0623sD = null;
        while (true) {
            try {
                int iZ = d0Var.z();
                int iW = W(iZ);
                if (iW >= 0) {
                    int iH0 = h0(iW);
                    try {
                        switch (g0(iH0)) {
                            case 0:
                                p0.K(obj, Q(iH0), d0Var.m());
                                d0(obj, iW);
                                break;
                            case 1:
                                p0.L(obj, Q(iH0), d0Var.H());
                                d0(obj, iW);
                                break;
                            case 2:
                                p0.N(obj, Q(iH0), d0Var.M());
                                d0(obj, iW);
                                break;
                            case 3:
                                p0.N(obj, Q(iH0), d0Var.c());
                                d0(obj, iW);
                                break;
                            case 4:
                                p0.M(obj, Q(iH0), d0Var.E());
                                d0(obj, iW);
                                break;
                            case 5:
                                p0.N(obj, Q(iH0), d0Var.d());
                                d0(obj, iW);
                                break;
                            case 6:
                                p0.M(obj, Q(iH0), d0Var.h());
                                d0(obj, iW);
                                break;
                            case 7:
                                p0.E(obj, Q(iH0), d0Var.i());
                                d0(obj, iW);
                                break;
                            case 8:
                                a0(obj, iH0, d0Var);
                                d0(obj, iW);
                                break;
                            case ConnectionResult.SERVICE_INVALID /* 9 */:
                                if (x(obj, iW)) {
                                    objH = AbstractC0629y.h(p0.A(obj, Q(iH0)), d0Var.a(r(iW), c0620o));
                                    jQ = Q(iH0);
                                    p0.O(obj, jQ, objH);
                                } else {
                                    p0.O(obj, Q(iH0), d0Var.a(r(iW), c0620o));
                                    d0(obj, iW);
                                }
                                break;
                            case 10:
                                p0.O(obj, Q(iH0), d0Var.C());
                                d0(obj, iW);
                                break;
                            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                                p0.M(obj, Q(iH0), d0Var.l());
                                d0(obj, iW);
                                break;
                            case 12:
                                int iS = d0Var.s();
                                p(iW);
                                p0.M(obj, Q(iH0), iS);
                                d0(obj, iW);
                                break;
                            case 13:
                                p0.M(obj, Q(iH0), d0Var.I());
                                d0(obj, iW);
                                break;
                            case 14:
                                p0.N(obj, Q(iH0), d0Var.j());
                                d0(obj, iW);
                                break;
                            case 15:
                                p0.M(obj, Q(iH0), d0Var.v());
                                d0(obj, iW);
                                break;
                            case 16:
                                p0.N(obj, Q(iH0), d0Var.w());
                                d0(obj, iW);
                                break;
                            case 17:
                                if (x(obj, iW)) {
                                    objH = AbstractC0629y.h(p0.A(obj, Q(iH0)), d0Var.P(r(iW), c0620o));
                                    jQ = Q(iH0);
                                    p0.O(obj, jQ, objH);
                                } else {
                                    p0.O(obj, Q(iH0), d0Var.P(r(iW), c0620o));
                                    d0(obj, iW);
                                }
                                break;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                listE = this.f7555n.e(obj, Q(iH0));
                                d0Var.K(listE);
                                break;
                            case 19:
                                listE2 = this.f7555n.e(obj, Q(iH0));
                                d0Var.D(listE2);
                                break;
                            case 20:
                                listE3 = this.f7555n.e(obj, Q(iH0));
                                d0Var.n(listE3);
                                break;
                            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                listE4 = this.f7555n.e(obj, Q(iH0));
                                d0Var.k(listE4);
                                break;
                            case 22:
                                listE5 = this.f7555n.e(obj, Q(iH0));
                                d0Var.p(listE5);
                                break;
                            case ConnectionResult.API_DISABLED /* 23 */:
                                listE6 = this.f7555n.e(obj, Q(iH0));
                                d0Var.O(listE6);
                                break;
                            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                listE7 = this.f7555n.e(obj, Q(iH0));
                                d0Var.u(listE7);
                                break;
                            case 25:
                                listE8 = this.f7555n.e(obj, Q(iH0));
                                d0Var.x(listE8);
                                break;
                            case 26:
                                b0(obj, iH0, d0Var);
                                break;
                            case 27:
                                Z(obj, iH0, d0Var, r(iW), c0620o);
                                break;
                            case 28:
                                d0Var.J(this.f7555n.e(obj, Q(iH0)));
                                break;
                            case 29:
                                listE9 = this.f7555n.e(obj, Q(iH0));
                                d0Var.g(listE9);
                                break;
                            case 30:
                                listE10 = this.f7555n.e(obj, Q(iH0));
                                d0Var.q(listE10);
                                p(iW);
                                objN = g0.z(iZ, listE10, null, objN, l0Var);
                                break;
                            case 31:
                                listE11 = this.f7555n.e(obj, Q(iH0));
                                d0Var.e(listE11);
                                break;
                            case 32:
                                listE12 = this.f7555n.e(obj, Q(iH0));
                                d0Var.o(listE12);
                                break;
                            case 33:
                                listE13 = this.f7555n.e(obj, Q(iH0));
                                d0Var.b(listE13);
                                break;
                            case 34:
                                listE14 = this.f7555n.e(obj, Q(iH0));
                                d0Var.f(listE14);
                                break;
                            case 35:
                                listE = this.f7555n.e(obj, Q(iH0));
                                d0Var.K(listE);
                                break;
                            case 36:
                                listE2 = this.f7555n.e(obj, Q(iH0));
                                d0Var.D(listE2);
                                break;
                            case 37:
                                listE3 = this.f7555n.e(obj, Q(iH0));
                                d0Var.n(listE3);
                                break;
                            case 38:
                                listE4 = this.f7555n.e(obj, Q(iH0));
                                d0Var.k(listE4);
                                break;
                            case 39:
                                listE5 = this.f7555n.e(obj, Q(iH0));
                                d0Var.p(listE5);
                                break;
                            case 40:
                                listE6 = this.f7555n.e(obj, Q(iH0));
                                d0Var.O(listE6);
                                break;
                            case 41:
                                listE7 = this.f7555n.e(obj, Q(iH0));
                                d0Var.u(listE7);
                                break;
                            case 42:
                                listE8 = this.f7555n.e(obj, Q(iH0));
                                d0Var.x(listE8);
                                break;
                            case 43:
                                listE9 = this.f7555n.e(obj, Q(iH0));
                                d0Var.g(listE9);
                                break;
                            case 44:
                                listE10 = this.f7555n.e(obj, Q(iH0));
                                d0Var.q(listE10);
                                p(iW);
                                objN = g0.z(iZ, listE10, null, objN, l0Var);
                                break;
                            case 45:
                                listE11 = this.f7555n.e(obj, Q(iH0));
                                d0Var.e(listE11);
                                break;
                            case 46:
                                listE12 = this.f7555n.e(obj, Q(iH0));
                                d0Var.o(listE12);
                                break;
                            case 47:
                                listE13 = this.f7555n.e(obj, Q(iH0));
                                d0Var.b(listE13);
                                break;
                            case 48:
                                listE14 = this.f7555n.e(obj, Q(iH0));
                                d0Var.f(listE14);
                                break;
                            case 49:
                                Y(obj, Q(iH0), d0Var, r(iW), c0620o);
                                break;
                            case 50:
                                I(obj, iW, q(iW), c0620o, d0Var);
                                break;
                            case 51:
                                p0.O(obj, Q(iH0), Double.valueOf(d0Var.m()));
                                e0(obj, iZ, iW);
                                break;
                            case 52:
                                p0.O(obj, Q(iH0), Float.valueOf(d0Var.H()));
                                e0(obj, iZ, iW);
                                break;
                            case 53:
                                p0.O(obj, Q(iH0), Long.valueOf(d0Var.M()));
                                e0(obj, iZ, iW);
                                break;
                            case 54:
                                p0.O(obj, Q(iH0), Long.valueOf(d0Var.c()));
                                e0(obj, iZ, iW);
                                break;
                            case 55:
                                p0.O(obj, Q(iH0), Integer.valueOf(d0Var.E()));
                                e0(obj, iZ, iW);
                                break;
                            case 56:
                                p0.O(obj, Q(iH0), Long.valueOf(d0Var.d()));
                                e0(obj, iZ, iW);
                                break;
                            case 57:
                                p0.O(obj, Q(iH0), Integer.valueOf(d0Var.h()));
                                e0(obj, iZ, iW);
                                break;
                            case 58:
                                p0.O(obj, Q(iH0), Boolean.valueOf(d0Var.i()));
                                e0(obj, iZ, iW);
                                break;
                            case 59:
                                a0(obj, iH0, d0Var);
                                e0(obj, iZ, iW);
                                break;
                            case 60:
                                if (D(obj, iZ, iW)) {
                                    p0.O(obj, Q(iH0), AbstractC0629y.h(p0.A(obj, Q(iH0)), d0Var.a(r(iW), c0620o)));
                                } else {
                                    p0.O(obj, Q(iH0), d0Var.a(r(iW), c0620o));
                                    d0(obj, iW);
                                }
                                e0(obj, iZ, iW);
                                break;
                            case 61:
                                p0.O(obj, Q(iH0), d0Var.C());
                                e0(obj, iZ, iW);
                                break;
                            case 62:
                                p0.O(obj, Q(iH0), Integer.valueOf(d0Var.l()));
                                e0(obj, iZ, iW);
                                break;
                            case 63:
                                int iS2 = d0Var.s();
                                p(iW);
                                p0.O(obj, Q(iH0), Integer.valueOf(iS2));
                                e0(obj, iZ, iW);
                                break;
                            case 64:
                                p0.O(obj, Q(iH0), Integer.valueOf(d0Var.I()));
                                e0(obj, iZ, iW);
                                break;
                            case 65:
                                p0.O(obj, Q(iH0), Long.valueOf(d0Var.j()));
                                e0(obj, iZ, iW);
                                break;
                            case 66:
                                p0.O(obj, Q(iH0), Integer.valueOf(d0Var.v()));
                                e0(obj, iZ, iW);
                                break;
                            case 67:
                                p0.O(obj, Q(iH0), Long.valueOf(d0Var.w()));
                                e0(obj, iZ, iW);
                                break;
                            case 68:
                                p0.O(obj, Q(iH0), d0Var.P(r(iW), c0620o));
                                e0(obj, iZ, iW);
                                break;
                            default:
                                if (objN == null) {
                                    objN = l0Var.n();
                                }
                                if (!l0Var.m(objN, d0Var)) {
                                    for (int i7 = this.f7552k; i7 < this.f7553l; i7++) {
                                        objN = n(obj, this.f7551j[i7], objN, l0Var);
                                    }
                                    if (objN != null) {
                                        l0Var.o(obj, objN);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (C0630z.a unused) {
                        if (!l0Var.q(d0Var)) {
                            if (objN == null) {
                                objN = l0Var.f(obj);
                            }
                            if (!l0Var.m(objN, d0Var)) {
                                for (int i8 = this.f7552k; i8 < this.f7553l; i8++) {
                                    objN = n(obj, this.f7551j[i8], objN, l0Var);
                                }
                                if (objN != null) {
                                    l0Var.o(obj, objN);
                                    return;
                                }
                                return;
                            }
                        } else if (!d0Var.G()) {
                            for (int i9 = this.f7552k; i9 < this.f7553l; i9++) {
                                objN = n(obj, this.f7551j[i9], objN, l0Var);
                            }
                            if (objN != null) {
                                l0Var.o(obj, objN);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iZ == Integer.MAX_VALUE) {
                        for (int i10 = this.f7552k; i10 < this.f7553l; i10++) {
                            objN = n(obj, this.f7551j[i10], objN, l0Var);
                        }
                        if (objN != null) {
                            l0Var.o(obj, objN);
                            return;
                        }
                        return;
                    }
                    Object objB = !this.f7547f ? null : abstractC0621p.b(c0620o, this.f7546e, iZ);
                    if (objB != null) {
                        if (c0623sD == null) {
                            c0623sD = abstractC0621p.d(obj);
                        }
                        objN = abstractC0621p.g(d0Var, objB, c0620o, c0623sD, objN, l0Var);
                    } else if (!l0Var.q(d0Var)) {
                        if (objN == null) {
                            objN = l0Var.f(obj);
                        }
                        if (l0Var.m(objN, d0Var)) {
                        }
                    } else if (d0Var.G()) {
                    }
                }
            } catch (Throwable th) {
                for (int i11 = this.f7552k; i11 < this.f7553l; i11++) {
                    objN = n(obj, this.f7551j[i11], objN, l0Var);
                }
                if (objN != null) {
                    l0Var.o(obj, objN);
                }
                throw th;
            }
        }
    }

    private final void I(Object obj, int i7, Object obj2, C0620o c0620o, d0 d0Var) {
        long jQ = Q(h0(i7));
        Object objA = p0.A(obj, jQ);
        if (objA == null) {
            objA = this.f7558q.e(obj2);
            p0.O(obj, jQ, objA);
        } else if (this.f7558q.g(objA)) {
            Object objE = this.f7558q.e(obj2);
            this.f7558q.a(objE, objA);
            p0.O(obj, jQ, objE);
            objA = objE;
        }
        d0Var.r(this.f7558q.d(objA), this.f7558q.c(obj2), c0620o);
    }

    private void J(Object obj, Object obj2, int i7) {
        long jQ = Q(h0(i7));
        if (x(obj2, i7)) {
            Object objA = p0.A(obj, jQ);
            Object objA2 = p0.A(obj2, jQ);
            if (objA != null && objA2 != null) {
                objA2 = AbstractC0629y.h(objA, objA2);
            } else if (objA2 == null) {
                return;
            }
            p0.O(obj, jQ, objA2);
            d0(obj, i7);
        }
    }

    private void K(Object obj, Object obj2, int i7) {
        int iH0 = h0(i7);
        int iP = P(i7);
        long jQ = Q(iH0);
        if (D(obj2, iP, i7)) {
            Object objA = p0.A(obj, jQ);
            Object objA2 = p0.A(obj2, jQ);
            if (objA != null && objA2 != null) {
                objA2 = AbstractC0629y.h(objA, objA2);
            } else if (objA2 == null) {
                return;
            }
            p0.O(obj, jQ, objA2);
            e0(obj, iP, i7);
        }
    }

    private void L(Object obj, Object obj2, int i7) {
        int iH0 = h0(i7);
        long jQ = Q(iH0);
        int iP = P(i7);
        switch (g0(iH0)) {
            case 0:
                if (x(obj2, i7)) {
                    p0.K(obj, jQ, p0.v(obj2, jQ));
                    d0(obj, i7);
                }
                break;
            case 1:
                if (x(obj2, i7)) {
                    p0.L(obj, jQ, p0.w(obj2, jQ));
                    d0(obj, i7);
                }
                break;
            case 2:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i7);
                break;
            case 3:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i7);
                break;
            case 4:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i7);
                break;
            case 5:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i7);
                break;
            case 6:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i7);
                break;
            case 7:
                if (x(obj2, i7)) {
                    p0.E(obj, jQ, p0.p(obj2, jQ));
                    d0(obj, i7);
                }
                break;
            case 8:
                if (!x(obj2, i7)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                d0(obj, i7);
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
            case 17:
                J(obj, obj2, i7);
                break;
            case 10:
                if (!x(obj2, i7)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                d0(obj, i7);
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i7);
                break;
            case 12:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i7);
                break;
            case 13:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i7);
                break;
            case 14:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i7);
                break;
            case 15:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i7);
                break;
            case 16:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i7);
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f7555n.d(obj, obj2, jQ);
                break;
            case 50:
                g0.E(this.f7558q, obj, obj2, jQ);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!D(obj2, iP, i7)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                e0(obj, iP, i7);
                break;
            case 60:
            case 68:
                K(obj, obj2, i7);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!D(obj2, iP, i7)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                e0(obj, iP, i7);
                break;
        }
    }

    static S M(Class cls, M m7, U u6, E e7, l0 l0Var, AbstractC0621p abstractC0621p, J j7) {
        if (m7 instanceof c0) {
            return O((c0) m7, u6, e7, l0Var, abstractC0621p, j7);
        }
        androidx.appcompat.app.y.a(m7);
        return N(null, u6, e7, l0Var, abstractC0621p, j7);
    }

    static S N(i0 i0Var, U u6, E e7, l0 l0Var, AbstractC0621p abstractC0621p, J j7) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static S O(c0 c0Var, U u6, E e7, l0 l0Var, AbstractC0621p abstractC0621p, J j7) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        char cCharAt;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int i16;
        char cCharAt6;
        int i17;
        char cCharAt7;
        int i18;
        char cCharAt8;
        int i19;
        int i20;
        boolean z6;
        int i21;
        int[] iArr2;
        int i22;
        int i23;
        Class<?> cls;
        int iObjectFieldOffset;
        int i24;
        int iObjectFieldOffset2;
        int i25;
        int i26;
        int i27;
        Field fieldC0;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        Object obj;
        Field fieldC02;
        Object obj2;
        Field fieldC03;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        char cCharAt14;
        int i35 = 0;
        boolean z7 = c0Var.c() == Z.PROTO3;
        String strE = c0Var.e();
        int length = strE.length();
        int iCharAt4 = strE.charAt(0);
        if (iCharAt4 >= 55296) {
            int i36 = iCharAt4 & 8191;
            int i37 = 1;
            int i38 = 13;
            while (true) {
                i7 = i37 + 1;
                cCharAt14 = strE.charAt(i37);
                if (cCharAt14 < 55296) {
                    break;
                }
                i36 |= (cCharAt14 & 8191) << i38;
                i38 += 13;
                i37 = i7;
            }
            iCharAt4 = i36 | (cCharAt14 << i38);
        } else {
            i7 = 1;
        }
        int i39 = i7 + 1;
        int iCharAt5 = strE.charAt(i7);
        if (iCharAt5 >= 55296) {
            int i40 = iCharAt5 & 8191;
            int i41 = 13;
            while (true) {
                i34 = i39 + 1;
                cCharAt13 = strE.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i34;
            }
            iCharAt5 = i40 | (cCharAt13 << i41);
            i39 = i34;
        }
        if (iCharAt5 == 0) {
            i10 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i8 = 0;
            iCharAt3 = 0;
            iArr = f7540r;
            i9 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt6 = strE.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i18 = i42 + 1;
                    cCharAt8 = strE.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i18;
                }
                iCharAt6 = i43 | (cCharAt8 << i44);
                i42 = i18;
            }
            int i45 = i42 + 1;
            int iCharAt7 = strE.charAt(i42);
            if (iCharAt7 >= 55296) {
                int i46 = iCharAt7 & 8191;
                int i47 = 13;
                while (true) {
                    i17 = i45 + 1;
                    cCharAt7 = strE.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i17;
                }
                iCharAt7 = i46 | (cCharAt7 << i47);
                i45 = i17;
            }
            int i48 = i45 + 1;
            int iCharAt8 = strE.charAt(i45);
            if (iCharAt8 >= 55296) {
                int i49 = iCharAt8 & 8191;
                int i50 = 13;
                while (true) {
                    i16 = i48 + 1;
                    cCharAt6 = strE.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i16;
                }
                iCharAt8 = i49 | (cCharAt6 << i50);
                i48 = i16;
            }
            int i51 = i48 + 1;
            iCharAt = strE.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i15 = i51 + 1;
                    cCharAt5 = strE.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i15;
                }
                iCharAt = i52 | (cCharAt5 << i53);
                i51 = i15;
            }
            int i54 = i51 + 1;
            iCharAt2 = strE.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i14 = i54 + 1;
                    cCharAt4 = strE.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i14;
                }
                iCharAt2 = i55 | (cCharAt4 << i56);
                i54 = i14;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strE.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i13 = i57 + 1;
                    cCharAt3 = strE.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i13;
                }
                iCharAt9 = i58 | (cCharAt3 << i59);
                i57 = i13;
            }
            int i60 = i57 + 1;
            int iCharAt10 = strE.charAt(i57);
            if (iCharAt10 >= 55296) {
                int i61 = iCharAt10 & 8191;
                int i62 = 13;
                while (true) {
                    i12 = i60 + 1;
                    cCharAt2 = strE.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i12;
                }
                iCharAt10 = i61 | (cCharAt2 << i62);
                i60 = i12;
            }
            int i63 = i60 + 1;
            iCharAt3 = strE.charAt(i60);
            if (iCharAt3 >= 55296) {
                int i64 = iCharAt3 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i11 = i65 + 1;
                    cCharAt = strE.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i65 = i11;
                }
                iCharAt3 = i64 | (cCharAt << i66);
                i63 = i11;
            }
            int[] iArr3 = new int[iCharAt3 + iCharAt9 + iCharAt10];
            i8 = (iCharAt6 * 2) + iCharAt7;
            i9 = iCharAt6;
            i39 = i63;
            int i67 = iCharAt9;
            iArr = iArr3;
            i35 = iCharAt8;
            i10 = i67;
        }
        Unsafe unsafe = f7541s;
        Object[] objArrD = c0Var.d();
        Class<?> cls2 = c0Var.b().getClass();
        int[] iArr4 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 * 2];
        int i68 = iCharAt3 + i10;
        int i69 = iCharAt3;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt11 = strE.charAt(i39);
            int i74 = length;
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i33 = i76 + 1;
                    cCharAt12 = strE.charAt(i76);
                    i19 = iCharAt3;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i33;
                    iCharAt3 = i19;
                }
                iCharAt11 = i75 | (cCharAt12 << i77);
                i20 = i33;
            } else {
                i19 = iCharAt3;
                i20 = i73;
            }
            int i78 = i20 + 1;
            int iCharAt12 = strE.charAt(i20);
            if (iCharAt12 >= 55296) {
                int i79 = iCharAt12 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i32 = i80 + 1;
                    cCharAt11 = strE.charAt(i80);
                    z6 = z7;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i32;
                    z7 = z6;
                }
                iCharAt12 = i79 | (cCharAt11 << i81);
                i21 = i32;
            } else {
                z6 = z7;
                i21 = i78;
            }
            int i82 = iCharAt12 & 255;
            int i83 = iCharAt;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i84 = i71;
            if (i82 >= 51) {
                int i85 = i21 + 1;
                int iCharAt13 = strE.charAt(i21);
                char c7 = 55296;
                if (iCharAt13 >= 55296) {
                    int i86 = iCharAt13 & 8191;
                    int i87 = 13;
                    while (true) {
                        i31 = i85 + 1;
                        cCharAt10 = strE.charAt(i85);
                        if (cCharAt10 < c7) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i85 = i31;
                        c7 = 55296;
                    }
                    iCharAt13 = i86 | (cCharAt10 << i87);
                    i85 = i31;
                }
                int i88 = i82 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    i30 = i8 + 1;
                    objArr[((i72 / 3) * 2) + 1] = objArrD[i8];
                } else {
                    if (i88 == 12 && (iCharAt4 & 1) == 1) {
                        i30 = i8 + 1;
                        objArr[((i72 / 3) * 2) + 1] = objArrD[i8];
                    }
                    int i90 = iCharAt13 * 2;
                    obj = objArrD[i90];
                    if (obj instanceof Field) {
                        fieldC02 = c0(cls2, (String) obj);
                        objArrD[i90] = fieldC02;
                    } else {
                        fieldC02 = (Field) obj;
                    }
                    iArr2 = iArr4;
                    i22 = iCharAt11;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldC02);
                    int i91 = i90 + 1;
                    obj2 = objArrD[i91];
                    if (obj2 instanceof Field) {
                        fieldC03 = c0(cls2, (String) obj2);
                        objArrD[i91] = fieldC03;
                    } else {
                        fieldC03 = (Field) obj2;
                    }
                    i23 = i35;
                    i24 = iCharAt4;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC03);
                    i26 = iObjectFieldOffset3;
                    i27 = i8;
                    i39 = i89;
                    i25 = 0;
                    cls = cls2;
                }
                i8 = i30;
                int i902 = iCharAt13 * 2;
                obj = objArrD[i902];
                if (obj instanceof Field) {
                }
                iArr2 = iArr4;
                i22 = iCharAt11;
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldC02);
                int i912 = i902 + 1;
                obj2 = objArrD[i912];
                if (obj2 instanceof Field) {
                }
                i23 = i35;
                i24 = iCharAt4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC03);
                i26 = iObjectFieldOffset32;
                i27 = i8;
                i39 = i89;
                i25 = 0;
                cls = cls2;
            } else {
                iArr2 = iArr4;
                i22 = iCharAt11;
                int i92 = i8 + 1;
                Field fieldC04 = c0(cls2, (String) objArrD[i8]);
                if (i82 == 9 || i82 == 17) {
                    i23 = i35;
                    objArr[((i72 / 3) * 2) + 1] = fieldC04.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i23 = i35;
                        i29 = i8 + 2;
                        objArr[((i72 / 3) * 2) + 1] = objArrD[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i23 = i35;
                        if ((iCharAt4 & 1) == 1) {
                            i29 = i8 + 2;
                            objArr[((i72 / 3) * 2) + 1] = objArrD[i92];
                        }
                    } else if (i82 == 50) {
                        int i93 = i69 + 1;
                        iArr[i69] = i72;
                        int i94 = (i72 / 3) * 2;
                        int i95 = i8 + 2;
                        objArr[i94] = objArrD[i92];
                        if ((iCharAt12 & 2048) != 0) {
                            i92 = i8 + 3;
                            objArr[i94 + 1] = objArrD[i95];
                            i23 = i35;
                            i69 = i93;
                        } else {
                            i69 = i93;
                            i92 = i95;
                            i23 = i35;
                        }
                    } else {
                        i23 = i35;
                    }
                    cls = cls2;
                    i92 = i29;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC04);
                    if ((iCharAt4 & 1) == 1 || i82 > 17) {
                        i24 = iCharAt4;
                        iObjectFieldOffset2 = 0;
                        i25 = 0;
                    } else {
                        int i96 = i21 + 1;
                        int iCharAt14 = strE.charAt(i21);
                        if (iCharAt14 >= 55296) {
                            int i97 = iCharAt14 & 8191;
                            int i98 = 13;
                            while (true) {
                                i28 = i96 + 1;
                                cCharAt9 = strE.charAt(i96);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i97 |= (cCharAt9 & 8191) << i98;
                                i98 += 13;
                                i96 = i28;
                            }
                            iCharAt14 = i97 | (cCharAt9 << i98);
                            i96 = i28;
                        }
                        int i99 = (i9 * 2) + (iCharAt14 / 32);
                        Object obj3 = objArrD[i99];
                        if (obj3 instanceof Field) {
                            fieldC0 = (Field) obj3;
                        } else {
                            fieldC0 = c0(cls, (String) obj3);
                            objArrD[i99] = fieldC0;
                        }
                        i21 = i96;
                        i24 = iCharAt4;
                        i25 = iCharAt14 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC0);
                    }
                    if (i82 >= 18 && i82 <= 49) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    i39 = i21;
                    int i100 = i92;
                    i26 = iObjectFieldOffset;
                    i27 = i100;
                }
                cls = cls2;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC04);
                if ((iCharAt4 & 1) == 1) {
                    i24 = iCharAt4;
                    iObjectFieldOffset2 = 0;
                    i25 = 0;
                    if (i82 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    i39 = i21;
                    int i1002 = i92;
                    i26 = iObjectFieldOffset;
                    i27 = i1002;
                }
            }
            int i101 = i72 + 1;
            iArr2[i72] = i22;
            int i102 = i72 + 2;
            iArr2[i101] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i82 << 20) | i26;
            i72 += 3;
            iArr2[i102] = (i25 << 20) | iObjectFieldOffset2;
            i8 = i27;
            cls2 = cls;
            iArr4 = iArr2;
            iCharAt4 = i24;
            iCharAt = i83;
            length = i74;
            i35 = i23;
            iCharAt3 = i19;
            z7 = z6;
            i71 = i84;
        }
        return new S(iArr4, objArr, i35, iCharAt, c0Var.b(), z7, false, iArr, iCharAt3, i68, u6, e7, l0Var, abstractC0621p, j7);
    }

    private int P(int i7) {
        return this.f7542a[i7];
    }

    private static long Q(int i7) {
        return i7 & 1048575;
    }

    private static boolean R(Object obj, long j7) {
        return ((Boolean) p0.A(obj, j7)).booleanValue();
    }

    private static double S(Object obj, long j7) {
        return ((Double) p0.A(obj, j7)).doubleValue();
    }

    private static float T(Object obj, long j7) {
        return ((Float) p0.A(obj, j7)).floatValue();
    }

    private static int U(Object obj, long j7) {
        return ((Integer) p0.A(obj, j7)).intValue();
    }

    private static long V(Object obj, long j7) {
        return ((Long) p0.A(obj, j7)).longValue();
    }

    private int W(int i7) {
        if (i7 < this.f7544c || i7 > this.f7545d) {
            return -1;
        }
        return f0(i7, 0);
    }

    private int X(int i7) {
        return this.f7542a[i7 + 2];
    }

    private void Y(Object obj, long j7, d0 d0Var, e0 e0Var, C0620o c0620o) {
        d0Var.F(this.f7555n.e(obj, j7), e0Var, c0620o);
    }

    private void Z(Object obj, int i7, d0 d0Var, e0 e0Var, C0620o c0620o) {
        d0Var.L(this.f7555n.e(obj, Q(i7)), e0Var, c0620o);
    }

    private void a0(Object obj, int i7, d0 d0Var) {
        long jQ;
        Object objC;
        if (w(i7)) {
            jQ = Q(i7);
            objC = d0Var.N();
        } else if (this.f7548g) {
            jQ = Q(i7);
            objC = d0Var.y();
        } else {
            jQ = Q(i7);
            objC = d0Var.C();
        }
        p0.O(obj, jQ, objC);
    }

    private void b0(Object obj, int i7, d0 d0Var) {
        if (w(i7)) {
            d0Var.B(this.f7555n.e(obj, Q(i7)));
        } else {
            d0Var.A(this.f7555n.e(obj, Q(i7)));
        }
    }

    private static Field c0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void d0(Object obj, int i7) {
        if (this.f7549h) {
            return;
        }
        int iX = X(i7);
        long j7 = iX & 1048575;
        p0.M(obj, j7, p0.x(obj, j7) | (1 << (iX >>> 20)));
    }

    private void e0(Object obj, int i7, int i8) {
        p0.M(obj, X(i8) & 1048575, i7);
    }

    private int f0(int i7, int i8) {
        int length = (this.f7542a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int iP = P(i10);
            if (i7 == iP) {
                return i10;
            }
            if (i7 < iP) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static int g0(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    private int h0(int i7) {
        return this.f7542a[i7 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i0(Object obj, s0 s0Var) {
        Iterator itN;
        Map.Entry entry;
        Map.Entry entry2;
        int i7;
        if (this.f7547f) {
            C0623s c0623sC = this.f7557p.c(obj);
            if (c0623sC.j()) {
                itN = null;
                entry = null;
            } else {
                itN = c0623sC.n();
                entry = (Map.Entry) itN.next();
            }
        }
        int length = this.f7542a.length;
        Unsafe unsafe = f7541s;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int iH0 = h0(i9);
            int iP = P(i9);
            int iG0 = g0(iH0);
            if (this.f7549h || iG0 > 17) {
                entry2 = entry;
                i7 = 0;
            } else {
                int i11 = this.f7542a[i9 + 2];
                int i12 = i11 & 1048575;
                Map.Entry entry3 = entry;
                if (i12 != i8) {
                    i10 = unsafe.getInt(obj, i12);
                    i8 = i12;
                }
                i7 = 1 << (i11 >>> 20);
                entry2 = entry3;
            }
            while (entry2 != null && this.f7557p.a(entry2) <= iP) {
                this.f7557p.j(s0Var, entry2);
                entry2 = itN.hasNext() ? (Map.Entry) itN.next() : null;
            }
            Map.Entry entry4 = entry2;
            int i13 = length;
            long jQ = Q(iH0);
            switch (iG0) {
                case 0:
                    if ((i7 & i10) != 0) {
                        s0Var.e(iP, l(obj, jQ));
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 1:
                    if ((i7 & i10) != 0) {
                        s0Var.E(iP, o(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 2:
                    if ((i7 & i10) != 0) {
                        s0Var.p(iP, unsafe.getLong(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 3:
                    if ((i7 & i10) != 0) {
                        s0Var.n(iP, unsafe.getLong(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 4:
                    if ((i7 & i10) != 0) {
                        s0Var.t(iP, unsafe.getInt(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 5:
                    if ((i7 & i10) != 0) {
                        s0Var.h(iP, unsafe.getLong(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 6:
                    if ((i7 & i10) != 0) {
                        s0Var.d(iP, unsafe.getInt(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 7:
                    if ((i7 & i10) != 0) {
                        s0Var.q(iP, k(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 8:
                    if ((i7 & i10) != 0) {
                        m0(iP, unsafe.getObject(obj, jQ), s0Var);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if ((i7 & i10) != 0) {
                        s0Var.z(iP, unsafe.getObject(obj, jQ), r(i9));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 10:
                    if ((i7 & i10) != 0) {
                        s0Var.w(iP, (AbstractC0612g) unsafe.getObject(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if ((i7 & i10) != 0) {
                        s0Var.b(iP, unsafe.getInt(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 12:
                    if ((i7 & i10) != 0) {
                        s0Var.H(iP, unsafe.getInt(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 13:
                    if ((i7 & i10) != 0) {
                        s0Var.r(iP, unsafe.getInt(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 14:
                    if ((i7 & i10) != 0) {
                        s0Var.x(iP, unsafe.getLong(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 15:
                    if ((i7 & i10) != 0) {
                        s0Var.M(iP, unsafe.getInt(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 16:
                    if ((i7 & i10) != 0) {
                        s0Var.D(iP, unsafe.getLong(obj, jQ));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 17:
                    if ((i7 & i10) != 0) {
                        s0Var.O(iP, unsafe.getObject(obj, jQ), r(i9));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    g0.O(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 19:
                    g0.S(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 20:
                    g0.V(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    g0.d0(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 22:
                    g0.U(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    g0.R(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    g0.Q(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 25:
                    g0.M(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 26:
                    g0.b0(P(i9), (List) unsafe.getObject(obj, jQ), s0Var);
                    break;
                case 27:
                    g0.W(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, r(i9));
                    break;
                case 28:
                    g0.N(P(i9), (List) unsafe.getObject(obj, jQ), s0Var);
                    break;
                case 29:
                    g0.c0(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 30:
                    g0.P(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 31:
                    g0.X(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 32:
                    g0.Y(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 33:
                    g0.Z(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 34:
                    g0.a0(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, false);
                    continue;
                    i9 += 3;
                    length = i13;
                    entry = entry4;
                    break;
                case 35:
                    g0.O(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 36:
                    g0.S(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 37:
                    g0.V(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 38:
                    g0.d0(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 39:
                    g0.U(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 40:
                    g0.R(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 41:
                    g0.Q(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 42:
                    g0.M(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 43:
                    g0.c0(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 44:
                    g0.P(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 45:
                    g0.X(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 46:
                    g0.Y(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 47:
                    g0.Z(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 48:
                    g0.a0(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, true);
                    break;
                case 49:
                    g0.T(P(i9), (List) unsafe.getObject(obj, jQ), s0Var, r(i9));
                    break;
                case 50:
                    l0(s0Var, iP, unsafe.getObject(obj, jQ), i9);
                    break;
                case 51:
                    if (D(obj, iP, i9)) {
                        s0Var.e(iP, S(obj, jQ));
                    }
                    break;
                case 52:
                    if (D(obj, iP, i9)) {
                        s0Var.E(iP, T(obj, jQ));
                    }
                    break;
                case 53:
                    if (D(obj, iP, i9)) {
                        s0Var.p(iP, V(obj, jQ));
                    }
                    break;
                case 54:
                    if (D(obj, iP, i9)) {
                        s0Var.n(iP, V(obj, jQ));
                    }
                    break;
                case 55:
                    if (D(obj, iP, i9)) {
                        s0Var.t(iP, U(obj, jQ));
                    }
                    break;
                case 56:
                    if (D(obj, iP, i9)) {
                        s0Var.h(iP, V(obj, jQ));
                    }
                    break;
                case 57:
                    if (D(obj, iP, i9)) {
                        s0Var.d(iP, U(obj, jQ));
                    }
                    break;
                case 58:
                    if (D(obj, iP, i9)) {
                        s0Var.q(iP, R(obj, jQ));
                    }
                    break;
                case 59:
                    if (D(obj, iP, i9)) {
                        m0(iP, unsafe.getObject(obj, jQ), s0Var);
                    }
                    break;
                case 60:
                    if (D(obj, iP, i9)) {
                        s0Var.z(iP, unsafe.getObject(obj, jQ), r(i9));
                    }
                    break;
                case 61:
                    if (D(obj, iP, i9)) {
                        s0Var.w(iP, (AbstractC0612g) unsafe.getObject(obj, jQ));
                    }
                    break;
                case 62:
                    if (D(obj, iP, i9)) {
                        s0Var.b(iP, U(obj, jQ));
                    }
                    break;
                case 63:
                    if (D(obj, iP, i9)) {
                        s0Var.H(iP, U(obj, jQ));
                    }
                    break;
                case 64:
                    if (D(obj, iP, i9)) {
                        s0Var.r(iP, U(obj, jQ));
                    }
                    break;
                case 65:
                    if (D(obj, iP, i9)) {
                        s0Var.x(iP, V(obj, jQ));
                    }
                    break;
                case 66:
                    if (D(obj, iP, i9)) {
                        s0Var.M(iP, U(obj, jQ));
                    }
                    break;
                case 67:
                    if (D(obj, iP, i9)) {
                        s0Var.D(iP, V(obj, jQ));
                    }
                    break;
                case 68:
                    if (D(obj, iP, i9)) {
                        s0Var.O(iP, unsafe.getObject(obj, jQ), r(i9));
                    }
                    break;
            }
            i9 += 3;
            length = i13;
            entry = entry4;
        }
        while (entry != null) {
            this.f7557p.j(s0Var, entry);
            entry = itN.hasNext() ? (Map.Entry) itN.next() : null;
        }
        n0(this.f7556o, obj, s0Var);
    }

    private boolean j(Object obj, Object obj2, int i7) {
        return x(obj, i7) == x(obj2, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void j0(Object obj, s0 s0Var) {
        Iterator itN;
        Map.Entry entry;
        double dL;
        float fO;
        long jG;
        long jG2;
        int iV;
        long jG3;
        int iV2;
        boolean zK;
        int iV3;
        int iV4;
        int iV5;
        long jG4;
        int iV6;
        long jG5;
        if (this.f7547f) {
            C0623s c0623sC = this.f7557p.c(obj);
            if (c0623sC.j()) {
                itN = null;
                entry = null;
            } else {
                itN = c0623sC.n();
                entry = (Map.Entry) itN.next();
            }
        }
        int length = this.f7542a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iH0 = h0(i7);
            int iP = P(i7);
            while (entry != null && this.f7557p.a(entry) <= iP) {
                this.f7557p.j(s0Var, entry);
                entry = itN.hasNext() ? (Map.Entry) itN.next() : null;
            }
            switch (g0(iH0)) {
                case 0:
                    if (x(obj, i7)) {
                        dL = l(obj, Q(iH0));
                        s0Var.e(iP, dL);
                    }
                    break;
                case 1:
                    if (x(obj, i7)) {
                        fO = o(obj, Q(iH0));
                        s0Var.E(iP, fO);
                    }
                    break;
                case 2:
                    if (x(obj, i7)) {
                        jG = G(obj, Q(iH0));
                        s0Var.p(iP, jG);
                    }
                    break;
                case 3:
                    if (x(obj, i7)) {
                        jG2 = G(obj, Q(iH0));
                        s0Var.n(iP, jG2);
                    }
                    break;
                case 4:
                    if (x(obj, i7)) {
                        iV = v(obj, Q(iH0));
                        s0Var.t(iP, iV);
                    }
                    break;
                case 5:
                    if (x(obj, i7)) {
                        jG3 = G(obj, Q(iH0));
                        s0Var.h(iP, jG3);
                    }
                    break;
                case 6:
                    if (x(obj, i7)) {
                        iV2 = v(obj, Q(iH0));
                        s0Var.d(iP, iV2);
                    }
                    break;
                case 7:
                    if (x(obj, i7)) {
                        zK = k(obj, Q(iH0));
                        s0Var.q(iP, zK);
                    }
                    break;
                case 8:
                    if (x(obj, i7)) {
                        m0(iP, p0.A(obj, Q(iH0)), s0Var);
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if (x(obj, i7)) {
                        s0Var.z(iP, p0.A(obj, Q(iH0)), r(i7));
                    }
                    break;
                case 10:
                    if (x(obj, i7)) {
                        s0Var.w(iP, (AbstractC0612g) p0.A(obj, Q(iH0)));
                    }
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (x(obj, i7)) {
                        iV3 = v(obj, Q(iH0));
                        s0Var.b(iP, iV3);
                    }
                    break;
                case 12:
                    if (x(obj, i7)) {
                        iV4 = v(obj, Q(iH0));
                        s0Var.H(iP, iV4);
                    }
                    break;
                case 13:
                    if (x(obj, i7)) {
                        iV5 = v(obj, Q(iH0));
                        s0Var.r(iP, iV5);
                    }
                    break;
                case 14:
                    if (x(obj, i7)) {
                        jG4 = G(obj, Q(iH0));
                        s0Var.x(iP, jG4);
                    }
                    break;
                case 15:
                    if (x(obj, i7)) {
                        iV6 = v(obj, Q(iH0));
                        s0Var.M(iP, iV6);
                    }
                    break;
                case 16:
                    if (x(obj, i7)) {
                        jG5 = G(obj, Q(iH0));
                        s0Var.D(iP, jG5);
                    }
                    break;
                case 17:
                    if (x(obj, i7)) {
                        s0Var.O(iP, p0.A(obj, Q(iH0)), r(i7));
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    g0.O(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 19:
                    g0.S(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 20:
                    g0.V(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    g0.d0(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 22:
                    g0.U(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    g0.R(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    g0.Q(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 25:
                    g0.M(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 26:
                    g0.b0(P(i7), (List) p0.A(obj, Q(iH0)), s0Var);
                    break;
                case 27:
                    g0.W(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, r(i7));
                    break;
                case 28:
                    g0.N(P(i7), (List) p0.A(obj, Q(iH0)), s0Var);
                    break;
                case 29:
                    g0.c0(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 30:
                    g0.P(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 31:
                    g0.X(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 32:
                    g0.Y(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 33:
                    g0.Z(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 34:
                    g0.a0(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 35:
                    g0.O(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 36:
                    g0.S(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 37:
                    g0.V(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 38:
                    g0.d0(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 39:
                    g0.U(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 40:
                    g0.R(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 41:
                    g0.Q(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 42:
                    g0.M(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 43:
                    g0.c0(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 44:
                    g0.P(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 45:
                    g0.X(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 46:
                    g0.Y(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 47:
                    g0.Z(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 48:
                    g0.a0(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 49:
                    g0.T(P(i7), (List) p0.A(obj, Q(iH0)), s0Var, r(i7));
                    break;
                case 50:
                    l0(s0Var, iP, p0.A(obj, Q(iH0)), i7);
                    break;
                case 51:
                    if (D(obj, iP, i7)) {
                        dL = S(obj, Q(iH0));
                        s0Var.e(iP, dL);
                    }
                    break;
                case 52:
                    if (D(obj, iP, i7)) {
                        fO = T(obj, Q(iH0));
                        s0Var.E(iP, fO);
                    }
                    break;
                case 53:
                    if (D(obj, iP, i7)) {
                        jG = V(obj, Q(iH0));
                        s0Var.p(iP, jG);
                    }
                    break;
                case 54:
                    if (D(obj, iP, i7)) {
                        jG2 = V(obj, Q(iH0));
                        s0Var.n(iP, jG2);
                    }
                    break;
                case 55:
                    if (D(obj, iP, i7)) {
                        iV = U(obj, Q(iH0));
                        s0Var.t(iP, iV);
                    }
                    break;
                case 56:
                    if (D(obj, iP, i7)) {
                        jG3 = V(obj, Q(iH0));
                        s0Var.h(iP, jG3);
                    }
                    break;
                case 57:
                    if (D(obj, iP, i7)) {
                        iV2 = U(obj, Q(iH0));
                        s0Var.d(iP, iV2);
                    }
                    break;
                case 58:
                    if (D(obj, iP, i7)) {
                        zK = R(obj, Q(iH0));
                        s0Var.q(iP, zK);
                    }
                    break;
                case 59:
                    if (!D(obj, iP, i7)) {
                        break;
                    }
                    break;
                case 60:
                    if (!D(obj, iP, i7)) {
                        break;
                    }
                    break;
                case 61:
                    if (!D(obj, iP, i7)) {
                        break;
                    }
                    break;
                case 62:
                    if (D(obj, iP, i7)) {
                        iV3 = U(obj, Q(iH0));
                        s0Var.b(iP, iV3);
                    }
                    break;
                case 63:
                    if (D(obj, iP, i7)) {
                        iV4 = U(obj, Q(iH0));
                        s0Var.H(iP, iV4);
                    }
                    break;
                case 64:
                    if (D(obj, iP, i7)) {
                        iV5 = U(obj, Q(iH0));
                        s0Var.r(iP, iV5);
                    }
                    break;
                case 65:
                    if (D(obj, iP, i7)) {
                        jG4 = V(obj, Q(iH0));
                        s0Var.x(iP, jG4);
                    }
                    break;
                case 66:
                    if (D(obj, iP, i7)) {
                        iV6 = U(obj, Q(iH0));
                        s0Var.M(iP, iV6);
                    }
                    break;
                case 67:
                    if (D(obj, iP, i7)) {
                        jG5 = V(obj, Q(iH0));
                        s0Var.D(iP, jG5);
                    }
                    break;
                case 68:
                    if (!D(obj, iP, i7)) {
                        break;
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f7557p.j(s0Var, entry);
            entry = itN.hasNext() ? (Map.Entry) itN.next() : null;
        }
        n0(this.f7556o, obj, s0Var);
    }

    private static boolean k(Object obj, long j7) {
        return p0.p(obj, j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void k0(Object obj, s0 s0Var) {
        Iterator itE;
        Map.Entry entry;
        double dL;
        float fO;
        long jG;
        long jG2;
        int iV;
        long jG3;
        int iV2;
        boolean zK;
        int iV3;
        int iV4;
        int iV5;
        long jG4;
        int iV6;
        long jG5;
        n0(this.f7556o, obj, s0Var);
        if (this.f7547f) {
            C0623s c0623sC = this.f7557p.c(obj);
            if (c0623sC.j()) {
                itE = null;
                entry = null;
            } else {
                itE = c0623sC.e();
                entry = (Map.Entry) itE.next();
            }
        }
        for (int length = this.f7542a.length - 3; length >= 0; length -= 3) {
            int iH0 = h0(length);
            int iP = P(length);
            while (entry != null && this.f7557p.a(entry) > iP) {
                this.f7557p.j(s0Var, entry);
                entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
            }
            switch (g0(iH0)) {
                case 0:
                    if (x(obj, length)) {
                        dL = l(obj, Q(iH0));
                        s0Var.e(iP, dL);
                    }
                    break;
                case 1:
                    if (x(obj, length)) {
                        fO = o(obj, Q(iH0));
                        s0Var.E(iP, fO);
                    }
                    break;
                case 2:
                    if (x(obj, length)) {
                        jG = G(obj, Q(iH0));
                        s0Var.p(iP, jG);
                    }
                    break;
                case 3:
                    if (x(obj, length)) {
                        jG2 = G(obj, Q(iH0));
                        s0Var.n(iP, jG2);
                    }
                    break;
                case 4:
                    if (x(obj, length)) {
                        iV = v(obj, Q(iH0));
                        s0Var.t(iP, iV);
                    }
                    break;
                case 5:
                    if (x(obj, length)) {
                        jG3 = G(obj, Q(iH0));
                        s0Var.h(iP, jG3);
                    }
                    break;
                case 6:
                    if (x(obj, length)) {
                        iV2 = v(obj, Q(iH0));
                        s0Var.d(iP, iV2);
                    }
                    break;
                case 7:
                    if (x(obj, length)) {
                        zK = k(obj, Q(iH0));
                        s0Var.q(iP, zK);
                    }
                    break;
                case 8:
                    if (x(obj, length)) {
                        m0(iP, p0.A(obj, Q(iH0)), s0Var);
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if (x(obj, length)) {
                        s0Var.z(iP, p0.A(obj, Q(iH0)), r(length));
                    }
                    break;
                case 10:
                    if (x(obj, length)) {
                        s0Var.w(iP, (AbstractC0612g) p0.A(obj, Q(iH0)));
                    }
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (x(obj, length)) {
                        iV3 = v(obj, Q(iH0));
                        s0Var.b(iP, iV3);
                    }
                    break;
                case 12:
                    if (x(obj, length)) {
                        iV4 = v(obj, Q(iH0));
                        s0Var.H(iP, iV4);
                    }
                    break;
                case 13:
                    if (x(obj, length)) {
                        iV5 = v(obj, Q(iH0));
                        s0Var.r(iP, iV5);
                    }
                    break;
                case 14:
                    if (x(obj, length)) {
                        jG4 = G(obj, Q(iH0));
                        s0Var.x(iP, jG4);
                    }
                    break;
                case 15:
                    if (x(obj, length)) {
                        iV6 = v(obj, Q(iH0));
                        s0Var.M(iP, iV6);
                    }
                    break;
                case 16:
                    if (x(obj, length)) {
                        jG5 = G(obj, Q(iH0));
                        s0Var.D(iP, jG5);
                    }
                    break;
                case 17:
                    if (x(obj, length)) {
                        s0Var.O(iP, p0.A(obj, Q(iH0)), r(length));
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    g0.O(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 19:
                    g0.S(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 20:
                    g0.V(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    g0.d0(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 22:
                    g0.U(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    g0.R(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    g0.Q(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 25:
                    g0.M(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 26:
                    g0.b0(P(length), (List) p0.A(obj, Q(iH0)), s0Var);
                    break;
                case 27:
                    g0.W(P(length), (List) p0.A(obj, Q(iH0)), s0Var, r(length));
                    break;
                case 28:
                    g0.N(P(length), (List) p0.A(obj, Q(iH0)), s0Var);
                    break;
                case 29:
                    g0.c0(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 30:
                    g0.P(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 31:
                    g0.X(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 32:
                    g0.Y(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 33:
                    g0.Z(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 34:
                    g0.a0(P(length), (List) p0.A(obj, Q(iH0)), s0Var, false);
                    break;
                case 35:
                    g0.O(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 36:
                    g0.S(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 37:
                    g0.V(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 38:
                    g0.d0(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 39:
                    g0.U(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 40:
                    g0.R(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 41:
                    g0.Q(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 42:
                    g0.M(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 43:
                    g0.c0(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 44:
                    g0.P(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 45:
                    g0.X(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 46:
                    g0.Y(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 47:
                    g0.Z(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 48:
                    g0.a0(P(length), (List) p0.A(obj, Q(iH0)), s0Var, true);
                    break;
                case 49:
                    g0.T(P(length), (List) p0.A(obj, Q(iH0)), s0Var, r(length));
                    break;
                case 50:
                    l0(s0Var, iP, p0.A(obj, Q(iH0)), length);
                    break;
                case 51:
                    if (D(obj, iP, length)) {
                        dL = S(obj, Q(iH0));
                        s0Var.e(iP, dL);
                    }
                    break;
                case 52:
                    if (D(obj, iP, length)) {
                        fO = T(obj, Q(iH0));
                        s0Var.E(iP, fO);
                    }
                    break;
                case 53:
                    if (D(obj, iP, length)) {
                        jG = V(obj, Q(iH0));
                        s0Var.p(iP, jG);
                    }
                    break;
                case 54:
                    if (D(obj, iP, length)) {
                        jG2 = V(obj, Q(iH0));
                        s0Var.n(iP, jG2);
                    }
                    break;
                case 55:
                    if (D(obj, iP, length)) {
                        iV = U(obj, Q(iH0));
                        s0Var.t(iP, iV);
                    }
                    break;
                case 56:
                    if (D(obj, iP, length)) {
                        jG3 = V(obj, Q(iH0));
                        s0Var.h(iP, jG3);
                    }
                    break;
                case 57:
                    if (D(obj, iP, length)) {
                        iV2 = U(obj, Q(iH0));
                        s0Var.d(iP, iV2);
                    }
                    break;
                case 58:
                    if (D(obj, iP, length)) {
                        zK = R(obj, Q(iH0));
                        s0Var.q(iP, zK);
                    }
                    break;
                case 59:
                    if (!D(obj, iP, length)) {
                        break;
                    }
                    break;
                case 60:
                    if (!D(obj, iP, length)) {
                        break;
                    }
                    break;
                case 61:
                    if (!D(obj, iP, length)) {
                        break;
                    }
                    break;
                case 62:
                    if (D(obj, iP, length)) {
                        iV3 = U(obj, Q(iH0));
                        s0Var.b(iP, iV3);
                    }
                    break;
                case 63:
                    if (D(obj, iP, length)) {
                        iV4 = U(obj, Q(iH0));
                        s0Var.H(iP, iV4);
                    }
                    break;
                case 64:
                    if (D(obj, iP, length)) {
                        iV5 = U(obj, Q(iH0));
                        s0Var.r(iP, iV5);
                    }
                    break;
                case 65:
                    if (D(obj, iP, length)) {
                        jG4 = V(obj, Q(iH0));
                        s0Var.x(iP, jG4);
                    }
                    break;
                case 66:
                    if (D(obj, iP, length)) {
                        iV6 = U(obj, Q(iH0));
                        s0Var.M(iP, iV6);
                    }
                    break;
                case 67:
                    if (D(obj, iP, length)) {
                        jG5 = V(obj, Q(iH0));
                        s0Var.D(iP, jG5);
                    }
                    break;
                case 68:
                    if (!D(obj, iP, length)) {
                        break;
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f7557p.j(s0Var, entry);
            entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
        }
    }

    private static double l(Object obj, long j7) {
        return p0.v(obj, j7);
    }

    private void l0(s0 s0Var, int i7, Object obj, int i8) {
        if (obj != null) {
            s0Var.L(i7, this.f7558q.c(q(i8)), this.f7558q.h(obj));
        }
    }

    private boolean m(Object obj, Object obj2, int i7) {
        int iH0 = h0(i7);
        long jQ = Q(iH0);
        switch (g0(iH0)) {
            case 0:
                if (j(obj, obj2, i7) && Double.doubleToLongBits(p0.v(obj, jQ)) == Double.doubleToLongBits(p0.v(obj2, jQ))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i7) && Float.floatToIntBits(p0.w(obj, jQ)) == Float.floatToIntBits(p0.w(obj2, jQ))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i7) && p0.y(obj, jQ) == p0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i7) && p0.y(obj, jQ) == p0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i7) && p0.x(obj, jQ) == p0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i7) && p0.y(obj, jQ) == p0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i7) && p0.x(obj, jQ) == p0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i7) && p0.p(obj, jQ) == p0.p(obj2, jQ)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ))) {
                    break;
                }
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ))) {
                    break;
                }
                break;
            case 10:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ))) {
                    break;
                }
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                if (j(obj, obj2, i7) && p0.x(obj, jQ) == p0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 12:
                if (j(obj, obj2, i7) && p0.x(obj, jQ) == p0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 13:
                if (j(obj, obj2, i7) && p0.x(obj, jQ) == p0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 14:
                if (j(obj, obj2, i7) && p0.y(obj, jQ) == p0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 15:
                if (j(obj, obj2, i7) && p0.x(obj, jQ) == p0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 16:
                if (j(obj, obj2, i7) && p0.y(obj, jQ) == p0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 17:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (C(obj, obj2, i7) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void m0(int i7, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.m(i7, (String) obj);
        } else {
            s0Var.w(i7, (AbstractC0612g) obj);
        }
    }

    private final Object n(Object obj, int i7, Object obj2, l0 l0Var) {
        P(i7);
        if (p0.A(obj, Q(h0(i7))) == null) {
            return obj2;
        }
        p(i7);
        return obj2;
    }

    private void n0(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.t(l0Var.g(obj), s0Var);
    }

    private static float o(Object obj, long j7) {
        return p0.w(obj, j7);
    }

    private AbstractC0629y.a p(int i7) {
        androidx.appcompat.app.y.a(this.f7543b[((i7 / 3) * 2) + 1]);
        return null;
    }

    private Object q(int i7) {
        return this.f7543b[(i7 / 3) * 2];
    }

    private e0 r(int i7) {
        int i8 = (i7 / 3) * 2;
        e0 e0Var = (e0) this.f7543b[i8];
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0VarC = a0.a().c((Class) this.f7543b[i8 + 1]);
        this.f7543b[i8] = e0VarC;
        return e0VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x035b, code lost:
    
        if ((r7 & r14) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0375, code lost:
    
        if ((r7 & r14) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x037b, code lost:
    
        if ((r7 & r14) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0395, code lost:
    
        if ((r7 & r14) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x039b, code lost:
    
        if ((r7 & r14) != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03bd, code lost:
    
        if ((r7 & r14) != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (D(r17, r9, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0615j.r(r9, (androidx.datastore.preferences.protobuf.O) r2.getObject(r17, r12), r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (D(r17, r9, r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0615j.H(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (D(r17, r9, r5) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        r4 = androidx.datastore.preferences.protobuf.AbstractC0615j.F(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if (D(r17, r9, r5) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0615j.f(r9, (androidx.datastore.preferences.protobuf.AbstractC0612g) r2.getObject(r17, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (D(r17, r9, r5) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.g0.o(r9, r2.getObject(r17, r12), r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (D(r17, r9, r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0615j.c(r9, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1 A[PHI: r3
      0x01b1: PHI (r3v121 int) = 
      (r3v83 int)
      (r3v86 int)
      (r3v89 int)
      (r3v92 int)
      (r3v95 int)
      (r3v98 int)
      (r3v101 int)
      (r3v104 int)
      (r3v107 int)
      (r3v110 int)
      (r3v113 int)
      (r3v116 int)
      (r3v119 int)
      (r3v124 int)
     binds: [B:158:0x02a1, B:153:0x028f, B:148:0x027d, B:143:0x026b, B:138:0x0259, B:133:0x0247, B:128:0x0235, B:123:0x0224, B:118:0x0213, B:113:0x0202, B:108:0x01f1, B:103:0x01e0, B:98:0x01cf, B:92:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int s(Object obj) {
        int i7;
        int i8;
        int iH;
        int iF;
        int iU;
        int iU2;
        int iU3;
        long jV;
        boolean z6;
        int iM;
        int i9;
        int iP;
        Unsafe unsafe = f7541s;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.f7542a.length) {
            int iH0 = h0(i11);
            int iP2 = P(i11);
            int iG0 = g0(iH0);
            if (iG0 <= 17) {
                i7 = this.f7542a[i11 + 2];
                int i14 = 1048575 & i7;
                int i15 = 1 << (i7 >>> 20);
                if (i14 != i10) {
                    i13 = unsafe.getInt(obj, i14);
                    i10 = i14;
                }
                i8 = i15;
            } else {
                i7 = (!this.f7550i || iG0 < EnumC0624t.f7776a0.e() || iG0 > EnumC0624t.f7789n0.e()) ? 0 : this.f7542a[i11 + 2] & 1048575;
                i8 = 0;
            }
            long jQ = Q(iH0);
            int i16 = i10;
            switch (iG0) {
                case 0:
                    if ((i13 & i8) != 0) {
                        iH = AbstractC0615j.h(iP2, 0.0d);
                        i12 += iH;
                    }
                    break;
                case 1:
                    if ((i13 & i8) != 0) {
                        iH = AbstractC0615j.p(iP2, 0.0f);
                        i12 += iH;
                    }
                    break;
                case 2:
                    if ((i13 & i8) != 0) {
                        iH = AbstractC0615j.w(iP2, unsafe.getLong(obj, jQ));
                        i12 += iH;
                    }
                    break;
                case 3:
                    if ((i13 & i8) != 0) {
                        iH = AbstractC0615j.S(iP2, unsafe.getLong(obj, jQ));
                        i12 += iH;
                    }
                    break;
                case 4:
                    if ((i13 & i8) != 0) {
                        iH = AbstractC0615j.u(iP2, unsafe.getInt(obj, jQ));
                        i12 += iH;
                    }
                    break;
                case 5:
                    if ((i13 & i8) != 0) {
                        iH = AbstractC0615j.n(iP2, 0L);
                        i12 += iH;
                    }
                    break;
                case 6:
                    if ((i13 & i8) != 0) {
                        iH = AbstractC0615j.l(iP2, 0);
                        i12 += iH;
                    }
                    break;
                case 8:
                    if ((i13 & i8) != 0) {
                        Object object = unsafe.getObject(obj, jQ);
                        iF = object instanceof AbstractC0612g ? AbstractC0615j.f(iP2, (AbstractC0612g) object) : AbstractC0615j.N(iP2, (String) object);
                        i12 += iF;
                    }
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if ((i13 & i8) != 0) {
                        iU = unsafe.getInt(obj, jQ);
                        iF = AbstractC0615j.Q(iP2, iU);
                        i12 += iF;
                    }
                    break;
                case 12:
                    if ((i13 & i8) != 0) {
                        iU2 = unsafe.getInt(obj, jQ);
                        iF = AbstractC0615j.j(iP2, iU2);
                        i12 += iF;
                    }
                    break;
                case 15:
                    if ((i13 & i8) != 0) {
                        iU3 = unsafe.getInt(obj, jQ);
                        iF = AbstractC0615j.J(iP2, iU3);
                        i12 += iF;
                    }
                    break;
                case 16:
                    if ((i13 & i8) != 0) {
                        jV = unsafe.getLong(obj, jQ);
                        iF = AbstractC0615j.L(iP2, jV);
                        i12 += iF;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iF = g0.h(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iF;
                    break;
                case 19:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 31:
                    z6 = false;
                    iM = g0.f(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case 20:
                    z6 = false;
                    iM = g0.m(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    z6 = false;
                    iM = g0.x(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case 22:
                    z6 = false;
                    iM = g0.k(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                case 32:
                    z6 = false;
                    iM = g0.h(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case 25:
                    z6 = false;
                    iM = g0.a(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case 26:
                    iF = g0.u(iP2, (List) unsafe.getObject(obj, jQ));
                    i12 += iF;
                    break;
                case 27:
                    iF = g0.p(iP2, (List) unsafe.getObject(obj, jQ), r(i11));
                    i12 += iF;
                    break;
                case 28:
                    iF = g0.c(iP2, (List) unsafe.getObject(obj, jQ));
                    i12 += iF;
                    break;
                case 29:
                    iF = g0.v(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iF;
                    break;
                case 30:
                    z6 = false;
                    iM = g0.d(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case 33:
                    z6 = false;
                    iM = g0.q(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case 34:
                    z6 = false;
                    iM = g0.s(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i12 += iM;
                    break;
                case 35:
                    i9 = g0.i((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                            unsafe.putInt(obj, i7, i9);
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 36:
                    i9 = g0.g((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 37:
                    i9 = g0.n((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 38:
                    i9 = g0.y((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 39:
                    i9 = g0.l((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 40:
                    i9 = g0.i((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 41:
                    i9 = g0.g((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 42:
                    i9 = g0.b((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 43:
                    i9 = g0.w((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 44:
                    i9 = g0.e((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 45:
                    i9 = g0.g((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 46:
                    i9 = g0.i((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 47:
                    i9 = g0.r((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 48:
                    i9 = g0.t((List) unsafe.getObject(obj, jQ));
                    if (i9 > 0) {
                        if (this.f7550i) {
                        }
                        iP = AbstractC0615j.P(iP2) + AbstractC0615j.R(i9) + i9;
                        i12 += iP;
                    }
                    break;
                case 49:
                    iF = g0.j(iP2, (List) unsafe.getObject(obj, jQ), r(i11));
                    i12 += iF;
                    break;
                case 50:
                    iF = this.f7558q.f(iP2, unsafe.getObject(obj, jQ), q(i11));
                    i12 += iF;
                    break;
                case 51:
                    if (D(obj, iP2, i11)) {
                        iF = AbstractC0615j.h(iP2, 0.0d);
                        i12 += iF;
                    }
                    break;
                case 52:
                    if (D(obj, iP2, i11)) {
                        iF = AbstractC0615j.p(iP2, 0.0f);
                        i12 += iF;
                    }
                    break;
                case 53:
                    if (D(obj, iP2, i11)) {
                        iF = AbstractC0615j.w(iP2, V(obj, jQ));
                        i12 += iF;
                    }
                    break;
                case 54:
                    if (D(obj, iP2, i11)) {
                        iF = AbstractC0615j.S(iP2, V(obj, jQ));
                        i12 += iF;
                    }
                    break;
                case 55:
                    if (D(obj, iP2, i11)) {
                        iF = AbstractC0615j.u(iP2, U(obj, jQ));
                        i12 += iF;
                    }
                    break;
                case 56:
                    if (D(obj, iP2, i11)) {
                        iF = AbstractC0615j.n(iP2, 0L);
                        i12 += iF;
                    }
                    break;
                case 57:
                    if (D(obj, iP2, i11)) {
                        iP = AbstractC0615j.l(iP2, 0);
                        i12 += iP;
                    }
                    break;
                case 59:
                    if (D(obj, iP2, i11)) {
                        Object object2 = unsafe.getObject(obj, jQ);
                        iF = object2 instanceof AbstractC0612g ? AbstractC0615j.f(iP2, (AbstractC0612g) object2) : AbstractC0615j.N(iP2, (String) object2);
                        i12 += iF;
                    }
                    break;
                case 62:
                    if (D(obj, iP2, i11)) {
                        iU = U(obj, jQ);
                        iF = AbstractC0615j.Q(iP2, iU);
                        i12 += iF;
                    }
                    break;
                case 63:
                    if (D(obj, iP2, i11)) {
                        iU2 = U(obj, jQ);
                        iF = AbstractC0615j.j(iP2, iU2);
                        i12 += iF;
                    }
                    break;
                case 66:
                    if (D(obj, iP2, i11)) {
                        iU3 = U(obj, jQ);
                        iF = AbstractC0615j.J(iP2, iU3);
                        i12 += iF;
                    }
                    break;
                case 67:
                    if (D(obj, iP2, i11)) {
                        jV = V(obj, jQ);
                        iF = AbstractC0615j.L(iP2, jV);
                        i12 += iF;
                    }
                    break;
            }
            i11 += 3;
            i10 = i16;
        }
        int iU4 = i12 + u(this.f7556o, obj);
        return this.f7547f ? iU4 + this.f7557p.c(obj).h() : iU4;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[PHI: r6
      0x00b5: PHI (r6v97 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object), (r6v100 java.lang.Object) binds: [B:196:0x0360, B:50:0x00db, B:42:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[PHI: r6
      0x00de: PHI (r6v89 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object) binds: [B:196:0x0360, B:50:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182 A[PHI: r7
      0x0182: PHI (r7v43 int) = 
      (r7v5 int)
      (r7v8 int)
      (r7v11 int)
      (r7v14 int)
      (r7v17 int)
      (r7v20 int)
      (r7v23 int)
      (r7v26 int)
      (r7v29 int)
      (r7v32 int)
      (r7v35 int)
      (r7v38 int)
      (r7v41 int)
      (r7v46 int)
     binds: [B:151:0x0272, B:146:0x0260, B:141:0x024e, B:136:0x023c, B:131:0x022a, B:126:0x0218, B:121:0x0206, B:116:0x01f5, B:111:0x01e4, B:106:0x01d3, B:101:0x01c2, B:96:0x01b1, B:91:0x01a0, B:85:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int t(Object obj) {
        long jY;
        long jY2;
        int iX;
        Object objA;
        int iX2;
        int iX3;
        int iX4;
        long jY3;
        int iM;
        int i7;
        Unsafe unsafe = f7541s;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7542a.length; i9 += 3) {
            int iH0 = h0(i9);
            int iG0 = g0(iH0);
            int iP = P(i9);
            long jQ = Q(iH0);
            int i10 = (iG0 < EnumC0624t.f7776a0.e() || iG0 > EnumC0624t.f7789n0.e()) ? 0 : this.f7542a[i9 + 2] & 1048575;
            switch (iG0) {
                case 0:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.h(iP, 0.0d);
                    i8 += iM;
                    break;
                case 1:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.p(iP, 0.0f);
                    i8 += iM;
                    break;
                case 2:
                    if (x(obj, i9)) {
                        jY = p0.y(obj, jQ);
                        iM = AbstractC0615j.w(iP, jY);
                        i8 += iM;
                    }
                    break;
                case 3:
                    if (x(obj, i9)) {
                        jY2 = p0.y(obj, jQ);
                        iM = AbstractC0615j.S(iP, jY2);
                        i8 += iM;
                    }
                    break;
                case 4:
                    if (x(obj, i9)) {
                        iX = p0.x(obj, jQ);
                        iM = AbstractC0615j.u(iP, iX);
                        i8 += iM;
                    }
                    break;
                case 5:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.n(iP, 0L);
                    i8 += iM;
                    break;
                case 6:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.l(iP, 0);
                    i8 += iM;
                    break;
                case 7:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.c(iP, true);
                    i8 += iM;
                    break;
                case 8:
                    if (x(obj, i9)) {
                        objA = p0.A(obj, jQ);
                        iM = objA instanceof AbstractC0612g ? AbstractC0615j.f(iP, (AbstractC0612g) objA) : AbstractC0615j.N(iP, (String) objA);
                        i8 += iM;
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if (!x(obj, i9)) {
                    }
                    iM = g0.o(iP, p0.A(obj, jQ), r(i9));
                    i8 += iM;
                    break;
                case 10:
                    if (!x(obj, i9)) {
                    }
                    objA = p0.A(obj, jQ);
                    i8 += iM;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (x(obj, i9)) {
                        iX2 = p0.x(obj, jQ);
                        iM = AbstractC0615j.Q(iP, iX2);
                        i8 += iM;
                    }
                    break;
                case 12:
                    if (x(obj, i9)) {
                        iX3 = p0.x(obj, jQ);
                        iM = AbstractC0615j.j(iP, iX3);
                        i8 += iM;
                    }
                    break;
                case 13:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.F(iP, 0);
                    i8 += iM;
                    break;
                case 14:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.H(iP, 0L);
                    i8 += iM;
                    break;
                case 15:
                    if (x(obj, i9)) {
                        iX4 = p0.x(obj, jQ);
                        iM = AbstractC0615j.J(iP, iX4);
                        i8 += iM;
                    }
                    break;
                case 16:
                    if (x(obj, i9)) {
                        jY3 = p0.y(obj, jQ);
                        iM = AbstractC0615j.L(iP, jY3);
                        i8 += iM;
                    }
                    break;
                case 17:
                    if (!x(obj, i9)) {
                    }
                    iM = AbstractC0615j.r(iP, (O) p0.A(obj, jQ), r(i9));
                    i8 += iM;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 32:
                    iM = g0.h(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 19:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 31:
                    iM = g0.f(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 20:
                    iM = g0.m(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    iM = g0.x(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 22:
                    iM = g0.k(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 25:
                    iM = g0.a(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 26:
                    iM = g0.u(iP, F(obj, jQ));
                    i8 += iM;
                    break;
                case 27:
                    iM = g0.p(iP, F(obj, jQ), r(i9));
                    i8 += iM;
                    break;
                case 28:
                    iM = g0.c(iP, F(obj, jQ));
                    i8 += iM;
                    break;
                case 29:
                    iM = g0.v(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 30:
                    iM = g0.d(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 33:
                    iM = g0.q(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 34:
                    iM = g0.s(iP, F(obj, jQ), false);
                    i8 += iM;
                    break;
                case 35:
                    i7 = g0.i((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                            unsafe.putInt(obj, i10, i7);
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 36:
                    i7 = g0.g((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 37:
                    i7 = g0.n((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 38:
                    i7 = g0.y((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 39:
                    i7 = g0.l((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 40:
                    i7 = g0.i((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 41:
                    i7 = g0.g((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 42:
                    i7 = g0.b((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 43:
                    i7 = g0.w((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 44:
                    i7 = g0.e((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 45:
                    i7 = g0.g((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 46:
                    i7 = g0.i((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 47:
                    i7 = g0.r((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 48:
                    i7 = g0.t((List) unsafe.getObject(obj, jQ));
                    if (i7 > 0) {
                        if (this.f7550i) {
                        }
                        iM = AbstractC0615j.P(iP) + AbstractC0615j.R(i7) + i7;
                        i8 += iM;
                    }
                    break;
                case 49:
                    iM = g0.j(iP, F(obj, jQ), r(i9));
                    i8 += iM;
                    break;
                case 50:
                    iM = this.f7558q.f(iP, p0.A(obj, jQ), q(i9));
                    i8 += iM;
                    break;
                case 51:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.h(iP, 0.0d);
                    i8 += iM;
                    break;
                case 52:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.p(iP, 0.0f);
                    i8 += iM;
                    break;
                case 53:
                    if (D(obj, iP, i9)) {
                        jY = V(obj, jQ);
                        iM = AbstractC0615j.w(iP, jY);
                        i8 += iM;
                    }
                    break;
                case 54:
                    if (D(obj, iP, i9)) {
                        jY2 = V(obj, jQ);
                        iM = AbstractC0615j.S(iP, jY2);
                        i8 += iM;
                    }
                    break;
                case 55:
                    if (D(obj, iP, i9)) {
                        iX = U(obj, jQ);
                        iM = AbstractC0615j.u(iP, iX);
                        i8 += iM;
                    }
                    break;
                case 56:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.n(iP, 0L);
                    i8 += iM;
                    break;
                case 57:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.l(iP, 0);
                    i8 += iM;
                    break;
                case 58:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.c(iP, true);
                    i8 += iM;
                    break;
                case 59:
                    if (D(obj, iP, i9)) {
                        objA = p0.A(obj, jQ);
                        if (objA instanceof AbstractC0612g) {
                        }
                        i8 += iM;
                    }
                    break;
                case 60:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = g0.o(iP, p0.A(obj, jQ), r(i9));
                    i8 += iM;
                    break;
                case 61:
                    if (!D(obj, iP, i9)) {
                    }
                    objA = p0.A(obj, jQ);
                    i8 += iM;
                    break;
                case 62:
                    if (D(obj, iP, i9)) {
                        iX2 = U(obj, jQ);
                        iM = AbstractC0615j.Q(iP, iX2);
                        i8 += iM;
                    }
                    break;
                case 63:
                    if (D(obj, iP, i9)) {
                        iX3 = U(obj, jQ);
                        iM = AbstractC0615j.j(iP, iX3);
                        i8 += iM;
                    }
                    break;
                case 64:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.F(iP, 0);
                    i8 += iM;
                    break;
                case 65:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.H(iP, 0L);
                    i8 += iM;
                    break;
                case 66:
                    if (D(obj, iP, i9)) {
                        iX4 = U(obj, jQ);
                        iM = AbstractC0615j.J(iP, iX4);
                        i8 += iM;
                    }
                    break;
                case 67:
                    if (D(obj, iP, i9)) {
                        jY3 = V(obj, jQ);
                        iM = AbstractC0615j.L(iP, jY3);
                        i8 += iM;
                    }
                    break;
                case 68:
                    if (!D(obj, iP, i9)) {
                    }
                    iM = AbstractC0615j.r(iP, (O) p0.A(obj, jQ), r(i9));
                    i8 += iM;
                    break;
            }
        }
        return i8 + u(this.f7556o, obj);
    }

    private int u(l0 l0Var, Object obj) {
        return l0Var.h(l0Var.g(obj));
    }

    private static int v(Object obj, long j7) {
        return p0.x(obj, j7);
    }

    private static boolean w(int i7) {
        return (i7 & 536870912) != 0;
    }

    private boolean x(Object obj, int i7) {
        if (!this.f7549h) {
            int iX = X(i7);
            return (p0.x(obj, (long) (iX & 1048575)) & (1 << (iX >>> 20))) != 0;
        }
        int iH0 = h0(i7);
        long jQ = Q(iH0);
        switch (g0(iH0)) {
            case 0:
                return p0.v(obj, jQ) != 0.0d;
            case 1:
                return p0.w(obj, jQ) != 0.0f;
            case 2:
                return p0.y(obj, jQ) != 0;
            case 3:
                return p0.y(obj, jQ) != 0;
            case 4:
                return p0.x(obj, jQ) != 0;
            case 5:
                return p0.y(obj, jQ) != 0;
            case 6:
                return p0.x(obj, jQ) != 0;
            case 7:
                return p0.p(obj, jQ);
            case 8:
                Object objA = p0.A(obj, jQ);
                if (objA instanceof String) {
                    return !((String) objA).isEmpty();
                }
                if (objA instanceof AbstractC0612g) {
                    return !AbstractC0612g.f7582n.equals(objA);
                }
                throw new IllegalArgumentException();
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return p0.A(obj, jQ) != null;
            case 10:
                return !AbstractC0612g.f7582n.equals(p0.A(obj, jQ));
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return p0.x(obj, jQ) != 0;
            case 12:
                return p0.x(obj, jQ) != 0;
            case 13:
                return p0.x(obj, jQ) != 0;
            case 14:
                return p0.y(obj, jQ) != 0;
            case 15:
                return p0.x(obj, jQ) != 0;
            case 16:
                return p0.y(obj, jQ) != 0;
            case 17:
                return p0.A(obj, jQ) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean y(Object obj, int i7, int i8, int i9) {
        return this.f7549h ? x(obj, i7) : (i8 & i9) != 0;
    }

    private static boolean z(Object obj, int i7, e0 e0Var) {
        return e0Var.d(p0.A(obj, Q(i7)));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i7 = 0; i7 < this.f7542a.length; i7 += 3) {
            L(obj, obj2, i7);
        }
        if (this.f7549h) {
            return;
        }
        g0.F(this.f7556o, obj, obj2);
        if (this.f7547f) {
            g0.D(this.f7557p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj, d0 d0Var, C0620o c0620o) {
        c0620o.getClass();
        H(this.f7556o, this.f7557p, obj, d0Var, c0620o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(Object obj) {
        int i7;
        int i8 = this.f7552k;
        while (true) {
            i7 = this.f7553l;
            if (i8 >= i7) {
                break;
            }
            long jQ = Q(h0(this.f7551j[i8]));
            Object objA = p0.A(obj, jQ);
            if (objA != null) {
                p0.O(obj, jQ, this.f7558q.b(objA));
            }
            i8++;
        }
        int length = this.f7551j.length;
        while (i7 < length) {
            this.f7555n.c(obj, this.f7551j[i7]);
            i7++;
        }
        this.f7556o.j(obj);
        if (this.f7547f) {
            this.f7557p.f(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Object obj) {
        int i7;
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f7552k; i10++) {
            int i11 = this.f7551j[i10];
            int iP = P(i11);
            int iH0 = h0(i11);
            if (this.f7549h) {
                i7 = 0;
            } else {
                int i12 = this.f7542a[i11 + 2];
                int i13 = 1048575 & i12;
                i7 = 1 << (i12 >>> 20);
                if (i13 != i8) {
                    i9 = f7541s.getInt(obj, i13);
                    i8 = i13;
                }
            }
            if (E(iH0) && !y(obj, i11, i9, i7)) {
                return false;
            }
            int iG0 = g0(iH0);
            if (iG0 == 9 || iG0 == 17) {
                if (y(obj, i11, i9, i7) && !z(obj, iH0, r(i11))) {
                    return false;
                }
            } else if (iG0 == 27) {
                if (!A(obj, iH0, i11)) {
                    return false;
                }
            } else if (iG0 == 60 || iG0 == 68) {
                if (D(obj, iP, i11) && !z(obj, iH0, r(i11))) {
                    return false;
                }
            } else if (iG0 != 49) {
                if (iG0 == 50 && !B(obj, iH0, i11)) {
                    return false;
                }
            }
        }
        return !this.f7547f || this.f7557p.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(Object obj, s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            k0(obj, s0Var);
        } else if (this.f7549h) {
            j0(obj, s0Var);
        } else {
            i0(obj, s0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean f(Object obj, Object obj2) {
        int length = this.f7542a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!m(obj, obj2, i7)) {
                return false;
            }
        }
        if (!this.f7556o.g(obj).equals(this.f7556o.g(obj2))) {
            return false;
        }
        if (this.f7547f) {
            return this.f7557p.c(obj).equals(this.f7557p.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(Object obj) {
        return this.f7549h ? t(obj) : s(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object h() {
        return this.f7554m.a(this.f7546e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2 A[PHI: r3
      0x00f2: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x010e, B:68:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int i(Object obj) {
        int i7;
        double dV;
        float fW;
        boolean zP;
        Object objA;
        int iX;
        long jY;
        Object objA2;
        int length = this.f7542a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iH0 = h0(i9);
            int iP = P(i9);
            long jQ = Q(iH0);
            int iHashCode = 37;
            switch (g0(iH0)) {
                case 0:
                    i7 = i8 * 53;
                    dV = p0.v(obj, jQ);
                    jY = Double.doubleToLongBits(dV);
                    iX = AbstractC0629y.f(jY);
                    i8 = i7 + iX;
                    break;
                case 1:
                    i7 = i8 * 53;
                    fW = p0.w(obj, jQ);
                    iX = Float.floatToIntBits(fW);
                    i8 = i7 + iX;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i7 = i8 * 53;
                    jY = p0.y(obj, jQ);
                    iX = AbstractC0629y.f(jY);
                    i8 = i7 + iX;
                    break;
                case 4:
                case 6:
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                case 12:
                case 13:
                case 15:
                    i7 = i8 * 53;
                    iX = p0.x(obj, jQ);
                    i8 = i7 + iX;
                    break;
                case 7:
                    i7 = i8 * 53;
                    zP = p0.p(obj, jQ);
                    iX = AbstractC0629y.c(zP);
                    i8 = i7 + iX;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iX = ((String) p0.A(obj, jQ)).hashCode();
                    i8 = i7 + iX;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    objA = p0.A(obj, jQ);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 10:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i7 = i8 * 53;
                    objA2 = p0.A(obj, jQ);
                    iX = objA2.hashCode();
                    i8 = i7 + iX;
                    break;
                case 17:
                    objA = p0.A(obj, jQ);
                    if (objA != null) {
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 51:
                    if (D(obj, iP, i9)) {
                        i7 = i8 * 53;
                        dV = S(obj, jQ);
                        jY = Double.doubleToLongBits(dV);
                        iX = AbstractC0629y.f(jY);
                        i8 = i7 + iX;
                    }
                    break;
                case 52:
                    if (D(obj, iP, i9)) {
                        i7 = i8 * 53;
                        fW = T(obj, jQ);
                        iX = Float.floatToIntBits(fW);
                        i8 = i7 + iX;
                    }
                    break;
                case 53:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    jY = V(obj, jQ);
                    iX = AbstractC0629y.f(jY);
                    i8 = i7 + iX;
                    break;
                case 54:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    jY = V(obj, jQ);
                    iX = AbstractC0629y.f(jY);
                    i8 = i7 + iX;
                    break;
                case 55:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    iX = U(obj, jQ);
                    i8 = i7 + iX;
                    break;
                case 56:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    jY = V(obj, jQ);
                    iX = AbstractC0629y.f(jY);
                    i8 = i7 + iX;
                    break;
                case 57:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    iX = U(obj, jQ);
                    i8 = i7 + iX;
                    break;
                case 58:
                    if (D(obj, iP, i9)) {
                        i7 = i8 * 53;
                        zP = R(obj, jQ);
                        iX = AbstractC0629y.c(zP);
                        i8 = i7 + iX;
                    }
                    break;
                case 59:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    iX = ((String) p0.A(obj, jQ)).hashCode();
                    i8 = i7 + iX;
                    break;
                case 60:
                    if (!D(obj, iP, i9)) {
                    }
                    objA2 = p0.A(obj, jQ);
                    i7 = i8 * 53;
                    iX = objA2.hashCode();
                    i8 = i7 + iX;
                    break;
                case 61:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    objA2 = p0.A(obj, jQ);
                    iX = objA2.hashCode();
                    i8 = i7 + iX;
                    break;
                case 62:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    iX = U(obj, jQ);
                    i8 = i7 + iX;
                    break;
                case 63:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    iX = U(obj, jQ);
                    i8 = i7 + iX;
                    break;
                case 64:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    iX = U(obj, jQ);
                    i8 = i7 + iX;
                    break;
                case 65:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    jY = V(obj, jQ);
                    iX = AbstractC0629y.f(jY);
                    i8 = i7 + iX;
                    break;
                case 66:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    iX = U(obj, jQ);
                    i8 = i7 + iX;
                    break;
                case 67:
                    if (!D(obj, iP, i9)) {
                    }
                    i7 = i8 * 53;
                    jY = V(obj, jQ);
                    iX = AbstractC0629y.f(jY);
                    i8 = i7 + iX;
                    break;
                case 68:
                    if (!D(obj, iP, i9)) {
                    }
                    objA2 = p0.A(obj, jQ);
                    i7 = i8 * 53;
                    iX = objA2.hashCode();
                    i8 = i7 + iX;
                    break;
            }
        }
        int iHashCode2 = (i8 * 53) + this.f7556o.g(obj).hashCode();
        return this.f7547f ? (iHashCode2 * 53) + this.f7557p.c(obj).hashCode() : iHashCode2;
    }
}
