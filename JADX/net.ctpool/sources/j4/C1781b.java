package j4;

/* JADX INFO: renamed from: j4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1781b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f20354f;

    C1781b(String str, String str2, String str3, String str4, long j7) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f20350b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f20351c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f20352d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f20353e = str4;
        this.f20354f = j7;
    }

    @Override // j4.i
    public String c() {
        return this.f20351c;
    }

    @Override // j4.i
    public String d() {
        return this.f20352d;
    }

    @Override // j4.i
    public String e() {
        return this.f20350b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f20350b.equals(iVar.e()) && this.f20351c.equals(iVar.c()) && this.f20352d.equals(iVar.d()) && this.f20353e.equals(iVar.g()) && this.f20354f == iVar.f();
    }

    @Override // j4.i
    public long f() {
        return this.f20354f;
    }

    @Override // j4.i
    public String g() {
        return this.f20353e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f20350b.hashCode() ^ 1000003) * 1000003) ^ this.f20351c.hashCode()) * 1000003) ^ this.f20352d.hashCode()) * 1000003) ^ this.f20353e.hashCode()) * 1000003;
        long j7 = this.f20354f;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f20350b + ", parameterKey=" + this.f20351c + ", parameterValue=" + this.f20352d + ", variantId=" + this.f20353e + ", templateVersion=" + this.f20354f + "}";
    }
}
