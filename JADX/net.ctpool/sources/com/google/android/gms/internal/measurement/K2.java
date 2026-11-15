package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final K2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private J4 zzg = AbstractC1260z4.A();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    public enum a implements E4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14240m;

        a(int i7) {
            this.f14240m = i7;
        }

        public static a e(int i7) {
            if (i7 == 0) {
                return UNKNOWN;
            }
            if (i7 == 1) {
                return STRING;
            }
            if (i7 == 2) {
                return NUMBER;
            }
            if (i7 == 3) {
                return BOOLEAN;
            }
            if (i7 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static D4 h() {
            return O2.f14301a;
        }

        @Override // com.google.android.gms.internal.measurement.E4
        public final int a() {
            return this.f14240m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14240m + " name=" + name() + '>';
        }
    }

    public static final class b extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private b() {
            super(K2.zzc);
        }
    }

    static {
        K2 k22 = new K2();
        zzc = k22;
        AbstractC1260z4.s(K2.class, k22);
    }

    private K2() {
    }

    public final double E() {
        return this.zzk;
    }

    public final a F() {
        a aVarE = a.e(this.zzf);
        return aVarE == null ? a.UNKNOWN : aVarE;
    }

    public final String H() {
        return this.zzh;
    }

    public final String I() {
        return this.zzi;
    }

    public final List J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzj;
    }

    public final boolean L() {
        return (this.zze & 8) != 0;
    }

    public final boolean M() {
        return (this.zze & 16) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (M2.f14269a[i7 - 1]) {
            case 1:
                return new K2();
            case 2:
                return new b();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", a.h(), "zzg", K2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (K2.class) {
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
