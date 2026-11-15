package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n.g f8884a = new n.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n.d f8885b = new n.d();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static androidx.core.util.d f8886d = new Pools$SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.l.b f8888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.l.b f8889c;

        private a() {
        }

        static void a() {
            while (f8886d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f8886d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f8887a = 0;
            aVar.f8888b = null;
            aVar.f8889c = null;
            f8886d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.C c7);

        void b(RecyclerView.C c7, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void c(RecyclerView.C c7, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.C c7, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    q() {
    }

    private RecyclerView.l.b l(RecyclerView.C c7, int i7) {
        a aVar;
        RecyclerView.l.b bVar;
        int iG = this.f8884a.g(c7);
        if (iG >= 0 && (aVar = (a) this.f8884a.n(iG)) != null) {
            int i8 = aVar.f8887a;
            if ((i8 & i7) != 0) {
                int i9 = (~i7) & i8;
                aVar.f8887a = i9;
                if (i7 == 4) {
                    bVar = aVar.f8888b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f8889c;
                }
                if ((i9 & 12) == 0) {
                    this.f8884a.l(iG);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.C c7, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f8884a.get(c7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f8884a.put(c7, aVarB);
        }
        aVarB.f8887a |= 2;
        aVarB.f8888b = bVar;
    }

    void b(RecyclerView.C c7) {
        a aVarB = (a) this.f8884a.get(c7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f8884a.put(c7, aVarB);
        }
        aVarB.f8887a |= 1;
    }

    void c(long j7, RecyclerView.C c7) {
        this.f8885b.i(j7, c7);
    }

    void d(RecyclerView.C c7, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f8884a.get(c7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f8884a.put(c7, aVarB);
        }
        aVarB.f8889c = bVar;
        aVarB.f8887a |= 8;
    }

    void e(RecyclerView.C c7, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f8884a.get(c7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f8884a.put(c7, aVarB);
        }
        aVarB.f8888b = bVar;
        aVarB.f8887a |= 4;
    }

    void f() {
        this.f8884a.clear();
        this.f8885b.a();
    }

    RecyclerView.C g(long j7) {
        return (RecyclerView.C) this.f8885b.d(j7);
    }

    boolean h(RecyclerView.C c7) {
        a aVar = (a) this.f8884a.get(c7);
        return (aVar == null || (aVar.f8887a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.C c7) {
        a aVar = (a) this.f8884a.get(c7);
        return (aVar == null || (aVar.f8887a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.C c7) {
        p(c7);
    }

    RecyclerView.l.b m(RecyclerView.C c7) {
        return l(c7, 8);
    }

    RecyclerView.l.b n(RecyclerView.C c7) {
        return l(c7, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void o(b bVar) {
        RecyclerView.l.b bVar2;
        RecyclerView.l.b bVar3;
        for (int size = this.f8884a.size() - 1; size >= 0; size--) {
            RecyclerView.C c7 = (RecyclerView.C) this.f8884a.j(size);
            a aVar = (a) this.f8884a.l(size);
            int i7 = aVar.f8887a;
            if ((i7 & 3) != 3) {
                if ((i7 & 1) != 0) {
                    bVar2 = aVar.f8888b;
                    bVar3 = bVar2 != null ? aVar.f8889c : null;
                    bVar.a(c7);
                } else if ((i7 & 14) != 14) {
                    if ((i7 & 12) == 12) {
                        bVar.d(c7, aVar.f8888b, aVar.f8889c);
                    } else if ((i7 & 4) != 0) {
                        bVar2 = aVar.f8888b;
                    } else if ((i7 & 8) != 0) {
                        bVar.b(c7, aVar.f8888b, aVar.f8889c);
                    }
                }
                bVar.c(c7, bVar2, bVar3);
            } else {
                bVar.a(c7);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.C c7) {
        a aVar = (a) this.f8884a.get(c7);
        if (aVar == null) {
            return;
        }
        aVar.f8887a &= -2;
    }

    void q(RecyclerView.C c7) {
        int iL = this.f8885b.l() - 1;
        while (true) {
            if (iL < 0) {
                break;
            }
            if (c7 == this.f8885b.m(iL)) {
                this.f8885b.k(iL);
                break;
            }
            iL--;
        }
        a aVar = (a) this.f8884a.remove(c7);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
