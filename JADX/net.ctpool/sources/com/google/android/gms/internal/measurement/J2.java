package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final J2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private J4 zzf = AbstractC1260z4.A();
    private H2 zzg;

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(J2.zzc);
        }
    }

    static {
        J2 j22 = new J2();
        zzc = j22;
        AbstractC1260z4.s(J2.class, j22);
    }

    private J2() {
    }

    public final H2 E() {
        H2 h22 = this.zzg;
        return h22 == null ? H2.F() : h22;
    }

    public final List G() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (M2.f14269a[i7 - 1]) {
            case 1:
                return new J2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", K2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (J2.class) {
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
