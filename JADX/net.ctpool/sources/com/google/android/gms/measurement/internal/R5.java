package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class R5 implements InterfaceC1490t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f15758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V5 f15759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f15760c;

    R5(H5 h52, String str, V5 v52) {
        this.f15758a = str;
        this.f15759b = v52;
        this.f15760c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1490t2
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f15760c.z(this.f15758a, i7, th, bArr, this.f15759b);
    }
}
