package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final A2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private F4 zzg = AbstractC1260z4.z();

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(A2.zzc);
        }

        public final a t(int i7) {
            q();
            A2.F((A2) this.f15001n, i7);
            return this;
        }

        public final a u(Iterable iterable) {
            q();
            A2.G((A2) this.f15001n, iterable);
            return this;
        }
    }

    static {
        A2 a22 = new A2();
        zzc = a22;
        AbstractC1260z4.s(A2.class, a22);
    }

    private A2() {
    }

    static /* synthetic */ void F(A2 a22, int i7) {
        a22.zze |= 1;
        a22.zzf = i7;
    }

    static /* synthetic */ void G(A2 a22, Iterable iterable) {
        F4 f42 = a22.zzg;
        if (!f42.zzc()) {
            a22.zzg = AbstractC1260z4.m(f42);
        }
        J3.f(iterable, a22.zzg);
    }

    public static a I() {
        return (a) zzc.v();
    }

    public final long E(int i7) {
        return this.zzg.j(i7);
    }

    public final int H() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new A2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (A2.class) {
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
