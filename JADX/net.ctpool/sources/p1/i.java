package p1;

import p1.b;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f21581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f21582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f21583e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21591m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Throwable f21594p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b.a f21600v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21584f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f21585g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21586h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21587i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f21588j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f21589k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21590l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21592n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21593o = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f21595q = e.UNKNOWN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l f21596r = l.UNKNOWN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f21597s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f21598t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f21599u = -1;

    public e a() {
        return this.f21595q;
    }

    public void b() {
        this.f21580b = null;
        this.f21581c = null;
        this.f21582d = null;
        this.f21583e = null;
        this.f21591m = false;
        this.f21592n = -1;
        this.f21593o = -1;
        this.f21594p = null;
        this.f21595q = e.UNKNOWN;
        this.f21596r = l.UNKNOWN;
        this.f21600v = null;
        c();
    }

    public void c() {
        this.f21589k = -1L;
        this.f21590l = -1L;
        this.f21584f = -1L;
        this.f21586h = -1L;
        this.f21587i = -1L;
        this.f21588j = -1L;
        this.f21597s = -1L;
        this.f21598t = -1L;
        this.f21599u = -1L;
    }

    public void d(Object obj) {
        this.f21582d = obj;
    }

    public void e(long j7) {
        this.f21588j = j7;
    }

    public void f(long j7) {
        this.f21587i = j7;
    }

    public void g(long j7) {
        this.f21586h = j7;
    }

    public void h(String str) {
        this.f21579a = str;
    }

    public void i(long j7) {
        this.f21585g = j7;
    }

    public void j(long j7) {
        this.f21584f = j7;
    }

    public void k(Throwable th) {
        this.f21594p = th;
    }

    public void l(b.a aVar) {
        this.f21600v = aVar;
    }

    public void m(Object obj) {
        this.f21583e = obj;
    }

    public void n(e eVar) {
        this.f21595q = eVar;
    }

    public void o(Object obj) {
        this.f21581c = obj;
    }

    public void p(long j7) {
        this.f21590l = j7;
    }

    public void q(long j7) {
        this.f21589k = j7;
    }

    public void r(long j7) {
        this.f21598t = j7;
    }

    public void s(int i7) {
        this.f21593o = i7;
    }

    public void t(int i7) {
        this.f21592n = i7;
    }

    public void u(boolean z6) {
        this.f21591m = z6;
    }

    public void v(String str) {
        this.f21580b = str;
    }

    public void w(long j7) {
        this.f21597s = j7;
    }

    public void x(boolean z6) {
        this.f21596r = z6 ? l.VISIBLE : l.INVISIBLE;
    }

    public f y() {
        return new f(this.f21579a, this.f21580b, this.f21581c, this.f21582d, this.f21583e, this.f21584f, this.f21585g, this.f21586h, this.f21587i, this.f21588j, this.f21589k, this.f21590l, this.f21591m, this.f21592n, this.f21593o, this.f21594p, this.f21596r, this.f21597s, this.f21598t, this.f21599u, null, this.f21600v);
    }
}
