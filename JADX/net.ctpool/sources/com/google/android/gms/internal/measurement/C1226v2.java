package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1226v2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1226v2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C1164o2 zzh;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1226v2.zzc);
        }
    }

    static {
        C1226v2 c1226v2 = new C1226v2();
        zzc = c1226v2;
        AbstractC1260z4.s(C1226v2.class, c1226v2);
    }

    private C1226v2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1226v2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1226v2.class) {
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
