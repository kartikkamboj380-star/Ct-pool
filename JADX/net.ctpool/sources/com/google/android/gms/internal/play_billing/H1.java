package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f15052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f15053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f15054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final G1 f15055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f15056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f15057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f15058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f15059h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        boolean z6;
        boolean z7;
        G1 g12;
        Unsafe unsafeL = l();
        f15052a = unsafeL;
        int i7 = C.f15022a;
        f15053b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f15054c = zA;
        boolean zA2 = A(Integer.TYPE);
        G1 e12 = null;
        if (unsafeL != null) {
            if (zA) {
                e12 = new F1(unsafeL);
            } else if (zA2) {
                e12 = new E1(unsafeL);
            }
        }
        f15055d = e12;
        if (e12 == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls2 = e12.f15047a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (b() != null) {
                    z6 = true;
                }
            } catch (Throwable th) {
                m(th);
            }
        }
        f15056e = z6;
        G1 g13 = f15055d;
        if (g13 == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls3 = g13.f15047a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z7 = true;
            } catch (Throwable th2) {
                m(th2);
                z7 = false;
            }
        }
        f15057f = z7;
        f15058g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (g12 = f15055d) != null) {
            g12.f15047a.objectFieldOffset(fieldB);
        }
        f15059h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static boolean A(Class cls) {
        int i7 = C.f15022a;
        try {
            Class cls2 = f15053b;
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

    static boolean B(Object obj, long j7) {
        return f15055d.g(obj, j7);
    }

    static boolean C() {
        return f15057f;
    }

    static boolean D() {
        return f15056e;
    }

    private static int E(Class cls) {
        if (f15057f) {
            return f15055d.f15047a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f15057f) {
            return f15055d.f15047a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i7 = C.f15022a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j7, byte b7) {
        G1 g12 = f15055d;
        long j8 = (-4) & j7;
        int i7 = g12.f15047a.getInt(obj, j8);
        int i8 = ((~((int) j7)) & 3) << 3;
        g12.f15047a.putInt(obj, j8, ((255 & b7) << i8) | (i7 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j7, byte b7) {
        G1 g12 = f15055d;
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        g12.f15047a.putInt(obj, j8, ((255 & b7) << i7) | (g12.f15047a.getInt(obj, j8) & (~(255 << i7))));
    }

    static double f(Object obj, long j7) {
        return f15055d.a(obj, j7);
    }

    static float g(Object obj, long j7) {
        return f15055d.b(obj, j7);
    }

    static int h(Object obj, long j7) {
        return f15055d.f15047a.getInt(obj, j7);
    }

    static long i(Object obj, long j7) {
        return f15055d.f15047a.getLong(obj, j7);
    }

    static Object j(Class cls) {
        try {
            return f15052a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static Object k(Object obj, long j7) {
        return f15055d.f15047a.getObject(obj, j7);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new D1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(H1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j7, boolean z6) {
        f15055d.c(obj, j7, z6);
    }

    static void s(byte[] bArr, long j7, byte b7) {
        f15055d.d(bArr, f15058g + j7, b7);
    }

    static void t(Object obj, long j7, double d7) {
        f15055d.e(obj, j7, d7);
    }

    static void u(Object obj, long j7, float f7) {
        f15055d.f(obj, j7, f7);
    }

    static void v(Object obj, long j7, int i7) {
        f15055d.f15047a.putInt(obj, j7, i7);
    }

    static void w(Object obj, long j7, long j8) {
        f15055d.f15047a.putLong(obj, j7, j8);
    }

    static void x(Object obj, long j7, Object obj2) {
        f15055d.f15047a.putObject(obj, j7, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j7) {
        return ((byte) ((f15055d.f15047a.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j7) {
        return ((byte) ((f15055d.f15047a.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }
}
