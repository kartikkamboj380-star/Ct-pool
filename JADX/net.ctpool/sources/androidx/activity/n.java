package androidx.activity;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(View view, l lVar) {
        w5.k.f(view, "<this>");
        w5.k.f(lVar, "onBackPressedDispatcherOwner");
        view.setTag(m.f4893a, lVar);
    }
}
