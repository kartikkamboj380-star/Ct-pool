package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import e.AbstractC1609a;
import e.AbstractC1613e;
import e.AbstractC1614f;
import e.AbstractC1616h;
import f.AbstractC1641a;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f6146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f6148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f6149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f6150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f6151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f6152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f6154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f6155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f6156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f6157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f6158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0526c f6159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f6161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f6162q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f6163m;

        a() {
            this.f6163m = new androidx.appcompat.view.menu.a(k0.this.f6146a.getContext(), 0, R.id.home, 0, 0, k0.this.f6154i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0 k0Var = k0.this;
            Window.Callback callback = k0Var.f6157l;
            if (callback == null || !k0Var.f6158m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f6163m);
        }
    }

    class b extends androidx.core.view.Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6165a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6166b;

        b(int i7) {
            this.f6166b = i7;
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void a(View view) {
            this.f6165a = true;
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            if (this.f6165a) {
                return;
            }
            k0.this.f6146a.setVisibility(this.f6166b);
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void c(View view) {
            k0.this.f6146a.setVisibility(0);
        }
    }

    public k0(Toolbar toolbar, boolean z6) {
        this(toolbar, z6, AbstractC1616h.f18883a, AbstractC1613e.f18808n);
    }

    private void G(CharSequence charSequence) {
        this.f6154i = charSequence;
        if ((this.f6147b & 8) != 0) {
            this.f6146a.setTitle(charSequence);
            if (this.f6153h) {
                androidx.core.view.H.s0(this.f6146a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f6147b & 4) != 0) {
            if (TextUtils.isEmpty(this.f6156k)) {
                this.f6146a.setNavigationContentDescription(this.f6161p);
            } else {
                this.f6146a.setNavigationContentDescription(this.f6156k);
            }
        }
    }

    private void I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f6147b & 4) != 0) {
            toolbar = this.f6146a;
            drawable = this.f6152g;
            if (drawable == null) {
                drawable = this.f6162q;
            }
        } else {
            toolbar = this.f6146a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i7 = this.f6147b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f6151f) == null) {
            drawable = this.f6150e;
        }
        this.f6146a.setLogo(drawable);
    }

    private int z() {
        if (this.f6146a.getNavigationIcon() == null) {
            return 11;
        }
        this.f6162q = this.f6146a.getNavigationIcon();
        return 15;
    }

    public void A(View view) {
        View view2 = this.f6149d;
        if (view2 != null && (this.f6147b & 16) != 0) {
            this.f6146a.removeView(view2);
        }
        this.f6149d = view;
        if (view == null || (this.f6147b & 16) == 0) {
            return;
        }
        this.f6146a.addView(view);
    }

    public void B(int i7) {
        if (i7 == this.f6161p) {
            return;
        }
        this.f6161p = i7;
        if (TextUtils.isEmpty(this.f6146a.getNavigationContentDescription())) {
            D(this.f6161p);
        }
    }

    public void C(Drawable drawable) {
        this.f6151f = drawable;
        J();
    }

    public void D(int i7) {
        E(i7 == 0 ? null : a().getString(i7));
    }

    public void E(CharSequence charSequence) {
        this.f6156k = charSequence;
        H();
    }

    public void F(CharSequence charSequence) {
        this.f6155j = charSequence;
        if ((this.f6147b & 8) != 0) {
            this.f6146a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.J
    public Context a() {
        return this.f6146a.getContext();
    }

    @Override // androidx.appcompat.widget.J
    public void b(Menu menu, m.a aVar) {
        if (this.f6159n == null) {
            C0526c c0526c = new C0526c(this.f6146a.getContext());
            this.f6159n = c0526c;
            c0526c.p(AbstractC1614f.f18843g);
        }
        this.f6159n.h(aVar);
        this.f6146a.M((androidx.appcompat.view.menu.g) menu, this.f6159n);
    }

    @Override // androidx.appcompat.widget.J
    public boolean c() {
        return this.f6146a.D();
    }

    @Override // androidx.appcompat.widget.J
    public void collapseActionView() {
        this.f6146a.f();
    }

    @Override // androidx.appcompat.widget.J
    public void d() {
        this.f6158m = true;
    }

    @Override // androidx.appcompat.widget.J
    public boolean e() {
        return this.f6146a.e();
    }

    @Override // androidx.appcompat.widget.J
    public boolean f() {
        return this.f6146a.C();
    }

    @Override // androidx.appcompat.widget.J
    public boolean g() {
        return this.f6146a.y();
    }

    @Override // androidx.appcompat.widget.J
    public CharSequence getTitle() {
        return this.f6146a.getTitle();
    }

    @Override // androidx.appcompat.widget.J
    public boolean h() {
        return this.f6146a.S();
    }

    @Override // androidx.appcompat.widget.J
    public void i() {
        this.f6146a.g();
    }

    @Override // androidx.appcompat.widget.J
    public void j(a0 a0Var) {
        View view = this.f6148c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f6146a;
            if (parent == toolbar) {
                toolbar.removeView(this.f6148c);
            }
        }
        this.f6148c = a0Var;
    }

    @Override // androidx.appcompat.widget.J
    public boolean k() {
        return this.f6146a.x();
    }

    @Override // androidx.appcompat.widget.J
    public void l(int i7) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i8 = this.f6147b ^ i7;
        this.f6147b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i8 & 3) != 0) {
                J();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    this.f6146a.setTitle(this.f6154i);
                    toolbar = this.f6146a;
                    charSequence = this.f6155j;
                } else {
                    charSequence = null;
                    this.f6146a.setTitle((CharSequence) null);
                    toolbar = this.f6146a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i8 & 16) == 0 || (view = this.f6149d) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                this.f6146a.addView(view);
            } else {
                this.f6146a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.J
    public Menu m() {
        return this.f6146a.getMenu();
    }

    @Override // androidx.appcompat.widget.J
    public void n(int i7) {
        C(i7 != 0 ? AbstractC1641a.b(a(), i7) : null);
    }

    @Override // androidx.appcompat.widget.J
    public int o() {
        return this.f6160o;
    }

    @Override // androidx.appcompat.widget.J
    public androidx.core.view.O p(int i7, long j7) {
        return androidx.core.view.H.e(this.f6146a).b(i7 == 0 ? 1.0f : 0.0f).f(j7).h(new b(i7));
    }

    @Override // androidx.appcompat.widget.J
    public void q(m.a aVar, g.a aVar2) {
        this.f6146a.N(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.J
    public void r(int i7) {
        this.f6146a.setVisibility(i7);
    }

    @Override // androidx.appcompat.widget.J
    public ViewGroup s() {
        return this.f6146a;
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(int i7) {
        setIcon(i7 != 0 ? AbstractC1641a.b(a(), i7) : null);
    }

    @Override // androidx.appcompat.widget.J
    public void setTitle(CharSequence charSequence) {
        this.f6153h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowCallback(Window.Callback callback) {
        this.f6157l = callback;
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f6153h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void t(boolean z6) {
    }

    @Override // androidx.appcompat.widget.J
    public int u() {
        return this.f6147b;
    }

    @Override // androidx.appcompat.widget.J
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void x(Drawable drawable) {
        this.f6152g = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.J
    public void y(boolean z6) {
        this.f6146a.setCollapsible(z6);
    }

    public k0(Toolbar toolbar, boolean z6, int i7, int i8) {
        Drawable drawable;
        this.f6160o = 0;
        this.f6161p = 0;
        this.f6146a = toolbar;
        this.f6154i = toolbar.getTitle();
        this.f6155j = toolbar.getSubtitle();
        this.f6153h = this.f6154i != null;
        this.f6152g = toolbar.getNavigationIcon();
        h0 h0VarV = h0.v(toolbar.getContext(), null, e.j.f19023a, AbstractC1609a.f18730c, 0);
        this.f6162q = h0VarV.g(e.j.f19078l);
        if (z6) {
            CharSequence charSequenceP = h0VarV.p(e.j.f19108r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = h0VarV.p(e.j.f19098p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                F(charSequenceP2);
            }
            Drawable drawableG = h0VarV.g(e.j.f19088n);
            if (drawableG != null) {
                C(drawableG);
            }
            Drawable drawableG2 = h0VarV.g(e.j.f19083m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f6152g == null && (drawable = this.f6162q) != null) {
                x(drawable);
            }
            l(h0VarV.k(e.j.f19058h, 0));
            int iN = h0VarV.n(e.j.f19053g, 0);
            if (iN != 0) {
                A(LayoutInflater.from(this.f6146a.getContext()).inflate(iN, (ViewGroup) this.f6146a, false));
                l(this.f6147b | 16);
            }
            int iM = h0VarV.m(e.j.f19068j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f6146a.getLayoutParams();
                layoutParams.height = iM;
                this.f6146a.setLayoutParams(layoutParams);
            }
            int iE = h0VarV.e(e.j.f19048f, -1);
            int iE2 = h0VarV.e(e.j.f19043e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f6146a.L(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = h0VarV.n(e.j.f19113s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f6146a;
                toolbar2.P(toolbar2.getContext(), iN2);
            }
            int iN3 = h0VarV.n(e.j.f19103q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f6146a;
                toolbar3.O(toolbar3.getContext(), iN3);
            }
            int iN4 = h0VarV.n(e.j.f19093o, 0);
            if (iN4 != 0) {
                this.f6146a.setPopupTheme(iN4);
            }
        } else {
            this.f6147b = z();
        }
        h0VarV.w();
        B(i7);
        this.f6156k = this.f6146a.getNavigationContentDescription();
        this.f6146a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(Drawable drawable) {
        this.f6150e = drawable;
        J();
    }
}
