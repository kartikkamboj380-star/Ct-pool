package l0;

import android.net.Uri;
import j5.AbstractC1794M;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1844b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f21014i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1844b f21015j = new C1844b(null, false, false, false, false, 0, 0, null, 255, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f21016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f21021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f21022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f21023h;

    /* JADX INFO: renamed from: l0.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: l0.b$b, reason: collision with other inner class name */
    public static final class C0298b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f21024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21025b;

        public C0298b(Uri uri, boolean z6) {
            w5.k.f(uri, "uri");
            this.f21024a = uri;
            this.f21025b = z6;
        }

        public final Uri a() {
            return this.f21024a;
        }

        public final boolean b() {
            return this.f21025b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!w5.k.b(C0298b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            w5.k.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            C0298b c0298b = (C0298b) obj;
            return w5.k.b(this.f21024a, c0298b.f21024a) && this.f21025b == c0298b.f21025b;
        }

        public int hashCode() {
            return (this.f21024a.hashCode() * 31) + Boolean.hashCode(this.f21025b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1844b(C1844b c1844b) {
        w5.k.f(c1844b, "other");
        boolean z6 = c1844b.f21017b;
        boolean z7 = c1844b.f21018c;
        this(c1844b.f21016a, z6, z7, c1844b.f21019d, c1844b.f21020e, c1844b.f21021f, c1844b.f21022g, c1844b.f21023h);
    }

    public final long a() {
        return this.f21022g;
    }

    public final long b() {
        return this.f21021f;
    }

    public final Set c() {
        return this.f21023h;
    }

    public final j d() {
        return this.f21016a;
    }

    public final boolean e() {
        return !this.f21023h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !w5.k.b(C1844b.class, obj.getClass())) {
            return false;
        }
        C1844b c1844b = (C1844b) obj;
        if (this.f21017b == c1844b.f21017b && this.f21018c == c1844b.f21018c && this.f21019d == c1844b.f21019d && this.f21020e == c1844b.f21020e && this.f21021f == c1844b.f21021f && this.f21022g == c1844b.f21022g && this.f21016a == c1844b.f21016a) {
            return w5.k.b(this.f21023h, c1844b.f21023h);
        }
        return false;
    }

    public final boolean f() {
        return this.f21019d;
    }

    public final boolean g() {
        return this.f21017b;
    }

    public final boolean h() {
        return this.f21018c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f21016a.hashCode() * 31) + (this.f21017b ? 1 : 0)) * 31) + (this.f21018c ? 1 : 0)) * 31) + (this.f21019d ? 1 : 0)) * 31) + (this.f21020e ? 1 : 0)) * 31;
        long j7 = this.f21021f;
        int i7 = (iHashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f21022g;
        return ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f21023h.hashCode();
    }

    public final boolean i() {
        return this.f21020e;
    }

    public C1844b(j jVar, boolean z6, boolean z7, boolean z8, boolean z9, long j7, long j8, Set set) {
        w5.k.f(jVar, "requiredNetworkType");
        w5.k.f(set, "contentUriTriggers");
        this.f21016a = jVar;
        this.f21017b = z6;
        this.f21018c = z7;
        this.f21019d = z8;
        this.f21020e = z9;
        this.f21021f = j7;
        this.f21022g = j8;
        this.f21023h = set;
    }

    public /* synthetic */ C1844b(j jVar, boolean z6, boolean z7, boolean z8, boolean z9, long j7, long j8, Set set, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? j.NOT_REQUIRED : jVar, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? false : z7, (i7 & 8) != 0 ? false : z8, (i7 & 16) == 0 ? z9 : false, (i7 & 32) != 0 ? -1L : j7, (i7 & 64) == 0 ? j8 : -1L, (i7 & 128) != 0 ? AbstractC1794M.d() : set);
    }
}
