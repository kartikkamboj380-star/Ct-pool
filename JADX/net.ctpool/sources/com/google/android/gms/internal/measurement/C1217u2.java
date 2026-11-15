package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1217u2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1217u2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private J4 zzk = AbstractC1260z4.A();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1217u2.zzc);
        }

        public final a A() {
            q();
            C1217u2.F((C1217u2) this.f15001n);
            return this;
        }

        public final a B(String str) {
            q();
            C1217u2.N((C1217u2) this.f15001n, str);
            return this;
        }

        public final a C() {
            q();
            C1217u2.M((C1217u2) this.f15001n);
            return this;
        }

        public final a D() {
            q();
            C1217u2.P((C1217u2) this.f15001n);
            return this;
        }

        public final a E() {
            q();
            C1217u2.R((C1217u2) this.f15001n);
            return this;
        }

        public final String F() {
            return ((C1217u2) this.f15001n).U();
        }

        public final String G() {
            return ((C1217u2) this.f15001n).V();
        }

        public final int t() {
            return ((C1217u2) this.f15001n).O();
        }

        public final a u(double d7) {
            q();
            C1217u2.G((C1217u2) this.f15001n, d7);
            return this;
        }

        public final a v(long j7) {
            q();
            C1217u2.H((C1217u2) this.f15001n, j7);
            return this;
        }

        public final a x(a aVar) {
            q();
            C1217u2.I((C1217u2) this.f15001n, (C1217u2) ((AbstractC1260z4) aVar.p()));
            return this;
        }

        public final a y(Iterable iterable) {
            q();
            C1217u2.J((C1217u2) this.f15001n, iterable);
            return this;
        }

        public final a z(String str) {
            q();
            C1217u2.K((C1217u2) this.f15001n, str);
            return this;
        }
    }

    static {
        C1217u2 c1217u2 = new C1217u2();
        zzc = c1217u2;
        AbstractC1260z4.s(C1217u2.class, c1217u2);
    }

    private C1217u2() {
    }

    static /* synthetic */ void F(C1217u2 c1217u2) {
        c1217u2.zze &= -17;
        c1217u2.zzj = 0.0d;
    }

    static /* synthetic */ void G(C1217u2 c1217u2, double d7) {
        c1217u2.zze |= 16;
        c1217u2.zzj = d7;
    }

    static /* synthetic */ void H(C1217u2 c1217u2, long j7) {
        c1217u2.zze |= 4;
        c1217u2.zzh = j7;
    }

    static /* synthetic */ void I(C1217u2 c1217u2, C1217u2 c1217u22) {
        c1217u22.getClass();
        c1217u2.d0();
        c1217u2.zzk.add(c1217u22);
    }

    static /* synthetic */ void J(C1217u2 c1217u2, Iterable iterable) {
        c1217u2.d0();
        J3.f(iterable, c1217u2.zzk);
    }

    static /* synthetic */ void K(C1217u2 c1217u2, String str) {
        str.getClass();
        c1217u2.zze |= 1;
        c1217u2.zzf = str;
    }

    static /* synthetic */ void M(C1217u2 c1217u2) {
        c1217u2.zze &= -5;
        c1217u2.zzh = 0L;
    }

    static /* synthetic */ void N(C1217u2 c1217u2, String str) {
        str.getClass();
        c1217u2.zze |= 2;
        c1217u2.zzg = str;
    }

    static /* synthetic */ void P(C1217u2 c1217u2) {
        c1217u2.zzk = AbstractC1260z4.A();
    }

    static /* synthetic */ void R(C1217u2 c1217u2) {
        c1217u2.zze &= -3;
        c1217u2.zzg = zzc.zzg;
    }

    public static a S() {
        return (a) zzc.v();
    }

    private final void d0() {
        J4 j42 = this.zzk;
        if (j42.zzc()) {
            return;
        }
        this.zzk = AbstractC1260z4.o(j42);
    }

    public final double E() {
        return this.zzj;
    }

    public final float L() {
        return this.zzi;
    }

    public final int O() {
        return this.zzk.size();
    }

    public final long Q() {
        return this.zzh;
    }

    public final String U() {
        return this.zzf;
    }

    public final String V() {
        return this.zzg;
    }

    public final List W() {
        return this.zzk;
    }

    public final boolean X() {
        return (this.zze & 16) != 0;
    }

    public final boolean Y() {
        return (this.zze & 8) != 0;
    }

    public final boolean Z() {
        return (this.zze & 4) != 0;
    }

    public final boolean b0() {
        return (this.zze & 1) != 0;
    }

    public final boolean c0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1217u2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1217u2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1217u2.class) {
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
