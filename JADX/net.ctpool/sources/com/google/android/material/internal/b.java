package com.google.android.material.internal;

import K3.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.text.p;
import androidx.core.view.AbstractC0595o;
import androidx.core.view.H;
import w.AbstractC2173a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final boolean f16926t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Paint f16927u0 = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Typeface f16928A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f16929B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Typeface f16930C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Typeface f16931D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private K3.a f16932E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private K3.a f16933F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f16934G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f16935H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f16936I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f16938K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Bitmap f16939L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Paint f16940M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f16941N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f16942O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f16943P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f16944Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f16945R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f16946S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int[] f16947T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f16948U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final TextPaint f16949V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final TextPaint f16950W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private TimeInterpolator f16951X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f16952Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f16953Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f16954a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f16955a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16956b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f16957b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16958c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f16959c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16960d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f16961d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f16962e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f16963e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f16964f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f16965f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16966g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ColorStateList f16967g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f16968h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f16969h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f16970i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f16971i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f16972j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f16973j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private StaticLayout f16975k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f16977l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f16979m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f16981n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f16982o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private CharSequence f16983o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f16984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f16988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f16992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f16993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f16994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f16995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f16996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f16997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f16998z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16974k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16976l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f16978m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f16980n = 15.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f16937J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f16985p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f16987q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f16989r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f16991s0 = i.f17012n;

    class a implements a.InterfaceC0035a {
        a() {
        }

        @Override // K3.a.InterfaceC0035a
        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f16954a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f16949V = textPaint;
        this.f16950W = new TextPaint(textPaint);
        this.f16970i = new Rect();
        this.f16968h = new Rect();
        this.f16972j = new RectF();
        this.f16964f = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f16978m);
        textPaint.setTypeface(this.f16928A);
        textPaint.setLetterSpacing(this.f16971i0);
    }

    private void B(float f7) {
        if (this.f16960d) {
            this.f16972j.set(f7 < this.f16964f ? this.f16968h : this.f16970i);
            return;
        }
        this.f16972j.left = G(this.f16968h.left, this.f16970i.left, f7, this.f16951X);
        this.f16972j.top = G(this.f16988r, this.f16990s, f7, this.f16951X);
        this.f16972j.right = G(this.f16968h.right, this.f16970i.right, f7, this.f16951X);
        this.f16972j.bottom = G(this.f16968h.bottom, this.f16970i.bottom, f7, this.f16951X);
    }

    private static boolean C(float f7, float f8) {
        return Math.abs(f7 - f8) < 1.0E-5f;
    }

    private boolean D() {
        return H.B(this.f16954a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z6) {
        return (z6 ? p.f7249d : p.f7248c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f7, float f8, float f9, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f9 = timeInterpolator.getInterpolation(f9);
        }
        return B3.a.a(f7, f8, f9);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean M(Rect rect, int i7, int i8, int i9, int i10) {
        return rect.left == i7 && rect.top == i8 && rect.right == i9 && rect.bottom == i10;
    }

    private void Q(float f7) {
        this.f16979m0 = f7;
        H.g0(this.f16954a);
    }

    private boolean U(Typeface typeface) {
        K3.a aVar = this.f16933F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f16998z == typeface) {
            return false;
        }
        this.f16998z = typeface;
        Typeface typefaceB = K3.i.b(this.f16954a.getContext().getResources().getConfiguration(), typeface);
        this.f16997y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f16998z;
        }
        this.f16996x = typefaceB;
        return true;
    }

    private void Y(float f7) {
        this.f16981n0 = f7;
        H.g0(this.f16954a);
    }

    private static int a(int i7, int i8, float f7) {
        float f8 = 1.0f - f7;
        return Color.argb(Math.round((Color.alpha(i7) * f8) + (Color.alpha(i8) * f7)), Math.round((Color.red(i7) * f8) + (Color.red(i8) * f7)), Math.round((Color.green(i7) * f8) + (Color.green(i8) * f7)), Math.round((Color.blue(i7) * f8) + (Color.blue(i8) * f7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(boolean z6) {
        float fAscent;
        int i7;
        float fCenterX;
        float f7;
        float f8;
        StaticLayout staticLayout;
        CharSequence charSequence;
        int i8;
        int i9;
        float fCenterX2;
        float f9;
        StaticLayout staticLayout2;
        i(1.0f, z6);
        CharSequence charSequence2 = this.f16935H;
        if (charSequence2 != null && (staticLayout2 = this.f16975k0) != null) {
            this.f16983o0 = TextUtils.ellipsize(charSequence2, this.f16949V, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence3 = this.f16983o0;
        float fI = 0.0f;
        if (charSequence3 != null) {
            this.f16977l0 = I(this.f16949V, charSequence3);
        } else {
            this.f16977l0 = 0.0f;
        }
        int iB = AbstractC0595o.b(this.f16976l, this.f16936I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            fAscent = this.f16970i.top;
        } else {
            if (i10 != 80) {
                this.f16990s = this.f16970i.centerY() - ((this.f16949V.descent() - this.f16949V.ascent()) / 2.0f);
                i7 = iB & 8388615;
                if (i7 != 1) {
                    fCenterX = this.f16970i.centerX();
                    f7 = this.f16977l0 / 2.0f;
                } else {
                    if (i7 != 5) {
                        f8 = this.f16970i.left;
                        this.f16993u = f8;
                        i(0.0f, z6);
                        float height = this.f16975k0 != null ? r10.getHeight() : 0.0f;
                        staticLayout = this.f16975k0;
                        if (staticLayout == null || this.f16985p0 <= 1) {
                            charSequence = this.f16935H;
                            if (charSequence != null) {
                                fI = I(this.f16949V, charSequence);
                            }
                        } else {
                            fI = staticLayout.getWidth();
                        }
                        StaticLayout staticLayout3 = this.f16975k0;
                        this.f16986q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
                        int iB2 = AbstractC0595o.b(this.f16974k, this.f16936I ? 1 : 0);
                        i8 = iB2 & 112;
                        if (i8 != 48) {
                            this.f16988r = i8 != 80 ? this.f16968h.centerY() - (height / 2.0f) : (this.f16968h.bottom - height) + this.f16949V.descent();
                        } else {
                            this.f16988r = this.f16968h.top;
                        }
                        i9 = iB2 & 8388615;
                        if (i9 == 1) {
                            fCenterX2 = this.f16968h.centerX();
                            fI /= 2.0f;
                        } else {
                            if (i9 != 5) {
                                f9 = this.f16968h.left;
                                this.f16992t = f9;
                                j();
                                e0(this.f16958c);
                            }
                            fCenterX2 = this.f16968h.right;
                        }
                        f9 = fCenterX2 - fI;
                        this.f16992t = f9;
                        j();
                        e0(this.f16958c);
                    }
                    fCenterX = this.f16970i.right;
                    f7 = this.f16977l0;
                }
                f8 = fCenterX - f7;
                this.f16993u = f8;
                i(0.0f, z6);
                if (this.f16975k0 != null) {
                }
                staticLayout = this.f16975k0;
                if (staticLayout == null) {
                    charSequence = this.f16935H;
                    if (charSequence != null) {
                    }
                }
                StaticLayout staticLayout32 = this.f16975k0;
                this.f16986q = staticLayout32 != null ? staticLayout32.getLineCount() : 0;
                int iB22 = AbstractC0595o.b(this.f16974k, this.f16936I ? 1 : 0);
                i8 = iB22 & 112;
                if (i8 != 48) {
                }
                i9 = iB22 & 8388615;
                if (i9 == 1) {
                }
                f9 = fCenterX2 - fI;
                this.f16992t = f9;
                j();
                e0(this.f16958c);
            }
            fAscent = this.f16970i.bottom + this.f16949V.ascent();
        }
        this.f16990s = fAscent;
        i7 = iB & 8388615;
        if (i7 != 1) {
        }
        f8 = fCenterX - f7;
        this.f16993u = f8;
        i(0.0f, z6);
        if (this.f16975k0 != null) {
        }
        staticLayout = this.f16975k0;
        if (staticLayout == null) {
        }
        StaticLayout staticLayout322 = this.f16975k0;
        this.f16986q = staticLayout322 != null ? staticLayout322.getLineCount() : 0;
        int iB222 = AbstractC0595o.b(this.f16974k, this.f16936I ? 1 : 0);
        i8 = iB222 & 112;
        if (i8 != 48) {
        }
        i9 = iB222 & 8388615;
        if (i9 == 1) {
        }
        f9 = fCenterX2 - fI;
        this.f16992t = f9;
        j();
        e0(this.f16958c);
    }

    private void c() {
        g(this.f16958c);
    }

    private boolean c0(Typeface typeface) {
        K3.a aVar = this.f16932E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f16930C == typeface) {
            return false;
        }
        this.f16930C = typeface;
        Typeface typefaceB = K3.i.b(this.f16954a.getContext().getResources().getConfiguration(), typeface);
        this.f16929B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f16930C;
        }
        this.f16928A = typefaceB;
        return true;
    }

    private float d(float f7) {
        float f8 = this.f16964f;
        return f7 <= f8 ? B3.a.b(1.0f, 0.0f, this.f16962e, f8, f7) : B3.a.b(0.0f, 1.0f, f8, 1.0f, f7);
    }

    private float e() {
        float f7 = this.f16962e;
        return f7 + ((1.0f - f7) * 0.5f);
    }

    private void e0(float f7) {
        h(f7);
        boolean z6 = f16926t0 && this.f16941N != 1.0f;
        this.f16938K = z6;
        if (z6) {
            n();
        }
        H.g0(this.f16954a);
    }

    private boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.f16937J ? F(charSequence, zD) : zD;
    }

    private void g(float f7) {
        float f8;
        B(f7);
        if (!this.f16960d) {
            this.f16994v = G(this.f16992t, this.f16993u, f7, this.f16951X);
            this.f16995w = G(this.f16988r, this.f16990s, f7, this.f16951X);
            e0(f7);
            f8 = f7;
        } else if (f7 < this.f16964f) {
            this.f16994v = this.f16992t;
            this.f16995w = this.f16988r;
            e0(0.0f);
            f8 = 0.0f;
        } else {
            this.f16994v = this.f16993u;
            this.f16995w = this.f16990s - Math.max(0, this.f16966g);
            e0(1.0f);
            f8 = 1.0f;
        }
        TimeInterpolator timeInterpolator = B3.a.f740b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f7, timeInterpolator));
        Y(G(1.0f, 0.0f, f7, timeInterpolator));
        if (this.f16984p != this.f16982o) {
            this.f16949V.setColor(a(v(), t(), f8));
        } else {
            this.f16949V.setColor(t());
        }
        float f9 = this.f16969h0;
        float f10 = this.f16971i0;
        if (f9 != f10) {
            this.f16949V.setLetterSpacing(G(f10, f9, f7, timeInterpolator));
        } else {
            this.f16949V.setLetterSpacing(f9);
        }
        this.f16943P = G(this.f16961d0, this.f16953Z, f7, null);
        this.f16944Q = G(this.f16963e0, this.f16955a0, f7, null);
        this.f16945R = G(this.f16965f0, this.f16957b0, f7, null);
        int iA = a(u(this.f16967g0), u(this.f16959c0), f7);
        this.f16946S = iA;
        this.f16949V.setShadowLayer(this.f16943P, this.f16944Q, this.f16945R, iA);
        if (this.f16960d) {
            this.f16949V.setAlpha((int) (d(f7) * this.f16949V.getAlpha()));
        }
        H.g0(this.f16954a);
    }

    private void h(float f7) {
        i(f7, false);
    }

    private void i(float f7, boolean z6) {
        boolean z7;
        float f8;
        float f9;
        boolean z8;
        if (this.f16934G == null) {
            return;
        }
        float fWidth = this.f16970i.width();
        float fWidth2 = this.f16968h.width();
        if (C(f7, 1.0f)) {
            f8 = this.f16980n;
            f9 = this.f16969h0;
            this.f16941N = 1.0f;
            Typeface typeface = this.f16931D;
            Typeface typeface2 = this.f16996x;
            if (typeface != typeface2) {
                this.f16931D = typeface2;
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            float f10 = this.f16978m;
            float f11 = this.f16971i0;
            Typeface typeface3 = this.f16931D;
            Typeface typeface4 = this.f16928A;
            if (typeface3 != typeface4) {
                this.f16931D = typeface4;
                z7 = true;
            } else {
                z7 = false;
            }
            if (C(f7, 0.0f)) {
                this.f16941N = 1.0f;
            } else {
                this.f16941N = G(this.f16978m, this.f16980n, f7, this.f16952Y) / this.f16978m;
            }
            float f12 = this.f16980n / this.f16978m;
            fWidth = (!z6 && fWidth2 * f12 > fWidth) ? Math.min(fWidth / f12, fWidth2) : fWidth2;
            f8 = f10;
            f9 = f11;
            z8 = z7;
        }
        if (fWidth > 0.0f) {
            z8 = ((this.f16942O > f8 ? 1 : (this.f16942O == f8 ? 0 : -1)) != 0) || ((this.f16973j0 > f9 ? 1 : (this.f16973j0 == f9 ? 0 : -1)) != 0) || this.f16948U || z8;
            this.f16942O = f8;
            this.f16973j0 = f9;
            this.f16948U = false;
        }
        if (this.f16935H == null || z8) {
            this.f16949V.setTextSize(this.f16942O);
            this.f16949V.setTypeface(this.f16931D);
            this.f16949V.setLetterSpacing(this.f16973j0);
            this.f16949V.setLinearText(this.f16941N != 1.0f);
            this.f16936I = f(this.f16934G);
            StaticLayout staticLayoutK = k(k0() ? this.f16985p0 : 1, fWidth, this.f16936I);
            this.f16975k0 = staticLayoutK;
            this.f16935H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f16939L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f16939L = null;
        }
    }

    private StaticLayout k(int i7, float f7, boolean z6) {
        return (StaticLayout) androidx.core.util.f.f(i.b(this.f16934G, this.f16949V, (int) f7).d(TextUtils.TruncateAt.END).g(z6).c(i7 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i7).h(this.f16987q0, this.f16989r0).e(this.f16991s0).a());
    }

    private boolean k0() {
        return this.f16985p0 > 1 && (!this.f16936I || this.f16960d) && !this.f16938K;
    }

    private void m(Canvas canvas, float f7, float f8) {
        int alpha = this.f16949V.getAlpha();
        canvas.translate(f7, f8);
        float f9 = alpha;
        this.f16949V.setAlpha((int) (this.f16981n0 * f9));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            TextPaint textPaint = this.f16949V;
            textPaint.setShadowLayer(this.f16943P, this.f16944Q, this.f16945R, E3.a.a(this.f16946S, textPaint.getAlpha()));
        }
        this.f16975k0.draw(canvas);
        this.f16949V.setAlpha((int) (this.f16979m0 * f9));
        if (i7 >= 31) {
            TextPaint textPaint2 = this.f16949V;
            textPaint2.setShadowLayer(this.f16943P, this.f16944Q, this.f16945R, E3.a.a(this.f16946S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f16975k0.getLineBaseline(0);
        CharSequence charSequence = this.f16983o0;
        float f10 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f10, this.f16949V);
        if (i7 >= 31) {
            this.f16949V.setShadowLayer(this.f16943P, this.f16944Q, this.f16945R, this.f16946S);
        }
        if (this.f16960d) {
            return;
        }
        String strTrim = this.f16983o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f16949V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f16975k0.getLineEnd(0), str.length()), 0.0f, f10, (Paint) this.f16949V);
    }

    private void n() {
        if (this.f16939L != null || this.f16968h.isEmpty() || TextUtils.isEmpty(this.f16935H)) {
            return;
        }
        g(0.0f);
        int width = this.f16975k0.getWidth();
        int height = this.f16975k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f16939L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f16975k0.draw(new Canvas(this.f16939L));
        if (this.f16940M == null) {
            this.f16940M = new Paint(3);
        }
    }

    private float r(int i7, int i8) {
        return (i8 == 17 || (i8 & 7) == 1) ? (i7 / 2.0f) - (this.f16977l0 / 2.0f) : ((i8 & 8388613) == 8388613 || (i8 & 5) == 5) ? this.f16936I ? this.f16970i.left : this.f16970i.right - this.f16977l0 : this.f16936I ? this.f16970i.right - this.f16977l0 : this.f16970i.left;
    }

    private float s(RectF rectF, int i7, int i8) {
        return (i8 == 17 || (i8 & 7) == 1) ? (i7 / 2.0f) + (this.f16977l0 / 2.0f) : ((i8 & 8388613) == 8388613 || (i8 & 5) == 5) ? this.f16936I ? rectF.left + this.f16977l0 : this.f16970i.right : this.f16936I ? this.f16970i.right : rectF.left + this.f16977l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f16947T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f16982o);
    }

    private Layout.Alignment y() {
        int iB = AbstractC0595o.b(this.f16974k, this.f16936I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f16936I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f16936I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f16980n);
        textPaint.setTypeface(this.f16996x);
        textPaint.setLetterSpacing(this.f16969h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f16984p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f16982o) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f16998z;
            if (typeface != null) {
                this.f16997y = K3.i.b(configuration, typeface);
            }
            Typeface typeface2 = this.f16930C;
            if (typeface2 != null) {
                this.f16929B = K3.i.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f16997y;
            if (typeface3 == null) {
                typeface3 = this.f16998z;
            }
            this.f16996x = typeface3;
            Typeface typeface4 = this.f16929B;
            if (typeface4 == null) {
                typeface4 = this.f16930C;
            }
            this.f16928A = typeface4;
            L(true);
        }
    }

    void J() {
        this.f16956b = this.f16970i.width() > 0 && this.f16970i.height() > 0 && this.f16968h.width() > 0 && this.f16968h.height() > 0;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z6) {
        if ((this.f16954a.getHeight() <= 0 || this.f16954a.getWidth() <= 0) && !z6) {
            return;
        }
        b(z6);
        c();
    }

    public void N(int i7, int i8, int i9, int i10) {
        if (M(this.f16970i, i7, i8, i9, i10)) {
            return;
        }
        this.f16970i.set(i7, i8, i9, i10);
        this.f16948U = true;
        J();
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i7) {
        K3.d dVar = new K3.d(this.f16954a.getContext(), i7);
        if (dVar.i() != null) {
            this.f16984p = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f16980n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f1855c;
        if (colorStateList != null) {
            this.f16959c0 = colorStateList;
        }
        this.f16955a0 = dVar.f1860h;
        this.f16957b0 = dVar.f1861i;
        this.f16953Z = dVar.f1862j;
        this.f16969h0 = dVar.f1864l;
        K3.a aVar = this.f16933F;
        if (aVar != null) {
            aVar.c();
        }
        this.f16933F = new K3.a(new a(), dVar.e());
        dVar.g(this.f16954a.getContext(), this.f16933F);
        K();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f16984p != colorStateList) {
            this.f16984p = colorStateList;
            K();
        }
    }

    public void S(int i7) {
        if (this.f16976l != i7) {
            this.f16976l = i7;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public void V(int i7, int i8, int i9, int i10) {
        if (M(this.f16968h, i7, i8, i9, i10)) {
            return;
        }
        this.f16968h.set(i7, i8, i9, i10);
        this.f16948U = true;
        J();
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f7) {
        if (this.f16971i0 != f7) {
            this.f16971i0 = f7;
            K();
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f16982o != colorStateList) {
            this.f16982o = colorStateList;
            K();
        }
    }

    public void a0(int i7) {
        if (this.f16974k != i7) {
            this.f16974k = i7;
            K();
        }
    }

    public void b0(float f7) {
        if (this.f16978m != f7) {
            this.f16978m = f7;
            K();
        }
    }

    public void d0(float f7) {
        float fA = AbstractC2173a.a(f7, 0.0f, 1.0f);
        if (fA != this.f16958c) {
            this.f16958c = fA;
            c();
        }
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.f16951X = timeInterpolator;
        K();
    }

    public final boolean g0(int[] iArr) {
        this.f16947T = iArr;
        if (!E()) {
            return false;
        }
        K();
        return true;
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f16934G, charSequence)) {
            this.f16934G = charSequence;
            this.f16935H = null;
            j();
            K();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.f16952Y = timeInterpolator;
        K();
    }

    public void j0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zC0 = c0(typeface);
        if (zU || zC0) {
            K();
        }
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f16935H == null || !this.f16956b) {
            return;
        }
        this.f16949V.setTextSize(this.f16942O);
        float f7 = this.f16994v;
        float f8 = this.f16995w;
        boolean z6 = this.f16938K && this.f16939L != null;
        float f9 = this.f16941N;
        if (f9 != 1.0f && !this.f16960d) {
            canvas.scale(f9, f9, f7, f8);
        }
        if (z6) {
            canvas.drawBitmap(this.f16939L, f7, f8, this.f16940M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!k0() || (this.f16960d && this.f16958c <= this.f16964f)) {
            canvas.translate(f7, f8);
            this.f16975k0.draw(canvas);
        } else {
            m(canvas, this.f16994v - this.f16975k0.getLineStart(0), f8);
        }
        canvas.restoreToCount(iSave);
    }

    public void o(RectF rectF, int i7, int i8) {
        this.f16936I = f(this.f16934G);
        rectF.left = r(i7, i8);
        rectF.top = this.f16970i.top;
        rectF.right = s(rectF, i7, i8);
        rectF.bottom = this.f16970i.top + q();
    }

    public ColorStateList p() {
        return this.f16984p;
    }

    public float q() {
        z(this.f16950W);
        return -this.f16950W.ascent();
    }

    public int t() {
        return u(this.f16984p);
    }

    public float w() {
        A(this.f16950W);
        return -this.f16950W.ascent();
    }

    public float x() {
        return this.f16958c;
    }
}
