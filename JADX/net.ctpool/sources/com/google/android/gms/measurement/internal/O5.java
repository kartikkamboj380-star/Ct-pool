package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class O5 implements InterfaceC1490t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f15723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V5 f15724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f15725c;

    O5(H5 h52, String str, V5 v52) {
        this.f15723a = str;
        this.f15724b = v52;
        this.f15725c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1490t2
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f15725c.z(this.f15723a, i7, th, bArr, this.f15724b);
    }
}
