package Y0;

import O0.j;
import O0.l;
import O0.o;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4410a;

    private g(List list) {
        l.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f4410a = list;
    }

    public static g b(List list) {
        return new g(list);
    }

    @Override // O0.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return j.a(this.f4410a, ((g) obj).f4410a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4410a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f4410a).toString();
    }

    private class a extends Y0.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f4411h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f4412i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f4413j = null;

        public a() {
            if (H()) {
                return;
            }
            p(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c B() {
            return this.f4413j;
        }

        private synchronized o C() {
            if (k() || this.f4411h >= g.this.f4410a.size()) {
                return null;
            }
            List list = g.this.f4410a;
            int i7 = this.f4411h;
            this.f4411h = i7 + 1;
            return (o) list.get(i7);
        }

        private void D(c cVar, boolean z6) {
            c cVar2;
            synchronized (this) {
                if (cVar == this.f4412i && cVar != (cVar2 = this.f4413j)) {
                    if (cVar2 == null || z6) {
                        this.f4413j = cVar;
                    } else {
                        cVar2 = null;
                    }
                    A(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(c cVar) {
            if (z(cVar)) {
                if (cVar != B()) {
                    A(cVar);
                }
                if (H()) {
                    return;
                }
                q(cVar.c(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(c cVar) {
            D(cVar, cVar.b());
            if (cVar == B()) {
                u(null, cVar.b(), cVar.getExtras());
            }
        }

        private synchronized boolean G(c cVar) {
            if (k()) {
                return false;
            }
            this.f4412i = cVar;
            return true;
        }

        private boolean H() {
            o oVarC = C();
            c cVar = oVarC != null ? (c) oVarC.get() : null;
            if (!G(cVar) || cVar == null) {
                A(cVar);
                return false;
            }
            cVar.e(new C0103a(), M0.a.a());
            return true;
        }

        private synchronized boolean z(c cVar) {
            if (!k() && cVar == this.f4412i) {
                this.f4412i = null;
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
        @Override // Y0.a, Y0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public synchronized boolean a() {
            boolean z6;
            c cVarB = B();
            if (cVarB != null) {
                z6 = cVarB.a();
            }
            return z6;
        }

        @Override // Y0.a, Y0.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f4412i;
                    this.f4412i = null;
                    c cVar2 = this.f4413j;
                    this.f4413j = null;
                    A(cVar2);
                    A(cVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Y0.a, Y0.c
        public synchronized Object g() {
            c cVarB;
            cVarB = B();
            return cVarB != null ? cVarB.g() : null;
        }

        /* JADX INFO: renamed from: Y0.g$a$a, reason: collision with other inner class name */
        private class C0103a implements e {
            private C0103a() {
            }

            @Override // Y0.e
            public void a(c cVar) {
                if (cVar.a()) {
                    a.this.F(cVar);
                } else if (cVar.b()) {
                    a.this.E(cVar);
                }
            }

            @Override // Y0.e
            public void b(c cVar) {
                a.this.s(Math.max(a.this.d(), cVar.d()));
            }

            @Override // Y0.e
            public void c(c cVar) {
                a.this.E(cVar);
            }

            @Override // Y0.e
            public void d(c cVar) {
            }
        }
    }
}
