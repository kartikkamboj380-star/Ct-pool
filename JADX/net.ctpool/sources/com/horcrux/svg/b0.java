package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
enum b0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map f17948s = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f17950m;

    static {
        for (b0 b0Var : values()) {
            f17948s.put(b0Var.f17950m, b0Var);
        }
    }

    b0(String str) {
        this.f17950m = str;
    }

    static b0 h(String str) {
        Map map = f17948s;
        if (map.containsKey(str)) {
            return (b0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f17950m;
    }
}
