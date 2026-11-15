package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13382m;

    h(int i7) {
        this.f13382m = i7;
    }

    public static h h(int i7) {
        if (i7 == 0) {
            return INHERIT;
        }
        if (i7 == 1) {
            return LTR;
        }
        if (i7 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i7);
    }

    public int j() {
        return this.f13382m;
    }
}
