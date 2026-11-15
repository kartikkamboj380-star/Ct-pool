package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.f;
import java.lang.ref.WeakReference;
import java.util.Locale;
import x.AbstractC2204c;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f5660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f5661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f5662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f5663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f5664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f5665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f0 f5666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f5667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f5668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5669j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5670k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f5671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5672m;

    class a extends f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f5675c;

        a(int i7, int i8, WeakReference weakReference) {
            this.f5673a = i7;
            this.f5674b = i8;
            this.f5675c = weakReference;
        }

        @Override // androidx.core.content.res.f.e
        /* JADX INFO: renamed from: h */
        public void f(int i7) {
        }

        @Override // androidx.core.content.res.f.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i7;
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f5673a) != -1) {
                typeface = f.a(typeface, i7, (this.f5674b & 2) != 0);
            }
            C.this.n(this.f5675c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ TextView f5677m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Typeface f5678n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f5679o;

        b(TextView textView, Typeface typeface, int i7) {
            this.f5677m = textView;
            this.f5678n = typeface;
            this.f5679o = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5677m.setTypeface(this.f5678n, this.f5679o);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        static void c(TextView textView, int[] iArr, int i7) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int i7, boolean z6) {
            return Typeface.create(typeface, i7, z6);
        }
    }

    C(TextView textView) {
        this.f5660a = textView;
        this.f5668i = new E(textView);
    }

    private void B(int i7, float f7) {
        this.f5668i.t(i7, f7);
    }

    private void C(Context context, h0 h0Var) {
        String strO;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f5669j = h0Var.k(e.j.f19006V2, this.f5669j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int iK = h0Var.k(e.j.f19018Y2, -1);
            this.f5670k = iK;
            if (iK != -1) {
                this.f5669j &= 2;
            }
        }
        if (!h0Var.s(e.j.f19014X2) && !h0Var.s(e.j.f19022Z2)) {
            if (h0Var.s(e.j.f19002U2)) {
                this.f5672m = false;
                int iK2 = h0Var.k(e.j.f19002U2, 1);
                if (iK2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iK2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iK2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f5671l = typeface;
                return;
            }
            return;
        }
        this.f5671l = null;
        int i8 = h0Var.s(e.j.f19022Z2) ? e.j.f19022Z2 : e.j.f19014X2;
        int i9 = this.f5670k;
        int i10 = this.f5669j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = h0Var.j(i8, this.f5669j, new a(i9, i10, new WeakReference(this.f5660a)));
                if (typefaceJ != null) {
                    if (i7 >= 28 && this.f5670k != -1) {
                        typefaceJ = f.a(Typeface.create(typefaceJ, 0), this.f5670k, (this.f5669j & 2) != 0);
                    }
                    this.f5671l = typefaceJ;
                }
                this.f5672m = this.f5671l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5671l != null || (strO = h0Var.o(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f5670k == -1) {
            typefaceCreate = Typeface.create(strO, this.f5669j);
        } else {
            typefaceCreate = f.a(Typeface.create(strO, 0), this.f5670k, (this.f5669j & 2) != 0);
        }
        this.f5671l = typefaceCreate;
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        C0534k.i(drawable, f0Var, this.f5660a.getDrawableState());
    }

    private static f0 d(Context context, C0534k c0534k, int i7) {
        ColorStateList colorStateListF = c0534k.f(context, i7);
        if (colorStateListF == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.f6110d = true;
        f0Var.f6107a = colorStateListF;
        return f0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f5660a);
            TextView textView = this.f5660a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f5660a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f5660a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f5660a.getCompoundDrawables();
        TextView textView3 = this.f5660a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        f0 f0Var = this.f5667h;
        this.f5661b = f0Var;
        this.f5662c = f0Var;
        this.f5663d = f0Var;
        this.f5664e = f0Var;
        this.f5665f = f0Var;
        this.f5666g = f0Var;
    }

    void A(int i7, float f7) {
        if (r0.f6214b || l()) {
            return;
        }
        B(i7, f7);
    }

    void b() {
        if (this.f5661b != null || this.f5662c != null || this.f5663d != null || this.f5664e != null) {
            Drawable[] compoundDrawables = this.f5660a.getCompoundDrawables();
            a(compoundDrawables[0], this.f5661b);
            a(compoundDrawables[1], this.f5662c);
            a(compoundDrawables[2], this.f5663d);
            a(compoundDrawables[3], this.f5664e);
        }
        if (this.f5665f == null && this.f5666g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f5660a);
        a(drawableArrA[0], this.f5665f);
        a(drawableArrA[2], this.f5666g);
    }

    void c() {
        this.f5668i.a();
    }

    int e() {
        return this.f5668i.f();
    }

    int f() {
        return this.f5668i.g();
    }

    int g() {
        return this.f5668i.h();
    }

    int[] h() {
        return this.f5668i.i();
    }

    int i() {
        return this.f5668i.j();
    }

    ColorStateList j() {
        f0 f0Var = this.f5667h;
        if (f0Var != null) {
            return f0Var.f6107a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f0 f0Var = this.f5667h;
        if (f0Var != null) {
            return f0Var.f6108b;
        }
        return null;
    }

    boolean l() {
        return this.f5668i.n();
    }

    void m(AttributeSet attributeSet, int i7) {
        boolean zA;
        boolean z6;
        String strO;
        String strO2;
        boolean z7;
        Context context = this.f5660a.getContext();
        C0534k c0534kB = C0534k.b();
        h0 h0VarV = h0.v(context, attributeSet, e.j.f19015Y, i7, 0);
        TextView textView = this.f5660a;
        androidx.core.view.H.n0(textView, textView.getContext(), e.j.f19015Y, attributeSet, h0VarV.r(), i7, 0);
        int iN = h0VarV.n(e.j.f19019Z, -1);
        if (h0VarV.s(e.j.f19034c0)) {
            this.f5661b = d(context, c0534kB, h0VarV.n(e.j.f19034c0, 0));
        }
        if (h0VarV.s(e.j.f19024a0)) {
            this.f5662c = d(context, c0534kB, h0VarV.n(e.j.f19024a0, 0));
        }
        if (h0VarV.s(e.j.f19039d0)) {
            this.f5663d = d(context, c0534kB, h0VarV.n(e.j.f19039d0, 0));
        }
        if (h0VarV.s(e.j.f19029b0)) {
            this.f5664e = d(context, c0534kB, h0VarV.n(e.j.f19029b0, 0));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (h0VarV.s(e.j.f19044e0)) {
            this.f5665f = d(context, c0534kB, h0VarV.n(e.j.f19044e0, 0));
        }
        if (h0VarV.s(e.j.f19049f0)) {
            this.f5666g = d(context, c0534kB, h0VarV.n(e.j.f19049f0, 0));
        }
        h0VarV.w();
        boolean z8 = this.f5660a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            h0 h0VarT = h0.t(context, iN, e.j.f18994S2);
            if (z8 || !h0VarT.s(e.j.f19032b3)) {
                zA = false;
                z6 = false;
            } else {
                zA = h0VarT.a(e.j.f19032b3, false);
                z6 = true;
            }
            C(context, h0VarT);
            strO2 = h0VarT.s(e.j.f19037c3) ? h0VarT.o(e.j.f19037c3) : null;
            strO = (i8 < 26 || !h0VarT.s(e.j.f19027a3)) ? null : h0VarT.o(e.j.f19027a3);
            h0VarT.w();
        } else {
            zA = false;
            z6 = false;
            strO = null;
            strO2 = null;
        }
        h0 h0VarV2 = h0.v(context, attributeSet, e.j.f18994S2, i7, 0);
        if (z8 || !h0VarV2.s(e.j.f19032b3)) {
            z7 = z6;
        } else {
            zA = h0VarV2.a(e.j.f19032b3, false);
            z7 = true;
        }
        if (h0VarV2.s(e.j.f19037c3)) {
            strO2 = h0VarV2.o(e.j.f19037c3);
        }
        if (i8 >= 26 && h0VarV2.s(e.j.f19027a3)) {
            strO = h0VarV2.o(e.j.f19027a3);
        }
        if (i8 >= 28 && h0VarV2.s(e.j.f18998T2) && h0VarV2.f(e.j.f18998T2, -1) == 0) {
            this.f5660a.setTextSize(0, 0.0f);
        }
        C(context, h0VarV2);
        h0VarV2.w();
        if (!z8 && z7) {
            s(zA);
        }
        Typeface typeface = this.f5671l;
        if (typeface != null) {
            if (this.f5670k == -1) {
                this.f5660a.setTypeface(typeface, this.f5669j);
            } else {
                this.f5660a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            e.d(this.f5660a, strO);
        }
        if (strO2 != null) {
            d.b(this.f5660a, d.a(strO2));
        }
        this.f5668i.o(attributeSet, i7);
        if (r0.f6214b && this.f5668i.j() != 0) {
            int[] iArrI = this.f5668i.i();
            if (iArrI.length > 0) {
                if (e.a(this.f5660a) != -1.0f) {
                    e.b(this.f5660a, this.f5668i.g(), this.f5668i.f(), this.f5668i.h(), 0);
                } else {
                    e.c(this.f5660a, iArrI, 0);
                }
            }
        }
        h0 h0VarU = h0.u(context, attributeSet, e.j.f19054g0);
        int iN2 = h0VarU.n(e.j.f19094o0, -1);
        Drawable drawableC = iN2 != -1 ? c0534kB.c(context, iN2) : null;
        int iN3 = h0VarU.n(e.j.f19119t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c0534kB.c(context, iN3) : null;
        int iN4 = h0VarU.n(e.j.f19099p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c0534kB.c(context, iN4) : null;
        int iN5 = h0VarU.n(e.j.f19084m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c0534kB.c(context, iN5) : null;
        int iN6 = h0VarU.n(e.j.f19104q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c0534kB.c(context, iN6) : null;
        int iN7 = h0VarU.n(e.j.f19089n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c0534kB.c(context, iN7) : null);
        if (h0VarU.s(e.j.f19109r0)) {
            androidx.core.widget.i.g(this.f5660a, h0VarU.c(e.j.f19109r0));
        }
        if (h0VarU.s(e.j.f19114s0)) {
            androidx.core.widget.i.h(this.f5660a, O.e(h0VarU.k(e.j.f19114s0, -1), null));
        }
        int iF = h0VarU.f(e.j.f19129v0, -1);
        int iF2 = h0VarU.f(e.j.f19134w0, -1);
        int iF3 = h0VarU.f(e.j.f19139x0, -1);
        h0VarU.w();
        if (iF != -1) {
            androidx.core.widget.i.j(this.f5660a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.i.k(this.f5660a, iF2);
        }
        if (iF3 != -1) {
            androidx.core.widget.i.l(this.f5660a, iF3);
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f5672m) {
            this.f5671l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (androidx.core.view.H.S(textView)) {
                    textView.post(new b(textView, typeface, this.f5669j));
                } else {
                    textView.setTypeface(typeface, this.f5669j);
                }
            }
        }
    }

    void o(boolean z6, int i7, int i8, int i9, int i10) {
        if (r0.f6214b) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i7) {
        String strO;
        h0 h0VarT = h0.t(context, i7, e.j.f18994S2);
        if (h0VarT.s(e.j.f19032b3)) {
            s(h0VarT.a(e.j.f19032b3, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (h0VarT.s(e.j.f18998T2) && h0VarT.f(e.j.f18998T2, -1) == 0) {
            this.f5660a.setTextSize(0, 0.0f);
        }
        C(context, h0VarT);
        if (i8 >= 26 && h0VarT.s(e.j.f19027a3) && (strO = h0VarT.o(e.j.f19027a3)) != null) {
            e.d(this.f5660a, strO);
        }
        h0VarT.w();
        Typeface typeface = this.f5671l;
        if (typeface != null) {
            this.f5660a.setTypeface(typeface, this.f5669j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        AbstractC2204c.f(editorInfo, textView.getText());
    }

    void s(boolean z6) {
        this.f5660a.setAllCaps(z6);
    }

    void t(int i7, int i8, int i9, int i10) {
        this.f5668i.p(i7, i8, i9, i10);
    }

    void u(int[] iArr, int i7) {
        this.f5668i.q(iArr, i7);
    }

    void v(int i7) {
        this.f5668i.r(i7);
    }

    void w(ColorStateList colorStateList) {
        if (this.f5667h == null) {
            this.f5667h = new f0();
        }
        f0 f0Var = this.f5667h;
        f0Var.f6107a = colorStateList;
        f0Var.f6110d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f5667h == null) {
            this.f5667h = new f0();
        }
        f0 f0Var = this.f5667h;
        f0Var.f6108b = mode;
        f0Var.f6109c = mode != null;
        z();
    }
}
