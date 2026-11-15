package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextInputLayout f17209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f17210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    CheckableImageButton f17211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f17212d;

    f(TextInputLayout textInputLayout, int i7) {
        this.f17209a = textInputLayout;
        this.f17210b = textInputLayout.getContext();
        this.f17211c = textInputLayout.getEndIconView();
        this.f17212d = i7;
    }

    abstract void a();

    boolean b(int i7) {
        return true;
    }

    void c(boolean z6) {
    }

    boolean d() {
        return false;
    }
}
