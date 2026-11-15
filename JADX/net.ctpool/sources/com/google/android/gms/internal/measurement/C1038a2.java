package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1038a2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1038a2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1038a2.zzc);
        }

        public final boolean A() {
            return ((C1038a2) this.f15001n).K();
        }

        public final boolean B() {
            return ((C1038a2) this.f15001n).L();
        }

        public final int t() {
            return ((C1038a2) this.f15001n).j();
        }

        public final a u(String str) {
            q();
            C1038a2.E((C1038a2) this.f15001n, str);
            return this;
        }

        public final String v() {
            return ((C1038a2) this.f15001n).G();
        }

        public final boolean x() {
            return ((C1038a2) this.f15001n).H();
        }

        public final boolean y() {
            return ((C1038a2) this.f15001n).I();
        }

        public final boolean z() {
            return ((C1038a2) this.f15001n).J();
        }
    }

    static {
        C1038a2 c1038a2 = new C1038a2();
        zzc = c1038a2;
        AbstractC1260z4.s(C1038a2.class, c1038a2);
    }

    private C1038a2() {
    }

    static /* synthetic */ void E(C1038a2 c1038a2, String str) {
        str.getClass();
        c1038a2.zze |= 1;
        c1038a2.zzf = str;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzh;
    }

    public final boolean J() {
        return (this.zze & 2) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final boolean L() {
        return (this.zze & 8) != 0;
    }

    public final int j() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1110i2.f14617a[i7 - 1]) {
            case 1:
                return new C1038a2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1038a2.class) {
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
