package a3;

import b3.x;
import c3.InterfaceC0717d;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: renamed from: a3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0508d implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f4777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f4778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f4779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f4780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f4781e;

    public C0508d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f4777a = provider;
        this.f4778b = provider2;
        this.f4779c = provider3;
        this.f4780d = provider4;
        this.f4781e = provider5;
    }

    public static C0508d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C0508d(provider, provider2, provider3, provider4, provider5);
    }

    public static C0507c c(Executor executor, V2.e eVar, x xVar, InterfaceC0717d interfaceC0717d, d3.b bVar) {
        return new C0507c(executor, eVar, xVar, interfaceC0717d, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0507c get() {
        return c((Executor) this.f4777a.get(), (V2.e) this.f4778b.get(), (x) this.f4779c.get(), (InterfaceC0717d) this.f4780d.get(), (d3.b) this.f4781e.get());
    }
}
