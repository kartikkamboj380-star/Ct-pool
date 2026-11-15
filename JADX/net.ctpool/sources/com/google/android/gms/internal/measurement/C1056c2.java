package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1056c2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1056c2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private J4 zze = AbstractC1260z4.A();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1056c2.zzc);
        }
    }

    static {
        C1056c2 c1056c2 = new C1056c2();
        zzc = c1056c2;
        AbstractC1260z4.s(C1056c2.class, c1056c2);
    }

    private C1056c2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1110i2.f14617a[i7 - 1]) {
            case 1:
                return new C1056c2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1056c2.class) {
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
