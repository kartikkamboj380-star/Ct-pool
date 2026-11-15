package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.n;
import f.AbstractC1641a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class D extends TextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0528e f5689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f5690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final B f5691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C0537n f5692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f5694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Future f5695s;

    private interface a {
        void a(int[] iArr, int i7);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i7);

        void g(int i7, int i8, int i9, int i10);

        int h();

        int i();

        void j(int i7);

        int k();

        void l(int i7);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.D.a
        public void a(int[] iArr, int i7) {
            D.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        @Override // androidx.appcompat.widget.D.a
        public int[] b() {
            return D.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.D.a
        public TextClassifier c() {
            return D.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.D.a
        public int d() {
            return D.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void e(TextClassifier textClassifier) {
            D.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.D.a
        public void f(int i7) {
        }

        @Override // androidx.appcompat.widget.D.a
        public void g(int i7, int i8, int i9, int i10) {
            D.super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        @Override // androidx.appcompat.widget.D.a
        public int h() {
            return D.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.D.a
        public int i() {
            return D.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void j(int i7) {
        }

        @Override // androidx.appcompat.widget.D.a
        public int k() {
            return D.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.D.a
        public void l(int i7) {
            D.super.setAutoSizeTextTypeWithDefaults(i7);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void f(int i7) {
            D.super.setLastBaselineToBottomHeight(i7);
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void j(int i7) {
            D.super.setFirstBaselineToTopHeight(i7);
        }
    }

    public D(Context context) {
        this(context, null);
    }

    private C0537n getEmojiTextViewHelper() {
        if (this.f5692p == null) {
            this.f5692p = new C0537n(this);
        }
        return this.f5692p;
    }

    private void q() {
        Future future = this.f5695s;
        if (future != null) {
            try {
                this.f5695s = null;
                androidx.appcompat.app.y.a(future.get());
                androidx.core.widget.i.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0528e c0528e = this.f5689m;
        if (c0528e != null) {
            c0528e.b();
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (r0.f6214b) {
            return getSuperCaller().d();
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            return c7.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (r0.f6214b) {
            return getSuperCaller().i();
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            return c7.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (r0.f6214b) {
            return getSuperCaller().k();
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            return c7.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (r0.f6214b) {
            return getSuperCaller().b();
        }
        C c7 = this.f5690n;
        return c7 != null ? c7.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (r0.f6214b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            return c7.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.c(this);
    }

    a getSuperCaller() {
        a bVar;
        if (this.f5694r == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                bVar = new c();
            } else if (i7 >= 26) {
                bVar = new b();
            }
            this.f5694r = bVar;
        }
        return this.f5694r;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f5689m;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f5689m;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5690n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5690n.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b7;
        return (Build.VERSION.SDK_INT >= 28 || (b7 = this.f5691o) == null) ? getSuperCaller().c() : b7.a();
    }

    public n.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5690n.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC0538o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.o(z6, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        q();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C c7 = this.f5690n;
        if (c7 == null || r0.f6214b || !c7.l()) {
            return;
        }
        this.f5690n.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (r0.f6214b) {
            getSuperCaller().g(i7, i8, i9, i10);
            return;
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.t(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (r0.f6214b) {
            getSuperCaller().a(iArr, i7);
            return;
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.u(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (r0.f6214b) {
            getSuperCaller().l(i7);
            return;
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.v(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f5689m;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f5689m;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? AbstractC1641a.b(context, i7) : null, i8 != 0 ? AbstractC1641a.b(context, i8) : null, i9 != 0 ? AbstractC1641a.b(context, i9) : null, i10 != 0 ? AbstractC1641a.b(context, i10) : null);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? AbstractC1641a.b(context, i7) : null, i8 != 0 ? AbstractC1641a.b(context, i8) : null, i9 != 0 ? AbstractC1641a.b(context, i9) : null, i10 != 0 ? AbstractC1641a.b(context, i10) : null);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i7);
        } else {
            androidx.core.widget.i.j(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i7);
        } else {
            androidx.core.widget.i.k(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        androidx.core.widget.i.l(this, i7);
    }

    public void setPrecomputedText(androidx.core.text.n nVar) {
        androidx.core.widget.i.m(this, nVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f5689m;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f5689m;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5690n.w(colorStateList);
        this.f5690n.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5690n.x(mode);
        this.f5690n.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b7;
        if (Build.VERSION.SDK_INT >= 28 || (b7 = this.f5691o) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            b7.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.n> future) {
        this.f5695s = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(n.a aVar) {
        androidx.core.widget.i.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f7) {
        if (r0.f6214b) {
            super.setTextSize(i7, f7);
            return;
        }
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.A(i7, f7);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i7) {
        if (this.f5693q) {
            return;
        }
        Typeface typefaceA = (typeface == null || i7 <= 0) ? null : androidx.core.graphics.d.a(getContext(), typeface, i7);
        this.f5693q = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f5693q = false;
        }
    }

    public D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f5690n;
        if (c7 != null) {
            c7.p();
        }
    }

    public D(Context context, AttributeSet attributeSet, int i7) {
        super(e0.b(context), attributeSet, i7);
        this.f5693q = false;
        this.f5694r = null;
        d0.a(this, getContext());
        C0528e c0528e = new C0528e(this);
        this.f5689m = c0528e;
        c0528e.e(attributeSet, i7);
        C c7 = new C(this);
        this.f5690n = c7;
        c7.m(attributeSet, i7);
        c7.b();
        this.f5691o = new B(this);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
