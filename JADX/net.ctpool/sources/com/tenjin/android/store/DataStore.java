package com.tenjin.android.store;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface DataStore {
    void clear();

    boolean contains(String str);

    Map<String, ?> getAll();

    boolean getBoolean(String str, boolean z6);

    float getFloat(String str, float f7);

    int getInt(String str, int i7);

    long getLong(String str, long j7);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z6);

    void putFloat(String str, float f7);

    void putInt(String str, int i7);

    void putLong(String str, long j7);

    void putString(String str, String str2);

    void remove(String str);
}
