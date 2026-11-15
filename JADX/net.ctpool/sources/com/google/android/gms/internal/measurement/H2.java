package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final H2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private J4 zze = AbstractC1260z4.A();

    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(H2.zzc);
        }
    }

    static {
        H2 h22 = new H2();
        zzc = h22;
        AbstractC1260z4.s(H2.class, h22);
    }

    private H2() {
    }

    public static H2 F() {
        return zzc;
    }

    public final List G() {
        return this.zze;
    }

    public final int j() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (M2.f14269a[i7 - 1]) {
            case 1:
                return new H2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", I2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (H2.class) {
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
