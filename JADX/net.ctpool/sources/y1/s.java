package y1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.C0765b;
import com.facebook.imagepipeline.producers.C0770g;
import com.facebook.imagepipeline.producers.C0771h;
import com.facebook.imagepipeline.producers.C0772i;
import com.facebook.imagepipeline.producers.C0773j;
import com.facebook.imagepipeline.producers.C0774k;
import com.facebook.imagepipeline.producers.C0776m;
import com.facebook.imagepipeline.producers.C0778o;
import com.facebook.imagepipeline.producers.C0779p;
import com.facebook.imagepipeline.producers.C0781s;
import com.facebook.imagepipeline.producers.C0784v;
import com.facebook.imagepipeline.producers.C0786x;
import com.facebook.imagepipeline.producers.C0787y;
import com.facebook.imagepipeline.producers.C0788z;
import com.facebook.imagepipeline.producers.H;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.J;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.T;
import com.facebook.imagepipeline.producers.W;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import java.util.Map;
import w1.C2183d;
import w1.x;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ContentResolver f23110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Resources f23111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AssetManager f23112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final R0.a f23113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final B1.c f23114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final B1.e f23115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final e f23116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f23117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final boolean f23118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final g f23119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final R0.i f23120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final w1.j f23121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final w1.j f23122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final x f23123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final x f23124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final w1.k f23125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final C2183d f23126q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final C2183d f23127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final v1.b f23128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final int f23129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final int f23130u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f23131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final C2238a f23132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final int f23133x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final boolean f23134y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected final Map f23135z;

    public s(Context context, R0.a aVar, B1.c cVar, B1.e eVar, e eVar2, boolean z6, boolean z7, g gVar, R0.i iVar, x xVar, x xVar2, w1.j jVar, w1.j jVar2, Map map, w1.k kVar, v1.b bVar, int i7, int i8, boolean z8, int i9, C2238a c2238a, boolean z9, int i10) {
        this.f23110a = context.getApplicationContext().getContentResolver();
        this.f23111b = context.getApplicationContext().getResources();
        this.f23112c = context.getApplicationContext().getAssets();
        this.f23113d = aVar;
        this.f23114e = cVar;
        this.f23115f = eVar;
        this.f23116g = eVar2;
        this.f23117h = z6;
        this.f23118i = z7;
        this.f23119j = gVar;
        this.f23120k = iVar;
        this.f23124o = xVar;
        this.f23123n = xVar2;
        this.f23121l = jVar;
        this.f23122m = jVar2;
        this.f23135z = map;
        this.f23125p = kVar;
        this.f23128s = bVar;
        this.f23126q = new C2183d(i10);
        this.f23127r = new C2183d(i10);
        this.f23129t = i7;
        this.f23130u = i8;
        this.f23131v = z8;
        this.f23133x = i9;
        this.f23132w = c2238a;
        this.f23134y = z9;
    }

    public static C0765b a(d0 d0Var) {
        return new C0765b(d0Var);
    }

    public static C0776m h(d0 d0Var, d0 d0Var2) {
        return new C0776m(d0Var, d0Var2);
    }

    public a0 A(d0 d0Var) {
        return new a0(this.f23124o, this.f23125p, d0Var);
    }

    public b0 B(d0 d0Var) {
        return new b0(d0Var, this.f23128s, this.f23119j.c());
    }

    public i0 C() {
        return new i0(this.f23119j.e(), this.f23120k, this.f23110a);
    }

    public k0 D(d0 d0Var, boolean z6, L1.d dVar) {
        return new k0(this.f23119j.c(), this.f23120k, d0Var, z6, dVar);
    }

    public n0 E(d0 d0Var) {
        return new n0(d0Var);
    }

    public r0 F(d0 d0Var) {
        return new r0(5, this.f23119j.b(), d0Var);
    }

    public t0 G(u0[] u0VarArr) {
        return new t0(u0VarArr);
    }

    public d0 b(d0 d0Var, p0 p0Var) {
        return new o0(d0Var, p0Var);
    }

    public C0770g c(d0 d0Var) {
        return new C0770g(this.f23124o, this.f23125p, d0Var);
    }

    public C0771h d(d0 d0Var) {
        return new C0771h(this.f23125p, d0Var);
    }

    public C0772i e(d0 d0Var) {
        return new C0772i(this.f23124o, this.f23125p, d0Var);
    }

    public C0773j f(d0 d0Var) {
        return new C0773j(d0Var, this.f23129t, this.f23130u, this.f23131v);
    }

    public C0774k g(d0 d0Var) {
        return new C0774k(this.f23123n, this.f23121l, this.f23122m, this.f23125p, this.f23126q, this.f23127r, d0Var);
    }

    public C0778o i() {
        return new C0778o(this.f23120k);
    }

    public C0779p j(d0 d0Var) {
        return new C0779p(this.f23113d, this.f23119j.a(), this.f23114e, this.f23115f, this.f23116g, this.f23117h, this.f23118i, d0Var, this.f23133x, this.f23132w, null, O0.p.f2461b);
    }

    public C0781s k(d0 d0Var) {
        return new C0781s(d0Var, this.f23119j.g());
    }

    public C0784v l(d0 d0Var) {
        return new C0784v(this.f23121l, this.f23122m, this.f23135z, this.f23125p, d0Var);
    }

    public C0786x m(d0 d0Var) {
        return new C0786x(this.f23121l, this.f23122m, this.f23135z, this.f23125p, d0Var);
    }

    public C0787y n(d0 d0Var) {
        return new C0787y(this.f23125p, this.f23134y, d0Var);
    }

    public d0 o(d0 d0Var) {
        return new C0788z(this.f23123n, this.f23125p, d0Var);
    }

    public A p(d0 d0Var) {
        return new A(this.f23121l, this.f23122m, this.f23125p, this.f23126q, this.f23127r, d0Var);
    }

    public H q() {
        return new H(this.f23119j.e(), this.f23120k, this.f23112c);
    }

    public I r() {
        return new I(this.f23119j.e(), this.f23120k, this.f23110a);
    }

    public J s() {
        return new J(this.f23119j.e(), this.f23120k, this.f23110a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f23119j.f(), this.f23120k, this.f23110a);
    }

    public M u() {
        return new M(this.f23119j.e(), this.f23120k);
    }

    public N v() {
        return new N(this.f23119j.e(), this.f23120k, this.f23111b);
    }

    public S w() {
        return new S(this.f23119j.c(), this.f23110a);
    }

    public T x() {
        return new T(this.f23119j.e(), this.f23110a);
    }

    public d0 y(X x6) {
        return new W(this.f23120k, this.f23113d, x6);
    }

    public Y z(d0 d0Var) {
        return new Y(this.f23121l, this.f23125p, this.f23120k, this.f23113d, d0Var);
    }
}
