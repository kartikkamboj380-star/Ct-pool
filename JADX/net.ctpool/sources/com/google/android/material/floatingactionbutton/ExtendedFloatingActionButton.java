package com.google.android.material.floatingactionbutton;

import A3.i;
import A3.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.y;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f16891F = i.f269m;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final Property f16892G = new a(Float.class, "width");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final Property f16893H = new b(Float.class, "height");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static final Property f16894I = new c(Float.class, "paddingStart");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    static final Property f16895J = new d(Float.class, "paddingEnd");

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f16896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f16898c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f16897b = false;
            this.f16898c = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f16896a == null) {
                this.f16896a = new Rect();
            }
            Rect rect = this.f16896a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f16898c) {
                ExtendedFloatingActionButton.m(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.n(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, null, null);
        }

        public boolean F(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i7) {
            List listS = coordinatorLayout.s(extendedFloatingActionButton);
            int size = listS.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) listS.get(i8);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(extendedFloatingActionButton, i7);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f16898c) {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, null, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            y.a(view);
            return F(coordinatorLayout, null, rect);
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

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f640y1);
            this.f16897b = typedArrayObtainStyledAttributes.getBoolean(j.f647z1, false);
            this.f16898c = typedArrayObtainStyledAttributes.getBoolean(j.f276A1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            view.getLayoutParams().width = f7.intValue();
            view.requestLayout();
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            view.getLayoutParams().height = f7.intValue();
            view.requestLayout();
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(H.G(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            H.D0(view, f7.intValue(), view.getPaddingTop(), H.F(view), view.getPaddingBottom());
        }
    }

    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(H.F(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            H.D0(view, H.G(view), view.getPaddingTop(), f7.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a j(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ void l(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar, e eVar) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a m(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a n(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }
}
