package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import f.AbstractC1641a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0532i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f6123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f6124b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f6125c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6126d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6127e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6128f;

    C0532i(CheckedTextView checkedTextView) {
        this.f6123a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f6123a);
        if (drawableA != null) {
            if (this.f6126d || this.f6127e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.l(drawableA).mutate();
                if (this.f6126d) {
                    androidx.core.graphics.drawable.a.i(drawableMutate, this.f6124b);
                }
                if (this.f6127e) {
                    androidx.core.graphics.drawable.a.j(drawableMutate, this.f6125c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f6123a.getDrawableState());
                }
                this.f6123a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f6124b;
    }

    PorterDuff.Mode c() {
        return this.f6125c;
    }

    void d(AttributeSet attributeSet, int i7) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f6123a.getContext(), attributeSet, e.j.f18977P0, i7, 0);
        CheckedTextView checkedTextView = this.f6123a;
        androidx.core.view.H.n0(checkedTextView, checkedTextView.getContext(), e.j.f18977P0, attributeSet, h0VarV.r(), i7, 0);
        try {
            if (h0VarV.s(e.j.f18987R0) && (iN2 = h0VarV.n(e.j.f18987R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f6123a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC1641a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(e.j.f18982Q0)) {
                        CheckedTextView checkedTextView3 = this.f6123a;
                        checkedTextView3.setCheckMarkDrawable(AbstractC1641a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(e.j.f18982Q0) && (iN = h0VarV.n(e.j.f18982Q0, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.f6123a;
                checkedTextView32.setCheckMarkDrawable(AbstractC1641a.b(checkedTextView32.getContext(), iN));
            }
            if (h0VarV.s(e.j.f18992S0)) {
                androidx.core.widget.b.b(this.f6123a, h0VarV.c(e.j.f18992S0));
            }
            if (h0VarV.s(e.j.f18996T0)) {
                androidx.core.widget.b.c(this.f6123a, O.e(h0VarV.k(e.j.f18996T0, -1), null));
            }
        } finally {
            h0VarV.w();
        }
    }

    void e() {
        if (this.f6128f) {
            this.f6128f = false;
        } else {
            this.f6128f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f6124b = colorStateList;
        this.f6126d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f6125c = mode;
        this.f6127e = true;
        a();
    }
}
