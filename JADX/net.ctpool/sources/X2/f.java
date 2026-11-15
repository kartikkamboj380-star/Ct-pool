package X2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f4335c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4337b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f4338a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f4339b = 0;

        a() {
        }

        public f a() {
            return new f(this.f4338a, this.f4339b);
        }

        public a b(long j7) {
            this.f4339b = j7;
            return this;
        }

        public a c(long j7) {
            this.f4338a = j7;
            return this;
        }
    }

    f(long j7, long j8) {
        this.f4336a = j7;
        this.f4337b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f4337b;
    }

    public long b() {
        return this.f4336a;
    }
}
