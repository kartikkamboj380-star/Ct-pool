package l0;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0299b f21053b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f21054a;

            public a(Throwable th) {
                this.f21054a = th;
            }

            public Throwable a() {
                return this.f21054a;
            }

            public String toString() {
                return "FAILURE (" + this.f21054a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: l0.l$b$b, reason: collision with other inner class name */
        public static final class C0299b extends b {
            private C0299b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }

    static {
        f21052a = new b.c();
        f21053b = new b.C0299b();
    }
}
