package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0536m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f6175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J.a f6176b;

    C0536m(EditText editText) {
        this.f6175a = editText;
        this.f6176b = new J.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f6176b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f6175a.getContext().obtainStyledAttributes(attributeSet, e.j.f19054g0, i7, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(e.j.f19124u0) ? typedArrayObtainStyledAttributes.getBoolean(e.j.f19124u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f6176b.b(inputConnection, editorInfo);
    }

    void e(boolean z6) {
        this.f6176b.c(z6);
    }
}
