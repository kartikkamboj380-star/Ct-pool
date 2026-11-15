package androidx.datastore.preferences.protobuf;

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
public final class A {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final A f7505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A f7506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final A f7507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final A f7508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final A f7509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final A f7510u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final A f7511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final A f7512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final A f7513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final A f7514y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ A[] f7515z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Class f7516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f7517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f7518o;

    static {
        A a7 = new A("VOID", 0, Void.class, Void.class, null);
        f7505p = a7;
        Class cls = Integer.TYPE;
        A a8 = new A("INT", 1, cls, Integer.class, 0);
        f7506q = a8;
        A a9 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f7507r = a9;
        A a10 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7508s = a10;
        A a11 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7509t = a11;
        A a12 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7510u = a12;
        A a13 = new A("STRING", 6, String.class, String.class, "");
        f7511v = a13;
        A a14 = new A("BYTE_STRING", 7, AbstractC0612g.class, AbstractC0612g.class, AbstractC0612g.f7582n);
        f7512w = a14;
        A a15 = new A("ENUM", 8, cls, Integer.class, null);
        f7513x = a15;
        A a16 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f7514y = a16;
        f7515z = new A[]{a7, a8, a9, a10, a11, a12, a13, a14, a15, a16};
    }

    private A(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f7516m = cls;
        this.f7517n = cls2;
        this.f7518o = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f7515z.clone();
    }

    public Class e() {
        return this.f7517n;
    }
}
