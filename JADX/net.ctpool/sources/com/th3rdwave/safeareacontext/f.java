package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.facebook.react.views.view.i implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v5.q f18595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f18596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f18597o;

    public f(Context context) {
        super(context);
    }

    private final void q() {
        a aVarE;
        v5.q qVar = this.f18595m;
        if (qVar == null || (aVarE = h.e(this)) == null) {
            return;
        }
        View rootView = getRootView();
        w5.k.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        c cVarA = h.a((ViewGroup) rootView, this);
        if (cVarA == null) {
            return;
        }
        if (w5.k.b(this.f18596n, aVarE) && w5.k.b(this.f18597o, cVarA)) {
            return;
        }
        qVar.e(this, aVarE, cVarA);
        this.f18596n = aVarE;
        this.f18597o = cVarA;
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        q();
        return true;
    }

    public final void setOnInsetsChangeHandler(v5.q qVar) {
        this.f18595m = qVar;
        q();
    }
}
