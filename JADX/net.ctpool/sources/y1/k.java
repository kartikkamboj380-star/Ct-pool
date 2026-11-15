package y1;

import J1.b;
import android.net.Uri;
import com.facebook.imagepipeline.producers.F;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.p0;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w1.x;
import x1.EnumC2214e;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f22915o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final CancellationException f22916p = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final CancellationException f22917q = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f22918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O0.o f22919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F1.e f22920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F1.d f22921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f22922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f22923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w1.j f22924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w1.j f22925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w1.k f22926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p0 f22927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final O0.o f22928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicLong f22929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final O0.o f22930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f22931n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22932a;

        static {
            int[] iArr = new int[b.EnumC0030b.values().length];
            try {
                iArr[b.EnumC0030b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC0030b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22932a = iArr;
        }
    }

    public k(t tVar, Set set, Set set2, O0.o oVar, x xVar, x xVar2, w1.j jVar, w1.j jVar2, w1.k kVar, p0 p0Var, O0.o oVar2, O0.o oVar3, K0.a aVar, m mVar) {
        w5.k.f(tVar, "producerSequenceFactory");
        w5.k.f(set, "requestListeners");
        w5.k.f(set2, "requestListener2s");
        w5.k.f(oVar, "isPrefetchEnabledSupplier");
        w5.k.f(xVar, "bitmapMemoryCache");
        w5.k.f(xVar2, "encodedMemoryCache");
        w5.k.f(jVar, "mainBufferedDiskCache");
        w5.k.f(jVar2, "smallImageBufferedDiskCache");
        w5.k.f(kVar, "cacheKeyFactory");
        w5.k.f(p0Var, "threadHandoffProducerQueue");
        w5.k.f(oVar2, "suppressBitmapPrefetchingSupplier");
        w5.k.f(oVar3, "lazyDataSource");
        w5.k.f(mVar, "config");
        this.f22918a = tVar;
        this.f22919b = oVar;
        this.f22920c = new F1.c(set);
        this.f22921d = new F1.b(set2);
        this.f22929l = new AtomicLong();
        this.f22922e = xVar;
        this.f22923f = xVar2;
        this.f22924g = jVar;
        this.f22925h = jVar2;
        this.f22926i = kVar;
        this.f22927j = p0Var;
        this.f22928k = oVar2;
        this.f22930m = oVar3;
        this.f22931n = mVar;
    }

    private final Y0.c A(d0 d0Var, J1.b bVar, b.c cVar, Object obj, EnumC2214e enumC2214e, F1.e eVar) {
        F f7 = new F(o(bVar, eVar), this.f22921d);
        try {
            b.c cVarE = b.c.e(bVar.j(), cVar);
            w5.k.e(cVarE, "getMax(\n              im…ttedRequestLevelOnSubmit)");
            String strL = l();
            n nVarG = this.f22931n.G();
            return z1.d.f23249j.a(d0Var, new l0(bVar, strL, f7, obj, cVarE, true, nVarG != null && nVarG.b() && bVar.o(), enumC2214e, this.f22931n), f7);
        } catch (Exception e7) {
            Y0.c cVarB = Y0.d.b(e7);
            w5.k.e(cVarB, "{\n      DataSources.imme…taSource(exception)\n    }");
            return cVarB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(I0.d dVar) {
        w5.k.f(dVar, "it");
        return true;
    }

    public static /* synthetic */ Y0.c j(k kVar, J1.b bVar, Object obj, b.c cVar, F1.e eVar, String str, int i7, Object obj2) {
        return kVar.i(bVar, obj, (i7 & 4) != 0 ? null : cVar, (i7 & 8) != 0 ? null : eVar, (i7 & 16) != 0 ? null : str);
    }

    private final O0.m u(final Uri uri) {
        return new O0.m() { // from class: y1.i
            @Override // O0.m
            public final boolean apply(Object obj) {
                return k.v(uri, (I0.d) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(Uri uri, I0.d dVar) {
        w5.k.f(uri, "$uri");
        w5.k.f(dVar, "key");
        return dVar.a(uri);
    }

    private final Y0.c y(d0 d0Var, J1.b bVar, b.c cVar, Object obj, F1.e eVar, String str) {
        return z(d0Var, bVar, cVar, obj, eVar, str, null);
    }

    private final Y0.c z(d0 d0Var, J1.b bVar, b.c cVar, Object obj, F1.e eVar, String str, Map map) {
        Y0.c cVarB;
        if (!K1.b.d()) {
            F f7 = new F(o(bVar, eVar), this.f22921d);
            try {
                b.c cVarE = b.c.e(bVar.j(), cVar);
                w5.k.e(cVarE, "getMax(\n                …ttedRequestLevelOnSubmit)");
                l0 l0Var = new l0(bVar, l(), str, f7, obj, cVarE, false, bVar.o() || !W0.f.n(bVar.u()), bVar.n(), this.f22931n);
                l0Var.j(map);
                Y0.c cVarH = z1.c.H(d0Var, l0Var, f7);
                w5.k.e(cVarH, "{\n          val lowestPe…questListener2)\n        }");
                return cVarH;
            } catch (Exception e7) {
                Y0.c cVarB2 = Y0.d.b(e7);
                w5.k.e(cVarB2, "{\n          DataSources.…urce(exception)\n        }");
                return cVarB2;
            }
        }
        K1.b.a("ImagePipeline#submitFetchRequest");
        try {
            F f8 = new F(o(bVar, eVar), this.f22921d);
            try {
                b.c cVarE2 = b.c.e(bVar.j(), cVar);
                w5.k.e(cVarE2, "getMax(\n                …ttedRequestLevelOnSubmit)");
                l0 l0Var2 = new l0(bVar, l(), str, f8, obj, cVarE2, false, bVar.o() || !W0.f.n(bVar.u()), bVar.n(), this.f22931n);
                l0Var2.j(map);
                cVarB = z1.c.H(d0Var, l0Var2, f8);
                w5.k.e(cVarB, "{\n          val lowestPe…questListener2)\n        }");
            } catch (Exception e8) {
                cVarB = Y0.d.b(e8);
                w5.k.e(cVarB, "{\n          DataSources.…urce(exception)\n        }");
            }
            K1.b.b();
            return cVarB;
        } catch (Throwable th) {
            K1.b.b();
            throw th;
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        this.f22924g.h();
        this.f22925h.h();
    }

    public final void e() {
        O0.m mVar = new O0.m() { // from class: y1.j
            @Override // O0.m
            public final boolean apply(Object obj) {
                return k.f((I0.d) obj);
            }
        };
        this.f22922e.e(mVar);
        this.f22923f.e(mVar);
    }

    public final Y0.c g(J1.b bVar, Object obj) {
        return j(this, bVar, obj, null, null, null, 24, null);
    }

    public final Y0.c h(J1.b bVar, Object obj, b.c cVar) {
        w5.k.f(cVar, "lowestPermittedRequestLevelOnSubmit");
        return j(this, bVar, obj, cVar, null, null, 16, null);
    }

    public final Y0.c i(J1.b bVar, Object obj, b.c cVar, F1.e eVar, String str) {
        if (bVar == null) {
            Y0.c cVarB = Y0.d.b(new NullPointerException());
            w5.k.e(cVarB, "immediateFailedDataSource(NullPointerException())");
            return cVarB;
        }
        try {
            d0 d0VarP = this.f22918a.p(bVar);
            if (cVar == null) {
                cVar = b.c.FULL_FETCH;
            }
            return y(d0VarP, bVar, cVar, obj, eVar, str);
        } catch (Exception e7) {
            Y0.c cVarB2 = Y0.d.b(e7);
            w5.k.e(cVarB2, "{\n      DataSources.imme…taSource(exception)\n    }");
            return cVarB2;
        }
    }

    public final Y0.c k(J1.b bVar, Object obj) {
        w5.k.f(bVar, "imageRequest");
        return h(bVar, obj, b.c.BITMAP_MEMORY_CACHE);
    }

    public final String l() {
        return String.valueOf(this.f22929l.getAndIncrement());
    }

    public final x m() {
        return this.f22922e;
    }

    public final w1.k n() {
        return this.f22926i;
    }

    public final F1.e o(J1.b bVar, F1.e eVar) {
        if (bVar != null) {
            return eVar == null ? bVar.p() == null ? this.f22920c : new F1.c(this.f22920c, bVar.p()) : bVar.p() == null ? new F1.c(this.f22920c, eVar) : new F1.c(this.f22920c, eVar, bVar.p());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final boolean p(J1.b bVar) {
        if (bVar == null) {
            return false;
        }
        I0.d dVarA = this.f22926i.a(bVar, null);
        x xVar = this.f22922e;
        w5.k.e(dVarA, "cacheKey");
        S0.a aVar = xVar.get(dVarA);
        try {
            return S0.a.B(aVar);
        } finally {
            S0.a.g(aVar);
        }
    }

    public final boolean q(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f22922e.b(u(uri));
    }

    public final boolean r(J1.b bVar) {
        w1.j jVar;
        w5.k.f(bVar, "imageRequest");
        I0.d dVarC = this.f22926i.c(bVar, null);
        b.EnumC0030b enumC0030bC = bVar.c();
        w5.k.e(enumC0030bC, "imageRequest.cacheChoice");
        int i7 = b.f22932a[enumC0030bC.ordinal()];
        if (i7 == 1) {
            jVar = this.f22924g;
        } else {
            if (i7 != 2) {
                return false;
            }
            jVar = this.f22925h;
        }
        w5.k.e(dVarC, "cacheKey");
        return jVar.k(dVarC);
    }

    public final boolean s(Uri uri) {
        return t(uri, b.EnumC0030b.SMALL) || t(uri, b.EnumC0030b.DEFAULT);
    }

    public final boolean t(Uri uri, b.EnumC0030b enumC0030b) {
        J1.b bVarA = J1.c.w(uri).z(enumC0030b).a();
        w5.k.e(bVarA, "imageRequest");
        return r(bVarA);
    }

    public final Y0.c w(J1.b bVar, Object obj) {
        return x(bVar, obj, EnumC2214e.MEDIUM, null);
    }

    public final Y0.c x(J1.b bVar, Object obj, EnumC2214e enumC2214e, F1.e eVar) {
        Y0.c cVarB;
        String str;
        w5.k.f(enumC2214e, "priority");
        if (!((Boolean) this.f22919b.get()).booleanValue()) {
            Y0.c cVarB2 = Y0.d.b(f22916p);
            w5.k.e(cVarB2, "immediateFailedDataSource(PREFETCH_EXCEPTION)");
            return cVarB2;
        }
        if (bVar == null) {
            cVarB = Y0.d.b(new NullPointerException("imageRequest is null"));
            str = "{\n      DataSources.imme…eRequest is null\"))\n    }";
        } else {
            try {
                return A(this.f22918a.r(bVar), bVar, b.c.FULL_FETCH, obj, enumC2214e, eVar);
            } catch (Exception e7) {
                cVarB = Y0.d.b(e7);
                str = "{\n        DataSources.im…Source(exception)\n      }";
            }
        }
        w5.k.e(cVarB, str);
        return cVarB;
    }
}
