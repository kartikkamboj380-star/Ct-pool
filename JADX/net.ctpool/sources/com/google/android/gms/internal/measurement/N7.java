package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum N7 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    N7(int i7) {
    }

    public static N7 e(int i7) {
        return i7 != 2 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
