package com.google.android.material.appbar;

import A3.i;
import A3.j;
import N3.g;
import N3.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.H;
import com.google.android.material.internal.l;
import com.google.android.material.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f16468o0 = i.f273q;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f16469p0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Integer f16470j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f16471k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f16472l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private ImageView.ScaleType f16473m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Boolean f16474n0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f100F);
    }

    private Pair U(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i7 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void V(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.V(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.L(context);
            gVar.U(H.w(this));
            H.t0(this, gVar);
        }
    }

    private void W(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i7;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i7 += iMax;
            i8 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i8 - i7, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i7, view.getTop(), i8, view.getBottom());
    }

    private void X() {
        if (this.f16471k0 || this.f16472l0) {
            TextView textViewE = m.e(this);
            TextView textViewC = m.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairU = U(textViewE, textViewC);
            if (this.f16471k0 && textViewE != null) {
                W(textViewE, pairU);
            }
            if (!this.f16472l0 || textViewC == null) {
                return;
            }
            W(textViewC, pairU);
        }
    }

    private Drawable Y(Drawable drawable) {
        if (drawable == null || this.f16470j0 == null) {
            return drawable;
        }
        Drawable drawableL = androidx.core.graphics.drawable.a.l(drawable.mutate());
        androidx.core.graphics.drawable.a.h(drawableL, this.f16470j0.intValue());
        return drawableL;
    }

    private void Z() {
        ImageView imageViewB = m.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f16474n0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f16473m0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f16473m0;
    }

    public Integer getNavigationIconTint() {
        return this.f16470j0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        X();
        Z();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        h.d(this, f7);
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        Boolean bool = this.f16474n0;
        if (bool == null || bool.booleanValue() != z6) {
            this.f16474n0 = Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f16473m0 != scaleType) {
            this.f16473m0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Y(drawable));
    }

    public void setNavigationIconTint(int i7) {
        this.f16470j0 = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f16472l0 != z6) {
            this.f16472l0 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f16471k0 != z6) {
            this.f16471k0 = z6;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16468o0;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f628w3, i7, i8, new int[0]);
        if (typedArrayH.hasValue(j.f649z3)) {
            setNavigationIconTint(typedArrayH.getColor(j.f649z3, -1));
        }
        this.f16471k0 = typedArrayH.getBoolean(j.f285B3, false);
        this.f16472l0 = typedArrayH.getBoolean(j.f278A3, false);
        int i9 = typedArrayH.getInt(j.f642y3, -1);
        if (i9 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f16469p0;
            if (i9 < scaleTypeArr.length) {
                this.f16473m0 = scaleTypeArr[i9];
            }
        }
        if (typedArrayH.hasValue(j.f635x3)) {
            this.f16474n0 = Boolean.valueOf(typedArrayH.getBoolean(j.f635x3, false));
        }
        typedArrayH.recycle();
        V(context2);
    }
}
