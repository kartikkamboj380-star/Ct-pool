package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1070d7 extends AbstractC1152n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C6 f14553o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1070d7(B5 b52, String str, C6 c62) {
        super(str);
        this.f14553o = c62;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        D2.g("getValue", 2, list);
        InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
        InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(1));
        String strF = this.f14553o.f(interfaceC1196sB.c());
        return strF != null ? new C1214u(strF) : interfaceC1196sB2;
    }
}
