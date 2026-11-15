package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC1171p0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1414i2 extends AbstractC1171p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1393f2 f16075m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1414i2(C1393f2 c1393f2, Context context, String str) {
        super(context, str, null, 1);
        this.f16075m = c1393f2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e7) {
            throw e7;
        } catch (SQLiteException unused) {
            this.f16075m.d().E().a("Opening the local database failed, dropping and recreating it");
            if (!this.f16075m.a().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f16075m.d().E().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e8) {
                this.f16075m.d().E().b("Failed to open local database. Events will bypass local storage", e8);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC1494u.b(this.f16075m.d(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC1494u.c(this.f16075m.d(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
