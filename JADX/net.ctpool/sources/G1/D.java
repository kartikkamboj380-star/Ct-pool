package G1;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f1151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f1152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R0.d f1153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G f1154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H f1155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final G f1156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final H f1157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f1158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f1159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f1160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f1161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f1162m;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private G f1163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private H f1164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private G f1165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private R0.d f1166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private G f1167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private H f1168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private G f1169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private H f1170h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f1171i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f1172j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f1173k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f1174l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1175m;

        private a() {
        }

        public D m() {
            return new D(this);
        }
    }

    private D(a aVar) {
        if (K1.b.d()) {
            K1.b.a("PoolConfig()");
        }
        this.f1150a = aVar.f1163a == null ? n.a() : aVar.f1163a;
        this.f1151b = aVar.f1164b == null ? A.h() : aVar.f1164b;
        this.f1152c = aVar.f1165c == null ? p.b() : aVar.f1165c;
        this.f1153d = aVar.f1166d == null ? R0.e.b() : aVar.f1166d;
        this.f1154e = aVar.f1167e == null ? q.a() : aVar.f1167e;
        this.f1155f = aVar.f1168f == null ? A.h() : aVar.f1168f;
        this.f1156g = aVar.f1169g == null ? o.a() : aVar.f1169g;
        this.f1157h = aVar.f1170h == null ? A.h() : aVar.f1170h;
        this.f1158i = aVar.f1171i == null ? "legacy" : aVar.f1171i;
        this.f1159j = aVar.f1172j;
        this.f1160k = aVar.f1173k > 0 ? aVar.f1173k : 4194304;
        this.f1161l = aVar.f1174l;
        if (K1.b.d()) {
            K1.b.b();
        }
        this.f1162m = aVar.f1175m;
    }

    public static a n() {
        return new a();
    }

    public int a() {
        return this.f1160k;
    }

    public int b() {
        return this.f1159j;
    }

    public G c() {
        return this.f1150a;
    }

    public H d() {
        return this.f1151b;
    }

    public String e() {
        return this.f1158i;
    }

    public G f() {
        return this.f1152c;
    }

    public G g() {
        return this.f1154e;
    }

    public H h() {
        return this.f1155f;
    }

    public R0.d i() {
        return this.f1153d;
    }

    public G j() {
        return this.f1156g;
    }

    public H k() {
        return this.f1157h;
    }

    public boolean l() {
        return this.f1162m;
    }

    public boolean m() {
        return this.f1161l;
    }
}
