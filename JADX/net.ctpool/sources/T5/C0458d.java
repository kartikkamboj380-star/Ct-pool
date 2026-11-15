package T5;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: T5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0458d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f3409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f3412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f3413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f3414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f3415m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f3402p = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0458d f3400n = new a().d().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0458d f3401o = new a().f().c(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: T5.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f3417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3418c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3419d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3420e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f3422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f3423h;

        private final int b(long j7) {
            return j7 > ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j7;
        }

        public final C0458d a() {
            return new C0458d(this.f3416a, this.f3417b, this.f3418c, -1, false, false, false, this.f3419d, this.f3420e, this.f3421f, this.f3422g, this.f3423h, null, null);
        }

        public final a c(int i7, TimeUnit timeUnit) {
            w5.k.f(timeUnit, "timeUnit");
            if (i7 >= 0) {
                this.f3419d = b(timeUnit.toSeconds(i7));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i7).toString());
        }

        public final a d() {
            this.f3416a = true;
            return this;
        }

        public final a e() {
            this.f3417b = true;
            return this;
        }

        public final a f() {
            this.f3421f = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: T5.d$b */
    public static final class b {
        private b() {
        }

        private final int a(String str, String str2, int i7) {
            int length = str.length();
            while (i7 < length) {
                if (F5.g.F(str2, str.charAt(i7), false, 2, null)) {
                    return i7;
                }
                i7++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0458d b(t tVar) {
            int i7;
            int i8;
            boolean z6;
            int iA;
            String string;
            t tVar2 = tVar;
            w5.k.f(tVar2, "headers");
            int size = tVar.size();
            boolean z7 = true;
            boolean z8 = true;
            int i9 = 0;
            String str = null;
            boolean z9 = false;
            boolean z10 = false;
            int iU = -1;
            int iU2 = -1;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int iU3 = -1;
            int iU4 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            while (i9 < size) {
                String strH = tVar2.h(i9);
                String strM = tVar2.m(i9);
                if (F5.g.p(strH, "Cache-Control", z7)) {
                    if (str == null) {
                        str = strM;
                    }
                    i8 = 0;
                    while (i8 < strM.length()) {
                        int iA2 = a(strM, "=,;", i8);
                        String strSubstring = strM.substring(i8, iA2);
                        w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (strSubstring == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        String string2 = F5.g.C0(strSubstring).toString();
                        int i10 = size;
                        if (iA2 != strM.length()) {
                            z6 = z8;
                            if (strM.charAt(iA2) != ',' && strM.charAt(iA2) != ';') {
                                int iA3 = U5.c.A(strM, iA2 + 1);
                                if (iA3 >= strM.length() || strM.charAt(iA3) != '\"') {
                                    iA = a(strM, ",;", iA3);
                                    String strSubstring2 = strM.substring(iA3, iA);
                                    w5.k.e(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    if (strSubstring2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                    string = F5.g.C0(strSubstring2).toString();
                                } else {
                                    int i11 = iA3 + 1;
                                    int iQ = F5.g.Q(strM, '\"', i11, false, 4, null);
                                    string = strM.substring(i11, iQ);
                                    w5.k.e(string, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    iA = iQ + 1;
                                }
                            }
                            z7 = true;
                            if (!F5.g.p("no-cache", string2, true)) {
                                z9 = true;
                            } else if (F5.g.p("no-store", string2, true)) {
                                z10 = true;
                            } else {
                                if (F5.g.p("max-age", string2, true)) {
                                    iU = U5.c.U(string, -1);
                                } else if (F5.g.p("s-maxage", string2, true)) {
                                    iU2 = U5.c.U(string, -1);
                                } else if (F5.g.p("private", string2, true)) {
                                    z11 = true;
                                } else if (F5.g.p("public", string2, true)) {
                                    z12 = true;
                                } else if (F5.g.p("must-revalidate", string2, true)) {
                                    z13 = true;
                                } else if (F5.g.p("max-stale", string2, true)) {
                                    iU3 = U5.c.U(string, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                } else if (F5.g.p("min-fresh", string2, true)) {
                                    iU4 = U5.c.U(string, -1);
                                } else if (F5.g.p("only-if-cached", string2, true)) {
                                    z14 = true;
                                } else if (F5.g.p("no-transform", string2, true)) {
                                    z15 = true;
                                } else if (F5.g.p("immutable", string2, true)) {
                                    z16 = true;
                                }
                                i8 = iA;
                                size = i10;
                                z8 = z6;
                            }
                            i8 = iA;
                            size = i10;
                            z8 = z6;
                        } else {
                            z6 = z8;
                        }
                        iA = iA2 + 1;
                        string = null;
                        z7 = true;
                        if (!F5.g.p("no-cache", string2, true)) {
                        }
                        i8 = iA;
                        size = i10;
                        z8 = z6;
                    }
                    i7 = size;
                    i9++;
                    tVar2 = tVar;
                    size = i7;
                } else if (!F5.g.p(strH, "Pragma", z7)) {
                    i7 = size;
                    i9++;
                    tVar2 = tVar;
                    size = i7;
                }
                z8 = false;
                i8 = 0;
                while (i8 < strM.length()) {
                }
                i7 = size;
                i9++;
                tVar2 = tVar;
                size = i7;
            }
            return new C0458d(z9, z10, iU, iU2, z11, z12, z13, iU3, iU4, z14, z15, z16, !z8 ? null : str, null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C0458d(boolean z6, boolean z7, int i7, int i8, boolean z8, boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, String str) {
        this.f3403a = z6;
        this.f3404b = z7;
        this.f3405c = i7;
        this.f3406d = i8;
        this.f3407e = z8;
        this.f3408f = z9;
        this.f3409g = z10;
        this.f3410h = i9;
        this.f3411i = i10;
        this.f3412j = z11;
        this.f3413k = z12;
        this.f3414l = z13;
        this.f3415m = str;
    }

    public final boolean a() {
        return this.f3407e;
    }

    public final boolean b() {
        return this.f3408f;
    }

    public final int c() {
        return this.f3405c;
    }

    public final int d() {
        return this.f3410h;
    }

    public final int e() {
        return this.f3411i;
    }

    public final boolean f() {
        return this.f3409g;
    }

    public final boolean g() {
        return this.f3403a;
    }

    public final boolean h() {
        return this.f3404b;
    }

    public final boolean i() {
        return this.f3412j;
    }

    public String toString() {
        String str = this.f3415m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3403a) {
            sb.append("no-cache, ");
        }
        if (this.f3404b) {
            sb.append("no-store, ");
        }
        if (this.f3405c != -1) {
            sb.append("max-age=");
            sb.append(this.f3405c);
            sb.append(", ");
        }
        if (this.f3406d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f3406d);
            sb.append(", ");
        }
        if (this.f3407e) {
            sb.append("private, ");
        }
        if (this.f3408f) {
            sb.append("public, ");
        }
        if (this.f3409g) {
            sb.append("must-revalidate, ");
        }
        if (this.f3410h != -1) {
            sb.append("max-stale=");
            sb.append(this.f3410h);
            sb.append(", ");
        }
        if (this.f3411i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f3411i);
            sb.append(", ");
        }
        if (this.f3412j) {
            sb.append("only-if-cached, ");
        }
        if (this.f3413k) {
            sb.append("no-transform, ");
        }
        if (this.f3414l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f3415m = string;
        return string;
    }

    public /* synthetic */ C0458d(boolean z6, boolean z7, int i7, int i8, boolean z8, boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z6, z7, i7, i8, z8, z9, z10, i9, i10, z11, z12, z13, str);
    }
}
