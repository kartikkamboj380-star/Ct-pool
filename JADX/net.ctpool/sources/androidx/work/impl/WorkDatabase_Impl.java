package androidx.work.impl;

import X.e;
import Z.h;
import androidx.room.u;
import androidx.room.w;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q0.C1983A;
import q0.InterfaceC1986b;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile q0.v f9335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile InterfaceC1986b f9336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile q0.z f9337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile q0.j f9338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile q0.o f9339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile q0.r f9340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile q0.e f9341h;

    @Override // androidx.room.u
    public void clearAllTables() {
        super.assertNotMainThread();
        Z.g gVarL0 = super.getOpenHelper().l0();
        try {
            super.beginTransaction();
            gVarL0.u("PRAGMA defer_foreign_keys = TRUE");
            gVarL0.u("DELETE FROM `Dependency`");
            gVarL0.u("DELETE FROM `WorkSpec`");
            gVarL0.u("DELETE FROM `WorkTag`");
            gVarL0.u("DELETE FROM `SystemIdInfo`");
            gVarL0.u("DELETE FROM `WorkName`");
            gVarL0.u("DELETE FROM `WorkProgress`");
            gVarL0.u("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            gVarL0.o0("PRAGMA wal_checkpoint(FULL)").close();
            if (!gVarL0.I0()) {
                gVarL0.u("VACUUM");
            }
        }
    }

    @Override // androidx.room.u
    protected androidx.room.o createInvalidationTracker() {
        return new androidx.room.o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.u
    protected Z.h createOpenHelper(androidx.room.f fVar) {
        return fVar.f8948c.a(h.b.a(fVar.f8946a).d(fVar.f8947b).c(new androidx.room.w(fVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1986b e() {
        InterfaceC1986b interfaceC1986b;
        if (this.f9336c != null) {
            return this.f9336c;
        }
        synchronized (this) {
            try {
                if (this.f9336c == null) {
                    this.f9336c = new q0.c(this);
                }
                interfaceC1986b = this.f9336c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1986b;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q0.e f() {
        q0.e eVar;
        if (this.f9341h != null) {
            return this.f9341h;
        }
        synchronized (this) {
            try {
                if (this.f9341h == null) {
                    this.f9341h = new q0.f(this);
                }
                eVar = this.f9341h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q0.j g() {
        q0.j jVar;
        if (this.f9338e != null) {
            return this.f9338e;
        }
        synchronized (this) {
            try {
                if (this.f9338e == null) {
                    this.f9338e = new q0.k(this);
                }
                jVar = this.f9338e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.room.u
    public List getAutoMigrations(Map map) {
        return Arrays.asList(new C(), new D());
    }

    @Override // androidx.room.u
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.u
    protected Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(q0.v.class, q0.w.y());
        map.put(InterfaceC1986b.class, q0.c.e());
        map.put(q0.z.class, C1983A.e());
        map.put(q0.j.class, q0.k.h());
        map.put(q0.o.class, q0.p.c());
        map.put(q0.r.class, q0.s.c());
        map.put(q0.e.class, q0.f.c());
        map.put(q0.g.class, q0.h.a());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q0.o h() {
        q0.o oVar;
        if (this.f9339f != null) {
            return this.f9339f;
        }
        synchronized (this) {
            try {
                if (this.f9339f == null) {
                    this.f9339f = new q0.p(this);
                }
                oVar = this.f9339f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q0.r i() {
        q0.r rVar;
        if (this.f9340g != null) {
            return this.f9340g;
        }
        synchronized (this) {
            try {
                if (this.f9340g == null) {
                    this.f9340g = new q0.s(this);
                }
                rVar = this.f9340g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q0.v j() {
        q0.v vVar;
        if (this.f9335b != null) {
            return this.f9335b;
        }
        synchronized (this) {
            try {
                if (this.f9335b == null) {
                    this.f9335b = new q0.w(this);
                }
                vVar = this.f9335b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q0.z k() {
        q0.z zVar;
        if (this.f9337d != null) {
            return this.f9337d;
        }
        synchronized (this) {
            try {
                if (this.f9337d == null) {
                    this.f9337d = new C1983A(this);
                }
                zVar = this.f9337d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    class a extends w.b {
        a(int i7) {
            super(i7);
        }

        @Override // androidx.room.w.b
        public void createAllTables(Z.g gVar) {
            gVar.u("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // androidx.room.w.b
        public void dropAllTables(Z.g gVar) {
            gVar.u("DROP TABLE IF EXISTS `Dependency`");
            gVar.u("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.u("DROP TABLE IF EXISTS `WorkTag`");
            gVar.u("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.u("DROP TABLE IF EXISTS `WorkName`");
            gVar.u("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.u("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.u) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.u) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((u.b) ((androidx.room.u) WorkDatabase_Impl.this).mCallbacks.get(i7)).b(gVar);
                }
            }
        }

        @Override // androidx.room.w.b
        public void onCreate(Z.g gVar) {
            if (((androidx.room.u) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.u) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((u.b) ((androidx.room.u) WorkDatabase_Impl.this).mCallbacks.get(i7)).a(gVar);
                }
            }
        }

        @Override // androidx.room.w.b
        public void onOpen(Z.g gVar) {
            ((androidx.room.u) WorkDatabase_Impl.this).mDatabase = gVar;
            gVar.u("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            if (((androidx.room.u) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.u) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((u.b) ((androidx.room.u) WorkDatabase_Impl.this).mCallbacks.get(i7)).c(gVar);
                }
            }
        }

        @Override // androidx.room.w.b
        public void onPreMigrate(Z.g gVar) throws IOException {
            X.b.a(gVar);
        }

        @Override // androidx.room.w.b
        public w.c onValidateSchema(Z.g gVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new e.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.C0098e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new e.C0098e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            X.e eVar = new X.e("Dependency", map, hashSet, hashSet2);
            X.e eVarA = X.e.a(gVar, "Dependency");
            if (!eVar.equals(eVarA)) {
                return new w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }
            HashMap map2 = new HashMap(27);
            map2.put("id", new e.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new e.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new e.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new e.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new e.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new e.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new e.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new e.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new e.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new e.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new e.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new e.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new e.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new e.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new e.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new e.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new e.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new e.a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new e.a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("required_network_type", new e.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("requires_charging", new e.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new e.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new e.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new e.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new e.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new e.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new e.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new e.C0098e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new e.C0098e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            X.e eVar2 = new X.e("WorkSpec", map2, hashSet3, hashSet4);
            X.e eVarA2 = X.e.a(gVar, "WorkSpec");
            if (!eVar2.equals(eVarA2)) {
                return new w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new e.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.C0098e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            X.e eVar3 = new X.e("WorkTag", map3, hashSet5, hashSet6);
            X.e eVarA3 = X.e.a(gVar, "WorkTag");
            if (!eVar3.equals(eVarA3)) {
                return new w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new e.a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new e.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            X.e eVar4 = new X.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
            X.e eVarA4 = X.e.a(gVar, "SystemIdInfo");
            if (!eVar4.equals(eVarA4)) {
                return new w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new e.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new e.C0098e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            X.e eVar5 = new X.e("WorkName", map5, hashSet8, hashSet9);
            X.e eVarA5 = X.e.a(gVar, "WorkName");
            if (!eVar5.equals(eVarA5)) {
                return new w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new e.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            X.e eVar6 = new X.e("WorkProgress", map6, hashSet10, new HashSet(0));
            X.e eVarA6 = X.e.a(gVar, "WorkProgress");
            if (!eVar6.equals(eVarA6)) {
                return new w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new e.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new e.a("long_value", "INTEGER", false, 0, null, 1));
            X.e eVar7 = new X.e("Preference", map7, new HashSet(0), new HashSet(0));
            X.e eVarA7 = X.e.a(gVar, "Preference");
            if (eVar7.equals(eVarA7)) {
                return new w.c(true, null);
            }
            return new w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
        }

        @Override // androidx.room.w.b
        public void onPostMigrate(Z.g gVar) {
        }
    }
}
