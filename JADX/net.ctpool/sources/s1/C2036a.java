package s1;

import j5.AbstractC1803h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s1.C2038c;
import w5.k;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2036a implements C2038c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f22220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f22222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22223f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f22226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f22227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f22228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f22229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f22230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[][] f22231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f22232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f22233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f22234q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0310a f22219b = new C0310a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f22224g = C2040e.a("GIF87a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f22225h = C2040e.a("GIF89a");

    /* JADX INFO: renamed from: s1.a$a, reason: collision with other inner class name */
    public static final class C0310a {
        private C0310a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2038c i(byte[] bArr, int i7) {
            if (X0.b.h(bArr, 0, i7)) {
                return X0.b.g(bArr, 0) ? C2037b.f22242g : X0.b.f(bArr, 0) ? C2037b.f22243h : X0.b.c(bArr, 0, i7) ? X0.b.b(bArr, 0) ? C2037b.f22246k : X0.b.d(bArr, 0) ? C2037b.f22245j : C2037b.f22244i : C2038c.f22251d;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(byte[] bArr, int i7) {
            if (i7 < C2036a.f22226i.length) {
                return false;
            }
            return C2040e.c(bArr, C2036a.f22226i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(byte[] bArr, int i7) {
            return i7 >= C2036a.f22234q && (C2040e.c(bArr, C2036a.f22232o) || C2040e.c(bArr, C2036a.f22233p));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(byte[] bArr, int i7) {
            if (i7 < 6) {
                return false;
            }
            return C2040e.c(bArr, C2036a.f22224g) || C2040e.c(bArr, C2036a.f22225h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(byte[] bArr, int i7) {
            if (i7 < 12 || bArr[3] < 8 || !C2040e.b(bArr, C2036a.f22230m, 4)) {
                return false;
            }
            for (byte[] bArr2 : C2036a.f22231n) {
                if (C2040e.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(byte[] bArr, int i7) {
            if (i7 < C2036a.f22228k.length) {
                return false;
            }
            return C2040e.c(bArr, C2036a.f22228k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i7) {
            return i7 >= C2036a.f22220c.length && C2040e.c(bArr, C2036a.f22220c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p(byte[] bArr, int i7) {
            return i7 >= C2036a.f22222e.length && C2040e.c(bArr, C2036a.f22222e);
        }

        public /* synthetic */ C0310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f22220c = bArr;
        f22221d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f22222e = bArr2;
        f22223f = bArr2.length;
        byte[] bArrA = C2040e.a("BM");
        f22226i = bArrA;
        f22227j = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f22228k = bArr3;
        f22229l = bArr3.length;
        f22230m = C2040e.a("ftyp");
        f22231n = new byte[][]{C2040e.a("heic"), C2040e.a("heix"), C2040e.a("hevc"), C2040e.a("hevx"), C2040e.a("mif1"), C2040e.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f22232o = bArr4;
        f22233p = new byte[]{77, 77, 0, 42};
        f22234q = bArr4.length;
    }

    public C2036a() {
        Object objB = AbstractC1803h.B(new Integer[]{21, 20, Integer.valueOf(f22221d), Integer.valueOf(f22223f), 6, Integer.valueOf(f22227j), Integer.valueOf(f22229l), 12});
        if (objB == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f22235a = ((Number) objB).intValue();
    }

    @Override // s1.C2038c.b
    public int a() {
        return this.f22235a;
    }

    @Override // s1.C2038c.b
    public C2038c b(byte[] bArr, int i7) {
        k.f(bArr, "headerBytes");
        if (X0.b.h(bArr, 0, i7)) {
            return f22219b.i(bArr, i7);
        }
        C0310a c0310a = f22219b;
        return c0310a.o(bArr, i7) ? C2037b.f22237b : c0310a.p(bArr, i7) ? C2037b.f22238c : c0310a.l(bArr, i7) ? C2037b.f22239d : c0310a.j(bArr, i7) ? C2037b.f22240e : c0310a.n(bArr, i7) ? C2037b.f22241f : c0310a.m(bArr, i7) ? C2037b.f22247l : c0310a.k(bArr, i7) ? C2037b.f22248m : C2038c.f22251d;
    }
}
