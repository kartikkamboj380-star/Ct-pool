package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1171p0 extends SQLiteOpenHelper {
    public AbstractC1171p0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i7) {
        this(context, str, null, 1, AbstractC1188r0.f14802a);
    }

    private AbstractC1171p0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i7, AbstractC1188r0 abstractC1188r0) {
        super(context, (str == null || AbstractC1126k0.a().a(str, abstractC1188r0, EnumC1162o0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
