package k4;

import e4.C1628f;
import k4.G;

/* JADX INFO: renamed from: k4.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1826C extends G.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1628f f20562f;

    C1826C(String str, String str2, String str3, String str4, int i7, C1628f c1628f) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f20557a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f20558b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f20559c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f20560d = str4;
        this.f20561e = i7;
        if (c1628f == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f20562f = c1628f;
    }

    @Override // k4.G.a
    public String a() {
        return this.f20557a;
    }

    @Override // k4.G.a
    public int c() {
        return this.f20561e;
    }

    @Override // k4.G.a
    public C1628f d() {
        return this.f20562f;
    }

    @Override // k4.G.a
    public String e() {
        return this.f20560d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.a)) {
            return false;
        }
        G.a aVar = (G.a) obj;
        return this.f20557a.equals(aVar.a()) && this.f20558b.equals(aVar.f()) && this.f20559c.equals(aVar.g()) && this.f20560d.equals(aVar.e()) && this.f20561e == aVar.c() && this.f20562f.equals(aVar.d());
    }

    @Override // k4.G.a
    public String f() {
        return this.f20558b;
    }

    @Override // k4.G.a
    public String g() {
        return this.f20559c;
    }

    public int hashCode() {
        return ((((((((((this.f20557a.hashCode() ^ 1000003) * 1000003) ^ this.f20558b.hashCode()) * 1000003) ^ this.f20559c.hashCode()) * 1000003) ^ this.f20560d.hashCode()) * 1000003) ^ this.f20561e) * 1000003) ^ this.f20562f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f20557a + ", versionCode=" + this.f20558b + ", versionName=" + this.f20559c + ", installUuid=" + this.f20560d + ", deliveryMechanism=" + this.f20561e + ", developmentPlatformProvider=" + this.f20562f + "}";
    }
}
