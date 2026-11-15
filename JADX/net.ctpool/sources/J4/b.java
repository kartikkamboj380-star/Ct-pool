package J4;

import com.google.firebase.messaging.N;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f1772b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J4.a f1773a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private J4.a f1774a = null;

        a() {
        }

        public b a() {
            return new b(this.f1774a);
        }

        public a b(J4.a aVar) {
            this.f1774a = aVar;
            return this;
        }
    }

    b(J4.a aVar) {
        this.f1773a = aVar;
    }

    public static a b() {
        return new a();
    }

    public J4.a a() {
        return this.f1773a;
    }

    public byte[] c() {
        return N.a(this);
    }
}
