package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
public interface WritableMap extends ReadableMap {
    WritableMap copy();

    void merge(ReadableMap readableMap);

    void putArray(String str, ReadableArray readableArray);

    void putBoolean(String str, boolean z6);

    void putDouble(String str, double d7);

    void putInt(String str, int i7);

    void putLong(String str, long j7);

    void putMap(String str, ReadableMap readableMap);

    void putNull(String str);

    void putString(String str, String str2);
}
