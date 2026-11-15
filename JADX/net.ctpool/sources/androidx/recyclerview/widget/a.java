package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.core.util.d f8724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f8725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f8726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0166a f8727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f8728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f8729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final h f8730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8731h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0166a {
        void a(int i7, int i8);

        void b(b bVar);

        void c(int i7, int i8, Object obj);

        void d(b bVar);

        RecyclerView.C e(int i7);

        void f(int i7, int i8);

        void g(int i7, int i8);

        void h(int i7, int i8);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f8734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8735d;

        b(int i7, int i8, int i9, Object obj) {
            this.f8732a = i7;
            this.f8733b = i8;
            this.f8735d = i9;
            this.f8734c = obj;
        }

        String a() {
            int i7 = this.f8732a;
            return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i7 = this.f8732a;
            if (i7 != bVar.f8732a) {
                return false;
            }
            if (i7 == 8 && Math.abs(this.f8735d - this.f8733b) == 1 && this.f8735d == bVar.f8733b && this.f8733b == bVar.f8735d) {
                return true;
            }
            if (this.f8735d != bVar.f8735d || this.f8733b != bVar.f8733b) {
                return false;
            }
            Object obj2 = this.f8734c;
            Object obj3 = bVar.f8734c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f8732a * 31) + this.f8733b) * 31) + this.f8735d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f8733b + "c:" + this.f8735d + ",p:" + this.f8734c + "]";
        }
    }

    a(InterfaceC0166a interfaceC0166a) {
        this(interfaceC0166a, false);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        boolean z6;
        byte b7;
        int i7 = bVar.f8733b;
        int i8 = bVar.f8735d + i7;
        byte b8 = -1;
        int i9 = i7;
        int i10 = 0;
        while (i9 < i8) {
            if (this.f8727d.e(i9) != null || h(i9)) {
                if (b8 == 0) {
                    k(b(2, i7, i10, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                b7 = 1;
            } else {
                if (b8 == 1) {
                    r(b(2, i7, i10, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                b7 = 0;
            }
            if (z6) {
                i9 -= i10;
                i8 -= i10;
                i10 = 1;
            } else {
                i10++;
            }
            i9++;
            b8 = b7;
        }
        if (i10 != bVar.f8735d) {
            a(bVar);
            bVar = b(2, i7, i10, null);
        }
        if (b8 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i7 = bVar.f8733b;
        int i8 = bVar.f8735d + i7;
        int i9 = 0;
        byte b7 = -1;
        int i10 = i7;
        while (i7 < i8) {
            if (this.f8727d.e(i7) != null || h(i7)) {
                if (b7 == 0) {
                    k(b(4, i10, i9, bVar.f8734c));
                    i10 = i7;
                    i9 = 0;
                }
                b7 = 1;
            } else {
                if (b7 == 1) {
                    r(b(4, i10, i9, bVar.f8734c));
                    i10 = i7;
                    i9 = 0;
                }
                b7 = 0;
            }
            i9++;
            i7++;
        }
        if (i9 != bVar.f8735d) {
            Object obj = bVar.f8734c;
            a(bVar);
            bVar = b(4, i10, i9, obj);
        }
        if (b7 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i7) {
        int size = this.f8726c.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f8726c.get(i8);
            int i9 = bVar.f8732a;
            if (i9 == 8) {
                if (n(bVar.f8735d, i8 + 1) == i7) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = bVar.f8733b;
                int i11 = bVar.f8735d + i10;
                while (i10 < i11) {
                    if (n(i10, i8 + 1) == i7) {
                        return true;
                    }
                    i10++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i7;
        int i8 = bVar.f8732a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(bVar.f8733b, i8);
        int i9 = bVar.f8733b;
        int i10 = bVar.f8732a;
        if (i10 == 2) {
            i7 = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i7 = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < bVar.f8735d; i12++) {
            int iV2 = v(bVar.f8733b + (i7 * i12), bVar.f8732a);
            int i13 = bVar.f8732a;
            if (i13 == 2 ? iV2 != iV : !(i13 == 4 && iV2 == iV + 1)) {
                b bVarB = b(i13, iV, i11, bVar.f8734c);
                l(bVarB, i9);
                a(bVarB);
                if (bVar.f8732a == 4) {
                    i9 += i11;
                }
                i11 = 1;
                iV = iV2;
            } else {
                i11++;
            }
        }
        Object obj = bVar.f8734c;
        a(bVar);
        if (i11 > 0) {
            b bVarB2 = b(bVar.f8732a, iV, i11, obj);
            l(bVarB2, i9);
            a(bVarB2);
        }
    }

    private void r(b bVar) {
        this.f8726c.add(bVar);
        int i7 = bVar.f8732a;
        if (i7 == 1) {
            this.f8727d.g(bVar.f8733b, bVar.f8735d);
            return;
        }
        if (i7 == 2) {
            this.f8727d.f(bVar.f8733b, bVar.f8735d);
            return;
        }
        if (i7 == 4) {
            this.f8727d.c(bVar.f8733b, bVar.f8735d, bVar.f8734c);
        } else {
            if (i7 == 8) {
                this.f8727d.a(bVar.f8733b, bVar.f8735d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int v(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        for (int size = this.f8726c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f8726c.get(size);
            int i15 = bVar.f8732a;
            if (i15 == 8) {
                int i16 = bVar.f8733b;
                int i17 = bVar.f8735d;
                if (i16 < i17) {
                    i11 = i16;
                    i10 = i17;
                } else {
                    i10 = i16;
                    i11 = i17;
                }
                if (i7 < i11 || i7 > i10) {
                    if (i7 < i16) {
                        if (i8 == 1) {
                            bVar.f8733b = i16 + 1;
                            i12 = i17 + 1;
                        } else if (i8 == 2) {
                            bVar.f8733b = i16 - 1;
                            i12 = i17 - 1;
                        }
                        bVar.f8735d = i12;
                    }
                } else if (i11 == i16) {
                    if (i8 == 1) {
                        i14 = i17 + 1;
                    } else {
                        if (i8 == 2) {
                            i14 = i17 - 1;
                        }
                        i7++;
                    }
                    bVar.f8735d = i14;
                    i7++;
                } else {
                    if (i8 == 1) {
                        i13 = i16 + 1;
                    } else {
                        if (i8 == 2) {
                            i13 = i16 - 1;
                        }
                        i7--;
                    }
                    bVar.f8733b = i13;
                    i7--;
                }
            } else {
                int i18 = bVar.f8733b;
                if (i18 > i7) {
                    if (i8 == 1) {
                        i9 = i18 + 1;
                    } else if (i8 == 2) {
                        i9 = i18 - 1;
                    }
                    bVar.f8733b = i9;
                } else if (i15 == 1) {
                    i7 -= bVar.f8735d;
                } else if (i15 == 2) {
                    i7 += bVar.f8735d;
                }
            }
        }
        for (int size2 = this.f8726c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f8726c.get(size2);
            if (bVar2.f8732a == 8) {
                int i19 = bVar2.f8735d;
                if (i19 == bVar2.f8733b || i19 < 0) {
                    this.f8726c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f8735d <= 0) {
            }
        }
        return i7;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f8729f) {
            return;
        }
        bVar.f8734c = null;
        this.f8724a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i7, int i8, int i9, Object obj) {
        b bVar = (b) this.f8724a.b();
        if (bVar == null) {
            return new b(i7, i8, i9, obj);
        }
        bVar.f8732a = i7;
        bVar.f8733b = i8;
        bVar.f8735d = i9;
        bVar.f8734c = obj;
        return bVar;
    }

    public int e(int i7) {
        int size = this.f8725b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f8725b.get(i8);
            int i9 = bVar.f8732a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = bVar.f8733b;
                    if (i10 <= i7) {
                        int i11 = bVar.f8735d;
                        if (i10 + i11 > i7) {
                            return -1;
                        }
                        i7 -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = bVar.f8733b;
                    if (i12 == i7) {
                        i7 = bVar.f8735d;
                    } else {
                        if (i12 < i7) {
                            i7--;
                        }
                        if (bVar.f8735d <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (bVar.f8733b <= i7) {
                i7 += bVar.f8735d;
            }
        }
        return i7;
    }

    void i() {
        int size = this.f8726c.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f8727d.d((b) this.f8726c.get(i7));
        }
        t(this.f8726c);
        this.f8731h = 0;
    }

    void j() {
        i();
        int size = this.f8725b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f8725b.get(i7);
            int i8 = bVar.f8732a;
            if (i8 == 1) {
                this.f8727d.d(bVar);
                this.f8727d.g(bVar.f8733b, bVar.f8735d);
            } else if (i8 == 2) {
                this.f8727d.d(bVar);
                this.f8727d.h(bVar.f8733b, bVar.f8735d);
            } else if (i8 == 4) {
                this.f8727d.d(bVar);
                this.f8727d.c(bVar.f8733b, bVar.f8735d, bVar.f8734c);
            } else if (i8 == 8) {
                this.f8727d.d(bVar);
                this.f8727d.a(bVar.f8733b, bVar.f8735d);
            }
            Runnable runnable = this.f8728e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f8725b);
        this.f8731h = 0;
    }

    void l(b bVar, int i7) {
        this.f8727d.b(bVar);
        int i8 = bVar.f8732a;
        if (i8 == 2) {
            this.f8727d.h(i7, bVar.f8735d);
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f8727d.c(i7, bVar.f8735d, bVar.f8734c);
        }
    }

    int m(int i7) {
        return n(i7, 0);
    }

    int n(int i7, int i8) {
        int size = this.f8726c.size();
        while (i8 < size) {
            b bVar = (b) this.f8726c.get(i8);
            int i9 = bVar.f8732a;
            if (i9 == 8) {
                int i10 = bVar.f8733b;
                if (i10 == i7) {
                    i7 = bVar.f8735d;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (bVar.f8735d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = bVar.f8733b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = bVar.f8735d;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += bVar.f8735d;
                }
            }
            i8++;
        }
        return i7;
    }

    boolean o(int i7) {
        return (i7 & this.f8731h) != 0;
    }

    boolean p() {
        return this.f8725b.size() > 0;
    }

    boolean q() {
        return (this.f8726c.isEmpty() || this.f8725b.isEmpty()) ? false : true;
    }

    void s() {
        this.f8730g.b(this.f8725b);
        int size = this.f8725b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f8725b.get(i7);
            int i8 = bVar.f8732a;
            if (i8 == 1) {
                c(bVar);
            } else if (i8 == 2) {
                f(bVar);
            } else if (i8 == 4) {
                g(bVar);
            } else if (i8 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f8728e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f8725b.clear();
    }

    void t(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            a((b) list.get(i7));
        }
        list.clear();
    }

    void u() {
        t(this.f8725b);
        t(this.f8726c);
        this.f8731h = 0;
    }

    a(InterfaceC0166a interfaceC0166a, boolean z6) {
        this.f8724a = new Pools$SimplePool(30);
        this.f8725b = new ArrayList();
        this.f8726c = new ArrayList();
        this.f8731h = 0;
        this.f8727d = interfaceC0166a;
        this.f8729f = z6;
        this.f8730g = new h(this);
    }
}
