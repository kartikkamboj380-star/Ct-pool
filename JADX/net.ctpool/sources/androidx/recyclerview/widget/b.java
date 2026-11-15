package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0167b f8736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f8737b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f8738c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f8739a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f8740b;

        a() {
        }

        private void c() {
            if (this.f8740b == null) {
                this.f8740b = new a();
            }
        }

        void a(int i7) {
            if (i7 < 64) {
                this.f8739a &= ~(1 << i7);
                return;
            }
            a aVar = this.f8740b;
            if (aVar != null) {
                aVar.a(i7 - 64);
            }
        }

        int b(int i7) {
            a aVar = this.f8740b;
            return aVar == null ? i7 >= 64 ? Long.bitCount(this.f8739a) : Long.bitCount(this.f8739a & ((1 << i7) - 1)) : i7 < 64 ? Long.bitCount(this.f8739a & ((1 << i7) - 1)) : aVar.b(i7 - 64) + Long.bitCount(this.f8739a);
        }

        boolean d(int i7) {
            if (i7 < 64) {
                return (this.f8739a & (1 << i7)) != 0;
            }
            c();
            return this.f8740b.d(i7 - 64);
        }

        void e(int i7, boolean z6) {
            if (i7 >= 64) {
                c();
                this.f8740b.e(i7 - 64, z6);
                return;
            }
            long j7 = this.f8739a;
            boolean z7 = (Long.MIN_VALUE & j7) != 0;
            long j8 = (1 << i7) - 1;
            this.f8739a = ((j7 & (~j8)) << 1) | (j7 & j8);
            if (z6) {
                h(i7);
            } else {
                a(i7);
            }
            if (z7 || this.f8740b != null) {
                c();
                this.f8740b.e(0, z7);
            }
        }

        boolean f(int i7) {
            if (i7 >= 64) {
                c();
                return this.f8740b.f(i7 - 64);
            }
            long j7 = 1 << i7;
            long j8 = this.f8739a;
            boolean z6 = (j8 & j7) != 0;
            long j9 = j8 & (~j7);
            this.f8739a = j9;
            long j10 = j7 - 1;
            this.f8739a = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
            a aVar = this.f8740b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f8740b.f(0);
            }
            return z6;
        }

        void g() {
            this.f8739a = 0L;
            a aVar = this.f8740b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i7) {
            if (i7 < 64) {
                this.f8739a |= 1 << i7;
            } else {
                c();
                this.f8740b.h(i7 - 64);
            }
        }

        public String toString() {
            if (this.f8740b == null) {
                return Long.toBinaryString(this.f8739a);
            }
            return this.f8740b.toString() + "xx" + Long.toBinaryString(this.f8739a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0167b {
        View a(int i7);

        int b();

        void c(View view);

        void d();

        int e(View view);

        RecyclerView.C f(View view);

        void g(int i7);

        void h(View view);

        void i(View view, int i7);

        void j(int i7);

        void k(View view, int i7, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0167b interfaceC0167b) {
        this.f8736a = interfaceC0167b;
    }

    private int h(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int iB = this.f8736a.b();
        int i8 = i7;
        while (i8 < iB) {
            int iB2 = i7 - (i8 - this.f8737b.b(i8));
            if (iB2 == 0) {
                while (this.f8737b.d(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += iB2;
        }
        return -1;
    }

    private void l(View view) {
        this.f8738c.add(view);
        this.f8736a.c(view);
    }

    private boolean t(View view) {
        if (!this.f8738c.remove(view)) {
            return false;
        }
        this.f8736a.h(view);
        return true;
    }

    void a(View view, int i7, boolean z6) {
        int iB = i7 < 0 ? this.f8736a.b() : h(i7);
        this.f8737b.e(iB, z6);
        if (z6) {
            l(view);
        }
        this.f8736a.i(view, iB);
    }

    void b(View view, boolean z6) {
        a(view, -1, z6);
    }

    void c(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z6) {
        int iB = i7 < 0 ? this.f8736a.b() : h(i7);
        this.f8737b.e(iB, z6);
        if (z6) {
            l(view);
        }
        this.f8736a.k(view, iB, layoutParams);
    }

    void d(int i7) {
        int iH = h(i7);
        this.f8737b.f(iH);
        this.f8736a.g(iH);
    }

    View e(int i7) {
        int size = this.f8738c.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) this.f8738c.get(i8);
            RecyclerView.C cF = this.f8736a.f(view);
            if (cF.m() == i7 && !cF.t() && !cF.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i7) {
        return this.f8736a.a(h(i7));
    }

    int g() {
        return this.f8736a.b() - this.f8738c.size();
    }

    View i(int i7) {
        return this.f8736a.a(i7);
    }

    int j() {
        return this.f8736a.b();
    }

    void k(View view) {
        int iE = this.f8736a.e(view);
        if (iE >= 0) {
            this.f8737b.h(iE);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iE = this.f8736a.e(view);
        if (iE == -1 || this.f8737b.d(iE)) {
            return -1;
        }
        return iE - this.f8737b.b(iE);
    }

    boolean n(View view) {
        return this.f8738c.contains(view);
    }

    void o() {
        this.f8737b.g();
        for (int size = this.f8738c.size() - 1; size >= 0; size--) {
            this.f8736a.h((View) this.f8738c.get(size));
            this.f8738c.remove(size);
        }
        this.f8736a.d();
    }

    void p(View view) {
        int iE = this.f8736a.e(view);
        if (iE < 0) {
            return;
        }
        if (this.f8737b.f(iE)) {
            t(view);
        }
        this.f8736a.j(iE);
    }

    void q(int i7) {
        int iH = h(i7);
        View viewA = this.f8736a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f8737b.f(iH)) {
            t(viewA);
        }
        this.f8736a.j(iH);
    }

    boolean r(View view) {
        int iE = this.f8736a.e(view);
        if (iE == -1) {
            t(view);
            return true;
        }
        if (!this.f8737b.d(iE)) {
            return false;
        }
        this.f8737b.f(iE);
        t(view);
        this.f8736a.j(iE);
        return true;
    }

    void s(View view) {
        int iE = this.f8736a.e(view);
        if (iE < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f8737b.d(iE)) {
            this.f8737b.a(iE);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f8737b.toString() + ", hidden list:" + this.f8738c.size();
    }
}
