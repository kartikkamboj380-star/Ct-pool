package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
enum EnumC1418j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final char f16096m;

    EnumC1418j(char c7) {
        this.f16096m = c7;
    }

    public static EnumC1418j h(char c7) {
        for (EnumC1418j enumC1418j : values()) {
            if (enumC1418j.f16096m == c7) {
                return enumC1418j;
            }
        }
        return UNSET;
    }
}
