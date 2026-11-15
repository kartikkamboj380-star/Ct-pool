package T2;

import T2.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(T2.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f3145m;

        b(int i7) {
            this.f3145m = i7;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract T2.a b();

    public abstract b c();
}
