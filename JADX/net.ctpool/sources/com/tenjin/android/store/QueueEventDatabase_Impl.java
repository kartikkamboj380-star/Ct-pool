package com.tenjin.android.store;

import X.e;
import Z.g;
import Z.h;
import androidx.room.o;
import androidx.room.u;
import androidx.room.w;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class QueueEventDatabase_Impl extends QueueEventDatabase {
    private volatile QueueEventDao _queueEventDao;

    @Override // androidx.room.u
    public void clearAllTables() {
        super.assertNotMainThread();
        g gVarL0 = super.getOpenHelper().l0();
        try {
            super.beginTransaction();
            gVarL0.u("DELETE FROM `QueueEvent`");
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
    protected o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "QueueEvent");
    }

    @Override // androidx.room.u
    protected h createOpenHelper(androidx.room.f fVar) {
        return fVar.f8948c.a(h.b.a(fVar.f8946a).d(fVar.f8947b).c(new w(fVar, new w.b(1) { // from class: com.tenjin.android.store.QueueEventDatabase_Impl.1
            @Override // androidx.room.w.b
            public void createAllTables(g gVar) {
                gVar.u("CREATE TABLE IF NOT EXISTS `QueueEvent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `params` TEXT NOT NULL, `date` INTEGER NOT NULL, `endpoint` TEXT NOT NULL)");
                gVar.u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                gVar.u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0a5a33ee0f6cf2beee6328f77b70fd7e')");
            }

            @Override // androidx.room.w.b
            public void dropAllTables(g gVar) {
                gVar.u("DROP TABLE IF EXISTS `QueueEvent`");
                if (((u) QueueEventDatabase_Impl.this).mCallbacks != null) {
                    int size = ((u) QueueEventDatabase_Impl.this).mCallbacks.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((u.b) ((u) QueueEventDatabase_Impl.this).mCallbacks.get(i7)).b(gVar);
                    }
                }
            }

            @Override // androidx.room.w.b
            public void onCreate(g gVar) {
                if (((u) QueueEventDatabase_Impl.this).mCallbacks != null) {
                    int size = ((u) QueueEventDatabase_Impl.this).mCallbacks.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((u.b) ((u) QueueEventDatabase_Impl.this).mCallbacks.get(i7)).a(gVar);
                    }
                }
            }

            @Override // androidx.room.w.b
            public void onOpen(g gVar) {
                ((u) QueueEventDatabase_Impl.this).mDatabase = gVar;
                QueueEventDatabase_Impl.this.internalInitInvalidationTracker(gVar);
                if (((u) QueueEventDatabase_Impl.this).mCallbacks != null) {
                    int size = ((u) QueueEventDatabase_Impl.this).mCallbacks.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((u.b) ((u) QueueEventDatabase_Impl.this).mCallbacks.get(i7)).c(gVar);
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
                map.put("id", new e.a("id", "INTEGER", true, 1, null, 1));
                map.put("params", new e.a("params", "TEXT", true, 0, null, 1));
                map.put("date", new e.a("date", "INTEGER", true, 0, null, 1));
                map.put("endpoint", new e.a("endpoint", "TEXT", true, 0, null, 1));
                X.e eVar = new X.e("QueueEvent", map, new HashSet(0), new HashSet(0));
                X.e eVarA = X.e.a(gVar, "QueueEvent");
                if (eVar.equals(eVarA)) {
                    return new w.c(true, null);
                }
                return new w.c(false, "QueueEvent(com.tenjin.android.store.QueueEvent).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }

            @Override // androidx.room.w.b
            public void onPostMigrate(g gVar) {
            }
        }, "0a5a33ee0f6cf2beee6328f77b70fd7e", "6dbe33cc61883e1527e006254ba6946d")).b());
    }

    @Override // androidx.room.u
    public List<W.b> getAutoMigrations(Map<Class<? extends W.a>, W.a> map) {
        return Arrays.asList(new W.b[0]);
    }

    @Override // androidx.room.u
    public Set<Class<? extends W.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.u
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(QueueEventDao.class, QueueEventDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.tenjin.android.store.QueueEventDatabase
    public QueueEventDao queueEventDao() {
        QueueEventDao queueEventDao;
        if (this._queueEventDao != null) {
            return this._queueEventDao;
        }
        synchronized (this) {
            try {
                if (this._queueEventDao == null) {
                    this._queueEventDao = new QueueEventDao_Impl(this);
                }
                queueEventDao = this._queueEventDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return queueEventDao;
    }
}
