package c3;

import e3.InterfaceC1622a;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class N implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f10019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f10020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f10021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f10022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f10023e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f10019a = provider;
        this.f10020b = provider2;
        this.f10021c = provider3;
        this.f10022d = provider4;
        this.f10023e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, Object obj, Object obj2, Provider provider) {
        return new M(interfaceC1622a, interfaceC1622a2, (AbstractC0718e) obj, (W) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((InterfaceC1622a) this.f10019a.get(), (InterfaceC1622a) this.f10020b.get(), this.f10021c.get(), this.f10022d.get(), this.f10023e);
    }
}
