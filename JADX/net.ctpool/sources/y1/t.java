package y1;

import J1.b;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.app.y;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.C0765b;
import com.facebook.imagepipeline.producers.C0770g;
import com.facebook.imagepipeline.producers.C0771h;
import com.facebook.imagepipeline.producers.C0772i;
import com.facebook.imagepipeline.producers.C0774k;
import com.facebook.imagepipeline.producers.C0776m;
import com.facebook.imagepipeline.producers.C0778o;
import com.facebook.imagepipeline.producers.C0779p;
import com.facebook.imagepipeline.producers.C0781s;
import com.facebook.imagepipeline.producers.C0784v;
import com.facebook.imagepipeline.producers.C0786x;
import com.facebook.imagepipeline.producers.C0787y;
import com.facebook.imagepipeline.producers.H;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.J;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.T;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a f23136K = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Lazy f23137A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Lazy f23138B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Lazy f23139C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Lazy f23140D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Lazy f23141E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Lazy f23142F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Lazy f23143G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Lazy f23144H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Lazy f23145I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Lazy f23146J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f23147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.s f23148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f23149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f23150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f23151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f23152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y1.e f23153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f23154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f23155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f23156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final L1.d f23157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f23158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f23159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f23160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f23161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f23162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f23163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f23164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f23165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f23166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Lazy f23167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f23168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Lazy f23169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Lazy f23170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Lazy f23171y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Lazy f23172z;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(Uri uri) {
            String string = uri.toString();
            w5.k.e(string, "uri.toString()");
            if (string.length() <= 30) {
                return string;
            }
            String strSubstring = string.substring(0, 30);
            w5.k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring + "...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(J1.b bVar) {
            O0.l.b(Boolean.valueOf(bVar.j().h() <= b.c.ENCODED_MEMORY_CACHE.h()));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends w5.l implements InterfaceC2171a {
        b() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                I iR = tVar.f23148b.r();
                w5.k.e(iR, "producerFactory.newLocalContentUriFetchProducer()");
                return tVar.f23148b.b(tVar.J(iR), tVar.f23152f);
            }
            K1.b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
            try {
                I iR2 = tVar.f23148b.r();
                w5.k.e(iR2, "producerFactory.newLocalContentUriFetchProducer()");
                return tVar.f23148b.b(tVar.J(iR2), tVar.f23152f);
            } finally {
                K1.b.b();
            }
        }
    }

    static final class c extends w5.l implements InterfaceC2171a {
        c() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                M mU = tVar.f23148b.u();
                w5.k.e(mU, "producerFactory.newLocalFileFetchProducer()");
                return tVar.f23148b.b(tVar.J(mU), tVar.f23152f);
            }
            K1.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
            try {
                M mU2 = tVar.f23148b.u();
                w5.k.e(mU2, "producerFactory.newLocalFileFetchProducer()");
                return tVar.f23148b.b(tVar.J(mU2), tVar.f23152f);
            } finally {
                K1.b.b();
            }
        }
    }

    static final class d extends w5.l implements InterfaceC2171a {
        d() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return tVar.f23148b.b(tVar.n(), tVar.f23152f);
            }
            K1.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            try {
                return tVar.f23148b.b(tVar.n(), tVar.f23152f);
            } finally {
                K1.b.b();
            }
        }
    }

    static final class e extends w5.l implements InterfaceC2171a {
        e() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return tVar.H(tVar.f23149c);
            }
            K1.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
            try {
                return tVar.H(tVar.f23149c);
            } finally {
                K1.b.b();
            }
        }
    }

    static final class f extends w5.l implements InterfaceC2171a {
        f() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            C0778o c0778oI = t.this.f23148b.i();
            w5.k.e(c0778oI, "producerFactory.newDataFetchProducer()");
            C0765b c0765bA = y1.s.a(c0778oI);
            w5.k.e(c0765bA, "newAddImageTransformMeta…taProducer(inputProducer)");
            k0 k0VarD = t.this.f23148b.D(c0765bA, true, t.this.f23157k);
            w5.k.e(k0VarD, "producerFactory.newResiz…, imageTranscoderFactory)");
            return t.this.E(k0VarD);
        }
    }

    static final class g extends w5.l implements InterfaceC2171a {
        g() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            H hQ = t.this.f23148b.q();
            w5.k.e(hQ, "producerFactory.newLocalAssetFetchProducer()");
            return t.this.F(hQ);
        }
    }

    static final class h extends w5.l implements InterfaceC2171a {
        h() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return new j0(tVar.i());
            }
            K1.b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
            try {
                return new j0(tVar.i());
            } finally {
                K1.b.b();
            }
        }
    }

    static final class i extends w5.l implements InterfaceC2171a {
        i() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            I iR = t.this.f23148b.r();
            w5.k.e(iR, "producerFactory.newLocalContentUriFetchProducer()");
            J jS = t.this.f23148b.s();
            w5.k.e(jS, "producerFactory.newLocal…iThumbnailFetchProducer()");
            LocalExifThumbnailProducer localExifThumbnailProducerT = t.this.f23148b.t();
            w5.k.e(localExifThumbnailProducerT, "producerFactory.newLocalExifThumbnailProducer()");
            return t.this.G(iR, new u0[]{jS, localExifThumbnailProducerT});
        }
    }

    static final class j extends w5.l implements InterfaceC2171a {
        j() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return new j0(tVar.j());
            }
            K1.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
            try {
                return new j0(tVar.j());
            } finally {
                K1.b.b();
            }
        }
    }

    static final class k extends w5.l implements InterfaceC2171a {
        k() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return tVar.f23148b.E(tVar.j());
            }
            K1.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            try {
                return tVar.f23148b.E(tVar.j());
            } finally {
                K1.b.b();
            }
        }
    }

    static final class l extends w5.l implements InterfaceC2171a {
        l() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            M mU = t.this.f23148b.u();
            w5.k.e(mU, "producerFactory.newLocalFileFetchProducer()");
            return t.this.F(mU);
        }
    }

    static final class m extends w5.l implements InterfaceC2171a {
        m() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            N nV = t.this.f23148b.v();
            w5.k.e(nV, "producerFactory.newLocalResourceFetchProducer()");
            return t.this.F(nV);
        }
    }

    static final class n extends w5.l implements InterfaceC2171a {
        n() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() throws Throwable {
            if (Build.VERSION.SDK_INT < 29) {
                throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
            }
            t tVar = t.this;
            S sW = tVar.f23148b.w();
            w5.k.e(sW, "producerFactory.newLocal…nailBitmapSdk29Producer()");
            return tVar.D(sW);
        }
    }

    static final class o extends w5.l implements InterfaceC2171a {
        o() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            T tX = t.this.f23148b.x();
            w5.k.e(tX, "producerFactory.newLocalVideoThumbnailProducer()");
            return t.this.D(tX);
        }
    }

    static final class p extends w5.l implements InterfaceC2171a {
        p() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return new j0(tVar.k());
            }
            K1.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
            try {
                return new j0(tVar.k());
            } finally {
                K1.b.b();
            }
        }
    }

    static final class q extends w5.l implements InterfaceC2171a {
        q() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return tVar.E(tVar.n());
            }
            K1.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            try {
                return tVar.E(tVar.n());
            } finally {
                K1.b.b();
            }
        }
    }

    static final class r extends w5.l implements InterfaceC2171a {
        r() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            K1.b bVar = K1.b.f1841a;
            t tVar = t.this;
            if (!K1.b.d()) {
                return tVar.f23148b.E(tVar.k());
            }
            K1.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
            try {
                return tVar.f23148b.E(tVar.k());
            } finally {
                K1.b.b();
            }
        }
    }

    static final class s extends w5.l implements InterfaceC2171a {
        s() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            i0 i0VarC = t.this.f23148b.C();
            w5.k.e(i0VarC, "producerFactory.newQuali…edResourceFetchProducer()");
            return t.this.F(i0VarC);
        }
    }

    public t(ContentResolver contentResolver, y1.s sVar, X x6, boolean z6, boolean z7, p0 p0Var, y1.e eVar, boolean z8, boolean z9, boolean z10, L1.d dVar, boolean z11, boolean z12, boolean z13, Set set) {
        w5.k.f(contentResolver, "contentResolver");
        w5.k.f(sVar, "producerFactory");
        w5.k.f(x6, "networkFetcher");
        w5.k.f(p0Var, "threadHandoffProducerQueue");
        w5.k.f(eVar, "downsampleMode");
        w5.k.f(dVar, "imageTranscoderFactory");
        this.f23147a = contentResolver;
        this.f23148b = sVar;
        this.f23149c = x6;
        this.f23150d = z6;
        this.f23151e = z7;
        this.f23152f = p0Var;
        this.f23153g = eVar;
        this.f23154h = z8;
        this.f23155i = z9;
        this.f23156j = z10;
        this.f23157k = dVar;
        this.f23158l = z11;
        this.f23159m = z12;
        this.f23160n = z13;
        this.f23161o = set;
        this.f23162p = new LinkedHashMap();
        this.f23163q = new LinkedHashMap();
        this.f23164r = new LinkedHashMap();
        this.f23165s = i5.g.b(new p());
        this.f23166t = i5.g.b(new j());
        this.f23167u = i5.g.b(new h());
        this.f23168v = i5.g.b(new q());
        this.f23169w = i5.g.b(new d());
        this.f23170x = i5.g.b(new r());
        this.f23171y = i5.g.b(new e());
        this.f23172z = i5.g.b(new k());
        this.f23137A = i5.g.b(new c());
        this.f23138B = i5.g.b(new b());
        this.f23139C = i5.g.b(new l());
        this.f23140D = i5.g.b(new o());
        this.f23141E = i5.g.b(new i());
        this.f23142F = i5.g.b(new n());
        this.f23143G = i5.g.b(new s());
        this.f23144H = i5.g.b(new m());
        this.f23145I = i5.g.b(new g());
        this.f23146J = i5.g.b(new f());
    }

    private final synchronized d0 B(d0 d0Var) {
        d0 d0VarA;
        d0VarA = (d0) this.f23162p.get(d0Var);
        if (d0VarA == null) {
            b0 b0VarB = this.f23148b.B(d0Var);
            w5.k.e(b0VarB, "producerFactory.newPostp…orProducer(inputProducer)");
            d0VarA = this.f23148b.A(b0VarB);
            this.f23162p.put(d0Var, d0VarA);
        }
        return d0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 D(d0 d0Var) {
        C0772i c0772iE = this.f23148b.e(d0Var);
        w5.k.e(c0772iE, "producerFactory.newBitma…heProducer(inputProducer)");
        C0771h c0771hD = this.f23148b.d(c0772iE);
        w5.k.e(c0771hD, "producerFactory.newBitma…itmapMemoryCacheProducer)");
        d0 d0VarB = this.f23148b.b(c0771hD, this.f23152f);
        w5.k.e(d0VarB, "producerFactory.newBackg…readHandoffProducerQueue)");
        if (!this.f23158l && !this.f23159m) {
            C0770g c0770gC = this.f23148b.c(d0VarB);
            w5.k.e(c0770gC, "producerFactory.newBitma…er(threadHandoffProducer)");
            return c0770gC;
        }
        C0770g c0770gC2 = this.f23148b.c(d0VarB);
        w5.k.e(c0770gC2, "producerFactory.newBitma…er(threadHandoffProducer)");
        C0774k c0774kG = this.f23148b.g(c0770gC2);
        w5.k.e(c0774kG, "producerFactory.newBitma…apMemoryCacheGetProducer)");
        return c0774kG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 F(d0 d0Var) {
        LocalExifThumbnailProducer localExifThumbnailProducerT = this.f23148b.t();
        w5.k.e(localExifThumbnailProducerT, "producerFactory.newLocalExifThumbnailProducer()");
        return G(d0Var, new u0[]{localExifThumbnailProducerT});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 G(d0 d0Var, u0[] u0VarArr) {
        return E(L(J(d0Var), u0VarArr));
    }

    private final d0 I(d0 d0Var) {
        y1.s sVar;
        if (!K1.b.d()) {
            if (this.f23155i) {
                d0Var = this.f23148b.z(d0Var);
                w5.k.e(d0Var, "producerFactory.newParti…heProducer(inputProducer)");
            }
            C0786x c0786xM = this.f23148b.m(d0Var);
            w5.k.e(c0786xM, "if (partialImageCachingE…utProducer)\n            }");
            C0784v c0784vL = this.f23148b.l(c0786xM);
            w5.k.e(c0784vL, "producerFactory.newDiskC…ducer(cacheWriteProducer)");
            return c0784vL;
        }
        K1.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.f23155i) {
                d0Var = this.f23148b.z(d0Var);
                w5.k.e(d0Var, "producerFactory.newParti…heProducer(inputProducer)");
                sVar = this.f23148b;
            } else {
                sVar = this.f23148b;
            }
            C0786x c0786xM2 = sVar.m(d0Var);
            w5.k.e(c0786xM2, "if (partialImageCachingE…utProducer)\n            }");
            C0784v c0784vL2 = this.f23148b.l(c0786xM2);
            w5.k.e(c0784vL2, "producerFactory.newDiskC…ducer(cacheWriteProducer)");
            K1.b.b();
            return c0784vL2;
        } catch (Throwable th) {
            K1.b.b();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 J(d0 d0Var) {
        if (this.f23156j) {
            d0Var = I(d0Var);
        }
        d0 d0VarO = this.f23148b.o(d0Var);
        w5.k.e(d0VarO, "producerFactory.newEncodedMemoryCacheProducer(ip)");
        if (!this.f23159m) {
            C0787y c0787yN = this.f23148b.n(d0VarO);
            w5.k.e(c0787yN, "producerFactory.newEncod…codedMemoryCacheProducer)");
            return c0787yN;
        }
        A aP = this.f23148b.p(d0VarO);
        w5.k.e(aP, "producerFactory.newEncod…codedMemoryCacheProducer)");
        C0787y c0787yN2 = this.f23148b.n(aP);
        w5.k.e(c0787yN2, "producerFactory.newEncod…exProducer(probeProducer)");
        return c0787yN2;
    }

    private final d0 K(u0[] u0VarArr) {
        t0 t0VarG = this.f23148b.G(u0VarArr);
        w5.k.e(t0VarG, "producerFactory.newThumb…ducer(thumbnailProducers)");
        k0 k0VarD = this.f23148b.D(t0VarG, true, this.f23157k);
        w5.k.e(k0VarD, "producerFactory.newResiz…, imageTranscoderFactory)");
        return k0VarD;
    }

    private final d0 L(d0 d0Var, u0[] u0VarArr) {
        C0765b c0765bA = y1.s.a(d0Var);
        w5.k.e(c0765bA, "newAddImageTransformMeta…taProducer(inputProducer)");
        k0 k0VarD = this.f23148b.D(c0765bA, true, this.f23157k);
        w5.k.e(k0VarD, "producerFactory.newResiz…, imageTranscoderFactory)");
        r0 r0VarF = this.f23148b.F(k0VarD);
        w5.k.e(r0VarF, "producerFactory.newThrot…ducer(localImageProducer)");
        C0776m c0776mH = y1.s.h(K(u0VarArr), r0VarF);
        w5.k.e(c0776mH, "newBranchOnSeparateImage…lImageThrottlingProducer)");
        return c0776mH;
    }

    private final d0 l(J1.b bVar) {
        d0 d0VarZ;
        if (!K1.b.d()) {
            Uri uriU = bVar.u();
            w5.k.e(uriU, "imageRequest.sourceUri");
            if (uriU == null) {
                throw new IllegalStateException("Uri is null.".toString());
            }
            int iV = bVar.v();
            if (iV == 0) {
                return z();
            }
            switch (iV) {
                case 2:
                    return bVar.h() ? x() : y();
                case 3:
                    return bVar.h() ? x() : v();
                case 4:
                    return bVar.h() ? x() : Q0.a.c(this.f23147a.getType(uriU)) ? y() : t();
                case 5:
                    return s();
                case 6:
                    return w();
                case 7:
                    return o();
                case 8:
                    return C();
                default:
                    Set set = this.f23161o;
                    if (set != null) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            y.a(it.next());
                            throw null;
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f23136K.c(uriU));
            }
        }
        K1.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri uriU2 = bVar.u();
            w5.k.e(uriU2, "imageRequest.sourceUri");
            if (uriU2 == null) {
                throw new IllegalStateException("Uri is null.".toString());
            }
            int iV2 = bVar.v();
            if (iV2 != 0) {
                switch (iV2) {
                    case 2:
                        if (bVar.h()) {
                            d0 d0VarX = x();
                            K1.b.b();
                            return d0VarX;
                        }
                        d0VarZ = y();
                        break;
                    case 3:
                        if (bVar.h()) {
                            d0 d0VarX2 = x();
                            K1.b.b();
                            return d0VarX2;
                        }
                        d0VarZ = v();
                        break;
                    case 4:
                        if (bVar.h()) {
                            d0 d0VarX3 = x();
                            K1.b.b();
                            return d0VarX3;
                        }
                        if (Q0.a.c(this.f23147a.getType(uriU2))) {
                            d0 d0VarY = y();
                            K1.b.b();
                            return d0VarY;
                        }
                        d0VarZ = t();
                        break;
                    case 5:
                        d0VarZ = s();
                        break;
                    case 6:
                        d0VarZ = w();
                        break;
                    case 7:
                        d0VarZ = o();
                        break;
                    case 8:
                        d0VarZ = C();
                        break;
                    default:
                        Set set2 = this.f23161o;
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            if (it2.hasNext()) {
                                y.a(it2.next());
                                throw null;
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f23136K.c(uriU2));
                }
            } else {
                d0VarZ = z();
            }
            K1.b.b();
            return d0VarZ;
        } catch (Throwable th) {
            K1.b.b();
            throw th;
        }
    }

    private final synchronized d0 m(d0 d0Var) {
        d0 d0VarF;
        d0VarF = (d0) this.f23164r.get(d0Var);
        if (d0VarF == null) {
            d0VarF = this.f23148b.f(d0Var);
            this.f23164r.put(d0Var, d0VarF);
        }
        return d0VarF;
    }

    private final synchronized d0 q(d0 d0Var) {
        C0781s c0781sK;
        c0781sK = this.f23148b.k(d0Var);
        w5.k.e(c0781sK, "producerFactory.newDelayProducer(inputProducer)");
        return c0781sK;
    }

    public final d0 A() {
        Object value = this.f23170x.getValue();
        w5.k.e(value, "<get-networkFetchToEncod…oryPrefetchSequence>(...)");
        return (d0) value;
    }

    public final d0 C() {
        return (d0) this.f23143G.getValue();
    }

    public final d0 E(d0 d0Var) {
        w5.k.f(d0Var, "inputProducer");
        if (!K1.b.d()) {
            C0779p c0779pJ = this.f23148b.j(d0Var);
            w5.k.e(c0779pJ, "producerFactory.newDecodeProducer(inputProducer)");
            return D(c0779pJ);
        }
        K1.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C0779p c0779pJ2 = this.f23148b.j(d0Var);
            w5.k.e(c0779pJ2, "producerFactory.newDecodeProducer(inputProducer)");
            return D(c0779pJ2);
        } finally {
            K1.b.b();
        }
    }

    public final synchronized d0 H(X x6) {
        try {
            w5.k.f(x6, "networkFetcher");
            boolean z6 = false;
            if (!K1.b.d()) {
                d0 d0VarY = this.f23148b.y(x6);
                w5.k.e(d0VarY, "producerFactory.newNetwo…hProducer(networkFetcher)");
                C0765b c0765bA = y1.s.a(J(d0VarY));
                w5.k.e(c0765bA, "newAddImageTransformMeta…taProducer(inputProducer)");
                y1.s sVar = this.f23148b;
                if (this.f23150d && this.f23153g != y1.e.NEVER) {
                    z6 = true;
                }
                k0 k0VarD = sVar.D(c0765bA, z6, this.f23157k);
                w5.k.e(k0VarD, "producerFactory.newResiz…  imageTranscoderFactory)");
                w5.k.e(k0VarD, "networkFetchToEncodedMemorySequence");
                return k0VarD;
            }
            K1.b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                d0 d0VarY2 = this.f23148b.y(x6);
                w5.k.e(d0VarY2, "producerFactory.newNetwo…hProducer(networkFetcher)");
                C0765b c0765bA2 = y1.s.a(J(d0VarY2));
                w5.k.e(c0765bA2, "newAddImageTransformMeta…taProducer(inputProducer)");
                y1.s sVar2 = this.f23148b;
                if (this.f23150d && this.f23153g != y1.e.NEVER) {
                    z6 = true;
                }
                k0 k0VarD2 = sVar2.D(c0765bA2, z6, this.f23157k);
                w5.k.e(k0VarD2, "producerFactory.newResiz…  imageTranscoderFactory)");
                w5.k.e(k0VarD2, "networkFetchToEncodedMemorySequence");
                K1.b.b();
                return k0VarD2;
            } catch (Throwable th) {
                K1.b.b();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final d0 i() {
        Object value = this.f23138B.getValue();
        w5.k.e(value, "<get-backgroundLocalCont…ncodeMemorySequence>(...)");
        return (d0) value;
    }

    public final d0 j() {
        Object value = this.f23137A.getValue();
        w5.k.e(value, "<get-backgroundLocalFile…ncodeMemorySequence>(...)");
        return (d0) value;
    }

    public final d0 k() {
        Object value = this.f23169w.getValue();
        w5.k.e(value, "<get-backgroundNetworkFe…codedMemorySequence>(...)");
        return (d0) value;
    }

    public final d0 n() {
        return (d0) this.f23171y.getValue();
    }

    public final d0 o() {
        return (d0) this.f23146J.getValue();
    }

    public final d0 p(J1.b bVar) {
        w5.k.f(bVar, "imageRequest");
        if (!K1.b.d()) {
            d0 d0VarL = l(bVar);
            if (bVar.k() != null) {
                d0VarL = B(d0VarL);
            }
            if (this.f23154h) {
                d0VarL = m(d0VarL);
            }
            return (!this.f23160n || bVar.e() <= 0) ? d0VarL : q(d0VarL);
        }
        K1.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            d0 d0VarL2 = l(bVar);
            if (bVar.k() != null) {
                d0VarL2 = B(d0VarL2);
            }
            if (this.f23154h) {
                d0VarL2 = m(d0VarL2);
            }
            if (this.f23160n && bVar.e() > 0) {
                d0VarL2 = q(d0VarL2);
            }
            K1.b.b();
            return d0VarL2;
        } catch (Throwable th) {
            K1.b.b();
            throw th;
        }
    }

    public final d0 r(J1.b bVar) {
        w5.k.f(bVar, "imageRequest");
        a aVar = f23136K;
        aVar.d(bVar);
        int iV = bVar.v();
        if (iV == 0) {
            return A();
        }
        if (iV == 2 || iV == 3) {
            return u();
        }
        Uri uriU = bVar.u();
        w5.k.e(uriU, "imageRequest.sourceUri");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + aVar.c(uriU));
    }

    public final d0 s() {
        return (d0) this.f23145I.getValue();
    }

    public final d0 t() {
        return (d0) this.f23141E.getValue();
    }

    public final d0 u() {
        Object value = this.f23172z.getValue();
        w5.k.e(value, "<get-localFileFetchToEnc…oryPrefetchSequence>(...)");
        return (d0) value;
    }

    public final d0 v() {
        return (d0) this.f23139C.getValue();
    }

    public final d0 w() {
        return (d0) this.f23144H.getValue();
    }

    public final d0 x() {
        return (d0) this.f23142F.getValue();
    }

    public final d0 y() {
        return (d0) this.f23140D.getValue();
    }

    public final d0 z() {
        return (d0) this.f23168v.getValue();
    }
}
