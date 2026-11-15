package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object f5242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5243n;

    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f5242m;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f5243n;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i7);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f5242m = obj;
    }

    public abstract void q(int i7);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z6) {
        this.f5243n = z6;
    }
}
