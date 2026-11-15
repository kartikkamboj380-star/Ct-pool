package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'q' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0 f15023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0 f15024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0 f15025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0 f15026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0 f15027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0 f15028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0 f15029v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0 f15030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0 f15031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0 f15032y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ C0[] f15033z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Class f15034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f15035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f15036o;

    static {
        C0 c02 = new C0("VOID", 0, Void.class, Void.class, null);
        f15023p = c02;
        Class cls = Integer.TYPE;
        C0 c03 = new C0("INT", 1, cls, Integer.class, 0);
        f15024q = c03;
        C0 c04 = new C0("LONG", 2, Long.TYPE, Long.class, 0L);
        f15025r = c04;
        C0 c05 = new C0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f15026s = c05;
        C0 c06 = new C0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f15027t = c06;
        C0 c07 = new C0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f15028u = c07;
        C0 c08 = new C0("STRING", 6, String.class, String.class, "");
        f15029v = c08;
        C0 c09 = new C0("BYTE_STRING", 7, S.class, S.class, S.f15105n);
        f15030w = c09;
        C0 c010 = new C0("ENUM", 8, cls, Integer.class, null);
        f15031x = c010;
        C0 c011 = new C0("MESSAGE", 9, Object.class, Object.class, null);
        f15032y = c011;
        f15033z = new C0[]{c02, c03, c04, c05, c06, c07, c08, c09, c010, c011};
    }

    private C0(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f15034m = cls;
        this.f15035n = cls2;
        this.f15036o = obj;
    }

    public static C0[] values() {
        return (C0[]) f15033z.clone();
    }

    public final Class e() {
        return this.f15035n;
    }
}
