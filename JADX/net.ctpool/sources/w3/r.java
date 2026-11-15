package w3;

/* JADX INFO: loaded from: classes.dex */
public enum r {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f22698m;

    r(String str) {
        this.f22698m = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f22698m;
    }
}
