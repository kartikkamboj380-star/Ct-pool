package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
enum W {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");


    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Map f17882D = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f17897m;

    static {
        for (W w6 : values()) {
            f17882D.put(w6.f17897m, w6);
        }
    }

    W(String str) {
        this.f17897m = str;
    }

    static W h(String str) {
        Map map = f17882D;
        if (map.containsKey(str)) {
            return (W) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f17897m;
    }
}
