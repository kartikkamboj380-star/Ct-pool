package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.l;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f16499a = {R.attr.stateListAnimator};

    static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(View view, float f7) {
        int integer = view.getResources().getInteger(A3.f.f221a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j7 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, A3.a.f95A, -A3.a.f96B}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j7));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f7).setDuration(j7));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(View view, AttributeSet attributeSet, int i7, int i8) {
        Context context = view.getContext();
        TypedArray typedArrayH = l.h(context, attributeSet, f16499a, i7, i8, new int[0]);
        try {
            if (typedArrayH.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayH.getResourceId(0, 0)));
            }
        } finally {
            typedArrayH.recycle();
        }
    }
}
