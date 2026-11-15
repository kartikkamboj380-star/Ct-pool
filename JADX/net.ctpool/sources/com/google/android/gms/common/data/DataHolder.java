package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new a(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    @KeepForSdk
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @KeepForSdk
        public DataHolder build(int i7) {
            return new DataHolder(this, i7);
        }

        @KeepForSdk
        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        public Builder zaa(HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        @KeepForSdk
        public DataHolder build(int i7, Bundle bundle) {
            return new DataHolder(this, i7, bundle);
        }
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i7, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i8, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i7;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i8;
        this.zaj = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @KeepForSdk
    public static DataHolder empty(int i7) {
        return new DataHolder(zaf, i7, (Bundle) null);
    }

    private final void zae(String str, int i7) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i7 < 0 || i7 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i7, this.zad);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        if (r5 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
    
        android.util.Log.d("DataHolder", "Couldn't populate window data for row " + r4 + " - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0165, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016f, code lost:
    
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CursorWindow[] zaf(Builder builder, int i7) {
        long jLongValue;
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i8 = 0;
        boolean z6 = false;
        while (i8 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i8 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i8);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i8);
                int i9 = 0;
                boolean zPutDouble = true;
                while (true) {
                    if (i9 < builder.zaa.length) {
                        if (!zPutDouble) {
                            break;
                        }
                        String str = builder.zaa[i9];
                        Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i8, i9);
                        } else if (obj instanceof String) {
                            zPutDouble = cursorWindow.putString((String) obj, i8, i9);
                        } else {
                            if (obj instanceof Long) {
                                jLongValue = ((Long) obj).longValue();
                            } else if (obj instanceof Integer) {
                                zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i8, i9);
                            } else if (obj instanceof Boolean) {
                                jLongValue = true != ((Boolean) obj).booleanValue() ? 0L : 1L;
                            } else if (obj instanceof byte[]) {
                                zPutDouble = cursorWindow.putBlob((byte[]) obj, i8, i9);
                            } else if (obj instanceof Double) {
                                zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i8, i9);
                            } else {
                                if (!(obj instanceof Float)) {
                                    throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                                }
                                zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i8, i9);
                            }
                            zPutDouble = cursorWindow.putLong(jLongValue, i8, i9);
                        }
                        i9++;
                    } else if (zPutDouble) {
                        z6 = false;
                    }
                }
            } catch (RuntimeException e7) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((CursorWindow) arrayList2.get(i10)).close();
                }
                throw e7;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i7 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i7 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i7].close();
                        i7++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].getLong(i7, this.zab.getInt(str)) == 1;
    }

    @KeepForSdk
    public byte[] getByteArray(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].getBlob(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].getInt(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].getLong(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @KeepForSdk
    public String getString(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].getString(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i7) {
        int length;
        int i8 = 0;
        Preconditions.checkState(i7 >= 0 && i7 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i8 >= length) {
                break;
            }
            if (i7 < iArr[i8]) {
                i8--;
                break;
            }
            i8++;
        }
        return i8 == length ? i8 - 1 : i8;
    }

    @KeepForSdk
    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].isNull(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z6;
        synchronized (this) {
            z6 = this.zae;
        }
        return z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String[] strArr = this.zag;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i7, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i7 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].getDouble(i7, this.zab.getInt(str));
    }

    public final float zab(String str, int i7, int i8) {
        zae(str, i7);
        return this.zah[i8].getFloat(i7, this.zab.getInt(str));
    }

    public final void zac(String str, int i7, int i8, CharArrayBuffer charArrayBuffer) {
        zae(str, i7);
        this.zah[i8].copyStringToBuffer(i7, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i8 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i8], i8);
            i8++;
        }
        this.zac = new int[this.zah.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i7 >= cursorWindowArr.length) {
                this.zad = numRows;
                return;
            }
            this.zac[i7] = numRows;
            numRows += this.zah[i7].getNumRows() - (numRows - cursorWindowArr[i7].getStartPosition());
            i7++;
        }
    }

    /* JADX WARN: Finally extract failed */
    public DataHolder(Cursor cursor, int i7, Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count) {
                if (!cursorWrapper.moveToPosition(startPosition)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i7, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i7, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i7, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i7, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i7;
        this.zaj = bundle;
        zad();
    }
}
