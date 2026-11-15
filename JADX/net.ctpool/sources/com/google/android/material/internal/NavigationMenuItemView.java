package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.l0;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import e.AbstractC1609a;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends f implements n.a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final int[] f16908R = {R.attr.state_checked};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f16909H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f16910I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f16911J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final CheckedTextView f16912K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private FrameLayout f16913L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private androidx.appcompat.view.menu.i f16914M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ColorStateList f16915N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f16916O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Drawable f16917P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final C0574a f16918Q;

    class a extends C0574a {
        a() {
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            c7.e0(NavigationMenuItemView.this.f16911J);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        T.a aVar;
        int i7;
        if (D()) {
            this.f16912K.setVisibility(8);
            FrameLayout frameLayout = this.f16913L;
            if (frameLayout == null) {
                return;
            }
            aVar = (T.a) frameLayout.getLayoutParams();
            i7 = -1;
        } else {
            this.f16912K.setVisibility(0);
            FrameLayout frameLayout2 = this.f16913L;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (T.a) frameLayout2.getLayoutParams();
            i7 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i7;
        this.f16913L.setLayoutParams(aVar);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC1609a.f18747t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f16908R, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f16914M.getTitle() == null && this.f16914M.getIcon() == null && this.f16914M.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f16913L == null) {
                this.f16913L = (FrameLayout) ((ViewStub) findViewById(A3.e.f198d)).inflate();
            }
            this.f16913L.removeAllViews();
            this.f16913L.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(androidx.appcompat.view.menu.i iVar, int i7) {
        this.f16914M = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            H.t0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        l0.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.f16914M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        androidx.appcompat.view.menu.i iVar = this.f16914M;
        if (iVar != null && iVar.isCheckable() && this.f16914M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16908R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.f16911J != z6) {
            this.f16911J = z6;
            this.f16918Q.l(this.f16912K, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        this.f16912K.setChecked(z6);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, getPaddingTop(), i7, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f16916O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
                androidx.core.graphics.drawable.a.i(drawable, this.f16915N);
            }
            int i7 = this.f16909H;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.f16910I) {
            if (this.f16917P == null) {
                Drawable drawableF = androidx.core.content.res.f.f(getResources(), A3.d.f181g, getContext().getTheme());
                this.f16917P = drawableF;
                if (drawableF != null) {
                    int i8 = this.f16909H;
                    drawableF.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.f16917P;
        }
        androidx.core.widget.i.i(this.f16912K, drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.f16912K.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(int i7) {
        this.f16909H = i7;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f16915N = colorStateList;
        this.f16916O = colorStateList != null;
        androidx.appcompat.view.menu.i iVar = this.f16914M;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.f16912K.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f16910I = z6;
    }

    public void setTextAppearance(int i7) {
        androidx.core.widget.i.n(this.f16912K, i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f16912K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f16912K.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a aVar = new a();
        this.f16918Q = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(A3.g.f223a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(A3.c.f151c));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(A3.e.f199e);
        this.f16912K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        H.p0(checkedTextView, aVar);
    }
}
