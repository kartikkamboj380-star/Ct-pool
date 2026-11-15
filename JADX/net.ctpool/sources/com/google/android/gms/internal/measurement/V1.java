package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class V1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final V1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private J4 zzi = AbstractC1260z4.A();

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(V1.zzc);
        }
    }

    public enum b implements E4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14397m;

        b(int i7) {
            this.f14397m = i7;
        }

        public static b e(int i7) {
            switch (i7) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static D4 h() {
            return X1.f14405a;
        }

        @Override // com.google.android.gms.internal.measurement.E4
        public final int a() {
            return this.f14397m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14397m + " name=" + name() + '>';
        }
    }

    static {
        V1 v12 = new V1();
        zzc = v12;
        AbstractC1260z4.s(V1.class, v12);
    }

    private V1() {
    }

    public static V1 G() {
        return zzc;
    }

    public final b E() {
        b bVarE = b.e(this.zzf);
        return bVarE == null ? b.UNKNOWN_MATCH_TYPE : bVarE;
    }

    public final String H() {
        return this.zzg;
    }

    public final List I() {
        return this.zzi;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (P1.f14304a[i7 - 1]) {
            case 1:
                return new V1();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", b.h(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (V1.class) {
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
