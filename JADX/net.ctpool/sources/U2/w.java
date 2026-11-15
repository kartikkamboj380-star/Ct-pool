package U2;

import a3.InterfaceC0509e;
import e3.InterfaceC1622a;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class w implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f3834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f3835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f3836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f3837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f3838e;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f3834a = provider;
        this.f3835b = provider2;
        this.f3836c = provider3;
        this.f3837d = provider4;
        this.f3838e = provider5;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new w(provider, provider2, provider3, provider4, provider5);
    }

    public static u c(InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, InterfaceC0509e interfaceC0509e, b3.r rVar, b3.v vVar) {
        return new u(interfaceC1622a, interfaceC1622a2, interfaceC0509e, rVar, vVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((InterfaceC1622a) this.f3834a.get(), (InterfaceC1622a) this.f3835b.get(), (InterfaceC0509e) this.f3836c.get(), (b3.r) this.f3837d.get(), (b3.v) this.f3838e.get());
    }
}
