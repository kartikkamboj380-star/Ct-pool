package W2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f4169b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4170a;

    private c(Object obj) {
        this.f4170a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f4170a;
    }
}
