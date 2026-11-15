package androidx.work.impl;

import l0.l;

/* JADX INFO: loaded from: classes.dex */
public class o implements l0.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.q f9448c = new androidx.lifecycle.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f9449d = androidx.work.impl.utils.futures.c.t();

    public o() {
        a(l0.l.f21053b);
    }

    public void a(l.b bVar) {
        this.f9448c.l(bVar);
        if (bVar instanceof l.b.c) {
            this.f9449d.p((l.b.c) bVar);
        } else if (bVar instanceof l.b.a) {
            this.f9449d.q(((l.b.a) bVar).a());
        }
    }
}
