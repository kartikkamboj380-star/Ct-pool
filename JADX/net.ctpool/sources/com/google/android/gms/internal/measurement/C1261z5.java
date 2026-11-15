package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1261z5 extends AbstractC1237w5 {
    C1261z5() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1237w5
    public final void m() {
        if (!o()) {
            if (a() > 0) {
                androidx.appcompat.app.y.a(g(0).getKey());
                throw null;
            }
            Iterator it = h().iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.y.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.m();
    }
}
