package androidx.lifecycle;

import Y.c;
import android.os.Bundle;
import java.util.Map;
import kotlin.Lazy;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public final class z implements c.InterfaceC0101c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y.c f8392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f8394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f8395d;

    static final class a extends w5.l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ I f8396m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I i7) {
            super(0);
            this.f8396m = i7;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke() {
            return y.e(this.f8396m);
        }
    }

    public z(Y.c cVar, I i7) {
        w5.k.f(cVar, "savedStateRegistry");
        w5.k.f(i7, "viewModelStoreOwner");
        this.f8392a = cVar;
        this.f8395d = i5.g.b(new a(i7));
    }

    private final A c() {
        return (A) this.f8395d.getValue();
    }

    @Override // Y.c.InterfaceC0101c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8394c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((x) entry.getValue()).d().a();
            if (!w5.k.b(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f8393b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        w5.k.f(str, "key");
        d();
        Bundle bundle = this.f8394c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f8394c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f8394c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f8394c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f8393b) {
            return;
        }
        this.f8394c = this.f8392a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f8393b = true;
        c();
    }
}
