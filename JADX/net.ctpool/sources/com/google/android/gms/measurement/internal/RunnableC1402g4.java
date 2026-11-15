package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1402g4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f16056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f16057n;

    RunnableC1402g4(F3 f32, com.google.android.gms.internal.measurement.U0 u02) {
        this.f16056m = u02;
        this.f16057n = f32;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long lValueOf;
        C1466p5 c1466p5S = this.f16057n.s();
        if (c1466p5S.g().K().z()) {
            if (!c1466p5S.g().x(c1466p5S.zzb().currentTimeMillis()) && c1466p5S.g().f16386s.a() != 0) {
                lValueOf = Long.valueOf(c1466p5S.g().f16386s.a());
            }
            if (lValueOf == null) {
                this.f16057n.f16325a.J().O(this.f16056m, lValueOf.longValue());
                return;
            }
            try {
                this.f16056m.b(null);
                return;
            } catch (RemoteException e7) {
                this.f16057n.f16325a.d().E().b("getSessionId failed with exception", e7);
                return;
            }
        }
        c1466p5S.d().K().a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf == null) {
        }
    }
}
