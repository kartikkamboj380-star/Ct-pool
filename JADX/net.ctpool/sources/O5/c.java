package O5;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f2524u = new c();

    private c() {
        super(l.f2537c, l.f2538d, l.f2539e, l.f2535a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // H5.F
    public String toString() {
        return "Dispatchers.Default";
    }
}
