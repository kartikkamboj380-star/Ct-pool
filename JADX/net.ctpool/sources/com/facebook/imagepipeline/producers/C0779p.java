package com.facebook.imagepipeline.producers;

import J1.b;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.imagepipeline.producers.C0779p;
import com.facebook.imagepipeline.producers.G;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s1.C2037b;
import s1.C2038c;
import x1.C2212c;
import x1.C2215f;
import x1.C2216g;
import y1.C2238a;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0779p implements d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f10958m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R0.a f10959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f10960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B1.c f10961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B1.e f10962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y1.e f10963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f10964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f10965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f10966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f10967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2238a f10968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f10969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final O0.o f10970l;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(D1.g gVar, C2212c c2212c) {
            return (((long) gVar.getWidth()) * ((long) gVar.getHeight())) * ((long) N1.b.e(c2212c.f22801h)) > 104857600;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$b */
    private final class b extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ C0779p f10971k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0779p c0779p, InterfaceC0777n interfaceC0777n, e0 e0Var, boolean z6, int i7) {
            super(c0779p, interfaceC0777n, e0Var, z6, i7);
            w5.k.f(interfaceC0777n, "consumer");
            w5.k.f(e0Var, "producerContext");
            this.f10971k = c0779p;
        }

        @Override // com.facebook.imagepipeline.producers.C0779p.d
        protected synchronized boolean J(D1.g gVar, int i7) {
            return AbstractC0766c.f(i7) ? false : super.J(gVar, i7);
        }

        @Override // com.facebook.imagepipeline.producers.C0779p.d
        protected int x(D1.g gVar) {
            w5.k.f(gVar, "encodedImage");
            return gVar.B();
        }

        @Override // com.facebook.imagepipeline.producers.C0779p.d
        protected D1.l z() {
            D1.l lVarD = D1.k.d(0, false, false);
            w5.k.e(lVarD, "of(0, false, false)");
            return lVarD;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$c */
    private final class c extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final B1.f f10972k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final B1.e f10973l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C0779p f10974m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0779p c0779p, InterfaceC0777n interfaceC0777n, e0 e0Var, B1.f fVar, B1.e eVar, boolean z6, int i7) {
            super(c0779p, interfaceC0777n, e0Var, z6, i7);
            w5.k.f(interfaceC0777n, "consumer");
            w5.k.f(e0Var, "producerContext");
            w5.k.f(fVar, "progressiveJpegParser");
            w5.k.f(eVar, "progressiveJpegConfig");
            this.f10974m = c0779p;
            this.f10972k = fVar;
            this.f10973l = eVar;
            I(0);
        }

        @Override // com.facebook.imagepipeline.producers.C0779p.d
        protected synchronized boolean J(D1.g gVar, int i7) {
            if (gVar == null) {
                return false;
            }
            try {
                boolean zJ = super.J(gVar, i7);
                if (AbstractC0766c.f(i7) || AbstractC0766c.n(i7, 8)) {
                    if (!AbstractC0766c.n(i7, 4) && D1.g.j0(gVar) && gVar.n() == C2037b.f22237b) {
                        if (!this.f10972k.g(gVar)) {
                            return false;
                        }
                        int iD = this.f10972k.d();
                        if (iD <= y()) {
                            return false;
                        }
                        if (iD < this.f10973l.b(y()) && !this.f10972k.e()) {
                            return false;
                        }
                        I(iD);
                    }
                }
                return zJ;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C0779p.d
        protected int x(D1.g gVar) {
            w5.k.f(gVar, "encodedImage");
            return this.f10972k.c();
        }

        @Override // com.facebook.imagepipeline.producers.C0779p.d
        protected D1.l z() {
            D1.l lVarA = this.f10973l.a(this.f10972k.d());
            w5.k.e(lVarA, "progressiveJpegConfig.ge…pegParser.bestScanNumber)");
            return lVarA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$d */
    abstract class d extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f10975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g0 f10977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C2212c f10978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f10979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final G f10980h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10981i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C0779p f10982j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$d$a */
        public static final class a extends AbstractC0769f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f10984b;

            a(boolean z6) {
                this.f10984b = z6;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                if (this.f10984b) {
                    d.this.A();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0769f, com.facebook.imagepipeline.producers.f0
            public void b() {
                if (d.this.f10975c.J()) {
                    d.this.f10980h.h();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final C0779p c0779p, InterfaceC0777n interfaceC0777n, e0 e0Var, boolean z6, final int i7) {
            super(interfaceC0777n);
            w5.k.f(interfaceC0777n, "consumer");
            w5.k.f(e0Var, "producerContext");
            this.f10982j = c0779p;
            this.f10975c = e0Var;
            this.f10976d = "ProgressiveDecoder";
            this.f10977e = e0Var.B();
            C2212c c2212cG = e0Var.d().g();
            w5.k.e(c2212cG, "producerContext.imageRequest.imageDecodeOptions");
            this.f10978f = c2212cG;
            this.f10980h = new G(c0779p.f(), new G.d() { // from class: com.facebook.imagepipeline.producers.q
                @Override // com.facebook.imagepipeline.producers.G.d
                public final void a(D1.g gVar, int i8) throws Throwable {
                    C0779p.d.r(this.f10985a, c0779p, i7, gVar, i8);
                }
            }, c2212cG.f22794a);
            e0Var.e(new a(z6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A() {
            E(true);
            p().b();
        }

        private final void B(Throwable th) {
            E(true);
            p().a(th);
        }

        private final void C(D1.d dVar, int i7) {
            S0.a aVarB = this.f10982j.c().b(dVar);
            try {
                E(AbstractC0766c.e(i7));
                p().d(aVarB, i7);
            } finally {
                S0.a.g(aVarB);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final D1.d D(D1.g gVar, int i7, D1.l lVar) {
            boolean z6;
            if (this.f10982j.h() != null) {
                Object obj = this.f10982j.i().get();
                w5.k.e(obj, "recoverFromDecoderOOM.get()");
                z6 = ((Boolean) obj).booleanValue();
            }
            try {
                return this.f10982j.g().a(gVar, i7, lVar, this.f10978f);
            } catch (OutOfMemoryError e7) {
                if (!z6) {
                    throw e7;
                }
                Runnable runnableH = this.f10982j.h();
                if (runnableH != null) {
                    runnableH.run();
                }
                System.gc();
                return this.f10982j.g().a(gVar, i7, lVar, this.f10978f);
            }
        }

        private final void E(boolean z6) {
            synchronized (this) {
                if (z6) {
                    if (!this.f10979g) {
                        p().c(1.0f);
                        this.f10979g = true;
                        i5.u uVar = i5.u.f19985a;
                        this.f10980h.c();
                    }
                }
            }
        }

        private final void F(D1.g gVar) {
            if (gVar.n() != C2037b.f22237b) {
                return;
            }
            gVar.h1(L1.a.c(gVar, N1.b.e(this.f10978f.f22801h), 104857600));
        }

        private final void H(D1.g gVar, D1.d dVar, int i7) {
            this.f10975c.w("encoded_width", Integer.valueOf(gVar.getWidth()));
            this.f10975c.w("encoded_height", Integer.valueOf(gVar.getHeight()));
            this.f10975c.w("encoded_size", Integer.valueOf(gVar.B()));
            this.f10975c.w("image_color_space", gVar.j());
            if (dVar instanceof D1.c) {
                this.f10975c.w("bitmap_config", String.valueOf(((D1.c) dVar).z0().getConfig()));
            }
            if (dVar != null) {
                dVar.j(this.f10975c.getExtras());
            }
            this.f10975c.w("last_scan_num", Integer.valueOf(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(d dVar, C0779p c0779p, int i7, D1.g gVar, int i8) throws Throwable {
            w5.k.f(dVar, "this$0");
            w5.k.f(c0779p, "this$1");
            if (gVar != null) {
                J1.b bVarD = dVar.f10975c.d();
                dVar.f10975c.w("image_format", gVar.n().a());
                Uri uriU = bVarD.u();
                gVar.i1(uriU != null ? uriU.toString() : null);
                boolean zN = AbstractC0766c.n(i8, 16);
                if ((c0779p.e() == y1.e.ALWAYS || (c0779p.e() == y1.e.AUTO && !zN)) && (c0779p.d() || !W0.f.n(bVarD.u()))) {
                    C2216g c2216gS = bVarD.s();
                    w5.k.e(c2216gS, "request.rotationOptions");
                    gVar.h1(L1.a.b(c2216gS, bVarD.q(), gVar, i7));
                }
                if (dVar.f10975c.f().G().h()) {
                    dVar.F(gVar);
                }
                dVar.v(gVar, i8, dVar.f10981i);
            }
        }

        private final void v(D1.g gVar, int i7, int i8) throws Throwable {
            String str;
            String str2;
            D1.d dVar;
            String strA;
            int i9 = i7;
            if (gVar.n() != C2037b.f22237b && AbstractC0766c.f(i7)) {
                return;
            }
            if (this.f10979g || !D1.g.j0(gVar)) {
                return;
            }
            if (w5.k.b(gVar.n(), C2037b.f22239d) && C0779p.f10958m.b(gVar, this.f10978f)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + gVar.getWidth() + ", h = " + gVar.getHeight() + ", pixel config = " + this.f10978f.f22801h + ", max bitmap size = 104857600");
                this.f10977e.k(this.f10975c, "DecodeProducer", illegalStateException, null);
                B(illegalStateException);
                return;
            }
            C2038c c2038cN = gVar.n();
            String str3 = (c2038cN == null || (strA = c2038cN.a()) == null) ? "unknown" : strA;
            String str4 = gVar.getWidth() + "x" + gVar.getHeight();
            String strValueOf = String.valueOf(gVar.z());
            boolean zE = AbstractC0766c.e(i7);
            boolean z6 = zE && !AbstractC0766c.n(i9, 8);
            boolean zN = AbstractC0766c.n(i9, 4);
            C2215f c2215fQ = this.f10975c.d().q();
            if (c2215fQ != null) {
                str = c2215fQ.f22824a + "x" + c2215fQ.f22825b;
            } else {
                str = "unknown";
            }
            try {
                long jF = this.f10980h.f();
                String string = this.f10975c.d().u().toString();
                w5.k.e(string, "producerContext.imageRequest.sourceUri.toString()");
                int iB = (z6 || zN) ? gVar.B() : x(gVar);
                D1.l lVarZ = (z6 || zN) ? D1.k.f996d : z();
                try {
                    this.f10977e.e(this.f10975c, "DecodeProducer");
                    try {
                        try {
                            w5.k.e(lVarZ, "quality");
                            D1.d dVarD = D(gVar, iB, lVarZ);
                            try {
                                if (gVar.z() != 1) {
                                    i9 |= 16;
                                }
                                this.f10977e.j(this.f10975c, "DecodeProducer", w(dVarD, jF, lVarZ, zE, str3, str4, str, strValueOf));
                                H(gVar, dVarD, i8);
                                C(dVarD, i9);
                                D1.g.d(gVar);
                            } catch (Exception e7) {
                                e = e7;
                                str2 = "DecodeProducer";
                                dVar = dVarD;
                                w5.k.e(lVarZ, "quality");
                                try {
                                    this.f10977e.k(this.f10975c, str2, e, w(dVar, jF, lVarZ, zE, str3, str4, str, strValueOf));
                                    B(e);
                                    D1.g.d(gVar);
                                } catch (Throwable th) {
                                    th = th;
                                    D1.g.d(gVar);
                                    throw th;
                                }
                            }
                        } catch (B1.a e8) {
                            D1.g gVarA = e8.a();
                            str2 = "DecodeProducer";
                            try {
                                P0.a.I(this.f10976d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e8.getMessage(), string, gVarA.l(10), Integer.valueOf(gVarA.B()));
                                throw e8;
                            } catch (Exception e9) {
                                e = e9;
                                dVar = null;
                                w5.k.e(lVarZ, "quality");
                                this.f10977e.k(this.f10975c, str2, e, w(dVar, jF, lVarZ, zE, str3, str4, str, strValueOf));
                                B(e);
                                D1.g.d(gVar);
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str2 = "DecodeProducer";
                        dVar = null;
                        w5.k.e(lVarZ, "quality");
                        this.f10977e.k(this.f10975c, str2, e, w(dVar, jF, lVarZ, zE, str3, str4, str, strValueOf));
                        B(e);
                        D1.g.d(gVar);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final Map w(D1.d dVar, long j7, D1.l lVar, boolean z6, String str, String str2, String str3, String str4) {
            Map extras;
            Object obj;
            String string = null;
            if (!this.f10977e.g(this.f10975c, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j7);
            String strValueOf2 = String.valueOf(lVar.b());
            String strValueOf3 = String.valueOf(z6);
            if (dVar != null && (extras = dVar.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            String str5 = string;
            if (!(dVar instanceof D1.e)) {
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                if (str5 != null) {
                    map.put("non_fatal_decode_error", str5);
                }
                return O0.g.a(map);
            }
            Bitmap bitmapZ0 = ((D1.e) dVar).z0();
            w5.k.e(bitmapZ0, "image.underlyingBitmap");
            String str6 = bitmapZ0.getWidth() + "x" + bitmapZ0.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str6);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            int byteCount = bitmapZ0.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str5 != null) {
                map2.put("non_fatal_decode_error", str5);
            }
            return O0.g.a(map2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            W0.a aVar;
            if (!K1.b.d()) {
                boolean zE = AbstractC0766c.e(i7);
                if (zE) {
                    if (gVar == null) {
                        boolean zB = w5.k.b(this.f10975c.n("cached_value_found"), Boolean.TRUE);
                        if (!this.f10975c.f().G().g() || this.f10975c.U() == b.c.FULL_FETCH || zB) {
                            aVar = new W0.a("Encoded image is null.");
                            B(aVar);
                            return;
                        }
                    } else if (!gVar.h0()) {
                        aVar = new W0.a("Encoded image is not valid.");
                        B(aVar);
                        return;
                    }
                }
                if (J(gVar, i7)) {
                    boolean zN = AbstractC0766c.n(i7, 4);
                    if (zE || zN || this.f10975c.J()) {
                        this.f10980h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            K1.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean zE2 = AbstractC0766c.e(i7);
                if (zE2) {
                    if (gVar == null) {
                        boolean zB2 = w5.k.b(this.f10975c.n("cached_value_found"), Boolean.TRUE);
                        if (this.f10975c.f().G().g()) {
                            if (this.f10975c.U() != b.c.FULL_FETCH) {
                                if (zB2) {
                                }
                            }
                        }
                        B(new W0.a("Encoded image is null."));
                        K1.b.b();
                        return;
                    }
                    if (!gVar.h0()) {
                        B(new W0.a("Encoded image is not valid."));
                        K1.b.b();
                        return;
                    }
                }
                if (!J(gVar, i7)) {
                    K1.b.b();
                    return;
                }
                boolean zN2 = AbstractC0766c.n(i7, 4);
                if (zE2 || zN2 || this.f10975c.J()) {
                    this.f10980h.h();
                }
                i5.u uVar = i5.u.f19985a;
                K1.b.b();
            } catch (Throwable th) {
                K1.b.b();
                throw th;
            }
        }

        protected final void I(int i7) {
            this.f10981i = i7;
        }

        protected boolean J(D1.g gVar, int i7) {
            return this.f10980h.k(gVar, i7);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        public void g() {
            A();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        public void h(Throwable th) {
            w5.k.f(th, "t");
            B(th);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        protected void j(float f7) {
            super.j(f7 * 0.99f);
        }

        protected abstract int x(D1.g gVar);

        protected final int y() {
            return this.f10981i;
        }

        protected abstract D1.l z();
    }

    public C0779p(R0.a aVar, Executor executor, B1.c cVar, B1.e eVar, y1.e eVar2, boolean z6, boolean z7, d0 d0Var, int i7, C2238a c2238a, Runnable runnable, O0.o oVar) {
        w5.k.f(aVar, "byteArrayPool");
        w5.k.f(executor, "executor");
        w5.k.f(cVar, "imageDecoder");
        w5.k.f(eVar, "progressiveJpegConfig");
        w5.k.f(eVar2, "downsampleMode");
        w5.k.f(d0Var, "inputProducer");
        w5.k.f(c2238a, "closeableReferenceFactory");
        w5.k.f(oVar, "recoverFromDecoderOOM");
        this.f10959a = aVar;
        this.f10960b = executor;
        this.f10961c = cVar;
        this.f10962d = eVar;
        this.f10963e = eVar2;
        this.f10964f = z6;
        this.f10965g = z7;
        this.f10966h = d0Var;
        this.f10967i = i7;
        this.f10968j = c2238a;
        this.f10969k = runnable;
        this.f10970l = oVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        w5.k.f(interfaceC0777n, "consumer");
        w5.k.f(e0Var, "context");
        if (!K1.b.d()) {
            J1.b bVarD = e0Var.d();
            this.f10966h.a((W0.f.n(bVarD.u()) || J1.c.r(bVarD.u())) ? new c(this, interfaceC0777n, e0Var, new B1.f(this.f10959a), this.f10962d, this.f10965g, this.f10967i) : new b(this, interfaceC0777n, e0Var, this.f10965g, this.f10967i), e0Var);
            return;
        }
        K1.b.a("DecodeProducer#produceResults");
        try {
            J1.b bVarD2 = e0Var.d();
            this.f10966h.a((W0.f.n(bVarD2.u()) || J1.c.r(bVarD2.u())) ? new c(this, interfaceC0777n, e0Var, new B1.f(this.f10959a), this.f10962d, this.f10965g, this.f10967i) : new b(this, interfaceC0777n, e0Var, this.f10965g, this.f10967i), e0Var);
            i5.u uVar = i5.u.f19985a;
            K1.b.b();
        } catch (Throwable th) {
            K1.b.b();
            throw th;
        }
    }

    public final C2238a c() {
        return this.f10968j;
    }

    public final boolean d() {
        return this.f10964f;
    }

    public final y1.e e() {
        return this.f10963e;
    }

    public final Executor f() {
        return this.f10960b;
    }

    public final B1.c g() {
        return this.f10961c;
    }

    public final Runnable h() {
        return this.f10969k;
    }

    public final O0.o i() {
        return this.f10970l;
    }
}
