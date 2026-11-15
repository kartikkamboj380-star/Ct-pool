package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: loaded from: classes.dex */
public final class B2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final B2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(B2.zzc);
        }

        public final a A(String str) {
            q();
            B2.M((B2) this.f15001n, str);
            return this;
        }

        public final a B() {
            q();
            B2.O((B2) this.f15001n);
            return this;
        }

        public final a t() {
            q();
            B2.F((B2) this.f15001n);
            return this;
        }

        public final a u(double d7) {
            q();
            B2.G((B2) this.f15001n, d7);
            return this;
        }

        public final a v(long j7) {
            q();
            B2.H((B2) this.f15001n, j7);
            return this;
        }

        public final a x(String str) {
            q();
            B2.I((B2) this.f15001n, str);
            return this;
        }

        public final a y() {
            q();
            B2.K((B2) this.f15001n);
            return this;
        }

        public final a z(long j7) {
            q();
            B2.L((B2) this.f15001n, j7);
            return this;
        }
    }

    static {
        B2 b22 = new B2();
        zzc = b22;
        AbstractC1260z4.s(B2.class, b22);
    }

    private B2() {
    }

    static /* synthetic */ void F(B2 b22) {
        b22.zze &= -33;
        b22.zzk = 0.0d;
    }

    static /* synthetic */ void G(B2 b22, double d7) {
        b22.zze |= 32;
        b22.zzk = d7;
    }

    static /* synthetic */ void H(B2 b22, long j7) {
        b22.zze |= 8;
        b22.zzi = j7;
    }

    static /* synthetic */ void I(B2 b22, String str) {
        str.getClass();
        b22.zze |= 2;
        b22.zzg = str;
    }

    static /* synthetic */ void K(B2 b22) {
        b22.zze &= -9;
        b22.zzi = 0L;
    }

    static /* synthetic */ void L(B2 b22, long j7) {
        b22.zze |= 1;
        b22.zzf = j7;
    }

    static /* synthetic */ void M(B2 b22, String str) {
        str.getClass();
        b22.zze |= 4;
        b22.zzh = str;
    }

    static /* synthetic */ void O(B2 b22) {
        b22.zze &= -5;
        b22.zzh = zzc.zzh;
    }

    public static a Q() {
        return (a) zzc.v();
    }

    public final double E() {
        return this.zzk;
    }

    public final float J() {
        return this.zzj;
    }

    public final long N() {
        return this.zzi;
    }

    public final long P() {
        return this.zzf;
    }

    public final String S() {
        return this.zzg;
    }

    public final String T() {
        return this.zzh;
    }

    public final boolean U() {
        return (this.zze & 32) != 0;
    }

    public final boolean V() {
        return (this.zze & 16) != 0;
    }

    public final boolean W() {
        return (this.zze & 8) != 0;
    }

    public final boolean X() {
        return (this.zze & 1) != 0;
    }

    public final boolean Y() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new B2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (B2.class) {
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
