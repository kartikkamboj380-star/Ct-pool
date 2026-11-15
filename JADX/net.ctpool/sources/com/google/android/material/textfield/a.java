package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
class a extends com.google.android.material.textfield.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextWatcher f17157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f17158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextInputLayout.f f17159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout.g f17160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AnimatorSet f17161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ValueAnimator f17162j;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    class C0231a implements TextWatcher {
        C0231a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f17209a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z6) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f17158f);
            a aVar = a.this;
            aVar.f17211c.setOnFocusChangeListener(aVar.f17158f);
            editText.removeTextChangedListener(a.this.f17157e);
            editText.addTextChangedListener(a.this.f17157e);
        }
    }

    class d implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        class RunnableC0232a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ EditText f17167m;

            RunnableC0232a(EditText editText) {
                this.f17167m = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17167m.removeTextChangedListener(a.this.f17157e);
                a.this.i(true);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i7) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i7 != 2) {
                return;
            }
            editText.post(new RunnableC0232a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f17158f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f17211c.getOnFocusChangeListener() == a.this.f17158f) {
                a.this.f17211c.setOnFocusChangeListener(null);
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f17209a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f17209a.U();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f17209a.setEndIconVisible(true);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f17209a.setEndIconVisible(false);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f17211c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f17211c.setScaleX(fFloatValue);
            a.this.f17211c.setScaleY(fFloatValue);
        }
    }

    a(TextInputLayout textInputLayout, int i7) {
        super(textInputLayout, i7);
        this.f17157e = new C0231a();
        this.f17158f = new b();
        this.f17159g = new c();
        this.f17160h = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z6) {
        boolean z7 = this.f17209a.K() == z6;
        if (z6 && !this.f17161i.isRunning()) {
            this.f17162j.cancel();
            this.f17161i.start();
            if (z7) {
                this.f17161i.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f17161i.cancel();
        this.f17162j.start();
        if (z7) {
            this.f17162j.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(B3.a.f739a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(B3.a.f742d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    private void l() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17161i = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.f17161i.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.f17162j = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.f17209a.getEditText();
        return editText != null && (editText.hasFocus() || this.f17211c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.f
    void a() {
        TextInputLayout textInputLayout = this.f17209a;
        int i7 = this.f17212d;
        if (i7 == 0) {
            i7 = A3.d.f180f;
        }
        textInputLayout.setEndIconDrawable(i7);
        TextInputLayout textInputLayout2 = this.f17209a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(A3.h.f245e));
        this.f17209a.setEndIconCheckable(false);
        this.f17209a.setEndIconOnClickListener(new e());
        this.f17209a.g(this.f17159g);
        this.f17209a.h(this.f17160h);
        l();
    }

    @Override // com.google.android.material.textfield.f
    void c(boolean z6) {
        if (this.f17209a.getSuffixText() == null) {
            return;
        }
        i(z6);
    }
}
