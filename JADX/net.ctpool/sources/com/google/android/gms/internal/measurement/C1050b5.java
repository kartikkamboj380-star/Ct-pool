package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1050b5 implements Y4 {
    C1050b5() {
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final W4 c(Object obj) {
        androidx.appcompat.app.y.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final Map d(Object obj) {
        return (Z4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final Object e(Object obj) {
        return Z4.b().e();
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final boolean f(Object obj) {
        return !((Z4) obj).h();
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final Map g(Object obj) {
        return (Z4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final Object h(Object obj, Object obj2) {
        Z4 z4E = (Z4) obj;
        Z4 z42 = (Z4) obj2;
        if (!z42.isEmpty()) {
            if (!z4E.h()) {
                z4E = z4E.e();
            }
            z4E.d(z42);
        }
        return z4E;
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final Object i(Object obj) {
        ((Z4) obj).g();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final int j(int i7, Object obj, Object obj2) {
        Z4 z42 = (Z4) obj;
        androidx.appcompat.app.y.a(obj2);
        if (z42.isEmpty()) {
            return 0;
        }
        Iterator it = z42.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
