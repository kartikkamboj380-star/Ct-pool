package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'p' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class N1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final N1 f15068A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final N1 f15069B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final N1 f15070C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final N1 f15071D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final N1 f15072E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ N1[] f15073F;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final N1 f15074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final N1 f15075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final N1 f15076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final N1 f15077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final N1 f15078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final N1 f15079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final N1 f15080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final N1 f15081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final N1 f15082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final N1 f15083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final N1 f15084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final N1 f15085y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final N1 f15086z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final O1 f15087m;

    static {
        N1 n12 = new N1("DOUBLE", 0, O1.DOUBLE, 1);
        f15074n = n12;
        N1 n13 = new N1("FLOAT", 1, O1.FLOAT, 5);
        f15075o = n13;
        O1 o12 = O1.LONG;
        N1 n14 = new N1("INT64", 2, o12, 0);
        f15076p = n14;
        N1 n15 = new N1("UINT64", 3, o12, 0);
        f15077q = n15;
        O1 o13 = O1.INT;
        N1 n16 = new N1("INT32", 4, o13, 0);
        f15078r = n16;
        N1 n17 = new N1("FIXED64", 5, o12, 1);
        f15079s = n17;
        N1 n18 = new N1("FIXED32", 6, o13, 5);
        f15080t = n18;
        N1 n19 = new N1("BOOL", 7, O1.BOOLEAN, 0);
        f15081u = n19;
        N1 n110 = new N1("STRING", 8, O1.STRING, 2);
        f15082v = n110;
        O1 o14 = O1.MESSAGE;
        N1 n111 = new N1("GROUP", 9, o14, 3);
        f15083w = n111;
        N1 n112 = new N1("MESSAGE", 10, o14, 2);
        f15084x = n112;
        N1 n113 = new N1("BYTES", 11, O1.BYTE_STRING, 2);
        f15085y = n113;
        N1 n114 = new N1("UINT32", 12, o13, 0);
        f15086z = n114;
        N1 n115 = new N1("ENUM", 13, O1.ENUM, 0);
        f15068A = n115;
        N1 n116 = new N1("SFIXED32", 14, o13, 5);
        f15069B = n116;
        N1 n117 = new N1("SFIXED64", 15, o12, 1);
        f15070C = n117;
        N1 n118 = new N1("SINT32", 16, o13, 0);
        f15071D = n118;
        N1 n119 = new N1("SINT64", 17, o12, 0);
        f15072E = n119;
        f15073F = new N1[]{n12, n13, n14, n15, n16, n17, n18, n19, n110, n111, n112, n113, n114, n115, n116, n117, n118, n119};
    }

    private N1(String str, int i7, O1 o12, int i8) {
        this.f15087m = o12;
    }

    public static N1[] values() {
        return (N1[]) f15073F.clone();
    }

    public final O1 e() {
        return this.f15087m;
    }
}
