package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class D2 extends AbstractC1329r0 implements X0 {
    private static final D2 zzb;
    private int zzd;
    private int zze;

    static {
        D2 d22 = new D2();
        zzb = d22;
        AbstractC1329r0.t(D2.class, d22);
    }

    private D2() {
    }

    public static D2 B() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C2.f15038a});
        }
        if (i8 == 3) {
            return new D2();
        }
        A2 a22 = null;
        if (i8 == 4) {
            return new B2(a22);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
