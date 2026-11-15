package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1234w2;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f15826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1234w2 f15827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f15829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w3.C f15830e;

    private V5(long j7, C1234w2 c1234w2, String str, Map map, w3.C c7) {
        this.f15826a = j7;
        this.f15827b = c1234w2;
        this.f15828c = str;
        this.f15829d = map;
        this.f15830e = c7;
    }

    public final long a() {
        return this.f15826a;
    }

    public final I5 b() {
        return new I5(this.f15828c, this.f15829d, this.f15830e);
    }

    public final C1234w2 c() {
        return this.f15827b;
    }

    public final String d() {
        return this.f15828c;
    }

    public final Map e() {
        return this.f15829d;
    }
}
