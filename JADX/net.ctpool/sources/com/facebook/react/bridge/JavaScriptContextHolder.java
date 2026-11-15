package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
public class JavaScriptContextHolder {
    private long mContext;

    public JavaScriptContextHolder(long j7) {
        this.mContext = j7;
    }

    public synchronized void clear() {
        this.mContext = 0L;
    }

    public long get() {
        return this.mContext;
    }
}
