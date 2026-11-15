package V2;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class l implements W2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f4044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f4045b;

    public l(Provider provider, Provider provider2) {
        this.f4044a = provider;
        this.f4045b = provider2;
    }

    public static l a(Provider provider, Provider provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f4044a.get(), this.f4045b.get());
    }
}
