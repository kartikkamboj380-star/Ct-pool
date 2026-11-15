package T5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I {
    public abstract void a(H h7, int i7, String str);

    public void b(H h7, int i7, String str) {
        w5.k.f(h7, "webSocket");
        w5.k.f(str, "reason");
    }

    public abstract void c(H h7, Throwable th, D d7);

    public void d(H h7, i6.i iVar) {
        w5.k.f(h7, "webSocket");
        w5.k.f(iVar, "bytes");
    }

    public abstract void e(H h7, String str);

    public void f(H h7, D d7) {
        w5.k.f(h7, "webSocket");
        w5.k.f(d7, "response");
    }
}
