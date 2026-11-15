package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class J0 extends L0 {
    /* synthetic */ J0(I0 i02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.L0
    final void a(Object obj, long j7) {
        ((InterfaceC1350y0) H1.k(obj, j7)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.L0
    final void b(Object obj, Object obj2, long j7) {
        InterfaceC1350y0 interfaceC1350y0G = (InterfaceC1350y0) H1.k(obj, j7);
        InterfaceC1350y0 interfaceC1350y0 = (InterfaceC1350y0) H1.k(obj2, j7);
        int size = interfaceC1350y0G.size();
        int size2 = interfaceC1350y0.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC1350y0G.zzc()) {
                interfaceC1350y0G = interfaceC1350y0G.g(size2 + size);
            }
            interfaceC1350y0G.addAll(interfaceC1350y0);
        }
        if (size > 0) {
            interfaceC1350y0 = interfaceC1350y0G;
        }
        H1.x(obj, j7, interfaceC1350y0);
    }
}
