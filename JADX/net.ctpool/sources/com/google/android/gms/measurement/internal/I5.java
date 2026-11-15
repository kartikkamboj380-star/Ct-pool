package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f15642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w3.C f15643c;

    I5(String str, Map map, w3.C c7) {
        this.f15641a = str;
        this.f15642b = map;
        this.f15643c = c7;
    }

    public final w3.C a() {
        return this.f15643c;
    }

    public final String b() {
        return this.f15641a;
    }

    public final Map c() {
        Map map = this.f15642b;
        return map == null ? Collections.emptyMap() : map;
    }

    I5(String str, w3.C c7) {
        this.f15641a = str;
        this.f15643c = c7;
    }
}
