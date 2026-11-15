package s;

import java.util.Iterator;
import r.C2004a;
import s.f;

/* JADX INFO: loaded from: classes.dex */
class i extends m {
    public i(r.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f22206h.f22174k.add(fVar);
        fVar.f22175l.add(this.f22206h);
    }

    @Override // s.m, s.d
    public void a(d dVar) {
        C2004a c2004a = (C2004a) this.f22200b;
        int iH0 = c2004a.H0();
        Iterator it = this.f22206h.f22175l.iterator();
        int i7 = 0;
        int i8 = -1;
        while (it.hasNext()) {
            int i9 = ((f) it.next()).f22170g;
            if (i8 == -1 || i9 < i8) {
                i8 = i9;
            }
            if (i7 < i9) {
                i7 = i9;
            }
        }
        if (iH0 == 0 || iH0 == 2) {
            this.f22206h.d(i8 + c2004a.I0());
        } else {
            this.f22206h.d(i7 + c2004a.I0());
        }
    }

    @Override // s.m
    void d() {
        m mVar;
        r.e eVar = this.f22200b;
        if (eVar instanceof C2004a) {
            this.f22206h.f22165b = true;
            C2004a c2004a = (C2004a) eVar;
            int iH0 = c2004a.H0();
            boolean zG0 = c2004a.G0();
            int i7 = 0;
            if (iH0 == 0) {
                this.f22206h.f22168e = f.a.LEFT;
                while (i7 < c2004a.f22049x0) {
                    r.e eVar2 = c2004a.f22048w0[i7];
                    if (zG0 || eVar2.M() != 8) {
                        f fVar = eVar2.f21972e.f22206h;
                        fVar.f22174k.add(this.f22206h);
                        this.f22206h.f22175l.add(fVar);
                    }
                    i7++;
                }
            } else {
                if (iH0 != 1) {
                    if (iH0 == 2) {
                        this.f22206h.f22168e = f.a.TOP;
                        while (i7 < c2004a.f22049x0) {
                            r.e eVar3 = c2004a.f22048w0[i7];
                            if (zG0 || eVar3.M() != 8) {
                                f fVar2 = eVar3.f21974f.f22206h;
                                fVar2.f22174k.add(this.f22206h);
                                this.f22206h.f22175l.add(fVar2);
                            }
                            i7++;
                        }
                    } else {
                        if (iH0 != 3) {
                            return;
                        }
                        this.f22206h.f22168e = f.a.BOTTOM;
                        while (i7 < c2004a.f22049x0) {
                            r.e eVar4 = c2004a.f22048w0[i7];
                            if (zG0 || eVar4.M() != 8) {
                                f fVar3 = eVar4.f21974f.f22207i;
                                fVar3.f22174k.add(this.f22206h);
                                this.f22206h.f22175l.add(fVar3);
                            }
                            i7++;
                        }
                    }
                    q(this.f22200b.f21974f.f22206h);
                    mVar = this.f22200b.f21974f;
                    q(mVar.f22207i);
                }
                this.f22206h.f22168e = f.a.RIGHT;
                while (i7 < c2004a.f22049x0) {
                    r.e eVar5 = c2004a.f22048w0[i7];
                    if (zG0 || eVar5.M() != 8) {
                        f fVar4 = eVar5.f21972e.f22207i;
                        fVar4.f22174k.add(this.f22206h);
                        this.f22206h.f22175l.add(fVar4);
                    }
                    i7++;
                }
            }
            q(this.f22200b.f21972e.f22206h);
            mVar = this.f22200b.f21972e;
            q(mVar.f22207i);
        }
    }

    @Override // s.m
    public void e() {
        r.e eVar = this.f22200b;
        if (eVar instanceof C2004a) {
            int iH0 = ((C2004a) eVar).H0();
            if (iH0 == 0 || iH0 == 1) {
                this.f22200b.B0(this.f22206h.f22170g);
            } else {
                this.f22200b.C0(this.f22206h.f22170g);
            }
        }
    }

    @Override // s.m
    void f() {
        this.f22201c = null;
        this.f22206h.c();
    }

    @Override // s.m
    boolean m() {
        return false;
    }
}
