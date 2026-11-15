package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: loaded from: classes.dex */
public final class T1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final T1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(T1.zzc);
        }
    }

    public enum b implements E4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14345m;

        b(int i7) {
            this.f14345m = i7;
        }

        public static b e(int i7) {
            if (i7 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i7 == 1) {
                return LESS_THAN;
            }
            if (i7 == 2) {
                return GREATER_THAN;
            }
            if (i7 == 3) {
                return EQUAL;
            }
            if (i7 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static D4 h() {
            return W1.f14403a;
        }

        @Override // com.google.android.gms.internal.measurement.E4
        public final int a() {
            return this.f14345m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14345m + " name=" + name() + '>';
        }
    }

    static {
        T1 t12 = new T1();
        zzc = t12;
        AbstractC1260z4.s(T1.class, t12);
    }

    private T1() {
    }

    public static T1 G() {
        return zzc;
    }

    public final b E() {
        b bVarE = b.e(this.zzf);
        return bVarE == null ? b.UNKNOWN_COMPARISON_TYPE : bVarE;
    }

    public final String H() {
        return this.zzh;
    }

    public final String I() {
        return this.zzj;
    }

    public final String J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 16) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (P1.f14304a[i7 - 1]) {
            case 1:
                return new T1();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.h(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (T1.class) {
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
