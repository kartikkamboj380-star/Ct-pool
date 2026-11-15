package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class O4 implements P4 {
    O4() {
    }

    private static J4 c(Object obj, long j7) {
        return (J4) M5.B(obj, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void a(Object obj, long j7) {
        c(obj, j7).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void b(Object obj, Object obj2, long j7) {
        J4 j4C = c(obj, j7);
        J4 j4C2 = c(obj2, j7);
        int size = j4C.size();
        int size2 = j4C2.size();
        if (size > 0 && size2 > 0) {
            if (!j4C.zzc()) {
                j4C = j4C.d(size2 + size);
            }
            j4C.addAll(j4C2);
        }
        if (size > 0) {
            j4C2 = j4C;
        }
        M5.j(obj, j7, j4C2);
    }
}
