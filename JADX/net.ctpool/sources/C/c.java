package C;

/* JADX INFO: loaded from: classes.dex */
final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f771b;

    public c(Object obj, int i7) {
        super(null);
        this.f770a = obj;
        this.f771b = i7;
    }

    public final void a() {
        Object obj = this.f770a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f771b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final Object b() {
        return this.f770a;
    }
}
