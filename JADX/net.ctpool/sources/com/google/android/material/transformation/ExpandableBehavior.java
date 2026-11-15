package com.google.android.material.transformation;

import I3.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.y;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17325a;

    public ExpandableBehavior() {
        this.f17325a = 0;
    }

    protected a E(CoordinatorLayout coordinatorLayout, View view) {
        List listS = coordinatorLayout.s(view);
        int size = listS.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) listS.get(i7);
            if (e(coordinatorLayout, view, view2)) {
                y.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        y.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
        if (H.T(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17325a = 0;
    }
}
