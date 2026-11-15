package W5;

import F5.g;
import T5.B;
import T5.C0458d;
import T5.D;
import T5.t;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4182c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f4183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f4184b;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(D d7, B b7) {
            k.f(d7, "response");
            k.f(b7, "request");
            int iF = d7.f();
            if (iF != 200 && iF != 410 && iF != 414 && iF != 501 && iF != 203 && iF != 204) {
                if (iF == 307) {
                    if (D.o(d7, "Expires", null, 2, null) == null && d7.b().c() == -1 && !d7.b().b() && !d7.b().a()) {
                        return false;
                    }
                } else if (iF != 308 && iF != 404 && iF != 405) {
                    switch (iF) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (d7.b().h() || b7.b().h()) ? false : true;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Date f4185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Date f4187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Date f4189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f4190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f4191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f4192h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f4193i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f4194j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final B f4195k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final D f4196l;

        public b(long j7, B b7, D d7) {
            k.f(b7, "request");
            this.f4194j = j7;
            this.f4195k = b7;
            this.f4196l = d7;
            this.f4193i = -1;
            if (d7 != null) {
                this.f4190f = d7.n0();
                this.f4191g = d7.h0();
                t tVarW = d7.w();
                int size = tVarW.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String strH = tVarW.h(i7);
                    String strM = tVarW.m(i7);
                    if (g.p(strH, "Date", true)) {
                        this.f4185a = Z5.c.a(strM);
                        this.f4186b = strM;
                    } else if (g.p(strH, "Expires", true)) {
                        this.f4189e = Z5.c.a(strM);
                    } else if (g.p(strH, "Last-Modified", true)) {
                        this.f4187c = Z5.c.a(strM);
                        this.f4188d = strM;
                    } else if (g.p(strH, "ETag", true)) {
                        this.f4192h = strM;
                    } else if (g.p(strH, "Age", true)) {
                        this.f4193i = U5.c.U(strM, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f4185a;
            long jMax = date != null ? Math.max(0L, this.f4191g - date.getTime()) : 0L;
            int i7 = this.f4193i;
            if (i7 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i7));
            }
            long j7 = this.f4191g;
            return jMax + (j7 - this.f4190f) + (this.f4194j - j7);
        }

        private final c c() {
            String str;
            if (this.f4196l == null) {
                return new c(this.f4195k, null);
            }
            if ((!this.f4195k.g() || this.f4196l.j() != null) && c.f4182c.a(this.f4196l, this.f4195k)) {
                C0458d c0458dB = this.f4195k.b();
                if (c0458dB.g() || e(this.f4195k)) {
                    return new c(this.f4195k, null);
                }
                C0458d c0458dB2 = this.f4196l.b();
                long jA = a();
                long jD = d();
                if (c0458dB.c() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(c0458dB.c()));
                }
                long millis = 0;
                long millis2 = c0458dB.e() != -1 ? TimeUnit.SECONDS.toMillis(c0458dB.e()) : 0L;
                if (!c0458dB2.f() && c0458dB.d() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(c0458dB.d());
                }
                if (!c0458dB2.g()) {
                    long j7 = millis2 + jA;
                    if (j7 < millis + jD) {
                        D.a aVarU = this.f4196l.U();
                        if (j7 >= jD) {
                            aVarU.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            aVarU.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, aVarU.c());
                    }
                }
                String str2 = this.f4192h;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f4187c != null) {
                        str2 = this.f4188d;
                    } else {
                        if (this.f4185a == null) {
                            return new c(this.f4195k, null);
                        }
                        str2 = this.f4186b;
                    }
                    str = "If-Modified-Since";
                }
                t.a aVarI = this.f4195k.e().i();
                k.c(str2);
                aVarI.c(str, str2);
                return new c(this.f4195k.i().f(aVarI.e()).b(), this.f4196l);
            }
            return new c(this.f4195k, null);
        }

        private final long d() {
            D d7 = this.f4196l;
            k.c(d7);
            if (d7.b().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.f4189e;
            if (date != null) {
                Date date2 = this.f4185a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f4191g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f4187c == null || this.f4196l.j0().l().m() != null) {
                return 0L;
            }
            Date date3 = this.f4185a;
            long time2 = date3 != null ? date3.getTime() : this.f4190f;
            Date date4 = this.f4187c;
            k.c(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        private final boolean e(B b7) {
            return (b7.d("If-Modified-Since") == null && b7.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            D d7 = this.f4196l;
            k.c(d7);
            return d7.b().c() == -1 && this.f4189e == null;
        }

        public final c b() {
            c cVarC = c();
            return (cVarC.b() == null || !this.f4195k.b().i()) ? cVarC : new c(null, null);
        }
    }

    public c(B b7, D d7) {
        this.f4183a = b7;
        this.f4184b = d7;
    }

    public final D a() {
        return this.f4184b;
    }

    public final B b() {
        return this.f4183a;
    }
}
