package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1242x2;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1234w2 extends AbstractC1260z4 implements InterfaceC1113i5 {
    private static final C1234w2 zzc;
    private static volatile InterfaceC1158n5 zzd;
    private int zze;
    private J4 zzf = AbstractC1260z4.A();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2$a */
    public static final class a extends AbstractC1260z4.b implements InterfaceC1113i5 {
        private a() {
            super(C1234w2.zzc);
        }

        public final a A(String str) {
            q();
            C1234w2.L((C1234w2) this.f15001n, str);
            return this;
        }

        public final String B() {
            return ((C1234w2) this.f15001n).N();
        }

        public final List C() {
            return Collections.unmodifiableList(((C1234w2) this.f15001n).P());
        }

        public final int t() {
            return ((C1234w2) this.f15001n).j();
        }

        public final a u(C1242x2.a aVar) {
            q();
            C1234w2.G((C1234w2) this.f15001n, (C1242x2) ((AbstractC1260z4) aVar.p()));
            return this;
        }

        public final a v(Iterable iterable) {
            q();
            C1234w2.H((C1234w2) this.f15001n, iterable);
            return this;
        }

        public final a x(String str) {
            q();
            C1234w2.I((C1234w2) this.f15001n, str);
            return this;
        }

        public final C1242x2 y(int i7) {
            return ((C1234w2) this.f15001n).F(0);
        }

        public final a z() {
            q();
            C1234w2.K((C1234w2) this.f15001n);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2$b */
    public enum b implements E4 {
        SDK(0),
        SGTM(1);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14948m;

        b(int i7) {
            this.f14948m = i7;
        }

        public static b e(int i7) {
            if (i7 == 0) {
                return SDK;
            }
            if (i7 != 1) {
                return null;
            }
            return SGTM;
        }

        public static D4 h() {
            return F2.f14193a;
        }

        @Override // com.google.android.gms.internal.measurement.E4
        public final int a() {
            return this.f14948m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14948m + " name=" + name() + '>';
        }
    }

    static {
        C1234w2 c1234w2 = new C1234w2();
        zzc = c1234w2;
        AbstractC1260z4.s(C1234w2.class, c1234w2);
    }

    private C1234w2() {
    }

    public static a E(C1234w2 c1234w2) {
        return (a) zzc.k(c1234w2);
    }

    static /* synthetic */ void G(C1234w2 c1234w2, C1242x2 c1242x2) {
        c1242x2.getClass();
        c1234w2.S();
        c1234w2.zzf.add(c1242x2);
    }

    static /* synthetic */ void H(C1234w2 c1234w2, Iterable iterable) {
        c1234w2.S();
        J3.f(iterable, c1234w2.zzf);
    }

    static /* synthetic */ void I(C1234w2 c1234w2, String str) {
        str.getClass();
        c1234w2.zze |= 1;
        c1234w2.zzg = str;
    }

    public static a J() {
        return (a) zzc.v();
    }

    static /* synthetic */ void K(C1234w2 c1234w2) {
        c1234w2.zzf = AbstractC1260z4.A();
    }

    static /* synthetic */ void L(C1234w2 c1234w2, String str) {
        str.getClass();
        c1234w2.zze |= 2;
        c1234w2.zzh = str;
    }

    private final void S() {
        J4 j42 = this.zzf;
        if (j42.zzc()) {
            return;
        }
        this.zzf = AbstractC1260z4.o(j42);
    }

    public final C1242x2 F(int i7) {
        return (C1242x2) this.zzf.get(0);
    }

    public final String N() {
        return this.zzg;
    }

    public final String O() {
        return this.zzh;
    }

    public final List P() {
        return this.zzf;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final int j() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1260z4
    protected final Object p(int i7, Object obj, Object obj2) {
        switch (AbstractC1146m2.f14735a[i7 - 1]) {
            case 1:
                return new C1234w2();
            case 2:
                return new a();
            case 3:
                return AbstractC1260z4.q(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C1242x2.class, "zzg", "zzh", "zzi", b.h()});
            case 4:
                return zzc;
            case 5:
                InterfaceC1158n5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C1234w2.class) {
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
