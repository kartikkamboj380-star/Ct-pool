package c3;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class X implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f10036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f10037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f10038c;

    public X(Provider provider, Provider provider2, Provider provider3) {
        this.f10036a = provider;
        this.f10037b = provider2;
        this.f10038c = provider3;
    }

    public static X a(Provider provider, Provider provider2, Provider provider3) {
        return new X(provider, provider2, provider3);
    }

    public static W c(Context context, String str, int i7) {
        return new W(context, str, i7);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f10036a.get(), (String) this.f10037b.get(), ((Integer) this.f10038c.get()).intValue());
    }
}
