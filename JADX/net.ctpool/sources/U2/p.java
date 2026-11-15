package U2;

import U2.d;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(S2.f fVar);
    }

    public static a a() {
        return new d.b().d(S2.f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract S2.f d();

    public boolean e() {
        return c() != null;
    }

    public p f(S2.f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
