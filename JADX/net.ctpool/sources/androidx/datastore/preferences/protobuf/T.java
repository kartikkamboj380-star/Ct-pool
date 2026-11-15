package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class T implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f7559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f7560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0621p f7562d;

    private T(l0 l0Var, AbstractC0621p abstractC0621p, O o6) {
        this.f7560b = l0Var;
        this.f7561c = abstractC0621p.e(o6);
        this.f7562d = abstractC0621p;
        this.f7559a = o6;
    }

    private int j(l0 l0Var, Object obj) {
        return l0Var.i(l0Var.g(obj));
    }

    private void k(l0 l0Var, AbstractC0621p abstractC0621p, Object obj, d0 d0Var, C0620o c0620o) {
        Object objF = l0Var.f(obj);
        C0623s c0623sD = abstractC0621p.d(obj);
        while (d0Var.z() != Integer.MAX_VALUE) {
            try {
                if (!m(d0Var, c0620o, abstractC0621p, c0623sD, l0Var, objF)) {
                    return;
                }
            } finally {
                l0Var.o(obj, objF);
            }
        }
    }

    static T l(l0 l0Var, AbstractC0621p abstractC0621p, O o6) {
        return new T(l0Var, abstractC0621p, o6);
    }

    private boolean m(d0 d0Var, C0620o c0620o, AbstractC0621p abstractC0621p, C0623s c0623s, l0 l0Var, Object obj) throws C0630z {
        int iT = d0Var.t();
        if (iT != r0.f7705a) {
            if (r0.b(iT) != 2) {
                return d0Var.G();
            }
            Object objB = abstractC0621p.b(c0620o, this.f7559a, r0.a(iT));
            if (objB == null) {
                return l0Var.m(obj, d0Var);
            }
            abstractC0621p.h(d0Var, objB, c0620o, c0623s);
            return true;
        }
        Object objB2 = null;
        int iL = 0;
        AbstractC0612g abstractC0612gC = null;
        while (d0Var.z() != Integer.MAX_VALUE) {
            int iT2 = d0Var.t();
            if (iT2 == r0.f7707c) {
                iL = d0Var.l();
                objB2 = abstractC0621p.b(c0620o, this.f7559a, iL);
            } else if (iT2 == r0.f7708d) {
                if (objB2 != null) {
                    abstractC0621p.h(d0Var, objB2, c0620o, c0623s);
                } else {
                    abstractC0612gC = d0Var.C();
                }
            } else if (!d0Var.G()) {
                break;
            }
        }
        if (d0Var.t() != r0.f7706b) {
            throw C0630z.a();
        }
        if (abstractC0612gC != null) {
            if (objB2 != null) {
                abstractC0621p.i(abstractC0612gC, objB2, c0620o, c0623s);
            } else {
                l0Var.d(obj, iL, abstractC0612gC);
            }
        }
        return true;
    }

    private void n(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.s(l0Var.g(obj), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        g0.F(this.f7560b, obj, obj2);
        if (this.f7561c) {
            g0.D(this.f7562d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj, d0 d0Var, C0620o c0620o) {
        k(this.f7560b, this.f7562d, obj, d0Var, c0620o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(Object obj) {
        this.f7560b.j(obj);
        this.f7562d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean d(Object obj) {
        return this.f7562d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(Object obj, s0 s0Var) {
        Iterator itN = this.f7562d.c(obj).n();
        if (itN.hasNext()) {
            androidx.appcompat.app.y.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f7560b, obj, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean f(Object obj, Object obj2) {
        if (!this.f7560b.g(obj).equals(this.f7560b.g(obj2))) {
            return false;
        }
        if (this.f7561c) {
            return this.f7562d.c(obj).equals(this.f7562d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(Object obj) {
        int iJ = j(this.f7560b, obj);
        return this.f7561c ? iJ + this.f7562d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object h() {
        return this.f7559a.e().B0();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int i(Object obj) {
        int iHashCode = this.f7560b.g(obj).hashCode();
        return this.f7561c ? (iHashCode * 53) + this.f7562d.c(obj).hashCode() : iHashCode;
    }
}
