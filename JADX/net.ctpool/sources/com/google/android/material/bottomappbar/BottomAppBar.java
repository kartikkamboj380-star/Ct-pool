package com.google.android.material.bottomappbar;

import A3.i;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.y;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f16521j0 = i.f263g;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Rect f16522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference f16523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final View.OnLayoutChangeListener f16525h;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                y.a(Behavior.this.f16523f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f16525h = new a();
            this.f16522e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
            y.a(view);
            return O(coordinatorLayout, null, view2, view3, i7, i8);
        }

        public boolean N(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i7) {
            this.f16523f = new WeakReference(bottomAppBar);
            View viewV = BottomAppBar.V(bottomAppBar);
            if (viewV != null && !H.T(viewV)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewV.getLayoutParams();
                fVar.f6849d = 49;
                this.f16524g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                BottomAppBar.U(bottomAppBar);
            }
            coordinatorLayout.K(bottomAppBar, i7);
            return super.l(coordinatorLayout, bottomAppBar, i7);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i7, int i8) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            y.a(view);
            return N(coordinatorLayout, null, i7);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16525h = new a();
            this.f16522e = new Rect();
        }
    }

    static /* synthetic */ void U(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View V(BottomAppBar bottomAppBar) {
        throw null;
    }
}
