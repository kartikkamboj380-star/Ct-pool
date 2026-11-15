package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.V;
import androidx.appcompat.widget.W;
import androidx.core.view.AbstractC0595o;
import androidx.core.view.H;
import e.AbstractC1612d;
import e.AbstractC1615g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f5379N = AbstractC1615g.f18867e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f5380A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    View f5381B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f5383D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f5384E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f5385F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f5386G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f5388I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private m.a f5389J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    ViewTreeObserver f5390K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private PopupWindow.OnDismissListener f5391L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    boolean f5392M;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f5394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f5395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f5396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f5397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Handler f5398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f5399t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List f5400u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f5401v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f5402w = new b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final V f5403x = new c();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5404y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f5405z = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f5387H = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f5382C = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.f5400u.size() <= 0 || ((C0122d) d.this.f5400u.get(0)).f5413a.B()) {
                return;
            }
            View view = d.this.f5381B;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator it = d.this.f5400u.iterator();
            while (it.hasNext()) {
                ((C0122d) it.next()).f5413a.b();
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
            ViewTreeObserver viewTreeObserver = d.this.f5390K;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f5390K = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f5390K.removeGlobalOnLayoutListener(dVar.f5401v);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements V {

        class a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ C0122d f5409m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MenuItem f5410n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ g f5411o;

            a(C0122d c0122d, MenuItem menuItem, g gVar) {
                this.f5409m = c0122d;
                this.f5410n = menuItem;
                this.f5411o = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0122d c0122d = this.f5409m;
                if (c0122d != null) {
                    d.this.f5392M = true;
                    c0122d.f5414b.e(false);
                    d.this.f5392M = false;
                }
                if (this.f5410n.isEnabled() && this.f5410n.hasSubMenu()) {
                    this.f5411o.L(this.f5410n, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.V
        public void d(g gVar, MenuItem menuItem) {
            d.this.f5398s.removeCallbacksAndMessages(null);
            int size = d.this.f5400u.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (gVar == ((C0122d) d.this.f5400u.get(i7)).f5414b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            d.this.f5398s.postAtTime(new a(i8 < d.this.f5400u.size() ? (C0122d) d.this.f5400u.get(i8) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.V
        public void g(g gVar, MenuItem menuItem) {
            d.this.f5398s.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0122d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W f5413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f5414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5415c;

        public C0122d(W w6, g gVar, int i7) {
            this.f5413a = w6;
            this.f5414b = gVar;
            this.f5415c = i7;
        }

        public ListView a() {
            return this.f5413a.j();
        }
    }

    public d(Context context, View view, int i7, int i8, boolean z6) {
        this.f5393n = context;
        this.f5380A = view;
        this.f5395p = i7;
        this.f5396q = i8;
        this.f5397r = z6;
        Resources resources = context.getResources();
        this.f5394o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1612d.f18764b));
        this.f5398s = new Handler();
    }

    private int A(g gVar) {
        int size = this.f5400u.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (gVar == ((C0122d) this.f5400u.get(i7)).f5414b) {
                return i7;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = gVar.getItem(i7);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0122d c0122d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(c0122d.f5414b, gVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = c0122d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i7 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i7 >= count) {
                i7 = -1;
                break;
            }
            if (menuItemB == fVar.getItem(i7)) {
                break;
            }
            i7++;
        }
        if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return H.B(this.f5380A) == 1 ? 0 : 1;
    }

    private int E(int i7) {
        List list = this.f5400u;
        ListView listViewA = ((C0122d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f5381B.getWindowVisibleDisplayFrame(rect);
        return this.f5382C == 1 ? (iArr[0] + listViewA.getWidth()) + i7 > rect.right ? 0 : 1 : iArr[0] - i7 < 0 ? 1 : 0;
    }

    private void F(g gVar) {
        C0122d c0122d;
        View viewC;
        int i7;
        int i8;
        int i9;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5393n);
        f fVar = new f(gVar, layoutInflaterFrom, this.f5397r, f5379N);
        if (!a() && this.f5387H) {
            fVar.d(true);
        } else if (a()) {
            fVar.d(k.x(gVar));
        }
        int iO = k.o(fVar, null, this.f5393n, this.f5394o);
        W wZ = z();
        wZ.p(fVar);
        wZ.F(iO);
        wZ.G(this.f5405z);
        if (this.f5400u.size() > 0) {
            List list = this.f5400u;
            c0122d = (C0122d) list.get(list.size() - 1);
            viewC = C(c0122d, gVar);
        } else {
            c0122d = null;
            viewC = null;
        }
        if (viewC != null) {
            wZ.U(false);
            wZ.R(null);
            int iE = E(iO);
            boolean z6 = iE == 1;
            this.f5382C = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                wZ.D(viewC);
                i8 = 0;
                i7 = 0;
            } else {
                int[] iArr = new int[2];
                this.f5380A.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f5405z & 7) == 5) {
                    iArr[0] = iArr[0] + this.f5380A.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i7 = iArr2[0] - iArr[0];
                i8 = iArr2[1] - iArr[1];
            }
            if ((this.f5405z & 5) == 5) {
                if (!z6) {
                    iO = viewC.getWidth();
                    i9 = i7 - iO;
                }
                i9 = i7 + iO;
            } else {
                if (z6) {
                    iO = viewC.getWidth();
                    i9 = i7 + iO;
                }
                i9 = i7 - iO;
            }
            wZ.e(i9);
            wZ.M(true);
            wZ.l(i8);
        } else {
            if (this.f5383D) {
                wZ.e(this.f5385F);
            }
            if (this.f5384E) {
                wZ.l(this.f5386G);
            }
            wZ.H(n());
        }
        this.f5400u.add(new C0122d(wZ, gVar, this.f5382C));
        wZ.b();
        ListView listViewJ = wZ.j();
        listViewJ.setOnKeyListener(this);
        if (c0122d == null && this.f5388I && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(AbstractC1615g.f18874l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            wZ.b();
        }
    }

    private W z() {
        W w6 = new W(this.f5393n, null, this.f5395p, this.f5396q);
        w6.T(this.f5403x);
        w6.L(this);
        w6.K(this);
        w6.D(this.f5380A);
        w6.G(this.f5405z);
        w6.J(true);
        w6.I(2);
        return w6;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.f5400u.size() > 0 && ((C0122d) this.f5400u.get(0)).f5413a.a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        if (a()) {
            return;
        }
        Iterator it = this.f5399t.iterator();
        while (it.hasNext()) {
            F((g) it.next());
        }
        this.f5399t.clear();
        View view = this.f5380A;
        this.f5381B = view;
        if (view != null) {
            boolean z6 = this.f5390K == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f5390K = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f5401v);
            }
            this.f5381B.addOnAttachStateChangeListener(this.f5402w);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z6) {
        int iA = A(gVar);
        if (iA < 0) {
            return;
        }
        int i7 = iA + 1;
        if (i7 < this.f5400u.size()) {
            ((C0122d) this.f5400u.get(i7)).f5414b.e(false);
        }
        C0122d c0122d = (C0122d) this.f5400u.remove(iA);
        c0122d.f5414b.O(this);
        if (this.f5392M) {
            c0122d.f5413a.S(null);
            c0122d.f5413a.E(0);
        }
        c0122d.f5413a.dismiss();
        int size = this.f5400u.size();
        this.f5382C = size > 0 ? ((C0122d) this.f5400u.get(size - 1)).f5415c : D();
        if (size != 0) {
            if (z6) {
                ((C0122d) this.f5400u.get(0)).f5414b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.f5389J;
        if (aVar != null) {
            aVar.c(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f5390K;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f5390K.removeGlobalOnLayoutListener(this.f5401v);
            }
            this.f5390K = null;
        }
        this.f5381B.removeOnAttachStateChangeListener(this.f5402w);
        this.f5391L.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        Iterator it = this.f5400u.iterator();
        while (it.hasNext()) {
            k.y(((C0122d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f5400u.size();
        if (size > 0) {
            C0122d[] c0122dArr = (C0122d[]) this.f5400u.toArray(new C0122d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C0122d c0122d = c0122dArr[i7];
                if (c0122d.f5413a.a()) {
                    c0122d.f5413a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f5389J = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        if (this.f5400u.isEmpty()) {
            return null;
        }
        return ((C0122d) this.f5400u.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        for (C0122d c0122d : this.f5400u) {
            if (rVar == c0122d.f5414b) {
                c0122d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.f5389J;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.f5393n);
        if (a()) {
            F(gVar);
        } else {
            this.f5399t.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0122d c0122d;
        int size = this.f5400u.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c0122d = null;
                break;
            }
            c0122d = (C0122d) this.f5400u.get(i7);
            if (!c0122d.f5413a.a()) {
                break;
            } else {
                i7++;
            }
        }
        if (c0122d != null) {
            c0122d.f5414b.e(false);
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
        if (this.f5380A != view) {
            this.f5380A = view;
            this.f5405z = AbstractC0595o.b(this.f5404y, H.B(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z6) {
        this.f5387H = z6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i7) {
        if (this.f5404y != i7) {
            this.f5404y = i7;
            this.f5405z = AbstractC0595o.b(i7, H.B(this.f5380A));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i7) {
        this.f5383D = true;
        this.f5385F = i7;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f5391L = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z6) {
        this.f5388I = z6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i7) {
        this.f5384E = true;
        this.f5386G = i7;
    }
}
