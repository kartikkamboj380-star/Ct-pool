package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0537n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f6178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J.f f6179b;

    C0537n(TextView textView) {
        this.f6178a = textView;
        this.f6179b = new J.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f6179b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f6179b.b();
    }

    void c(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f6178a.getContext().obtainStyledAttributes(attributeSet, e.j.f19054g0, i7, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(e.j.f19124u0) ? typedArrayObtainStyledAttributes.getBoolean(e.j.f19124u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z6) {
        this.f6179b.c(z6);
    }

    void e(boolean z6) {
        this.f6179b.d(z6);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f6179b.e(transformationMethod);
    }
}
