package com.google.android.material.behavior;

import A.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import androidx.core.view.accessibility.F;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    A.c f16505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16506b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16508d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16507c = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f16509e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f16510f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f16511g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f16512h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c.AbstractC0002c f16513i = new a();

    class a extends c.AbstractC0002c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16515b = -1;

        a() {
        }

        private boolean n(View view, float f7) {
            if (f7 == 0.0f) {
                return Math.abs(view.getLeft() - this.f16514a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f16510f);
            }
            boolean z6 = H.B(view) == 1;
            int i7 = SwipeDismissBehavior.this.f16509e;
            if (i7 == 2) {
                return true;
            }
            if (i7 == 0) {
                if (z6) {
                    if (f7 >= 0.0f) {
                        return false;
                    }
                } else if (f7 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i7 != 1) {
                return false;
            }
            if (z6) {
                if (f7 <= 0.0f) {
                    return false;
                }
            } else if (f7 >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
        @Override // A.c.AbstractC0002c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int a(View view, int i7, int i8) {
            int width;
            int width2;
            boolean z6 = H.B(view) == 1;
            int i9 = SwipeDismissBehavior.this.f16509e;
            if (i9 == 0) {
                if (z6) {
                    width = this.f16514a - view.getWidth();
                    width2 = this.f16514a;
                } else {
                    width = this.f16514a;
                    width2 = view.getWidth() + width;
                }
            } else if (i9 != 1) {
                width = this.f16514a - view.getWidth();
                width2 = view.getWidth() + this.f16514a;
            } else if (z6) {
            }
            return SwipeDismissBehavior.G(width, i7, width2);
        }

        @Override // A.c.AbstractC0002c
        public int b(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override // A.c.AbstractC0002c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // A.c.AbstractC0002c
        public void i(View view, int i7) {
            this.f16515b = i7;
            this.f16514a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // A.c.AbstractC0002c
        public void j(int i7) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // A.c.AbstractC0002c
        public void k(View view, int i7, int i8, int i9, int i10) {
            float width = this.f16514a + (view.getWidth() * SwipeDismissBehavior.this.f16511g);
            float width2 = this.f16514a + (view.getWidth() * SwipeDismissBehavior.this.f16512h);
            float f7 = i7;
            if (f7 <= width) {
                view.setAlpha(1.0f);
            } else if (f7 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f7), 1.0f));
            }
        }

        @Override // A.c.AbstractC0002c
        public void l(View view, float f7, float f8) {
            int i7;
            boolean z6;
            this.f16515b = -1;
            int width = view.getWidth();
            if (n(view, f7)) {
                int left = view.getLeft();
                int i8 = this.f16514a;
                i7 = left < i8 ? i8 - width : i8 + width;
                z6 = true;
            } else {
                i7 = this.f16514a;
                z6 = false;
            }
            if (SwipeDismissBehavior.this.f16505a.O(i7, view.getTop())) {
                H.h0(view, new c(view, z6));
            } else if (z6) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // A.c.AbstractC0002c
        public boolean m(View view, int i7) {
            int i8 = this.f16515b;
            return (i8 == -1 || i8 == i7) && SwipeDismissBehavior.this.E(view);
        }
    }

    class b implements F {
        b() {
        }

        @Override // androidx.core.view.accessibility.F
        public boolean a(View view, F.a aVar) {
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z6 = H.B(view) == 1;
            int i7 = SwipeDismissBehavior.this.f16509e;
            H.Z(view, (!(i7 == 0 && z6) && (i7 != 1 || z6)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    private class c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final View f16518m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f16519n;

        c(View view, boolean z6) {
            this.f16518m = view;
            this.f16519n = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.c cVar = SwipeDismissBehavior.this.f16505a;
            if (cVar != null && cVar.m(true)) {
                H.h0(this.f16518m, this);
            } else if (this.f16519n) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float F(float f7, float f8, float f9) {
        return Math.min(Math.max(f7, f8), f9);
    }

    static int G(int i7, int i8, int i9) {
        return Math.min(Math.max(i7, i8), i9);
    }

    private void H(ViewGroup viewGroup) {
        if (this.f16505a == null) {
            this.f16505a = this.f16508d ? A.c.n(viewGroup, this.f16507c, this.f16513i) : A.c.o(viewGroup, this.f16513i);
        }
    }

    static float I(float f7, float f8, float f9) {
        return (f9 - f7) / (f8 - f7);
    }

    private void M(View view) {
        H.j0(view, 1048576);
        if (E(view)) {
            H.l0(view, C.a.f7384y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        A.c cVar = this.f16505a;
        if (cVar == null) {
            return false;
        }
        cVar.F(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f7) {
        this.f16512h = F(0.0f, f7, 1.0f);
    }

    public void K(float f7) {
        this.f16511g = F(0.0f, f7, 1.0f);
    }

    public void L(int i7) {
        this.f16509e = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zC = this.f16506b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zC = coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f16506b = zC;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16506b = false;
        }
        if (!zC) {
            return false;
        }
        H(coordinatorLayout);
        return this.f16505a.P(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
        boolean zL = super.l(coordinatorLayout, view, i7);
        if (H.z(view) == 0) {
            H.z0(view, 1);
            M(view);
        }
        return zL;
    }
}
