package com.facebook.react.uimanager;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f12445a = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12446b = 1;

    private T() {
    }

    public static final synchronized int a() {
        int i7;
        i7 = f12446b;
        f12446b = i7 + 10;
        return i7;
    }
}
