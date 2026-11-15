package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor zza;

    @KeepForSdk
    public CursorWrapper(Cursor cursor) {
        super(cursor);
        for (int i7 = 0; i7 < 10 && (cursor instanceof android.database.CursorWrapper); i7++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
        }
        this.zza = (AbstractWindowedCursor) cursor;
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i7, CursorWindow cursorWindow) {
        this.zza.fillWindow(i7, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.zza;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    public final boolean onMove(int i7, int i8) {
        return this.zza.onMove(i7, i8);
    }

    @KeepForSdk
    public void setWindow(CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}
