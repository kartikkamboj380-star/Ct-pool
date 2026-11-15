package N4;

/* JADX INFO: loaded from: classes.dex */
public enum t implements y4.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2404m;

    t(int i7) {
        this.f2404m = i7;
    }

    @Override // y4.f
    public int d() {
        return this.f2404m;
    }
}
