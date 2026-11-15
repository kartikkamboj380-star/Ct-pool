package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 extends AbstractC0952b0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C1003s1 zzc = C1003s1.a();

    static C0 c(Class cls) {
        Map map = zzb;
        C0 c02 = (C0) map.get(cls);
        if (c02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c02 = (C0) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (c02 == null) {
            c02 = (C0) ((C0) B1.e(cls)).n(6, null, null);
            if (c02 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, c02);
        }
        return c02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static C0 e(C0 c02, byte[] bArr) throws H0 {
        byte bByteValue;
        C0 c0O = o(c02, bArr, 0, bArr.length, C1011v0.f14041b);
        if (c0O != null && (bByteValue = ((Byte) c0O.n(1, null, null)).byteValue()) != 1) {
            if (bByteValue != 0) {
                boolean zG = C0974i1.a().b(c0O.getClass()).g(c0O);
                c0O.n(2, true != zG ? null : c0O, null);
            }
            H0 h0A = new C0995p1(c0O).a();
            h0A.e(c0O);
            throw h0A;
        }
        return c0O;
    }

    protected static E0 f() {
        return C0977j1.f();
    }

    static Object g(Method method, Object obj, Object... objArr) {
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

    protected static Object h(Z0 z02, String str, Object[] objArr) {
        return new C0980k1(z02, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void k(Class cls, C0 c02) {
        c02.j();
        zzb.put(cls, c02);
    }

    private static C0 o(C0 c02, byte[] bArr, int i7, int i8, C1011v0 c1011v0) throws H0 {
        C0 c0D = c02.d();
        try {
            InterfaceC0983l1 interfaceC0983l1B = C0974i1.a().b(c0D.getClass());
            interfaceC0983l1B.e(c0D, bArr, 0, i8, new C0961e0(c1011v0));
            interfaceC0983l1B.d(c0D);
            return c0D;
        } catch (H0 e7) {
            e7.e(c0D);
            throw e7;
        } catch (C0995p1 e8) {
            H0 h0A = e8.a();
            h0A.e(c0D);
            throw h0A;
        } catch (IOException e9) {
            if (e9.getCause() instanceof H0) {
                throw ((H0) e9.getCause());
            }
            H0 h02 = new H0(e9);
            h02.e(c0D);
            throw h02;
        } catch (IndexOutOfBoundsException unused) {
            H0 h0F = H0.f();
            h0F.e(c0D);
            throw h0F;
        }
    }

    final int a() {
        return C0974i1.a().b(getClass()).c(this);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0950a1
    public final /* synthetic */ Z0 b() {
        return (C0) n(6, null, null);
    }

    final C0 d() {
        return (C0) n(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C0974i1.a().b(getClass()).h(this, (C0) obj);
    }

    public final int hashCode() {
        if (m()) {
            return a();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int iA = a();
        this.zza = iA;
        return iA;
    }

    protected final void i() {
        C0974i1.a().b(getClass()).d(this);
        j();
    }

    final void j() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final void l(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final boolean m() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object n(int i7, Object obj, Object obj2);

    public final String toString() {
        return AbstractC0953b1.a(this, super.toString());
    }
}
