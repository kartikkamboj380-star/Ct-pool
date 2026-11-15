package h4;

import h4.M;

/* JADX INFO: renamed from: h4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1715d extends M.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19728c;

    C1715d(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f19726a = str;
        this.f19727b = str2;
        this.f19728c = str3;
    }

    @Override // h4.M.a
    public String c() {
        return this.f19726a;
    }

    @Override // h4.M.a
    public String d() {
        return this.f19728c;
    }

    @Override // h4.M.a
    public String e() {
        return this.f19727b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M.a)) {
            return false;
        }
        M.a aVar = (M.a) obj;
        if (this.f19726a.equals(aVar.c()) && ((str = this.f19727b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f19728c;
            String strD = aVar.d();
            if (str2 == null) {
                if (strD == null) {
                    return true;
                }
            } else if (str2.equals(strD)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f19726a.hashCode() ^ 1000003) * 1000003;
        String str = this.f19727b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f19728c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f19726a + ", firebaseInstallationId=" + this.f19727b + ", firebaseAuthenticationToken=" + this.f19728c + "}";
    }
}
