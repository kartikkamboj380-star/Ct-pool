package G5;

import C5.f;
import C5.g;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(long j7, int i7) {
        return a.l((j7 << 1) + ((long) i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j7) {
        return a.l((j7 << 1) + 1);
    }

    private static final long f(long j7) {
        return a.l(j7 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j7) {
        return j7 * ((long) 1000000);
    }

    public static final long h(int i7, d dVar) {
        k.f(dVar, "unit");
        return dVar.compareTo(d.f1278q) <= 0 ? f(e.b(i7, dVar, d.f1275n)) : i(i7, dVar);
    }

    public static final long i(long j7, d dVar) {
        k.f(dVar, "unit");
        d dVar2 = d.f1275n;
        long jB = e.b(4611686018426999999L, dVar2, dVar);
        return new f(-jB, jB).k(j7) ? f(e.b(j7, dVar, dVar2)) : e(g.i(e.a(j7, dVar, d.f1277p), -4611686018427387903L, 4611686018427387903L));
    }
}
