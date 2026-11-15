package k1;

import O0.l;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import j1.p;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: k1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1816b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p.b f20512t = p.b.f20328h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p.b f20513u = p.b.f20329i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f20514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f20517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.b f20518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f20519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p.b f20520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f20521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p.b f20522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f20523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p.b f20524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p.b f20525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f20526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PointF f20527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f20528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f20529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f20530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f20531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f20532s;

    public C1816b(Resources resources) {
        this.f20514a = resources;
        s();
    }

    private void s() {
        this.f20515b = 300;
        this.f20516c = 0.0f;
        this.f20517d = null;
        p.b bVar = f20512t;
        this.f20518e = bVar;
        this.f20519f = null;
        this.f20520g = bVar;
        this.f20521h = null;
        this.f20522i = bVar;
        this.f20523j = null;
        this.f20524k = bVar;
        this.f20525l = f20513u;
        this.f20526m = null;
        this.f20527n = null;
        this.f20528o = null;
        this.f20529p = null;
        this.f20530q = null;
        this.f20531r = null;
        this.f20532s = null;
    }

    public static C1816b t(Resources resources) {
        return new C1816b(resources);
    }

    private void v() {
        List list = this.f20530q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l.g((Drawable) it.next());
            }
        }
    }

    public C1815a a() {
        v();
        return new C1815a(this);
    }

    public ColorFilter b() {
        return this.f20528o;
    }

    public PointF c() {
        return this.f20527n;
    }

    public p.b d() {
        return this.f20525l;
    }

    public Drawable e() {
        return this.f20529p;
    }

    public int f() {
        return this.f20515b;
    }

    public Drawable g() {
        return this.f20521h;
    }

    public p.b h() {
        return this.f20522i;
    }

    public List i() {
        return this.f20530q;
    }

    public Drawable j() {
        return this.f20517d;
    }

    public p.b k() {
        return this.f20518e;
    }

    public Drawable l() {
        return this.f20531r;
    }

    public Drawable m() {
        return this.f20523j;
    }

    public p.b n() {
        return this.f20524k;
    }

    public Resources o() {
        return this.f20514a;
    }

    public Drawable p() {
        return this.f20519f;
    }

    public p.b q() {
        return this.f20520g;
    }

    public d r() {
        return this.f20532s;
    }

    public C1816b u(d dVar) {
        this.f20532s = dVar;
        return this;
    }
}
