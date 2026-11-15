package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final Y1 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private boolean zzi;
    private J4 zzf = AbstractC1260z4.A();
    private J4 zzg = AbstractC1260z4.A();
    private J4 zzh = AbstractC1260z4.A();
    private J4 zzj = AbstractC1260z4.A();

    public static final class a extends AbstractC1260z4 implements InterfaceC1113i5 {
        private static final a zzc;
        private static volatile InterfaceC1158n5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.Y1$a$a, reason: collision with other inner class name */
        public static final class C0225a extends AbstractC1260z4.b implements InterfaceC1113i5 {
            private C0225a() {
                super(a.zzc);
            }
        }

        static {
            a aVar = new a();
            zzc = aVar;
            AbstractC1260z4.s(a.class, aVar);
        }

        private a() {
        }

        public final d F() {
            d dVarE = d.e(this.zzg);
            return dVarE == null ? d.CONSENT_STATUS_UNSPECIFIED : dVarE;
        }

        public final e G() {
            e eVarE = e.e(this.zzf);
            return eVarE == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarE;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
        protected final Object p(int i7, Object obj, Object obj2) {
            switch (AbstractC1110i2.f14617a[i7 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0225a();
                case 3:
                    return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.h(), "zzg", d.h()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1158n5 aVar = zzd;
                    if (aVar == null) {
                        synchronized (a.class) {
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

    public static final class b extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private b() {
            super(Y1.zzc);
        }
    }

    public static final class c extends AbstractC1260z4 implements InterfaceC1113i5 {
        private static final c zzc;
        private static volatile InterfaceC1158n5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
            private a() {
                super(c.zzc);
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            AbstractC1260z4.s(c.class, cVar);
        }

        private c() {
        }

        public final e F() {
            e eVarE = e.e(this.zzg);
            return eVarE == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarE;
        }

        public final e G() {
            e eVarE = e.e(this.zzf);
            return eVarE == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarE;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
        protected final Object p(int i7, Object obj, Object obj2) {
            switch (AbstractC1110i2.f14617a[i7 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.h(), "zzg", e.h()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1158n5 aVar = zzd;
                    if (aVar == null) {
                        synchronized (c.class) {
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

    public enum d implements E4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14412m;

        d(int i7) {
            this.f14412m = i7;
        }

        public static d e(int i7) {
            if (i7 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i7 == 1) {
                return GRANTED;
            }
            if (i7 != 2) {
                return null;
            }
            return DENIED;
        }

        public static D4 h() {
            return C1119j2.f14635a;
        }

        @Override // com.google.android.gms.internal.measurement.E4
        public final int a() {
            return this.f14412m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14412m + " name=" + name() + '>';
        }
    }

    public enum e implements E4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14419m;

        e(int i7) {
            this.f14419m = i7;
        }

        public static e e(int i7) {
            if (i7 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i7 == 1) {
                return AD_STORAGE;
            }
            if (i7 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i7 == 3) {
                return AD_USER_DATA;
            }
            if (i7 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static D4 h() {
            return C1128k2.f14664a;
        }

        @Override // com.google.android.gms.internal.measurement.E4
        public final int a() {
            return this.f14419m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14419m + " name=" + name() + '>';
        }
    }

    public static final class f extends AbstractC1260z4 implements InterfaceC1113i5 {
        private static final f zzc;
        private static volatile InterfaceC1158n5 zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
            private a() {
                super(f.zzc);
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            AbstractC1260z4.s(f.class, fVar);
        }

        private f() {
        }

        public final String F() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
        protected final Object p(int i7, Object obj, Object obj2) {
            switch (AbstractC1110i2.f14617a[i7 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return AbstractC1260z4.q(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1158n5 aVar = zzd;
                    if (aVar == null) {
                        synchronized (f.class) {
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

    static {
        Y1 y12 = new Y1();
        zzc = y12;
        AbstractC1260z4.s(Y1.class, y12);
    }

    private Y1() {
    }

    public static Y1 F() {
        return zzc;
    }

    public final List G() {
        return this.zzh;
    }

    public final List H() {
        return this.zzf;
    }

    public final List I() {
        return this.zzg;
    }

    public final List J() {
        return this.zzj;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1110i2.f14617a[i7 - 1]) {
            case 1:
                return new Y1();
            case 2:
                return new b();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", a.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", a.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (Y1.class) {
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
