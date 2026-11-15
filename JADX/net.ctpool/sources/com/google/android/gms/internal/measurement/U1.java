package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: loaded from: classes.dex */
public final class U1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final U1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private S1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(U1.zzc);
        }

        public final a t(String str) {
            q();
            U1.E((U1) this.f15001n, str);
            return this;
        }
    }

    static {
        U1 u12 = new U1();
        zzc = u12;
        AbstractC1260z4.s(U1.class, u12);
    }

    private U1() {
    }

    static /* synthetic */ void E(U1 u12, String str) {
        str.getClass();
        u12.zze |= 2;
        u12.zzg = str;
    }

    public static a G() {
        return (a) zzc.v();
    }

    public final S1 F() {
        S1 s12 = this.zzh;
        return s12 == null ? S1.G() : s12;
    }

    public final String I() {
        return this.zzg;
    }

    public final boolean J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzj;
    }

    public final boolean L() {
        return this.zzk;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 32) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (P1.f14304a[i7 - 1]) {
            case 1:
                return new U1();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (U1.class) {
                        try {
                            aVar = zzd;
                            if (aVar == null) {
                                aVar = new AbstractC1260z4.a(zzc);
                                zzd = aVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
