package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC1126k0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1494u {
    private static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    static void b(C1449n2 c1449n2, SQLiteDatabase sQLiteDatabase) {
        if (c1449n2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(AbstractC1126k0.a().f(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            c1449n2.J().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c1449n2.J().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c1449n2.J().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c1449n2.J().a("Failed to turn on database write permission for owner");
    }

    static void c(C1449n2 c1449n2, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (c1449n2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(c1449n2, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set setA = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!setA.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i7 = 0; i7 < strArr.length; i7 += 2) {
                    if (!setA.remove(strArr[i7])) {
                        sQLiteDatabase.execSQL(strArr[i7 + 1]);
                    }
                }
            }
            if (setA.isEmpty()) {
                return;
            }
            c1449n2.J().c("Table has extra columns. table, columns", str, TextUtils.join(", ", setA));
        } catch (SQLiteException e7) {
            c1449n2.E().b("Failed to verify columns on table that was just created", str);
            throw e7;
        }
    }

    private static boolean d(C1449n2 c1449n2, SQLiteDatabase sQLiteDatabase, String str) {
        if (c1449n2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
                return zMoveToFirst;
            } catch (SQLiteException e7) {
                c1449n2.J().c("Error querying for table", str, e7);
                if (cursorQuery == null) {
                    return false;
                }
                cursorQuery.close();
                return false;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
