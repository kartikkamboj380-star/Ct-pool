package O4;

import w5.k;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* JADX INFO: renamed from: O4.b$b, reason: collision with other inner class name */
    public static final class C0050b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f2493a;

        public C0050b(String str) {
            k.f(str, "sessionId");
            this.f2493a = str;
        }

        public final String a() {
            return this.f2493a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0050b) && k.b(this.f2493a, ((C0050b) obj).f2493a);
        }

        public int hashCode() {
            return this.f2493a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f2493a + ')';
        }
    }

    void a(C0050b c0050b);

    boolean b();

    a c();
}
