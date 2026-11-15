package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1302j2 extends AbstractC1329r0 implements X0 {
    private static final InterfaceC1347x0 zzb = new C1278d2();
    private static final C1302j2 zzd;
    private int zze;
    private int zzg;
    private C1274c2 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private InterfaceC1344w0 zzh = AbstractC1329r0.n();
    private InterfaceC1350y0 zzi = AbstractC1329r0.o();

    static {
        C1302j2 c1302j2 = new C1302j2();
        zzd = c1302j2;
        AbstractC1329r0.t(C1302j2.class, c1302j2);
    }

    private C1302j2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", C1298i2.f15199a, "zzh", C1286f2.f15180a, "zzi", z2.class, "zzj", "zzk", "zzl"});
        }
        if (i8 == 3) {
            return new C1302j2();
        }
        C1278d2 c1278d2 = null;
        if (i8 == 4) {
            return new C1294h2(c1278d2);
        }
        if (i8 != 5) {
            return null;
        }
        return zzd;
    }
}
