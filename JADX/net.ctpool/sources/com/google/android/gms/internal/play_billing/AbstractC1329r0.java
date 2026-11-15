package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1329r0 extends AbstractC1352z {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C1351y1 zzc = C1351y1.c();

    static AbstractC1329r0 j(Class cls) {
        Map map = zzb;
        AbstractC1329r0 abstractC1329r0 = (AbstractC1329r0) map.get(cls);
        if (abstractC1329r0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1329r0 = (AbstractC1329r0) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC1329r0 == null) {
            abstractC1329r0 = (AbstractC1329r0) ((AbstractC1329r0) H1.j(cls)).x(6, null, null);
            if (abstractC1329r0 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC1329r0);
        }
        return abstractC1329r0;
    }

    protected static AbstractC1329r0 m(AbstractC1329r0 abstractC1329r0, byte[] bArr, C1284f0 c1284f0) throws B0 {
        AbstractC1329r0 abstractC1329r0Z = z(abstractC1329r0, bArr, 0, bArr.length, c1284f0);
        if (abstractC1329r0Z == null || abstractC1329r0Z.k()) {
            return abstractC1329r0Z;
        }
        B0 b0A = new C1345w1(abstractC1329r0Z).a();
        b0A.f(abstractC1329r0Z);
        throw b0A;
    }

    protected static InterfaceC1344w0 n() {
        return C1332s0.h();
    }

    protected static InterfaceC1350y0 o() {
        return C1285f1.f();
    }

    static Object p(Method method, Object obj, Object... objArr) {
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

    protected static Object q(W0 w02, String str, Object[] objArr) {
        return new C1289g1(w02, str, objArr);
    }

    protected static void t(Class cls, AbstractC1329r0 abstractC1329r0) {
        abstractC1329r0.s();
        zzb.put(cls, abstractC1329r0);
    }

    protected static final boolean v(AbstractC1329r0 abstractC1329r0, boolean z6) {
        byte bByteValue = ((Byte) abstractC1329r0.x(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = C1281e1.a().b(abstractC1329r0.getClass()).g(abstractC1329r0);
        if (z6) {
            abstractC1329r0.x(2, true != zG ? null : abstractC1329r0, null);
        }
        return zG;
    }

    private final int y(InterfaceC1293h1 interfaceC1293h1) {
        return C1281e1.a().b(getClass()).c(this);
    }

    private static AbstractC1329r0 z(AbstractC1329r0 abstractC1329r0, byte[] bArr, int i7, int i8, C1284f0 c1284f0) throws B0 {
        if (i8 == 0) {
            return abstractC1329r0;
        }
        AbstractC1329r0 abstractC1329r0L = abstractC1329r0.l();
        try {
            InterfaceC1293h1 interfaceC1293h1B = C1281e1.a().b(abstractC1329r0L.getClass());
            interfaceC1293h1B.d(abstractC1329r0L, bArr, 0, i8, new D(c1284f0));
            interfaceC1293h1B.f(abstractC1329r0L);
            return abstractC1329r0L;
        } catch (B0 e7) {
            e7.f(abstractC1329r0L);
            throw e7;
        } catch (C1345w1 e8) {
            B0 b0A = e8.a();
            b0A.f(abstractC1329r0L);
            throw b0A;
        } catch (IOException e9) {
            if (e9.getCause() instanceof B0) {
                throw ((B0) e9.getCause());
            }
            B0 b02 = new B0(e9);
            b02.f(abstractC1329r0L);
            throw b02;
        } catch (IndexOutOfBoundsException unused) {
            B0 b0G = B0.g();
            b0G.f(abstractC1329r0L);
            throw b0G;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.W0
    public final /* synthetic */ V0 a() {
        return (AbstractC1324p0) x(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.W0
    public final void b(AbstractC1264a0 abstractC1264a0) {
        C1281e1.a().b(getClass()).a(this, C1268b0.L(abstractC1264a0));
    }

    @Override // com.google.android.gms.internal.play_billing.W0
    public final int c() {
        int iY;
        if (w()) {
            iY = y(null);
            if (iY < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iY);
            }
        } else {
            iY = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (iY == Integer.MAX_VALUE) {
                iY = y(null);
                if (iY < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iY);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iY;
            }
        }
        return iY;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1352z
    final int d(InterfaceC1293h1 interfaceC1293h1) {
        if (w()) {
            int iC = interfaceC1293h1.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iC);
        }
        int i7 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iC2 = interfaceC1293h1.c(this);
        if (iC2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iC2);
    }

    @Override // com.google.android.gms.internal.play_billing.X0
    public final /* synthetic */ W0 e() {
        return (AbstractC1329r0) x(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1281e1.a().b(getClass()).i(this, (AbstractC1329r0) obj);
    }

    final int g() {
        return C1281e1.a().b(getClass()).e(this);
    }

    protected final AbstractC1324p0 h() {
        return (AbstractC1324p0) x(5, null, null);
    }

    public final int hashCode() {
        if (w()) {
            return g();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int iG = g();
        this.zza = iG;
        return iG;
    }

    public final AbstractC1324p0 i() {
        AbstractC1324p0 abstractC1324p0 = (AbstractC1324p0) x(5, null, null);
        abstractC1324p0.g(this);
        return abstractC1324p0;
    }

    public final boolean k() {
        return v(this, true);
    }

    final AbstractC1329r0 l() {
        return (AbstractC1329r0) x(4, null, null);
    }

    protected final void r() {
        C1281e1.a().b(getClass()).f(this);
        s();
    }

    final void s() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final String toString() {
        return Y0.a(this, super.toString());
    }

    final void u(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final boolean w() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object x(int i7, Object obj, Object obj2);
}
