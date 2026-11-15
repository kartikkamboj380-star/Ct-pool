package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public final class l extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f9445c = new l();

    private l() {
        super(6, 7);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
