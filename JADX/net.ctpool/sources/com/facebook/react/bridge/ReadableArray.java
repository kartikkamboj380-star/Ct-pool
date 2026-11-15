package com.facebook.react.bridge;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface ReadableArray {
    ReadableArray getArray(int i7);

    boolean getBoolean(int i7);

    double getDouble(int i7);

    Dynamic getDynamic(int i7);

    int getInt(int i7);

    long getLong(int i7);

    ReadableMap getMap(int i7);

    String getString(int i7);

    ReadableType getType(int i7);

    boolean isNull(int i7);

    int size();

    ArrayList<Object> toArrayList();
}
