package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class U4 implements InterfaceC1059c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1059c5[] f14384a;

    U4(InterfaceC1059c5... interfaceC1059c5Arr) {
        this.f14384a = interfaceC1059c5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1059c5
    public final InterfaceC1077e5 a(Class cls) {
        for (InterfaceC1059c5 interfaceC1059c5 : this.f14384a) {
            if (interfaceC1059c5.b(cls)) {
                return interfaceC1059c5.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1059c5
    public final boolean b(Class cls) {
        for (InterfaceC1059c5 interfaceC1059c5 : this.f14384a) {
            if (interfaceC1059c5.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
