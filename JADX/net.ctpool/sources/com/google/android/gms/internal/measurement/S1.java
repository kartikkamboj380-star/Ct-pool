package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: loaded from: classes.dex */
public final class S1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final S1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private V1 zzf;
    private T1 zzg;
    private boolean zzh;
    private String zzi = "";

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(S1.zzc);
        }

        public final a t(String str) {
            q();
            S1.F((S1) this.f15001n, str);
            return this;
        }
    }

    static {
        S1 s12 = new S1();
        zzc = s12;
        AbstractC1260z4.s(S1.class, s12);
    }

    private S1() {
    }

    static /* synthetic */ void F(S1 s12, String str) {
        str.getClass();
        s12.zze |= 8;
        s12.zzi = str;
    }

    public static S1 G() {
        return zzc;
    }

    public final T1 H() {
        T1 t12 = this.zzg;
        return t12 == null ? T1.G() : t12;
    }

    public final V1 I() {
        V1 v12 = this.zzf;
        return v12 == null ? V1.G() : v12;
    }

    public final String J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (P1.f14304a[i7 - 1]) {
            case 1:
                return new S1();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (S1.class) {
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
