package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements g.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Context f5250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ActionBarContextView f5251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b.a f5252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f5253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f5256u;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z6) {
        this.f5250o = context;
        this.f5251p = actionBarContextView;
        this.f5252q = aVar;
        androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f5256u = gVarS;
        gVarS.R(this);
        this.f5255t = z6;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f5252q.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f5251p.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f5254s) {
            return;
        }
        this.f5254s = true;
        this.f5252q.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f5253r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f5256u;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f5251p.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f5251p.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f5251p.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f5252q.c(this, this.f5256u);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f5251p.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f5251p.setCustomView(view);
        this.f5253r = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i7) {
        o(this.f5250o.getString(i7));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f5251p.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i7) {
        r(this.f5250o.getString(i7));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f5251p.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z6) {
        super.s(z6);
        this.f5251p.setTitleOptional(z6);
    }
}
