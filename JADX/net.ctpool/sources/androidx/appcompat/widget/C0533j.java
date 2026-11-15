package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import f.AbstractC1641a;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0533j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f6130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f6131b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f6132c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6133d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6134e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6135f;

    C0533j(CompoundButton compoundButton) {
        this.f6130a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f6130a);
        if (drawableA != null) {
            if (this.f6133d || this.f6134e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.l(drawableA).mutate();
                if (this.f6133d) {
                    androidx.core.graphics.drawable.a.i(drawableMutate, this.f6131b);
                }
                if (this.f6134e) {
                    androidx.core.graphics.drawable.a.j(drawableMutate, this.f6132c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f6130a.getDrawableState());
                }
                this.f6130a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i7) {
        return i7;
    }

    ColorStateList c() {
        return this.f6131b;
    }

    PorterDuff.Mode d() {
        return this.f6132c;
    }

    void e(AttributeSet attributeSet, int i7) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f6130a.getContext(), attributeSet, e.j.f19000U0, i7, 0);
        CompoundButton compoundButton = this.f6130a;
        androidx.core.view.H.n0(compoundButton, compoundButton.getContext(), e.j.f19000U0, attributeSet, h0VarV.r(), i7, 0);
        try {
            if (h0VarV.s(e.j.f19008W0) && (iN2 = h0VarV.n(e.j.f19008W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f6130a;
                    compoundButton2.setButtonDrawable(AbstractC1641a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(e.j.f19004V0)) {
                        CompoundButton compoundButton3 = this.f6130a;
                        compoundButton3.setButtonDrawable(AbstractC1641a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(e.j.f19004V0) && (iN = h0VarV.n(e.j.f19004V0, 0)) != 0) {
                CompoundButton compoundButton32 = this.f6130a;
                compoundButton32.setButtonDrawable(AbstractC1641a.b(compoundButton32.getContext(), iN));
            }
            if (h0VarV.s(e.j.f19012X0)) {
                androidx.core.widget.c.c(this.f6130a, h0VarV.c(e.j.f19012X0));
            }
            if (h0VarV.s(e.j.f19016Y0)) {
                androidx.core.widget.c.d(this.f6130a, O.e(h0VarV.k(e.j.f19016Y0, -1), null));
            }
        } finally {
            h0VarV.w();
        }
    }

    void f() {
        if (this.f6135f) {
            this.f6135f = false;
        } else {
            this.f6135f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f6131b = colorStateList;
        this.f6133d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f6132c = mode;
        this.f6134e = true;
        a();
    }
}
