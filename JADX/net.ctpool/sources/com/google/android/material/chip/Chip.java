package com.google.android.material.chip;

import A3.i;
import A3.j;
import K3.f;
import N3.k;
import N3.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0530g;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import com.google.android.material.internal.l;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0530g implements a.InterfaceC0226a, n, h {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int f16661J = i.f266j;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Rect f16662K = new Rect();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final int[] f16663L = {R.attr.state_selected};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int[] f16664M = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f16665A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f16666B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f16667C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CharSequence f16668D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final d f16669E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f16670F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Rect f16671G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final RectF f16672H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final f f16673I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.material.chip.a f16674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InsetDrawable f16675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RippleDrawable f16676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View.OnClickListener f16677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f16678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h.a f16679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f16681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f16682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f16683z;

    class a extends f {
        a() {
        }

        @Override // K3.f
        public void a(int i7) {
        }

        @Override // K3.f
        public void b(Typeface typeface, boolean z6) {
            Chip chip = Chip.this;
            chip.setText(chip.f16674q.H2() ? Chip.this.f16674q.d1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            if (Chip.this.f16679v != null) {
                Chip.this.f16679v.a(Chip.this, z6);
            }
            if (Chip.this.f16678u != null) {
                Chip.this.f16678u.onCheckedChanged(compoundButton, z6);
            }
        }
    }

    class c extends ViewOutlineProvider {
        c() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f16674q != null) {
                Chip.this.f16674q.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class d extends A.a {
        d(Chip chip) {
            super(chip);
        }

        @Override // A.a
        protected int B(float f7, float f8) {
            return (Chip.this.o() && Chip.this.getCloseIconTouchBounds().contains(f7, f8)) ? 1 : 0;
        }

        @Override // A.a
        protected void C(List list) {
            list.add(0);
            if (Chip.this.o() && Chip.this.t() && Chip.this.f16677t != null) {
                list.add(1);
            }
        }

        @Override // A.a
        protected boolean J(int i7, int i8, Bundle bundle) {
            if (i8 != 16) {
                return false;
            }
            if (i7 == 0) {
                return Chip.this.performClick();
            }
            if (i7 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // A.a
        protected void M(C c7) {
            c7.e0(Chip.this.s());
            c7.h0(Chip.this.isClickable());
            c7.g0(Chip.this.getAccessibilityClassName());
            c7.H0(Chip.this.getText());
        }

        @Override // A.a
        protected void N(int i7, C c7) {
            if (i7 != 1) {
                c7.k0("");
                c7.c0(Chip.f16662K);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                closeIconContentDescription = Chip.this.getContext().getString(A3.h.f248h, TextUtils.isEmpty(text) ? "" : text).trim();
            }
            c7.k0(closeIconContentDescription);
            c7.c0(Chip.this.getCloseIconTouchBoundsInt());
            c7.b(C.a.f7368i);
            c7.l0(Chip.this.isEnabled());
        }

        @Override // A.a
        protected void O(int i7, boolean z6) {
            if (i7 == 1) {
                Chip.this.f16683z = z6;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f106f);
    }

    private void A() {
        this.f16676s = new RippleDrawable(L3.b.a(this.f16674q.b1()), getBackgroundDrawable(), null);
        this.f16674q.G2(false);
        H.t0(this, this.f16676s);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f16674q) == null) {
            return;
        }
        int iF0 = (int) (aVar.F0() + this.f16674q.f1() + this.f16674q.m0());
        int iK0 = (int) (this.f16674q.K0() + this.f16674q.g1() + this.f16674q.i0());
        if (this.f16675r != null) {
            Rect rect = new Rect();
            this.f16675r.getPadding(rect);
            iK0 += rect.left;
            iF0 += rect.right;
        }
        H.D0(this, iK0, getPaddingTop(), iF0, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        K3.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f16673I);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f16672H.setEmpty();
        if (o() && this.f16677t != null) {
            this.f16674q.U0(this.f16672H);
        }
        return this.f16672H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f16671G.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f16671G;
    }

    private K3.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.l2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] l() {
        ?? IsEnabled = isEnabled();
        int i7 = IsEnabled;
        if (this.f16683z) {
            i7 = IsEnabled + 1;
        }
        int i8 = i7;
        if (this.f16682y) {
            i8 = i7 + 1;
        }
        int i9 = i8;
        if (this.f16681x) {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (isChecked()) {
            i10 = i9 + 1;
        }
        int[] iArr = new int[i10];
        int i11 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i11 = 1;
        }
        if (this.f16683z) {
            iArr[i11] = 16842908;
            i11++;
        }
        if (this.f16682y) {
            iArr[i11] = 16843623;
            i11++;
        }
        if (this.f16681x) {
            iArr[i11] = 16842919;
            i11++;
        }
        if (isChecked()) {
            iArr[i11] = 16842913;
        }
        return iArr;
    }

    private void n() {
        if (getBackgroundDrawable() == this.f16675r && this.f16674q.getCallback() == null) {
            this.f16674q.setCallback(this.f16675r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        com.google.android.material.chip.a aVar = this.f16674q;
        return (aVar == null || aVar.N0() == null) ? false : true;
    }

    private void p(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayH = l.h(context, attributeSet, j.f497f0, i7, f16661J, new int[0]);
        this.f16665A = typedArrayH.getBoolean(j.f352L0, false);
        this.f16667C = (int) Math.ceil(typedArrayH.getDimension(j.f646z0, (float) Math.ceil(com.google.android.material.internal.n.b(getContext(), 48))));
        typedArrayH.recycle();
    }

    private void q() {
        setOutlineProvider(new c());
    }

    private void r(int i7, int i8, int i9, int i10) {
        this.f16675r = new InsetDrawable((Drawable) this.f16674q, i7, i8, i9, i10);
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f16682y != z6) {
            this.f16682y = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f16681x != z6) {
            this.f16681x = z6;
            refreshDrawableState();
        }
    }

    private void v() {
        if (this.f16675r != null) {
            this.f16675r = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.l2(null);
        }
    }

    private void y() {
        boolean z6;
        if (o() && t() && this.f16677t != null) {
            H.p0(this, this.f16669E);
            z6 = true;
        } else {
            H.p0(this, null);
            z6 = false;
        }
        this.f16670F = z6;
    }

    private void z() {
        if (L3.b.f1973a) {
            A();
            return;
        }
        this.f16674q.G2(true);
        H.t0(this, getBackgroundDrawable());
        B();
        n();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0226a
    public void a() {
        m(this.f16667C);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f16670F ? super.dispatchHoverEvent(motionEvent) : this.f16669E.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f16670F) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f16669E.w(keyEvent) || this.f16669E.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C0530g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f16674q;
        if ((aVar == null || !aVar.l1()) ? false : this.f16674q.h2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f16668D)) {
            return this.f16668D;
        }
        if (!s()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f16675r;
        return insetDrawable == null ? this.f16674q : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return Math.max(0.0f, aVar.E0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f16674q;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f16670F && (this.f16669E.A() == 1 || this.f16669E.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public B3.c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f16674q.C();
    }

    public B3.c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public boolean m(int i7) {
        this.f16667C = i7;
        if (!w()) {
            if (this.f16675r != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = Math.max(0, i7 - this.f16674q.getIntrinsicHeight());
        int iMax2 = Math.max(0, i7 - this.f16674q.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f16675r != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i8 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i9 = iMax > 0 ? iMax / 2 : 0;
        if (this.f16675r != null) {
            Rect rect = new Rect();
            this.f16675r.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i8 && rect.right == i8) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i7) {
            setMinHeight(i7);
        }
        if (getMinWidth() != i7) {
            setMinWidth(i7);
        }
        r(i8, i9, i8, i9);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        N3.h.f(this, this.f16674q);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16663L);
        }
        if (s()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16664M);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z6, int i7, Rect rect) {
        super.onFocusChanged(z6, i7, rect);
        if (this.f16670F) {
            this.f16669E.I(z6, i7, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C.N0(accessibilityNodeInfo).j0(C.c.b(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        if (this.f16666B != i7) {
            this.f16666B = i7;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f16681x) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z6 = true;
                    }
                }
                z6 = false;
            } else {
                if (this.f16681x) {
                    u();
                    z6 = true;
                }
                setCloseIconPressed(false);
            }
            z6 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z6 = true;
            }
            z6 = false;
        }
        return z6 || super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f16674q;
        return aVar != null && aVar.k1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f16668D = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16676s) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0530g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16676s) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0530g, android.view.View
    public void setBackgroundResource(int i7) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z6) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.t1(z6);
        }
    }

    public void setCheckableResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.u1(i7);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar == null) {
            this.f16680w = z6;
        } else if (aVar.k1()) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.v1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i7) {
        setCheckedIconVisible(i7);
    }

    public void setCheckedIconResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.w1(i7);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.x1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.y1(i7);
        }
    }

    public void setCheckedIconVisible(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.z1(i7);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.B1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.C1(i7);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.D1(f7);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.E1(i7);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f16674q;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f16674q = aVar;
            aVar.w2(false);
            k(this.f16674q);
            m(this.f16667C);
        }
    }

    public void setChipEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.F1(f7);
        }
    }

    public void setChipEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.G1(i7);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.H1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.I1(i7);
        }
    }

    public void setChipIconSize(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.J1(f7);
        }
    }

    public void setChipIconSizeResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.K1(i7);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.L1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.M1(i7);
        }
    }

    public void setChipIconVisible(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.N1(i7);
        }
    }

    public void setChipMinHeight(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.P1(f7);
        }
    }

    public void setChipMinHeightResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.Q1(i7);
        }
    }

    public void setChipStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.R1(f7);
        }
    }

    public void setChipStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.S1(i7);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.T1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.U1(i7);
        }
    }

    public void setChipStrokeWidth(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.V1(f7);
        }
    }

    public void setChipStrokeWidthResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.W1(i7);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i7) {
        setText(getResources().getString(i7));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.Y1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.Z1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.a2(f7);
        }
    }

    public void setCloseIconEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.b2(i7);
        }
    }

    public void setCloseIconResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.c2(i7);
        }
        y();
    }

    public void setCloseIconSize(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.d2(f7);
        }
    }

    public void setCloseIconSizeResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.e2(i7);
        }
    }

    public void setCloseIconStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.f2(f7);
        }
    }

    public void setCloseIconStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.g2(i7);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.i2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.j2(i7);
        }
    }

    public void setCloseIconVisible(int i7) {
        setCloseIconVisible(getResources().getBoolean(i7));
    }

    @Override // androidx.appcompat.widget.C0530g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C0530g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.U(f7);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f16674q == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.m2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f16665A = z6;
        m(this.f16667C);
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        if (i7 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i7);
        }
    }

    public void setHideMotionSpec(B3.c cVar) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.n2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.o2(i7);
        }
    }

    public void setIconEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.p2(f7);
        }
    }

    public void setIconEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.q2(i7);
        }
    }

    public void setIconStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.r2(f7);
        }
    }

    public void setIconStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.s2(i7);
        }
    }

    @Override // com.google.android.material.internal.h
    public void setInternalOnCheckedChangeListener(h.a aVar) {
        this.f16679v = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        if (this.f16674q == null) {
            return;
        }
        super.setLayoutDirection(i7);
    }

    @Override // android.widget.TextView
    public void setLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i7) {
        super.setMaxWidth(i7);
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.t2(i7);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i7);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f16678u = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f16677t = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.u2(colorStateList);
        }
        if (this.f16674q.i1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.v2(i7);
            if (this.f16674q.i1()) {
                return;
            }
            A();
        }
    }

    @Override // N3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f16674q.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(B3.c cVar) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.x2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.y2(i7);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.H2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f16674q;
        if (aVar2 != null) {
            aVar2.z2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.B2(i7);
        }
        C();
    }

    public void setTextAppearanceResource(int i7) {
        setTextAppearance(getContext(), i7);
    }

    public void setTextEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.C2(f7);
        }
    }

    public void setTextEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.D2(i7);
        }
    }

    public void setTextStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.E2(f7);
        }
    }

    public void setTextStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.F2(i7);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f16674q;
        return aVar != null && aVar.m1();
    }

    public boolean u() {
        boolean z6 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f16677t;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z6 = true;
        }
        if (this.f16670F) {
            this.f16669E.U(1, 1);
        }
        return z6;
    }

    public boolean w() {
        return this.f16665A;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16661J;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16671G = new Rect();
        this.f16672H = new RectF();
        this.f16673I = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarR0 = com.google.android.material.chip.a.r0(context2, attributeSet, i7, i8);
        p(context2, attributeSet, i7);
        setChipDrawable(aVarR0);
        aVarR0.U(H.w(this));
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f497f0, i7, i8, new int[0]);
        boolean zHasValue = typedArrayH.hasValue(j.f387Q0);
        typedArrayH.recycle();
        this.f16669E = new d(this);
        y();
        if (!zHasValue) {
            q();
        }
        setChecked(this.f16680w);
        setText(aVarR0.d1());
        setEllipsize(aVarR0.X0());
        C();
        if (!this.f16674q.H2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f16667C);
        }
        this.f16666B = H.B(this);
        super.setOnCheckedChangeListener(new b());
    }

    public void setCheckedIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.A1(z6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.O1(z6);
        }
    }

    public void setCloseIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.k2(z6);
        }
        y();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setTextAppearance(K3.d dVar) {
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.A2(dVar);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        com.google.android.material.chip.a aVar = this.f16674q;
        if (aVar != null) {
            aVar.B2(i7);
        }
        C();
    }
}
