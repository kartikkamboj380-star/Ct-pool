package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1190r2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1190r2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1190r2.zzc);
        }

        public final a t(int i7) {
            q();
            C1190r2.E((C1190r2) this.f15001n, i7);
            return this;
        }

        public final a u(long j7) {
            q();
            C1190r2.F((C1190r2) this.f15001n, j7);
            return this;
        }
    }

    static {
        C1190r2 c1190r2 = new C1190r2();
        zzc = c1190r2;
        AbstractC1260z4.s(C1190r2.class, c1190r2);
    }

    private C1190r2() {
    }

    static /* synthetic */ void E(C1190r2 c1190r2, int i7) {
        c1190r2.zze |= 1;
        c1190r2.zzf = i7;
    }

    static /* synthetic */ void F(C1190r2 c1190r2, long j7) {
        c1190r2.zze |= 2;
        c1190r2.zzg = j7;
    }

    public static a H() {
        return (a) zzc.v();
    }

    public final long G() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zze & 2) != 0;
    }

    public final boolean K() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1190r2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1190r2.class) {
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
