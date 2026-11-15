package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.e;
import e.AbstractC1609a;
import e.AbstractC1616h;
import f.AbstractC1641a;
import i.C1738a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends CompoundButton {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Property f6033h0 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int[] f6034i0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private CharSequence f6035A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private CharSequence f6036B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private CharSequence f6037C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CharSequence f6038D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f6039E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f6040F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f6041G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f6042H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f6043I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private VelocityTracker f6044J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f6045K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    float f6046L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f6047M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f6048N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f6049O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f6050P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f6051Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f6052R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f6053S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f6054T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final TextPaint f6055U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private ColorStateList f6056V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Layout f6057W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Layout f6058a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TransformationMethod f6059b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    ObjectAnimator f6060c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final C f6061d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private C0537n f6062e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private c f6063f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Rect f6064g0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f6065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f6066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PorterDuff.Mode f6067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f6070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f6071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f6072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f6075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f6076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f6077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6078z;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(c0 c0Var) {
            return Float.valueOf(c0Var.f6046L);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c0 c0Var, Float f7) {
            c0Var.setThumbPosition(f7.floatValue());
        }
    }

    static class b {
        static void a(ObjectAnimator objectAnimator, boolean z6) {
            objectAnimator.setAutoCancel(z6);
        }
    }

    static class c extends e.AbstractC0156e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f6079a;

        c(c0 c0Var) {
            this.f6079a = new WeakReference(c0Var);
        }

        @Override // androidx.emoji2.text.e.AbstractC0156e
        public void a(Throwable th) {
            c0 c0Var = (c0) this.f6079a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }

        @Override // androidx.emoji2.text.e.AbstractC0156e
        public void b() {
            c0 c0Var = (c0) this.f6079a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }
    }

    public c0(Context context) {
        this(context, null);
    }

    private void a(boolean z6) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<c0, Float>) f6033h0, z6 ? 1.0f : 0.0f);
        this.f6060c0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        b.a(this.f6060c0, true);
        this.f6060c0.start();
    }

    private void b() {
        Drawable drawable = this.f6065m;
        if (drawable != null) {
            if (this.f6068p || this.f6069q) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
                this.f6065m = drawableMutate;
                if (this.f6068p) {
                    androidx.core.graphics.drawable.a.i(drawableMutate, this.f6066n);
                }
                if (this.f6069q) {
                    androidx.core.graphics.drawable.a.j(this.f6065m, this.f6067o);
                }
                if (this.f6065m.isStateful()) {
                    this.f6065m.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f6070r;
        if (drawable != null) {
            if (this.f6073u || this.f6074v) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
                this.f6070r = drawableMutate;
                if (this.f6073u) {
                    androidx.core.graphics.drawable.a.i(drawableMutate, this.f6071s);
                }
                if (this.f6074v) {
                    androidx.core.graphics.drawable.a.j(this.f6070r, this.f6072t);
                }
                if (this.f6070r.isStateful()) {
                    this.f6070r.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f6060c0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f7, float f8, float f9) {
        return f7 < f8 ? f8 : f7 > f9 ? f9 : f7;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f6059b0);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    private C0537n getEmojiTextViewHelper() {
        if (this.f6062e0 == null) {
            this.f6062e0 = new C0537n(this);
        }
        return this.f6062e0;
    }

    private boolean getTargetCheckedState() {
        return this.f6046L > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((r0.b(this) ? 1.0f - this.f6046L : this.f6046L) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f6070r;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f6064g0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f6065m;
        Rect rectD = drawable2 != null ? O.d(drawable2) : O.f5719c;
        return ((((this.f6047M - this.f6049O) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f7, float f8) {
        if (this.f6065m == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f6065m.getPadding(this.f6064g0);
        int i7 = this.f6051Q;
        int i8 = this.f6041G;
        int i9 = i7 - i8;
        int i10 = (this.f6050P + thumbOffset) - i8;
        int i11 = this.f6049O + i10;
        Rect rect = this.f6064g0;
        return f7 > ((float) i10) && f7 < ((float) (((i11 + rect.left) + rect.right) + i8)) && f8 > ((float) i9) && f8 < ((float) (this.f6053S + i8));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f6055U, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f6037C;
            if (string == null) {
                string = getResources().getString(AbstractC1616h.f18884b);
            }
            androidx.core.view.H.G0(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f6035A;
            if (string == null) {
                string = getResources().getString(AbstractC1616h.f18885c);
            }
            androidx.core.view.H.G0(this, string);
        }
    }

    private void o(int i7, int i8) {
        n(i7 != 1 ? i7 != 2 ? i7 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i8);
    }

    private void p() {
        if (this.f6063f0 == null && this.f6062e0.b() && androidx.emoji2.text.e.h()) {
            androidx.emoji2.text.e eVarB = androidx.emoji2.text.e.b();
            int iD = eVarB.d();
            if (iD == 3 || iD == 0) {
                c cVar = new c(this);
                this.f6063f0 = cVar;
                eVarB.s(cVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f6040F = 0;
        boolean targetCheckedState = true;
        boolean z6 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z6) {
            this.f6044J.computeCurrentVelocity(1000);
            float xVelocity = this.f6044J.getXVelocity();
            if (Math.abs(xVelocity) <= this.f6045K) {
                targetCheckedState = getTargetCheckedState();
            } else if (!r0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f6037C = charSequence;
        this.f6038D = g(charSequence);
        this.f6058a0 = null;
        if (this.f6039E) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f6035A = charSequence;
        this.f6036B = g(charSequence);
        this.f6057W = null;
        if (this.f6039E) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        int i8;
        Rect rect = this.f6064g0;
        int i9 = this.f6050P;
        int i10 = this.f6051Q;
        int i11 = this.f6052R;
        int i12 = this.f6053S;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.f6065m;
        Rect rectD = drawable != null ? O.d(drawable) : O.f5719c;
        Drawable drawable2 = this.f6070r;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i13 = rect.left;
            thumbOffset += i13;
            if (rectD != null) {
                int i14 = rectD.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = rectD.top;
                int i16 = rect.top;
                i7 = i15 > i16 ? (i15 - i16) + i10 : i10;
                int i17 = rectD.right;
                int i18 = rect.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = rectD.bottom;
                int i20 = rect.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                }
                this.f6070r.setBounds(i9, i7, i11, i8);
            } else {
                i7 = i10;
            }
            i8 = i12;
            this.f6070r.setBounds(i9, i7, i11, i8);
        }
        Drawable drawable3 = this.f6065m;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i21 = thumbOffset - rect.left;
            int i22 = thumbOffset + this.f6049O + rect.right;
            this.f6065m.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.f(background, i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f6065m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.e(drawable, f7, f8);
        }
        Drawable drawable2 = this.f6070r;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.e(drawable2, f7, f8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6065m;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f6070r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!r0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f6047M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f6077y : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (r0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f6047M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f6077y : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.p(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f6039E;
    }

    public boolean getSplitTrack() {
        return this.f6078z;
    }

    public int getSwitchMinWidth() {
        return this.f6076x;
    }

    public int getSwitchPadding() {
        return this.f6077y;
    }

    public CharSequence getTextOff() {
        return this.f6037C;
    }

    public CharSequence getTextOn() {
        return this.f6035A;
    }

    public Drawable getThumbDrawable() {
        return this.f6065m;
    }

    protected final float getThumbPosition() {
        return this.f6046L;
    }

    public int getThumbTextPadding() {
        return this.f6075w;
    }

    public ColorStateList getThumbTintList() {
        return this.f6066n;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f6067o;
    }

    public Drawable getTrackDrawable() {
        return this.f6070r;
    }

    public ColorStateList getTrackTintList() {
        return this.f6071s;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f6072t;
    }

    void j() {
        setTextOnInternal(this.f6035A);
        setTextOffInternal(this.f6037C);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6065m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f6070r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f6060c0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f6060c0.end();
        this.f6060c0 = null;
    }

    public void m(Context context, int i7) {
        h0 h0VarT = h0.t(context, i7, e.j.f18994S2);
        ColorStateList colorStateListC = h0VarT.c(e.j.f19010W2);
        if (colorStateListC == null) {
            colorStateListC = getTextColors();
        }
        this.f6056V = colorStateListC;
        int iF = h0VarT.f(e.j.f18998T2, 0);
        if (iF != 0) {
            float f7 = iF;
            if (f7 != this.f6055U.getTextSize()) {
                this.f6055U.setTextSize(f7);
                requestLayout();
            }
        }
        o(h0VarT.k(e.j.f19002U2, -1), h0VarT.k(e.j.f19006V2, -1));
        this.f6059b0 = h0VarT.a(e.j.f19032b3, false) ? new C1738a(getContext()) : null;
        setTextOnInternal(this.f6035A);
        setTextOffInternal(this.f6037C);
        h0VarT.w();
    }

    public void n(Typeface typeface, int i7) {
        if (i7 <= 0) {
            this.f6055U.setFakeBoldText(false);
            this.f6055U.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i7) : Typeface.create(typeface, i7);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i8 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i7;
            this.f6055U.setFakeBoldText((i8 & 1) != 0);
            this.f6055U.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6034i0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f6064g0;
        Drawable drawable = this.f6070r;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.f6051Q;
        int i8 = this.f6053S;
        int i9 = i7 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.f6065m;
        if (drawable != null) {
            if (!this.f6078z || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = O.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f6057W : this.f6058a0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f6056V;
            if (colorStateList != null) {
                this.f6055U.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f6055U.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i9 + i10) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f6035A : this.f6037C;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int iMax;
        int width;
        int paddingLeft;
        int i11;
        int paddingTop;
        int height;
        super.onLayout(z6, i7, i8, i9, i10);
        int iMax2 = 0;
        if (this.f6065m != null) {
            Rect rect = this.f6064g0;
            Drawable drawable = this.f6070r;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = O.d(this.f6065m);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (r0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f6047M + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f6047M) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i11 = this.f6048N;
            paddingTop = paddingTop2 - (i11 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f6048N;
                this.f6050P = paddingLeft;
                this.f6051Q = paddingTop;
                this.f6053S = height;
                this.f6052R = width;
            }
            paddingTop = getPaddingTop();
            i11 = this.f6048N;
        }
        height = i11 + paddingTop;
        this.f6050P = paddingLeft;
        this.f6051Q = paddingTop;
        this.f6053S = height;
        this.f6052R = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f6039E) {
            if (this.f6057W == null) {
                this.f6057W = i(this.f6036B);
            }
            if (this.f6058a0 == null) {
                this.f6058a0 = i(this.f6038D);
            }
        }
        Rect rect = this.f6064g0;
        Drawable drawable = this.f6065m;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f6065m.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f6065m.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f6049O = Math.max(this.f6039E ? Math.max(this.f6057W.getWidth(), this.f6058a0.getWidth()) + (this.f6075w * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f6070r;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f6070r.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f6065m;
        if (drawable3 != null) {
            Rect rectD = O.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f6054T ? Math.max(this.f6076x, (this.f6049O * 2) + iMax + iMax2) : this.f6076x;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f6047M = iMax3;
        this.f6048N = iMax4;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f6035A : this.f6037C;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6044J.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            if (isEnabled() && h(x6, y6)) {
                this.f6040F = 1;
                this.f6042H = x6;
                this.f6043I = y6;
            }
        } else if (actionMasked == 1) {
            if (this.f6040F == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f6040F = 0;
            this.f6044J.clear();
        } else if (actionMasked == 2) {
            int i7 = this.f6040F;
            if (i7 == 1) {
                float x7 = motionEvent.getX();
                float y7 = motionEvent.getY();
                if (Math.abs(x7 - this.f6042H) > this.f6041G || Math.abs(y7 - this.f6043I) > this.f6041G) {
                    this.f6040F = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f6042H = x7;
                    this.f6043I = y7;
                    return true;
                }
            } else if (i7 == 2) {
                float x8 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f7 = x8 - this.f6042H;
                float f8 = thumbScrollRange != 0 ? f7 / thumbScrollRange : f7 > 0.0f ? 1.0f : -1.0f;
                if (r0.b(this)) {
                    f8 = -f8;
                }
                float f9 = f(this.f6046L + f8, 0.0f, 1.0f);
                if (f9 != this.f6046L) {
                    this.f6042H = x8;
                    setThumbPosition(f9);
                }
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        super.setChecked(z6);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && androidx.core.view.H.T(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
        setTextOnInternal(this.f6035A);
        setTextOffInternal(this.f6037C);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z6) {
        this.f6054T = z6;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z6) {
        if (this.f6039E != z6) {
            this.f6039E = z6;
            requestLayout();
            if (z6) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z6) {
        this.f6078z = z6;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.f6076x = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.f6077y = i7;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f6055U.getTypeface() == null || this.f6055U.getTypeface().equals(typeface)) && (this.f6055U.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f6055U.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f6065m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6065m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f7) {
        this.f6046L = f7;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(AbstractC1641a.b(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.f6075w = i7;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f6066n = colorStateList;
        this.f6068p = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f6067o = mode;
        this.f6069q = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f6070r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6070r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(AbstractC1641a.b(getContext(), i7));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f6071s = colorStateList;
        this.f6073u = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f6072t = mode;
        this.f6074v = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6065m || drawable == this.f6070r;
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18724I);
    }

    public c0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f6066n = null;
        this.f6067o = null;
        this.f6068p = false;
        this.f6069q = false;
        this.f6071s = null;
        this.f6072t = null;
        this.f6073u = false;
        this.f6074v = false;
        this.f6044J = VelocityTracker.obtain();
        this.f6054T = true;
        this.f6064g0 = new Rect();
        d0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f6055U = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        h0 h0VarV = h0.v(context, attributeSet, e.j.f18919D2, i7, 0);
        androidx.core.view.H.n0(this, context, e.j.f18919D2, attributeSet, h0VarV.r(), i7, 0);
        Drawable drawableG = h0VarV.g(e.j.f18934G2);
        this.f6065m = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = h0VarV.g(e.j.f18979P2);
        this.f6070r = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(h0VarV.p(e.j.f18924E2));
        setTextOffInternal(h0VarV.p(e.j.f18929F2));
        this.f6039E = h0VarV.a(e.j.f18939H2, true);
        this.f6075w = h0VarV.f(e.j.f18964M2, 0);
        this.f6076x = h0VarV.f(e.j.f18949J2, 0);
        this.f6077y = h0VarV.f(e.j.f18954K2, 0);
        this.f6078z = h0VarV.a(e.j.f18944I2, false);
        ColorStateList colorStateListC = h0VarV.c(e.j.f18969N2);
        if (colorStateListC != null) {
            this.f6066n = colorStateListC;
            this.f6068p = true;
        }
        PorterDuff.Mode modeE = O.e(h0VarV.k(e.j.f18974O2, -1), null);
        if (this.f6067o != modeE) {
            this.f6067o = modeE;
            this.f6069q = true;
        }
        if (this.f6068p || this.f6069q) {
            b();
        }
        ColorStateList colorStateListC2 = h0VarV.c(e.j.f18984Q2);
        if (colorStateListC2 != null) {
            this.f6071s = colorStateListC2;
            this.f6073u = true;
        }
        PorterDuff.Mode modeE2 = O.e(h0VarV.k(e.j.f18989R2, -1), null);
        if (this.f6072t != modeE2) {
            this.f6072t = modeE2;
            this.f6074v = true;
        }
        if (this.f6073u || this.f6074v) {
            c();
        }
        int iN = h0VarV.n(e.j.f18959L2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C c7 = new C(this);
        this.f6061d0 = c7;
        c7.m(attributeSet, i7);
        h0VarV.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6041G = viewConfiguration.getScaledTouchSlop();
        this.f6045K = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i7);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
