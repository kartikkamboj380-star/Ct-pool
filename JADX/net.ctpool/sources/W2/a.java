package W2;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Provider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f4166c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Provider f4167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f4168b = f4166c;

    private a(Provider provider) {
        this.f4167a = provider;
    }

    public static Provider a(Provider provider) {
        d.b(provider);
        return provider instanceof a ? provider : new a(provider);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f4166c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f4168b;
        Object obj2 = f4166c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4168b;
                    if (obj == obj2) {
                        obj = this.f4167a.get();
                        this.f4168b = b(this.f4168b, obj);
                        this.f4167a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
