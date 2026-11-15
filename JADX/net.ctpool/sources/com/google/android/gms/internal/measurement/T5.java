package com.google.android.gms.internal.measurement;

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
public class T5 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final T5 f14348A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final T5 f14349B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final T5 f14350C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final T5 f14351D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final T5 f14352E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final T5 f14353F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ T5[] f14354G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final T5 f14355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final T5 f14356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final T5 f14357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final T5 f14358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final T5 f14359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final T5 f14360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final T5 f14361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final T5 f14362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final T5 f14363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final T5 f14364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final T5 f14365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final T5 f14366z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final EnumC1042a6 f14367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f14368n;

    static {
        T5 t52 = new T5("DOUBLE", 0, EnumC1042a6.DOUBLE, 1);
        f14355o = t52;
        T5 t53 = new T5("FLOAT", 1, EnumC1042a6.FLOAT, 5);
        f14356p = t53;
        EnumC1042a6 enumC1042a6 = EnumC1042a6.LONG;
        T5 t54 = new T5("INT64", 2, enumC1042a6, 0);
        f14357q = t54;
        T5 t55 = new T5("UINT64", 3, enumC1042a6, 0);
        f14358r = t55;
        EnumC1042a6 enumC1042a62 = EnumC1042a6.INT;
        T5 t56 = new T5("INT32", 4, enumC1042a62, 0);
        f14359s = t56;
        T5 t57 = new T5("FIXED64", 5, enumC1042a6, 1);
        f14360t = t57;
        T5 t58 = new T5("FIXED32", 6, enumC1042a62, 5);
        f14361u = t58;
        T5 t59 = new T5("BOOL", 7, EnumC1042a6.BOOLEAN, 0);
        f14362v = t59;
        int i7 = 2;
        Z5 z52 = null;
        W5 w52 = new W5("STRING", EnumC1042a6.STRING);
        f14363w = w52;
        EnumC1042a6 enumC1042a63 = EnumC1042a6.MESSAGE;
        V5 v52 = new V5("GROUP", enumC1042a63);
        f14364x = v52;
        Y5 y52 = new Y5("MESSAGE", enumC1042a63);
        f14365y = y52;
        X5 x52 = new X5("BYTES", EnumC1042a6.BYTE_STRING);
        f14366z = x52;
        T5 t510 = new T5("UINT32", 12, enumC1042a62, 0);
        f14348A = t510;
        T5 t511 = new T5("ENUM", 13, EnumC1042a6.ENUM, 0);
        f14349B = t511;
        T5 t512 = new T5("SFIXED32", 14, enumC1042a62, 5);
        f14350C = t512;
        T5 t513 = new T5("SFIXED64", 15, enumC1042a6, 1);
        f14351D = t513;
        T5 t514 = new T5("SINT32", 16, enumC1042a62, 0);
        f14352E = t514;
        T5 t515 = new T5("SINT64", 17, enumC1042a6, 0);
        f14353F = t515;
        f14354G = new T5[]{t52, t53, t54, t55, t56, t57, t58, t59, w52, v52, y52, x52, t510, t511, t512, t513, t514, t515};
    }

    private T5(String str, int i7, EnumC1042a6 enumC1042a6, int i8) {
        this.f14367m = enumC1042a6;
        this.f14368n = i8;
    }

    public static T5[] values() {
        return (T5[]) f14354G.clone();
    }

    public final EnumC1042a6 e() {
        return this.f14367m;
    }
}
