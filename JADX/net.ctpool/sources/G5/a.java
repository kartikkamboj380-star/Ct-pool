package G5;

import C5.f;
import F5.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0020a f1268n = new C0020a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f1269o = l(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f1270p = c.e(4611686018427387903L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f1271q = c.e(-4611686018427387903L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f1272m;

    /* JADX INFO: renamed from: G5.a$a, reason: collision with other inner class name */
    public static final class C0020a {
        private C0020a() {
        }

        public /* synthetic */ C0020a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ a(long j7) {
        this.f1272m = j7;
    }

    public static final boolean A(long j7) {
        return !D(j7);
    }

    private static final boolean B(long j7) {
        return (((int) j7) & 1) == 1;
    }

    private static final boolean C(long j7) {
        return (((int) j7) & 1) == 0;
    }

    public static final boolean D(long j7) {
        return j7 == f1270p || j7 == f1271q;
    }

    public static final boolean E(long j7) {
        return j7 < 0;
    }

    public static final boolean F(long j7) {
        return j7 > 0;
    }

    public static final long G(long j7, d dVar) {
        k.f(dVar, "unit");
        if (j7 == f1270p) {
            return Long.MAX_VALUE;
        }
        if (j7 == f1271q) {
            return Long.MIN_VALUE;
        }
        return e.a(y(j7), x(j7), dVar);
    }

    public static String H(long j7) {
        int i7;
        long j8;
        StringBuilder sb;
        int i8;
        int i9;
        String str;
        boolean z6;
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f1270p) {
            return "Infinity";
        }
        if (j7 == f1271q) {
            return "-Infinity";
        }
        boolean zE = E(j7);
        StringBuilder sb2 = new StringBuilder();
        if (zE) {
            sb2.append('-');
        }
        long jN = n(j7);
        long jP = p(jN);
        int iO = o(jN);
        int iU = u(jN);
        int iW = w(jN);
        int iV = v(jN);
        int i10 = 0;
        boolean z7 = jP != 0;
        boolean z8 = iO != 0;
        boolean z9 = iU != 0;
        boolean z10 = (iW == 0 && iV == 0) ? false : true;
        if (z7) {
            sb2.append(jP);
            sb2.append('d');
            i10 = 1;
        }
        if (z8 || (z7 && (z9 || z10))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iO);
            sb2.append('h');
            i10 = i11;
        }
        if (z9 || (z10 && (z8 || z7))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iU);
            sb2.append('m');
            i10 = i12;
        }
        if (z10) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iW != 0 || z7 || z8 || z9) {
                i7 = 9;
                j8 = j7;
                sb = sb2;
                i8 = iW;
                i9 = iV;
                str = "s";
                z6 = false;
            } else {
                if (iV >= 1000000) {
                    i8 = iV / 1000000;
                    i9 = iV % 1000000;
                    str = "ms";
                    z6 = false;
                    i7 = 6;
                } else if (iV >= 1000) {
                    i8 = iV / 1000;
                    i9 = iV % 1000;
                    str = "us";
                    z6 = false;
                    i7 = 3;
                } else {
                    sb2.append(iV);
                    sb2.append("ns");
                    i10 = i13;
                }
                j8 = j7;
                sb = sb2;
            }
            e(j8, sb, i8, i9, i7, str, z6);
            i10 = i13;
        }
        if (zE && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String string = sb2.toString();
        k.e(string, "toString(...)");
        return string;
    }

    public static final long I(long j7) {
        return c.d(-y(j7), ((int) j7) & 1);
    }

    private static final void e(long j7, StringBuilder sb, int i7, int i8, int i9, String str, boolean z6) {
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String strB0 = g.b0(String.valueOf(i8), i9, '0');
            int i10 = -1;
            int length = strB0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (strB0.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z6 || i12 >= 3) {
                sb.append((CharSequence) strB0, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strB0, 0, i12);
            }
            k.e(sb, "append(...)");
        }
        sb.append(str);
    }

    public static final /* synthetic */ a h(long j7) {
        return new a(j7);
    }

    public static int k(long j7, long j8) {
        long j9 = j7 ^ j8;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return k.h(j7, j8);
        }
        int i7 = (((int) j7) & 1) - (((int) j8) & 1);
        return E(j7) ? -i7 : i7;
    }

    public static long l(long j7) {
        if (b.a()) {
            if (C(j7)) {
                if (!new f(-4611686018426999999L, 4611686018426999999L).k(y(j7))) {
                    throw new AssertionError(y(j7) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new f(-4611686018427387903L, 4611686018427387903L).k(y(j7))) {
                    throw new AssertionError(y(j7) + " ms is out of milliseconds range");
                }
                if (new f(-4611686018426L, 4611686018426L).k(y(j7))) {
                    throw new AssertionError(y(j7) + " ms is denormalized");
                }
            }
        }
        return j7;
    }

    public static boolean m(long j7, Object obj) {
        return (obj instanceof a) && j7 == ((a) obj).J();
    }

    public static final long n(long j7) {
        return E(j7) ? I(j7) : j7;
    }

    public static final int o(long j7) {
        if (D(j7)) {
            return 0;
        }
        return (int) (q(j7) % ((long) 24));
    }

    public static final long p(long j7) {
        return G(j7, d.f1281t);
    }

    public static final long q(long j7) {
        return G(j7, d.f1280s);
    }

    public static final long r(long j7) {
        return (B(j7) && A(j7)) ? y(j7) : G(j7, d.f1277p);
    }

    public static final long s(long j7) {
        return G(j7, d.f1279r);
    }

    public static final long t(long j7) {
        return G(j7, d.f1278q);
    }

    public static final int u(long j7) {
        if (D(j7)) {
            return 0;
        }
        return (int) (s(j7) % ((long) 60));
    }

    public static final int v(long j7) {
        if (D(j7)) {
            return 0;
        }
        boolean zB = B(j7);
        long jY = y(j7);
        return (int) (zB ? c.g(jY % ((long) 1000)) : jY % ((long) 1000000000));
    }

    public static final int w(long j7) {
        if (D(j7)) {
            return 0;
        }
        return (int) (t(j7) % ((long) 60));
    }

    private static final d x(long j7) {
        return C(j7) ? d.f1275n : d.f1277p;
    }

    private static final long y(long j7) {
        return j7 >> 1;
    }

    public static int z(long j7) {
        return Long.hashCode(j7);
    }

    public final /* synthetic */ long J() {
        return this.f1272m;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return j(((a) obj).J());
    }

    public boolean equals(Object obj) {
        return m(this.f1272m, obj);
    }

    public int hashCode() {
        return z(this.f1272m);
    }

    public int j(long j7) {
        return k(this.f1272m, j7);
    }

    public String toString() {
        return H(this.f1272m);
    }
}
