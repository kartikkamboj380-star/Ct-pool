package G4;

import G4.d;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f1238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f1239e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f1243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f1244e;

        b() {
        }

        @Override // G4.d.a
        public d a() {
            return new a(this.f1240a, this.f1241b, this.f1242c, this.f1243d, this.f1244e);
        }

        @Override // G4.d.a
        public d.a b(f fVar) {
            this.f1243d = fVar;
            return this;
        }

        @Override // G4.d.a
        public d.a c(String str) {
            this.f1241b = str;
            return this;
        }

        @Override // G4.d.a
        public d.a d(String str) {
            this.f1242c = str;
            return this;
        }

        @Override // G4.d.a
        public d.a e(d.b bVar) {
            this.f1244e = bVar;
            return this;
        }

        @Override // G4.d.a
        public d.a f(String str) {
            this.f1240a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f1235a = str;
        this.f1236b = str2;
        this.f1237c = str3;
        this.f1238d = fVar;
        this.f1239e = bVar;
    }

    @Override // G4.d
    public f b() {
        return this.f1238d;
    }

    @Override // G4.d
    public String c() {
        return this.f1236b;
    }

    @Override // G4.d
    public String d() {
        return this.f1237c;
    }

    @Override // G4.d
    public d.b e() {
        return this.f1239e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f1235a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f1236b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f1237c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f1238d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f1239e;
                        d.b bVarE = dVar.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // G4.d
    public String f() {
        return this.f1235a;
    }

    public int hashCode() {
        String str = this.f1235a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f1236b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1237c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f1238d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f1239e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f1235a + ", fid=" + this.f1236b + ", refreshToken=" + this.f1237c + ", authToken=" + this.f1238d + ", responseCode=" + this.f1239e + "}";
    }
}
