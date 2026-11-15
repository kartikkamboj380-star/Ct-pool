package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f17775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static E f17777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static E f17778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static E f17779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static E f17780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f17781j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    H f17782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    E f17783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f17784c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17786b;

        static {
            int[] iArr = new int[EnumC1567f.values().length];
            f17786b = iArr;
            try {
                iArr[EnumC1567f.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17786b[EnumC1567f.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17786b[EnumC1567f.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17786b[EnumC1567f.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17786b[EnumC1567f.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[H.values().length];
            f17785a = iArr2;
            try {
                iArr2[H.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17785a[H.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17785a[H.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private G(H h7, E e7, double d7) {
        this.f17782a = h7;
        this.f17783b = e7;
        this.f17784c = d7;
    }

    private static double a(double d7, double d8) {
        if (Math.abs(d7 - d8) > 180.0d) {
            d7 += 360.0d;
        }
        return (d7 + d8) / 2.0d;
    }

    private static void b(K k7, E e7, E e8, E e9) {
        k7.f17807a = k(e8, e7);
        k7.f17808b = k(e9, e8);
        if (i(k7.f17807a)) {
            k7.f17807a = k7.f17808b;
        } else if (i(k7.f17808b)) {
            k7.f17808b = k7.f17807a;
        }
    }

    private static double c(H h7) {
        double dJ = j(f(f17779h));
        double dJ2 = j(f(f17780i));
        int i7 = a.f17785a[h7.ordinal()];
        if (i7 == 1) {
            return f17781j ? dJ2 + 180.0d : dJ2;
        }
        if (i7 == 2) {
            return a(dJ, dJ2);
        }
        if (i7 != 3) {
            return 0.0d;
        }
        return dJ;
    }

    private static K d(A a7) {
        E e7;
        K k7 = new K();
        E[] eArr = a7.f17743b;
        int i7 = a.f17786b[a7.f17742a.ordinal()];
        if (i7 == 1) {
            k7.f17809c = eArr[2];
            k7.f17807a = k(eArr[0], f17777f);
            k7.f17808b = k(eArr[2], eArr[1]);
            if (i(k7.f17807a)) {
                b(k7, eArr[0], eArr[1], eArr[2]);
            } else if (i(k7.f17808b)) {
                b(k7, f17777f, eArr[0], eArr[1]);
            }
        } else if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                e7 = eArr[0];
            } else if (i7 == 5) {
                e7 = f17778g;
            }
            k7.f17809c = e7;
            k7.f17807a = k(e7, f17777f);
            k7.f17808b = k(k7.f17809c, f17777f);
        } else {
            E e8 = eArr[1];
            k7.f17809c = e8;
            b(k7, f17777f, eArr[0], e8);
        }
        return k7;
    }

    private static void e() {
        H h7 = H.kEndMarker;
        f17775d.add(new G(h7, f17777f, c(h7)));
    }

    private static double f(E e7) {
        return Math.atan2(e7.f17773b, e7.f17772a);
    }

    private static void g(A a7) {
        E e7;
        K kD = d(a7);
        f17780i = kD.f17807a;
        int i7 = f17776e;
        if (i7 > 0) {
            H h7 = i7 == 1 ? H.kStartMarker : H.kMidMarker;
            f17775d.add(new G(h7, f17777f, c(h7)));
        }
        f17779h = kD.f17808b;
        f17777f = kD.f17809c;
        EnumC1567f enumC1567f = a7.f17742a;
        if (enumC1567f != EnumC1567f.kCGPathElementMoveToPoint) {
            if (enumC1567f == EnumC1567f.kCGPathElementCloseSubpath) {
                e7 = new E(0.0d, 0.0d);
            }
            f17776e++;
        }
        e7 = a7.f17743b[0];
        f17778g = e7;
        f17776e++;
    }

    static ArrayList h(ArrayList arrayList) {
        f17775d = new ArrayList();
        f17776e = 0;
        f17777f = new E(0.0d, 0.0d);
        f17778g = new E(0.0d, 0.0d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((A) it.next());
        }
        e();
        return f17775d;
    }

    private static boolean i(E e7) {
        return e7.f17772a == 0.0d && e7.f17773b == 0.0d;
    }

    private static double j(double d7) {
        return d7 * 57.29577951308232d;
    }

    private static E k(E e7, E e8) {
        return new E(e8.f17772a - e7.f17772a, e8.f17773b - e7.f17773b);
    }
}
