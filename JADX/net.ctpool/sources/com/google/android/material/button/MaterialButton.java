package com.google.android.material.button;

import A3.i;
import A3.j;
import K3.c;
import N3.h;
import N3.k;
import N3.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.app.y;
import androidx.appcompat.widget.C0529f;
import androidx.core.view.H;
import com.google.android.material.internal.l;
import f.AbstractC1641a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0529f implements Checkable, n {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final int[] f16603C = {R.attr.state_checkable};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f16604D = {R.attr.state_checked};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int f16605E = i.f264h;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f16606A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f16607B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.material.button.a f16608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LinkedHashSet f16609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f16610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PorterDuff.Mode f16611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f16612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Drawable f16613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f16618z;

    interface a {
        void a(MaterialButton materialButton, boolean z6);
    }

    static class b extends AbstractC2252a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f16619o;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        private void b(Parcel parcel) {
            this.f16619o = parcel.readInt() == 1;
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16619o ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f118r);
    }

    private boolean b() {
        int i7 = this.f16607B;
        return i7 == 3 || i7 == 4;
    }

    private boolean c() {
        int i7 = this.f16607B;
        return i7 == 1 || i7 == 2;
    }

    private boolean d() {
        int i7 = this.f16607B;
        return i7 == 16 || i7 == 32;
    }

    private boolean e() {
        return H.B(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f16608p;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            androidx.core.widget.i.i(this, this.f16613u, null, null, null);
        } else if (b()) {
            androidx.core.widget.i.i(this, null, null, this.f16613u, null);
        } else if (d()) {
            androidx.core.widget.i.i(this, null, this.f16613u, null, null);
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    private void h(boolean z6) {
        Drawable drawable = this.f16613u;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
            this.f16613u = drawableMutate;
            androidx.core.graphics.drawable.a.i(drawableMutate, this.f16612t);
            PorterDuff.Mode mode = this.f16611s;
            if (mode != null) {
                androidx.core.graphics.drawable.a.j(this.f16613u, mode);
            }
            int intrinsicWidth = this.f16614v;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f16613u.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f16614v;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f16613u.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f16613u;
            int i7 = this.f16615w;
            int i8 = this.f16616x;
            drawable2.setBounds(i7, i8, intrinsicWidth + i7, intrinsicHeight + i8);
            this.f16613u.setVisible(true, z6);
        }
        if (z6) {
            g();
            return;
        }
        Drawable[] drawableArrA = androidx.core.widget.i.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f16613u) && ((!b() || drawable5 == this.f16613u) && (!d() || drawable4 == this.f16613u))) {
            return;
        }
        g();
    }

    private void i(int i7, int i8) {
        if (this.f16613u == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f16615w = 0;
                if (this.f16607B == 16) {
                    this.f16616x = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f16614v;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f16613u.getIntrinsicHeight();
                }
                int textHeight = (((((i8 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f16617y) - getPaddingBottom()) / 2;
                if (this.f16616x != textHeight) {
                    this.f16616x = textHeight;
                    h(false);
                }
                return;
            }
            return;
        }
        this.f16616x = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i9 = this.f16607B;
        if (i9 == 1 || i9 == 3 || ((i9 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i9 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f16615w = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f16614v;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f16613u.getIntrinsicWidth();
        }
        int textWidth = ((((i7 - getTextWidth()) - H.F(this)) - intrinsicWidth) - this.f16617y) - H.G(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if (e() != (this.f16607B == 4)) {
            textWidth = -textWidth;
        }
        if (this.f16615w != textWidth) {
            this.f16615w = textWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f16608p;
        return aVar != null && aVar.p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f16608p.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f16613u;
    }

    public int getIconGravity() {
        return this.f16607B;
    }

    public int getIconPadding() {
        return this.f16617y;
    }

    public int getIconSize() {
        return this.f16614v;
    }

    public ColorStateList getIconTint() {
        return this.f16612t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f16611s;
    }

    public int getInsetBottom() {
        return this.f16608p.c();
    }

    public int getInsetTop() {
        return this.f16608p.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f16608p.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f16608p.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f16608p.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f16608p.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0529f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f16608p.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0529f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f16608p.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f16618z;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f16608p.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16603C);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16604D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0529f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0529f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0529f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f16619o);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f16619o = this.f16618z;
        return bVar;
    }

    @Override // androidx.appcompat.widget.C0529f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f16613u != null) {
            if (this.f16613u.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (f()) {
            this.f16608p.r(i7);
        } else {
            super.setBackgroundColor(i7);
        }
    }

    @Override // androidx.appcompat.widget.C0529f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f16608p.s();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0529f, android.view.View
    public void setBackgroundResource(int i7) {
        setBackgroundDrawable(i7 != 0 ? AbstractC1641a.b(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (f()) {
            this.f16608p.t(z6);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (a() && isEnabled() && this.f16618z != z6) {
            this.f16618z = z6;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f16618z);
            }
            if (this.f16606A) {
                return;
            }
            this.f16606A = true;
            Iterator it = this.f16609q.iterator();
            if (it.hasNext()) {
                y.a(it.next());
                throw null;
            }
            this.f16606A = false;
        }
    }

    public void setCornerRadius(int i7) {
        if (f()) {
            this.f16608p.u(i7);
        }
    }

    public void setCornerRadiusResource(int i7) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        if (f()) {
            this.f16608p.f().U(f7);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f16613u != drawable) {
            this.f16613u = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.f16607B != i7) {
            this.f16607B = i7;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i7) {
        if (this.f16617y != i7) {
            this.f16617y = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(int i7) {
        setIcon(i7 != 0 ? AbstractC1641a.b(getContext(), i7) : null);
    }

    public void setIconSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f16614v != i7) {
            this.f16614v = i7;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f16612t != colorStateList) {
            this.f16612t = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f16611s != mode) {
            this.f16611s = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i7) {
        setIconTint(AbstractC1641a.a(getContext(), i7));
    }

    public void setInsetBottom(int i7) {
        this.f16608p.v(i7);
    }

    public void setInsetTop(int i7) {
        this.f16608p.w(i7);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(a aVar) {
        this.f16610r = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        a aVar = this.f16610r;
        if (aVar != null) {
            aVar.a(this, z6);
        }
        super.setPressed(z6);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f16608p.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i7) {
        if (f()) {
            setRippleColor(AbstractC1641a.a(getContext(), i7));
        }
    }

    @Override // N3.n
    public void setShapeAppearanceModel(k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f16608p.y(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (f()) {
            this.f16608p.z(z6);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f16608p.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i7) {
        if (f()) {
            setStrokeColor(AbstractC1641a.a(getContext(), i7));
        }
    }

    public void setStrokeWidth(int i7) {
        if (f()) {
            this.f16608p.B(i7);
        }
    }

    public void setStrokeWidthResource(int i7) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // androidx.appcompat.widget.C0529f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f16608p.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0529f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f16608p.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i7) {
        super.setTextAlignment(i7);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f16618z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16605E;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16609q = new LinkedHashSet();
        this.f16618z = false;
        this.f16606A = false;
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f531j2, i7, i8, new int[0]);
        this.f16617y = typedArrayH.getDimensionPixelSize(j.f627w2, 0);
        this.f16611s = com.google.android.material.internal.n.f(typedArrayH.getInt(j.f648z2, -1), PorterDuff.Mode.SRC_IN);
        this.f16612t = c.a(getContext(), typedArrayH, j.f641y2);
        this.f16613u = c.d(getContext(), typedArrayH, j.f613u2);
        this.f16607B = typedArrayH.getInteger(j.f620v2, 1);
        this.f16614v = typedArrayH.getDimensionPixelSize(j.f634x2, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, k.e(context2, attributeSet, i7, i8).m());
        this.f16608p = aVar;
        aVar.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.f16617y);
        h(this.f16613u != null);
    }
}
