package x1;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import w5.y;

/* JADX INFO: renamed from: x1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2216g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22828c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2216g f22829d = new C2216g(-1, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2216g f22830e = new C2216g(-2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2216g f22831f = new C2216g(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22833b;

    /* JADX INFO: renamed from: x1.g$a */
    public static final class a {
        private a() {
        }

        public final C2216g a() {
            return C2216g.f22829d;
        }

        public final C2216g b() {
            return C2216g.f22830e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C2216g(int i7, boolean z6) {
        this.f22832a = i7;
        this.f22833b = z6;
    }

    public static final C2216g c() {
        return f22828c.a();
    }

    public static final C2216g e() {
        return f22828c.b();
    }

    public final boolean d() {
        return this.f22833b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2216g)) {
            return false;
        }
        C2216g c2216g = (C2216g) obj;
        return this.f22832a == c2216g.f22832a && this.f22833b == c2216g.f22833b;
    }

    public final int f() {
        if (!h()) {
            return this.f22832a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF".toString());
    }

    public final boolean g() {
        return this.f22832a != -2;
    }

    public final boolean h() {
        return this.f22832a == -1;
    }

    public int hashCode() {
        return W0.b.b(Integer.valueOf(this.f22832a), Boolean.valueOf(this.f22833b));
    }

    public String toString() {
        y yVar = y.f22743a;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f22832a), Boolean.valueOf(this.f22833b)}, 2));
        k.e(str, "format(locale, format, *args)");
        return str;
    }
}
