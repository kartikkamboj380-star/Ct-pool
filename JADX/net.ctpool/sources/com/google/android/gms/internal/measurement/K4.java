package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'o' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class K4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final K4 f14241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final K4 f14242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final K4 f14243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final K4 f14244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final K4 f14245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final K4 f14246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final K4 f14247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final K4 f14248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final K4 f14249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final K4 f14250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ K4[] f14251x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Class f14252m;

    static {
        K4 k42 = new K4("VOID", 0, Void.class, Void.class, null);
        f14241n = k42;
        Class cls = Integer.TYPE;
        K4 k43 = new K4("INT", 1, cls, Integer.class, 0);
        f14242o = k43;
        K4 k44 = new K4("LONG", 2, Long.TYPE, Long.class, 0L);
        f14243p = k44;
        K4 k45 = new K4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f14244q = k45;
        K4 k46 = new K4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f14245r = k46;
        K4 k47 = new K4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f14246s = k47;
        K4 k48 = new K4("STRING", 6, String.class, String.class, "");
        f14247t = k48;
        K4 k49 = new K4("BYTE_STRING", 7, R3.class, R3.class, R3.f14328n);
        f14248u = k49;
        K4 k410 = new K4("ENUM", 8, cls, Integer.class, null);
        f14249v = k410;
        K4 k411 = new K4("MESSAGE", 9, Object.class, Object.class, null);
        f14250w = k411;
        f14251x = new K4[]{k42, k43, k44, k45, k46, k47, k48, k49, k410, k411};
    }

    private K4(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f14252m = cls2;
    }

    public static K4[] values() {
        return (K4[]) f14251x.clone();
    }

    public final Class e() {
        return this.f14252m;
    }
}
