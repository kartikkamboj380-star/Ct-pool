package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.W;
import androidx.core.view.H;
import e.AbstractC1612d;
import e.AbstractC1615g;

/* JADX INFO: loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final int f5522H = AbstractC1615g.f18875m;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private m.a f5523A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    ViewTreeObserver f5524B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f5525C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f5526D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f5527E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f5529G;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g f5531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final f f5532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f5533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f5534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f5535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final W f5537u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private PopupWindow.OnDismissListener f5540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f5541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    View f5542z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f5538v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f5539w = new b();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f5528F = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.a() || q.this.f5537u.B()) {
                return;
            }
            View view = q.this.f5542z;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f5537u.b();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.f5524B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f5524B = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f5524B.removeGlobalOnLayoutListener(qVar.f5538v);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i7, int i8, boolean z6) {
        this.f5530n = context;
        this.f5531o = gVar;
        this.f5533q = z6;
        this.f5532p = new f(gVar, LayoutInflater.from(context), z6, f5522H);
        this.f5535s = i7;
        this.f5536t = i8;
        Resources resources = context.getResources();
        this.f5534r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1612d.f18764b));
        this.f5541y = view;
        this.f5537u = new W(context, null, i7, i8);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f5525C || (view = this.f5541y) == null) {
            return false;
        }
        this.f5542z = view;
        this.f5537u.K(this);
        this.f5537u.L(this);
        this.f5537u.J(true);
        View view2 = this.f5542z;
        boolean z6 = this.f5524B == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f5524B = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f5538v);
        }
        view2.addOnAttachStateChangeListener(this.f5539w);
        this.f5537u.D(view2);
        this.f5537u.G(this.f5528F);
        if (!this.f5526D) {
            this.f5527E = k.o(this.f5532p, null, this.f5530n, this.f5534r);
            this.f5526D = true;
        }
        this.f5537u.F(this.f5527E);
        this.f5537u.I(2);
        this.f5537u.H(n());
        this.f5537u.b();
        ListView listViewJ = this.f5537u.j();
        listViewJ.setOnKeyListener(this);
        if (this.f5529G && this.f5531o.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f5530n).inflate(AbstractC1615g.f18874l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f5531o.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f5537u.p(this.f5532p);
        this.f5537u.b();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return !this.f5525C && this.f5537u.a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z6) {
        if (gVar != this.f5531o) {
            return;
        }
        dismiss();
        m.a aVar = this.f5523A;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        this.f5526D = false;
        f fVar = this.f5532p;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (a()) {
            this.f5537u.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f5523A = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.f5537u.j();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f5530n, rVar, this.f5542z, this.f5533q, this.f5535s, this.f5536t);
            lVar.j(this.f5523A);
            lVar.g(k.x(rVar));
            lVar.i(this.f5540x);
            this.f5540x = null;
            this.f5531o.e(false);
            int iC = this.f5537u.c();
            int iO = this.f5537u.o();
            if ((Gravity.getAbsoluteGravity(this.f5528F, H.B(this.f5541y)) & 7) == 5) {
                iC += this.f5541y.getWidth();
            }
            if (lVar.n(iC, iO)) {
                m.a aVar = this.f5523A;
                if (aVar == null) {
                    return true;
                }
                aVar.d(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f5525C = true;
        this.f5531o.close();
        ViewTreeObserver viewTreeObserver = this.f5524B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f5524B = this.f5542z.getViewTreeObserver();
            }
            this.f5524B.removeGlobalOnLayoutListener(this.f5538v);
            this.f5524B = null;
        }
        this.f5542z.removeOnAttachStateChangeListener(this.f5539w);
        PopupWindow.OnDismissListener onDismissListener = this.f5540x;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.f5541y = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z6) {
        this.f5532p.d(z6);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i7) {
        this.f5528F = i7;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i7) {
        this.f5537u.e(i7);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f5540x = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z6) {
        this.f5529G = z6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i7) {
        this.f5537u.l(i7);
    }
}
