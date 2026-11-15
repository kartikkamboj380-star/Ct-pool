package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1038a2;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1047b2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1047b2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private Y1 zzr;
    private C1065d2 zzs;
    private C1092g2 zzt;
    private C1074e2 zzu;
    private C1056c2 zzv;
    private String zzg = "";
    private J4 zzi = AbstractC1260z4.A();
    private J4 zzj = AbstractC1260z4.A();
    private J4 zzk = AbstractC1260z4.A();
    private String zzl = "";
    private J4 zzn = AbstractC1260z4.A();
    private J4 zzo = AbstractC1260z4.A();
    private String zzp = "";
    private String zzq = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1047b2.zzc);
        }

        public final List A() {
            return Collections.unmodifiableList(((C1047b2) this.f15001n).R());
        }

        public final int t() {
            return ((C1047b2) this.f15001n).H();
        }

        public final C1038a2 u(int i7) {
            return ((C1047b2) this.f15001n).E(i7);
        }

        public final a v(int i7, C1038a2.a aVar) {
            q();
            C1047b2.G((C1047b2) this.f15001n, i7, (C1038a2) ((AbstractC1260z4) aVar.p()));
            return this;
        }

        public final a x() {
            q();
            C1047b2.F((C1047b2) this.f15001n);
            return this;
        }

        public final String y() {
            return ((C1047b2) this.f15001n).P();
        }

        public final List z() {
            return Collections.unmodifiableList(((C1047b2) this.f15001n).Q());
        }
    }

    static {
        C1047b2 c1047b2 = new C1047b2();
        zzc = c1047b2;
        AbstractC1260z4.s(C1047b2.class, c1047b2);
    }

    private C1047b2() {
    }

    static /* synthetic */ void F(C1047b2 c1047b2) {
        c1047b2.zzk = AbstractC1260z4.A();
    }

    static /* synthetic */ void G(C1047b2 c1047b2, int i7, C1038a2 c1038a2) {
        c1038a2.getClass();
        J4 j42 = c1047b2.zzj;
        if (!j42.zzc()) {
            c1047b2.zzj = AbstractC1260z4.o(j42);
        }
        c1047b2.zzj.set(i7, c1038a2);
    }

    public static a K() {
        return (a) zzc.v();
    }

    public static C1047b2 M() {
        return zzc;
    }

    public final C1038a2 E(int i7) {
        return (C1038a2) this.zzj.get(i7);
    }

    public final int H() {
        return this.zzj.size();
    }

    public final long I() {
        return this.zzf;
    }

    public final Y1 J() {
        Y1 y12 = this.zzr;
        return y12 == null ? Y1.F() : y12;
    }

    public final C1092g2 N() {
        C1092g2 c1092g2 = this.zzt;
        return c1092g2 == null ? C1092g2.F() : c1092g2;
    }

    public final String O() {
        return this.zzg;
    }

    public final String P() {
        return this.zzp;
    }

    public final List Q() {
        return this.zzk;
    }

    public final List R() {
        return this.zzo;
    }

    public final List S() {
        return this.zzn;
    }

    public final List T() {
        return this.zzi;
    }

    public final boolean U() {
        return (this.zze & 128) != 0;
    }

    public final boolean V() {
        return (this.zze & 2) != 0;
    }

    public final boolean W() {
        return (this.zze & 512) != 0;
    }

    public final boolean X() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1110i2.f14617a[i7 - 1]) {
            case 1:
                return new C1047b2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C1083f2.class, "zzj", C1038a2.class, "zzk", Q1.class, "zzl", "zzm", "zzn", J2.class, "zzo", Z1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1047b2.class) {
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
