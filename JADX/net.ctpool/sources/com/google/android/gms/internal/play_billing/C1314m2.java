package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1314m2 extends AbstractC1329r0 implements X0 {
    private static final C1314m2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C1314m2 c1314m2 = new C1314m2();
        zzb = c1314m2;
        AbstractC1329r0.t(C1314m2.class, c1314m2);
    }

    private C1314m2() {
    }

    static /* synthetic */ void A(C1314m2 c1314m2, String str) {
        str.getClass();
        c1314m2.zzd |= 1;
        c1314m2.zze = str;
    }

    static /* synthetic */ void B(C1314m2 c1314m2, String str) {
        str.getClass();
        c1314m2.zzd |= 2;
        c1314m2.zzf = str;
    }

    static /* synthetic */ void C(C1314m2 c1314m2, int i7) {
        c1314m2.zzd |= 4;
        c1314m2.zzg = i7;
    }

    public static C1310l2 D() {
        return (C1310l2) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1329r0
    protected final Object x(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return AbstractC1329r0.q(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new C1314m2();
        }
        AbstractC1306k2 abstractC1306k2 = null;
        if (i8 == 4) {
            return new C1310l2(abstractC1306k2);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
