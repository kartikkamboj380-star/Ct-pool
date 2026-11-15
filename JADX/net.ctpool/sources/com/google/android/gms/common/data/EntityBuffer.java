package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i7 = 1; i7 < count; i7++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i7);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i7, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i7 + ", for window: " + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i7));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i7) {
        zab();
        int iZaa = zaa(i7);
        int i8 = 0;
        if (i7 >= 0 && i7 != this.zab.size()) {
            int count = (i7 == this.zab.size() + (-1) ? ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount() : ((Integer) this.zab.get(i7 + 1)).intValue()) - ((Integer) this.zab.get(i7)).intValue();
            if (count == 1) {
                int iZaa2 = zaa(i7);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i8 = 1;
                }
            } else {
                i8 = count;
            }
        }
        return getEntry(iZaa, i8);
    }

    @KeepForSdk
    protected String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    protected abstract T getEntry(int i7, int i8);

    @KeepForSdk
    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i7) {
        if (i7 >= 0 && i7 < this.zab.size()) {
            return ((Integer) this.zab.get(i7)).intValue();
        }
        throw new IllegalArgumentException("Position " + i7 + " is out of bounds for this buffer");
    }
}
