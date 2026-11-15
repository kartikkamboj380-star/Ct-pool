package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
enum Z {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Map f17905A = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f17920m;

    static {
        for (Z z6 : values()) {
            f17905A.put(z6.f17920m, z6);
        }
    }

    Z(String str) {
        this.f17920m = str;
    }

    static Z h(String str) {
        return (Z) f17905A.get(str);
    }

    static boolean j(String str) {
        return f17905A.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f17920m;
    }
}
