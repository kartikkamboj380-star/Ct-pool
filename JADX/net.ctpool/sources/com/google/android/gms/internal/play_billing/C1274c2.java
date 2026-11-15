package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1274c2 extends AbstractC1329r0 implements X0 {
    private static final C1274c2 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C1274c2 c1274c2 = new C1274c2();
        zzb = c1274c2;
        AbstractC1329r0.t(C1274c2.class, c1274c2);
    }

    private C1274c2() {
    }

    static /* synthetic */ void A(C1274c2 c1274c2, int i7) {
        c1274c2.zzd |= 1;
        c1274c2.zze = i7;
    }

    static /* synthetic */ void B(C1274c2 c1274c2, String str) {
        str.getClass();
        c1274c2.zzd |= 2;
        c1274c2.zzf = str;
    }

    static /* synthetic */ void C(C1274c2 c1274c2, String str) {
        c1274c2.zzd |= 8;
        c1274c2.zzh = str;
    }

    static /* synthetic */ void D(C1274c2 c1274c2, int i7) {
        c1274c2.zzg = i7 - 1;
        c1274c2.zzd |= 4;
    }

    public static Y1 E() {
        return (Y1) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C1266a2.f15162a, "zzh"});
        }
        if (i8 == 3) {
            return new C1274c2();
        }
        X1 x12 = null;
        if (i8 == 4) {
            return new Y1(x12);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
