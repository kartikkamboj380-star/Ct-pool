package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1301j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f15202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1348x1 f15203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1348x1 f15204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15205d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC1348x1 abstractC1348x1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f15202a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC1348x1 = (AbstractC1348x1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f15203b = abstractC1348x1;
        f15204c = new C1354z1();
    }

    public static void A(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.g(i7, list, z6);
    }

    public static void B(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.e(i7, list, z6);
    }

    public static void C(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.c(i7, list, z6);
    }

    public static void D(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.f(i7, list, z6);
    }

    public static void E(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.E(i7, list, z6);
    }

    public static void F(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.q(i7, list, z6);
    }

    public static void G(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.z(i7, list, z6);
    }

    public static void a(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.j(i7, list, z6);
    }

    public static void b(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.p(i7, list, z6);
    }

    public static void c(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.u(i7, list, z6);
    }

    public static void d(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.D(i7, list, z6);
    }

    public static void e(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.o(i7, list, z6);
    }

    public static void f(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.x(i7, list, z6);
    }

    static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int h(List list) {
        int iX;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1332s0) {
            C1332s0 c1332s0 = (C1332s0) list;
            iX = 0;
            while (i7 < size) {
                iX += AbstractC1264a0.x(c1332s0.f(i7));
                i7++;
            }
        } else {
            iX = 0;
            while (i7 < size) {
                iX += AbstractC1264a0.x(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iX;
    }

    static int i(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1264a0.w(i7 << 3) + 4);
    }

    static int j(List list) {
        return list.size() * 4;
    }

    static int k(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1264a0.w(i7 << 3) + 8);
    }

    static int l(List list) {
        return list.size() * 8;
    }

    static int m(List list) {
        int iX;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1332s0) {
            C1332s0 c1332s0 = (C1332s0) list;
            iX = 0;
            while (i7 < size) {
                iX += AbstractC1264a0.x(c1332s0.f(i7));
                i7++;
            }
        } else {
            iX = 0;
            while (i7 < size) {
                iX += AbstractC1264a0.x(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iX;
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof M0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iX += AbstractC1264a0.x(((Long) list.get(i7)).longValue());
        }
        return iX;
    }

    static int o(int i7, Object obj, InterfaceC1293h1 interfaceC1293h1) {
        return AbstractC1264a0.w(i7 << 3) + AbstractC1264a0.u((W0) obj, interfaceC1293h1);
    }

    static int p(List list) {
        int iW;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1332s0) {
            C1332s0 c1332s0 = (C1332s0) list;
            iW = 0;
            while (i7 < size) {
                int iF = c1332s0.f(i7);
                iW += AbstractC1264a0.w((iF >> 31) ^ (iF + iF));
                i7++;
            }
        } else {
            iW = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iW += AbstractC1264a0.w((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
        }
        return iW;
    }

    static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof M0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iX += AbstractC1264a0.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iX;
    }

    static int r(List list) {
        int iW;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1332s0) {
            C1332s0 c1332s0 = (C1332s0) list;
            iW = 0;
            while (i7 < size) {
                iW += AbstractC1264a0.w(c1332s0.f(i7));
                i7++;
            }
        } else {
            iW = 0;
            while (i7 < size) {
                iW += AbstractC1264a0.w(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iW;
    }

    static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof M0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iX += AbstractC1264a0.x(((Long) list.get(i7)).longValue());
        }
        return iX;
    }

    public static AbstractC1348x1 t() {
        return f15203b;
    }

    public static AbstractC1348x1 u() {
        return f15204c;
    }

    static Object v(Object obj, int i7, int i8, Object obj2, AbstractC1348x1 abstractC1348x1) {
        if (obj2 == null) {
            obj2 = abstractC1348x1.c(obj);
        }
        abstractC1348x1.f(obj2, i7, i8);
        return obj2;
    }

    static void w(AbstractC1288g0 abstractC1288g0, Object obj, Object obj2) {
        C1304k0 c1304k0B = abstractC1288g0.b(obj2);
        if (c1304k0B.f15210a.isEmpty()) {
            return;
        }
        abstractC1288g0.c(obj).f(c1304k0B);
    }

    static void x(AbstractC1348x1 abstractC1348x1, Object obj, Object obj2) {
        abstractC1348x1.h(obj, abstractC1348x1.e(abstractC1348x1.d(obj), abstractC1348x1.d(obj2)));
    }

    public static void y(Class cls) {
        Class cls2;
        if (!AbstractC1329r0.class.isAssignableFrom(cls) && (cls2 = f15202a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void z(int i7, List list, P1 p12, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p12.b(i7, list, z6);
    }
}
