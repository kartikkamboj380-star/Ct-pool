package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1245x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final L5 f14970a = new N5();

    static int A(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC1112i4.P(i7, 0L);
    }

    static int B(List list) {
        return list.size() << 3;
    }

    public static void C(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.F(i7, list, z6);
    }

    static int D(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * AbstractC1112i4.s0(i7));
    }

    static int E(List list) {
        int iG0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4) {
            C4 c42 = (C4) list;
            iG0 = 0;
            while (i7 < size) {
                iG0 += AbstractC1112i4.g0(c42.f(i7));
                i7++;
            }
        } else {
            iG0 = 0;
            while (i7 < size) {
                iG0 += AbstractC1112i4.g0(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iG0;
    }

    public static void F(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.C(i7, list, z6);
    }

    static int G(int i7, List list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * AbstractC1112i4.s0(i7));
    }

    static int H(List list) {
        int iA0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Q4) {
            Q4 q42 = (Q4) list;
            iA0 = 0;
            while (i7 < size) {
                iA0 += AbstractC1112i4.a0(q42.j(i7));
                i7++;
            }
        } else {
            iA0 = 0;
            while (i7 < size) {
                iA0 += AbstractC1112i4.a0(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iA0;
    }

    public static void I(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.L(i7, list, z6);
    }

    static int J(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * AbstractC1112i4.s0(i7));
    }

    static int K(List list) {
        int iO0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4) {
            C4 c42 = (C4) list;
            iO0 = 0;
            while (i7 < size) {
                iO0 += AbstractC1112i4.o0(c42.f(i7));
                i7++;
            }
        } else {
            iO0 = 0;
            while (i7 < size) {
                iO0 += AbstractC1112i4.o0(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iO0;
    }

    public static void L(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.g(i7, list, z6);
    }

    static int M(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * AbstractC1112i4.s0(i7));
    }

    static int N(List list) {
        int iJ0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Q4) {
            Q4 q42 = (Q4) list;
            iJ0 = 0;
            while (i7 < size) {
                iJ0 += AbstractC1112i4.j0(q42.j(i7));
                i7++;
            }
        } else {
            iJ0 = 0;
            while (i7 < size) {
                iJ0 += AbstractC1112i4.j0(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iJ0;
    }

    public static void O(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.q(i7, list, z6);
    }

    static int P(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * AbstractC1112i4.s0(i7));
    }

    static int Q(List list) {
        int iV0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4) {
            C4 c42 = (C4) list;
            iV0 = 0;
            while (i7 < size) {
                iV0 += AbstractC1112i4.v0(c42.f(i7));
                i7++;
            }
        } else {
            iV0 = 0;
            while (i7 < size) {
                iV0 += AbstractC1112i4.v0(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iV0;
    }

    public static void R(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.i(i7, list, z6);
    }

    static int S(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * AbstractC1112i4.s0(i7));
    }

    static int T(List list) {
        int iN0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Q4) {
            Q4 q42 = (Q4) list;
            iN0 = 0;
            while (i7 < size) {
                iN0 += AbstractC1112i4.n0(q42.j(i7));
                i7++;
            }
        } else {
            iN0 = 0;
            while (i7 < size) {
                iN0 += AbstractC1112i4.n0(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iN0;
    }

    public static void U(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.e(i7, list, z6);
    }

    public static void V(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.x(i7, list, z6);
    }

    public static void W(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.c(i7, list, z6);
    }

    public static void X(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.H(i7, list, z6);
    }

    public static void Y(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.f(i7, list, z6);
    }

    static int a(int i7, Object obj, InterfaceC1229v5 interfaceC1229v5) {
        return AbstractC1112i4.R(i7, (InterfaceC1095g5) obj, interfaceC1229v5);
    }

    static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = size * AbstractC1112i4.s0(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            iS0 += AbstractC1112i4.A((R3) list.get(i8));
        }
        return iS0;
    }

    static int c(int i7, List list, InterfaceC1229v5 interfaceC1229v5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iX += AbstractC1112i4.x(i7, (InterfaceC1095g5) list.get(i8), interfaceC1229v5);
        }
        return iX;
    }

    static int d(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC1112i4.z(i7, true);
    }

    static int e(List list) {
        return list.size();
    }

    public static L5 f() {
        return f14970a;
    }

    static Object g(Object obj, int i7, int i8, Object obj2, L5 l52) {
        if (obj2 == null) {
            obj2 = l52.i(obj);
        }
        l52.f(obj2, i7, i8);
        return obj2;
    }

    static Object h(Object obj, int i7, List list, D4 d42, Object obj2, L5 l52) {
        if (d42 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int iIntValue = num.intValue();
                if (d42.d(iIntValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = g(obj, i7, iIntValue, obj2, l52);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!d42.d(iIntValue2)) {
                    obj2 = g(obj, i7, iIntValue2, obj2, l52);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i7, List list, InterfaceC1069d6 interfaceC1069d6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.O(i7, list);
    }

    public static void j(int i7, List list, InterfaceC1069d6 interfaceC1069d6, InterfaceC1229v5 interfaceC1229v5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.r(i7, list, interfaceC1229v5);
    }

    public static void k(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.o(i7, list, z6);
    }

    static void l(AbstractC1166o4 abstractC1166o4, Object obj, Object obj2) {
        C1201s4 c1201s4B = abstractC1166o4.b(obj2);
        if (c1201s4B.f14831a.isEmpty()) {
            return;
        }
        abstractC1166o4.e(obj).f(c1201s4B);
    }

    static void m(Y4 y42, Object obj, Object obj2, long j7) {
        M5.j(obj, j7, y42.h(M5.B(obj, j7), M5.B(obj2, j7)));
    }

    static void n(L5 l52, Object obj, Object obj2) {
        l52.j(obj, l52.b(l52.k(obj), l52.k(obj2)));
    }

    public static void o(Class cls) {
        AbstractC1260z4.class.isAssignableFrom(cls);
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iS0 = AbstractC1112i4.s0(i7) * size;
        if (list instanceof N4) {
            N4 n42 = (N4) list;
            while (i8 < size) {
                Object objD = n42.d(i8);
                iS0 += objD instanceof R3 ? AbstractC1112i4.A((R3) objD) : AbstractC1112i4.C((String) objD);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                iS0 += obj instanceof R3 ? AbstractC1112i4.A((R3) obj) : AbstractC1112i4.C((String) obj);
                i8++;
            }
        }
        return iS0;
    }

    static int r(int i7, List list, InterfaceC1229v5 interfaceC1229v5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = AbstractC1112i4.s0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            iS0 += AbstractC1112i4.g((InterfaceC1095g5) list.get(i8), interfaceC1229v5);
        }
        return iS0;
    }

    static int s(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * AbstractC1112i4.s0(i7));
    }

    static int t(List list) {
        int iX;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4) {
            C4 c42 = (C4) list;
            iX = 0;
            while (i7 < size) {
                iX += AbstractC1112i4.X(c42.f(i7));
                i7++;
            }
        } else {
            iX = 0;
            while (i7 < size) {
                iX += AbstractC1112i4.X(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iX;
    }

    public static void u(int i7, List list, InterfaceC1069d6 interfaceC1069d6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.I(i7, list);
    }

    public static void v(int i7, List list, InterfaceC1069d6 interfaceC1069d6, InterfaceC1229v5 interfaceC1229v5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.k(i7, list, interfaceC1229v5);
    }

    public static void w(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.v(i7, list, z6);
    }

    static int x(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC1112i4.h0(i7, 0);
    }

    static int y(List list) {
        return list.size() << 2;
    }

    public static void z(int i7, List list, InterfaceC1069d6 interfaceC1069d6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1069d6.b(i7, list, z6);
    }
}
