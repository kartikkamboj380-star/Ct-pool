package c3;

/* JADX INFO: renamed from: c3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0720g implements W2.b {

    /* JADX INFO: renamed from: c3.g$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0720g f10053a = new C0720g();
    }

    public static C0720g a() {
        return a.f10053a;
    }

    public static String b() {
        return (String) W2.d.d(AbstractC0719f.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
