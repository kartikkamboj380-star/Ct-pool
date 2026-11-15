package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class F implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f7266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewTreeObserver f7267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f7268o;

    private F(View view, Runnable runnable) {
        this.f7266m = view;
        this.f7267n = view.getViewTreeObserver();
        this.f7268o = runnable;
    }

    public static F a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        F f7 = new F(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(f7);
        view.addOnAttachStateChangeListener(f7);
        return f7;
    }

    public void b() {
        (this.f7267n.isAlive() ? this.f7267n : this.f7266m.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f7266m.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f7268o.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f7267n = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
