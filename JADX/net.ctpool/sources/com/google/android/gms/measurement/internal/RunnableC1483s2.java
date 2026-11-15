package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1483s2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1490t2 f16262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f16263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Throwable f16264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f16265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f16266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f16267r;

    private RunnableC1483s2(String str, InterfaceC1490t2 interfaceC1490t2, int i7, Throwable th, byte[] bArr, Map map) {
        Preconditions.checkNotNull(interfaceC1490t2);
        this.f16262m = interfaceC1490t2;
        this.f16263n = i7;
        this.f16264o = th;
        this.f16265p = bArr;
        this.f16266q = str;
        this.f16267r = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16262m.a(this.f16266q, this.f16263n, this.f16264o, this.f16265p, this.f16267r);
    }
}
