package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public final class m extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f9446c = new m();

    private m() {
        super(7, 8);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
