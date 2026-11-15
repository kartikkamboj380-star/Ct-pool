package com.google.android.material.textfield;

import N3.k;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0534k;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import androidx.core.view.r;
import com.google.android.material.internal.CheckableImageButton;
import f.AbstractC1641a;
import g0.AbstractC1683n;
import g0.C1673d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private static final int f17063U0 = A3.i.f262f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TextView f17064A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private ColorStateList f17065A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f17066B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private PorterDuff.Mode f17067B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f17068C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private ColorStateList f17069C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CharSequence f17070D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private ColorStateList f17071D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f17072E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f17073E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f17074F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f17075F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ColorStateList f17076G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f17077G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f17078H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private ColorStateList f17079H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private C1673d f17080I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f17081I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private C1673d f17082J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private int f17083J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private ColorStateList f17084K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private int f17085K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ColorStateList f17086L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f17087L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private CharSequence f17088M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f17089M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final TextView f17090N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private boolean f17091N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f17092O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    final com.google.android.material.internal.b f17093O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private CharSequence f17094P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private boolean f17095P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f17096Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private boolean f17097Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private N3.g f17098R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private ValueAnimator f17099R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private N3.g f17100S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f17101S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private N3.g f17102T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private boolean f17103T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private N3.k f17104U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f17105V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final int f17106W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f17107a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f17108b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f17109c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f17110d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f17111e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f17112f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f17113g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final Rect f17114h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Rect f17115i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final RectF f17116j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Typeface f17117k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Drawable f17118l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final FrameLayout f17119m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f17120m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l f17121n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final LinkedHashSet f17122n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LinearLayout f17123o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f17124o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final FrameLayout f17125p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final SparseArray f17126p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    EditText f17127q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final CheckableImageButton f17128q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f17129r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final LinkedHashSet f17130r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17131s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private ColorStateList f17132s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17133t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private PorterDuff.Mode f17134t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f17135u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private Drawable f17136u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17137v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f17138v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.google.android.material.textfield.h f17139w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Drawable f17140w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f17141x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private View.OnLongClickListener f17142x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17143y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private View.OnLongClickListener f17144y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f17145z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final CheckableImageButton f17146z0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.f17103T0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f17141x) {
                textInputLayout.m0(editable.length());
            }
            if (TextInputLayout.this.f17072E) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f17128q0.performClick();
            TextInputLayout.this.f17128q0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f17127q.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f17093O0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C0574a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextInputLayout f17151d;

        public e(TextInputLayout textInputLayout) {
            this.f17151d = textInputLayout;
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            EditText editText = this.f17151d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f17151d.getHint();
            CharSequence error = this.f17151d.getError();
            CharSequence placeholderText = this.f17151d.getPlaceholderText();
            int counterMaxLength = this.f17151d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f17151d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z6 = !zIsEmpty;
            boolean z7 = true;
            boolean z8 = !TextUtils.isEmpty(hint);
            boolean z9 = !this.f17151d.N();
            boolean z10 = !TextUtils.isEmpty(error);
            if (!z10 && TextUtils.isEmpty(counterOverflowDescription)) {
                z7 = false;
            }
            String string = z8 ? hint.toString() : "";
            this.f17151d.f17121n.v(c7);
            if (z6) {
                c7.H0(text);
            } else if (!TextUtils.isEmpty(string)) {
                c7.H0(string);
                if (z9 && placeholderText != null) {
                    placeholderText = string + ", " + ((Object) placeholderText);
                    c7.H0(placeholderText);
                }
            } else if (placeholderText != null) {
                c7.H0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c7.q0(string);
                } else {
                    if (z6) {
                        string = ((Object) text) + ", " + string;
                    }
                    c7.H0(string);
                }
                c7.D0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c7.t0(counterMaxLength);
            if (z7) {
                if (!z10) {
                    error = counterOverflowDescription;
                }
                c7.m0(error);
            }
            View viewS = this.f17151d.f17139w.s();
            if (viewS != null) {
                c7.r0(viewS);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i7);
    }

    static class h extends AbstractC2252a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        CharSequence f17152o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f17153p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f17154q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f17155r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f17156s;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i7) {
                return new h[i7];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f17152o = (CharSequence) creator.createFromParcel(parcel);
            this.f17153p = parcel.readInt() == 1;
            this.f17154q = (CharSequence) creator.createFromParcel(parcel);
            this.f17155r = (CharSequence) creator.createFromParcel(parcel);
            this.f17156s = (CharSequence) creator.createFromParcel(parcel);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f17152o) + " hint=" + ((Object) this.f17154q) + " helperText=" + ((Object) this.f17155r) + " placeholderText=" + ((Object) this.f17156s) + "}";
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            TextUtils.writeToParcel(this.f17152o, parcel, i7);
            parcel.writeInt(this.f17153p ? 1 : 0);
            TextUtils.writeToParcel(this.f17154q, parcel, i7);
            TextUtils.writeToParcel(this.f17155r, parcel, i7);
            TextUtils.writeToParcel(this.f17156s, parcel, i7);
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f98D);
    }

    private boolean A() {
        return this.f17092O && !TextUtils.isEmpty(this.f17094P) && (this.f17098R instanceof com.google.android.material.textfield.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(int i7) {
        if (i7 != 0 || this.f17091N0) {
            J();
        } else {
            h0();
        }
    }

    private void B() {
        Iterator it = this.f17122n0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void B0(boolean z6, boolean z7) {
        int defaultColor = this.f17079H0.getDefaultColor();
        int colorForState = this.f17079H0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f17079H0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f17112f0 = colorForState2;
        } else if (z7) {
            this.f17112f0 = colorForState;
        } else {
            this.f17112f0 = defaultColor;
        }
    }

    private void C(int i7) {
        Iterator it = this.f17130r0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i7);
        }
    }

    private void C0() {
        if (this.f17127q == null) {
            return;
        }
        H.D0(this.f17090N, getContext().getResources().getDimensionPixelSize(A3.c.f168t), this.f17127q.getPaddingTop(), (K() || L()) ? 0 : H.F(this.f17127q), this.f17127q.getPaddingBottom());
    }

    private void D(Canvas canvas) {
        N3.g gVar;
        if (this.f17102T == null || (gVar = this.f17100S) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f17127q.isFocused()) {
            Rect bounds = this.f17102T.getBounds();
            Rect bounds2 = this.f17100S.getBounds();
            float fX = this.f17093O0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = B3.a.c(iCenterX, bounds2.left, fX);
            bounds.right = B3.a.c(iCenterX, bounds2.right, fX);
            this.f17102T.draw(canvas);
        }
    }

    private void D0() {
        int visibility = this.f17090N.getVisibility();
        int i7 = (this.f17088M == null || N()) ? 8 : 0;
        if (visibility != i7) {
            getEndIconDelegate().c(i7 == 0);
        }
        t0();
        this.f17090N.setVisibility(i7);
        q0();
    }

    private void E(Canvas canvas) {
        if (this.f17092O) {
            this.f17093O0.l(canvas);
        }
    }

    private void F(boolean z6) {
        ValueAnimator valueAnimator = this.f17099R0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17099R0.cancel();
        }
        if (z6 && this.f17097Q0) {
            k(0.0f);
        } else {
            this.f17093O0.d0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.d) this.f17098R).g0()) {
            x();
        }
        this.f17091N0 = true;
        J();
        this.f17121n.i(true);
        D0();
    }

    private int G(int i7, boolean z6) {
        int compoundPaddingLeft = i7 + this.f17127q.getCompoundPaddingLeft();
        return (getPrefixText() == null || z6) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int H(int i7, boolean z6) {
        int compoundPaddingRight = i7 - this.f17127q.getCompoundPaddingRight();
        return (getPrefixText() == null || !z6) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private boolean I() {
        return this.f17124o0 != 0;
    }

    private void J() {
        TextView textView = this.f17074F;
        if (textView == null || !this.f17072E) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractC1683n.a(this.f17119m, this.f17082J);
        this.f17074F.setVisibility(4);
    }

    private boolean L() {
        return this.f17146z0.getVisibility() == 0;
    }

    private boolean P() {
        return this.f17107a0 == 1 && this.f17127q.getMinLines() <= 1;
    }

    private void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.f17107a0 != 0) {
            v0();
        }
    }

    private void R() {
        if (A()) {
            RectF rectF = this.f17116j0;
            this.f17093O0.o(rectF, this.f17127q.getWidth(), this.f17127q.getGravity());
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f17109c0);
            ((com.google.android.material.textfield.d) this.f17098R).j0(rectF);
        }
    }

    private void S() {
        if (!A() || this.f17091N0) {
            return;
        }
        x();
        R();
    }

    private static void T(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z6);
            }
        }
    }

    private void X() {
        TextView textView = this.f17074F;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            H.t0(this.f17127q, this.f17098R);
        }
    }

    private static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zO = H.O(checkableImageButton);
        boolean z6 = onLongClickListener != null;
        boolean z7 = zO || z6;
        checkableImageButton.setFocusable(z7);
        checkableImageButton.setClickable(zO);
        checkableImageButton.setPressable(zO);
        checkableImageButton.setLongClickable(z6);
        H.z0(checkableImageButton, z7 ? 1 : 2);
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        return (this.f17146z0.getVisibility() == 0 || ((I() && K()) || this.f17088M != null)) && this.f17123o.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f17121n.getMeasuredWidth() > 0;
    }

    private boolean g0() {
        EditText editText = this.f17127q;
        return (editText == null || this.f17098R == null || editText.getBackground() != null || this.f17107a0 == 0) ? false : true;
    }

    private com.google.android.material.textfield.f getEndIconDelegate() {
        com.google.android.material.textfield.f fVar = (com.google.android.material.textfield.f) this.f17126p0.get(this.f17124o0);
        return fVar != null ? fVar : (com.google.android.material.textfield.f) this.f17126p0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f17146z0.getVisibility() == 0) {
            return this.f17146z0;
        }
        if (I() && K()) {
            return this.f17128q0;
        }
        return null;
    }

    private void h0() {
        if (this.f17074F == null || !this.f17072E || TextUtils.isEmpty(this.f17070D)) {
            return;
        }
        this.f17074F.setText(this.f17070D);
        AbstractC1683n.a(this.f17119m, this.f17080I);
        this.f17074F.setVisibility(0);
        this.f17074F.bringToFront();
        announceForAccessibility(this.f17070D);
    }

    private void i() {
        TextView textView = this.f17074F;
        if (textView != null) {
            this.f17119m.addView(textView);
            this.f17074F.setVisibility(0);
        }
    }

    private void i0(boolean z6) {
        if (!z6 || getEndIconDrawable() == null) {
            com.google.android.material.textfield.g.a(this, this.f17128q0, this.f17132s0, this.f17134t0);
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.a.l(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.h(drawableMutate, this.f17139w.p());
        this.f17128q0.setImageDrawable(drawableMutate);
    }

    private void j() {
        EditText editText;
        int iG;
        int dimensionPixelSize;
        int iF;
        Resources resources;
        int i7;
        if (this.f17127q == null || this.f17107a0 != 1) {
            return;
        }
        if (K3.c.h(getContext())) {
            editText = this.f17127q;
            iG = H.G(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(A3.c.f162n);
            iF = H.F(this.f17127q);
            resources = getResources();
            i7 = A3.c.f161m;
        } else {
            if (!K3.c.g(getContext())) {
                return;
            }
            editText = this.f17127q;
            iG = H.G(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(A3.c.f160l);
            iF = H.F(this.f17127q);
            resources = getResources();
            i7 = A3.c.f159k;
        }
        H.D0(editText, iG, dimensionPixelSize, iF, resources.getDimensionPixelSize(i7));
    }

    private void j0() {
        Resources resources;
        int i7;
        if (this.f17107a0 == 1) {
            if (K3.c.h(getContext())) {
                resources = getResources();
                i7 = A3.c.f164p;
            } else {
                if (!K3.c.g(getContext())) {
                    return;
                }
                resources = getResources();
                i7 = A3.c.f163o;
            }
            this.f17108b0 = resources.getDimensionPixelSize(i7);
        }
    }

    private void k0(Rect rect) {
        N3.g gVar = this.f17100S;
        if (gVar != null) {
            int i7 = rect.bottom;
            gVar.setBounds(rect.left, i7 - this.f17110d0, rect.right, i7);
        }
        N3.g gVar2 = this.f17102T;
        if (gVar2 != null) {
            int i8 = rect.bottom;
            gVar2.setBounds(rect.left, i8 - this.f17111e0, rect.right, i8);
        }
    }

    private void l() {
        N3.g gVar = this.f17098R;
        if (gVar == null) {
            return;
        }
        N3.k kVarC = gVar.C();
        N3.k kVar = this.f17104U;
        if (kVarC != kVar) {
            this.f17098R.setShapeAppearanceModel(kVar);
            p0();
        }
        if (v()) {
            this.f17098R.Z(this.f17109c0, this.f17112f0);
        }
        int iP = p();
        this.f17113g0 = iP;
        this.f17098R.V(ColorStateList.valueOf(iP));
        if (this.f17124o0 == 3) {
            this.f17127q.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void l0() {
        if (this.f17064A != null) {
            EditText editText = this.f17127q;
            m0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void m() {
        if (this.f17100S == null || this.f17102T == null) {
            return;
        }
        if (w()) {
            this.f17100S.V(ColorStateList.valueOf(this.f17127q.isFocused() ? this.f17073E0 : this.f17112f0));
            this.f17102T.V(ColorStateList.valueOf(this.f17112f0));
        }
        invalidate();
    }

    private void n(RectF rectF) {
        float f7 = rectF.left;
        int i7 = this.f17106W;
        rectF.left = f7 - i7;
        rectF.right += i7;
    }

    private static void n0(Context context, TextView textView, int i7, int i8, boolean z6) {
        textView.setContentDescription(context.getString(z6 ? A3.h.f243c : A3.h.f242b, Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    private void o() {
        int i7 = this.f17107a0;
        if (i7 == 0) {
            this.f17098R = null;
        } else if (i7 == 1) {
            this.f17098R = new N3.g(this.f17104U);
            this.f17100S = new N3.g();
            this.f17102T = new N3.g();
            return;
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException(this.f17107a0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f17098R = (!this.f17092O || (this.f17098R instanceof com.google.android.material.textfield.d)) ? new N3.g(this.f17104U) : new com.google.android.material.textfield.d(this.f17104U);
        }
        this.f17100S = null;
        this.f17102T = null;
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f17064A;
        if (textView != null) {
            d0(textView, this.f17145z ? this.f17066B : this.f17068C);
            if (!this.f17145z && (colorStateList2 = this.f17084K) != null) {
                this.f17064A.setTextColor(colorStateList2);
            }
            if (!this.f17145z || (colorStateList = this.f17086L) == null) {
                return;
            }
            this.f17064A.setTextColor(colorStateList);
        }
    }

    private int p() {
        return this.f17107a0 == 1 ? E3.a.g(E3.a.e(this, A3.a.f112l, 0), this.f17113g0) : this.f17113g0;
    }

    private void p0() {
        if (this.f17124o0 == 3 && this.f17107a0 == 2) {
            ((com.google.android.material.textfield.e) this.f17126p0.get(3)).O((AutoCompleteTextView) this.f17127q);
        }
    }

    private Rect q(Rect rect) {
        int paddingTop;
        int iH;
        if (this.f17127q == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f17115i0;
        boolean zE = com.google.android.material.internal.n.e(this);
        rect2.bottom = rect.bottom;
        int i7 = this.f17107a0;
        if (i7 == 1) {
            rect2.left = G(rect.left, zE);
            paddingTop = rect.top + this.f17108b0;
        } else {
            if (i7 == 2) {
                rect2.left = rect.left + this.f17127q.getPaddingLeft();
                rect2.top = rect.top - u();
                iH = rect.right - this.f17127q.getPaddingRight();
                rect2.right = iH;
                return rect2;
            }
            rect2.left = G(rect.left, zE);
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        iH = H(rect.right, zE);
        rect2.right = iH;
        return rect2;
    }

    private int r(Rect rect, Rect rect2, float f7) {
        return P() ? (int) (rect2.top + f7) : rect.bottom - this.f17127q.getCompoundPaddingBottom();
    }

    private int s(Rect rect, float f7) {
        return P() ? (int) (rect.centerY() - (f7 / 2.0f)) : rect.top + this.f17127q.getCompoundPaddingTop();
    }

    private boolean s0() {
        int iMax;
        if (this.f17127q == null || this.f17127q.getMeasuredHeight() >= (iMax = Math.max(this.f17123o.getMeasuredHeight(), this.f17121n.getMeasuredHeight()))) {
            return false;
        }
        this.f17127q.setMinimumHeight(iMax);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f17127q != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f17124o0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f17127q = editText;
        int i7 = this.f17131s;
        if (i7 != -1) {
            setMinEms(i7);
        } else {
            setMinWidth(this.f17135u);
        }
        int i8 = this.f17133t;
        if (i8 != -1) {
            setMaxEms(i8);
        } else {
            setMaxWidth(this.f17137v);
        }
        Q();
        setTextInputAccessibilityDelegate(new e(this));
        this.f17093O0.j0(this.f17127q.getTypeface());
        this.f17093O0.b0(this.f17127q.getTextSize());
        this.f17093O0.X(this.f17127q.getLetterSpacing());
        int gravity = this.f17127q.getGravity();
        this.f17093O0.S((gravity & (-113)) | 48);
        this.f17093O0.a0(gravity);
        this.f17127q.addTextChangedListener(new a());
        if (this.f17069C0 == null) {
            this.f17069C0 = this.f17127q.getHintTextColors();
        }
        if (this.f17092O) {
            if (TextUtils.isEmpty(this.f17094P)) {
                CharSequence hint = this.f17127q.getHint();
                this.f17129r = hint;
                setHint(hint);
                this.f17127q.setHint((CharSequence) null);
            }
            this.f17096Q = true;
        }
        if (this.f17064A != null) {
            m0(this.f17127q.getText().length());
        }
        r0();
        this.f17139w.f();
        this.f17121n.bringToFront();
        this.f17123o.bringToFront();
        this.f17125p.bringToFront();
        this.f17146z0.bringToFront();
        B();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f17094P)) {
            return;
        }
        this.f17094P = charSequence;
        this.f17093O0.h0(charSequence);
        if (this.f17091N0) {
            return;
        }
        R();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f17072E == z6) {
            return;
        }
        if (z6) {
            i();
        } else {
            X();
            this.f17074F = null;
        }
        this.f17072E = z6;
    }

    private Rect t(Rect rect) {
        if (this.f17127q == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f17115i0;
        float fW = this.f17093O0.w();
        rect2.left = rect.left + this.f17127q.getCompoundPaddingLeft();
        rect2.top = s(rect, fW);
        rect2.right = rect.right - this.f17127q.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, fW);
        return rect2;
    }

    private void t0() {
        this.f17125p.setVisibility((this.f17128q0.getVisibility() != 0 || L()) ? 8 : 0);
        this.f17123o.setVisibility(K() || L() || ((this.f17088M == null || N()) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    private int u() {
        float fQ;
        if (!this.f17092O) {
            return 0;
        }
        int i7 = this.f17107a0;
        if (i7 == 0) {
            fQ = this.f17093O0.q();
        } else {
            if (i7 != 2) {
                return 0;
            }
            fQ = this.f17093O0.q() / 2.0f;
        }
        return (int) fQ;
    }

    private void u0() {
        this.f17146z0.setVisibility(getErrorIconDrawable() != null && this.f17139w.z() && this.f17139w.l() ? 0 : 8);
        t0();
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    private boolean v() {
        return this.f17107a0 == 2 && w();
    }

    private void v0() {
        if (this.f17107a0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17119m.getLayoutParams();
            int iU = u();
            if (iU != layoutParams.topMargin) {
                layoutParams.topMargin = iU;
                this.f17119m.requestLayout();
            }
        }
    }

    private boolean w() {
        return this.f17109c0 > -1 && this.f17112f0 != 0;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.d) this.f17098R).h0();
        }
    }

    private void x0(boolean z6, boolean z7) {
        ColorStateList textColors;
        com.google.android.material.internal.b bVar;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f17127q;
        boolean z8 = false;
        boolean z9 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f17127q;
        if (editText2 != null && editText2.hasFocus()) {
            z8 = true;
        }
        boolean zL = this.f17139w.l();
        ColorStateList colorStateList = this.f17069C0;
        if (colorStateList != null) {
            this.f17093O0.R(colorStateList);
            this.f17093O0.Z(this.f17069C0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList2 = this.f17069C0;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.f17089M0) : this.f17089M0;
            this.f17093O0.R(ColorStateList.valueOf(colorForState));
            this.f17093O0.Z(ColorStateList.valueOf(colorForState));
        } else if (zL) {
            this.f17093O0.R(this.f17139w.q());
        } else {
            if (this.f17145z && (textView = this.f17064A) != null) {
                bVar = this.f17093O0;
                textColors = textView.getTextColors();
            } else if (z8 && (textColors = this.f17071D0) != null) {
                bVar = this.f17093O0;
            }
            bVar.R(textColors);
        }
        if (z9 || !this.f17095P0 || (isEnabled() && z8)) {
            if (z7 || this.f17091N0) {
                y(z6);
                return;
            }
            return;
        }
        if (z7 || !this.f17091N0) {
            F(z6);
        }
    }

    private void y(boolean z6) {
        ValueAnimator valueAnimator = this.f17099R0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17099R0.cancel();
        }
        if (z6 && this.f17097Q0) {
            k(1.0f);
        } else {
            this.f17093O0.d0(1.0f);
        }
        this.f17091N0 = false;
        if (A()) {
            R();
        }
        z0();
        this.f17121n.i(false);
        D0();
    }

    private void y0() {
        EditText editText;
        if (this.f17074F == null || (editText = this.f17127q) == null) {
            return;
        }
        this.f17074F.setGravity(editText.getGravity());
        this.f17074F.setPadding(this.f17127q.getCompoundPaddingLeft(), this.f17127q.getCompoundPaddingTop(), this.f17127q.getCompoundPaddingRight(), this.f17127q.getCompoundPaddingBottom());
    }

    private C1673d z() {
        C1673d c1673d = new C1673d();
        c1673d.X(87L);
        c1673d.Z(B3.a.f739a);
        return c1673d;
    }

    private void z0() {
        EditText editText = this.f17127q;
        A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void E0() {
        int currentTextColor;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f17098R == null || this.f17107a0 == 0) {
            return;
        }
        boolean z6 = false;
        boolean z7 = isFocused() || ((editText2 = this.f17127q) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f17127q) != null && editText.isHovered())) {
            z6 = true;
        }
        if (isEnabled()) {
            if (this.f17139w.l()) {
                if (this.f17079H0 == null) {
                    currentTextColor = this.f17139w.p();
                }
                B0(z7, z6);
            } else if (!this.f17145z || (textView = this.f17064A) == null) {
                currentTextColor = z7 ? this.f17077G0 : z6 ? this.f17075F0 : this.f17073E0;
            } else {
                if (this.f17079H0 == null) {
                    currentTextColor = textView.getCurrentTextColor();
                }
                B0(z7, z6);
            }
            u0();
            V();
            W();
            U();
            if (getEndIconDelegate().d()) {
                i0(this.f17139w.l());
            }
            if (this.f17107a0 == 2) {
                int i7 = this.f17109c0;
                this.f17109c0 = (z7 && isEnabled()) ? this.f17111e0 : this.f17110d0;
                if (this.f17109c0 != i7) {
                    S();
                }
            }
            if (this.f17107a0 == 1) {
                this.f17113g0 = !isEnabled() ? this.f17083J0 : (!z6 || z7) ? z7 ? this.f17085K0 : this.f17081I0 : this.f17087L0;
            }
            l();
        }
        currentTextColor = this.f17089M0;
        this.f17112f0 = currentTextColor;
        u0();
        V();
        W();
        U();
        if (getEndIconDelegate().d()) {
        }
        if (this.f17107a0 == 2) {
        }
        if (this.f17107a0 == 1) {
        }
        l();
    }

    public boolean K() {
        return this.f17125p.getVisibility() == 0 && this.f17128q0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f17139w.A();
    }

    final boolean N() {
        return this.f17091N0;
    }

    public boolean O() {
        return this.f17096Q;
    }

    public void U() {
        com.google.android.material.textfield.g.c(this, this.f17128q0, this.f17132s0);
    }

    public void V() {
        com.google.android.material.textfield.g.c(this, this.f17146z0, this.f17065A0);
    }

    public void W() {
        this.f17121n.j();
    }

    public void Y(float f7, float f8, float f9, float f10) {
        boolean zE = com.google.android.material.internal.n.e(this);
        this.f17105V = zE;
        float f11 = zE ? f8 : f7;
        if (!zE) {
            f7 = f8;
        }
        float f12 = zE ? f10 : f9;
        if (!zE) {
            f9 = f10;
        }
        N3.g gVar = this.f17098R;
        if (gVar != null && gVar.E() == f11 && this.f17098R.F() == f7 && this.f17098R.s() == f12 && this.f17098R.t() == f9) {
            return;
        }
        this.f17104U = this.f17104U.v().A(f11).E(f7).s(f12).w(f9).m();
        l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f17119m.addView(view, layoutParams2);
        this.f17119m.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void d0(TextView textView, int i7) {
        try {
            androidx.core.widget.i.n(textView, i7);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.i.n(textView, A3.i.f257a);
        textView.setTextColor(androidx.core.content.b.c(getContext(), A3.b.f127a));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i7) {
        EditText editText = this.f17127q;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i7);
            return;
        }
        if (this.f17129r != null) {
            boolean z6 = this.f17096Q;
            this.f17096Q = false;
            CharSequence hint = editText.getHint();
            this.f17127q.setHint(this.f17129r);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i7);
                return;
            } finally {
                this.f17127q.setHint(hint);
                this.f17096Q = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i7);
        onProvideAutofillVirtualStructure(viewStructure, i7);
        viewStructure.setChildCount(this.f17119m.getChildCount());
        for (int i8 = 0; i8 < this.f17119m.getChildCount(); i8++) {
            View childAt = this.f17119m.getChildAt(i8);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i8);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i7);
            if (childAt == this.f17127q) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f17103T0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f17103T0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f17101S0) {
            return;
        }
        this.f17101S0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f17093O0;
        boolean zG0 = bVar != null ? bVar.g0(drawableState) : false;
        if (this.f17127q != null) {
            w0(H.T(this) && isEnabled());
        }
        r0();
        E0();
        if (zG0) {
            invalidate();
        }
        this.f17101S0 = false;
    }

    public void g(f fVar) {
        this.f17122n0.add(fVar);
        if (this.f17127q != null) {
            fVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f17127q;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    N3.g getBoxBackground() {
        int i7 = this.f17107a0;
        if (i7 == 1 || i7 == 2) {
            return this.f17098R;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f17113g0;
    }

    public int getBoxBackgroundMode() {
        return this.f17107a0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f17108b0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (com.google.android.material.internal.n.e(this) ? this.f17104U.j() : this.f17104U.l()).a(this.f17116j0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (com.google.android.material.internal.n.e(this) ? this.f17104U.l() : this.f17104U.j()).a(this.f17116j0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (com.google.android.material.internal.n.e(this) ? this.f17104U.r() : this.f17104U.t()).a(this.f17116j0);
    }

    public float getBoxCornerRadiusTopStart() {
        return (com.google.android.material.internal.n.e(this) ? this.f17104U.t() : this.f17104U.r()).a(this.f17116j0);
    }

    public int getBoxStrokeColor() {
        return this.f17077G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f17079H0;
    }

    public int getBoxStrokeWidth() {
        return this.f17110d0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f17111e0;
    }

    public int getCounterMaxLength() {
        return this.f17143y;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f17141x && this.f17145z && (textView = this.f17064A) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f17084K;
    }

    public ColorStateList getCounterTextColor() {
        return this.f17084K;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f17069C0;
    }

    public EditText getEditText() {
        return this.f17127q;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f17128q0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f17128q0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f17124o0;
    }

    CheckableImageButton getEndIconView() {
        return this.f17128q0;
    }

    public CharSequence getError() {
        if (this.f17139w.z()) {
            return this.f17139w.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f17139w.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f17139w.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f17146z0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f17139w.p();
    }

    public CharSequence getHelperText() {
        if (this.f17139w.A()) {
            return this.f17139w.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f17139w.t();
    }

    public CharSequence getHint() {
        if (this.f17092O) {
            return this.f17094P;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f17093O0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f17093O0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f17071D0;
    }

    public int getMaxEms() {
        return this.f17133t;
    }

    public int getMaxWidth() {
        return this.f17137v;
    }

    public int getMinEms() {
        return this.f17131s;
    }

    public int getMinWidth() {
        return this.f17135u;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f17128q0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f17128q0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f17072E) {
            return this.f17070D;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f17078H;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f17076G;
    }

    public CharSequence getPrefixText() {
        return this.f17121n.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f17121n.b();
    }

    public TextView getPrefixTextView() {
        return this.f17121n.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f17121n.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f17121n.e();
    }

    public CharSequence getSuffixText() {
        return this.f17088M;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f17090N.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f17090N;
    }

    public Typeface getTypeface() {
        return this.f17117k0;
    }

    public void h(g gVar) {
        this.f17130r0.add(gVar);
    }

    void k(float f7) {
        if (this.f17093O0.x() == f7) {
            return;
        }
        if (this.f17099R0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17099R0 = valueAnimator;
            valueAnimator.setInterpolator(B3.a.f740b);
            this.f17099R0.setDuration(167L);
            this.f17099R0.addUpdateListener(new d());
        }
        this.f17099R0.setFloatValues(this.f17093O0.x(), f7);
        this.f17099R0.start();
    }

    void m0(int i7) {
        boolean z6 = this.f17145z;
        int i8 = this.f17143y;
        if (i8 == -1) {
            this.f17064A.setText(String.valueOf(i7));
            this.f17064A.setContentDescription(null);
            this.f17145z = false;
        } else {
            this.f17145z = i7 > i8;
            n0(getContext(), this.f17064A, i7, this.f17143y, this.f17145z);
            if (z6 != this.f17145z) {
                o0();
            }
            this.f17064A.setText(androidx.core.text.a.c().j(getContext().getString(A3.h.f244d, Integer.valueOf(i7), Integer.valueOf(this.f17143y))));
        }
        if (this.f17127q == null || z6 == this.f17145z) {
            return;
        }
        w0(false);
        E0();
        r0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17093O0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        EditText editText = this.f17127q;
        if (editText != null) {
            Rect rect = this.f17114h0;
            com.google.android.material.internal.c.a(this, editText, rect);
            k0(rect);
            if (this.f17092O) {
                this.f17093O0.b0(this.f17127q.getTextSize());
                int gravity = this.f17127q.getGravity();
                this.f17093O0.S((gravity & (-113)) | 48);
                this.f17093O0.a0(gravity);
                this.f17093O0.O(q(rect));
                this.f17093O0.W(t(rect));
                this.f17093O0.K();
                if (!A() || this.f17091N0) {
                    return;
                }
                R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        boolean zS0 = s0();
        boolean zQ0 = q0();
        if (zS0 || zQ0) {
            this.f17127q.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f17152o);
        if (hVar.f17153p) {
            this.f17128q0.post(new b());
        }
        setHint(hVar.f17154q);
        setHelperText(hVar.f17155r);
        setPlaceholderText(hVar.f17156s);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        boolean z6 = false;
        boolean z7 = i7 == 1;
        boolean z8 = this.f17105V;
        if (z7 != z8) {
            if (z7 && !z8) {
                z6 = true;
            }
            float fA = this.f17104U.r().a(this.f17116j0);
            float fA2 = this.f17104U.t().a(this.f17116j0);
            float fA3 = this.f17104U.j().a(this.f17116j0);
            float fA4 = this.f17104U.l().a(this.f17116j0);
            float f7 = z6 ? fA : fA2;
            if (z6) {
                fA = fA2;
            }
            float f8 = z6 ? fA3 : fA4;
            if (z6) {
                fA3 = fA4;
            }
            Y(f7, fA, f8, fA3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f17139w.l()) {
            hVar.f17152o = getError();
        }
        hVar.f17153p = I() && this.f17128q0.isChecked();
        hVar.f17154q = getHint();
        hVar.f17155r = getHelperText();
        hVar.f17156s = getPlaceholderText();
        return hVar;
    }

    boolean q0() {
        boolean z6;
        Drawable drawable;
        EditText editText;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        if (this.f17127q == null) {
            return false;
        }
        boolean z7 = true;
        if (f0()) {
            int measuredWidth = this.f17121n.getMeasuredWidth() - this.f17127q.getPaddingLeft();
            if (this.f17118l0 == null || this.f17120m0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f17118l0 = colorDrawable;
                this.f17120m0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.i.a(this.f17127q);
            Drawable drawable5 = drawableArrA[0];
            Drawable drawable6 = this.f17118l0;
            if (drawable5 != drawable6) {
                androidx.core.widget.i.i(this.f17127q, drawable6, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z6 = true;
            }
            z6 = false;
        } else {
            if (this.f17118l0 != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.i.a(this.f17127q);
                androidx.core.widget.i.i(this.f17127q, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f17118l0 = null;
                z6 = true;
            }
            z6 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f17090N.getMeasuredWidth() - this.f17127q.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + r.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.i.a(this.f17127q);
            Drawable drawable7 = this.f17136u0;
            if (drawable7 == null || this.f17138v0 == measuredWidth2) {
                if (drawable7 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f17136u0 = colorDrawable2;
                    this.f17138v0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable8 = drawableArrA3[2];
                drawable = this.f17136u0;
                if (drawable8 != drawable) {
                    this.f17140w0 = drawable8;
                    editText = this.f17127q;
                    drawable2 = drawableArrA3[0];
                    drawable3 = drawableArrA3[1];
                    drawable4 = drawableArrA3[3];
                } else {
                    z7 = z6;
                }
            } else {
                this.f17138v0 = measuredWidth2;
                drawable7.setBounds(0, 0, measuredWidth2, 1);
                editText = this.f17127q;
                drawable2 = drawableArrA3[0];
                drawable3 = drawableArrA3[1];
                drawable = this.f17136u0;
                drawable4 = drawableArrA3[3];
            }
            androidx.core.widget.i.i(editText, drawable2, drawable3, drawable, drawable4);
        } else {
            if (this.f17136u0 == null) {
                return z6;
            }
            Drawable[] drawableArrA4 = androidx.core.widget.i.a(this.f17127q);
            if (drawableArrA4[2] == this.f17136u0) {
                androidx.core.widget.i.i(this.f17127q, drawableArrA4[0], drawableArrA4[1], this.f17140w0, drawableArrA4[3]);
            } else {
                z7 = z6;
            }
            this.f17136u0 = null;
        }
        return z7;
    }

    void r0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f17127q;
        if (editText == null || this.f17107a0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (O.a(background)) {
            background = background.mutate();
        }
        if (this.f17139w.l()) {
            currentTextColor = this.f17139w.p();
        } else {
            if (!this.f17145z || (textView = this.f17064A) == null) {
                androidx.core.graphics.drawable.a.a(background);
                this.f17127q.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C0534k.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void setBoxBackgroundColor(int i7) {
        if (this.f17113g0 != i7) {
            this.f17113g0 = i7;
            this.f17081I0 = i7;
            this.f17085K0 = i7;
            this.f17087L0 = i7;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i7) {
        setBoxBackgroundColor(androidx.core.content.b.c(getContext(), i7));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f17081I0 = defaultColor;
        this.f17113g0 = defaultColor;
        this.f17083J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f17085K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f17087L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i7) {
        if (i7 == this.f17107a0) {
            return;
        }
        this.f17107a0 = i7;
        if (this.f17127q != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i7) {
        this.f17108b0 = i7;
    }

    public void setBoxStrokeColor(int i7) {
        if (this.f17077G0 != i7) {
            this.f17077G0 = i7;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f17077G0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E0();
        } else {
            this.f17073E0 = colorStateList.getDefaultColor();
            this.f17089M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f17075F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f17077G0 = defaultColor;
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f17079H0 != colorStateList) {
            this.f17079H0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i7) {
        this.f17110d0 = i7;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i7) {
        this.f17111e0 = i7;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i7) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i7));
    }

    public void setBoxStrokeWidthResource(int i7) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.f17141x != z6) {
            if (z6) {
                D d7 = new D(getContext());
                this.f17064A = d7;
                d7.setId(A3.e.f189H);
                Typeface typeface = this.f17117k0;
                if (typeface != null) {
                    this.f17064A.setTypeface(typeface);
                }
                this.f17064A.setMaxLines(1);
                this.f17139w.e(this.f17064A, 2);
                r.d((ViewGroup.MarginLayoutParams) this.f17064A.getLayoutParams(), getResources().getDimensionPixelOffset(A3.c.f148P));
                o0();
                l0();
            } else {
                this.f17139w.B(this.f17064A, 2);
                this.f17064A = null;
            }
            this.f17141x = z6;
        }
    }

    public void setCounterMaxLength(int i7) {
        if (this.f17143y != i7) {
            if (i7 <= 0) {
                i7 = -1;
            }
            this.f17143y = i7;
            if (this.f17141x) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i7) {
        if (this.f17066B != i7) {
            this.f17066B = i7;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f17086L != colorStateList) {
            this.f17086L = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i7) {
        if (this.f17068C != i7) {
            this.f17068C = i7;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f17084K != colorStateList) {
            this.f17084K = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f17069C0 = colorStateList;
        this.f17071D0 = colorStateList;
        if (this.f17127q != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        T(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f17128q0.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f17128q0.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i7) {
        setEndIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setEndIconDrawable(int i7) {
        setEndIconDrawable(i7 != 0 ? AbstractC1641a.b(getContext(), i7) : null);
    }

    public void setEndIconMode(int i7) {
        int i8 = this.f17124o0;
        if (i8 == i7) {
            return;
        }
        this.f17124o0 = i7;
        C(i8);
        setEndIconVisible(i7 != 0);
        if (getEndIconDelegate().b(this.f17107a0)) {
            getEndIconDelegate().a();
            com.google.android.material.textfield.g.a(this, this.f17128q0, this.f17132s0, this.f17134t0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f17107a0 + " is not supported by the end icon mode " + i7);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f17128q0, onClickListener, this.f17142x0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17142x0 = onLongClickListener;
        c0(this.f17128q0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f17132s0 != colorStateList) {
            this.f17132s0 = colorStateList;
            com.google.android.material.textfield.g.a(this, this.f17128q0, colorStateList, this.f17134t0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f17134t0 != mode) {
            this.f17134t0 = mode;
            com.google.android.material.textfield.g.a(this, this.f17128q0, this.f17132s0, mode);
        }
    }

    public void setEndIconVisible(boolean z6) {
        if (K() != z6) {
            this.f17128q0.setVisibility(z6 ? 0 : 8);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f17139w.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f17139w.v();
        } else {
            this.f17139w.O(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f17139w.D(charSequence);
    }

    public void setErrorEnabled(boolean z6) {
        this.f17139w.E(z6);
    }

    public void setErrorIconDrawable(int i7) {
        setErrorIconDrawable(i7 != 0 ? AbstractC1641a.b(getContext(), i7) : null);
        V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f17146z0, onClickListener, this.f17144y0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17144y0 = onLongClickListener;
        c0(this.f17146z0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f17065A0 != colorStateList) {
            this.f17065A0 = colorStateList;
            com.google.android.material.textfield.g.a(this, this.f17146z0, colorStateList, this.f17067B0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f17067B0 != mode) {
            this.f17067B0 = mode;
            com.google.android.material.textfield.g.a(this, this.f17146z0, this.f17065A0, mode);
        }
    }

    public void setErrorTextAppearance(int i7) {
        this.f17139w.F(i7);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f17139w.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.f17095P0 != z6) {
            this.f17095P0 = z6;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f17139w.P(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f17139w.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        this.f17139w.I(z6);
    }

    public void setHelperTextTextAppearance(int i7) {
        this.f17139w.H(i7);
    }

    public void setHint(int i7) {
        setHint(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.f17097Q0 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f17092O) {
            this.f17092O = z6;
            if (z6) {
                CharSequence hint = this.f17127q.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f17094P)) {
                        setHint(hint);
                    }
                    this.f17127q.setHint((CharSequence) null);
                }
                this.f17096Q = true;
            } else {
                this.f17096Q = false;
                if (!TextUtils.isEmpty(this.f17094P) && TextUtils.isEmpty(this.f17127q.getHint())) {
                    this.f17127q.setHint(this.f17094P);
                }
                setHintInternal(null);
            }
            if (this.f17127q != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i7) {
        this.f17093O0.P(i7);
        this.f17071D0 = this.f17093O0.p();
        if (this.f17127q != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f17071D0 != colorStateList) {
            if (this.f17069C0 == null) {
                this.f17093O0.R(colorStateList);
            }
            this.f17071D0 = colorStateList;
            if (this.f17127q != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i7) {
        this.f17133t = i7;
        EditText editText = this.f17127q;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxEms(i7);
    }

    public void setMaxWidth(int i7) {
        this.f17137v = i7;
        EditText editText = this.f17127q;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxWidth(i7);
    }

    public void setMaxWidthResource(int i7) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    public void setMinEms(int i7) {
        this.f17131s = i7;
        EditText editText = this.f17127q;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinEms(i7);
    }

    public void setMinWidth(int i7) {
        this.f17135u = i7;
        EditText editText = this.f17127q;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinWidth(i7);
    }

    public void setMinWidthResource(int i7) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i7) {
        setPasswordVisibilityToggleContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i7) {
        setPasswordVisibilityToggleDrawable(i7 != 0 ? AbstractC1641a.b(getContext(), i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        if (z6 && this.f17124o0 != 1) {
            setEndIconMode(1);
        } else {
            if (z6) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f17132s0 = colorStateList;
        com.google.android.material.textfield.g.a(this, this.f17128q0, colorStateList, this.f17134t0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f17134t0 = mode;
        com.google.android.material.textfield.g.a(this, this.f17128q0, this.f17132s0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f17074F == null) {
            D d7 = new D(getContext());
            this.f17074F = d7;
            d7.setId(A3.e.f192K);
            H.z0(this.f17074F, 2);
            C1673d c1673dZ = z();
            this.f17080I = c1673dZ;
            c1673dZ.d0(67L);
            this.f17082J = z();
            setPlaceholderTextAppearance(this.f17078H);
            setPlaceholderTextColor(this.f17076G);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f17072E) {
                setPlaceholderTextEnabled(true);
            }
            this.f17070D = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i7) {
        this.f17078H = i7;
        TextView textView = this.f17074F;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i7);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f17076G != colorStateList) {
            this.f17076G = colorStateList;
            TextView textView = this.f17074F;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f17121n.k(charSequence);
    }

    public void setPrefixTextAppearance(int i7) {
        this.f17121n.l(i7);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f17121n.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z6) {
        this.f17121n.n(z6);
    }

    public void setStartIconContentDescription(int i7) {
        setStartIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setStartIconDrawable(int i7) {
        setStartIconDrawable(i7 != 0 ? AbstractC1641a.b(getContext(), i7) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f17121n.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17121n.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f17121n.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f17121n.t(mode);
    }

    public void setStartIconVisible(boolean z6) {
        this.f17121n.u(z6);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f17088M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f17090N.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i7) {
        androidx.core.widget.i.n(this.f17090N, i7);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f17090N.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f17127q;
        if (editText != null) {
            H.p0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f17117k0) {
            this.f17117k0 = typeface;
            this.f17093O0.j0(typeface);
            this.f17139w.L(typeface);
            TextView textView = this.f17064A;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z6) {
        x0(z6, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i7) {
        int i8;
        int colorForState;
        ?? r42;
        int i9 = f17063U0;
        super(O3.a.c(context, attributeSet, i7, i9), attributeSet, i7);
        this.f17131s = -1;
        this.f17133t = -1;
        this.f17135u = -1;
        this.f17137v = -1;
        this.f17139w = new com.google.android.material.textfield.h(this);
        this.f17114h0 = new Rect();
        this.f17115i0 = new Rect();
        this.f17116j0 = new RectF();
        this.f17122n0 = new LinkedHashSet();
        this.f17124o0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f17126p0 = sparseArray;
        this.f17130r0 = new LinkedHashSet();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f17093O0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f17119m = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f17125p = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f17123o = linearLayout;
        D d7 = new D(context2);
        this.f17090N = d7;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        d7.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(A3.g.f224b, (ViewGroup) linearLayout, false);
        this.f17146z0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(A3.g.f224b, (ViewGroup) frameLayout2, false);
        this.f17128q0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = B3.a.f739a;
        bVar.i0(timeInterpolator);
        bVar.f0(timeInterpolator);
        bVar.S(8388659);
        h0 h0VarI = com.google.android.material.internal.l.i(context2, attributeSet, A3.j.f454Z4, i7, i9, A3.j.f630w5, A3.j.f616u5, A3.j.f343J5, A3.j.f378O5, A3.j.f406S5);
        l lVar = new l(this, h0VarI);
        this.f17121n = lVar;
        this.f17092O = h0VarI.a(A3.j.f399R5, true);
        setHint(h0VarI.p(A3.j.f494e5));
        this.f17097Q0 = h0VarI.a(A3.j.f392Q5, true);
        this.f17095P0 = h0VarI.a(A3.j.f357L5, true);
        if (h0VarI.s(A3.j.f510g5)) {
            i8 = -1;
            setMinEms(h0VarI.k(A3.j.f510g5, -1));
        } else {
            i8 = -1;
            if (h0VarI.s(A3.j.f486d5)) {
                setMinWidth(h0VarI.f(A3.j.f486d5, -1));
            }
        }
        if (h0VarI.s(A3.j.f502f5)) {
            setMaxEms(h0VarI.k(A3.j.f502f5, i8));
        } else if (h0VarI.s(A3.j.f478c5)) {
            setMaxWidth(h0VarI.f(A3.j.f478c5, i8));
        }
        this.f17104U = N3.k.e(context2, attributeSet, i7, i9).m();
        this.f17106W = context2.getResources().getDimensionPixelOffset(A3.c.f145M);
        this.f17108b0 = h0VarI.e(A3.j.f534j5, 0);
        this.f17110d0 = h0VarI.f(A3.j.f588q5, context2.getResources().getDimensionPixelSize(A3.c.f146N));
        this.f17111e0 = h0VarI.f(A3.j.f595r5, context2.getResources().getDimensionPixelSize(A3.c.f147O));
        this.f17109c0 = this.f17110d0;
        float fD = h0VarI.d(A3.j.f566n5, -1.0f);
        float fD2 = h0VarI.d(A3.j.f558m5, -1.0f);
        float fD3 = h0VarI.d(A3.j.f542k5, -1.0f);
        float fD4 = h0VarI.d(A3.j.f550l5, -1.0f);
        k.b bVarV = this.f17104U.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.f17104U = bVarV.m();
        ColorStateList colorStateListB = K3.c.b(context2, h0VarI, A3.j.f518h5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f17081I0 = defaultColor;
            this.f17113g0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f17083J0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f17085K0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f17085K0 = this.f17081I0;
                ColorStateList colorStateListA = AbstractC1641a.a(context2, A3.b.f129c);
                this.f17083J0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            colorForState = 0;
            this.f17113g0 = 0;
            this.f17081I0 = 0;
            this.f17083J0 = 0;
            this.f17085K0 = 0;
        }
        this.f17087L0 = colorForState;
        if (h0VarI.s(A3.j.f470b5)) {
            ColorStateList colorStateListC = h0VarI.c(A3.j.f470b5);
            this.f17071D0 = colorStateListC;
            this.f17069C0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = K3.c.b(context2, h0VarI, A3.j.f574o5);
        this.f17077G0 = h0VarI.b(A3.j.f574o5, 0);
        this.f17073E0 = androidx.core.content.b.c(context2, A3.b.f130d);
        this.f17089M0 = androidx.core.content.b.c(context2, A3.b.f131e);
        this.f17075F0 = androidx.core.content.b.c(context2, A3.b.f132f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (h0VarI.s(A3.j.f581p5)) {
            setBoxStrokeErrorColor(K3.c.b(context2, h0VarI, A3.j.f581p5));
        }
        if (h0VarI.n(A3.j.f406S5, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(h0VarI.n(A3.j.f406S5, 0));
        } else {
            r42 = 0;
        }
        int iN = h0VarI.n(A3.j.f343J5, r42);
        CharSequence charSequenceP = h0VarI.p(A3.j.f308E5);
        boolean zA = h0VarI.a(A3.j.f315F5, r42);
        checkableImageButton.setId(A3.e.f188G);
        if (K3.c.g(context2)) {
            r.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r42);
        }
        if (h0VarI.s(A3.j.f329H5)) {
            this.f17065A0 = K3.c.b(context2, h0VarI, A3.j.f329H5);
        }
        if (h0VarI.s(A3.j.f336I5)) {
            this.f17067B0 = com.google.android.material.internal.n.f(h0VarI.k(A3.j.f336I5, -1), null);
        }
        if (h0VarI.s(A3.j.f322G5)) {
            setErrorIconDrawable(h0VarI.g(A3.j.f322G5));
        }
        checkableImageButton.setContentDescription(getResources().getText(A3.h.f246f));
        H.z0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN2 = h0VarI.n(A3.j.f378O5, 0);
        boolean zA2 = h0VarI.a(A3.j.f371N5, false);
        CharSequence charSequenceP2 = h0VarI.p(A3.j.f364M5);
        int iN3 = h0VarI.n(A3.j.f463a6, 0);
        CharSequence charSequenceP3 = h0VarI.p(A3.j.f455Z5);
        int iN4 = h0VarI.n(A3.j.f551l6, 0);
        CharSequence charSequenceP4 = h0VarI.p(A3.j.f543k6);
        boolean zA3 = h0VarI.a(A3.j.f602s5, false);
        setCounterMaxLength(h0VarI.k(A3.j.f609t5, -1));
        this.f17068C = h0VarI.n(A3.j.f630w5, 0);
        this.f17066B = h0VarI.n(A3.j.f616u5, 0);
        setBoxBackgroundMode(h0VarI.k(A3.j.f526i5, 0));
        if (K3.c.g(context2)) {
            r.d((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iN5 = h0VarI.n(A3.j.f280A5, 0);
        sparseArray.append(-1, new com.google.android.material.textfield.b(this, iN5));
        sparseArray.append(0, new j(this));
        sparseArray.append(1, new k(this, iN5 == 0 ? h0VarI.n(A3.j.f427V5, 0) : iN5));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, iN5));
        sparseArray.append(3, new com.google.android.material.textfield.e(this, iN5));
        if (!h0VarI.s(A3.j.f434W5)) {
            if (h0VarI.s(A3.j.f294C5)) {
                this.f17132s0 = K3.c.b(context2, h0VarI, A3.j.f294C5);
            }
            if (h0VarI.s(A3.j.f301D5)) {
                this.f17134t0 = com.google.android.material.internal.n.f(h0VarI.k(A3.j.f301D5, -1), null);
            }
        }
        if (h0VarI.s(A3.j.f287B5)) {
            setEndIconMode(h0VarI.k(A3.j.f287B5, 0));
            if (h0VarI.s(A3.j.f651z5)) {
                setEndIconContentDescription(h0VarI.p(A3.j.f651z5));
            }
            setEndIconCheckable(h0VarI.a(A3.j.f644y5, true));
        } else if (h0VarI.s(A3.j.f434W5)) {
            if (h0VarI.s(A3.j.f441X5)) {
                this.f17132s0 = K3.c.b(context2, h0VarI, A3.j.f441X5);
            }
            if (h0VarI.s(A3.j.f448Y5)) {
                this.f17134t0 = com.google.android.material.internal.n.f(h0VarI.k(A3.j.f448Y5, -1), null);
            }
            setEndIconMode(h0VarI.a(A3.j.f434W5, false) ? 1 : 0);
            setEndIconContentDescription(h0VarI.p(A3.j.f420U5));
        }
        d7.setId(A3.e.f194M);
        d7.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        H.r0(d7, 1);
        setErrorContentDescription(charSequenceP);
        setCounterOverflowTextAppearance(this.f17066B);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f17068C);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        setSuffixTextAppearance(iN4);
        if (h0VarI.s(A3.j.f350K5)) {
            setErrorTextColor(h0VarI.c(A3.j.f350K5));
        }
        if (h0VarI.s(A3.j.f385P5)) {
            setHelperTextColor(h0VarI.c(A3.j.f385P5));
        }
        if (h0VarI.s(A3.j.f413T5)) {
            setHintTextColor(h0VarI.c(A3.j.f413T5));
        }
        if (h0VarI.s(A3.j.f637x5)) {
            setCounterTextColor(h0VarI.c(A3.j.f637x5));
        }
        if (h0VarI.s(A3.j.f623v5)) {
            setCounterOverflowTextColor(h0VarI.c(A3.j.f623v5));
        }
        if (h0VarI.s(A3.j.f471b6)) {
            setPlaceholderTextColor(h0VarI.c(A3.j.f471b6));
        }
        if (h0VarI.s(A3.j.f559m6)) {
            setSuffixTextColor(h0VarI.c(A3.j.f559m6));
        }
        setEnabled(h0VarI.a(A3.j.f462a5, true));
        h0VarI.w();
        H.z0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            H.A0(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(d7);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(lVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
        setSuffixText(charSequenceP4);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f17128q0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f17128q0.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.g.a(this, this.f17128q0, this.f17132s0, this.f17134t0);
            U();
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f17146z0.setImageDrawable(drawable);
        u0();
        com.google.android.material.textfield.g.a(this, this.f17146z0, this.f17065A0, this.f17067B0);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f17092O) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f17128q0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f17128q0.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f17121n.o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f17121n.p(drawable);
    }
}
