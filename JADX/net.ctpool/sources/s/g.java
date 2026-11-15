package s;

import s.f;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22185m;

    public g(m mVar) {
        super(mVar);
        this.f22168e = mVar instanceof j ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // s.f
    public void d(int i7) {
        if (this.f22173j) {
            return;
        }
        this.f22173j = true;
        this.f22170g = i7;
        for (d dVar : this.f22174k) {
            dVar.a(dVar);
        }
    }
}
