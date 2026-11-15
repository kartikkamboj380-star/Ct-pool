package k4;

import k4.G;

/* JADX INFO: loaded from: classes.dex */
final class E extends G.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20574c;

    E(String str, String str2, boolean z6) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f20572a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f20573b = str2;
        this.f20574c = z6;
    }

    @Override // k4.G.c
    public boolean b() {
        return this.f20574c;
    }

    @Override // k4.G.c
    public String c() {
        return this.f20573b;
    }

    @Override // k4.G.c
    public String d() {
        return this.f20572a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.c)) {
            return false;
        }
        G.c cVar = (G.c) obj;
        return this.f20572a.equals(cVar.d()) && this.f20573b.equals(cVar.c()) && this.f20574c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f20572a.hashCode() ^ 1000003) * 1000003) ^ this.f20573b.hashCode()) * 1000003) ^ (this.f20574c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f20572a + ", osCodeName=" + this.f20573b + ", isRooted=" + this.f20574c + "}";
    }
}
