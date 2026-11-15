package B2;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
class l extends Animation {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f726o;

    public l(View view, float f7, float f8) {
        this.f724m = view;
        this.f725n = f7;
        this.f726o = f8 - f7;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f7, Transformation transformation) {
        this.f724m.setAlpha(this.f725n + (this.f726o * f7));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }

    static class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f728b = false;

        public a(View view) {
            this.f727a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f728b) {
                this.f727a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f727a.hasOverlappingRendering() && this.f727a.getLayerType() == 0) {
                this.f728b = true;
                this.f727a.setLayerType(2, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }
}
