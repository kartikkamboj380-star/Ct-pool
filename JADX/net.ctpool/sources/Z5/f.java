package Z5;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4647a = new f();

    private f() {
    }

    public static final boolean b(String str) {
        w5.k.f(str, "method");
        return (w5.k.b(str, "GET") || w5.k.b(str, "HEAD")) ? false : true;
    }

    public static final boolean e(String str) {
        w5.k.f(str, "method");
        return w5.k.b(str, "POST") || w5.k.b(str, "PUT") || w5.k.b(str, "PATCH") || w5.k.b(str, "PROPPATCH") || w5.k.b(str, "REPORT");
    }

    public final boolean a(String str) {
        w5.k.f(str, "method");
        return w5.k.b(str, "POST") || w5.k.b(str, "PATCH") || w5.k.b(str, "PUT") || w5.k.b(str, "DELETE") || w5.k.b(str, "MOVE");
    }

    public final boolean c(String str) {
        w5.k.f(str, "method");
        return !w5.k.b(str, "PROPFIND");
    }

    public final boolean d(String str) {
        w5.k.f(str, "method");
        return w5.k.b(str, "PROPFIND");
    }
}
