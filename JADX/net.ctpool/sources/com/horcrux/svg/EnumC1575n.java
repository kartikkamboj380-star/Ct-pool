package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
enum EnumC1575n {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Map f18017r = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f18019m;

    static {
        for (EnumC1575n enumC1575n : values()) {
            f18017r.put(enumC1575n.f18019m, enumC1575n);
        }
    }

    EnumC1575n(String str) {
        this.f18019m = str;
    }

    static EnumC1575n h(String str) {
        Map map = f18017r;
        if (map.containsKey(str)) {
            return (EnumC1575n) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18019m;
    }
}
