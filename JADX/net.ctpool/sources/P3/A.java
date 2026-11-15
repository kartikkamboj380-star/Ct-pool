package P3;

/* JADX INFO: loaded from: classes.dex */
final class A extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2576b;

    /* synthetic */ A(int i7, boolean z6, z zVar) {
        this.f2575a = i7;
        this.f2576b = z6;
    }

    @Override // P3.d
    public final boolean a() {
        return this.f2576b;
    }

    @Override // P3.d
    public final int b() {
        return this.f2575a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f2575a == dVar.b() && this.f2576b == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2575a ^ 1000003) * 1000003) ^ (true != this.f2576b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f2575a + ", allowAssetPackDeletion=" + this.f2576b + "}";
    }
}
