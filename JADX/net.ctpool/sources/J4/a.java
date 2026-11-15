package J4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f1724p = new C0032a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f1728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f1729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f1734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f1735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f1736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f1737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f1738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f1739o;

    /* JADX INFO: renamed from: J4.a$a, reason: collision with other inner class name */
    public static final class C0032a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1740a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1741b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1742c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f1743d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f1744e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f1745f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1746g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1747h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f1748i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f1749j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f1750k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f1751l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f1752m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f1753n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f1754o = "";

        C0032a() {
        }

        public a a() {
            return new a(this.f1740a, this.f1741b, this.f1742c, this.f1743d, this.f1744e, this.f1745f, this.f1746g, this.f1747h, this.f1748i, this.f1749j, this.f1750k, this.f1751l, this.f1752m, this.f1753n, this.f1754o);
        }

        public C0032a b(String str) {
            this.f1752m = str;
            return this;
        }

        public C0032a c(String str) {
            this.f1746g = str;
            return this;
        }

        public C0032a d(String str) {
            this.f1754o = str;
            return this;
        }

        public C0032a e(b bVar) {
            this.f1751l = bVar;
            return this;
        }

        public C0032a f(String str) {
            this.f1742c = str;
            return this;
        }

        public C0032a g(String str) {
            this.f1741b = str;
            return this;
        }

        public C0032a h(c cVar) {
            this.f1743d = cVar;
            return this;
        }

        public C0032a i(String str) {
            this.f1745f = str;
            return this;
        }

        public C0032a j(int i7) {
            this.f1747h = i7;
            return this;
        }

        public C0032a k(long j7) {
            this.f1740a = j7;
            return this;
        }

        public C0032a l(d dVar) {
            this.f1744e = dVar;
            return this;
        }

        public C0032a m(String str) {
            this.f1749j = str;
            return this;
        }

        public C0032a n(int i7) {
            this.f1748i = i7;
            return this;
        }
    }

    public enum b implements z4.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f1759m;

        b(int i7) {
            this.f1759m = i7;
        }

        @Override // z4.c
        public int d() {
            return this.f1759m;
        }
    }

    public enum c implements z4.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f1765m;

        c(int i7) {
            this.f1765m = i7;
        }

        @Override // z4.c
        public int d() {
            return this.f1765m;
        }
    }

    public enum d implements z4.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f1771m;

        d(int i7) {
            this.f1771m = i7;
        }

        @Override // z4.c
        public int d() {
            return this.f1771m;
        }
    }

    a(long j7, String str, String str2, c cVar, d dVar, String str3, String str4, int i7, int i8, String str5, long j8, b bVar, String str6, long j9, String str7) {
        this.f1725a = j7;
        this.f1726b = str;
        this.f1727c = str2;
        this.f1728d = cVar;
        this.f1729e = dVar;
        this.f1730f = str3;
        this.f1731g = str4;
        this.f1732h = i7;
        this.f1733i = i8;
        this.f1734j = str5;
        this.f1735k = j8;
        this.f1736l = bVar;
        this.f1737m = str6;
        this.f1738n = j9;
        this.f1739o = str7;
    }

    public static C0032a p() {
        return new C0032a();
    }

    public String a() {
        return this.f1737m;
    }

    public long b() {
        return this.f1735k;
    }

    public long c() {
        return this.f1738n;
    }

    public String d() {
        return this.f1731g;
    }

    public String e() {
        return this.f1739o;
    }

    public b f() {
        return this.f1736l;
    }

    public String g() {
        return this.f1727c;
    }

    public String h() {
        return this.f1726b;
    }

    public c i() {
        return this.f1728d;
    }

    public String j() {
        return this.f1730f;
    }

    public int k() {
        return this.f1732h;
    }

    public long l() {
        return this.f1725a;
    }

    public d m() {
        return this.f1729e;
    }

    public String n() {
        return this.f1734j;
    }

    public int o() {
        return this.f1733i;
    }
}
