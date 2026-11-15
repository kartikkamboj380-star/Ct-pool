package b3;

import b3.f;
import java.util.Set;

/* JADX INFO: renamed from: b3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0678c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f9583c;

    /* JADX INFO: renamed from: b3.c$b */
    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f9584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f9585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f9586c;

        b() {
        }

        @Override // b3.f.b.a
        public f.b a() {
            String str = "";
            if (this.f9584a == null) {
                str = " delta";
            }
            if (this.f9585b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f9586c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C0678c(this.f9584a.longValue(), this.f9585b.longValue(), this.f9586c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b3.f.b.a
        public f.b.a b(long j7) {
            this.f9584a = Long.valueOf(j7);
            return this;
        }

        @Override // b3.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f9586c = set;
            return this;
        }

        @Override // b3.f.b.a
        public f.b.a d(long j7) {
            this.f9585b = Long.valueOf(j7);
            return this;
        }
    }

    private C0678c(long j7, long j8, Set set) {
        this.f9581a = j7;
        this.f9582b = j8;
        this.f9583c = set;
    }

    @Override // b3.f.b
    long b() {
        return this.f9581a;
    }

    @Override // b3.f.b
    Set c() {
        return this.f9583c;
    }

    @Override // b3.f.b
    long d() {
        return this.f9582b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f9581a == bVar.b() && this.f9582b == bVar.d() && this.f9583c.equals(bVar.c());
    }

    public int hashCode() {
        long j7 = this.f9581a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j8 = this.f9582b;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f9583c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f9581a + ", maxAllowedDelay=" + this.f9582b + ", flags=" + this.f9583c + "}";
    }
}
