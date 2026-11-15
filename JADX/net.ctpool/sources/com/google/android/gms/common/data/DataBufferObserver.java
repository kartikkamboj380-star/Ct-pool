package com.google.android.gms.common.data;

/* JADX INFO: loaded from: classes.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i7, int i8);

    void onDataRangeInserted(int i7, int i8);

    void onDataRangeMoved(int i7, int i8, int i9);

    void onDataRangeRemoved(int i7, int i8);
}
