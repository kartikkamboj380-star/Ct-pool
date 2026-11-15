package J2;

import java.util.Iterator;
import java.util.List;
import w5.k;
import y1.o;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1714a = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J2.a f1715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J2.a f1716b;

        public a(J2.a aVar, J2.a aVar2) {
            this.f1715a = aVar;
            this.f1716b = aVar2;
        }
    }

    private b() {
    }

    public static final a a(int i7, int i8, List list) {
        k.f(list, "sources");
        return b(i7, i8, list, 1.0d);
    }

    public static final a b(int i7, int i8, List list, double d7) {
        k.f(list, "sources");
        if (list.isEmpty()) {
            return new a(null, null);
        }
        if (list.size() == 1) {
            return new a((J2.a) list.get(0), null);
        }
        if (i7 <= 0 || i8 <= 0) {
            return new a(null, null);
        }
        y1.k kVarL = o.n().l();
        k.e(kVarL, "getImagePipeline(...)");
        double d8 = ((double) (i7 * i8)) * d7;
        Iterator it = list.iterator();
        double d9 = Double.MAX_VALUE;
        double d10 = Double.MAX_VALUE;
        J2.a aVar = null;
        J2.a aVar2 = null;
        while (it.hasNext()) {
            J2.a aVar3 = (J2.a) it.next();
            double dAbs = Math.abs(1.0d - (aVar3.c() / d8));
            if (dAbs < d9) {
                aVar2 = aVar3;
                d9 = dAbs;
            }
            if (dAbs < d10 && (kVarL.q(aVar3.f()) || kVarL.s(aVar3.f()))) {
                aVar = aVar3;
                d10 = dAbs;
            }
        }
        return new a(aVar2, (aVar == null || aVar2 == null || !k.b(aVar.d(), aVar2.d())) ? aVar : null);
    }
}
