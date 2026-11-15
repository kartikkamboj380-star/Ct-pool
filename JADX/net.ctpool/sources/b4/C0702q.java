package b4;

/* JADX INFO: renamed from: b4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0702q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0684E f9714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9716c;

    private C0702q(C0684E c0684e, int i7, int i8) {
        this.f9714a = (C0684E) AbstractC0683D.c(c0684e, "Null dependency anInterface.");
        this.f9715b = i7;
        this.f9716c = i8;
    }

    public static C0702q a(Class cls) {
        return new C0702q(cls, 0, 2);
    }

    private static String b(int i7) {
        if (i7 == 0) {
            return "direct";
        }
        if (i7 == 1) {
            return "provider";
        }
        if (i7 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i7);
    }

    public static C0702q h(Class cls) {
        return new C0702q(cls, 0, 0);
    }

    public static C0702q i(C0684E c0684e) {
        return new C0702q(c0684e, 0, 1);
    }

    public static C0702q j(Class cls) {
        return new C0702q(cls, 0, 1);
    }

    public static C0702q k(C0684E c0684e) {
        return new C0702q(c0684e, 1, 0);
    }

    public static C0702q l(Class cls) {
        return new C0702q(cls, 1, 0);
    }

    public static C0702q m(C0684E c0684e) {
        return new C0702q(c0684e, 1, 1);
    }

    public static C0702q n(Class cls) {
        return new C0702q(cls, 1, 1);
    }

    public static C0702q o(Class cls) {
        return new C0702q(cls, 2, 0);
    }

    public C0684E c() {
        return this.f9714a;
    }

    public boolean d() {
        return this.f9716c == 2;
    }

    public boolean e() {
        return this.f9716c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0702q)) {
            return false;
        }
        C0702q c0702q = (C0702q) obj;
        return this.f9714a.equals(c0702q.f9714a) && this.f9715b == c0702q.f9715b && this.f9716c == c0702q.f9716c;
    }

    public boolean f() {
        return this.f9715b == 1;
    }

    public boolean g() {
        return this.f9715b == 2;
    }

    public int hashCode() {
        return ((((this.f9714a.hashCode() ^ 1000003) * 1000003) ^ this.f9715b) * 1000003) ^ this.f9716c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f9714a);
        sb.append(", type=");
        int i7 = this.f9715b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f9716c));
        sb.append("}");
        return sb.toString();
    }

    private C0702q(Class cls, int i7, int i8) {
        this(C0684E.b(cls), i7, i8);
    }
}
