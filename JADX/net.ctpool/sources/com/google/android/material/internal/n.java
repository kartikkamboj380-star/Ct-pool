package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C;
import androidx.core.view.H;
import androidx.core.view.U;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f17036m;

        a(View view) {
            this.f17036m = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f17036m.getContext().getSystemService("input_method")).showSoftInput(this.f17036m, 1);
        }
    }

    class b implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f17037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f17038b;

        b(d dVar, e eVar) {
            this.f17037a = dVar;
            this.f17038b = eVar;
        }

        @Override // androidx.core.view.C
        public U a(View view, U u6) {
            return this.f17037a.a(view, u6, new e(this.f17038b));
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            H.m0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        U a(View view, U u6, e eVar);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17042d;

        public e(int i7, int i8, int i9, int i10) {
            this.f17039a = i7;
            this.f17040b = i8;
            this.f17041c = i9;
            this.f17042d = i10;
        }

        public e(e eVar) {
            this.f17039a = eVar.f17039a;
            this.f17040b = eVar.f17040b;
            this.f17041c = eVar.f17041c;
            this.f17042d = eVar.f17042d;
        }
    }

    public static void a(View view, d dVar) {
        H.C0(view, new b(dVar, new e(H.G(view), view.getPaddingTop(), H.F(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i7) {
        return TypedValue.applyDimension(1, i7, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float fW = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fW += H.w((View) parent);
        }
        return fW;
    }

    public static boolean e(View view) {
        return H.B(view) == 1;
    }

    public static PorterDuff.Mode f(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(View view) {
        if (H.S(view)) {
            H.m0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}
