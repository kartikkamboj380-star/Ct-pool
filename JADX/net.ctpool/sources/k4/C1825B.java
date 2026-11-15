package k4;

import k4.G;

/* JADX INFO: renamed from: k4.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1825B extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G.a f20554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G.c f20555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G.b f20556c;

    C1825B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f20554a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f20555b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f20556c = bVar;
    }

    @Override // k4.G
    public G.a a() {
        return this.f20554a;
    }

    @Override // k4.G
    public G.b c() {
        return this.f20556c;
    }

    @Override // k4.G
    public G.c d() {
        return this.f20555b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        return this.f20554a.equals(g7.a()) && this.f20555b.equals(g7.d()) && this.f20556c.equals(g7.c());
    }

    public int hashCode() {
        return ((((this.f20554a.hashCode() ^ 1000003) * 1000003) ^ this.f20555b.hashCode()) * 1000003) ^ this.f20556c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f20554a + ", osData=" + this.f20555b + ", deviceData=" + this.f20556c + "}";
    }
}
