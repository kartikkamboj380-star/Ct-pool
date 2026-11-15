package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f7295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f7296b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f7297c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f7298d = -1;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f7299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f7300b;

        a(P p6, View view) {
            this.f7299a = p6;
            this.f7300b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7299a.a(this.f7300b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7299a.b(this.f7300b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f7299a.c(this.f7300b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    O(View view) {
        this.f7295a = new WeakReference(view);
    }

    private void i(View view, P p6) {
        if (p6 != null) {
            view.animate().setListener(new a(p6, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public O b(float f7) {
        View view = (View) this.f7295a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f7295a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f7295a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public O f(long j7) {
        View view = (View) this.f7295a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
        return this;
    }

    public O g(Interpolator interpolator) {
        View view = (View) this.f7295a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public O h(P p6) {
        View view = (View) this.f7295a.get();
        if (view != null) {
            i(view, p6);
        }
        return this;
    }

    public O j(long j7) {
        View view = (View) this.f7295a.get();
        if (view != null) {
            view.animate().setStartDelay(j7);
        }
        return this;
    }

    public O k(final S s6) {
        final View view = (View) this.f7295a.get();
        if (view != null) {
            b.a(view.animate(), s6 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.N
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    s6.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f7295a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public O m(float f7) {
        View view = (View) this.f7295a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
        return this;
    }
}
