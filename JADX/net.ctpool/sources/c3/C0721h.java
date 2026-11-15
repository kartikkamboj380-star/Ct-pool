package c3;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: c3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0721h implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f10054a;

    public C0721h(Provider provider) {
        this.f10054a = provider;
    }

    public static C0721h a(Provider provider) {
        return new C0721h(provider);
    }

    public static String c(Context context) {
        return (String) W2.d.d(AbstractC0719f.b(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f10054a.get());
    }
}
