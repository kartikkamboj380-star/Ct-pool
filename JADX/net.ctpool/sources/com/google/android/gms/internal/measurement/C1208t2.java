package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1208t2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1208t2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1208t2.zzc);
        }

        public final a t(long j7) {
            q();
            C1208t2.F((C1208t2) this.f15001n, j7);
            return this;
        }

        public final a u(String str) {
            q();
            C1208t2.G((C1208t2) this.f15001n, str);
            return this;
        }
    }

    static {
        C1208t2 c1208t2 = new C1208t2();
        zzc = c1208t2;
        AbstractC1260z4.s(C1208t2.class, c1208t2);
    }

    private C1208t2() {
    }

    public static a E() {
        return (a) zzc.v();
    }

    static /* synthetic */ void F(C1208t2 c1208t2, long j7) {
        c1208t2.zze |= 2;
        c1208t2.zzg = j7;
    }

    static /* synthetic */ void G(C1208t2 c1208t2, String str) {
        str.getClass();
        c1208t2.zze |= 1;
        c1208t2.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1208t2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1208t2.class) {
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
