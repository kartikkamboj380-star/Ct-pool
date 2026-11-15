package a3;

import android.content.Context;
import b3.x;
import c3.InterfaceC0717d;
import e3.InterfaceC1622a;
import javax.inject.Provider;

/* JADX INFO: renamed from: a3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0513i implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f4783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f4784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f4785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f4786d;

    public C0513i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f4783a = provider;
        this.f4784b = provider2;
        this.f4785c = provider3;
        this.f4786d = provider4;
    }

    public static C0513i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C0513i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, InterfaceC0717d interfaceC0717d, b3.f fVar, InterfaceC1622a interfaceC1622a) {
        return (x) W2.d.d(AbstractC0512h.a(context, interfaceC0717d, fVar, interfaceC1622a));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f4783a.get(), (InterfaceC0717d) this.f4784b.get(), (b3.f) this.f4785c.get(), (InterfaceC1622a) this.f4786d.get());
    }
}
