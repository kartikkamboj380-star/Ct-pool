package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f8860a;

    interface a {
        void a(a.b bVar);

        a.b b(int i7, int i8, int i9, Object obj);
    }

    h(a aVar) {
        this.f8860a = aVar;
    }

    private int a(List list) {
        boolean z6 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f8732a != 8) {
                z6 = true;
            } else if (z6) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i7, a.b bVar, int i8, a.b bVar2) {
        int i9 = bVar.f8735d;
        int i10 = bVar2.f8733b;
        int i11 = i9 < i10 ? -1 : 0;
        int i12 = bVar.f8733b;
        if (i12 < i10) {
            i11++;
        }
        if (i10 <= i12) {
            bVar.f8733b = i12 + bVar2.f8735d;
        }
        int i13 = bVar2.f8733b;
        if (i13 <= i9) {
            bVar.f8735d = i9 + bVar2.f8735d;
        }
        bVar2.f8733b = i13 + i11;
        list.set(i7, bVar2);
        list.set(i8, bVar);
    }

    private void d(List list, int i7, int i8) {
        a.b bVar = (a.b) list.get(i7);
        a.b bVar2 = (a.b) list.get(i8);
        int i9 = bVar2.f8732a;
        if (i9 == 1) {
            c(list, i7, bVar, i8, bVar2);
        } else if (i9 == 2) {
            e(list, i7, bVar, i8, bVar2);
        } else {
            if (i9 != 4) {
                return;
            }
            f(list, i7, bVar, i8, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[PHI: r0
      0x00a0: PHI (r0v13 int) = (r0v6 int), (r0v16 int) binds: [B:58:0x00cd, B:45:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void e(List list, int i7, a.b bVar, int i8, a.b bVar2) {
        boolean z6;
        int i9;
        int i10 = bVar.f8733b;
        int i11 = bVar.f8735d;
        boolean z7 = false;
        int i12 = bVar2.f8733b;
        if (i10 < i11) {
            if (i12 == i10 && bVar2.f8735d == i11 - i10) {
                z6 = false;
                z7 = true;
            } else {
                z6 = false;
            }
        } else if (i12 == i11 + 1 && bVar2.f8735d == i10 - i11) {
            z6 = true;
            z7 = true;
        } else {
            z6 = true;
        }
        int i13 = bVar2.f8733b;
        if (i11 < i13) {
            bVar2.f8733b = i13 - 1;
        } else {
            int i14 = bVar2.f8735d;
            if (i11 < i13 + i14) {
                bVar2.f8735d = i14 - 1;
                bVar.f8732a = 2;
                bVar.f8735d = 1;
                if (bVar2.f8735d == 0) {
                    list.remove(i8);
                    this.f8860a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i15 = bVar.f8733b;
        int i16 = bVar2.f8733b;
        a.b bVarB = null;
        if (i15 <= i16) {
            bVar2.f8733b = i16 + 1;
        } else {
            int i17 = bVar2.f8735d;
            if (i15 < i16 + i17) {
                bVarB = this.f8860a.b(2, i15 + 1, (i16 + i17) - i15, null);
                bVar2.f8735d = bVar.f8733b - bVar2.f8733b;
            }
        }
        if (z7) {
            list.set(i7, bVar2);
            list.remove(i8);
            this.f8860a.a(bVar);
            return;
        }
        if (z6) {
            if (bVarB != null) {
                int i18 = bVar.f8733b;
                if (i18 > bVarB.f8733b) {
                    bVar.f8733b = i18 - bVarB.f8735d;
                }
                int i19 = bVar.f8735d;
                if (i19 > bVarB.f8733b) {
                    bVar.f8735d = i19 - bVarB.f8735d;
                }
            }
            int i20 = bVar.f8733b;
            if (i20 > bVar2.f8733b) {
                bVar.f8733b = i20 - bVar2.f8735d;
            }
            i9 = bVar.f8735d;
            if (i9 > bVar2.f8733b) {
                bVar.f8735d = i9 - bVar2.f8735d;
            }
        } else {
            if (bVarB != null) {
                int i21 = bVar.f8733b;
                if (i21 >= bVarB.f8733b) {
                    bVar.f8733b = i21 - bVarB.f8735d;
                }
                int i22 = bVar.f8735d;
                if (i22 >= bVarB.f8733b) {
                    bVar.f8735d = i22 - bVarB.f8735d;
                }
            }
            int i23 = bVar.f8733b;
            if (i23 >= bVar2.f8733b) {
                bVar.f8733b = i23 - bVar2.f8735d;
            }
            i9 = bVar.f8735d;
            if (i9 >= bVar2.f8733b) {
            }
        }
        list.set(i7, bVar2);
        if (bVar.f8733b != bVar.f8735d) {
            list.set(i8, bVar);
        } else {
            list.remove(i8);
        }
        if (bVarB != null) {
            list.add(i7, bVarB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void f(List list, int i7, a.b bVar, int i8, a.b bVar2) {
        a.b bVarB;
        int i9;
        int i10;
        int i11 = bVar.f8735d;
        int i12 = bVar2.f8733b;
        a.b bVarB2 = null;
        if (i11 >= i12) {
            int i13 = bVar2.f8735d;
            if (i11 < i12 + i13) {
                bVar2.f8735d = i13 - 1;
                bVarB = this.f8860a.b(4, bVar.f8733b, 1, bVar2.f8734c);
            }
            i9 = bVar.f8733b;
            i10 = bVar2.f8733b;
            if (i9 > i10) {
                bVar2.f8733b = i10 + 1;
            } else {
                int i14 = bVar2.f8735d;
                if (i9 < i10 + i14) {
                    int i15 = (i10 + i14) - i9;
                    bVarB2 = this.f8860a.b(4, i9 + 1, i15, bVar2.f8734c);
                    bVar2.f8735d -= i15;
                }
            }
            list.set(i8, bVar);
            if (bVar2.f8735d <= 0) {
                list.set(i7, bVar2);
            } else {
                list.remove(i7);
                this.f8860a.a(bVar2);
            }
            if (bVarB != null) {
                list.add(i7, bVarB);
            }
            if (bVarB2 == null) {
                list.add(i7, bVarB2);
                return;
            }
            return;
        }
        bVar2.f8733b = i12 - 1;
        bVarB = null;
        i9 = bVar.f8733b;
        i10 = bVar2.f8733b;
        if (i9 > i10) {
        }
        list.set(i8, bVar);
        if (bVar2.f8735d <= 0) {
        }
        if (bVarB != null) {
        }
        if (bVarB2 == null) {
        }
    }
}
