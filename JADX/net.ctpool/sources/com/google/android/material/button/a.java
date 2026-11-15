package com.google.android.material.button;

import A3.j;
import K3.c;
import L3.b;
import N3.g;
import N3.k;
import N3.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f16640t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f16641u = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f16642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f16643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f16650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f16651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f16652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f16653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f16654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16655n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16656o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16657p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private LayerDrawable f16659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f16660s;

    a(MaterialButton materialButton, k kVar) {
        this.f16642a = materialButton;
        this.f16643b = kVar;
    }

    private void E(int i7, int i8) {
        int iG = H.G(this.f16642a);
        int paddingTop = this.f16642a.getPaddingTop();
        int iF = H.F(this.f16642a);
        int paddingBottom = this.f16642a.getPaddingBottom();
        int i9 = this.f16646e;
        int i10 = this.f16647f;
        this.f16647f = i8;
        this.f16646e = i7;
        if (!this.f16656o) {
            F();
        }
        H.D0(this.f16642a, iG, (paddingTop + i7) - i9, iF, (paddingBottom + i8) - i10);
    }

    private void F() {
        this.f16642a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.U(this.f16660s);
        }
    }

    private void G(k kVar) {
        if (f16641u && !this.f16656o) {
            int iG = H.G(this.f16642a);
            int paddingTop = this.f16642a.getPaddingTop();
            int iF = H.F(this.f16642a);
            int paddingBottom = this.f16642a.getPaddingBottom();
            F();
            H.D0(this.f16642a, iG, paddingTop, iF, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void H() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.a0(this.f16649h, this.f16652k);
            if (gVarN != null) {
                gVarN.Z(this.f16649h, this.f16655n ? E3.a.d(this.f16642a, A3.a.f112l) : 0);
            }
        }
    }

    private InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f16644c, this.f16646e, this.f16645d, this.f16647f);
    }

    private Drawable a() {
        g gVar = new g(this.f16643b);
        gVar.L(this.f16642a.getContext());
        androidx.core.graphics.drawable.a.i(gVar, this.f16651j);
        PorterDuff.Mode mode = this.f16650i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.j(gVar, mode);
        }
        gVar.a0(this.f16649h, this.f16652k);
        g gVar2 = new g(this.f16643b);
        gVar2.setTint(0);
        gVar2.Z(this.f16649h, this.f16655n ? E3.a.d(this.f16642a, A3.a.f112l) : 0);
        if (f16640t) {
            g gVar3 = new g(this.f16643b);
            this.f16654m = gVar3;
            androidx.core.graphics.drawable.a.h(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.a(this.f16653l), I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f16654m);
            this.f16659r = rippleDrawable;
            return rippleDrawable;
        }
        L3.a aVar = new L3.a(this.f16643b);
        this.f16654m = aVar;
        androidx.core.graphics.drawable.a.i(aVar, b.a(this.f16653l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f16654m});
        this.f16659r = layerDrawable;
        return I(layerDrawable);
    }

    private g g(boolean z6) {
        LayerDrawable layerDrawable = this.f16659r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f16640t ? (LayerDrawable) ((InsetDrawable) this.f16659r.getDrawable(0)).getDrawable() : this.f16659r).getDrawable(!z6 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(ColorStateList colorStateList) {
        if (this.f16652k != colorStateList) {
            this.f16652k = colorStateList;
            H();
        }
    }

    void B(int i7) {
        if (this.f16649h != i7) {
            this.f16649h = i7;
            H();
        }
    }

    void C(ColorStateList colorStateList) {
        if (this.f16651j != colorStateList) {
            this.f16651j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.i(f(), this.f16651j);
            }
        }
    }

    void D(PorterDuff.Mode mode) {
        if (this.f16650i != mode) {
            this.f16650i = mode;
            if (f() == null || this.f16650i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.j(f(), this.f16650i);
        }
    }

    int b() {
        return this.f16648g;
    }

    public int c() {
        return this.f16647f;
    }

    public int d() {
        return this.f16646e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f16659r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f16659r.getNumberOfLayers() > 2 ? this.f16659r.getDrawable(2) : this.f16659r.getDrawable(1));
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f16653l;
    }

    k i() {
        return this.f16643b;
    }

    ColorStateList j() {
        return this.f16652k;
    }

    int k() {
        return this.f16649h;
    }

    ColorStateList l() {
        return this.f16651j;
    }

    PorterDuff.Mode m() {
        return this.f16650i;
    }

    boolean o() {
        return this.f16656o;
    }

    boolean p() {
        return this.f16658q;
    }

    void q(TypedArray typedArray) {
        this.f16644c = typedArray.getDimensionPixelOffset(j.f547l2, 0);
        this.f16645d = typedArray.getDimensionPixelOffset(j.f555m2, 0);
        this.f16646e = typedArray.getDimensionPixelOffset(j.f563n2, 0);
        this.f16647f = typedArray.getDimensionPixelOffset(j.f571o2, 0);
        if (typedArray.hasValue(j.f599s2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(j.f599s2, -1);
            this.f16648g = dimensionPixelSize;
            y(this.f16643b.w(dimensionPixelSize));
            this.f16657p = true;
        }
        this.f16649h = typedArray.getDimensionPixelSize(j.f291C2, 0);
        this.f16650i = com.google.android.material.internal.n.f(typedArray.getInt(j.f592r2, -1), PorterDuff.Mode.SRC_IN);
        this.f16651j = c.a(this.f16642a.getContext(), typedArray, j.f585q2);
        this.f16652k = c.a(this.f16642a.getContext(), typedArray, j.f284B2);
        this.f16653l = c.a(this.f16642a.getContext(), typedArray, j.f277A2);
        this.f16658q = typedArray.getBoolean(j.f578p2, false);
        this.f16660s = typedArray.getDimensionPixelSize(j.f606t2, 0);
        int iG = H.G(this.f16642a);
        int paddingTop = this.f16642a.getPaddingTop();
        int iF = H.F(this.f16642a);
        int paddingBottom = this.f16642a.getPaddingBottom();
        if (typedArray.hasValue(j.f539k2)) {
            s();
        } else {
            F();
        }
        H.D0(this.f16642a, iG + this.f16644c, paddingTop + this.f16646e, iF + this.f16645d, paddingBottom + this.f16647f);
    }

    void r(int i7) {
        if (f() != null) {
            f().setTint(i7);
        }
    }

    void s() {
        this.f16656o = true;
        this.f16642a.setSupportBackgroundTintList(this.f16651j);
        this.f16642a.setSupportBackgroundTintMode(this.f16650i);
    }

    void t(boolean z6) {
        this.f16658q = z6;
    }

    void u(int i7) {
        if (this.f16657p && this.f16648g == i7) {
            return;
        }
        this.f16648g = i7;
        this.f16657p = true;
        y(this.f16643b.w(i7));
    }

    public void v(int i7) {
        E(this.f16646e, i7);
    }

    public void w(int i7) {
        E(i7, this.f16647f);
    }

    void x(ColorStateList colorStateList) {
        if (this.f16653l != colorStateList) {
            this.f16653l = colorStateList;
            boolean z6 = f16640t;
            if (z6 && (this.f16642a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f16642a.getBackground()).setColor(b.a(colorStateList));
            } else {
                if (z6 || !(this.f16642a.getBackground() instanceof L3.a)) {
                    return;
                }
                ((L3.a) this.f16642a.getBackground()).setTintList(b.a(colorStateList));
            }
        }
    }

    void y(k kVar) {
        this.f16643b = kVar;
        G(kVar);
    }

    void z(boolean z6) {
        this.f16655n = z6;
        H();
    }
}
