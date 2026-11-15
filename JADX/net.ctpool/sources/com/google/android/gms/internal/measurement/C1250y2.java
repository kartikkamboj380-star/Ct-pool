package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1208t2;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1250y2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1250y2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private int zzf = 1;
    private J4 zzg = AbstractC1260z4.A();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1250y2.zzc);
        }

        public final a t(C1208t2.a aVar) {
            q();
            C1250y2.F((C1250y2) this.f15001n, (C1208t2) ((AbstractC1260z4) aVar.p()));
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y2$b */
    public enum b implements E4 {
        RADS(1),
        PROVISIONING(2);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14978m;

        b(int i7) {
            this.f14978m = i7;
        }

        public static b e(int i7) {
            if (i7 == 1) {
                return RADS;
            }
            if (i7 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static D4 h() {
            return G2.f14200a;
        }

        @Override // com.google.android.gms.internal.measurement.E4
        public final int a() {
            return this.f14978m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14978m + " name=" + name() + '>';
        }
    }

    static {
        C1250y2 c1250y2 = new C1250y2();
        zzc = c1250y2;
        AbstractC1260z4.s(C1250y2.class, c1250y2);
    }

    private C1250y2() {
    }

    public static a E() {
        return (a) zzc.v();
    }

    static /* synthetic */ void F(C1250y2 c1250y2, C1208t2 c1208t2) {
        c1208t2.getClass();
        J4 j42 = c1250y2.zzg;
        if (!j42.zzc()) {
            c1250y2.zzg = AbstractC1260z4.o(j42);
        }
        c1250y2.zzg.add(c1208t2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1250y2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", b.h(), "zzg", C1208t2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1250y2.class) {
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
