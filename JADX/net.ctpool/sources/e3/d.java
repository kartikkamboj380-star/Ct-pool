package e3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements W2.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f19193a = new d();
    }

    public static d a() {
        return a.f19193a;
    }

    public static InterfaceC1622a c() {
        return (InterfaceC1622a) W2.d.d(b.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1622a get() {
        return c();
    }
}
