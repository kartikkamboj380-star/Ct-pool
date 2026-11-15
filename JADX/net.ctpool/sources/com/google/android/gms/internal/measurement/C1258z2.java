package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1258z2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1258z2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private F4 zze = AbstractC1260z4.z();
    private F4 zzf = AbstractC1260z4.z();
    private J4 zzg = AbstractC1260z4.A();
    private J4 zzh = AbstractC1260z4.A();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1258z2.zzc);
        }

        public final a A() {
            q();
            C1258z2.N((C1258z2) this.f15001n);
            return this;
        }

        public final a B(Iterable iterable) {
            q();
            C1258z2.O((C1258z2) this.f15001n, iterable);
            return this;
        }

        public final a t() {
            q();
            C1258z2.E((C1258z2) this.f15001n);
            return this;
        }

        public final a u(Iterable iterable) {
            q();
            C1258z2.F((C1258z2) this.f15001n, iterable);
            return this;
        }

        public final a v() {
            q();
            C1258z2.H((C1258z2) this.f15001n);
            return this;
        }

        public final a x(Iterable iterable) {
            q();
            C1258z2.I((C1258z2) this.f15001n, iterable);
            return this;
        }

        public final a y() {
            q();
            C1258z2.K((C1258z2) this.f15001n);
            return this;
        }

        public final a z(Iterable iterable) {
            q();
            C1258z2.L((C1258z2) this.f15001n, iterable);
            return this;
        }
    }

    static {
        C1258z2 c1258z2 = new C1258z2();
        zzc = c1258z2;
        AbstractC1260z4.s(C1258z2.class, c1258z2);
    }

    private C1258z2() {
    }

    static /* synthetic */ void E(C1258z2 c1258z2) {
        c1258z2.zzg = AbstractC1260z4.A();
    }

    static /* synthetic */ void F(C1258z2 c1258z2, Iterable iterable) {
        J4 j42 = c1258z2.zzg;
        if (!j42.zzc()) {
            c1258z2.zzg = AbstractC1260z4.o(j42);
        }
        J3.f(iterable, c1258z2.zzg);
    }

    static /* synthetic */ void H(C1258z2 c1258z2) {
        c1258z2.zzf = AbstractC1260z4.z();
    }

    static /* synthetic */ void I(C1258z2 c1258z2, Iterable iterable) {
        F4 f42 = c1258z2.zzf;
        if (!f42.zzc()) {
            c1258z2.zzf = AbstractC1260z4.m(f42);
        }
        J3.f(iterable, c1258z2.zzf);
    }

    static /* synthetic */ void K(C1258z2 c1258z2) {
        c1258z2.zzh = AbstractC1260z4.A();
    }

    static /* synthetic */ void L(C1258z2 c1258z2, Iterable iterable) {
        J4 j42 = c1258z2.zzh;
        if (!j42.zzc()) {
            c1258z2.zzh = AbstractC1260z4.o(j42);
        }
        J3.f(iterable, c1258z2.zzh);
    }

    static /* synthetic */ void N(C1258z2 c1258z2) {
        c1258z2.zze = AbstractC1260z4.z();
    }

    static /* synthetic */ void O(C1258z2 c1258z2, Iterable iterable) {
        F4 f42 = c1258z2.zze;
        if (!f42.zzc()) {
            c1258z2.zze = AbstractC1260z4.m(f42);
        }
        J3.f(iterable, c1258z2.zze);
    }

    public static a P() {
        return (a) zzc.v();
    }

    public static C1258z2 R() {
        return zzc;
    }

    public final int G() {
        return this.zzf.size();
    }

    public final int J() {
        return this.zzh.size();
    }

    public final int M() {
        return this.zze.size();
    }

    public final List S() {
        return this.zzg;
    }

    public final List T() {
        return this.zzf;
    }

    public final List U() {
        return this.zzh;
    }

    public final List V() {
        return this.zze;
    }

    public final int j() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1258z2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C1190r2.class, "zzh", A2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1258z2.class) {
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
