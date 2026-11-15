package Y0;

import O0.j;
import O0.l;
import O0.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4417b;

    private h(List list, boolean z6) {
        l.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f4416a = list;
        this.f4417b = z6;
    }

    public static h c(List list, boolean z6) {
        return new h(list, z6);
    }

    @Override // O0.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return j.a(this.f4416a, ((h) obj).f4416a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4416a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f4416a).toString();
    }

    private class a extends Y0.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList f4418h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f4419i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f4420j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AtomicInteger f4421k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Throwable f4422l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map f4423m;

        public a() {
            if (h.this.f4417b) {
                return;
            }
            A();
        }

        private void A() {
            if (this.f4421k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f4421k == null) {
                        this.f4421k = new AtomicInteger(0);
                        int size = h.this.f4416a.size();
                        this.f4420j = size;
                        this.f4419i = size;
                        this.f4418h = new ArrayList(size);
                        for (int i7 = 0; i7 < size; i7++) {
                            c cVar = (c) ((o) h.this.f4416a.get(i7)).get();
                            this.f4418h.add(cVar);
                            cVar.e(new C0104a(i7), M0.a.a());
                            if (!cVar.a()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        private synchronized c B(int i7) {
            c cVar;
            ArrayList arrayList = this.f4418h;
            cVar = null;
            if (arrayList != null && i7 < arrayList.size()) {
                cVar = (c) this.f4418h.set(i7, null);
            }
            return cVar;
        }

        private synchronized c C(int i7) {
            ArrayList arrayList;
            arrayList = this.f4418h;
            return (arrayList == null || i7 >= arrayList.size()) ? null : (c) this.f4418h.get(i7);
        }

        private synchronized c D() {
            return C(this.f4419i);
        }

        private void E() {
            Throwable th;
            if (this.f4421k.incrementAndGet() != this.f4420j || (th = this.f4422l) == null) {
                return;
            }
            q(th, this.f4423m);
        }

        private void F(int i7, c cVar, boolean z6) {
            synchronized (this) {
                try {
                    int i8 = this.f4419i;
                    if (cVar == C(i7) && i7 != this.f4419i) {
                        if (D() == null || (z6 && i7 < this.f4419i)) {
                            this.f4419i = i7;
                        } else {
                            i7 = i8;
                        }
                        while (i8 > i7) {
                            z(B(i8));
                            i8--;
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(int i7, c cVar) {
            z(I(i7, cVar));
            if (i7 == 0) {
                this.f4422l = cVar.c();
                this.f4423m = cVar.getExtras();
            }
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(int i7, c cVar) {
            F(i7, cVar, cVar.b());
            if (cVar == D()) {
                u(null, i7 == 0 && cVar.b(), cVar.getExtras());
            }
            E();
        }

        private synchronized c I(int i7, c cVar) {
            if (cVar == D()) {
                return null;
            }
            if (cVar != C(i7)) {
                return cVar;
            }
            return B(i7);
        }

        private void z(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
        @Override // Y0.a, Y0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public synchronized boolean a() {
            boolean z6;
            try {
                if (h.this.f4417b) {
                    A();
                }
                c cVarD = D();
                if (cVarD != null) {
                    z6 = cVarD.a();
                }
            } catch (Throwable th) {
                throw th;
            }
            return z6;
        }

        @Override // Y0.a, Y0.c
        public boolean close() {
            if (h.this.f4417b) {
                A();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f4418h;
                    this.f4418h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        z((c) arrayList.get(i7));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Y0.a, Y0.c
        public synchronized Object g() {
            c cVarD;
            try {
                if (h.this.f4417b) {
                    A();
                }
                cVarD = D();
            } catch (Throwable th) {
                throw th;
            }
            return cVarD != null ? cVarD.g() : null;
        }

        /* JADX INFO: renamed from: Y0.h$a$a, reason: collision with other inner class name */
        private class C0104a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f4425a;

            public C0104a(int i7) {
                this.f4425a = i7;
            }

            @Override // Y0.e
            public void a(c cVar) {
                if (cVar.a()) {
                    a.this.H(this.f4425a, cVar);
                } else if (cVar.b()) {
                    a.this.G(this.f4425a, cVar);
                }
            }

            @Override // Y0.e
            public void b(c cVar) {
                if (this.f4425a == 0) {
                    a.this.s(cVar.d());
                }
            }

            @Override // Y0.e
            public void c(c cVar) {
                a.this.G(this.f4425a, cVar);
            }

            @Override // Y0.e
            public void d(c cVar) {
            }
        }
    }
}
