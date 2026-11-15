package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class G2 extends AbstractC1329r0 implements X0 {
    private static final G2 zzb;
    private int zzd;
    private int zze;

    static {
        G2 g22 = new G2();
        zzb = g22;
        AbstractC1329r0.t(G2.class, g22);
    }

    private G2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i8 == 3) {
            return new G2();
        }
        E2 e22 = null;
        if (i8 == 4) {
            return new F2(e22);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
