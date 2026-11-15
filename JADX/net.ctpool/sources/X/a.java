package X;

import F5.g;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import j5.AbstractC1803h;
import java.io.IOException;
import t5.AbstractC2070a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Cursor a(Cursor cursor) throws IOException {
        k.f(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i7 = 0; i7 < columnCount; i7++) {
                    int type = cursor.getType(i7);
                    if (type == 0) {
                        objArr[i7] = null;
                    } else if (type == 1) {
                        objArr[i7] = Long.valueOf(cursor.getLong(i7));
                    } else if (type == 2) {
                        objArr[i7] = Double.valueOf(cursor.getDouble(i7));
                    } else if (type == 3) {
                        objArr[i7] = cursor.getString(i7);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i7] = cursor.getBlob(i7);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            AbstractC2070a.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        k.e(columnNames, "columnNames");
        return c(columnNames, str);
    }

    public static final int c(String[] strArr, String str) {
        k.f(strArr, "columnNames");
        k.f(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            String str4 = strArr[i7];
            int i9 = i8 + 1;
            if (str4.length() >= str.length() + 2) {
                if (g.o(str4, str2, false, 2, null)) {
                    return i8;
                }
                if (str4.charAt(0) == '`' && g.o(str4, str3, false, 2, null)) {
                    return i8;
                }
            }
            i7++;
            i8 = i9;
        }
        return -1;
    }

    public static final int d(Cursor cursor, String str) {
        k.f(cursor, "c");
        k.f(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static final int e(Cursor cursor, String str) {
        String strA;
        k.f(cursor, "c");
        k.f(str, "name");
        int iD = d(cursor, str);
        if (iD >= 0) {
            return iD;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            k.e(columnNames, "c.columnNames");
            strA = AbstractC1803h.A(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e7) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e7);
            strA = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strA);
    }
}
