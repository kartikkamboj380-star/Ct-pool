package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1234w2;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f15858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1234w2 f15859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f15861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w3.C f15862e;

    X5() {
    }

    public final V5 a() {
        return new V5(this.f15858a, this.f15859b, this.f15860c, this.f15861d, this.f15862e);
    }

    public final X5 b(long j7) {
        this.f15858a = j7;
        return this;
    }

    public final X5 c(C1234w2 c1234w2) {
        this.f15859b = c1234w2;
        return this;
    }

    public final X5 d(String str) {
        this.f15860c = str;
        return this;
    }

    public final X5 e(Map map) {
        this.f15861d = map;
        return this;
    }

    public final X5 f(w3.C c7) {
        this.f15862e = c7;
        return this;
    }
}
