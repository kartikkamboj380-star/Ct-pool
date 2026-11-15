package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.D;
import androidx.core.view.H;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f17214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f17215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FrameLayout f17217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator f17218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f17219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f17222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f17224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f17225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f17227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f17228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f17230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f17232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Typeface f17233u;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f17235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f17237d;

        a(int i7, TextView textView, int i8, TextView textView2) {
            this.f17234a = i7;
            this.f17235b = textView;
            this.f17236c = i8;
            this.f17237d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.f17220h = this.f17234a;
            h.this.f17218f = null;
            TextView textView = this.f17235b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f17236c == 1 && h.this.f17224l != null) {
                    h.this.f17224l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f17237d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f17237d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f17237d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = h.this.f17214b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public h(TextInputLayout textInputLayout) {
        this.f17213a = textInputLayout.getContext();
        this.f17214b = textInputLayout;
        this.f17219g = r0.getResources().getDimensionPixelSize(A3.c.f154f);
    }

    private void C(int i7, int i8) {
        TextView textViewM;
        TextView textViewM2;
        if (i7 == i8) {
            return;
        }
        if (i8 != 0 && (textViewM2 = m(i8)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i7 != 0 && (textViewM = m(i7)) != null) {
            textViewM.setVisibility(4);
            if (i7 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f17220h = i8;
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, CharSequence charSequence) {
        return H.T(this.f17214b) && this.f17214b.isEnabled() && !(this.f17221i == this.f17220h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void Q(int i7, int i8, boolean z6) {
        if (i7 == i8) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f17218f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f17229q, this.f17230r, 2, i7, i8);
            i(arrayList, this.f17223k, this.f17224l, 1, i7, i8);
            B3.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i8, m(i7), i7, m(i8)));
            animatorSet.start();
        } else {
            C(i7, i8);
        }
        this.f17214b.r0();
        this.f17214b.w0(z6);
        this.f17214b.E0();
    }

    private boolean g() {
        return (this.f17215c == null || this.f17214b.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z6, TextView textView, int i7, int i8, int i9) {
        if (textView == null || !z6) {
            return;
        }
        if (i7 == i9 || i7 == i8) {
            list.add(j(textView, i9 == i7));
            if (i9 == i7) {
                list.add(k(textView));
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z6) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z6 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(B3.a.f739a);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f17219g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(B3.a.f742d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i7) {
        if (i7 == 1) {
            return this.f17224l;
        }
        if (i7 != 2) {
            return null;
        }
        return this.f17230r;
    }

    private int u(boolean z6, int i7, int i8) {
        return z6 ? this.f17213a.getResources().getDimensionPixelSize(i7) : i8;
    }

    private boolean x(int i7) {
        return (i7 != 1 || this.f17224l == null || TextUtils.isEmpty(this.f17222j)) ? false : true;
    }

    boolean A() {
        return this.f17229q;
    }

    void B(TextView textView, int i7) {
        ViewGroup viewGroup;
        if (this.f17215c == null) {
            return;
        }
        if (!y(i7) || (viewGroup = this.f17217e) == null) {
            viewGroup = this.f17215c;
        }
        viewGroup.removeView(textView);
        int i8 = this.f17216d - 1;
        this.f17216d = i8;
        M(this.f17215c, i8);
    }

    void D(CharSequence charSequence) {
        this.f17225m = charSequence;
        TextView textView = this.f17224l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void E(boolean z6) {
        if (this.f17223k == z6) {
            return;
        }
        h();
        if (z6) {
            D d7 = new D(this.f17213a);
            this.f17224l = d7;
            d7.setId(A3.e.f190I);
            this.f17224l.setTextAlignment(5);
            Typeface typeface = this.f17233u;
            if (typeface != null) {
                this.f17224l.setTypeface(typeface);
            }
            F(this.f17226n);
            G(this.f17227o);
            D(this.f17225m);
            this.f17224l.setVisibility(4);
            H.r0(this.f17224l, 1);
            e(this.f17224l, 0);
        } else {
            v();
            B(this.f17224l, 0);
            this.f17224l = null;
            this.f17214b.r0();
            this.f17214b.E0();
        }
        this.f17223k = z6;
    }

    void F(int i7) {
        this.f17226n = i7;
        TextView textView = this.f17224l;
        if (textView != null) {
            this.f17214b.d0(textView, i7);
        }
    }

    void G(ColorStateList colorStateList) {
        this.f17227o = colorStateList;
        TextView textView = this.f17224l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void H(int i7) {
        this.f17231s = i7;
        TextView textView = this.f17230r;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i7);
        }
    }

    void I(boolean z6) {
        if (this.f17229q == z6) {
            return;
        }
        h();
        if (z6) {
            D d7 = new D(this.f17213a);
            this.f17230r = d7;
            d7.setId(A3.e.f191J);
            this.f17230r.setTextAlignment(5);
            Typeface typeface = this.f17233u;
            if (typeface != null) {
                this.f17230r.setTypeface(typeface);
            }
            this.f17230r.setVisibility(4);
            H.r0(this.f17230r, 1);
            H(this.f17231s);
            J(this.f17232t);
            e(this.f17230r, 1);
            this.f17230r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.f17230r, 1);
            this.f17230r = null;
            this.f17214b.r0();
            this.f17214b.E0();
        }
        this.f17229q = z6;
    }

    void J(ColorStateList colorStateList) {
        this.f17232t = colorStateList;
        TextView textView = this.f17230r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void L(Typeface typeface) {
        if (typeface != this.f17233u) {
            this.f17233u = typeface;
            K(this.f17224l, typeface);
            K(this.f17230r, typeface);
        }
    }

    void O(CharSequence charSequence) {
        h();
        this.f17222j = charSequence;
        this.f17224l.setText(charSequence);
        int i7 = this.f17220h;
        if (i7 != 1) {
            this.f17221i = 1;
        }
        Q(i7, this.f17221i, N(this.f17224l, charSequence));
    }

    void P(CharSequence charSequence) {
        h();
        this.f17228p = charSequence;
        this.f17230r.setText(charSequence);
        int i7 = this.f17220h;
        if (i7 != 2) {
            this.f17221i = 2;
        }
        Q(i7, this.f17221i, N(this.f17230r, charSequence));
    }

    void e(TextView textView, int i7) {
        if (this.f17215c == null && this.f17217e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f17213a);
            this.f17215c = linearLayout;
            linearLayout.setOrientation(0);
            this.f17214b.addView(this.f17215c, -1, -2);
            this.f17217e = new FrameLayout(this.f17213a);
            this.f17215c.addView(this.f17217e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f17214b.getEditText() != null) {
                f();
            }
        }
        if (y(i7)) {
            this.f17217e.setVisibility(0);
            this.f17217e.addView(textView);
        } else {
            this.f17215c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f17215c.setVisibility(0);
        this.f17216d++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f17214b.getEditText();
            boolean zG = K3.c.g(this.f17213a);
            H.D0(this.f17215c, u(zG, A3.c.f166r, H.G(editText)), u(zG, A3.c.f167s, this.f17213a.getResources().getDimensionPixelSize(A3.c.f165q)), u(zG, A3.c.f166r, H.F(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f17218f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return x(this.f17221i);
    }

    CharSequence n() {
        return this.f17225m;
    }

    CharSequence o() {
        return this.f17222j;
    }

    int p() {
        TextView textView = this.f17224l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList q() {
        TextView textView = this.f17224l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence r() {
        return this.f17228p;
    }

    View s() {
        return this.f17230r;
    }

    int t() {
        TextView textView = this.f17230r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void v() {
        this.f17222j = null;
        h();
        if (this.f17220h == 1) {
            this.f17221i = (!this.f17229q || TextUtils.isEmpty(this.f17228p)) ? 0 : 2;
        }
        Q(this.f17220h, this.f17221i, N(this.f17224l, ""));
    }

    void w() {
        h();
        int i7 = this.f17220h;
        if (i7 == 2) {
            this.f17221i = 0;
        }
        Q(i7, this.f17221i, N(this.f17230r, ""));
    }

    boolean y(int i7) {
        return i7 == 0 || i7 == 1;
    }

    boolean z() {
        return this.f17223k;
    }
}
