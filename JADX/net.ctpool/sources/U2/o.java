package U2;

import U2.c;

/* JADX INFO: loaded from: classes.dex */
abstract class o {

    public static abstract class a {
        public abstract o a();

        abstract a b(S2.c cVar);

        abstract a c(S2.d dVar);

        abstract a d(S2.h hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract S2.c b();

    abstract S2.d c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    abstract S2.h e();

    public abstract p f();

    public abstract String g();
}
