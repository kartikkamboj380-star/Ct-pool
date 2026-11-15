package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
enum EnumC1574m {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Map f18010r = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f18012m;

    static {
        for (EnumC1574m enumC1574m : values()) {
            f18010r.put(enumC1574m.f18012m, enumC1574m);
        }
    }

    EnumC1574m(String str) {
        this.f18012m = str;
    }

    static EnumC1574m h(String str) {
        Map map = f18010r;
        if (map.containsKey(str)) {
            return (EnumC1574m) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18012m;
    }
}
