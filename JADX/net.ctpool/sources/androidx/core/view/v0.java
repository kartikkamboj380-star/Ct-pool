package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.v0;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f7425a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f7426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f7427b;

        a(Window window, View view) {
            this.f7426a = window;
            this.f7427b = view;
        }

        private void g(int i7) {
            if (i7 == 1) {
                i(4);
            } else if (i7 == 2) {
                i(2);
            } else {
                if (i7 != 8) {
                    return;
                }
                ((InputMethodManager) this.f7426a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f7426a.getDecorView().getWindowToken(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void h(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        private void k(int i7) {
            if (i7 == 1) {
                l(4);
                m(1024);
                return;
            }
            if (i7 == 2) {
                l(2);
                return;
            }
            if (i7 != 8) {
                return;
            }
            final View viewFindViewById = this.f7427b;
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = this.f7426a.getCurrentFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f7426a.findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.u0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.a.h(viewFindViewById);
                }
            });
        }

        @Override // androidx.core.view.v0.e
        void a(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    g(i8);
                }
            }
        }

        @Override // androidx.core.view.v0.e
        void d(int i7) {
            if (i7 == 0) {
                l(6144);
                return;
            }
            if (i7 == 1) {
                l(4096);
                i(2048);
            } else {
                if (i7 != 2) {
                    return;
                }
                l(2048);
                i(4096);
            }
        }

        @Override // androidx.core.view.v0.e
        void e(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    k(i8);
                }
            }
        }

        protected void i(int i7) {
            View decorView = this.f7426a.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        protected void j(int i7) {
            this.f7426a.addFlags(i7);
        }

        protected void l(int i7) {
            View decorView = this.f7426a.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        protected void m(int i7) {
            this.f7426a.clearFlags(i7);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.v0.e
        public void c(boolean z6) {
            if (!z6) {
                l(8192);
                return;
            }
            m(67108864);
            j(Integer.MIN_VALUE);
            i(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.v0.e
        public void b(boolean z6) {
            if (!z6) {
                l(16);
                return;
            }
            m(134217728);
            j(Integer.MIN_VALUE);
            i(16);
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v0 f7428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f7429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n.g f7430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected Window f7431d;

        d(Window window, v0 v0Var) {
            this(window.getInsetsController(), v0Var);
            this.f7431d = window;
        }

        @Override // androidx.core.view.v0.e
        void a(int i7) {
            this.f7429b.hide(i7);
        }

        @Override // androidx.core.view.v0.e
        public void b(boolean z6) {
            if (z6) {
                if (this.f7431d != null) {
                    f(16);
                }
                this.f7429b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f7431d != null) {
                    g(16);
                }
                this.f7429b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.v0.e
        public void c(boolean z6) {
            if (z6) {
                if (this.f7431d != null) {
                    f(8192);
                }
                this.f7429b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f7431d != null) {
                    g(8192);
                }
                this.f7429b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.v0.e
        void d(int i7) {
            this.f7429b.setSystemBarsBehavior(i7);
        }

        @Override // androidx.core.view.v0.e
        void e(int i7) {
            Window window = this.f7431d;
            if (window != null && (i7 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f7429b.show(i7);
        }

        protected void f(int i7) {
            View decorView = this.f7431d.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        protected void g(int i7) {
            View decorView = this.f7431d.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, v0 v0Var) {
            this.f7430c = new n.g();
            this.f7429b = windowInsetsController;
            this.f7428a = v0Var;
        }
    }

    private static class e {
        e() {
        }

        abstract void a(int i7);

        public void b(boolean z6) {
        }

        public abstract void c(boolean z6);

        abstract void d(int i7);

        abstract void e(int i7);
    }

    public v0(Window window, View view) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f7425a = new d(window, this);
        } else {
            this.f7425a = i7 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    public void a(int i7) {
        this.f7425a.a(i7);
    }

    public void b(boolean z6) {
        this.f7425a.b(z6);
    }

    public void c(boolean z6) {
        this.f7425a.c(z6);
    }

    public void d(int i7) {
        this.f7425a.d(i7);
    }

    public void e(int i7) {
        this.f7425a.e(i7);
    }
}
