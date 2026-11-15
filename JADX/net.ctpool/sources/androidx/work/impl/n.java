package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public final class n extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f9447c = new n();

    private n() {
        super(8, 9);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
