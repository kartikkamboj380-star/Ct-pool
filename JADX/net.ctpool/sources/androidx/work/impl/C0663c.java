package androidx.work.impl;

import androidx.room.u;

/* JADX INFO: renamed from: androidx.work.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663c extends u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0663c f9408a = new C0663c();

    private C0663c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.u.b
    public void c(Z.g gVar) {
        w5.k.f(gVar, "db");
        super.c(gVar);
        gVar.q();
        try {
            gVar.u(e());
            gVar.d0();
        } finally {
            gVar.s0();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - z.f9529a;
    }
}
