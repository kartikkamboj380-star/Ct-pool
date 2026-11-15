package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1040a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1112i4 f14499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14500b;

    private C1040a4(int i7) {
        byte[] bArr = new byte[i7];
        this.f14500b = bArr;
        this.f14499a = AbstractC1112i4.D(bArr);
    }

    public final R3 a() {
        this.f14499a.E();
        return new C1058c4(this.f14500b);
    }

    public final AbstractC1112i4 b() {
        return this.f14499a;
    }
}
