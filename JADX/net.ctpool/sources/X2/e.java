package X2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f4330c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4332b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f4333a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f4334b = 0;

        a() {
        }

        public e a() {
            return new e(this.f4333a, this.f4334b);
        }

        public a b(long j7) {
            this.f4333a = j7;
            return this;
        }

        public a c(long j7) {
            this.f4334b = j7;
            return this;
        }
    }

    e(long j7, long j8) {
        this.f4331a = j7;
        this.f4332b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f4331a;
    }

    public long b() {
        return this.f4332b;
    }
}
