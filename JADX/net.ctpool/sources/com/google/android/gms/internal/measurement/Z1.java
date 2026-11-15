package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final Z1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private String zzf = "";
    private J4 zzg = AbstractC1260z4.A();
    private boolean zzh;

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(Z1.zzc);
        }
    }

    static {
        Z1 z12 = new Z1();
        zzc = z12;
        AbstractC1260z4.s(Z1.class, z12);
    }

    private Z1() {
    }

    public final String F() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1110i2.f14617a[i7 - 1]) {
            case 1:
                return new Z1();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C1074e2.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (Z1.class) {
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
