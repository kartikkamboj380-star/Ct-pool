package com.google.android.material.floatingactionbutton;

import A3.j;
import N3.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.y;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.c;
import com.google.android.material.internal.o;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatingActionButton extends o implements I3.a, n, CoordinatorLayout.b {

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f16899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16900b;

        public BaseBehavior() {
            this.f16900b = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f16899a == null) {
                this.f16899a = new Rect();
            }
            Rect rect = this.f16899a;
            c.a(coordinatorLayout, appBarLayout, rect);
            int i7 = rect.bottom;
            appBarLayout.getMinimumHeightForVisibleOverlappingContent();
            throw null;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                throw null;
            }
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!F(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i7) {
            List listS = coordinatorLayout.s(floatingActionButton);
            int size = listS.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) listS.get(i8);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(floatingActionButton, i7);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            y.a(view);
            return E(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f6853h == 0) {
                fVar.f6853h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            y.a(view);
            return H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            y.a(view);
            return I(coordinatorLayout, null, i7);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f290C1);
            this.f16900b = typedArrayObtainStyledAttributes.getBoolean(j.f297D1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.E(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.H(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i7) {
            return super.I(coordinatorLayout, floatingActionButton, i7);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
