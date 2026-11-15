package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1083f2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1083f2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1083f2.zzc);
        }
    }

    static {
        C1083f2 c1083f2 = new C1083f2();
        zzc = c1083f2;
        AbstractC1260z4.s(C1083f2.class, c1083f2);
    }

    private C1083f2() {
    }

    public final String F() {
        return this.zzf;
    }

    public final String G() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1110i2.f14617a[i7 - 1]) {
            case 1:
                return new C1083f2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1083f2.class) {
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
