package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1393f2 extends AbstractC1525y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1414i2 f16025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16026d;

    C1393f2(S2 s22) {
        super(s22);
        this.f16025c = new C1414i2(this, a(), "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb A[PHI: r6 r9
      0x00fb: PHI (r6v3 int) = (r6v1 int), (r6v4 int) binds: [B:73:0x0116, B:66:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r9v7 android.database.sqlite.SQLiteDatabase) = (r9v6 android.database.sqlite.SQLiteDatabase), (r9v8 android.database.sqlite.SQLiteDatabase) binds: [B:73:0x0116, B:66:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean B(int i7, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseI;
        ?? RawQuery;
        long j7;
        l();
        ?? r22 = 0;
        if (this.f16026d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i7));
        contentValues.put("entry", bArr);
        int i8 = 0;
        int i9 = 5;
        for (int i10 = 5; i8 < i10; i10 = 5) {
            ?? r7 = 0;
             = 0;
            r7 = 0;
            ?? r72 = 0;
            r7 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseI = I();
                try {
                    if (sQLiteDatabaseI == null) {
                        this.f16026d = true;
                        if (sQLiteDatabaseI != null) {
                            sQLiteDatabaseI.close();
                        }
                        return r22;
                    }
                    sQLiteDatabaseI.beginTransaction();
                    RawQuery = sQLiteDatabaseI.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            j7 = RawQuery.moveToFirst() ? RawQuery.getLong(r22) : 0L;
                        } catch (SQLiteDatabaseLockedException unused) {
                            r72 = RawQuery;
                            SystemClock.sleep(i9);
                            i9 += 20;
                            if (r72 != 0) {
                                r72.close();
                            }
                            if (sQLiteDatabaseI != null) {
                                sQLiteDatabaseI.close();
                            }
                            i8++;
                            r22 = 0;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            r7 = RawQuery;
                            try {
                                d().E().b("Error writing entry; local database full", e);
                                this.f16026d = true;
                                if (r7 != 0) {
                                    r7.close();
                                }
                                if (sQLiteDatabaseI != null) {
                                }
                                i8++;
                                r22 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r7 != 0) {
                                }
                                if (sQLiteDatabaseI != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e8) {
                            e = e8;
                            sQLiteDatabase = sQLiteDatabaseI;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseI = sQLiteDatabase;
                                    r7 = RawQuery;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    if (sQLiteDatabaseI != null) {
                                        sQLiteDatabaseI.close();
                                    }
                                    throw th;
                                }
                            }
                            d().E().b("Error writing entry to local database", e);
                            this.f16026d = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i8++;
                            r22 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r7 = RawQuery;
                            if (r7 != 0) {
                            }
                            if (sQLiteDatabaseI != null) {
                            }
                            throw th;
                        }
                    }
                    if (j7 >= 100000) {
                        d().E().a("Data loss, local db full");
                        long j8 = 100001 - j7;
                        long jDelete = sQLiteDatabaseI.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j8)});
                        if (jDelete != j8) {
                            d().E().d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j8), Long.valueOf(jDelete), Long.valueOf(j8 - jDelete));
                        }
                    }
                    sQLiteDatabaseI.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseI.setTransactionSuccessful();
                    sQLiteDatabaseI.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseI.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e9) {
                    e = e9;
                } catch (SQLiteException e10) {
                    e = e10;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseI = null;
            } catch (SQLiteFullException e11) {
                e = e11;
                sQLiteDatabaseI = null;
            } catch (SQLiteException e12) {
                e = e12;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseI = null;
                if (r7 != 0) {
                }
                if (sQLiteDatabaseI != null) {
                }
                throw th;
            }
        }
        d().I().a("Failed to write entry to local database");
        return false;
    }

    private final SQLiteDatabase I() {
        if (this.f16026d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f16025c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f16026d = true;
        return null;
    }

    private final boolean J() {
        return a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long z(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j7 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j7;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d0 A[PHI: r8 r15
      0x01d0: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:117:0x01be, B:132:0x01e9, B:125:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r15v6 android.database.sqlite.SQLiteDatabase) = 
      (r15v4 android.database.sqlite.SQLiteDatabase)
      (r15v5 android.database.sqlite.SQLiteDatabase)
      (r15v7 android.database.sqlite.SQLiteDatabase)
     binds: [B:117:0x01be, B:132:0x01e9, B:125:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List A(int i7) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseI;
        long j7;
        String str;
        String[] strArr;
        Parcel parcelObtain;
        SafeParcelable safeParcelable;
        C1463p2 c1463p2E;
        String str2;
        l();
        Cursor cursor = null;
        if (this.f16026d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!J()) {
            return arrayList;
        }
        int i8 = 5;
        int i9 = 0;
        for (int i10 = 5; i9 < i10; i10 = 5) {
            try {
                sQLiteDatabaseI = I();
                if (sQLiteDatabaseI == null) {
                    try {
                        this.f16026d = true;
                        if (sQLiteDatabaseI != null) {
                            sQLiteDatabaseI.close();
                        }
                        return null;
                    } catch (SQLiteFullException e7) {
                        e = e7;
                        cursorQuery = null;
                        d().E().b("Error reading entries from local database", e);
                        this.f16026d = true;
                        if (cursorQuery != null) {
                        }
                        if (sQLiteDatabaseI != null) {
                        }
                        i9++;
                    } catch (SQLiteException e8) {
                        e = e8;
                        cursorQuery = null;
                        if (sQLiteDatabaseI != null) {
                        }
                        d().E().b("Error reading entries from local database", e);
                        this.f16026d = true;
                        if (cursorQuery != null) {
                        }
                        if (sQLiteDatabaseI != null) {
                        }
                        i9++;
                    }
                } else {
                    try {
                        try {
                            sQLiteDatabaseI.beginTransaction();
                            long jZ = z(sQLiteDatabaseI);
                            j7 = -1;
                            if (jZ != -1) {
                                str = "rowid<?";
                                strArr = new String[]{String.valueOf(jZ)};
                            } else {
                                str = null;
                                strArr = null;
                            }
                            sQLiteDatabase = sQLiteDatabaseI;
                        } catch (SQLiteFullException e9) {
                            e = e9;
                            cursorQuery = null;
                            d().E().b("Error reading entries from local database", e);
                            this.f16026d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseI != null) {
                                sQLiteDatabaseI.close();
                            }
                            i9++;
                        } catch (SQLiteException e10) {
                            e = e10;
                            cursorQuery = null;
                            if (sQLiteDatabaseI != null) {
                                try {
                                    if (sQLiteDatabaseI.inTransaction()) {
                                        sQLiteDatabaseI.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorQuery;
                                    sQLiteDatabase = sQLiteDatabaseI;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            d().E().b("Error reading entries from local database", e);
                            this.f16026d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseI != null) {
                            }
                            i9++;
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        sQLiteDatabase = sQLiteDatabaseI;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = sQLiteDatabaseI;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                    try {
                        cursorQuery = sQLiteDatabaseI.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                        while (cursorQuery.moveToNext()) {
                            try {
                                j7 = cursorQuery.getLong(0);
                                int i11 = cursorQuery.getInt(1);
                                byte[] blob = cursorQuery.getBlob(2);
                                if (i11 == 0) {
                                    parcelObtain = Parcel.obtain();
                                    try {
                                        try {
                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                            parcelObtain.setDataPosition(0);
                                            safeParcelable = (E) E.CREATOR.createFromParcel(parcelObtain);
                                            if (safeParcelable != null) {
                                                arrayList.add(safeParcelable);
                                            }
                                        } finally {
                                        }
                                    } catch (SafeParcelReader.ParseException unused2) {
                                        d().E().a("Failed to load event from local database");
                                        parcelObtain.recycle();
                                    }
                                } else if (i11 == 1) {
                                    parcelObtain = Parcel.obtain();
                                    try {
                                        try {
                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                            parcelObtain.setDataPosition(0);
                                            safeParcelable = (Y5) Y5.CREATOR.createFromParcel(parcelObtain);
                                        } finally {
                                        }
                                    } catch (SafeParcelReader.ParseException unused3) {
                                        d().E().a("Failed to load user property from local database");
                                        parcelObtain.recycle();
                                        safeParcelable = null;
                                    }
                                    if (safeParcelable != null) {
                                        arrayList.add(safeParcelable);
                                    }
                                } else if (i11 == 2) {
                                    parcelObtain = Parcel.obtain();
                                    try {
                                        try {
                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                            parcelObtain.setDataPosition(0);
                                            safeParcelable = (C1383e) C1383e.CREATOR.createFromParcel(parcelObtain);
                                        } catch (SafeParcelReader.ParseException unused4) {
                                            d().E().a("Failed to load conditional user property from local database");
                                            parcelObtain.recycle();
                                            safeParcelable = null;
                                        }
                                        if (safeParcelable != null) {
                                            arrayList.add(safeParcelable);
                                        }
                                    } finally {
                                    }
                                } else {
                                    if (i11 == 3) {
                                        c1463p2E = d().J();
                                        str2 = "Skipping app launch break";
                                    } else {
                                        c1463p2E = d().E();
                                        str2 = "Unknown record type in local database";
                                    }
                                    c1463p2E.a(str2);
                                }
                            } catch (SQLiteDatabaseLockedException unused5) {
                                sQLiteDatabaseI = sQLiteDatabase;
                                SystemClock.sleep(i8);
                                i8 += 20;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (sQLiteDatabaseI == null) {
                                }
                                i9++;
                            } catch (SQLiteFullException e11) {
                                e = e11;
                                sQLiteDatabaseI = sQLiteDatabase;
                                d().E().b("Error reading entries from local database", e);
                                this.f16026d = true;
                                if (cursorQuery != null) {
                                }
                                if (sQLiteDatabaseI != null) {
                                }
                                i9++;
                            } catch (SQLiteException e12) {
                                e = e12;
                                sQLiteDatabaseI = sQLiteDatabase;
                                if (sQLiteDatabaseI != null) {
                                }
                                d().E().b("Error reading entries from local database", e);
                                this.f16026d = true;
                                if (cursorQuery != null) {
                                }
                                if (sQLiteDatabaseI != null) {
                                }
                                i9++;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j7)}) < arrayList.size()) {
                            d().E().a("Fewer entries removed from local database than expected");
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        cursorQuery.close();
                        sQLiteDatabase.close();
                        return arrayList;
                    } catch (SQLiteDatabaseLockedException unused6) {
                        cursorQuery = null;
                        sQLiteDatabaseI = sQLiteDatabase;
                        SystemClock.sleep(i8);
                        i8 += 20;
                        if (cursorQuery != null) {
                        }
                        if (sQLiteDatabaseI == null) {
                        }
                        i9++;
                    } catch (SQLiteFullException e13) {
                        e = e13;
                        cursorQuery = null;
                    } catch (SQLiteException e14) {
                        e = e14;
                        cursorQuery = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                cursorQuery = null;
                sQLiteDatabaseI = null;
            } catch (SQLiteFullException e15) {
                e = e15;
                cursorQuery = null;
                sQLiteDatabaseI = null;
            } catch (SQLiteException e16) {
                e = e16;
                cursorQuery = null;
                sQLiteDatabaseI = null;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
            }
        }
        d().J().a("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean C(C1383e c1383e) {
        h();
        byte[] bArrO0 = d6.o0(c1383e);
        if (bArrO0.length <= 131072) {
            return B(2, bArrO0);
        }
        d().G().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean D(E e7) {
        Parcel parcelObtain = Parcel.obtain();
        e7.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return B(0, bArrMarshall);
        }
        d().G().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean E(Y5 y52) {
        Parcel parcelObtain = Parcel.obtain();
        y52.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return B(1, bArrMarshall);
        }
        d().G().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void F() {
        int iDelete;
        l();
        try {
            SQLiteDatabase sQLiteDatabaseI = I();
            if (sQLiteDatabaseI == null || (iDelete = sQLiteDatabaseI.delete("messages", null, null)) <= 0) {
                return;
            }
            d().I().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e7) {
            d().E().b("Error resetting local analytics data. error", e7);
        }
    }

    public final boolean G() {
        return B(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[PHI: r4
      0x006d: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0064, B:35:0x006b, B:38:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H() {
        l();
        if (this.f16026d || !J()) {
            return false;
        }
        int i7 = 5;
        for (int i8 = 0; i8 < 5; i8++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseI = I();
                    if (sQLiteDatabaseI == null) {
                        this.f16026d = true;
                        if (sQLiteDatabaseI != null) {
                            sQLiteDatabaseI.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseI.beginTransaction();
                    sQLiteDatabaseI.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseI.setTransactionSuccessful();
                    sQLiteDatabaseI.endTransaction();
                    sQLiteDatabaseI.close();
                    return true;
                } catch (SQLiteFullException e7) {
                    d().E().b("Error deleting app launch break from local database", e7);
                    this.f16026d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i7);
                i7 += 20;
                if (0 != 0) {
                }
            } catch (SQLiteException e8) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                d().E().b("Error deleting app launch break from local database", e8);
                this.f16026d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        d().J().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1522y m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1400g2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1393f2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1513w4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1466p5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1525y2
    protected final boolean y() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
