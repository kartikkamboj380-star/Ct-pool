package U2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements W2.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f3817a = new k();
    }

    public static k a() {
        return a.f3817a;
    }

    public static Executor b() {
        return (Executor) W2.d.d(j.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
