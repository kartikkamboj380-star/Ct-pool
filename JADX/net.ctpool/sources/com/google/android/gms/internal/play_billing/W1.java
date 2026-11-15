package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class W1 extends AbstractC1329r0 implements X0 {
    private static final W1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        W1 w12 = new W1();
        zzb = w12;
        AbstractC1329r0.t(W1.class, w12);
    }

    private W1() {
    }

    static /* synthetic */ void A(W1 w12, t2 t2Var) {
        t2Var.getClass();
        w12.zzf = t2Var;
        w12.zze = 2;
    }

    static /* synthetic */ void B(W1 w12, int i7) {
        w12.zzg = i7 - 1;
        w12.zzd |= 1;
    }

    public static V1 C() {
        return (V1) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", T1.f15111a, t2.class, G2.class});
        }
        if (i8 == 3) {
            return new W1();
        }
        U1 u12 = null;
        if (i8 == 4) {
            return new V1(u12);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
