package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f8877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f8878b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8879a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8883e;

        a() {
        }

        void a(int i7) {
            this.f8879a = i7 | this.f8879a;
        }

        boolean b() {
            int i7 = this.f8879a;
            if ((i7 & 7) != 0 && (i7 & c(this.f8882d, this.f8880b)) == 0) {
                return false;
            }
            int i8 = this.f8879a;
            if ((i8 & 112) != 0 && (i8 & (c(this.f8882d, this.f8881c) << 4)) == 0) {
                return false;
            }
            int i9 = this.f8879a;
            if ((i9 & 1792) != 0 && (i9 & (c(this.f8883e, this.f8880b) << 8)) == 0) {
                return false;
            }
            int i10 = this.f8879a;
            return (i10 & 28672) == 0 || (i10 & (c(this.f8883e, this.f8881c) << 12)) != 0;
        }

        int c(int i7, int i8) {
            if (i7 > i8) {
                return 1;
            }
            return i7 == i8 ? 2 : 4;
        }

        void d() {
            this.f8879a = 0;
        }

        void e(int i7, int i8, int i9, int i10) {
            this.f8880b = i7;
            this.f8881c = i8;
            this.f8882d = i9;
            this.f8883e = i10;
        }
    }

    interface b {
        View a(int i7);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    p(b bVar) {
        this.f8877a = bVar;
    }

    View a(int i7, int i8, int i9, int i10) {
        int iC = this.f8877a.c();
        int iD = this.f8877a.d();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View viewA = this.f8877a.a(i7);
            this.f8878b.e(iC, iD, this.f8877a.b(viewA), this.f8877a.e(viewA));
            if (i9 != 0) {
                this.f8878b.d();
                this.f8878b.a(i9);
                if (this.f8878b.b()) {
                    return viewA;
                }
            }
            if (i10 != 0) {
                this.f8878b.d();
                this.f8878b.a(i10);
                if (this.f8878b.b()) {
                    view = viewA;
                }
            }
            i7 += i11;
        }
        return view;
    }

    boolean b(View view, int i7) {
        this.f8878b.e(this.f8877a.c(), this.f8877a.d(), this.f8877a.b(view), this.f8877a.e(view));
        if (i7 == 0) {
            return false;
        }
        this.f8878b.d();
        this.f8878b.a(i7);
        return this.f8878b.b();
    }
}
