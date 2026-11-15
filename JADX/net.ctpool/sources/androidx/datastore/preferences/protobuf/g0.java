package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0629y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f7592a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l0 f7593b = B(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l0 f7594c = B(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l0 f7595d = new n0();

    private static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static l0 B(boolean z6) {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (l0) clsC.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC0621p abstractC0621p, Object obj, Object obj2) {
        C0623s c0623sC = abstractC0621p.c(obj2);
        if (c0623sC.j()) {
            return;
        }
        abstractC0621p.d(obj).p(c0623sC);
    }

    static void E(J j7, Object obj, Object obj2, long j8) {
        p0.O(obj, j8, j7.a(p0.A(obj, j8), p0.A(obj2, j8)));
    }

    static void F(l0 l0Var, Object obj, Object obj2) {
        l0Var.p(obj, l0Var.k(l0Var.g(obj), l0Var.g(obj2)));
    }

    public static l0 G() {
        return f7593b;
    }

    public static l0 H() {
        return f7594c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC0627w.class.isAssignableFrom(cls) && (cls2 = f7592a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(int i7, int i8, Object obj, l0 l0Var) {
        if (obj == null) {
            obj = l0Var.n();
        }
        l0Var.e(obj, i7, i8);
        return obj;
    }

    public static l0 L() {
        return f7595d;
    }

    public static void M(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.A(i7, list, z6);
    }

    public static void N(int i7, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.N(i7, list);
    }

    public static void O(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.K(i7, list, z6);
    }

    public static void P(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i7, list, z6);
    }

    public static void Q(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i7, list, z6);
    }

    public static void R(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.u(i7, list, z6);
    }

    public static void S(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i7, list, z6);
    }

    public static void T(int i7, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.l(i7, list, e0Var);
    }

    public static void U(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.o(i7, list, z6);
    }

    public static void V(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i7, list, z6);
    }

    public static void W(int i7, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i7, list, e0Var);
    }

    public static void X(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.v(i7, list, z6);
    }

    public static void Y(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.f(i7, list, z6);
    }

    public static void Z(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i7, list, z6);
    }

    static int a(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC0615j.P(i7) + AbstractC0615j.y(size) : size * AbstractC0615j.c(i7, true);
    }

    public static void a0(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.C(i7, list, z6);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i7, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.k(i7, list);
    }

    static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = size * AbstractC0615j.P(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            iP += AbstractC0615j.g((AbstractC0612g) list.get(i8));
        }
        return iP;
    }

    public static void c0(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.B(i7, list, z6);
    }

    static int d(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        int iP = AbstractC0615j.P(i7);
        return z6 ? iP + AbstractC0615j.y(iE) : iE + (size * iP);
    }

    public static void d0(int i7, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i7, list, z6);
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0628x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iK += AbstractC0615j.k(((Integer) list.get(i7)).intValue());
        }
        return iK;
    }

    static int f(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC0615j.P(i7) + AbstractC0615j.y(size * 4) : size * AbstractC0615j.l(i7, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC0615j.P(i7) + AbstractC0615j.y(size * 8) : size * AbstractC0615j.n(i7, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i7, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iR += AbstractC0615j.r(i7, (O) list.get(i8), e0Var);
        }
        return iR;
    }

    static int k(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        int iP = AbstractC0615j.P(i7);
        return z6 ? iP + AbstractC0615j.y(iL) : iL + (size * iP);
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0628x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iV += AbstractC0615j.v(((Integer) list.get(i7)).intValue());
        }
        return iV;
    }

    static int m(int i7, List list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z6 ? AbstractC0615j.P(i7) + AbstractC0615j.y(iN) : iN + (list.size() * AbstractC0615j.P(i7));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iX += AbstractC0615j.x(((Long) list.get(i7)).longValue());
        }
        return iX;
    }

    static int o(int i7, Object obj, e0 e0Var) {
        return AbstractC0615j.z(i7, (O) obj, e0Var);
    }

    static int p(int i7, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = AbstractC0615j.P(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            iP += AbstractC0615j.B((O) list.get(i8), e0Var);
        }
        return iP;
    }

    static int q(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        int iP = AbstractC0615j.P(i7);
        return z6 ? iP + AbstractC0615j.y(iR) : iR + (size * iP);
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0628x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iK += AbstractC0615j.K(((Integer) list.get(i7)).intValue());
        }
        return iK;
    }

    static int s(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        int iP = AbstractC0615j.P(i7);
        return z6 ? iP + AbstractC0615j.y(iT) : iT + (size * iP);
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM += AbstractC0615j.M(((Long) list.get(i7)).longValue());
        }
        return iM;
    }

    static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iP = AbstractC0615j.P(i7) * size;
        if (list instanceof D) {
            D d7 = (D) list;
            while (i8 < size) {
                Object objR0 = d7.R0(i8);
                iP += objR0 instanceof AbstractC0612g ? AbstractC0615j.g((AbstractC0612g) objR0) : AbstractC0615j.O((String) objR0);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                iP += obj instanceof AbstractC0612g ? AbstractC0615j.g((AbstractC0612g) obj) : AbstractC0615j.O((String) obj);
                i8++;
            }
        }
        return iP;
    }

    static int v(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        int iP = AbstractC0615j.P(i7);
        return z6 ? iP + AbstractC0615j.y(iW) : iW + (size * iP);
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0628x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iR += AbstractC0615j.R(((Integer) list.get(i7)).intValue());
        }
        return iR;
    }

    static int x(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        int iP = AbstractC0615j.P(i7);
        return z6 ? iP + AbstractC0615j.y(iY) : iY + (size * iP);
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iT += AbstractC0615j.T(((Long) list.get(i7)).longValue());
        }
        return iT;
    }

    static Object z(int i7, List list, AbstractC0629y.a aVar, Object obj, l0 l0Var) {
        if (aVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int iIntValue = num.intValue();
                if (aVar.a(iIntValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj = K(i7, iIntValue, obj, l0Var);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue2)) {
                    obj = K(i7, iIntValue2, obj, l0Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
