package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final I2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private String zzf = "";
    private J4 zzg = AbstractC1260z4.A();

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(I2.zzc);
        }
    }

    static {
        I2 i22 = new I2();
        zzc = i22;
        AbstractC1260z4.s(I2.class, i22);
    }

    private I2() {
    }

    public final String F() {
        return this.zzf;
    }

    public final List G() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (M2.f14269a[i7 - 1]) {
            case 1:
                return new I2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", K2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (I2.class) {
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
