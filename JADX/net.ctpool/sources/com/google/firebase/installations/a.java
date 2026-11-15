package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* JADX INFO: loaded from: classes.dex */
final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f17458c;

    static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f17459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f17460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f17461c;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f17459a == null) {
                str = " token";
            }
            if (this.f17460b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f17461c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f17459a, this.f17460b.longValue(), this.f17461c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f17459a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j7) {
            this.f17461c = Long.valueOf(j7);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j7) {
            this.f17460b = Long.valueOf(j7);
            return this;
        }
    }

    private a(String str, long j7, long j8) {
        this.f17456a = str;
        this.f17457b = j7;
        this.f17458c = j8;
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f17456a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f17458c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f17457b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17456a.equals(gVar.b()) && this.f17457b == gVar.d() && this.f17458c == gVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f17456a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f17457b;
        long j8 = this.f17458c;
        return ((iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f17456a + ", tokenExpirationTimestamp=" + this.f17457b + ", tokenCreationTimestamp=" + this.f17458c + "}";
    }
}
