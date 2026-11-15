package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1258z2;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1182q2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1182q2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private C1258z2 zzg;
    private C1258z2 zzh;
    private boolean zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1182q2.zzc);
        }

        public final a t(int i7) {
            q();
            C1182q2.E((C1182q2) this.f15001n, i7);
            return this;
        }

        public final a u(C1258z2.a aVar) {
            q();
            C1182q2.F((C1182q2) this.f15001n, (C1258z2) ((AbstractC1260z4) aVar.p()));
            return this;
        }

        public final a v(C1258z2 c1258z2) {
            q();
            C1182q2.I((C1182q2) this.f15001n, c1258z2);
            return this;
        }

        public final a x(boolean z6) {
            q();
            C1182q2.G((C1182q2) this.f15001n, z6);
            return this;
        }
    }

    static {
        C1182q2 c1182q2 = new C1182q2();
        zzc = c1182q2;
        AbstractC1260z4.s(C1182q2.class, c1182q2);
    }

    private C1182q2() {
    }

    static /* synthetic */ void E(C1182q2 c1182q2, int i7) {
        c1182q2.zze |= 1;
        c1182q2.zzf = i7;
    }

    static /* synthetic */ void F(C1182q2 c1182q2, C1258z2 c1258z2) {
        c1258z2.getClass();
        c1182q2.zzg = c1258z2;
        c1182q2.zze |= 2;
    }

    static /* synthetic */ void G(C1182q2 c1182q2, boolean z6) {
        c1182q2.zze |= 8;
        c1182q2.zzi = z6;
    }

    public static a H() {
        return (a) zzc.v();
    }

    static /* synthetic */ void I(C1182q2 c1182q2, C1258z2 c1258z2) {
        c1258z2.getClass();
        c1182q2.zzh = c1258z2;
        c1182q2.zze |= 4;
    }

    public final C1258z2 K() {
        C1258z2 c1258z2 = this.zzg;
        return c1258z2 == null ? C1258z2.R() : c1258z2;
    }

    public final C1258z2 L() {
        C1258z2 c1258z2 = this.zzh;
        return c1258z2 == null ? C1258z2.R() : c1258z2;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 8) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1182q2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1182q2.class) {
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
