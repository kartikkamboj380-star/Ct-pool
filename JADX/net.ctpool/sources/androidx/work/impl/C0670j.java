package androidx.work.impl;

/* JADX INFO: renamed from: androidx.work.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0670j extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0670j f9443c = new C0670j();

    private C0670j() {
        super(3, 4);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
