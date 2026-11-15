package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class L5 implements InterfaceC1490t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f15669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f15670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f15671c;

    L5(H5 h52, String str, List list) {
        this.f15669a = str;
        this.f15670b = list;
        this.f15671c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1490t2
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f15671c.J(true, i7, th, bArr, this.f15669a, this.f15670b);
    }
}
