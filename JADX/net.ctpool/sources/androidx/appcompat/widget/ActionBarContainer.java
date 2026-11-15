package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import e.AbstractC1614f;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f5577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f5578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f5579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Drawable f5580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Drawable f5581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Drawable f5582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f5583t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f5584u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5585v;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.H.t0(this, new C0525b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f19023a);
        this.f5580q = typedArrayObtainStyledAttributes.getDrawable(e.j.f19028b);
        this.f5581r = typedArrayObtainStyledAttributes.getDrawable(e.j.f19038d);
        this.f5585v = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.j.f19068j, -1);
        boolean z6 = true;
        if (getId() == AbstractC1614f.f18828H) {
            this.f5583t = true;
            this.f5582s = typedArrayObtainStyledAttributes.getDrawable(e.j.f19033c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f5583t ? this.f5580q != null || this.f5581r != null : this.f5582s != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5580q;
        if (drawable != null && drawable.isStateful()) {
            this.f5580q.setState(getDrawableState());
        }
        Drawable drawable2 = this.f5581r;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f5581r.setState(getDrawableState());
        }
        Drawable drawable3 = this.f5582s;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f5582s.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f5577n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5580q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5581r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f5582s;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5578o = findViewById(AbstractC1614f.f18837a);
        this.f5579p = findViewById(AbstractC1614f.f18842f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f5576m || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z6, i7, i8, i9, i10);
        View view2 = this.f5577n;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i11 = layoutParams.bottomMargin;
            view2.layout(i7, measuredHeight2 - i11, i9, measuredHeight - i11);
        }
        if (this.f5583t) {
            Drawable drawable3 = this.f5582s;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = z8;
            }
        } else {
            if (this.f5580q != null) {
                if (this.f5578o.getVisibility() == 0) {
                    drawable2 = this.f5580q;
                    left = this.f5578o.getLeft();
                    top = this.f5578o.getTop();
                    right = this.f5578o.getRight();
                    view = this.f5578o;
                } else {
                    View view3 = this.f5579p;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f5580q.setBounds(0, 0, 0, 0);
                        z8 = true;
                    } else {
                        drawable2 = this.f5580q;
                        left = this.f5579p.getLeft();
                        top = this.f5579p.getTop();
                        right = this.f5579p.getRight();
                        view = this.f5579p;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z8 = true;
            }
            this.f5584u = z9;
            if (z9 && (drawable = this.f5581r) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z7) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i7, int i8) {
        int iA;
        View view;
        int i9;
        if (this.f5578o == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f5585v) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f5578o == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        View view2 = this.f5577n;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!b(this.f5578o)) {
            view = this.f5578o;
        } else {
            if (b(this.f5579p)) {
                iA = 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f5577n), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i8) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            view = this.f5579p;
        }
        iA = a(view);
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f5577n), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i8) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f5580q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5580q);
        }
        this.f5580q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f5578o;
            if (view != null) {
                this.f5580q.setBounds(view.getLeft(), this.f5578o.getTop(), this.f5578o.getRight(), this.f5578o.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f5583t ? !(this.f5580q != null || this.f5581r != null) : this.f5582s == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5582s;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5582s);
        }
        this.f5582s = drawable;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5583t && (drawable2 = this.f5582s) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f5583t ? !(this.f5580q != null || this.f5581r != null) : this.f5582s == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5581r;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5581r);
        }
        this.f5581r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5584u && (drawable2 = this.f5581r) != null) {
                drawable2.setBounds(this.f5577n.getLeft(), this.f5577n.getTop(), this.f5577n.getRight(), this.f5577n.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f5583t ? !(this.f5580q != null || this.f5581r != null) : this.f5582s == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(a0 a0Var) {
        View view = this.f5577n;
        if (view != null) {
            removeView(view);
        }
        this.f5577n = a0Var;
    }

    public void setTransitioning(boolean z6) {
        this.f5576m = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f5580q;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f5581r;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f5582s;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f5580q && !this.f5583t) || (drawable == this.f5581r && this.f5584u) || ((drawable == this.f5582s && this.f5583t) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}
