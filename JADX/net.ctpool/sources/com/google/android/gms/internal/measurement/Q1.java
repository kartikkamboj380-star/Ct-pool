package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.U1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final Q1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private J4 zzg = AbstractC1260z4.A();
    private J4 zzh = AbstractC1260z4.A();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(Q1.zzc);
        }

        public final int t() {
            return ((Q1) this.f15001n).H();
        }

        public final a u(int i7, R1.a aVar) {
            q();
            Q1.F((Q1) this.f15001n, i7, (R1) ((AbstractC1260z4) aVar.p()));
            return this;
        }

        public final a v(int i7, U1.a aVar) {
            q();
            Q1.G((Q1) this.f15001n, i7, (U1) ((AbstractC1260z4) aVar.p()));
            return this;
        }

        public final R1 x(int i7) {
            return ((Q1) this.f15001n).E(i7);
        }

        public final int y() {
            return ((Q1) this.f15001n).J();
        }

        public final U1 z(int i7) {
            return ((Q1) this.f15001n).I(i7);
        }
    }

    static {
        Q1 q12 = new Q1();
        zzc = q12;
        AbstractC1260z4.s(Q1.class, q12);
    }

    private Q1() {
    }

    static /* synthetic */ void F(Q1 q12, int i7, R1 r12) {
        r12.getClass();
        J4 j42 = q12.zzh;
        if (!j42.zzc()) {
            q12.zzh = AbstractC1260z4.o(j42);
        }
        q12.zzh.set(i7, r12);
    }

    static /* synthetic */ void G(Q1 q12, int i7, U1 u12) {
        u12.getClass();
        J4 j42 = q12.zzg;
        if (!j42.zzc()) {
            q12.zzg = AbstractC1260z4.o(j42);
        }
        q12.zzg.set(i7, u12);
    }

    public final R1 E(int i7) {
        return (R1) this.zzh.get(i7);
    }

    public final int H() {
        return this.zzh.size();
    }

    public final U1 I(int i7) {
        return (U1) this.zzg.get(i7);
    }

    public final int J() {
        return this.zzg.size();
    }

    public final List L() {
        return this.zzh;
    }

    public final List M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (P1.f14304a[i7 - 1]) {
            case 1:
                return new Q1();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", U1.class, "zzh", R1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (Q1.class) {
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
