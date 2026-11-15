package s;

/* JADX INFO: loaded from: classes.dex */
class h extends m {
    public h(r.e eVar) {
        super(eVar);
        eVar.f21972e.f();
        eVar.f21974f.f();
        this.f22204f = ((r.g) eVar).G0();
    }

    private void q(f fVar) {
        this.f22206h.f22174k.add(fVar);
        fVar.f22175l.add(this.f22206h);
    }

    @Override // s.m, s.d
    public void a(d dVar) {
        f fVar = this.f22206h;
        if (fVar.f22166c && !fVar.f22173j) {
            this.f22206h.d((int) ((((f) fVar.f22175l.get(0)).f22170g * ((r.g) this.f22200b).J0()) + 0.5f));
        }
    }

    @Override // s.m
    void d() {
        f fVar;
        m mVar;
        f fVar2;
        r.g gVar = (r.g) this.f22200b;
        int iH0 = gVar.H0();
        int iI0 = gVar.I0();
        gVar.J0();
        if (gVar.G0() == 1) {
            f fVar3 = this.f22206h;
            if (iH0 != -1) {
                fVar3.f22175l.add(this.f22200b.f21951N.f21972e.f22206h);
                this.f22200b.f21951N.f21972e.f22206h.f22174k.add(this.f22206h);
                fVar2 = this.f22206h;
            } else if (iI0 != -1) {
                fVar3.f22175l.add(this.f22200b.f21951N.f21972e.f22207i);
                this.f22200b.f21951N.f21972e.f22207i.f22174k.add(this.f22206h);
                fVar2 = this.f22206h;
                iH0 = -iI0;
            } else {
                fVar3.f22165b = true;
                fVar3.f22175l.add(this.f22200b.f21951N.f21972e.f22207i);
                this.f22200b.f21951N.f21972e.f22207i.f22174k.add(this.f22206h);
                q(this.f22200b.f21972e.f22206h);
                mVar = this.f22200b.f21972e;
            }
            fVar2.f22169f = iH0;
            q(this.f22200b.f21972e.f22206h);
            mVar = this.f22200b.f21972e;
        } else {
            f fVar4 = this.f22206h;
            if (iH0 != -1) {
                fVar4.f22175l.add(this.f22200b.f21951N.f21974f.f22206h);
                this.f22200b.f21951N.f21974f.f22206h.f22174k.add(this.f22206h);
                fVar = this.f22206h;
            } else if (iI0 != -1) {
                fVar4.f22175l.add(this.f22200b.f21951N.f21974f.f22207i);
                this.f22200b.f21951N.f21974f.f22207i.f22174k.add(this.f22206h);
                fVar = this.f22206h;
                iH0 = -iI0;
            } else {
                fVar4.f22165b = true;
                fVar4.f22175l.add(this.f22200b.f21951N.f21974f.f22207i);
                this.f22200b.f21951N.f21974f.f22207i.f22174k.add(this.f22206h);
                q(this.f22200b.f21974f.f22206h);
                mVar = this.f22200b.f21974f;
            }
            fVar.f22169f = iH0;
            q(this.f22200b.f21974f.f22206h);
            mVar = this.f22200b.f21974f;
        }
        q(mVar.f22207i);
    }

    @Override // s.m
    public void e() {
        if (((r.g) this.f22200b).G0() == 1) {
            this.f22200b.B0(this.f22206h.f22170g);
        } else {
            this.f22200b.C0(this.f22206h.f22170g);
        }
    }

    @Override // s.m
    void f() {
        this.f22206h.c();
    }

    @Override // s.m
    boolean m() {
        return false;
    }
}
