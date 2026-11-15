package a1;

import w5.k;

/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0502a implements InterfaceC0503b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0502a f4706a = new C0502a();

    private C0502a() {
    }

    @Override // a1.InterfaceC0503b
    public void a(Z0.a aVar, String str, Object... objArr) {
        k.f(aVar, "tag");
        k.f(str, "message");
        k.f(objArr, "args");
    }

    @Override // a1.InterfaceC0503b
    public void b(Z0.a aVar, String str) {
        k.f(aVar, "tag");
        k.f(str, "message");
    }

    @Override // a1.InterfaceC0503b
    public boolean c(Z0.a aVar) {
        k.f(aVar, "tag");
        return false;
    }
}
