package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends AbstractC1329r0 implements X0 {
    private static final w2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C1314m2 zzg;
    private p2 zzh;

    static {
        w2 w2Var = new w2();
        zzb = w2Var;
        AbstractC1329r0.t(w2.class, w2Var);
    }

    private w2() {
    }

    static /* synthetic */ void A(w2 w2Var, D2 d22) {
        w2Var.zzf = d22;
        w2Var.zze = 4;
    }

    static /* synthetic */ void B(w2 w2Var, C1314m2 c1314m2) {
        c1314m2.getClass();
        w2Var.zzg = c1314m2;
        w2Var.zzd |= 1;
    }

    static /* synthetic */ void C(w2 w2Var, S1 s12) {
        w2Var.zzf = s12;
        w2Var.zze = 2;
    }

    static /* synthetic */ void D(w2 w2Var, W1 w12) {
        w2Var.zzf = w12;
        w2Var.zze = 3;
    }

    public static v2 E() {
        return (v2) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", S1.class, W1.class, D2.class, C1302j2.class, "zzh"});
        }
        if (i8 == 3) {
            return new w2();
        }
        u2 u2Var = null;
        if (i8 == 4) {
            return new v2(u2Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
