package r;

import q.C1982d;
import r.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f22050a = new boolean[3];

    static void a(f fVar, C1982d c1982d, e eVar) {
        eVar.f21982j = -1;
        eVar.f21984k = -1;
        e.b bVar = fVar.f21950M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f21950M[0] == e.b.MATCH_PARENT) {
            int i7 = eVar.f21939B.f21923e;
            int iN = fVar.N() - eVar.f21941D.f21923e;
            d dVar = eVar.f21939B;
            dVar.f21925g = c1982d.q(dVar);
            d dVar2 = eVar.f21941D;
            dVar2.f21925g = c1982d.q(dVar2);
            c1982d.f(eVar.f21939B.f21925g, i7);
            c1982d.f(eVar.f21941D.f21925g, iN);
            eVar.f21982j = 2;
            eVar.h0(i7, iN);
        }
        if (fVar.f21950M[1] == bVar2 || eVar.f21950M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i8 = eVar.f21940C.f21923e;
        int iT = fVar.t() - eVar.f21942E.f21923e;
        d dVar3 = eVar.f21940C;
        dVar3.f21925g = c1982d.q(dVar3);
        d dVar4 = eVar.f21942E;
        dVar4.f21925g = c1982d.q(dVar4);
        c1982d.f(eVar.f21940C.f21925g, i8);
        c1982d.f(eVar.f21942E.f21925g, iT);
        if (eVar.f21962Y > 0 || eVar.M() == 8) {
            d dVar5 = eVar.f21943F;
            dVar5.f21925g = c1982d.q(dVar5);
            c1982d.f(eVar.f21943F.f21925g, eVar.f21962Y + i8);
        }
        eVar.f21984k = 2;
        eVar.v0(i8, iT);
    }

    public static final boolean b(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
