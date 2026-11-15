package k4;

import k4.G;

/* JADX INFO: loaded from: classes.dex */
final class D extends G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f20571i;

    D(int i7, String str, int i8, long j7, long j8, boolean z6, int i9, String str2, String str3) {
        this.f20563a = i7;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f20564b = str;
        this.f20565c = i8;
        this.f20566d = j7;
        this.f20567e = j8;
        this.f20568f = z6;
        this.f20569g = i9;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f20570h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f20571i = str3;
    }

    @Override // k4.G.b
    public int a() {
        return this.f20563a;
    }

    @Override // k4.G.b
    public int b() {
        return this.f20565c;
    }

    @Override // k4.G.b
    public long d() {
        return this.f20567e;
    }

    @Override // k4.G.b
    public boolean e() {
        return this.f20568f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.b)) {
            return false;
        }
        G.b bVar = (G.b) obj;
        return this.f20563a == bVar.a() && this.f20564b.equals(bVar.g()) && this.f20565c == bVar.b() && this.f20566d == bVar.j() && this.f20567e == bVar.d() && this.f20568f == bVar.e() && this.f20569g == bVar.i() && this.f20570h.equals(bVar.f()) && this.f20571i.equals(bVar.h());
    }

    @Override // k4.G.b
    public String f() {
        return this.f20570h;
    }

    @Override // k4.G.b
    public String g() {
        return this.f20564b;
    }

    @Override // k4.G.b
    public String h() {
        return this.f20571i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f20563a ^ 1000003) * 1000003) ^ this.f20564b.hashCode()) * 1000003) ^ this.f20565c) * 1000003;
        long j7 = this.f20566d;
        int i7 = (iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f20567e;
        return ((((((((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f20568f ? 1231 : 1237)) * 1000003) ^ this.f20569g) * 1000003) ^ this.f20570h.hashCode()) * 1000003) ^ this.f20571i.hashCode();
    }

    @Override // k4.G.b
    public int i() {
        return this.f20569g;
    }

    @Override // k4.G.b
    public long j() {
        return this.f20566d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f20563a + ", model=" + this.f20564b + ", availableProcessors=" + this.f20565c + ", totalRam=" + this.f20566d + ", diskSpace=" + this.f20567e + ", isEmulator=" + this.f20568f + ", state=" + this.f20569g + ", manufacturer=" + this.f20570h + ", modelClass=" + this.f20571i + "}";
    }
}
