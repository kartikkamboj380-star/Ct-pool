package X2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f4311c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f4313b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f4314a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f4315b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f4314a, this.f4315b);
        }

        public a b(long j7) {
            this.f4314a = j7;
            return this;
        }

        public a c(b bVar) {
            this.f4315b = bVar;
            return this;
        }
    }

    public enum b implements z4.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f4324m;

        b(int i7) {
            this.f4324m = i7;
        }

        @Override // z4.c
        public int d() {
            return this.f4324m;
        }
    }

    c(long j7, b bVar) {
        this.f4312a = j7;
        this.f4313b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f4312a;
    }

    public b b() {
        return this.f4313b;
    }
}
