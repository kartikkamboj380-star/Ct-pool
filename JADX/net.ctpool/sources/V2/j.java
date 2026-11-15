package V2;

import android.content.Context;
import e3.InterfaceC1622a;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class j implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f4036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f4037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f4038c;

    public j(Provider provider, Provider provider2, Provider provider3) {
        this.f4036a = provider;
        this.f4037b = provider2;
        this.f4038c = provider3;
    }

    public static j a(Provider provider, Provider provider2, Provider provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2) {
        return new i(context, interfaceC1622a, interfaceC1622a2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f4036a.get(), (InterfaceC1622a) this.f4037b.get(), (InterfaceC1622a) this.f4038c.get());
    }
}
