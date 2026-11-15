package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0989n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f14006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0998q1 f14007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0998q1 f14008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14009d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC0998q1 abstractC0998q1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f14006a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC0998q1 = (AbstractC0998q1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f14007b = abstractC0998q1;
        f14008c = new C1006t1();
    }

    public static AbstractC0998q1 a() {
        return f14007b;
    }

    public static AbstractC0998q1 b() {
        return f14008c;
    }

    static void c(AbstractC0998q1 abstractC0998q1, Object obj, Object obj2) {
        abstractC0998q1.d(obj, abstractC0998q1.b(abstractC0998q1.a(obj), abstractC0998q1.a(obj2)));
    }

    public static void d(Class cls) {
        Class cls2;
        if (!C0.class.isAssignableFrom(cls) && (cls2 = f14006a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
