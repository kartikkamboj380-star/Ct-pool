package com.google.android.material.chip;

import B3.c;
import K3.d;
import L3.b;
import N3.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.internal.j;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import f.AbstractC1641a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends g implements Drawable.Callback, j.b {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private static final int[] f16699V0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private static final ShapeDrawable f16700W0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f16701A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f16702B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f16703C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f16704D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f16705E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f16706F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f16707G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f16708H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f16709I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private ColorFilter f16710J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private PorterDuffColorFilter f16711K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ColorStateList f16712L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private ColorStateList f16713L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ColorStateList f16714M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private PorterDuff.Mode f16715M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f16716N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int[] f16717N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f16718O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f16719O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ColorStateList f16720P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private ColorStateList f16721P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f16722Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private WeakReference f16723Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ColorStateList f16724R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private TextUtils.TruncateAt f16725R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private CharSequence f16726S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f16727S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f16728T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private int f16729T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Drawable f16730U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private boolean f16731U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private ColorStateList f16732V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f16733W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f16734X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f16735Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Drawable f16736Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Drawable f16737a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f16738b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f16739c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private CharSequence f16740d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f16741e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f16742f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Drawable f16743g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private ColorStateList f16744h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private c f16745i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private c f16746j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f16747k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f16748l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f16749m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f16750n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f16751o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f16752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f16753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f16754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final Context f16755s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final Paint f16756t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final Paint f16757u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final Paint.FontMetrics f16758v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final RectF f16759w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final PointF f16760x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final Path f16761y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final j f16762z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0226a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f16718O = -1.0f;
        this.f16756t0 = new Paint(1);
        this.f16758v0 = new Paint.FontMetrics();
        this.f16759w0 = new RectF();
        this.f16760x0 = new PointF();
        this.f16761y0 = new Path();
        this.f16709I0 = 255;
        this.f16715M0 = PorterDuff.Mode.SRC_IN;
        this.f16723Q0 = new WeakReference(null);
        L(context);
        this.f16755s0 = context;
        j jVar = new j(this);
        this.f16762z0 = jVar;
        this.f16726S = "";
        jVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f16757u0 = null;
        int[] iArr = f16699V0;
        setState(iArr);
        h2(iArr);
        this.f16727S0 = true;
        if (b.f1973a) {
            f16700W0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (this.f16726S != null) {
            Paint.Align alignP0 = p0(rect, this.f16760x0);
            n0(rect, this.f16759w0);
            if (this.f16762z0.d() != null) {
                this.f16762z0.e().drawableState = getState();
                this.f16762z0.j(this.f16755s0);
            }
            this.f16762z0.e().setTextAlign(alignP0);
            int iSave = 0;
            boolean z6 = Math.round(this.f16762z0.f(d1().toString())) > Math.round(this.f16759w0.width());
            if (z6) {
                iSave = canvas.save();
                canvas.clipRect(this.f16759w0);
            }
            CharSequence charSequenceEllipsize = this.f16726S;
            if (z6 && this.f16725R0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f16762z0.e(), this.f16759w0.width(), this.f16725R0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f16760x0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f16762z0.e());
            if (z6) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean I2() {
        return this.f16742f0 && this.f16743g0 != null && this.f16707G0;
    }

    private boolean J2() {
        return this.f16728T && this.f16730U != null;
    }

    private boolean K2() {
        return this.f16735Y && this.f16736Z != null;
    }

    private void L2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void M2() {
        this.f16721P0 = this.f16719O0 ? b.a(this.f16724R) : null;
    }

    private void N2() {
        this.f16737a0 = new RippleDrawable(b.a(b1()), this.f16736Z, f16700W0);
    }

    private float V0() {
        Drawable drawable = this.f16707G0 ? this.f16743g0 : this.f16730U;
        float fCeil = this.f16733W;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(n.b(this.f16755s0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float W0() {
        Drawable drawable = this.f16707G0 ? this.f16743g0 : this.f16730U;
        float f7 = this.f16733W;
        return (f7 > 0.0f || drawable == null) ? f7 : drawable.getIntrinsicWidth();
    }

    private void X1(ColorStateList colorStateList) {
        if (this.f16712L != colorStateList) {
            this.f16712L = colorStateList;
            onStateChange(getState());
        }
    }

    private void g0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.g(drawable, androidx.core.graphics.drawable.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f16736Z) {
            if (drawable.isStateful()) {
                drawable.setState(S0());
            }
            androidx.core.graphics.drawable.a.i(drawable, this.f16738b0);
            return;
        }
        Drawable drawable2 = this.f16730U;
        if (drawable == drawable2 && this.f16734X) {
            androidx.core.graphics.drawable.a.i(drawable2, this.f16732V);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2() || I2()) {
            float f7 = this.f16747k0 + this.f16748l0;
            float fW0 = W0();
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f8 = rect.left + f7;
                rectF.left = f8;
                rectF.right = f8 + fW0;
            } else {
                float f9 = rect.right - f7;
                rectF.right = f9;
                rectF.left = f9 - fW0;
            }
            float fV0 = V0();
            float fExactCenterY = rect.exactCenterY() - (fV0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fV0;
        }
    }

    private ColorFilter h1() {
        ColorFilter colorFilter = this.f16710J0;
        return colorFilter != null ? colorFilter : this.f16711K0;
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (K2()) {
            float f7 = this.f16754r0 + this.f16753q0 + this.f16739c0 + this.f16752p0 + this.f16751o0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                rectF.right = rect.right - f7;
            } else {
                rectF.left = rect.left + f7;
            }
        }
    }

    private static boolean j1(int[] iArr, int i7) {
        if (iArr == null) {
            return false;
        }
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f7 = this.f16754r0 + this.f16753q0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f8 = rect.right - f7;
                rectF.right = f8;
                rectF.left = f8 - this.f16739c0;
            } else {
                float f9 = rect.left + f7;
                rectF.left = f9;
                rectF.right = f9 + this.f16739c0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f10 = this.f16739c0;
            float f11 = fExactCenterY - (f10 / 2.0f);
            rectF.top = f11;
            rectF.bottom = f11 + f10;
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f7 = this.f16754r0 + this.f16753q0 + this.f16739c0 + this.f16752p0 + this.f16751o0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f8 = rect.right;
                rectF.right = f8;
                rectF.left = f8 - f7;
            } else {
                int i7 = rect.left;
                rectF.left = i7;
                rectF.right = i7 + f7;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f16726S != null) {
            float fI0 = this.f16747k0 + i0() + this.f16750n0;
            float fM0 = this.f16754r0 + m0() + this.f16751o0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                rectF.left = rect.left + fI0;
                rectF.right = rect.right - fM0;
            } else {
                rectF.left = rect.left + fM0;
                rectF.right = rect.right - fI0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean n1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private float o0() {
        this.f16762z0.e().getFontMetrics(this.f16758v0);
        Paint.FontMetrics fontMetrics = this.f16758v0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean o1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean p1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean q0() {
        return this.f16742f0 && this.f16743g0 != null && this.f16741e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q1(AttributeSet attributeSet, int i7, int i8) {
        TextUtils.TruncateAt truncateAt;
        TypedArray typedArrayH = l.h(this.f16755s0, attributeSet, A3.j.f497f0, i7, i8, new int[0]);
        this.f16731U0 = typedArrayH.hasValue(A3.j.f387Q0);
        X1(K3.c.a(this.f16755s0, typedArrayH, A3.j.f296D0));
        B1(K3.c.a(this.f16755s0, typedArrayH, A3.j.f583q0));
        P1(typedArrayH.getDimension(A3.j.f639y0, 0.0f));
        if (typedArrayH.hasValue(A3.j.f590r0)) {
            D1(typedArrayH.getDimension(A3.j.f590r0, 0.0f));
        }
        T1(K3.c.a(this.f16755s0, typedArrayH, A3.j.f282B0));
        V1(typedArrayH.getDimension(A3.j.f289C0, 0.0f));
        u2(K3.c.a(this.f16755s0, typedArrayH, A3.j.f380P0));
        z2(typedArrayH.getText(A3.j.f537k0));
        d dVarF = K3.c.f(this.f16755s0, typedArrayH, A3.j.f505g0);
        dVarF.l(typedArrayH.getDimension(A3.j.f513h0, dVarF.j()));
        A2(dVarF);
        int i9 = typedArrayH.getInt(A3.j.f521i0, 0);
        if (i9 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else {
            if (i9 != 2) {
                if (i9 == 3) {
                    truncateAt = TextUtils.TruncateAt.END;
                }
                O1(typedArrayH.getBoolean(A3.j.f632x0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                    O1(typedArrayH.getBoolean(A3.j.f611u0, false));
                }
                H1(K3.c.d(this.f16755s0, typedArrayH, A3.j.f604t0));
                if (typedArrayH.hasValue(A3.j.f625w0)) {
                    L1(K3.c.a(this.f16755s0, typedArrayH, A3.j.f625w0));
                }
                J1(typedArrayH.getDimension(A3.j.f618v0, -1.0f));
                k2(typedArrayH.getBoolean(A3.j.f345K0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                    k2(typedArrayH.getBoolean(A3.j.f310F0, false));
                }
                Y1(K3.c.d(this.f16755s0, typedArrayH, A3.j.f303E0));
                i2(K3.c.a(this.f16755s0, typedArrayH, A3.j.f338J0));
                d2(typedArrayH.getDimension(A3.j.f324H0, 0.0f));
                t1(typedArrayH.getBoolean(A3.j.f545l0, false));
                A1(typedArrayH.getBoolean(A3.j.f576p0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                    A1(typedArrayH.getBoolean(A3.j.f561n0, false));
                }
                v1(K3.c.d(this.f16755s0, typedArrayH, A3.j.f553m0));
                if (typedArrayH.hasValue(A3.j.f569o0)) {
                    x1(K3.c.a(this.f16755s0, typedArrayH, A3.j.f569o0));
                }
                x2(c.b(this.f16755s0, typedArrayH, A3.j.f394R0));
                n2(c.b(this.f16755s0, typedArrayH, A3.j.f359M0));
                R1(typedArrayH.getDimension(A3.j.f275A0, 0.0f));
                r2(typedArrayH.getDimension(A3.j.f373O0, 0.0f));
                p2(typedArrayH.getDimension(A3.j.f366N0, 0.0f));
                E2(typedArrayH.getDimension(A3.j.f408T0, 0.0f));
                C2(typedArrayH.getDimension(A3.j.f401S0, 0.0f));
                f2(typedArrayH.getDimension(A3.j.f331I0, 0.0f));
                a2(typedArrayH.getDimension(A3.j.f317G0, 0.0f));
                F1(typedArrayH.getDimension(A3.j.f597s0, 0.0f));
                t2(typedArrayH.getDimensionPixelSize(A3.j.f529j0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
                typedArrayH.recycle();
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        m2(truncateAt);
        O1(typedArrayH.getBoolean(A3.j.f632x0, false));
        if (attributeSet != null) {
            O1(typedArrayH.getBoolean(A3.j.f611u0, false));
        }
        H1(K3.c.d(this.f16755s0, typedArrayH, A3.j.f604t0));
        if (typedArrayH.hasValue(A3.j.f625w0)) {
        }
        J1(typedArrayH.getDimension(A3.j.f618v0, -1.0f));
        k2(typedArrayH.getBoolean(A3.j.f345K0, false));
        if (attributeSet != null) {
            k2(typedArrayH.getBoolean(A3.j.f310F0, false));
        }
        Y1(K3.c.d(this.f16755s0, typedArrayH, A3.j.f303E0));
        i2(K3.c.a(this.f16755s0, typedArrayH, A3.j.f338J0));
        d2(typedArrayH.getDimension(A3.j.f324H0, 0.0f));
        t1(typedArrayH.getBoolean(A3.j.f545l0, false));
        A1(typedArrayH.getBoolean(A3.j.f576p0, false));
        if (attributeSet != null) {
            A1(typedArrayH.getBoolean(A3.j.f561n0, false));
        }
        v1(K3.c.d(this.f16755s0, typedArrayH, A3.j.f553m0));
        if (typedArrayH.hasValue(A3.j.f569o0)) {
        }
        x2(c.b(this.f16755s0, typedArrayH, A3.j.f394R0));
        n2(c.b(this.f16755s0, typedArrayH, A3.j.f359M0));
        R1(typedArrayH.getDimension(A3.j.f275A0, 0.0f));
        r2(typedArrayH.getDimension(A3.j.f373O0, 0.0f));
        p2(typedArrayH.getDimension(A3.j.f366N0, 0.0f));
        E2(typedArrayH.getDimension(A3.j.f408T0, 0.0f));
        C2(typedArrayH.getDimension(A3.j.f401S0, 0.0f));
        f2(typedArrayH.getDimension(A3.j.f331I0, 0.0f));
        a2(typedArrayH.getDimension(A3.j.f317G0, 0.0f));
        F1(typedArrayH.getDimension(A3.j.f597s0, 0.0f));
        t2(typedArrayH.getDimensionPixelSize(A3.j.f529j0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        typedArrayH.recycle();
    }

    public static a r0(Context context, AttributeSet attributeSet, int i7, int i8) {
        a aVar = new a(context, attributeSet, i7, i8);
        aVar.q1(attributeSet, i7, i8);
        return aVar;
    }

    private void s0(Canvas canvas, Rect rect) {
        if (I2()) {
            h0(rect, this.f16759w0);
            RectF rectF = this.f16759w0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f16743g0.setBounds(0, 0, (int) this.f16759w0.width(), (int) this.f16759w0.height());
            this.f16743g0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    private boolean s1(int[] iArr, int[] iArr2) {
        boolean z6;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f16712L;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f16701A0) : 0);
        boolean state = true;
        if (this.f16701A0 != iL) {
            this.f16701A0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f16714M;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16702B0) : 0);
        if (this.f16702B0 != iL2) {
            this.f16702B0 = iL2;
            zOnStateChange = true;
        }
        int iG = E3.a.g(iL, iL2);
        if ((this.f16703C0 != iG) | (x() == null)) {
            this.f16703C0 = iG;
            V(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16720P;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16704D0) : 0;
        if (this.f16704D0 != colorForState) {
            this.f16704D0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f16721P0 == null || !b.b(iArr)) ? 0 : this.f16721P0.getColorForState(iArr, this.f16705E0);
        if (this.f16705E0 != colorForState2) {
            this.f16705E0 = colorForState2;
            if (this.f16719O0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f16762z0.d() == null || this.f16762z0.d().i() == null) ? 0 : this.f16762z0.d().i().getColorForState(iArr, this.f16706F0);
        if (this.f16706F0 != colorForState3) {
            this.f16706F0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z7 = j1(getState(), R.attr.state_checked) && this.f16741e0;
        if (this.f16707G0 == z7 || this.f16743g0 == null) {
            z6 = false;
        } else {
            float fI0 = i0();
            this.f16707G0 = z7;
            if (fI0 != i0()) {
                zOnStateChange = true;
                z6 = true;
            } else {
                z6 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f16713L0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f16708H0) : 0;
        if (this.f16708H0 != colorForState4) {
            this.f16708H0 = colorForState4;
            this.f16711K0 = G3.a.a(this, this.f16713L0, this.f16715M0);
        } else {
            state = zOnStateChange;
        }
        if (p1(this.f16730U)) {
            state |= this.f16730U.setState(iArr);
        }
        if (p1(this.f16743g0)) {
            state |= this.f16743g0.setState(iArr);
        }
        if (p1(this.f16736Z)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f16736Z.setState(iArr3);
        }
        if (b.f1973a && p1(this.f16737a0)) {
            state |= this.f16737a0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z6) {
            r1();
        }
        return state;
    }

    private void t0(Canvas canvas, Rect rect) {
        if (this.f16731U0) {
            return;
        }
        this.f16756t0.setColor(this.f16702B0);
        this.f16756t0.setStyle(Paint.Style.FILL);
        this.f16756t0.setColorFilter(h1());
        this.f16759w0.set(rect);
        canvas.drawRoundRect(this.f16759w0, E0(), E0(), this.f16756t0);
    }

    private void u0(Canvas canvas, Rect rect) {
        if (J2()) {
            h0(rect, this.f16759w0);
            RectF rectF = this.f16759w0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f16730U.setBounds(0, 0, (int) this.f16759w0.width(), (int) this.f16759w0.height());
            this.f16730U.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.f16722Q <= 0.0f || this.f16731U0) {
            return;
        }
        this.f16756t0.setColor(this.f16704D0);
        this.f16756t0.setStyle(Paint.Style.STROKE);
        if (!this.f16731U0) {
            this.f16756t0.setColorFilter(h1());
        }
        RectF rectF = this.f16759w0;
        float f7 = rect.left;
        float f8 = this.f16722Q;
        rectF.set(f7 + (f8 / 2.0f), rect.top + (f8 / 2.0f), rect.right - (f8 / 2.0f), rect.bottom - (f8 / 2.0f));
        float f9 = this.f16718O - (this.f16722Q / 2.0f);
        canvas.drawRoundRect(this.f16759w0, f9, f9, this.f16756t0);
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.f16731U0) {
            return;
        }
        this.f16756t0.setColor(this.f16701A0);
        this.f16756t0.setStyle(Paint.Style.FILL);
        this.f16759w0.set(rect);
        canvas.drawRoundRect(this.f16759w0, E0(), E0(), this.f16756t0);
    }

    private void x0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (K2()) {
            k0(rect, this.f16759w0);
            RectF rectF = this.f16759w0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f16736Z.setBounds(0, 0, (int) this.f16759w0.width(), (int) this.f16759w0.height());
            if (b.f1973a) {
                this.f16737a0.setBounds(this.f16736Z.getBounds());
                this.f16737a0.jumpToCurrentState();
                drawable = this.f16737a0;
            } else {
                drawable = this.f16736Z;
            }
            drawable.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        this.f16756t0.setColor(this.f16705E0);
        this.f16756t0.setStyle(Paint.Style.FILL);
        this.f16759w0.set(rect);
        if (!this.f16731U0) {
            canvas.drawRoundRect(this.f16759w0, E0(), E0(), this.f16756t0);
        } else {
            h(new RectF(rect), this.f16761y0);
            super.q(canvas, this.f16756t0, this.f16761y0, u());
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        Paint paint = this.f16757u0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.k(-16777216, ModuleDescriptor.MODULE_VERSION));
            canvas.drawRect(rect, this.f16757u0);
            if (J2() || I2()) {
                h0(rect, this.f16759w0);
                canvas.drawRect(this.f16759w0, this.f16757u0);
            }
            if (this.f16726S != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f16757u0);
            }
            if (K2()) {
                k0(rect, this.f16759w0);
                canvas.drawRect(this.f16759w0, this.f16757u0);
            }
            this.f16757u0.setColor(androidx.core.graphics.a.k(-65536, ModuleDescriptor.MODULE_VERSION));
            j0(rect, this.f16759w0);
            canvas.drawRect(this.f16759w0, this.f16757u0);
            this.f16757u0.setColor(androidx.core.graphics.a.k(-16711936, ModuleDescriptor.MODULE_VERSION));
            l0(rect, this.f16759w0);
            canvas.drawRect(this.f16759w0, this.f16757u0);
        }
    }

    public void A1(boolean z6) {
        if (this.f16742f0 != z6) {
            boolean zI2 = I2();
            this.f16742f0 = z6;
            boolean zI22 = I2();
            if (zI2 != zI22) {
                if (zI22) {
                    g0(this.f16743g0);
                } else {
                    L2(this.f16743g0);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public void A2(d dVar) {
        this.f16762z0.h(dVar, this.f16755s0);
    }

    public Drawable B0() {
        return this.f16743g0;
    }

    public void B1(ColorStateList colorStateList) {
        if (this.f16714M != colorStateList) {
            this.f16714M = colorStateList;
            onStateChange(getState());
        }
    }

    public void B2(int i7) {
        A2(new d(this.f16755s0, i7));
    }

    public ColorStateList C0() {
        return this.f16744h0;
    }

    public void C1(int i7) {
        B1(AbstractC1641a.a(this.f16755s0, i7));
    }

    public void C2(float f7) {
        if (this.f16751o0 != f7) {
            this.f16751o0 = f7;
            invalidateSelf();
            r1();
        }
    }

    public ColorStateList D0() {
        return this.f16714M;
    }

    public void D1(float f7) {
        if (this.f16718O != f7) {
            this.f16718O = f7;
            setShapeAppearanceModel(C().w(f7));
        }
    }

    public void D2(int i7) {
        C2(this.f16755s0.getResources().getDimension(i7));
    }

    public float E0() {
        return this.f16731U0 ? E() : this.f16718O;
    }

    public void E1(int i7) {
        D1(this.f16755s0.getResources().getDimension(i7));
    }

    public void E2(float f7) {
        if (this.f16750n0 != f7) {
            this.f16750n0 = f7;
            invalidateSelf();
            r1();
        }
    }

    public float F0() {
        return this.f16754r0;
    }

    public void F1(float f7) {
        if (this.f16754r0 != f7) {
            this.f16754r0 = f7;
            invalidateSelf();
            r1();
        }
    }

    public void F2(int i7) {
        E2(this.f16755s0.getResources().getDimension(i7));
    }

    public Drawable G0() {
        Drawable drawable = this.f16730U;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.k(drawable);
        }
        return null;
    }

    public void G1(int i7) {
        F1(this.f16755s0.getResources().getDimension(i7));
    }

    public void G2(boolean z6) {
        if (this.f16719O0 != z6) {
            this.f16719O0 = z6;
            M2();
            onStateChange(getState());
        }
    }

    public float H0() {
        return this.f16733W;
    }

    public void H1(Drawable drawable) {
        Drawable drawableG0 = G0();
        if (drawableG0 != drawable) {
            float fI0 = i0();
            this.f16730U = drawable != null ? androidx.core.graphics.drawable.a.l(drawable).mutate() : null;
            float fI02 = i0();
            L2(drawableG0);
            if (J2()) {
                g0(this.f16730U);
            }
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    boolean H2() {
        return this.f16727S0;
    }

    public ColorStateList I0() {
        return this.f16732V;
    }

    public void I1(int i7) {
        H1(AbstractC1641a.b(this.f16755s0, i7));
    }

    public float J0() {
        return this.f16716N;
    }

    public void J1(float f7) {
        if (this.f16733W != f7) {
            float fI0 = i0();
            this.f16733W = f7;
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public float K0() {
        return this.f16747k0;
    }

    public void K1(int i7) {
        J1(this.f16755s0.getResources().getDimension(i7));
    }

    public ColorStateList L0() {
        return this.f16720P;
    }

    public void L1(ColorStateList colorStateList) {
        this.f16734X = true;
        if (this.f16732V != colorStateList) {
            this.f16732V = colorStateList;
            if (J2()) {
                androidx.core.graphics.drawable.a.i(this.f16730U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float M0() {
        return this.f16722Q;
    }

    public void M1(int i7) {
        L1(AbstractC1641a.a(this.f16755s0, i7));
    }

    public Drawable N0() {
        Drawable drawable = this.f16736Z;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.k(drawable);
        }
        return null;
    }

    public void N1(int i7) {
        O1(this.f16755s0.getResources().getBoolean(i7));
    }

    public CharSequence O0() {
        return this.f16740d0;
    }

    public void O1(boolean z6) {
        if (this.f16728T != z6) {
            boolean zJ2 = J2();
            this.f16728T = z6;
            boolean zJ22 = J2();
            if (zJ2 != zJ22) {
                if (zJ22) {
                    g0(this.f16730U);
                } else {
                    L2(this.f16730U);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public float P0() {
        return this.f16753q0;
    }

    public void P1(float f7) {
        if (this.f16716N != f7) {
            this.f16716N = f7;
            invalidateSelf();
            r1();
        }
    }

    public float Q0() {
        return this.f16739c0;
    }

    public void Q1(int i7) {
        P1(this.f16755s0.getResources().getDimension(i7));
    }

    public float R0() {
        return this.f16752p0;
    }

    public void R1(float f7) {
        if (this.f16747k0 != f7) {
            this.f16747k0 = f7;
            invalidateSelf();
            r1();
        }
    }

    public int[] S0() {
        return this.f16717N0;
    }

    public void S1(int i7) {
        R1(this.f16755s0.getResources().getDimension(i7));
    }

    public ColorStateList T0() {
        return this.f16738b0;
    }

    public void T1(ColorStateList colorStateList) {
        if (this.f16720P != colorStateList) {
            this.f16720P = colorStateList;
            if (this.f16731U0) {
                b0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void U0(RectF rectF) {
        l0(getBounds(), rectF);
    }

    public void U1(int i7) {
        T1(AbstractC1641a.a(this.f16755s0, i7));
    }

    public void V1(float f7) {
        if (this.f16722Q != f7) {
            this.f16722Q = f7;
            this.f16756t0.setStrokeWidth(f7);
            if (this.f16731U0) {
                super.c0(f7);
            }
            invalidateSelf();
        }
    }

    public void W1(int i7) {
        V1(this.f16755s0.getResources().getDimension(i7));
    }

    public TextUtils.TruncateAt X0() {
        return this.f16725R0;
    }

    public c Y0() {
        return this.f16746j0;
    }

    public void Y1(Drawable drawable) {
        Drawable drawableN0 = N0();
        if (drawableN0 != drawable) {
            float fM0 = m0();
            this.f16736Z = drawable != null ? androidx.core.graphics.drawable.a.l(drawable).mutate() : null;
            if (b.f1973a) {
                N2();
            }
            float fM02 = m0();
            L2(drawableN0);
            if (K2()) {
                g0(this.f16736Z);
            }
            invalidateSelf();
            if (fM0 != fM02) {
                r1();
            }
        }
    }

    public float Z0() {
        return this.f16749m0;
    }

    public void Z1(CharSequence charSequence) {
        if (this.f16740d0 != charSequence) {
            this.f16740d0 = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        r1();
        invalidateSelf();
    }

    public float a1() {
        return this.f16748l0;
    }

    public void a2(float f7) {
        if (this.f16753q0 != f7) {
            this.f16753q0 = f7;
            invalidateSelf();
            if (K2()) {
                r1();
            }
        }
    }

    public ColorStateList b1() {
        return this.f16724R;
    }

    public void b2(int i7) {
        a2(this.f16755s0.getResources().getDimension(i7));
    }

    public c c1() {
        return this.f16745i0;
    }

    public void c2(int i7) {
        Y1(AbstractC1641a.b(this.f16755s0, i7));
    }

    public CharSequence d1() {
        return this.f16726S;
    }

    public void d2(float f7) {
        if (this.f16739c0 != f7) {
            this.f16739c0 = f7;
            invalidateSelf();
            if (K2()) {
                r1();
            }
        }
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i7 = this.f16709I0;
        int iA = i7 < 255 ? C3.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i7) : 0;
        w0(canvas, bounds);
        t0(canvas, bounds);
        if (this.f16731U0) {
            super.draw(canvas);
        }
        v0(canvas, bounds);
        y0(canvas, bounds);
        u0(canvas, bounds);
        s0(canvas, bounds);
        if (this.f16727S0) {
            A0(canvas, bounds);
        }
        x0(canvas, bounds);
        z0(canvas, bounds);
        if (this.f16709I0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public d e1() {
        return this.f16762z0.d();
    }

    public void e2(int i7) {
        d2(this.f16755s0.getResources().getDimension(i7));
    }

    public float f1() {
        return this.f16751o0;
    }

    public void f2(float f7) {
        if (this.f16752p0 != f7) {
            this.f16752p0 = f7;
            invalidateSelf();
            if (K2()) {
                r1();
            }
        }
    }

    public float g1() {
        return this.f16750n0;
    }

    public void g2(int i7) {
        f2(this.f16755s0.getResources().getDimension(i7));
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16709I0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f16710J0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f16716N;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f16747k0 + i0() + this.f16750n0 + this.f16762z0.f(d1().toString()) + this.f16751o0 + m0() + this.f16754r0), this.f16729T0);
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f16731U0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f16718O);
        } else {
            outline.setRoundRect(bounds, this.f16718O);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public boolean h2(int[] iArr) {
        if (Arrays.equals(this.f16717N0, iArr)) {
            return false;
        }
        this.f16717N0 = iArr;
        if (K2()) {
            return s1(getState(), iArr);
        }
        return false;
    }

    float i0() {
        if (J2() || I2()) {
            return this.f16748l0 + W0() + this.f16749m0;
        }
        return 0.0f;
    }

    public boolean i1() {
        return this.f16719O0;
    }

    public void i2(ColorStateList colorStateList) {
        if (this.f16738b0 != colorStateList) {
            this.f16738b0 = colorStateList;
            if (K2()) {
                androidx.core.graphics.drawable.a.i(this.f16736Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return o1(this.f16712L) || o1(this.f16714M) || o1(this.f16720P) || (this.f16719O0 && o1(this.f16721P0)) || n1(this.f16762z0.d()) || q0() || p1(this.f16730U) || p1(this.f16743g0) || o1(this.f16713L0);
    }

    public void j2(int i7) {
        i2(AbstractC1641a.a(this.f16755s0, i7));
    }

    public boolean k1() {
        return this.f16741e0;
    }

    public void k2(boolean z6) {
        if (this.f16735Y != z6) {
            boolean zK2 = K2();
            this.f16735Y = z6;
            boolean zK22 = K2();
            if (zK2 != zK22) {
                if (zK22) {
                    g0(this.f16736Z);
                } else {
                    L2(this.f16736Z);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public boolean l1() {
        return p1(this.f16736Z);
    }

    public void l2(InterfaceC0226a interfaceC0226a) {
        this.f16723Q0 = new WeakReference(interfaceC0226a);
    }

    float m0() {
        if (K2()) {
            return this.f16752p0 + this.f16739c0 + this.f16753q0;
        }
        return 0.0f;
    }

    public boolean m1() {
        return this.f16735Y;
    }

    public void m2(TextUtils.TruncateAt truncateAt) {
        this.f16725R0 = truncateAt;
    }

    public void n2(c cVar) {
        this.f16746j0 = cVar;
    }

    public void o2(int i7) {
        n2(c.c(this.f16755s0, i7));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i7) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i7);
        if (J2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.f16730U, i7);
        }
        if (I2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.f16743g0, i7);
        }
        if (K2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.f16736Z, i7);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        boolean zOnLevelChange = super.onLevelChange(i7);
        if (J2()) {
            zOnLevelChange |= this.f16730U.setLevel(i7);
        }
        if (I2()) {
            zOnLevelChange |= this.f16743g0.setLevel(i7);
        }
        if (K2()) {
            zOnLevelChange |= this.f16736Z.setLevel(i7);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f16731U0) {
            super.onStateChange(iArr);
        }
        return s1(iArr, S0());
    }

    Paint.Align p0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f16726S != null) {
            float fI0 = this.f16747k0 + i0() + this.f16750n0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                pointF.x = rect.left + fI0;
            } else {
                pointF.x = rect.right - fI0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - o0();
        }
        return align;
    }

    public void p2(float f7) {
        if (this.f16749m0 != f7) {
            float fI0 = i0();
            this.f16749m0 = f7;
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void q2(int i7) {
        p2(this.f16755s0.getResources().getDimension(i7));
    }

    protected void r1() {
        InterfaceC0226a interfaceC0226a = (InterfaceC0226a) this.f16723Q0.get();
        if (interfaceC0226a != null) {
            interfaceC0226a.a();
        }
    }

    public void r2(float f7) {
        if (this.f16748l0 != f7) {
            float fI0 = i0();
            this.f16748l0 = f7;
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void s2(int i7) {
        r2(this.f16755s0.getResources().getDimension(i7));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.f16709I0 != i7) {
            this.f16709I0 = i7;
            invalidateSelf();
        }
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f16710J0 != colorFilter) {
            this.f16710J0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f16713L0 != colorStateList) {
            this.f16713L0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // N3.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f16715M0 != mode) {
            this.f16715M0 = mode;
            this.f16711K0 = G3.a.a(this, this.f16713L0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        if (J2()) {
            visible |= this.f16730U.setVisible(z6, z7);
        }
        if (I2()) {
            visible |= this.f16743g0.setVisible(z6, z7);
        }
        if (K2()) {
            visible |= this.f16736Z.setVisible(z6, z7);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(boolean z6) {
        if (this.f16741e0 != z6) {
            this.f16741e0 = z6;
            float fI0 = i0();
            if (!z6 && this.f16707G0) {
                this.f16707G0 = false;
            }
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void t2(int i7) {
        this.f16729T0 = i7;
    }

    public void u1(int i7) {
        t1(this.f16755s0.getResources().getBoolean(i7));
    }

    public void u2(ColorStateList colorStateList) {
        if (this.f16724R != colorStateList) {
            this.f16724R = colorStateList;
            M2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(Drawable drawable) {
        if (this.f16743g0 != drawable) {
            float fI0 = i0();
            this.f16743g0 = drawable;
            float fI02 = i0();
            L2(this.f16743g0);
            g0(this.f16743g0);
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void v2(int i7) {
        u2(AbstractC1641a.a(this.f16755s0, i7));
    }

    public void w1(int i7) {
        v1(AbstractC1641a.b(this.f16755s0, i7));
    }

    void w2(boolean z6) {
        this.f16727S0 = z6;
    }

    public void x1(ColorStateList colorStateList) {
        if (this.f16744h0 != colorStateList) {
            this.f16744h0 = colorStateList;
            if (q0()) {
                androidx.core.graphics.drawable.a.i(this.f16743g0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void x2(c cVar) {
        this.f16745i0 = cVar;
    }

    public void y1(int i7) {
        x1(AbstractC1641a.a(this.f16755s0, i7));
    }

    public void y2(int i7) {
        x2(c.c(this.f16755s0, i7));
    }

    public void z1(int i7) {
        A1(this.f16755s0.getResources().getBoolean(i7));
    }

    public void z2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f16726S, charSequence)) {
            return;
        }
        this.f16726S = charSequence;
        this.f16762z0.i(true);
        invalidateSelf();
        r1();
    }
}
