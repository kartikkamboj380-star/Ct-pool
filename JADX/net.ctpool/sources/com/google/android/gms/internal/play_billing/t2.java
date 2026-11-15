package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends AbstractC1329r0 implements X0 {
    private static final t2 zzb;
    private int zzd;
    private int zze;

    static {
        t2 t2Var = new t2();
        zzb = t2Var;
        AbstractC1329r0.t(t2.class, t2Var);
    }

    private t2() {
    }

    static /* synthetic */ void A(t2 t2Var, int i7) {
        t2Var.zze = i7 - 1;
        t2Var.zzd |= 1;
    }

    public static r2 B() {
        return (r2) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", s2.f15301a});
        }
        if (i8 == 3) {
            return new t2();
        }
        q2 q2Var = null;
        if (i8 == 4) {
            return new r2(q2Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
