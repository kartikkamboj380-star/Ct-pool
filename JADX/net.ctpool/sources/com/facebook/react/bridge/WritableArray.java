package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
public interface WritableArray extends ReadableArray {
    void pushArray(ReadableArray readableArray);

    void pushBoolean(boolean z6);

    void pushDouble(double d7);

    void pushInt(int i7);

    void pushLong(long j7);

    void pushMap(ReadableMap readableMap);

    void pushNull();

    void pushString(String str);
}
