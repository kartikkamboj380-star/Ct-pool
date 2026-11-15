package J0;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O0.o f1583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f1584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f1585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f1586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f1587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final I0.a f1588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final I0.c f1589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final L0.b f1590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f1591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f1592l;

    class a implements O0.o {
        a() {
        }

        @Override // O0.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            O0.l.g(g.this.f1591k);
            return g.this.f1591k.getApplicationContext().getCacheDir();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private O0.o f1596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f1597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f1598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f1599f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private m f1600g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private I0.a f1601h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private I0.c f1602i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private L0.b f1603j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f1604k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Context f1605l;

        private b(Context context) {
            this.f1594a = 1;
            this.f1595b = "image_cache";
            this.f1597d = 41943040L;
            this.f1598e = 10485760L;
            this.f1599f = 2097152L;
            this.f1600g = new f();
            this.f1605l = context;
        }

        public g n() {
            return new g(this);
        }
    }

    protected g(b bVar) {
        Context context = bVar.f1605l;
        this.f1591k = context;
        O0.l.j((bVar.f1596c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f1596c == null && context != null) {
            bVar.f1596c = new a();
        }
        this.f1581a = bVar.f1594a;
        this.f1582b = (String) O0.l.g(bVar.f1595b);
        this.f1583c = (O0.o) O0.l.g(bVar.f1596c);
        this.f1584d = bVar.f1597d;
        this.f1585e = bVar.f1598e;
        this.f1586f = bVar.f1599f;
        this.f1587g = (m) O0.l.g(bVar.f1600g);
        this.f1588h = bVar.f1601h == null ? I0.g.b() : bVar.f1601h;
        this.f1589i = bVar.f1602i == null ? I0.h.i() : bVar.f1602i;
        this.f1590j = bVar.f1603j == null ? L0.c.b() : bVar.f1603j;
        this.f1592l = bVar.f1604k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f1582b;
    }

    public O0.o c() {
        return this.f1583c;
    }

    public I0.a d() {
        return this.f1588h;
    }

    public I0.c e() {
        return this.f1589i;
    }

    public long f() {
        return this.f1584d;
    }

    public L0.b g() {
        return this.f1590j;
    }

    public m h() {
        return this.f1587g;
    }

    public boolean i() {
        return this.f1592l;
    }

    public long j() {
        return this.f1585e;
    }

    public long k() {
        return this.f1586f;
    }

    public int l() {
        return this.f1581a;
    }
}
