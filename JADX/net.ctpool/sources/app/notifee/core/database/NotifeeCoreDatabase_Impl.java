package app.notifee.core.database;

import S5.p;
import S5.q;
import W.b;
import X.e;
import Z.g;
import Z.h;
import androidx.room.f;
import androidx.room.o;
import androidx.room.u;
import androidx.room.w;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class NotifeeCoreDatabase_Impl extends NotifeeCoreDatabase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p f9542d;

    @Override // androidx.room.u
    public void clearAllTables() {
        assertNotMainThread();
        g gVarL0 = getOpenHelper().l0();
        try {
            beginTransaction();
            gVarL0.u("DELETE FROM `work_data`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            gVarL0.o0("PRAGMA wal_checkpoint(FULL)").close();
            if (!gVarL0.I0()) {
                gVarL0.u("VACUUM");
            }
        }
    }

    @Override // androidx.room.u
    public o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "work_data");
    }

    @Override // androidx.room.u
    public h createOpenHelper(f fVar) {
        return fVar.f8948c.a(h.b.a(fVar.f8946a).d(fVar.f8947b).c(new w(fVar, new a(2), "24b2477514809255df232947ce7928c4", "1ddaa4b892e61b0f7010597ddc582ed3")).b());
    }

    @Override // app.notifee.core.database.NotifeeCoreDatabase
    public p d() {
        p pVar;
        if (this.f9542d != null) {
            return this.f9542d;
        }
        synchronized (this) {
            try {
                if (this.f9542d == null) {
                    this.f9542d = new q(this);
                }
                pVar = this.f9542d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // androidx.room.u
    public List getAutoMigrations(Map map) {
        return Arrays.asList(new b[0]);
    }

    @Override // androidx.room.u
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.u
    public Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(p.class, Collections.emptyList());
        return map;
    }

    public class a extends w.b {
        public a(int i7) {
            super(i7);
        }

        @Override // androidx.room.w.b
        public void createAllTables(g gVar) {
            gVar.u("CREATE TABLE IF NOT EXISTS `work_data` (`id` TEXT NOT NULL, `notification` BLOB, `trigger` BLOB, `with_alarm_manager` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
            gVar.u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '24b2477514809255df232947ce7928c4')");
        }

        @Override // androidx.room.w.b
        public void dropAllTables(g gVar) {
            gVar.u("DROP TABLE IF EXISTS `work_data`");
            if (((u) NotifeeCoreDatabase_Impl.this).mCallbacks != null) {
                int size = ((u) NotifeeCoreDatabase_Impl.this).mCallbacks.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((u.b) ((u) NotifeeCoreDatabase_Impl.this).mCallbacks.get(i7)).b(gVar);
                }
            }
        }

        @Override // androidx.room.w.b
        public void onCreate(g gVar) {
            if (((u) NotifeeCoreDatabase_Impl.this).mCallbacks != null) {
                int size = ((u) NotifeeCoreDatabase_Impl.this).mCallbacks.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((u.b) ((u) NotifeeCoreDatabase_Impl.this).mCallbacks.get(i7)).a(gVar);
                }
            }
        }

        @Override // androidx.room.w.b
        public void onOpen(g gVar) {
            ((u) NotifeeCoreDatabase_Impl.this).mDatabase = gVar;
            NotifeeCoreDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            if (((u) NotifeeCoreDatabase_Impl.this).mCallbacks != null) {
                int size = ((u) NotifeeCoreDatabase_Impl.this).mCallbacks.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((u.b) ((u) NotifeeCoreDatabase_Impl.this).mCallbacks.get(i7)).c(gVar);
                }
            }
        }

        @Override // androidx.room.w.b
        public void onPreMigrate(g gVar) throws IOException {
            X.b.a(gVar);
        }

        @Override // androidx.room.w.b
        public w.c onValidateSchema(g gVar) {
            HashMap map = new HashMap(4);
            map.put("id", new e.a("id", "TEXT", true, 1, null, 1));
            map.put("notification", new e.a("notification", "BLOB", false, 0, null, 1));
            map.put("trigger", new e.a("trigger", "BLOB", false, 0, null, 1));
            map.put("with_alarm_manager", new e.a("with_alarm_manager", "INTEGER", true, 0, "0", 1));
            e eVar = new e("work_data", map, new HashSet(0), new HashSet(0));
            e eVarA = e.a(gVar, "work_data");
            if (eVar.equals(eVarA)) {
                return new w.c(true, null);
            }
            return new w.c(false, "work_data(app.notifee.core.database.WorkDataEntity).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
        }

        @Override // androidx.room.w.b
        public void onPostMigrate(g gVar) {
        }
    }
}
