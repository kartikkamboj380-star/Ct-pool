package b3;

import android.content.Context;
import c3.InterfaceC0716c;
import c3.InterfaceC0717d;
import e3.InterfaceC1622a;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class s implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f9632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f9633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f9634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f9635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f9636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f9637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f9638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f9639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f9640i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f9632a = provider;
        this.f9633b = provider2;
        this.f9634c = provider3;
        this.f9635d = provider4;
        this.f9636e = provider5;
        this.f9637f = provider6;
        this.f9638g = provider7;
        this.f9639h = provider8;
        this.f9640i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, V2.e eVar, InterfaceC0717d interfaceC0717d, x xVar, Executor executor, d3.b bVar, InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, InterfaceC0716c interfaceC0716c) {
        return new r(context, eVar, interfaceC0717d, xVar, executor, bVar, interfaceC1622a, interfaceC1622a2, interfaceC0716c);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f9632a.get(), (V2.e) this.f9633b.get(), (InterfaceC0717d) this.f9634c.get(), (x) this.f9635d.get(), (Executor) this.f9636e.get(), (d3.b) this.f9637f.get(), (InterfaceC1622a) this.f9638g.get(), (InterfaceC1622a) this.f9639h.get(), (InterfaceC0716c) this.f9640i.get());
    }
}
