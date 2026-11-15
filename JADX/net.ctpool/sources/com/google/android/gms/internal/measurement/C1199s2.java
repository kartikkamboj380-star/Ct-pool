package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1217u2;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1199s2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1199s2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private J4 zzf = AbstractC1260z4.A();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1199s2.zzc);
        }

        public final a A(C1217u2 c1217u2) {
            q();
            C1199s2.J((C1199s2) this.f15001n, c1217u2);
            return this;
        }

        public final a B(Iterable iterable) {
            q();
            C1199s2.K((C1199s2) this.f15001n, iterable);
            return this;
        }

        public final a C(String str) {
            q();
            C1199s2.L((C1199s2) this.f15001n, str);
            return this;
        }

        public final long D() {
            return ((C1199s2) this.f15001n).O();
        }

        public final a E(long j7) {
            q();
            C1199s2.N((C1199s2) this.f15001n, j7);
            return this;
        }

        public final C1217u2 F(int i7) {
            return ((C1199s2) this.f15001n).E(i7);
        }

        public final long G() {
            return ((C1199s2) this.f15001n).P();
        }

        public final a H() {
            q();
            C1199s2.F((C1199s2) this.f15001n);
            return this;
        }

        public final String I() {
            return ((C1199s2) this.f15001n).S();
        }

        public final List J() {
            return Collections.unmodifiableList(((C1199s2) this.f15001n).T());
        }

        public final boolean K() {
            return ((C1199s2) this.f15001n).W();
        }

        public final int t() {
            return ((C1199s2) this.f15001n).M();
        }

        public final a u(int i7) {
            q();
            C1199s2.G((C1199s2) this.f15001n, i7);
            return this;
        }

        public final a v(int i7, C1217u2.a aVar) {
            q();
            C1199s2.H((C1199s2) this.f15001n, i7, (C1217u2) ((AbstractC1260z4) aVar.p()));
            return this;
        }

        public final a x(int i7, C1217u2 c1217u2) {
            q();
            C1199s2.H((C1199s2) this.f15001n, i7, c1217u2);
            return this;
        }

        public final a y(long j7) {
            q();
            C1199s2.I((C1199s2) this.f15001n, j7);
            return this;
        }

        public final a z(C1217u2.a aVar) {
            q();
            C1199s2.J((C1199s2) this.f15001n, (C1217u2) ((AbstractC1260z4) aVar.p()));
            return this;
        }
    }

    static {
        C1199s2 c1199s2 = new C1199s2();
        zzc = c1199s2;
        AbstractC1260z4.s(C1199s2.class, c1199s2);
    }

    private C1199s2() {
    }

    static /* synthetic */ void F(C1199s2 c1199s2) {
        c1199s2.zzf = AbstractC1260z4.A();
    }

    static /* synthetic */ void G(C1199s2 c1199s2, int i7) {
        c1199s2.X();
        c1199s2.zzf.remove(i7);
    }

    static /* synthetic */ void H(C1199s2 c1199s2, int i7, C1217u2 c1217u2) {
        c1217u2.getClass();
        c1199s2.X();
        c1199s2.zzf.set(i7, c1217u2);
    }

    static /* synthetic */ void I(C1199s2 c1199s2, long j7) {
        c1199s2.zze |= 4;
        c1199s2.zzi = j7;
    }

    static /* synthetic */ void J(C1199s2 c1199s2, C1217u2 c1217u2) {
        c1217u2.getClass();
        c1199s2.X();
        c1199s2.zzf.add(c1217u2);
    }

    static /* synthetic */ void K(C1199s2 c1199s2, Iterable iterable) {
        c1199s2.X();
        J3.f(iterable, c1199s2.zzf);
    }

    static /* synthetic */ void L(C1199s2 c1199s2, String str) {
        str.getClass();
        c1199s2.zze |= 1;
        c1199s2.zzg = str;
    }

    static /* synthetic */ void N(C1199s2 c1199s2, long j7) {
        c1199s2.zze |= 2;
        c1199s2.zzh = j7;
    }

    public static a Q() {
        return (a) zzc.v();
    }

    private final void X() {
        J4 j42 = this.zzf;
        if (j42.zzc()) {
            return;
        }
        this.zzf = AbstractC1260z4.o(j42);
    }

    public final C1217u2 E(int i7) {
        return (C1217u2) this.zzf.get(i7);
    }

    public final int M() {
        return this.zzf.size();
    }

    public final long O() {
        return this.zzi;
    }

    public final long P() {
        return this.zzh;
    }

    public final String S() {
        return this.zzg;
    }

    public final List T() {
        return this.zzf;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 4) != 0;
    }

    public final boolean W() {
        return (this.zze & 2) != 0;
    }

    public final int j() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1199s2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C1217u2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1199s2.class) {
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
