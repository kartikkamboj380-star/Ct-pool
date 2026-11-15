package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum p {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13429m;

    p(int i7) {
        this.f13429m = i7;
    }

    public static p h(int i7) {
        if (i7 == 0) {
            return UNDEFINED;
        }
        if (i7 == 1) {
            return EXACTLY;
        }
        if (i7 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i7);
    }
}
