package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0582b;
import e.AbstractC1609a;
import e.AbstractC1615g;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0526c extends androidx.appcompat.view.menu.b implements AbstractC0582b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f6004A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f6005B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f6006C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f6007D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f6008E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f6009F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f6010G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f6011H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f6012I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final SparseBooleanArray f6013J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    e f6014K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    a f6015L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    RunnableC0124c f6016M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private b f6017N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final f f6018O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f6019P;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    d f6020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f6021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f6022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6023z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, AbstractC1609a.f18736i);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = C0526c.this.f6020w;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) C0526c.this).f5374u : view2);
            }
            j(C0526c.this.f6018O);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            C0526c c0526c = C0526c.this;
            c0526c.f6015L = null;
            c0526c.f6019P = 0;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = C0526c.this.f6015L;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0124c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private e f6026m;

        public RunnableC0124c(e eVar) {
            this.f6026m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) C0526c.this).f5368o != null) {
                ((androidx.appcompat.view.menu.b) C0526c.this).f5368o.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) C0526c.this).f5374u;
            if (view != null && view.getWindowToken() != null && this.f6026m.m()) {
                C0526c.this.f6014K = this.f6026m;
            }
            C0526c.this.f6016M = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    private class d extends r implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$d$a */
        class a extends S {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ C0526c f6029v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0526c c0526c) {
                super(view);
                this.f6029v = c0526c;
            }

            @Override // androidx.appcompat.widget.S
            public androidx.appcompat.view.menu.p b() {
                e eVar = C0526c.this.f6014K;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.S
            public boolean c() {
                C0526c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.S
            public boolean d() {
                C0526c c0526c = C0526c.this;
                if (c0526c.f6016M != null) {
                    return false;
                }
                c0526c.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC1609a.f18735h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            l0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C0526c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0526c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z6) {
            super(context, gVar, view, z6, AbstractC1609a.f18736i);
            h(8388613);
            j(C0526c.this.f6018O);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) C0526c.this).f5368o != null) {
                ((androidx.appcompat.view.menu.b) C0526c.this).f5368o.close();
            }
            C0526c.this.f6014K = null;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$f */
    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a aVarM = C0526c.this.m();
            if (aVarM != null) {
                aVarM.c(gVar, z6);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) C0526c.this).f5368o) {
                return false;
            }
            C0526c.this.f6019P = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a aVarM = C0526c.this.m();
            if (aVarM != null) {
                return aVarM.d(gVar);
            }
            return false;
        }
    }

    public C0526c(Context context) {
        super(context, AbstractC1615g.f18865c, AbstractC1615g.f18864b);
        this.f6013J = new SparseBooleanArray();
        this.f6018O = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f5374u;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f6020w;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f6022y) {
            return this.f6021x;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0124c runnableC0124c = this.f6016M;
        if (runnableC0124c != null && (obj = this.f5374u) != null) {
            ((View) obj).removeCallbacks(runnableC0124c);
            this.f6016M = null;
            return true;
        }
        e eVar = this.f6014K;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f6015L;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f6016M != null || E();
    }

    public boolean E() {
        e eVar = this.f6014K;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f6008E) {
            this.f6007D = androidx.appcompat.view.a.b(this.f5367n).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f5368o;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z6) {
        this.f6011H = z6;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f5374u = actionMenuView;
        actionMenuView.b(this.f5368o);
    }

    public void I(Drawable drawable) {
        d dVar = this.f6020w;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f6022y = true;
            this.f6021x = drawable;
        }
    }

    public void J(boolean z6) {
        this.f6023z = z6;
        this.f6004A = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f6023z || E() || (gVar = this.f5368o) == null || this.f5374u == null || this.f6016M != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0124c runnableC0124c = new RunnableC0124c(new e(this.f5367n, this.f5368o, this.f6020w, true));
        this.f6016M = runnableC0124c;
        ((View) this.f5374u).post(runnableC0124c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public void b(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f5374u);
        if (this.f6017N == null) {
            this.f6017N = new b();
        }
        actionMenuItemView.setPopupCallback(this.f6017N);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        y();
        super.c(gVar, z6);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        super.d(z6);
        ((View) this.f5374u).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f5368o;
        boolean z7 = false;
        if (gVar != null) {
            ArrayList arrayListS = gVar.s();
            int size = arrayListS.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC0582b abstractC0582bB = ((androidx.appcompat.view.menu.i) arrayListS.get(i7)).b();
                if (abstractC0582bB != null) {
                    abstractC0582bB.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f5368o;
        ArrayList arrayListZ = gVar2 != null ? gVar2.z() : null;
        if (this.f6023z && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z7 = !((androidx.appcompat.view.menu.i) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z7 = true;
            }
        }
        d dVar = this.f6020w;
        if (z7) {
            if (dVar == null) {
                this.f6020w = new d(this.f5366m);
            }
            ViewGroup viewGroup = (ViewGroup) this.f6020w.getParent();
            if (viewGroup != this.f5374u) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f6020w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f5374u;
                actionMenuView.addView(this.f6020w, actionMenuView.F());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f5374u;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f6020w);
            }
        }
        ((ActionMenuView) this.f5374u).setOverflowReserved(this.f6023z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.i] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        ArrayList arrayListE;
        int size;
        int i7;
        int iL;
        ?? r02;
        int i8;
        C0526c c0526c = this;
        androidx.appcompat.view.menu.g gVar = c0526c.f5368o;
        View view = null;
        ?? r32 = 0;
        if (gVar != null) {
            arrayListE = gVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i9 = c0526c.f6007D;
        int i10 = c0526c.f6006C;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0526c.f5374u;
        boolean z6 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayListE.get(i13);
            if (iVar.o()) {
                i11++;
            } else if (iVar.n()) {
                i12++;
            } else {
                z6 = true;
            }
            if (c0526c.f6011H && iVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (c0526c.f6023z && (z6 || i12 + i11 > i9)) {
            i9--;
        }
        int i14 = i9 - i11;
        SparseBooleanArray sparseBooleanArray = c0526c.f6013J;
        sparseBooleanArray.clear();
        if (c0526c.f6009F) {
            int i15 = c0526c.f6012I;
            iL = i10 / i15;
            i7 = i15 + ((i10 % i15) / iL);
        } else {
            i7 = 0;
            iL = 0;
        }
        int i16 = 0;
        int i17 = 0;
        ?? r03 = c0526c;
        while (i16 < size) {
            ?? r15 = (androidx.appcompat.view.menu.i) arrayListE.get(i16);
            if (r15.o()) {
                View viewN = r03.n(r15, view, viewGroup);
                if (r03.f6009F) {
                    iL -= ActionMenuView.L(viewN, i7, iL, iMakeMeasureSpec, r32);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r02 = r32;
                i8 = size;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z7 = sparseBooleanArray.get(groupId2);
                boolean z8 = (i14 > 0 || z7) && i10 > 0 && (!r03.f6009F || iL > 0);
                boolean z9 = z8;
                i8 = size;
                if (z8) {
                    View viewN2 = r03.n(r15, null, viewGroup);
                    if (r03.f6009F) {
                        int iL2 = ActionMenuView.L(viewN2, i7, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z9 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z10 = z9;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z8 = z10 & (!r03.f6009F ? i10 + i17 <= 0 : i10 < 0);
                }
                if (z8 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z7) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i18 = 0; i18 < i16; i18++) {
                        androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) arrayListE.get(i18);
                        if (iVar2.getGroupId() == groupId2) {
                            if (iVar2.l()) {
                                i14++;
                            }
                            iVar2.u(false);
                        }
                    }
                }
                if (z8) {
                    i14--;
                }
                r15.u(z8);
                r02 = 0;
            } else {
                r02 = r32;
                i8 = size;
                r15.u(r02);
            }
            i16++;
            r32 = r02;
            size = i8;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void i(Context context, androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f6004A) {
            this.f6023z = aVarB.f();
        }
        if (!this.f6010G) {
            this.f6005B = aVarB.c();
        }
        if (!this.f6008E) {
            this.f6007D = aVarB.d();
        }
        int measuredWidth = this.f6005B;
        if (this.f6023z) {
            if (this.f6020w == null) {
                d dVar = new d(this.f5366m);
                this.f6020w = dVar;
                if (this.f6022y) {
                    dVar.setImageDrawable(this.f6021x);
                    this.f6021x = null;
                    this.f6022y = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6020w.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f6020w.getMeasuredWidth();
        } else {
            this.f6020w = null;
        }
        this.f6006C = measuredWidth;
        this.f6012I = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        boolean z6 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f5368o) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View viewZ = z(rVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.f6019P = rVar.getItem().getItemId();
        int size = rVar.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                z6 = true;
                break;
            }
            i7++;
        }
        a aVar = new a(this.f5367n, rVar, viewZ);
        this.f6015L = aVar;
        aVar.g(z6);
        this.f6015L.k();
        super.k(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i7) {
        if (viewGroup.getChildAt(i7) == this.f6020w) {
            return false;
        }
        return super.l(viewGroup, i7);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f5374u;
        androidx.appcompat.view.menu.n nVarO = super.o(viewGroup);
        if (nVar != nVarO) {
            ((ActionMenuView) nVarO).setPresenter(this);
        }
        return nVarO;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i7, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
