package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1260z4 extends J3 {
    private static Map<Class<?>, AbstractC1260z4> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected K5 zzb = K5.k();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4$a */
    protected static class a extends M3 {
        public a(AbstractC1260z4 abstractC1260z4) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4$b */
    public static abstract class b extends K3 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final AbstractC1260z4 f15000m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected AbstractC1260z4 f15001n;

        protected b(AbstractC1260z4 abstractC1260z4) {
            this.f15000m = abstractC1260z4;
            if (abstractC1260z4.D()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f15001n = abstractC1260z4.x();
        }

        private static void k(Object obj, Object obj2) {
            C1202s5.a().c(obj).h(obj, obj2);
        }

        private final b s(byte[] bArr, int i7, int i8, C1148m4 c1148m4) throws I4 {
            if (!this.f15001n.D()) {
                r();
            }
            try {
                C1202s5.a().c(this.f15001n).f(this.f15001n, bArr, 0, i8, new Q3(c1148m4));
                return this;
            } catch (I4 e7) {
                throw e7;
            } catch (IOException e8) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
            } catch (IndexOutOfBoundsException unused) {
                throw I4.g();
            }
        }

        @Override // com.google.android.gms.internal.measurement.K3
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f15000m.p(c.f15006e, null, null);
            bVar.f15001n = (AbstractC1260z4) n();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.K3
        public final /* synthetic */ K3 e(byte[] bArr, int i7, int i8) {
            return s(bArr, 0, i8, C1148m4.f14739c);
        }

        @Override // com.google.android.gms.internal.measurement.K3
        public final /* synthetic */ K3 g(byte[] bArr, int i7, int i8, C1148m4 c1148m4) {
            return s(bArr, 0, i8, c1148m4);
        }

        public final b j(AbstractC1260z4 abstractC1260z4) {
            if (this.f15000m.equals(abstractC1260z4)) {
                return this;
            }
            if (!this.f15001n.D()) {
                r();
            }
            k(this.f15001n, abstractC1260z4);
            return this;
        }

        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public final AbstractC1260z4 p() {
            AbstractC1260z4 abstractC1260z4 = (AbstractC1260z4) n();
            if (AbstractC1260z4.t(abstractC1260z4, true)) {
                return abstractC1260z4;
            }
            throw new I5(abstractC1260z4);
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1086f5
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public AbstractC1260z4 n() {
            if (!this.f15001n.D()) {
                return this.f15001n;
            }
            this.f15001n.B();
            return this.f15001n;
        }

        protected final void q() {
            if (this.f15001n.D()) {
                return;
            }
            r();
        }

        protected void r() {
            AbstractC1260z4 abstractC1260z4X = this.f15000m.x();
            k(abstractC1260z4X, this.f15001n);
            this.f15001n = abstractC1260z4X;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4$c */
    public enum c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f15002a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15003b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15004c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f15005d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f15006e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f15007f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f15008g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f15009h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f15009h.clone();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4$d */
    public static class d extends AbstractC1157n4 {
    }

    protected static J4 A() {
        return C1193r5.i();
    }

    private final int j() {
        return C1202s5.a().c(this).e(this);
    }

    static AbstractC1260z4 l(Class cls) {
        AbstractC1260z4 abstractC1260z4 = zzc.get(cls);
        if (abstractC1260z4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1260z4 = zzc.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC1260z4 == null) {
            abstractC1260z4 = (AbstractC1260z4) ((AbstractC1260z4) M5.b(cls)).p(c.f15007f, null, null);
            if (abstractC1260z4 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, abstractC1260z4);
        }
        return abstractC1260z4;
    }

    protected static F4 m(F4 f42) {
        return f42.d(f42.size() << 1);
    }

    protected static J4 o(J4 j42) {
        return j42.d(j42.size() << 1);
    }

    protected static Object q(InterfaceC1095g5 interfaceC1095g5, String str, Object[] objArr) {
        return new C1211t5(interfaceC1095g5, str, objArr);
    }

    static Object r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void s(Class cls, AbstractC1260z4 abstractC1260z4) {
        abstractC1260z4.C();
        zzc.put(cls, abstractC1260z4);
    }

    protected static final boolean t(AbstractC1260z4 abstractC1260z4, boolean z6) {
        byte bByteValue = ((Byte) abstractC1260z4.p(c.f15002a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = C1202s5.a().c(abstractC1260z4).d(abstractC1260z4);
        if (z6) {
            abstractC1260z4.p(c.f15003b, zD ? abstractC1260z4 : null, null);
        }
        return zD;
    }

    private final int u(InterfaceC1229v5 interfaceC1229v5) {
        return interfaceC1229v5 == null ? C1202s5.a().c(this).c(this) : interfaceC1229v5.c(this);
    }

    protected static H4 y() {
        return C4.h();
    }

    protected static F4 z() {
        return Q4.h();
    }

    protected final void B() {
        C1202s5.a().c(this).g(this);
        C();
    }

    final void C() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final boolean D() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1095g5
    public final void a(AbstractC1112i4 abstractC1112i4) {
        C1202s5.a().c(this).b(this, C1139l4.P(abstractC1112i4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1113i5
    public final /* synthetic */ InterfaceC1095g5 b() {
        return (AbstractC1260z4) p(c.f15007f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1095g5
    public final /* synthetic */ InterfaceC1086f5 c() {
        return (b) p(c.f15006e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1095g5
    public final int d() {
        return e(null);
    }

    @Override // com.google.android.gms.internal.measurement.J3
    final int e(InterfaceC1229v5 interfaceC1229v5) {
        if (!D()) {
            if (g() != Integer.MAX_VALUE) {
                return g();
            }
            int iU = u(interfaceC1229v5);
            h(iU);
            return iU;
        }
        int iU2 = u(interfaceC1229v5);
        if (iU2 >= 0) {
            return iU2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iU2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1202s5.a().c(this).i(this, (AbstractC1260z4) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.J3
    final int g() {
        return this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.measurement.J3
    final void h(int i7) {
        if (i7 >= 0) {
            this.zzd = (i7 & Api.BaseClientBuilder.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    public int hashCode() {
        if (D()) {
            return j();
        }
        if (this.zza == 0) {
            this.zza = j();
        }
        return this.zza;
    }

    protected final b k(AbstractC1260z4 abstractC1260z4) {
        return v().j(abstractC1260z4);
    }

    protected abstract Object p(int i7, Object obj, Object obj2);

    public String toString() {
        return AbstractC1104h5.a(this, super.toString());
    }

    protected final b v() {
        return (b) p(c.f15006e, null, null);
    }

    public final b w() {
        return ((b) p(c.f15006e, null, null)).j(this);
    }

    final AbstractC1260z4 x() {
        return (AbstractC1260z4) p(c.f15005d, null, null);
    }
}
