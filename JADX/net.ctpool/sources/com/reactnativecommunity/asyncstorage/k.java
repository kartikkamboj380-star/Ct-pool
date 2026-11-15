package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public class k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static k f18191p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f18192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SQLiteDatabase f18193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f18194o;

    private k(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f18194o = j.f18190a.longValue() * 1048576;
        this.f18192m = context;
    }

    private synchronized boolean e() {
        d();
        return this.f18192m.deleteDatabase("RKStorage");
    }

    public static k j(Context context) {
        if (f18191p == null) {
            f18191p = new k(context.getApplicationContext());
        }
        return f18191p;
    }

    synchronized void a() {
        g().delete("catalystLocalStorage", null, null);
    }

    public synchronized void b() {
        try {
            a();
            d();
            P0.a.b("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (!e()) {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
            P0.a.b("ReactNative", "Deleted Local Database RKStorage");
        }
    }

    public synchronized void d() {
        SQLiteDatabase sQLiteDatabase = this.f18193n;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f18193n.close();
            this.f18193n = null;
        }
    }

    synchronized boolean f() {
        SQLiteDatabase sQLiteDatabase = this.f18193n;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e7 = null;
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 > 0) {
                try {
                    e();
                } catch (SQLiteException e8) {
                    e7 = e8;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f18193n = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f18193n;
        if (sQLiteDatabase2 == null) {
            throw e7;
        }
        sQLiteDatabase2.setMaximumSize(this.f18194o);
        return true;
    }

    public synchronized SQLiteDatabase g() {
        f();
        return this.f18193n;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (i7 != i8) {
            e();
            onCreate(sQLiteDatabase);
        }
    }
}
