package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class R1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final R1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private J4 zzh = AbstractC1260z4.A();
    private boolean zzi;
    private T1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(R1.zzc);
        }

        public final int t() {
            return ((R1) this.f15001n).j();
        }

        public final a u(int i7, S1 s12) {
            q();
            R1.F((R1) this.f15001n, i7, s12);
            return this;
        }

        public final a v(String str) {
            q();
            R1.G((R1) this.f15001n, str);
            return this;
        }

        public final S1 x(int i7) {
            return ((R1) this.f15001n).E(i7);
        }

        public final String y() {
            return ((R1) this.f15001n).L();
        }
    }

    static {
        R1 r12 = new R1();
        zzc = r12;
        AbstractC1260z4.s(R1.class, r12);
    }

    private R1() {
    }

    static /* synthetic */ void F(R1 r12, int i7, S1 s12) {
        s12.getClass();
        J4 j42 = r12.zzh;
        if (!j42.zzc()) {
            r12.zzh = AbstractC1260z4.o(j42);
        }
        r12.zzh.set(i7, s12);
    }

    static /* synthetic */ void G(R1 r12, String str) {
        str.getClass();
        r12.zze |= 2;
        r12.zzg = str;
    }

    public static a I() {
        return (a) zzc.v();
    }

    public final S1 E(int i7) {
        return (S1) this.zzh.get(i7);
    }

    public final int H() {
        return this.zzf;
    }

    public final T1 K() {
        T1 t12 = this.zzj;
        return t12 == null ? T1.G() : t12;
    }

    public final String L() {
        return this.zzg;
    }

    public final List M() {
        return this.zzh;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean O() {
        return this.zzl;
    }

    public final boolean P() {
        return this.zzm;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 64) != 0;
    }

    public final int j() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (P1.f14304a[i7 - 1]) {
            case 1:
                return new R1();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", S1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (R1.class) {
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
