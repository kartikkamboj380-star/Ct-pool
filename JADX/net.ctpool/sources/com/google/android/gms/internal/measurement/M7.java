package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M7 extends AbstractC1152n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Q7 f14283o;

    public M7(Q7 q7) {
        super("internal.logger");
        this.f14283o = q7;
        this.f14746n.put("log", new P7(this, false, true));
        this.f14746n.put("silent", new E7(this, "silent"));
        ((AbstractC1152n) this.f14746n.get("silent")).k("log", new P7(this, true, true));
        this.f14746n.put("unmonitored", new O7(this, "unmonitored"));
        ((AbstractC1152n) this.f14746n.get("unmonitored")).k("log", new P7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        return InterfaceC1196s.f14815d;
    }
}
