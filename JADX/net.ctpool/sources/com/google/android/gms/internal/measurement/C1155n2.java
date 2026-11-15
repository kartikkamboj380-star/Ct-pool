package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1155n2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1155n2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1155n2.zzc);
        }

        public final a A() {
            q();
            C1155n2.F((C1155n2) this.f15001n);
            return this;
        }

        public final a B(String str) {
            q();
            C1155n2.O((C1155n2) this.f15001n, str);
            return this;
        }

        public final a C() {
            q();
            C1155n2.J((C1155n2) this.f15001n);
            return this;
        }

        public final a D(String str) {
            q();
            C1155n2.R((C1155n2) this.f15001n, str);
            return this;
        }

        public final a E() {
            q();
            C1155n2.N((C1155n2) this.f15001n);
            return this;
        }

        public final a F(String str) {
            q();
            C1155n2.U((C1155n2) this.f15001n, str);
            return this;
        }

        public final a G() {
            q();
            C1155n2.Q((C1155n2) this.f15001n);
            return this;
        }

        public final a H(String str) {
            q();
            C1155n2.X((C1155n2) this.f15001n, str);
            return this;
        }

        public final a I() {
            q();
            C1155n2.T((C1155n2) this.f15001n);
            return this;
        }

        public final a J() {
            q();
            C1155n2.W((C1155n2) this.f15001n);
            return this;
        }

        public final long t() {
            return ((C1155n2) this.f15001n).E();
        }

        public final a u(long j7) {
            q();
            C1155n2.G((C1155n2) this.f15001n, j7);
            return this;
        }

        public final a v(String str) {
            q();
            C1155n2.H((C1155n2) this.f15001n, str);
            return this;
        }

        public final long x() {
            return ((C1155n2) this.f15001n).I();
        }

        public final a y(long j7) {
            q();
            C1155n2.K((C1155n2) this.f15001n, j7);
            return this;
        }

        public final a z(String str) {
            q();
            C1155n2.L((C1155n2) this.f15001n, str);
            return this;
        }
    }

    static {
        C1155n2 c1155n2 = new C1155n2();
        zzc = c1155n2;
        AbstractC1260z4.s(C1155n2.class, c1155n2);
    }

    private C1155n2() {
    }

    static /* synthetic */ void F(C1155n2 c1155n2) {
        c1155n2.zze &= -5;
        c1155n2.zzh = zzc.zzh;
    }

    static /* synthetic */ void G(C1155n2 c1155n2, long j7) {
        c1155n2.zze |= 8;
        c1155n2.zzi = j7;
    }

    static /* synthetic */ void H(C1155n2 c1155n2, String str) {
        str.getClass();
        c1155n2.zze |= 4;
        c1155n2.zzh = str;
    }

    static /* synthetic */ void J(C1155n2 c1155n2) {
        c1155n2.zze &= -3;
        c1155n2.zzg = zzc.zzg;
    }

    static /* synthetic */ void K(C1155n2 c1155n2, long j7) {
        c1155n2.zze |= 128;
        c1155n2.zzm = j7;
    }

    static /* synthetic */ void L(C1155n2 c1155n2, String str) {
        str.getClass();
        c1155n2.zze |= 2;
        c1155n2.zzg = str;
    }

    public static a M() {
        return (a) zzc.v();
    }

    static /* synthetic */ void N(C1155n2 c1155n2) {
        c1155n2.zze &= -2;
        c1155n2.zzf = zzc.zzf;
    }

    static /* synthetic */ void O(C1155n2 c1155n2, String str) {
        str.getClass();
        c1155n2.zze |= 1;
        c1155n2.zzf = str;
    }

    static /* synthetic */ void Q(C1155n2 c1155n2) {
        c1155n2.zze &= -65;
        c1155n2.zzl = zzc.zzl;
    }

    static /* synthetic */ void R(C1155n2 c1155n2, String str) {
        str.getClass();
        c1155n2.zze |= 64;
        c1155n2.zzl = str;
    }

    public static C1155n2 S() {
        return zzc;
    }

    static /* synthetic */ void T(C1155n2 c1155n2) {
        c1155n2.zze &= -33;
        c1155n2.zzk = zzc.zzk;
    }

    static /* synthetic */ void U(C1155n2 c1155n2, String str) {
        str.getClass();
        c1155n2.zze |= 32;
        c1155n2.zzk = str;
    }

    static /* synthetic */ void W(C1155n2 c1155n2) {
        c1155n2.zze &= -17;
        c1155n2.zzj = zzc.zzj;
    }

    static /* synthetic */ void X(C1155n2 c1155n2, String str) {
        str.getClass();
        c1155n2.zze |= 16;
        c1155n2.zzj = str;
    }

    public final long E() {
        return this.zzi;
    }

    public final long I() {
        return this.zzm;
    }

    public final String V() {
        return this.zzh;
    }

    public final String Y() {
        return this.zzg;
    }

    public final String Z() {
        return this.zzf;
    }

    public final String b0() {
        return this.zzl;
    }

    public final String c0() {
        return this.zzk;
    }

    public final String d0() {
        return this.zzj;
    }

    public final boolean e0() {
        return (this.zze & 4) != 0;
    }

    public final boolean f0() {
        return (this.zze & 2) != 0;
    }

    public final boolean g0() {
        return (this.zze & 1) != 0;
    }

    public final boolean h0() {
        return (this.zze & 8) != 0;
    }

    public final boolean i0() {
        return (this.zze & 128) != 0;
    }

    public final boolean j0() {
        return (this.zze & 64) != 0;
    }

    public final boolean k0() {
        return (this.zze & 32) != 0;
    }

    public final boolean l0() {
        return (this.zze & 16) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1155n2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1155n2.class) {
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
