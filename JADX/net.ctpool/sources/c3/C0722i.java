package c3;

/* JADX INFO: renamed from: c3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0722i implements W2.b {

    /* JADX INFO: renamed from: c3.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0722i f10055a = new C0722i();
    }

    public static C0722i a() {
        return a.f10055a;
    }

    public static int c() {
        return AbstractC0719f.c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
