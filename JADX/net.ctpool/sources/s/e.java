package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r.e;
import s.C2032b;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r.f f22155a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r.f f22158d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22156b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22157c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f22159e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f22160f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2032b.InterfaceC0309b f22161g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2032b.a f22162h = new C2032b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList f22163i = new ArrayList();

    public e(r.f fVar) {
        this.f22155a = fVar;
        this.f22158d = fVar;
    }

    private void a(f fVar, int i7, int i8, f fVar2, ArrayList arrayList, k kVar) {
        m mVar = fVar.f22167d;
        if (mVar.f22201c == null) {
            r.f fVar3 = this.f22155a;
            if (mVar == fVar3.f21972e || mVar == fVar3.f21974f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i8);
                arrayList.add(kVar);
            }
            mVar.f22201c = kVar;
            kVar.a(mVar);
            for (d dVar : mVar.f22206h.f22174k) {
                if (dVar instanceof f) {
                    a((f) dVar, i7, 0, fVar2, arrayList, kVar);
                }
            }
            for (d dVar2 : mVar.f22207i.f22174k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i7, 1, fVar2, arrayList, kVar);
                }
            }
            if (i7 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f22196k.f22174k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i7, 2, fVar2, arrayList, kVar);
                    }
                }
            }
            for (f fVar4 : mVar.f22206h.f22175l) {
                if (fVar4 == fVar2) {
                    kVar.f22190b = true;
                }
                a(fVar4, i7, 0, fVar2, arrayList, kVar);
            }
            for (f fVar5 : mVar.f22207i.f22175l) {
                if (fVar5 == fVar2) {
                    kVar.f22190b = true;
                }
                a(fVar5, i7, 1, fVar2, arrayList, kVar);
            }
            if (i7 == 1 && (mVar instanceof l)) {
                Iterator it = ((l) mVar).f22196k.f22175l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i7, 2, fVar2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(r.f fVar) {
        int iN;
        e.b bVar;
        int iT;
        e.b bVar2;
        e eVar;
        r.e eVar2;
        e.b[] bVarArr;
        e.b bVar3;
        g gVar;
        int iT2;
        e.b bVar4;
        e.b bVar5;
        for (r.e eVar3 : fVar.f22051w0) {
            e.b[] bVarArr2 = eVar3.f21950M;
            e.b bVar6 = bVarArr2[0];
            e.b bVar7 = bVarArr2[1];
            if (eVar3.M() != 8) {
                if (eVar3.f21996q < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar3.f21986l = 2;
                }
                if (eVar3.f22002t < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    eVar3.f21988m = 2;
                }
                if (eVar3.r() > 0.0f) {
                    e.b bVar8 = e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        eVar3.f21986l = 3;
                    } else if (bVar7 != bVar8 || (bVar6 != e.b.WRAP_CONTENT && bVar6 != e.b.FIXED)) {
                        if (bVar6 == bVar8 && bVar7 == bVar8) {
                            if (eVar3.f21986l == 0) {
                                eVar3.f21986l = 3;
                            }
                            if (eVar3.f21988m == 0) {
                                eVar3.f21988m = 3;
                            }
                        }
                    }
                }
                e.b bVar9 = e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar3.f21986l == 1 && (eVar3.f21939B.f21922d == null || eVar3.f21941D.f21922d == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                if (bVar7 == bVar9 && eVar3.f21988m == 1 && (eVar3.f21940C.f21922d == null || eVar3.f21942E.f21922d == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                e.b bVar11 = bVar7;
                j jVar = eVar3.f21972e;
                jVar.f22202d = bVar10;
                int i7 = eVar3.f21986l;
                jVar.f22199a = i7;
                l lVar = eVar3.f21974f;
                lVar.f22202d = bVar11;
                int i8 = eVar3.f21988m;
                lVar.f22199a = i8;
                e.b bVar12 = e.b.MATCH_PARENT;
                if ((bVar10 == bVar12 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT) && (bVar11 == bVar12 || bVar11 == e.b.FIXED || bVar11 == e.b.WRAP_CONTENT)) {
                    int iN2 = eVar3.N();
                    if (bVar10 == bVar12) {
                        iN = (fVar.N() - eVar3.f21939B.f21923e) - eVar3.f21941D.f21923e;
                        bVar = e.b.FIXED;
                    } else {
                        iN = iN2;
                        bVar = bVar10;
                    }
                    int iT3 = eVar3.t();
                    if (bVar11 == bVar12) {
                        iT = (fVar.t() - eVar3.f21940C.f21923e) - eVar3.f21942E.f21923e;
                        bVar2 = e.b.FIXED;
                    } else {
                        iT = iT3;
                        bVar2 = bVar11;
                    }
                    eVar = this;
                    eVar2 = eVar3;
                    eVar.l(eVar2, bVar, iN, bVar2, iT);
                    eVar3.f21972e.f22203e.d(eVar3.N());
                    eVar3.f21974f.f22203e.d(eVar3.t());
                } else if (bVar10 == bVar9 && (bVar11 == (bVar5 = e.b.WRAP_CONTENT) || bVar11 == e.b.FIXED)) {
                    if (i7 == 3) {
                        if (bVar11 == bVar5) {
                            l(eVar3, bVar5, 0, bVar5, 0);
                        }
                        iT = eVar3.t();
                        iN = (int) ((iT * eVar3.f21954Q) + 0.5f);
                        bVar2 = e.b.FIXED;
                        eVar = this;
                        eVar2 = eVar3;
                        bVar = bVar2;
                        eVar.l(eVar2, bVar, iN, bVar2, iT);
                        eVar3.f21972e.f22203e.d(eVar3.N());
                        eVar3.f21974f.f22203e.d(eVar3.t());
                    } else if (i7 == 1) {
                        l(eVar3, bVar5, 0, bVar11, 0);
                        gVar = eVar3.f21972e.f22203e;
                        iT2 = eVar3.N();
                        gVar.f22185m = iT2;
                    } else if (i7 == 2) {
                        e.b bVar13 = fVar.f21950M[0];
                        bVar5 = e.b.FIXED;
                        if (bVar13 == bVar5 || bVar13 == bVar12) {
                            iN = (int) ((eVar3.f21996q * fVar.N()) + 0.5f);
                            iT = eVar3.t();
                            eVar = this;
                            eVar2 = eVar3;
                            bVar = bVar5;
                            bVar2 = bVar11;
                            eVar.l(eVar2, bVar, iN, bVar2, iT);
                            eVar3.f21972e.f22203e.d(eVar3.N());
                            eVar3.f21974f.f22203e.d(eVar3.t());
                        }
                        if (bVar11 == bVar9) {
                            if (bVar10 == bVar9) {
                            }
                        }
                    } else {
                        r.d[] dVarArr = eVar3.f21947J;
                        if (dVarArr[0].f21922d == null || dVarArr[1].f21922d == null) {
                            iN = 0;
                            iT = 0;
                            eVar = this;
                            eVar2 = eVar3;
                            bVar = bVar5;
                            bVar2 = bVar11;
                            eVar.l(eVar2, bVar, iN, bVar2, iT);
                            eVar3.f21972e.f22203e.d(eVar3.N());
                            eVar3.f21974f.f22203e.d(eVar3.t());
                        }
                        if (bVar11 == bVar9) {
                        }
                    }
                } else if (bVar11 == bVar9 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                    if (i8 == 3) {
                        if (bVar10 == bVar4) {
                            l(eVar3, bVar4, 0, bVar4, 0);
                        }
                        iN = eVar3.N();
                        float f7 = eVar3.f21954Q;
                        if (eVar3.s() == -1) {
                            f7 = 1.0f / f7;
                        }
                        iT = (int) ((iN * f7) + 0.5f);
                        bVar2 = e.b.FIXED;
                        eVar = this;
                        eVar2 = eVar3;
                        bVar = bVar2;
                        eVar.l(eVar2, bVar, iN, bVar2, iT);
                        eVar3.f21972e.f22203e.d(eVar3.N());
                        eVar3.f21974f.f22203e.d(eVar3.t());
                    } else if (i8 == 1) {
                        l(eVar3, bVar10, 0, bVar4, 0);
                        gVar = eVar3.f21974f.f22203e;
                        iT2 = eVar3.t();
                        gVar.f22185m = iT2;
                    } else {
                        if (i8 == 2) {
                            e.b bVar14 = fVar.f21950M[1];
                            bVar2 = e.b.FIXED;
                            if (bVar14 == bVar2 || bVar14 == bVar12) {
                                float f8 = eVar3.f22002t;
                                iN = eVar3.N();
                                eVar = this;
                                eVar2 = eVar3;
                                bVar = bVar10;
                                iT = (int) ((f8 * fVar.t()) + 0.5f);
                                eVar.l(eVar2, bVar, iN, bVar2, iT);
                                eVar3.f21972e.f22203e.d(eVar3.N());
                                eVar3.f21974f.f22203e.d(eVar3.t());
                            }
                        } else {
                            r.d[] dVarArr2 = eVar3.f21947J;
                            if (dVarArr2[2].f21922d == null || dVarArr2[3].f21922d == null) {
                                iN = 0;
                                iT = 0;
                                eVar = this;
                                eVar2 = eVar3;
                                bVar = bVar4;
                                bVar2 = bVar11;
                                eVar.l(eVar2, bVar, iN, bVar2, iT);
                                eVar3.f21972e.f22203e.d(eVar3.N());
                                eVar3.f21974f.f22203e.d(eVar3.t());
                            }
                        }
                        if (bVar10 == bVar9) {
                        }
                    }
                } else if (bVar10 == bVar9 && bVar11 == bVar9) {
                    if (i7 == 1 || i8 == 1) {
                        e.b bVar15 = e.b.WRAP_CONTENT;
                        l(eVar3, bVar15, 0, bVar15, 0);
                        eVar3.f21972e.f22203e.f22185m = eVar3.N();
                        gVar = eVar3.f21974f.f22203e;
                        iT2 = eVar3.t();
                        gVar.f22185m = iT2;
                    } else if (i8 == 2 && i7 == 2 && ((bVar3 = (bVarArr = fVar.f21950M)[0]) == (bVar2 = e.b.FIXED) || bVar3 == bVar2)) {
                        e.b bVar16 = bVarArr[1];
                        if (bVar16 == bVar2 || bVar16 == bVar2) {
                            float f9 = eVar3.f21996q;
                            iN = (int) ((f9 * fVar.N()) + 0.5f);
                            iT = (int) ((eVar3.f22002t * fVar.t()) + 0.5f);
                            eVar = this;
                            eVar2 = eVar3;
                            bVar = bVar2;
                            eVar.l(eVar2, bVar, iN, bVar2, iT);
                            eVar3.f21972e.f22203e.d(eVar3.N());
                            eVar3.f21974f.f22203e.d(eVar3.t());
                        }
                    }
                }
            }
            eVar3.f21964a = true;
        }
        return false;
    }

    private int e(r.f fVar, int i7) {
        int size = this.f22163i.size();
        long jMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            jMax = Math.max(jMax, ((k) this.f22163i.get(i8)).b(fVar, i7));
        }
        return (int) jMax;
    }

    private void i(m mVar, int i7, ArrayList arrayList) {
        for (d dVar : mVar.f22206h.f22174k) {
            if (dVar instanceof f) {
                a((f) dVar, i7, 0, mVar.f22207i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f22206h, i7, 0, mVar.f22207i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f22207i.f22174k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i7, 1, mVar.f22206h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f22207i, i7, 1, mVar.f22206h, arrayList, null);
            }
        }
        if (i7 == 1) {
            for (d dVar3 : ((l) mVar).f22196k.f22174k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i7, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(r.e eVar, e.b bVar, int i7, e.b bVar2, int i8) {
        C2032b.a aVar = this.f22162h;
        aVar.f22143a = bVar;
        aVar.f22144b = bVar2;
        aVar.f22145c = i7;
        aVar.f22146d = i8;
        this.f22161g.b(eVar, aVar);
        eVar.A0(this.f22162h.f22147e);
        eVar.e0(this.f22162h.f22148f);
        eVar.d0(this.f22162h.f22150h);
        eVar.Y(this.f22162h.f22149g);
    }

    public void c() {
        d(this.f22159e);
        this.f22163i.clear();
        k.f22188h = 0;
        i(this.f22155a.f21972e, 0, this.f22163i);
        i(this.f22155a.f21974f, 1, this.f22163i);
        this.f22156b = false;
    }

    public void d(ArrayList arrayList) {
        m hVar;
        arrayList.clear();
        this.f22158d.f21972e.f();
        this.f22158d.f21974f.f();
        arrayList.add(this.f22158d.f21972e);
        arrayList.add(this.f22158d.f21974f);
        HashSet hashSet = null;
        for (r.e eVar : this.f22158d.f22051w0) {
            if (eVar instanceof r.g) {
                hVar = new h(eVar);
            } else {
                if (eVar.T()) {
                    if (eVar.f21968c == null) {
                        eVar.f21968c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f21968c);
                } else {
                    arrayList.add(eVar.f21972e);
                }
                if (eVar.V()) {
                    if (eVar.f21970d == null) {
                        eVar.f21970d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f21970d);
                } else {
                    arrayList.add(eVar.f21974f);
                }
                if (eVar instanceof r.i) {
                    hVar = new i(eVar);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar = (m) it2.next();
            if (mVar.f22200b != this.f22158d) {
                mVar.d();
            }
        }
    }

    public boolean f(boolean z6) {
        boolean z7;
        boolean z8 = false;
        if (this.f22156b || this.f22157c) {
            for (r.e eVar : this.f22155a.f22051w0) {
                eVar.f21964a = false;
                eVar.f21972e.r();
                eVar.f21974f.q();
            }
            r.f fVar = this.f22155a;
            fVar.f21964a = false;
            fVar.f21972e.r();
            this.f22155a.f21974f.q();
            this.f22157c = false;
        }
        if (b(this.f22158d)) {
            return false;
        }
        this.f22155a.B0(0);
        this.f22155a.C0(0);
        e.b bVarQ = this.f22155a.q(0);
        e.b bVarQ2 = this.f22155a.q(1);
        if (this.f22156b) {
            c();
        }
        int iO = this.f22155a.O();
        int iP = this.f22155a.P();
        this.f22155a.f21972e.f22206h.d(iO);
        this.f22155a.f21974f.f22206h.d(iP);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarQ == bVar || bVarQ2 == bVar) {
            if (z6) {
                Iterator it = this.f22159e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((m) it.next()).m()) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6 && bVarQ == e.b.WRAP_CONTENT) {
                this.f22155a.i0(e.b.FIXED);
                r.f fVar2 = this.f22155a;
                fVar2.A0(e(fVar2, 0));
                r.f fVar3 = this.f22155a;
                fVar3.f21972e.f22203e.d(fVar3.N());
            }
            if (z6 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f22155a.w0(e.b.FIXED);
                r.f fVar4 = this.f22155a;
                fVar4.e0(e(fVar4, 1));
                r.f fVar5 = this.f22155a;
                fVar5.f21974f.f22203e.d(fVar5.t());
            }
        }
        r.f fVar6 = this.f22155a;
        e.b bVar2 = fVar6.f21950M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iN = fVar6.N() + iO;
            this.f22155a.f21972e.f22207i.d(iN);
            this.f22155a.f21972e.f22203e.d(iN - iO);
            m();
            r.f fVar7 = this.f22155a;
            e.b bVar4 = fVar7.f21950M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iT = fVar7.t() + iP;
                this.f22155a.f21974f.f22207i.d(iT);
                this.f22155a.f21974f.f22203e.d(iT - iP);
            }
            m();
            z7 = true;
        } else {
            z7 = false;
        }
        for (m mVar : this.f22159e) {
            if (mVar.f22200b != this.f22155a || mVar.f22205g) {
                mVar.e();
            }
        }
        Iterator it2 = this.f22159e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z8 = true;
                break;
            }
            m mVar2 = (m) it2.next();
            if (z7 || mVar2.f22200b != this.f22155a) {
                if (!mVar2.f22206h.f22173j || ((!mVar2.f22207i.f22173j && !(mVar2 instanceof h)) || (!mVar2.f22203e.f22173j && !(mVar2 instanceof c) && !(mVar2 instanceof h)))) {
                    break;
                }
            }
        }
        this.f22155a.i0(bVarQ);
        this.f22155a.w0(bVarQ2);
        return z8;
    }

    public boolean g(boolean z6) {
        if (this.f22156b) {
            for (r.e eVar : this.f22155a.f22051w0) {
                eVar.f21964a = false;
                j jVar = eVar.f21972e;
                jVar.f22203e.f22173j = false;
                jVar.f22205g = false;
                jVar.r();
                l lVar = eVar.f21974f;
                lVar.f22203e.f22173j = false;
                lVar.f22205g = false;
                lVar.q();
            }
            r.f fVar = this.f22155a;
            fVar.f21964a = false;
            j jVar2 = fVar.f21972e;
            jVar2.f22203e.f22173j = false;
            jVar2.f22205g = false;
            jVar2.r();
            l lVar2 = this.f22155a.f21974f;
            lVar2.f22203e.f22173j = false;
            lVar2.f22205g = false;
            lVar2.q();
            c();
        }
        if (b(this.f22158d)) {
            return false;
        }
        this.f22155a.B0(0);
        this.f22155a.C0(0);
        this.f22155a.f21972e.f22206h.d(0);
        this.f22155a.f21974f.f22206h.d(0);
        return true;
    }

    public boolean h(boolean z6, int i7) {
        boolean z7;
        e.b bVar;
        g gVar;
        int iT;
        boolean z8 = false;
        e.b bVarQ = this.f22155a.q(0);
        e.b bVarQ2 = this.f22155a.q(1);
        int iO = this.f22155a.O();
        int iP = this.f22155a.P();
        if (z6 && (bVarQ == (bVar = e.b.WRAP_CONTENT) || bVarQ2 == bVar)) {
            Iterator it = this.f22159e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f22204f == i7 && !mVar.m()) {
                    z6 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z6 && bVarQ == e.b.WRAP_CONTENT) {
                    this.f22155a.i0(e.b.FIXED);
                    r.f fVar = this.f22155a;
                    fVar.A0(e(fVar, 0));
                    r.f fVar2 = this.f22155a;
                    gVar = fVar2.f21972e.f22203e;
                    iT = fVar2.N();
                    gVar.d(iT);
                }
            } else if (z6 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f22155a.w0(e.b.FIXED);
                r.f fVar3 = this.f22155a;
                fVar3.e0(e(fVar3, 1));
                r.f fVar4 = this.f22155a;
                gVar = fVar4.f21974f.f22203e;
                iT = fVar4.t();
                gVar.d(iT);
            }
        }
        r.f fVar5 = this.f22155a;
        if (i7 == 0) {
            e.b bVar2 = fVar5.f21950M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iN = fVar5.N() + iO;
                this.f22155a.f21972e.f22207i.d(iN);
                this.f22155a.f21972e.f22203e.d(iN - iO);
                z7 = true;
            }
            z7 = false;
        } else {
            e.b bVar3 = fVar5.f21950M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iT2 = fVar5.t() + iP;
                this.f22155a.f21974f.f22207i.d(iT2);
                this.f22155a.f21974f.f22203e.d(iT2 - iP);
                z7 = true;
            }
            z7 = false;
        }
        m();
        for (m mVar2 : this.f22159e) {
            if (mVar2.f22204f == i7 && (mVar2.f22200b != this.f22155a || mVar2.f22205g)) {
                mVar2.e();
            }
        }
        Iterator it2 = this.f22159e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z8 = true;
                break;
            }
            m mVar3 = (m) it2.next();
            if (mVar3.f22204f == i7 && (z7 || mVar3.f22200b != this.f22155a)) {
                if (!mVar3.f22206h.f22173j || !mVar3.f22207i.f22173j || (!(mVar3 instanceof c) && !mVar3.f22203e.f22173j)) {
                    break;
                }
            }
        }
        this.f22155a.i0(bVarQ);
        this.f22155a.w0(bVarQ2);
        return z8;
    }

    public void j() {
        this.f22156b = true;
    }

    public void k() {
        this.f22157c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m() {
        g gVar;
        int iN;
        g gVar2;
        int iN2;
        g gVar3;
        for (r.e eVar : this.f22155a.f22051w0) {
            if (!eVar.f21964a) {
                e.b[] bVarArr = eVar.f21950M;
                boolean z6 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i7 = eVar.f21986l;
                int i8 = eVar.f21988m;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z7 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i7 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i8 == 1)) {
                    z6 = true;
                }
                g gVar4 = eVar.f21972e.f22203e;
                boolean z8 = gVar4.f22173j;
                g gVar5 = eVar.f21974f.f22203e;
                boolean z9 = gVar5.f22173j;
                if (z8 && z9) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar4.f22170g, bVar4, gVar5.f22170g);
                } else if (z8 && z6) {
                    l(eVar, e.b.FIXED, gVar4.f22170g, bVar3, gVar5.f22170g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        gVar2 = eVar.f21974f.f22203e;
                        iN2 = eVar.t();
                        gVar2.f22185m = iN2;
                        if (eVar.f21964a) {
                        }
                    } else {
                        gVar = eVar.f21974f.f22203e;
                        iN = eVar.t();
                        gVar.d(iN);
                    }
                } else {
                    if (z9 && z7) {
                        l(eVar, bVar3, gVar4.f22170g, e.b.FIXED, gVar5.f22170g);
                        if (bVar == e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.f21972e.f22203e;
                            iN2 = eVar.N();
                            gVar2.f22185m = iN2;
                        } else {
                            gVar = eVar.f21972e.f22203e;
                            iN = eVar.N();
                            gVar.d(iN);
                        }
                    }
                    if (eVar.f21964a && (gVar3 = eVar.f21974f.f22197l) != null) {
                        gVar3.d(eVar.l());
                    }
                }
                eVar.f21964a = true;
                if (eVar.f21964a) {
                }
            }
        }
    }

    public void n(C2032b.InterfaceC0309b interfaceC0309b) {
        this.f22161g = interfaceC0309b;
    }
}
