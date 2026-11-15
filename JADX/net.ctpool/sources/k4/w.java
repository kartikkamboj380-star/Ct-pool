package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class w extends F.e.d.AbstractC0292e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F.e.d.AbstractC0292e.b f20948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20951d;

    static final class b extends F.e.d.AbstractC0292e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F.e.d.AbstractC0292e.b f20952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f20956e;

        b() {
        }

        @Override // k4.F.e.d.AbstractC0292e.a
        public F.e.d.AbstractC0292e a() {
            F.e.d.AbstractC0292e.b bVar;
            String str;
            String str2;
            if (this.f20956e == 1 && (bVar = this.f20952a) != null && (str = this.f20953b) != null && (str2 = this.f20954c) != null) {
                return new w(bVar, str, str2, this.f20955d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20952a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f20953b == null) {
                sb.append(" parameterKey");
            }
            if (this.f20954c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f20956e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.AbstractC0292e.a
        public F.e.d.AbstractC0292e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f20953b = str;
            return this;
        }

        @Override // k4.F.e.d.AbstractC0292e.a
        public F.e.d.AbstractC0292e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f20954c = str;
            return this;
        }

        @Override // k4.F.e.d.AbstractC0292e.a
        public F.e.d.AbstractC0292e.a d(F.e.d.AbstractC0292e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f20952a = bVar;
            return this;
        }

        @Override // k4.F.e.d.AbstractC0292e.a
        public F.e.d.AbstractC0292e.a e(long j7) {
            this.f20955d = j7;
            this.f20956e = (byte) (this.f20956e | 1);
            return this;
        }
    }

    private w(F.e.d.AbstractC0292e.b bVar, String str, String str2, long j7) {
        this.f20948a = bVar;
        this.f20949b = str;
        this.f20950c = str2;
        this.f20951d = j7;
    }

    @Override // k4.F.e.d.AbstractC0292e
    public String b() {
        return this.f20949b;
    }

    @Override // k4.F.e.d.AbstractC0292e
    public String c() {
        return this.f20950c;
    }

    @Override // k4.F.e.d.AbstractC0292e
    public F.e.d.AbstractC0292e.b d() {
        return this.f20948a;
    }

    @Override // k4.F.e.d.AbstractC0292e
    public long e() {
        return this.f20951d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0292e)) {
            return false;
        }
        F.e.d.AbstractC0292e abstractC0292e = (F.e.d.AbstractC0292e) obj;
        return this.f20948a.equals(abstractC0292e.d()) && this.f20949b.equals(abstractC0292e.b()) && this.f20950c.equals(abstractC0292e.c()) && this.f20951d == abstractC0292e.e();
    }

    public int hashCode() {
        int iHashCode = (((((this.f20948a.hashCode() ^ 1000003) * 1000003) ^ this.f20949b.hashCode()) * 1000003) ^ this.f20950c.hashCode()) * 1000003;
        long j7 = this.f20951d;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f20948a + ", parameterKey=" + this.f20949b + ", parameterValue=" + this.f20950c + ", templateVersion=" + this.f20951d + "}";
    }
}
