package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.g;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k0;
import androidx.core.view.H;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class z extends AbstractC0521a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final J f5226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Window.Callback f5227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g.f f5228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f5229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f5232g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f5233h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Toolbar.h f5234i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.z();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return z.this.f5227b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f5237m;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
            if (this.f5237m) {
                return;
            }
            this.f5237m = true;
            z.this.f5226a.i();
            z.this.f5227b.onPanelClosed(108, gVar);
            this.f5237m = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            z.this.f5227b.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (z.this.f5226a.c()) {
                z.this.f5227b.onPanelClosed(108, gVar);
            } else if (z.this.f5227b.onPreparePanel(0, null, gVar)) {
                z.this.f5227b.onMenuOpened(108, gVar);
            }
        }
    }

    private class e implements g.f {
        e() {
        }

        @Override // androidx.appcompat.app.g.f
        public boolean a(int i7) {
            if (i7 != 0) {
                return false;
            }
            z zVar = z.this;
            if (zVar.f5229d) {
                return false;
            }
            zVar.f5226a.d();
            z.this.f5229d = true;
            return false;
        }

        @Override // androidx.appcompat.app.g.f
        public View onCreatePanelView(int i7) {
            if (i7 == 0) {
                return new View(z.this.f5226a.a());
            }
            return null;
        }
    }

    z(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f5234i = bVar;
        androidx.core.util.f.f(toolbar);
        k0 k0Var = new k0(toolbar, false);
        this.f5226a = k0Var;
        this.f5227b = (Window.Callback) androidx.core.util.f.f(callback);
        k0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        k0Var.setWindowTitle(charSequence);
        this.f5228c = new e();
    }

    private Menu y() {
        if (!this.f5230e) {
            this.f5226a.q(new c(), new d());
            this.f5230e = true;
        }
        return this.f5226a.m();
    }

    public void A(int i7, int i8) {
        this.f5226a.l((i7 & i8) | ((~i8) & this.f5226a.u()));
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean g() {
        return this.f5226a.g();
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean h() {
        if (!this.f5226a.k()) {
            return false;
        }
        this.f5226a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void i(boolean z6) {
        if (z6 == this.f5231f) {
            return;
        }
        this.f5231f = z6;
        if (this.f5232g.size() <= 0) {
            return;
        }
        y.a(this.f5232g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public int j() {
        return this.f5226a.u();
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public Context k() {
        return this.f5226a.a();
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean l() {
        this.f5226a.s().removeCallbacks(this.f5233h);
        H.h0(this.f5226a.s(), this.f5233h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    void n() {
        this.f5226a.s().removeCallbacks(this.f5233h);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean o(int i7, KeyEvent keyEvent) {
        Menu menuY = y();
        if (menuY == null) {
            return false;
        }
        menuY.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuY.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean q() {
        return this.f5226a.h();
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void r(boolean z6) {
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void s(boolean z6) {
        A(z6 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void t(Drawable drawable) {
        this.f5226a.x(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void u(boolean z6) {
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void v(CharSequence charSequence) {
        this.f5226a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void w(CharSequence charSequence) {
        this.f5226a.setWindowTitle(charSequence);
    }

    void z() {
        Menu menuY = y();
        androidx.appcompat.view.menu.g gVar = menuY instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menuY : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            menuY.clear();
            if (!this.f5227b.onCreatePanelMenu(0, menuY) || !this.f5227b.onPreparePanel(0, null, menuY)) {
                menuY.clear();
            }
            if (gVar != null) {
                gVar.c0();
            }
        } catch (Throwable th) {
            if (gVar != null) {
                gVar.c0();
            }
            throw th;
        }
    }
}
