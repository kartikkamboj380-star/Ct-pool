package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class S1 extends AbstractC1329r0 implements X0 {
    private static final S1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C1274c2 zzh;

    static {
        S1 s12 = new S1();
        zzb = s12;
        AbstractC1329r0.t(S1.class, s12);
    }

    private S1() {
    }

    public static S1 A(byte[] bArr, C1284f0 c1284f0) {
        return (S1) AbstractC1329r0.m(zzb, bArr, c1284f0);
    }

    static /* synthetic */ void B(S1 s12, C1274c2 c1274c2) {
        c1274c2.getClass();
        s12.zzh = c1274c2;
        s12.zzd |= 2;
    }

    static /* synthetic */ void C(S1 s12, t2 t2Var) {
        t2Var.getClass();
        s12.zzf = t2Var;
        s12.zze = 4;
    }

    static /* synthetic */ void D(S1 s12, int i7) {
        s12.zzg = i7 - 1;
        s12.zzd |= 1;
    }

    public static R1 E() {
        return (R1) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", T1.f15111a, "zzh", t2.class});
        }
        if (i8 == 3) {
            return new S1();
        }
        Q1 q12 = null;
        if (i8 == 4) {
            return new R1(q12);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
