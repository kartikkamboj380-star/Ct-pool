package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.H;
import androidx.core.view.accessibility.AbstractC0578c;
import androidx.core.view.accessibility.C;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
class e extends com.google.android.material.textfield.f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f17176t = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextWatcher f17177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f17178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextInputLayout.e f17179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout.f f17180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextInputLayout.g f17181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f17182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC0578c.b f17183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f17186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private StateListDrawable f17187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private N3.g f17188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AccessibilityManager f17189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f17190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ValueAnimator f17191s;

    class a extends com.google.android.material.internal.k {

        /* JADX INFO: renamed from: com.google.android.material.textfield.e$a$a, reason: collision with other inner class name */
        class RunnableC0233a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f17193m;

            RunnableC0233a(AutoCompleteTextView autoCompleteTextView) {
                this.f17193m = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f17193m.isPopupShowing();
                e.this.J(zIsPopupShowing);
                e.this.f17184l = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewC = e.C(e.this.f17209a.getEditText());
            if (e.this.f17189q.isTouchExplorationEnabled() && e.H(autoCompleteTextViewC) && !e.this.f17211c.hasFocus()) {
                autoCompleteTextViewC.dismissDropDown();
            }
            autoCompleteTextViewC.post(new RunnableC0233a(autoCompleteTextViewC));
        }
    }

    class b implements AutoCompleteTextView.OnDismissListener {
        b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            e.this.N();
            e.this.J(false);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            eVar.f17211c.setChecked(eVar.f17185m);
            e.this.f17191s.start();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.f17211c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.e$e, reason: collision with other inner class name */
    class ViewOnFocusChangeListenerC0234e implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0234e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z6) {
            e.this.f17209a.setEndIconActivated(z6);
            if (z6) {
                return;
            }
            e.this.J(false);
            e.this.f17184l = false;
        }
    }

    class f extends TextInputLayout.e {
        f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            if (!e.H(e.this.f17209a.getEditText())) {
                c7.g0(Spinner.class.getName());
            }
            if (c7.R()) {
                c7.q0(null);
            }
        }

        @Override // androidx.core.view.C0574a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewC = e.C(e.this.f17209a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && e.this.f17189q.isEnabled() && !e.H(e.this.f17209a.getEditText())) {
                e.this.M(autoCompleteTextViewC);
                e.this.N();
            }
        }
    }

    class g implements TextInputLayout.f {
        g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewC = e.C(textInputLayout.getEditText());
            e.this.K(autoCompleteTextViewC);
            e.this.y(autoCompleteTextViewC);
            e.this.L(autoCompleteTextViewC);
            autoCompleteTextViewC.setThreshold(0);
            autoCompleteTextViewC.removeTextChangedListener(e.this.f17177e);
            autoCompleteTextViewC.addTextChangedListener(e.this.f17177e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!e.H(autoCompleteTextViewC) && e.this.f17189q.isTouchExplorationEnabled()) {
                H.z0(e.this.f17211c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(e.this.f17179g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class h implements TextInputLayout.g {

        class a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f17202m;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f17202m = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17202m.removeTextChangedListener(e.this.f17177e);
            }
        }

        h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i7) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i7 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == e.this.f17178f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (e.f17176t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i7 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(e.this.f17182j);
                e.this.I();
            }
        }
    }

    class i implements View.OnAttachStateChangeListener {
        i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            e.this.I();
        }
    }

    class j implements AbstractC0578c.b {
        j() {
        }

        @Override // androidx.core.view.accessibility.AbstractC0578c.b
        public void onTouchExplorationStateChanged(boolean z6) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = e.this.f17209a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || e.H(autoCompleteTextView)) {
                return;
            }
            H.z0(e.this.f17211c, z6 ? 2 : 1);
        }
    }

    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.M((AutoCompleteTextView) e.this.f17209a.getEditText());
        }
    }

    class l implements View.OnTouchListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f17207m;

        l(AutoCompleteTextView autoCompleteTextView) {
            this.f17207m = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (e.this.G()) {
                    e.this.f17184l = false;
                }
                e.this.M(this.f17207m);
                e.this.N();
            }
            return false;
        }
    }

    e(TextInputLayout textInputLayout, int i7) {
        super(textInputLayout, i7);
        this.f17177e = new a();
        this.f17178f = new ViewOnFocusChangeListenerC0234e();
        this.f17179g = new f(this.f17209a);
        this.f17180h = new g();
        this.f17181i = new h();
        this.f17182j = new i();
        this.f17183k = new j();
        this.f17184l = false;
        this.f17185m = false;
        this.f17186n = Long.MAX_VALUE;
    }

    private void A(AutoCompleteTextView autoCompleteTextView, int i7, int[][] iArr, N3.g gVar) {
        LayerDrawable layerDrawable;
        int iD = E3.a.d(autoCompleteTextView, A3.a.f112l);
        N3.g gVar2 = new N3.g(gVar.C());
        int iH = E3.a.h(i7, iD, 0.1f);
        gVar2.V(new ColorStateList(iArr, new int[]{iH, 0}));
        if (f17176t) {
            gVar2.setTint(iD);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iH, iD});
            N3.g gVar3 = new N3.g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        H.t0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        TextInputLayout textInputLayout;
        if (this.f17189q == null || (textInputLayout = this.f17209a) == null || !H.S(textInputLayout)) {
            return;
        }
        AbstractC0578c.a(this.f17189q, this.f17183k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator D(int i7, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(B3.a.f739a);
        valueAnimatorOfFloat.setDuration(i7);
        valueAnimatorOfFloat.addUpdateListener(new d());
        return valueAnimatorOfFloat;
    }

    private N3.g E(float f7, float f8, float f9, int i7) {
        N3.k kVarM = N3.k.a().A(f7).E(f7).s(f8).w(f8).m();
        N3.g gVarM = N3.g.m(this.f17210b, f9);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.X(0, i7, 0, i7);
        return gVarM;
    }

    private void F() {
        this.f17191s = D(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(50, 1.0f, 0.0f);
        this.f17190r = valueAnimatorD;
        valueAnimatorD.addListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17186n;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        AccessibilityManager accessibilityManager = this.f17189q;
        if (accessibilityManager != null) {
            AbstractC0578c.b(accessibilityManager, this.f17183k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z6) {
        if (this.f17185m != z6) {
            this.f17185m = z6;
            this.f17191s.cancel();
            this.f17190r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f17176t) {
            int boxBackgroundMode = this.f17209a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f17188p;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.f17187o;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f17178f);
        if (f17176t) {
            autoCompleteTextView.setOnDismissListener(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.f17184l = false;
        }
        if (this.f17184l) {
            this.f17184l = false;
            return;
        }
        if (f17176t) {
            J(!this.f17185m);
        } else {
            this.f17185m = !this.f17185m;
            this.f17211c.toggle();
        }
        if (!this.f17185m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.f17184l = true;
        this.f17186n = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f17209a.getBoxBackgroundMode();
        N3.g boxBackground = this.f17209a.getBoxBackground();
        int iD = E3.a.d(autoCompleteTextView, A3.a.f108h);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, iD, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, iD, iArr, boxBackground);
        }
    }

    private void z(AutoCompleteTextView autoCompleteTextView, int i7, int[][] iArr, N3.g gVar) {
        int boxBackgroundColor = this.f17209a.getBoxBackgroundColor();
        int[] iArr2 = {E3.a.h(i7, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f17176t) {
            H.t0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        N3.g gVar2 = new N3.g(gVar.C());
        gVar2.V(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int iG = H.G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iF = H.F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        H.t0(autoCompleteTextView, layerDrawable);
        H.D0(autoCompleteTextView, iG, paddingTop, iF, paddingBottom);
    }

    void O(AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.f17209a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    @Override // com.google.android.material.textfield.f
    void a() {
        float dimensionPixelOffset = this.f17210b.getResources().getDimensionPixelOffset(A3.c.f143K);
        float dimensionPixelOffset2 = this.f17210b.getResources().getDimensionPixelOffset(A3.c.f140H);
        int dimensionPixelOffset3 = this.f17210b.getResources().getDimensionPixelOffset(A3.c.f141I);
        N3.g gVarE = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        N3.g gVarE2 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f17188p = gVarE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f17187o = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarE);
        this.f17187o.addState(new int[0], gVarE2);
        int i7 = this.f17212d;
        if (i7 == 0) {
            i7 = f17176t ? A3.d.f178d : A3.d.f179e;
        }
        this.f17209a.setEndIconDrawable(i7);
        TextInputLayout textInputLayout = this.f17209a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(A3.h.f247g));
        this.f17209a.setEndIconOnClickListener(new k());
        this.f17209a.g(this.f17180h);
        this.f17209a.h(this.f17181i);
        F();
        this.f17189q = (AccessibilityManager) this.f17210b.getSystemService("accessibility");
        this.f17209a.addOnAttachStateChangeListener(this.f17182j);
        B();
    }

    @Override // com.google.android.material.textfield.f
    boolean b(int i7) {
        return i7 != 0;
    }

    @Override // com.google.android.material.textfield.f
    boolean d() {
        return true;
    }
}
