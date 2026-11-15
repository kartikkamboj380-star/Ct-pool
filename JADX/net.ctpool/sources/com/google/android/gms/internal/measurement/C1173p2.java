package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1173p2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1173p2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1173p2.zzc);
        }

        public final a A(boolean z6) {
            q();
            C1173p2.Q((C1173p2) this.f15001n, z6);
            return this;
        }

        public final a t(boolean z6) {
            q();
            C1173p2.F((C1173p2) this.f15001n, z6);
            return this;
        }

        public final a u(boolean z6) {
            q();
            C1173p2.H((C1173p2) this.f15001n, z6);
            return this;
        }

        public final a v(boolean z6) {
            q();
            C1173p2.J((C1173p2) this.f15001n, z6);
            return this;
        }

        public final a x(boolean z6) {
            q();
            C1173p2.K((C1173p2) this.f15001n, z6);
            return this;
        }

        public final a y(boolean z6) {
            q();
            C1173p2.M((C1173p2) this.f15001n, z6);
            return this;
        }

        public final a z(boolean z6) {
            q();
            C1173p2.O((C1173p2) this.f15001n, z6);
            return this;
        }
    }

    static {
        C1173p2 c1173p2 = new C1173p2();
        zzc = c1173p2;
        AbstractC1260z4.s(C1173p2.class, c1173p2);
    }

    private C1173p2() {
    }

    public static a E() {
        return (a) zzc.v();
    }

    static /* synthetic */ void F(C1173p2 c1173p2, boolean z6) {
        c1173p2.zze |= 32;
        c1173p2.zzk = z6;
    }

    static /* synthetic */ void H(C1173p2 c1173p2, boolean z6) {
        c1173p2.zze |= 16;
        c1173p2.zzj = z6;
    }

    public static C1173p2 I() {
        return zzc;
    }

    static /* synthetic */ void J(C1173p2 c1173p2, boolean z6) {
        c1173p2.zze |= 1;
        c1173p2.zzf = z6;
    }

    static /* synthetic */ void K(C1173p2 c1173p2, boolean z6) {
        c1173p2.zze |= 64;
        c1173p2.zzl = z6;
    }

    static /* synthetic */ void M(C1173p2 c1173p2, boolean z6) {
        c1173p2.zze |= 2;
        c1173p2.zzg = z6;
    }

    static /* synthetic */ void O(C1173p2 c1173p2, boolean z6) {
        c1173p2.zze |= 4;
        c1173p2.zzh = z6;
    }

    static /* synthetic */ void Q(C1173p2 c1173p2, boolean z6) {
        c1173p2.zze |= 8;
        c1173p2.zzi = z6;
    }

    public final boolean L() {
        return this.zzk;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean P() {
        return this.zzf;
    }

    public final boolean R() {
        return this.zzl;
    }

    public final boolean S() {
        return this.zzg;
    }

    public final boolean T() {
        return this.zzh;
    }

    public final boolean U() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1173p2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1173p2.class) {
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
