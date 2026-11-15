package N3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f2249g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f2250h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2251i;

    class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f2252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f2253c;

        a(List list, Matrix matrix) {
            this.f2252b = list;
            this.f2253c = matrix;
        }

        @Override // N3.m.g
        public void b(Matrix matrix, M3.a aVar, int i7, Canvas canvas) {
            Iterator it = this.f2252b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f2253c, aVar, i7, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f2255b;

        public b(d dVar) {
            this.f2255b = dVar;
        }

        @Override // N3.m.g
        public void b(Matrix matrix, M3.a aVar, int i7, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f2255b.k(), this.f2255b.o(), this.f2255b.l(), this.f2255b.j()), i7, this.f2255b.m(), this.f2255b.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f2256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f2257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f2258d;

        public c(e eVar, float f7, float f8) {
            this.f2256b = eVar;
            this.f2257c = f7;
            this.f2258d = f8;
        }

        @Override // N3.m.g
        public void b(Matrix matrix, M3.a aVar, int i7, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f2256b.f2267c - this.f2258d, this.f2256b.f2266b - this.f2257c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f2257c, this.f2258d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i7);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f2256b.f2267c - this.f2258d) / (this.f2256b.f2266b - this.f2257c)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f2259h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2265g;

        public d(float f7, float f8, float f9, float f10) {
            q(f7);
            u(f8);
            r(f9);
            p(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f2263e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f2260b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f2262d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f2264f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f2265g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f2261c;
        }

        private void p(float f7) {
            this.f2263e = f7;
        }

        private void q(float f7) {
            this.f2260b = f7;
        }

        private void r(float f7) {
            this.f2262d = f7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f7) {
            this.f2264f = f7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f7) {
            this.f2265g = f7;
        }

        private void u(float f7) {
            this.f2261c = f7;
        }

        @Override // N3.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2268a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f2259h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f2266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f2267c;

        @Override // N3.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2268a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2266b, this.f2267c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f2268a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Matrix f2269a = new Matrix();

        g() {
        }

        public final void a(M3.a aVar, int i7, Canvas canvas) {
            b(f2269a, aVar, i7, canvas);
        }

        public abstract void b(Matrix matrix, M3.a aVar, int i7, Canvas canvas);
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f7) {
        if (g() == f7) {
            return;
        }
        float fG = ((f7 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f2250h.add(new b(dVar));
        p(f7);
    }

    private void c(g gVar, float f7, float f8) {
        b(f7);
        this.f2250h.add(gVar);
        p(f8);
    }

    private float g() {
        return this.f2247e;
    }

    private float h() {
        return this.f2248f;
    }

    private void p(float f7) {
        this.f2247e = f7;
    }

    private void q(float f7) {
        this.f2248f = f7;
    }

    private void r(float f7) {
        this.f2245c = f7;
    }

    private void s(float f7) {
        this.f2246d = f7;
    }

    private void t(float f7) {
        this.f2243a = f7;
    }

    private void u(float f7) {
        this.f2244b = f7;
    }

    public void a(float f7, float f8, float f9, float f10, float f11, float f12) {
        d dVar = new d(f7, f8, f9, f10);
        dVar.s(f11);
        dVar.t(f12);
        this.f2249g.add(dVar);
        b bVar = new b(dVar);
        float f13 = f11 + f12;
        boolean z6 = f12 < 0.0f;
        if (z6) {
            f11 = (f11 + 180.0f) % 360.0f;
        }
        c(bVar, f11, z6 ? (180.0f + f13) % 360.0f : f13);
        double d7 = f13;
        r(((f7 + f9) * 0.5f) + (((f9 - f7) / 2.0f) * ((float) Math.cos(Math.toRadians(d7)))));
        s(((f8 + f10) * 0.5f) + (((f10 - f8) / 2.0f) * ((float) Math.sin(Math.toRadians(d7)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f2249g.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((f) this.f2249g.get(i7)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f2251i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f2250h), new Matrix(matrix));
    }

    float i() {
        return this.f2245c;
    }

    float j() {
        return this.f2246d;
    }

    float k() {
        return this.f2243a;
    }

    float l() {
        return this.f2244b;
    }

    public void m(float f7, float f8) {
        e eVar = new e();
        eVar.f2266b = f7;
        eVar.f2267c = f8;
        this.f2249g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f7);
        s(f8);
    }

    public void n(float f7, float f8) {
        o(f7, f8, 270.0f, 0.0f);
    }

    public void o(float f7, float f8, float f9, float f10) {
        t(f7);
        u(f8);
        r(f7);
        s(f8);
        p(f9);
        q((f9 + f10) % 360.0f);
        this.f2249g.clear();
        this.f2250h.clear();
        this.f2251i = false;
    }
}
