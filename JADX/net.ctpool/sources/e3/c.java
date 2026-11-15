package e3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements W2.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f19192a = new c();
    }

    public static c a() {
        return a.f19192a;
    }

    public static InterfaceC1622a b() {
        return (InterfaceC1622a) W2.d.d(b.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1622a get() {
        return b();
    }
}
