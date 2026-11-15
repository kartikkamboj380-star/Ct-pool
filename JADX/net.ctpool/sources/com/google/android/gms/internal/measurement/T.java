package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class T implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1093g3 f14337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14338b;

    public T(C1093g3 c1093g3, String str) {
        this.f14337a = c1093g3;
        this.f14338b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final C1093g3 a(InterfaceC1196s interfaceC1196s) {
        this.f14337a.e(this.f14338b, interfaceC1196s);
        return this.f14337a;
    }
}
