package Z;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4612a = new b();

    private b() {
    }

    public static final boolean a(File file) {
        w5.k.f(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase) {
        w5.k.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final Cursor c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        w5.k.f(sQLiteDatabase, "sQLiteDatabase");
        w5.k.f(str, "sql");
        w5.k.f(strArr, "selectionArgs");
        w5.k.f(cancellationSignal, "cancellationSignal");
        w5.k.f(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        w5.k.e(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public static final void d(SQLiteOpenHelper sQLiteOpenHelper, boolean z6) {
        w5.k.f(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z6);
    }
}
