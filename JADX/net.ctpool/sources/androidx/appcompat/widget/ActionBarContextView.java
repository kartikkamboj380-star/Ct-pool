package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.AbstractC1609a;
import e.AbstractC1614f;
import e.AbstractC1615g;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0524a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TextView f5586A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TextView f5587B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f5588C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f5589D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f5590E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f5591F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f5592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f5593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f5594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f5595x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f5596y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private LinearLayout f5597z;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f5598m;

        a(androidx.appcompat.view.b bVar) {
            this.f5598m = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f5598m.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f5597z == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC1615g.f18863a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f5597z = linearLayout;
            this.f5586A = (TextView) linearLayout.findViewById(AbstractC1614f.f18841e);
            this.f5587B = (TextView) this.f5597z.findViewById(AbstractC1614f.f18840d);
            if (this.f5588C != 0) {
                this.f5586A.setTextAppearance(getContext(), this.f5588C);
            }
            if (this.f5589D != 0) {
                this.f5587B.setTextAppearance(getContext(), this.f5589D);
            }
        }
        this.f5586A.setText(this.f5592u);
        this.f5587B.setText(this.f5593v);
        boolean z6 = !TextUtils.isEmpty(this.f5592u);
        boolean z7 = !TextUtils.isEmpty(this.f5593v);
        this.f5587B.setVisibility(z7 ? 0 : 8);
        this.f5597z.setVisibility((z6 || z7) ? 0 : 8);
        if (this.f5597z.getParent() == null) {
            addView(this.f5597z);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0524a
    public /* bridge */ /* synthetic */ androidx.core.view.O f(int i7, long j7) {
        return super.f(i7, j7);
    }

    public void g() {
        if (this.f5594w == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0524a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0524a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f5593v;
    }

    public CharSequence getTitle() {
        return this.f5592u;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(androidx.appcompat.view.b bVar) {
        View viewInflate;
        C0526c c0526c;
        View view = this.f5594w;
        if (view != null) {
            if (view.getParent() == null) {
                viewInflate = this.f5594w;
            }
            View viewFindViewById = this.f5594w.findViewById(AbstractC1614f.f18845i);
            this.f5595x = viewFindViewById;
            viewFindViewById.setOnClickListener(new a(bVar));
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
            c0526c = this.f5976p;
            if (c0526c != null) {
                c0526c.y();
            }
            C0526c c0526c2 = new C0526c(getContext());
            this.f5976p = c0526c2;
            c0526c2.J(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            gVar.c(this.f5976p, this.f5974n);
            ActionMenuView actionMenuView = (ActionMenuView) this.f5976p.o(this);
            this.f5975o = actionMenuView;
            androidx.core.view.H.t0(actionMenuView, null);
            addView(this.f5975o, layoutParams);
        }
        viewInflate = LayoutInflater.from(getContext()).inflate(this.f5591F, (ViewGroup) this, false);
        this.f5594w = viewInflate;
        addView(viewInflate);
        View viewFindViewById2 = this.f5594w.findViewById(AbstractC1614f.f18845i);
        this.f5595x = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) bVar.e();
        c0526c = this.f5976p;
        if (c0526c != null) {
        }
        C0526c c0526c22 = new C0526c(getContext());
        this.f5976p = c0526c22;
        c0526c22.J(true);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        gVar2.c(this.f5976p, this.f5974n);
        ActionMenuView actionMenuView2 = (ActionMenuView) this.f5976p.o(this);
        this.f5975o = actionMenuView2;
        androidx.core.view.H.t0(actionMenuView2, null);
        addView(this.f5975o, layoutParams2);
    }

    public boolean j() {
        return this.f5590E;
    }

    public void k() {
        removeAllViews();
        this.f5596y = null;
        this.f5975o = null;
        this.f5976p = null;
        View view = this.f5595x;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C0526c c0526c = this.f5976p;
        if (c0526c != null) {
            return c0526c.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0526c c0526c = this.f5976p;
        if (c0526c != null) {
            c0526c.B();
            this.f5976p.C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0524a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        boolean zB = r0.b(this);
        int paddingRight = zB ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f5594w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5594w.getLayoutParams();
            int i11 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC0524a.d(paddingRight, i11, zB);
            paddingRight = AbstractC0524a.d(iD + e(this.f5594w, iD, paddingTop, paddingTop2, zB), i12, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f5597z;
        if (linearLayout != null && this.f5596y == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f5597z, iE, paddingTop, paddingTop2, zB);
        }
        int i13 = iE;
        View view2 = this.f5596y;
        if (view2 != null) {
            e(view2, i13, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f5975o;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = this.f5977q;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i8);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f5594w;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5594w.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f5975o;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f5975o, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f5597z;
        if (linearLayout != null && this.f5596y == null) {
            if (this.f5590E) {
                this.f5597z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f5597z.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f5597z.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f5596y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                iMin = Math.min(i11, iMin);
            }
            this.f5596y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(iMin, i12));
        }
        if (this.f5977q > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // androidx.appcompat.widget.AbstractC0524a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0524a
    public void setContentHeight(int i7) {
        this.f5977q = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f5596y;
        if (view2 != null) {
            removeView(view2);
        }
        this.f5596y = view;
        if (view != null && (linearLayout = this.f5597z) != null) {
            removeView(linearLayout);
            this.f5597z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f5593v = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f5592u = charSequence;
        i();
        androidx.core.view.H.s0(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f5590E) {
            requestLayout();
        }
        this.f5590E = z6;
    }

    @Override // androidx.appcompat.widget.AbstractC0524a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18734g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        h0 h0VarV = h0.v(context, attributeSet, e.j.f19143y, i7, 0);
        androidx.core.view.H.t0(this, h0VarV.g(e.j.f19148z));
        this.f5588C = h0VarV.n(e.j.f18916D, 0);
        this.f5589D = h0VarV.n(e.j.f18911C, 0);
        this.f5977q = h0VarV.m(e.j.f18906B, 0);
        this.f5591F = h0VarV.n(e.j.f18901A, AbstractC1615g.f18866d);
        h0VarV.w();
    }
}
