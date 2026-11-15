package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class M5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f14271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f14272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f14273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f14274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f14275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f14276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f14277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f14278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f14279i;

    private static final class a extends b {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final double a(Object obj, long j7) {
            return Double.longBitsToDouble(m(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void b(Object obj, long j7, byte b7) {
            if (M5.f14279i) {
                M5.u(obj, j7, b7);
            } else {
                M5.y(obj, j7, b7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void c(Object obj, long j7, double d7) {
            f(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void d(Object obj, long j7, float f7) {
            e(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void g(Object obj, long j7, boolean z6) {
            if (M5.f14279i) {
                M5.k(obj, j7, z6);
            } else {
                M5.r(obj, j7, z6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final float i(Object obj, long j7) {
            return Float.intBitsToFloat(l(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final boolean k(Object obj, long j7) {
            return M5.f14279i ? M5.D(obj, j7) : M5.E(obj, j7);
        }
    }

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f14280a;

        b(Unsafe unsafe) {
            this.f14280a = unsafe;
        }

        public abstract double a(Object obj, long j7);

        public abstract void b(Object obj, long j7, byte b7);

        public abstract void c(Object obj, long j7, double d7);

        public abstract void d(Object obj, long j7, float f7);

        public final void e(Object obj, long j7, int i7) {
            this.f14280a.putInt(obj, j7, i7);
        }

        public final void f(Object obj, long j7, long j8) {
            this.f14280a.putLong(obj, j7, j8);
        }

        public abstract void g(Object obj, long j7, boolean z6);

        public final boolean h() {
            Unsafe unsafe = this.f14280a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                M5.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j7);

        public final boolean j() {
            Unsafe unsafe = this.f14280a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return M5.C() != null;
            } catch (Throwable th) {
                M5.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j7);

        public final int l(Object obj, long j7) {
            return this.f14280a.getInt(obj, j7);
        }

        public final long m(Object obj, long j7) {
            return this.f14280a.getLong(obj, j7);
        }
    }

    private static final class c extends b {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final double a(Object obj, long j7) {
            return Double.longBitsToDouble(m(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void b(Object obj, long j7, byte b7) {
            if (M5.f14279i) {
                M5.u(obj, j7, b7);
            } else {
                M5.y(obj, j7, b7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void c(Object obj, long j7, double d7) {
            f(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void d(Object obj, long j7, float f7) {
            e(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final void g(Object obj, long j7, boolean z6) {
            if (M5.f14279i) {
                M5.k(obj, j7, z6);
            } else {
                M5.r(obj, j7, z6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final float i(Object obj, long j7) {
            return Float.intBitsToFloat(l(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.M5.b
        public final boolean k(Object obj, long j7) {
            return M5.f14279i ? M5.D(obj, j7) : M5.E(obj, j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        b aVar;
        Unsafe unsafeP = p();
        f14271a = unsafeP;
        f14272b = O3.a();
        boolean zA = A(Long.TYPE);
        f14273c = zA;
        boolean zA2 = A(Integer.TYPE);
        f14274d = zA2;
        if (unsafeP == null) {
            aVar = null;
        } else if (zA) {
            aVar = new c(unsafeP);
        } else if (zA2) {
            aVar = new a(unsafeP);
        }
        f14275e = aVar;
        f14276f = aVar == null ? false : aVar.j();
        f14277g = aVar == null ? false : aVar.h();
        f14278h = o(byte[].class);
        o(boolean[].class);
        s(boolean[].class);
        o(int[].class);
        s(int[].class);
        o(long[].class);
        s(long[].class);
        o(float[].class);
        s(float[].class);
        o(double[].class);
        s(double[].class);
        o(Object[].class);
        s(Object[].class);
        Field fieldC = C();
        if (fieldC != null && aVar != null) {
            aVar.f14280a.objectFieldOffset(fieldC);
        }
        f14279i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private static boolean A(Class cls) {
        try {
            Class cls2 = f14272b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Object B(Object obj, long j7) {
        return f14275e.f14280a.getObject(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field C() {
        Field fieldD = d(Buffer.class, "effectiveDirectAddress");
        if (fieldD != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    static /* synthetic */ boolean D(Object obj, long j7) {
        return ((byte) (t(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j7) {
        return ((byte) (t(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3)))) != 0;
    }

    static boolean F(Object obj, long j7) {
        return f14275e.k(obj, j7);
    }

    static double a(Object obj, long j7) {
        return f14275e.a(obj, j7);
    }

    static Object b(Class cls) {
        try {
            return f14271a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    private static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j7, double d7) {
        f14275e.c(obj, j7, d7);
    }

    static void g(Object obj, long j7, float f7) {
        f14275e.d(obj, j7, f7);
    }

    static void h(Object obj, long j7, int i7) {
        f14275e.e(obj, j7, i7);
    }

    static void i(Object obj, long j7, long j8) {
        f14275e.f(obj, j7, j8);
    }

    static void j(Object obj, long j7, Object obj2) {
        f14275e.f14280a.putObject(obj, j7, obj2);
    }

    static /* synthetic */ void k(Object obj, long j7, boolean z6) {
        u(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(Throwable th) {
        Logger.getLogger(M5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static void m(byte[] bArr, long j7, byte b7) {
        f14275e.b(bArr, f14278h + j7, b7);
    }

    static float n(Object obj, long j7) {
        return f14275e.i(obj, j7);
    }

    private static int o(Class cls) {
        if (f14277g) {
            return f14275e.f14280a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new O5());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(Object obj, long j7, boolean z6) {
        y(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    private static int s(Class cls) {
        if (f14277g) {
            return f14275e.f14280a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(Object obj, long j7) {
        return f14275e.l(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int iT = t(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        h(obj, j8, ((255 & b7) << i7) | (iT & (~(255 << i7))));
    }

    static void v(Object obj, long j7, boolean z6) {
        f14275e.g(obj, j7, z6);
    }

    static boolean w() {
        return f14277g;
    }

    static long x(Object obj, long j7) {
        return f14275e.m(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        h(obj, j8, ((255 & b7) << i7) | (t(obj, j8) & (~(255 << i7))));
    }

    static boolean z() {
        return f14276f;
    }
}
