package Y;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4388d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f4389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f4390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4391c;

    public static final class a {
        private a() {
        }

        public final d a(e eVar) {
            k.f(eVar, "owner");
            return new d(eVar, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private d(e eVar) {
        this.f4389a = eVar;
        this.f4390b = new c();
    }

    public static final d a(e eVar) {
        return f4388d.a(eVar);
    }

    public final c b() {
        return this.f4390b;
    }

    public final void c() {
        AbstractC0651h lifecycle = this.f4389a.getLifecycle();
        k.e(lifecycle, "owner.lifecycle");
        if (lifecycle.b() != AbstractC0651h.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.f4389a));
        this.f4390b.e(lifecycle);
        this.f4391c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f4391c) {
            c();
        }
        AbstractC0651h lifecycle = this.f4389a.getLifecycle();
        k.e(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().e(AbstractC0651h.c.STARTED)) {
            this.f4390b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        k.f(bundle, "outBundle");
        this.f4390b.g(bundle);
    }

    public /* synthetic */ d(e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar);
    }
}
