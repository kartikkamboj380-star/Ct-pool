package h4;

/* JADX INFO: loaded from: classes.dex */
public enum H {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19678m;

    H(int i7) {
        this.f19678m = i7;
    }

    public static H h(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int j() {
        return this.f19678m;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f19678m);
    }
}
