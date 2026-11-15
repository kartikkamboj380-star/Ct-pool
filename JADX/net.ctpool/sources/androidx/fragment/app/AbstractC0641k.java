package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0641k {

    /* JADX INFO: renamed from: androidx.fragment.app.k$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f8172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f8173b;

        a(Animator animator) {
            this.f8172a = null;
            this.f8173b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation) {
            this.f8172a = animation;
            this.f8173b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.k$b */
    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final ViewGroup f8174m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f8175n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f8176o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f8177p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f8178q;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f8178q = true;
            this.f8174m = viewGroup;
            this.f8175n = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation) {
            this.f8178q = true;
            if (this.f8176o) {
                return !this.f8177p;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f8176o = true;
                androidx.core.view.F.a(this.f8174m, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8176o || !this.f8178q) {
                this.f8174m.endViewTransition(this.f8175n);
                this.f8177p = true;
            } else {
                this.f8178q = false;
                this.f8174m.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation, float f7) {
            this.f8178q = true;
            if (this.f8176o) {
                return !this.f8177p;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f8176o = true;
                androidx.core.view.F.a(this.f8174m, this);
            }
            return true;
        }
    }

    private static int a(Fragment fragment, boolean z6, boolean z7) {
        return z7 ? z6 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z6 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static a b(Context context, Fragment fragment, boolean z6, boolean z7) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iA = a(fragment, z6, z7);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(K.b.f1833c) != null) {
            fragment.mContainer.setTag(K.b.f1833c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z6, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z6, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z6);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e7) {
                    throw e7;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                        }
                    } catch (RuntimeException e8) {
                        if (zEquals) {
                            throw e8;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i7, boolean z6) {
        int i8;
        if (i7 == 4097) {
            return z6 ? K.a.f1829e : K.a.f1830f;
        }
        if (i7 == 8194) {
            return z6 ? K.a.f1825a : K.a.f1826b;
        }
        if (i7 == 8197) {
            i8 = z6 ? R.attr.activityCloseEnterAnimation : R.attr.activityCloseExitAnimation;
        } else {
            if (i7 == 4099) {
                return z6 ? K.a.f1827c : K.a.f1828d;
            }
            if (i7 != 4100) {
                return -1;
            }
            i8 = z6 ? R.attr.activityOpenEnterAnimation : R.attr.activityOpenExitAnimation;
        }
        return c(context, i8);
    }
}
