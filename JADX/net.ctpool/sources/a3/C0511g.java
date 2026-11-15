package a3;

import e3.InterfaceC1622a;
import javax.inject.Provider;

/* JADX INFO: renamed from: a3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0511g implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f4782a;

    public C0511g(Provider provider) {
        this.f4782a = provider;
    }

    public static b3.f a(InterfaceC1622a interfaceC1622a) {
        return (b3.f) W2.d.d(AbstractC0510f.a(interfaceC1622a));
    }

    public static C0511g b(Provider provider) {
        return new C0511g(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b3.f get() {
        return a((InterfaceC1622a) this.f4782a.get());
    }
}
