package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1065d2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1065d2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1065d2.zzc);
        }
    }

    static {
        C1065d2 c1065d2 = new C1065d2();
        zzc = c1065d2;
        AbstractC1260z4.s(C1065d2.class, c1065d2);
    }

    private C1065d2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1110i2.f14617a[i7 - 1]) {
            case 1:
                return new C1065d2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1065d2.class) {
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
