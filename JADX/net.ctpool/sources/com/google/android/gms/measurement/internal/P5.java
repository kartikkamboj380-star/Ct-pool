package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class P5 implements InterfaceC1490t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f15741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f15742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f15743c;

    P5(H5 h52, String str, List list) {
        this.f15741a = str;
        this.f15742b = list;
        this.f15743c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1490t2
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f15743c.J(true, i7, th, bArr, this.f15741a, this.f15742b);
    }
}
