package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
@Q2.a
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13351m;

    YogaLogLevel(int i7) {
        this.f13351m = i7;
    }

    @Q2.a
    public static YogaLogLevel fromInt(int i7) {
        if (i7 == 0) {
            return ERROR;
        }
        if (i7 == 1) {
            return WARN;
        }
        if (i7 == 2) {
            return INFO;
        }
        if (i7 == 3) {
            return DEBUG;
        }
        if (i7 == 4) {
            return VERBOSE;
        }
        if (i7 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i7);
    }
}
