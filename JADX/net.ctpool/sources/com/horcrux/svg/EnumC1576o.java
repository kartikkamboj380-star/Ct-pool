package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
enum EnumC1576o {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Map f18022p = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f18024m;

    static {
        for (EnumC1576o enumC1576o : values()) {
            f18022p.put(enumC1576o.f18024m, enumC1576o);
        }
    }

    EnumC1576o(String str) {
        this.f18024m = str;
    }

    static EnumC1576o h(String str) {
        Map map = f18022p;
        if (map.containsKey(str)) {
            return (EnumC1576o) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18024m;
    }
}
