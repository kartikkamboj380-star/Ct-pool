package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1305k1 extends AbstractC1339u1 {
    C1305k1(int i7) {
        super(i7, null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1339u1
    public final void a() {
        if (!k()) {
            if (b() > 0) {
                androidx.appcompat.app.y.a(h(0).getKey());
                throw null;
            }
            Iterator it = d().iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.y.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
