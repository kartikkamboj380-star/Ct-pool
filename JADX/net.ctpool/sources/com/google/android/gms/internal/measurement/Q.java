package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class Q implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1093g3 f14313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14314b;

    public Q(C1093g3 c1093g3, String str) {
        this.f14313a = c1093g3;
        this.f14314b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final C1093g3 a(InterfaceC1196s interfaceC1196s) {
        C1093g3 c1093g3D = this.f14313a.d();
        c1093g3D.e(this.f14314b, interfaceC1196s);
        return c1093g3D;
    }
}
