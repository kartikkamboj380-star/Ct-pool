package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends AbstractC1329r0 implements X0 {
    private static final z2 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC1350y0 zze = AbstractC1329r0.o();
    private String zzg = "";

    static {
        z2 z2Var = new z2();
        zzb = z2Var;
        AbstractC1329r0.t(z2.class, z2Var);
    }

    private z2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new z2();
        }
        x2 x2Var = null;
        if (i8 == 4) {
            return new y2(x2Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
