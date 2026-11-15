package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends AbstractC1329r0 implements X0 {
    private static final p2 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        AbstractC1329r0.t(p2.class, p2Var);
    }

    private p2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new p2();
        }
        AbstractC1318n2 abstractC1318n2 = null;
        if (i8 == 4) {
            return new C1322o2(abstractC1318n2);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
