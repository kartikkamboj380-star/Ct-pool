package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: g0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1673d extends N {

    /* JADX INFO: renamed from: g0.d$a */
    class a extends AbstractC1682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f19377a;

        a(View view) {
            this.f19377a = view;
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            AbstractC1666A.g(this.f19377a, 1.0f);
            AbstractC1666A.a(this.f19377a);
            abstractC1681l.S(this);
        }
    }

    /* JADX INFO: renamed from: g0.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f19379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19380b = false;

        b(View view) {
            this.f19379a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1666A.g(this.f19379a, 1.0f);
            if (this.f19380b) {
                this.f19379a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.H.P(this.f19379a) && this.f19379a.getLayerType() == 0) {
                this.f19380b = true;
                this.f19379a.setLayerType(2, null);
            }
        }
    }

    public C1673d() {
    }

    private Animator o0(View view, float f7, float f8) {
        if (f7 == f8) {
            return null;
        }
        AbstractC1666A.g(view, f7);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC1666A.f19312b, f8);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float p0(s sVar, float f7) {
        Float f8;
        return (sVar == null || (f8 = (Float) sVar.f19459a.get("android:fade:transitionAlpha")) == null) ? f7 : f8.floatValue();
    }

    @Override // g0.N
    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fP0 = p0(sVar, 0.0f);
        return o0(view, fP0 != 1.0f ? fP0 : 0.0f, 1.0f);
    }

    @Override // g0.N, g0.AbstractC1681l
    public void j(s sVar) {
        super.j(sVar);
        sVar.f19459a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC1666A.c(sVar.f19460b)));
    }

    @Override // g0.N
    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        AbstractC1666A.e(view);
        return o0(view, p0(sVar, 1.0f), 0.0f);
    }

    public C1673d(int i7) {
        m0(i7);
    }
}
