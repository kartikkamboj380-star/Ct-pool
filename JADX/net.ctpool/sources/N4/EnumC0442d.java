package N4;

/* JADX INFO: renamed from: N4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0442d implements y4.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2373m;

    EnumC0442d(int i7) {
        this.f2373m = i7;
    }

    @Override // y4.f
    public int d() {
        return this.f2373m;
    }
}
