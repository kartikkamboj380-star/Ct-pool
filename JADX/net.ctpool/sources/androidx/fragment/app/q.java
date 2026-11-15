package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f8189a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f8190b;

    q(w wVar) {
        this.f8190b = wVar;
    }

    void a(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().a(fragment, bundle, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void b(Fragment fragment, boolean z6) {
        this.f8190b.w0().n();
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().b(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().c(fragment, bundle, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void d(Fragment fragment, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().d(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void e(Fragment fragment, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().e(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void f(Fragment fragment, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().f(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void g(Fragment fragment, boolean z6) {
        this.f8190b.w0().n();
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().g(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().h(fragment, bundle, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void i(Fragment fragment, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().i(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().j(fragment, bundle, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void k(Fragment fragment, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().k(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void l(Fragment fragment, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().l(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().m(fragment, view, bundle, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }

    void n(Fragment fragment, boolean z6) {
        Fragment fragmentZ0 = this.f8190b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().n(fragment, true);
        }
        Iterator it = this.f8189a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
    }
}
