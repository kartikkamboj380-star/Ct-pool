package c3;

import c3.AbstractC0718e;

/* JADX INFO: renamed from: c3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0714a extends AbstractC0718e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f10039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f10042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10043f;

    /* JADX INFO: renamed from: c3.a$b */
    static final class b extends AbstractC0718e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f10044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f10045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f10046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f10047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f10048e;

        b() {
        }

        @Override // c3.AbstractC0718e.a
        AbstractC0718e a() {
            String str = "";
            if (this.f10044a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f10045b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f10046c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f10047d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f10048e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0714a(this.f10044a.longValue(), this.f10045b.intValue(), this.f10046c.intValue(), this.f10047d.longValue(), this.f10048e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c3.AbstractC0718e.a
        AbstractC0718e.a b(int i7) {
            this.f10046c = Integer.valueOf(i7);
            return this;
        }

        @Override // c3.AbstractC0718e.a
        AbstractC0718e.a c(long j7) {
            this.f10047d = Long.valueOf(j7);
            return this;
        }

        @Override // c3.AbstractC0718e.a
        AbstractC0718e.a d(int i7) {
            this.f10045b = Integer.valueOf(i7);
            return this;
        }

        @Override // c3.AbstractC0718e.a
        AbstractC0718e.a e(int i7) {
            this.f10048e = Integer.valueOf(i7);
            return this;
        }

        @Override // c3.AbstractC0718e.a
        AbstractC0718e.a f(long j7) {
            this.f10044a = Long.valueOf(j7);
            return this;
        }
    }

    private C0714a(long j7, int i7, int i8, long j8, int i9) {
        this.f10039b = j7;
        this.f10040c = i7;
        this.f10041d = i8;
        this.f10042e = j8;
        this.f10043f = i9;
    }

    @Override // c3.AbstractC0718e
    int b() {
        return this.f10041d;
    }

    @Override // c3.AbstractC0718e
    long c() {
        return this.f10042e;
    }

    @Override // c3.AbstractC0718e
    int d() {
        return this.f10040c;
    }

    @Override // c3.AbstractC0718e
    int e() {
        return this.f10043f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0718e)) {
            return false;
        }
        AbstractC0718e abstractC0718e = (AbstractC0718e) obj;
        return this.f10039b == abstractC0718e.f() && this.f10040c == abstractC0718e.d() && this.f10041d == abstractC0718e.b() && this.f10042e == abstractC0718e.c() && this.f10043f == abstractC0718e.e();
    }

    @Override // c3.AbstractC0718e
    long f() {
        return this.f10039b;
    }

    public int hashCode() {
        long j7 = this.f10039b;
        int i7 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f10040c) * 1000003) ^ this.f10041d) * 1000003;
        long j8 = this.f10042e;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f10043f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f10039b + ", loadBatchSize=" + this.f10040c + ", criticalSectionEnterTimeoutMs=" + this.f10041d + ", eventCleanUpAge=" + this.f10042e + ", maxBlobByteSizePerRow=" + this.f10043f + "}";
    }
}
