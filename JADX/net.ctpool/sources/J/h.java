package J;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TransformationMethod f1559a;

    h(TransformationMethod transformationMethod) {
        this.f1559a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f1559a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1559a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.e.b().d() != 1) ? charSequence : androidx.emoji2.text.e.b().o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f1559a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i7, rect);
        }
    }
}
