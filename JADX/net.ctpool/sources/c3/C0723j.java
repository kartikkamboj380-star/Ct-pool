package c3;

/* JADX INFO: renamed from: c3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0723j implements W2.b {

    /* JADX INFO: renamed from: c3.j$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0723j f10056a = new C0723j();
    }

    public static C0723j a() {
        return a.f10056a;
    }

    public static AbstractC0718e c() {
        return (AbstractC0718e) W2.d.d(AbstractC0719f.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0718e get() {
        return c();
    }
}
