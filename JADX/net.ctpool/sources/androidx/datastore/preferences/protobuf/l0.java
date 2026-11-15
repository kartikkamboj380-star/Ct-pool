package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class l0 {
    l0() {
    }

    abstract void a(Object obj, int i7, int i8);

    abstract void b(Object obj, int i7, long j7);

    abstract void c(Object obj, int i7, Object obj2);

    abstract void d(Object obj, int i7, AbstractC0612g abstractC0612g);

    abstract void e(Object obj, int i7, long j7);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final void l(Object obj, d0 d0Var) {
        while (d0Var.z() != Integer.MAX_VALUE && m(obj, d0Var)) {
        }
    }

    final boolean m(Object obj, d0 d0Var) throws C0630z {
        int iT = d0Var.t();
        int iA = r0.a(iT);
        int iB = r0.b(iT);
        if (iB == 0) {
            e(obj, iA, d0Var.M());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, d0Var.d());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, d0Var.C());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C0630z.d();
            }
            a(obj, iA, d0Var.h());
            return true;
        }
        Object objN = n();
        int iC = r0.c(iA, 4);
        l(objN, d0Var);
        if (iC != d0Var.t()) {
            throw C0630z.a();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(d0 d0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, s0 s0Var);

    abstract void t(Object obj, s0 s0Var);
}
