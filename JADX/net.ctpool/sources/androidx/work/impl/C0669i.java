package androidx.work.impl;

/* JADX INFO: renamed from: androidx.work.impl.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0669i extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0669i f9442c = new C0669i();

    private C0669i() {
        super(1, 2);
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        gVar.u("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        gVar.u("DROP TABLE IF EXISTS alarmInfo");
        gVar.u("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
