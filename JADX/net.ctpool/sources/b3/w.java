package b3;

import c3.InterfaceC0717d;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class w implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f9647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f9648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f9649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f9650d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f9647a = provider;
        this.f9648b = provider2;
        this.f9649c = provider3;
        this.f9650d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, InterfaceC0717d interfaceC0717d, x xVar, d3.b bVar) {
        return new v(executor, interfaceC0717d, xVar, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f9647a.get(), (InterfaceC0717d) this.f9648b.get(), (x) this.f9649c.get(), (d3.b) this.f9650d.get());
    }
}
