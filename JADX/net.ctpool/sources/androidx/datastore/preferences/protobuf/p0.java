package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f7677a = Logger.getLogger(p0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Unsafe f7678b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f7679c = AbstractC0609d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f7680d = m(Long.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f7681e = m(Integer.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f7682f = z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f7683g = Q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f7684h = P();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final long f7685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f7686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f7687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f7688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f7689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f7690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f7691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f7692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f7693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f7694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f7695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f7696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f7697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f7698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f7699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final boolean f7700x;

    static class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j7) {
            return p0.f7700x ? p0.q(obj, j7) : p0.r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j7) {
            return p0.f7700x ? p0.t(obj, j7) : p0.u(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j7, boolean z6) {
            if (p0.f7700x) {
                p0.F(obj, j7, z6);
            } else {
                p0.G(obj, j7, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j7, byte b7) {
            if (p0.f7700x) {
                p0.I(obj, j7, b7);
            } else {
                p0.J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j7) {
            return p0.f7700x ? p0.q(obj, j7) : p0.r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j7) {
            return p0.f7700x ? p0.t(obj, j7) : p0.u(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j7, boolean z6) {
            if (p0.f7700x) {
                p0.F(obj, j7, z6);
            } else {
                p0.G(obj, j7, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j7, byte b7) {
            if (p0.f7700x) {
                p0.I(obj, j7, b7);
            } else {
                p0.J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j7) {
            return this.f7701a.getBoolean(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j7) {
            return this.f7701a.getByte(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j7) {
            return this.f7701a.getDouble(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j7) {
            return this.f7701a.getFloat(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j7, boolean z6) {
            this.f7701a.putBoolean(obj, j7, z6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j7, byte b7) {
            this.f7701a.putByte(obj, j7, b7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j7, double d7) {
            this.f7701a.putDouble(obj, j7, d7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j7, float f7) {
            this.f7701a.putFloat(obj, j7, f7);
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f7701a;

        e(Unsafe unsafe) {
            this.f7701a = unsafe;
        }

        public final int a(Class cls) {
            return this.f7701a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f7701a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j7);

        public abstract byte d(Object obj, long j7);

        public abstract double e(Object obj, long j7);

        public abstract float f(Object obj, long j7);

        public final int g(Object obj, long j7) {
            return this.f7701a.getInt(obj, j7);
        }

        public final long h(Object obj, long j7) {
            return this.f7701a.getLong(obj, j7);
        }

        public final Object i(Object obj, long j7) {
            return this.f7701a.getObject(obj, j7);
        }

        public final long j(Field field) {
            return this.f7701a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j7, boolean z6);

        public abstract void l(Object obj, long j7, byte b7);

        public abstract void m(Object obj, long j7, double d7);

        public abstract void n(Object obj, long j7, float f7);

        public final void o(Object obj, long j7, int i7) {
            this.f7701a.putInt(obj, j7, i7);
        }

        public final void p(Object obj, long j7, long j8) {
            this.f7701a.putLong(obj, j7, j8);
        }

        public final void q(Object obj, long j7, Object obj2) {
            this.f7701a.putObject(obj, j7, obj2);
        }
    }

    static {
        long j7 = j(byte[].class);
        f7685i = j7;
        f7686j = j(boolean[].class);
        f7687k = k(boolean[].class);
        f7688l = j(int[].class);
        f7689m = k(int[].class);
        f7690n = j(long[].class);
        f7691o = k(long[].class);
        f7692p = j(float[].class);
        f7693q = k(float[].class);
        f7694r = j(double[].class);
        f7695s = k(double[].class);
        f7696t = j(Object[].class);
        f7697u = k(Object[].class);
        f7698v = o(l());
        f7699w = (int) (j7 & 7);
        f7700x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Object A(Object obj, long j7) {
        return f7682f.i(obj, j7);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f7684h;
    }

    static boolean D() {
        return f7683g;
    }

    static void E(Object obj, long j7, boolean z6) {
        f7682f.k(obj, j7, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j7, boolean z6) {
        I(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j7, boolean z6) {
        J(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j7, byte b7) {
        f7682f.l(bArr, f7685i + j7, b7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int iX = x(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        M(obj, j8, ((255 & b7) << i7) | (iX & (~(255 << i7))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        M(obj, j8, ((255 & b7) << i7) | (x(obj, j8) & (~(255 << i7))));
    }

    static void K(Object obj, long j7, double d7) {
        f7682f.m(obj, j7, d7);
    }

    static void L(Object obj, long j7, float f7) {
        f7682f.n(obj, j7, f7);
    }

    static void M(Object obj, long j7, int i7) {
        f7682f.o(obj, j7, i7);
    }

    static void N(Object obj, long j7, long j8) {
        f7682f.p(obj, j7, j8);
    }

    static void O(Object obj, long j7, Object obj2) {
        f7682f.q(obj, j7, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f7678b;
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
            if (AbstractC0609d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f7677a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f7678b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (AbstractC0609d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f7677a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static Object i(Class cls) {
        try {
            return f7678b.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    private static int j(Class cls) {
        if (f7684h) {
            return f7682f.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f7684h) {
            return f7682f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field fieldN;
        if (AbstractC0609d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    private static boolean m(Class cls) {
        if (!AbstractC0609d.c()) {
            return false;
        }
        try {
            Class cls2 = f7679c;
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

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f7682f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j7) {
        return f7682f.c(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j7) {
        return t(obj, j7) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j7) {
        return u(obj, j7) != 0;
    }

    static byte s(byte[] bArr, long j7) {
        return f7682f.d(bArr, f7685i + j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j7) {
        return (byte) ((x(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j7) {
        return (byte) ((x(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j7) {
        return f7682f.e(obj, j7);
    }

    static float w(Object obj, long j7) {
        return f7682f.f(obj, j7);
    }

    static int x(Object obj, long j7) {
        return f7682f.g(obj, j7);
    }

    static long y(Object obj, long j7) {
        return f7682f.h(obj, j7);
    }

    private static e z() {
        Unsafe unsafe = f7678b;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0609d.c()) {
            return new d(unsafe);
        }
        if (f7680d) {
            return new c(unsafe);
        }
        if (f7681e) {
            return new b(unsafe);
        }
        return null;
    }
}
