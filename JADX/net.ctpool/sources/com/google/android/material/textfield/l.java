package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.h0;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import androidx.core.view.r;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
class l extends LinearLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TextInputLayout f17254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextView f17255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f17256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CheckableImageButton f17257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ColorStateList f17258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PorterDuff.Mode f17259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnLongClickListener f17260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17261t;

    l(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.f17254m = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(A3.g.f225c, (ViewGroup) this, false);
        this.f17257p = checkableImageButton;
        D d7 = new D(getContext());
        this.f17255n = d7;
        g(h0Var);
        f(h0Var);
        addView(checkableImageButton);
        addView(d7);
    }

    private void f(h0 h0Var) {
        this.f17255n.setVisibility(8);
        this.f17255n.setId(A3.e.f193L);
        this.f17255n.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        H.r0(this.f17255n, 1);
        l(h0Var.n(A3.j.f487d6, 0));
        if (h0Var.s(A3.j.f495e6)) {
            m(h0Var.c(A3.j.f495e6));
        }
        k(h0Var.p(A3.j.f479c6));
    }

    private void g(h0 h0Var) {
        if (K3.c.g(getContext())) {
            r.c((ViewGroup.MarginLayoutParams) this.f17257p.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        if (h0Var.s(A3.j.f527i6)) {
            this.f17258q = K3.c.b(getContext(), h0Var, A3.j.f527i6);
        }
        if (h0Var.s(A3.j.f535j6)) {
            this.f17259r = com.google.android.material.internal.n.f(h0Var.k(A3.j.f535j6, -1), null);
        }
        if (h0Var.s(A3.j.f519h6)) {
            p(h0Var.g(A3.j.f519h6));
            if (h0Var.s(A3.j.f511g6)) {
                o(h0Var.p(A3.j.f511g6));
            }
            n(h0Var.a(A3.j.f503f6, true));
        }
    }

    private void x() {
        int i7 = (this.f17256o == null || this.f17261t) ? 8 : 0;
        setVisibility((this.f17257p.getVisibility() == 0 || i7 == 0) ? 0 : 8);
        this.f17255n.setVisibility(i7);
        this.f17254m.q0();
    }

    CharSequence a() {
        return this.f17256o;
    }

    ColorStateList b() {
        return this.f17255n.getTextColors();
    }

    TextView c() {
        return this.f17255n;
    }

    CharSequence d() {
        return this.f17257p.getContentDescription();
    }

    Drawable e() {
        return this.f17257p.getDrawable();
    }

    boolean h() {
        return this.f17257p.getVisibility() == 0;
    }

    void i(boolean z6) {
        this.f17261t = z6;
        x();
    }

    void j() {
        g.c(this.f17254m, this.f17257p, this.f17258q);
    }

    void k(CharSequence charSequence) {
        this.f17256o = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f17255n.setText(charSequence);
        x();
    }

    void l(int i7) {
        androidx.core.widget.i.n(this.f17255n, i7);
    }

    void m(ColorStateList colorStateList) {
        this.f17255n.setTextColor(colorStateList);
    }

    void n(boolean z6) {
        this.f17257p.setCheckable(z6);
    }

    void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f17257p.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        w();
    }

    void p(Drawable drawable) {
        this.f17257p.setImageDrawable(drawable);
        if (drawable != null) {
            g.a(this.f17254m, this.f17257p, this.f17258q, this.f17259r);
            u(true);
            j();
        } else {
            u(false);
            q(null);
            r(null);
            o(null);
        }
    }

    void q(View.OnClickListener onClickListener) {
        g.e(this.f17257p, onClickListener, this.f17260s);
    }

    void r(View.OnLongClickListener onLongClickListener) {
        this.f17260s = onLongClickListener;
        g.f(this.f17257p, onLongClickListener);
    }

    void s(ColorStateList colorStateList) {
        if (this.f17258q != colorStateList) {
            this.f17258q = colorStateList;
            g.a(this.f17254m, this.f17257p, colorStateList, this.f17259r);
        }
    }

    void t(PorterDuff.Mode mode) {
        if (this.f17259r != mode) {
            this.f17259r = mode;
            g.a(this.f17254m, this.f17257p, this.f17258q, mode);
        }
    }

    void u(boolean z6) {
        if (h() != z6) {
            this.f17257p.setVisibility(z6 ? 0 : 8);
            w();
            x();
        }
    }

    void v(C c7) {
        View view;
        if (this.f17255n.getVisibility() == 0) {
            c7.r0(this.f17255n);
            view = this.f17255n;
        } else {
            view = this.f17257p;
        }
        c7.J0(view);
    }

    void w() {
        EditText editText = this.f17254m.f17127q;
        if (editText == null) {
            return;
        }
        H.D0(this.f17255n, h() ? 0 : H.G(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(A3.c.f168t), editText.getCompoundPaddingBottom());
    }
}
