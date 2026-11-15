package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f7705a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f7706b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f7707c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f7708d = c(3, 2);

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
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final b f7709A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final b f7710B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final b f7711C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b f7712D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final b f7713E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final b f7714F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ b[] f7715G;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f7716o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f7717p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f7718q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f7719r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f7720s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f7721t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f7722u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f7723v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f7724w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f7725x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f7726y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f7727z;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final c f7728m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f7729n;

        enum a extends b {
            a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r0$b$b, reason: collision with other inner class name */
        enum C0153b extends b {
            C0153b(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        enum c extends b {
            c(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        enum d extends b {
            d(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f7716o = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f7717p = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f7718q = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f7719r = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f7720s = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f7721t = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f7722u = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f7723v = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f7724w = aVar;
            c cVar3 = c.MESSAGE;
            C0153b c0153b = new C0153b("GROUP", 9, cVar3, 3);
            f7725x = c0153b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f7726y = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f7727z = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f7709A = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f7710B = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f7711C = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f7712D = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f7713E = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f7714F = bVar14;
            f7715G = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0153b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i7, c cVar, int i8) {
            this.f7728m = cVar;
            this.f7729n = i8;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f7715G.clone();
        }

        public c e() {
            return this.f7728m;
        }

        public int h() {
            return this.f7729n;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC0612g.f7582n),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Object f7740m;

        c(Object obj) {
            this.f7740m = obj;
        }
    }

    public static int a(int i7) {
        return i7 >>> 3;
    }

    public static int b(int i7) {
        return i7 & 7;
    }

    static int c(int i7, int i8) {
        return (i7 << 3) | i8;
    }
}
