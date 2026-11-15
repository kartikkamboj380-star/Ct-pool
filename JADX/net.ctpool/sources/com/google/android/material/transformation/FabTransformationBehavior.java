package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f17326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f17327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f17328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f17329e;

    public FabTransformationBehavior() {
        this.f17326b = new Rect();
        this.f17327c = new RectF();
        this.f17328d = new RectF();
        this.f17329e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f6853h == 0) {
            fVar.f6853h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17326b = new Rect();
        this.f17327c = new RectF();
        this.f17328d = new RectF();
        this.f17329e = new int[2];
    }
}
