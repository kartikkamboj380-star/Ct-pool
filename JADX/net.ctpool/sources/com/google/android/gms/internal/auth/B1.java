package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f13783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f13784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f13785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final A1 f13786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f13787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f13788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final boolean f13789g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        boolean z6;
        boolean z7;
        A1 a12;
        Unsafe unsafeG = g();
        f13783a = unsafeG;
        int i7 = AbstractC0958d0.f13883a;
        f13784b = Memory.class;
        Class cls = Long.TYPE;
        boolean zS = s(cls);
        f13785c = zS;
        boolean zS2 = s(Integer.TYPE);
        A1 c1021y1 = null;
        if (unsafeG != null) {
            if (zS) {
                c1021y1 = new z1(unsafeG);
            } else if (zS2) {
                c1021y1 = new C1021y1(unsafeG);
            }
        }
        f13786d = c1021y1;
        if (c1021y1 == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls2 = c1021y1.f13779a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (y() != null) {
                    z6 = true;
                }
            } catch (Throwable th) {
                h(th);
            }
        }
        f13787e = z6;
        A1 a13 = f13786d;
        if (a13 == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls3 = a13.f13779a.getClass();
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
                h(th2);
                z7 = false;
            }
        }
        f13788f = z7;
        w(byte[].class);
        w(boolean[].class);
        x(boolean[].class);
        w(int[].class);
        x(int[].class);
        w(long[].class);
        x(long[].class);
        w(float[].class);
        x(float[].class);
        w(double[].class);
        x(double[].class);
        w(Object[].class);
        x(Object[].class);
        Field fieldY = y();
        if (fieldY != null && (a12 = f13786d) != null) {
            a12.f13779a.objectFieldOffset(fieldY);
        }
        f13789g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static double a(Object obj, long j7) {
        return f13786d.a(obj, j7);
    }

    static float b(Object obj, long j7) {
        return f13786d.b(obj, j7);
    }

    static int c(Object obj, long j7) {
        return f13786d.f13779a.getInt(obj, j7);
    }

    static long d(Object obj, long j7) {
        return f13786d.f13779a.getLong(obj, j7);
    }

    static Object e(Class cls) {
        try {
            return f13783a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static Object f(Object obj, long j7) {
        return f13786d.f13779a.getObject(obj, j7);
    }

    static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1018x1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable th) {
        Logger.getLogger(B1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void i(Object obj, long j7, boolean z6) {
        A1 a12 = f13786d;
        long j8 = (-4) & j7;
        int i7 = a12.f13779a.getInt(obj, j8);
        int i8 = ((~((int) j7)) & 3) << 3;
        a12.f13779a.putInt(obj, j8, ((z6 ? 1 : 0) << i8) | ((~(255 << i8)) & i7));
    }

    static /* synthetic */ void j(Object obj, long j7, boolean z6) {
        A1 a12 = f13786d;
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        a12.f13779a.putInt(obj, j8, ((z6 ? 1 : 0) << i7) | ((~(255 << i7)) & a12.f13779a.getInt(obj, j8)));
    }

    static void k(Object obj, long j7, boolean z6) {
        f13786d.c(obj, j7, z6);
    }

    static void l(Object obj, long j7, double d7) {
        f13786d.d(obj, j7, d7);
    }

    static void m(Object obj, long j7, float f7) {
        f13786d.e(obj, j7, f7);
    }

    static void n(Object obj, long j7, int i7) {
        f13786d.f13779a.putInt(obj, j7, i7);
    }

    static void o(Object obj, long j7, long j8) {
        f13786d.f13779a.putLong(obj, j7, j8);
    }

    static void p(Object obj, long j7, Object obj2) {
        f13786d.f13779a.putObject(obj, j7, obj2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object obj, long j7) {
        return ((byte) ((f13786d.f13779a.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object obj, long j7) {
        return ((byte) ((f13786d.f13779a.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    static boolean s(Class cls) {
        int i7 = AbstractC0958d0.f13883a;
        try {
            Class cls2 = f13784b;
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

    static boolean t(Object obj, long j7) {
        return f13786d.f(obj, j7);
    }

    static boolean u() {
        return f13788f;
    }

    static boolean v() {
        return f13787e;
    }

    private static int w(Class cls) {
        if (f13788f) {
            return f13786d.f13779a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int x(Class cls) {
        if (f13788f) {
            return f13786d.f13779a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field y() {
        int i7 = AbstractC0958d0.f13883a;
        Field fieldZ = z(Buffer.class, "effectiveDirectAddress");
        if (fieldZ != null) {
            return fieldZ;
        }
        Field fieldZ2 = z(Buffer.class, "address");
        if (fieldZ2 == null || fieldZ2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZ2;
    }

    private static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
