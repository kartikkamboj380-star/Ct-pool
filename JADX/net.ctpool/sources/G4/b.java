package G4;

import G4.f;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f1246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f1247c;

    /* JADX INFO: renamed from: G4.b$b, reason: collision with other inner class name */
    static final class C0019b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f1249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f1250c;

        C0019b() {
        }

        @Override // G4.f.a
        public f a() {
            String str = "";
            if (this.f1249b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f1248a, this.f1249b.longValue(), this.f1250c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // G4.f.a
        public f.a b(f.b bVar) {
            this.f1250c = bVar;
            return this;
        }

        @Override // G4.f.a
        public f.a c(String str) {
            this.f1248a = str;
            return this;
        }

        @Override // G4.f.a
        public f.a d(long j7) {
            this.f1249b = Long.valueOf(j7);
            return this;
        }
    }

    private b(String str, long j7, f.b bVar) {
        this.f1245a = str;
        this.f1246b = j7;
        this.f1247c = bVar;
    }

    @Override // G4.f
    public f.b b() {
        return this.f1247c;
    }

    @Override // G4.f
    public String c() {
        return this.f1245a;
    }

    @Override // G4.f
    public long d() {
        return this.f1246b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f1245a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f1246b == fVar.d()) {
                f.b bVar = this.f1247c;
                f.b bVarB = fVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1245a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j7 = this.f1246b;
        int i7 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        f.b bVar = this.f1247c;
        return i7 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f1245a + ", tokenExpirationTimestamp=" + this.f1246b + ", responseCode=" + this.f1247c + "}";
    }
}
