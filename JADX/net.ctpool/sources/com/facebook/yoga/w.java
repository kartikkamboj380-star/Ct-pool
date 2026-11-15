package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum w {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13445m;

    w(int i7) {
        this.f13445m = i7;
    }

    public static w h(int i7) {
        if (i7 == 0) {
            return UNDEFINED;
        }
        if (i7 == 1) {
            return POINT;
        }
        if (i7 == 2) {
            return PERCENT;
        }
        if (i7 == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i7);
    }

    public int j() {
        return this.f13445m;
    }
}
