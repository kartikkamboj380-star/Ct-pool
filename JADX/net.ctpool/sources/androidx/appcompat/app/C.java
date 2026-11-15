package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.H;
import androidx.core.view.O;
import androidx.core.view.P;
import androidx.core.view.Q;
import androidx.core.view.S;
import e.AbstractC1609a;
import e.AbstractC1614f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class C extends AbstractC0521a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Interpolator f5038D = new AccelerateInterpolator();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Interpolator f5039E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f5043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f5045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f5046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f5047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    J f5048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f5049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f5050h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    d f5054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f5055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b.a f5056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5057o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5059q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f5062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f5063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5064v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f5066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f5067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f5068z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f5051i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5052j = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList f5058p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5060r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f5061s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f5065w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final P f5040A = new a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final P f5041B = new b();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final S f5042C = new c();

    class a extends Q {
        a() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            View view2;
            C c7 = C.this;
            if (c7.f5061s && (view2 = c7.f5050h) != null) {
                view2.setTranslationY(0.0f);
                C.this.f5047e.setTranslationY(0.0f);
            }
            C.this.f5047e.setVisibility(8);
            C.this.f5047e.setTransitioning(false);
            C c8 = C.this;
            c8.f5066x = null;
            c8.A();
            ActionBarOverlayLayout actionBarOverlayLayout = C.this.f5046d;
            if (actionBarOverlayLayout != null) {
                H.m0(actionBarOverlayLayout);
            }
        }
    }

    class b extends Q {
        b() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            C c7 = C.this;
            c7.f5066x = null;
            c7.f5047e.requestLayout();
        }
    }

    class c implements S {
        c() {
        }

        @Override // androidx.core.view.S
        public void a(View view) {
            ((View) C.this.f5047e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements g.a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Context f5072o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f5073p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b.a f5074q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private WeakReference f5075r;

        public d(Context context, b.a aVar) {
            this.f5072o = context;
            this.f5074q = aVar;
            androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(context).S(1);
            this.f5073p = gVarS;
            gVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f5074q;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f5074q == null) {
                return;
            }
            k();
            C.this.f5049g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            C c7 = C.this;
            if (c7.f5054l != this) {
                return;
            }
            if (C.z(c7.f5062t, c7.f5063u, false)) {
                this.f5074q.a(this);
            } else {
                C c8 = C.this;
                c8.f5055m = this;
                c8.f5056n = this.f5074q;
            }
            this.f5074q = null;
            C.this.y(false);
            C.this.f5049g.g();
            C c9 = C.this;
            c9.f5046d.setHideOnContentScrollEnabled(c9.f5068z);
            C.this.f5054l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f5075r;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f5073p;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f5072o);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return C.this.f5049g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return C.this.f5049g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (C.this.f5054l != this) {
                return;
            }
            this.f5073p.d0();
            try {
                this.f5074q.c(this, this.f5073p);
            } finally {
                this.f5073p.c0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return C.this.f5049g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            C.this.f5049g.setCustomView(view);
            this.f5075r = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i7) {
            o(C.this.f5043a.getResources().getString(i7));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            C.this.f5049g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i7) {
            r(C.this.f5043a.getResources().getString(i7));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            C.this.f5049g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z6) {
            super.s(z6);
            C.this.f5049g.setTitleOptional(z6);
        }

        public boolean t() {
            this.f5073p.d0();
            try {
                return this.f5074q.b(this, this.f5073p);
            } finally {
                this.f5073p.c0();
            }
        }
    }

    public C(Activity activity, boolean z6) {
        this.f5045c = activity;
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (z6) {
            return;
        }
        this.f5050h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J D(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void F() {
        if (this.f5064v) {
            this.f5064v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f5046d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    private void G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC1614f.f18852p);
        this.f5046d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f5048f = D(view.findViewById(AbstractC1614f.f18837a));
        this.f5049g = (ActionBarContextView) view.findViewById(AbstractC1614f.f18842f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC1614f.f18839c);
        this.f5047e = actionBarContainer;
        J j7 = this.f5048f;
        if (j7 == null || this.f5049g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f5043a = j7.a();
        boolean z6 = (this.f5048f.u() & 4) != 0;
        if (z6) {
            this.f5053k = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f5043a);
        L(aVarB.a() || z6);
        J(aVarB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f5043a.obtainStyledAttributes(null, e.j.f19023a, AbstractC1609a.f18730c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.f19073k, false)) {
            K(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.j.f19063i, 0);
        if (dimensionPixelSize != 0) {
            I(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void J(boolean z6) {
        this.f5059q = z6;
        if (z6) {
            this.f5047e.setTabContainer(null);
            this.f5048f.j(null);
        } else {
            this.f5048f.j(null);
            this.f5047e.setTabContainer(null);
        }
        boolean z7 = false;
        boolean z8 = E() == 2;
        this.f5048f.y(!this.f5059q && z8);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5046d;
        if (!this.f5059q && z8) {
            z7 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z7);
    }

    private boolean M() {
        return H.T(this.f5047e);
    }

    private void N() {
        if (this.f5064v) {
            return;
        }
        this.f5064v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5046d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        O(false);
    }

    private void O(boolean z6) {
        if (z(this.f5062t, this.f5063u, this.f5064v)) {
            if (this.f5065w) {
                return;
            }
            this.f5065w = true;
            C(z6);
            return;
        }
        if (this.f5065w) {
            this.f5065w = false;
            B(z6);
        }
    }

    static boolean z(boolean z6, boolean z7, boolean z8) {
        if (z8) {
            return true;
        }
        return (z6 || z7) ? false : true;
    }

    void A() {
        b.a aVar = this.f5056n;
        if (aVar != null) {
            aVar.a(this.f5055m);
            this.f5055m = null;
            this.f5056n = null;
        }
    }

    public void B(boolean z6) {
        View view;
        androidx.appcompat.view.h hVar = this.f5066x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f5060r != 0 || (!this.f5067y && !z6)) {
            this.f5040A.b(null);
            return;
        }
        this.f5047e.setAlpha(1.0f);
        this.f5047e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f7 = -this.f5047e.getHeight();
        if (z6) {
            this.f5047e.getLocationInWindow(new int[]{0, 0});
            f7 -= r5[1];
        }
        O oM = H.e(this.f5047e).m(f7);
        oM.k(this.f5042C);
        hVar2.c(oM);
        if (this.f5061s && (view = this.f5050h) != null) {
            hVar2.c(H.e(view).m(f7));
        }
        hVar2.f(f5038D);
        hVar2.e(250L);
        hVar2.g(this.f5040A);
        this.f5066x = hVar2;
        hVar2.h();
    }

    public void C(boolean z6) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f5066x;
        if (hVar != null) {
            hVar.a();
        }
        this.f5047e.setVisibility(0);
        if (this.f5060r == 0 && (this.f5067y || z6)) {
            this.f5047e.setTranslationY(0.0f);
            float f7 = -this.f5047e.getHeight();
            if (z6) {
                this.f5047e.getLocationInWindow(new int[]{0, 0});
                f7 -= r5[1];
            }
            this.f5047e.setTranslationY(f7);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            O oM = H.e(this.f5047e).m(0.0f);
            oM.k(this.f5042C);
            hVar2.c(oM);
            if (this.f5061s && (view2 = this.f5050h) != null) {
                view2.setTranslationY(f7);
                hVar2.c(H.e(this.f5050h).m(0.0f));
            }
            hVar2.f(f5039E);
            hVar2.e(250L);
            hVar2.g(this.f5041B);
            this.f5066x = hVar2;
            hVar2.h();
        } else {
            this.f5047e.setAlpha(1.0f);
            this.f5047e.setTranslationY(0.0f);
            if (this.f5061s && (view = this.f5050h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f5041B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5046d;
        if (actionBarOverlayLayout != null) {
            H.m0(actionBarOverlayLayout);
        }
    }

    public int E() {
        return this.f5048f.o();
    }

    public void H(int i7, int i8) {
        int iU = this.f5048f.u();
        if ((i8 & 4) != 0) {
            this.f5053k = true;
        }
        this.f5048f.l((i7 & i8) | ((~i8) & iU));
    }

    public void I(float f7) {
        H.x0(this.f5047e, f7);
    }

    public void K(boolean z6) {
        if (z6 && !this.f5046d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f5068z = z6;
        this.f5046d.setHideOnContentScrollEnabled(z6);
    }

    public void L(boolean z6) {
        this.f5048f.t(z6);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f5063u) {
            this.f5063u = false;
            O(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z6) {
        this.f5061s = z6;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f5063u) {
            return;
        }
        this.f5063u = true;
        O(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f5066x;
        if (hVar != null) {
            hVar.a();
            this.f5066x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i7) {
        this.f5060r = i7;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean h() {
        J j7 = this.f5048f;
        if (j7 == null || !j7.k()) {
            return false;
        }
        this.f5048f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void i(boolean z6) {
        if (z6 == this.f5057o) {
            return;
        }
        this.f5057o = z6;
        if (this.f5058p.size() <= 0) {
            return;
        }
        y.a(this.f5058p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public int j() {
        return this.f5048f.u();
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public Context k() {
        if (this.f5044b == null) {
            TypedValue typedValue = new TypedValue();
            this.f5043a.getTheme().resolveAttribute(AbstractC1609a.f18732e, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f5044b = new ContextThemeWrapper(this.f5043a, i7);
            } else {
                this.f5044b = this.f5043a;
            }
        }
        return this.f5044b;
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void m(Configuration configuration) {
        J(androidx.appcompat.view.a.b(this.f5043a).e());
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public boolean o(int i7, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f5054l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void r(boolean z6) {
        if (this.f5053k) {
            return;
        }
        s(z6);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void s(boolean z6) {
        H(z6 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void t(Drawable drawable) {
        this.f5048f.x(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void u(boolean z6) {
        androidx.appcompat.view.h hVar;
        this.f5067y = z6;
        if (z6 || (hVar = this.f5066x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void v(CharSequence charSequence) {
        this.f5048f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public void w(CharSequence charSequence) {
        this.f5048f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0521a
    public androidx.appcompat.view.b x(b.a aVar) {
        d dVar = this.f5054l;
        if (dVar != null) {
            dVar.c();
        }
        this.f5046d.setHideOnContentScrollEnabled(false);
        this.f5049g.k();
        d dVar2 = new d(this.f5049g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f5054l = dVar2;
        dVar2.k();
        this.f5049g.h(dVar2);
        y(true);
        return dVar2;
    }

    public void y(boolean z6) {
        O oP;
        O oF;
        if (z6) {
            N();
        } else {
            F();
        }
        if (!M()) {
            if (z6) {
                this.f5048f.r(4);
                this.f5049g.setVisibility(0);
                return;
            } else {
                this.f5048f.r(0);
                this.f5049g.setVisibility(8);
                return;
            }
        }
        if (z6) {
            oF = this.f5048f.p(4, 100L);
            oP = this.f5049g.f(0, 200L);
        } else {
            oP = this.f5048f.p(0, 200L);
            oF = this.f5049g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(oF, oP);
        hVar.h();
    }

    public C(Dialog dialog) {
        G(dialog.getWindow().getDecorView());
    }
}
