package N3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f2225a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f2226b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f2227c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f2228d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f2229e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f2230f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f2231g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f2232h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f2233i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f2234j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f2235k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2236l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f2237a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i7);

        void b(m mVar, Matrix matrix, int i7);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f2238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f2239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f2240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f2241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f2242e;

        c(k kVar, float f7, RectF rectF, b bVar, Path path) {
            this.f2241d = bVar;
            this.f2238a = kVar;
            this.f2242e = f7;
            this.f2240c = rectF;
            this.f2239b = path;
        }
    }

    public l() {
        for (int i7 = 0; i7 < 4; i7++) {
            this.f2225a[i7] = new m();
            this.f2226b[i7] = new Matrix();
            this.f2227c[i7] = new Matrix();
        }
    }

    private float a(int i7) {
        return (i7 + 1) * 90;
    }

    private void b(c cVar, int i7) {
        this.f2232h[0] = this.f2225a[i7].k();
        this.f2232h[1] = this.f2225a[i7].l();
        this.f2226b[i7].mapPoints(this.f2232h);
        Path path = cVar.f2239b;
        float[] fArr = this.f2232h;
        if (i7 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f2225a[i7].d(this.f2226b[i7], cVar.f2239b);
        b bVar = cVar.f2241d;
        if (bVar != null) {
            bVar.a(this.f2225a[i7], this.f2226b[i7], i7);
        }
    }

    private void c(c cVar, int i7) {
        m mVar;
        Matrix matrix;
        Path path;
        int i8 = (i7 + 1) % 4;
        this.f2232h[0] = this.f2225a[i7].i();
        this.f2232h[1] = this.f2225a[i7].j();
        this.f2226b[i7].mapPoints(this.f2232h);
        this.f2233i[0] = this.f2225a[i8].k();
        this.f2233i[1] = this.f2225a[i8].l();
        this.f2226b[i8].mapPoints(this.f2233i);
        float f7 = this.f2232h[0];
        float[] fArr = this.f2233i;
        float fMax = Math.max(((float) Math.hypot(f7 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f2240c, i7);
        this.f2231g.n(0.0f, 0.0f);
        f fVarJ = j(i7, cVar.f2238a);
        fVarJ.b(fMax, fI, cVar.f2242e, this.f2231g);
        this.f2234j.reset();
        this.f2231g.d(this.f2227c[i7], this.f2234j);
        if (this.f2236l && (fVarJ.a() || l(this.f2234j, i7) || l(this.f2234j, i8))) {
            Path path2 = this.f2234j;
            path2.op(path2, this.f2230f, Path.Op.DIFFERENCE);
            this.f2232h[0] = this.f2231g.k();
            this.f2232h[1] = this.f2231g.l();
            this.f2227c[i7].mapPoints(this.f2232h);
            Path path3 = this.f2229e;
            float[] fArr2 = this.f2232h;
            path3.moveTo(fArr2[0], fArr2[1]);
            mVar = this.f2231g;
            matrix = this.f2227c[i7];
            path = this.f2229e;
        } else {
            mVar = this.f2231g;
            matrix = this.f2227c[i7];
            path = cVar.f2239b;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f2241d;
        if (bVar != null) {
            bVar.b(this.f2231g, this.f2227c[i7], i7);
        }
    }

    private void f(int i7, RectF rectF, PointF pointF) {
        float f7;
        float f8;
        if (i7 == 1) {
            f7 = rectF.right;
        } else {
            if (i7 != 2) {
                f7 = i7 != 3 ? rectF.right : rectF.left;
                f8 = rectF.top;
                pointF.set(f7, f8);
            }
            f7 = rectF.left;
        }
        f8 = rectF.bottom;
        pointF.set(f7, f8);
    }

    private N3.c g(int i7, k kVar) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i7, k kVar) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i7) {
        float fCenterX;
        float f7;
        float[] fArr = this.f2232h;
        m mVar = this.f2225a[i7];
        fArr[0] = mVar.f2245c;
        fArr[1] = mVar.f2246d;
        this.f2226b[i7].mapPoints(fArr);
        if (i7 == 1 || i7 == 3) {
            fCenterX = rectF.centerX();
            f7 = this.f2232h[0];
        } else {
            fCenterX = rectF.centerY();
            f7 = this.f2232h[1];
        }
        return Math.abs(fCenterX - f7);
    }

    private f j(int i7, k kVar) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f2237a;
    }

    private boolean l(Path path, int i7) {
        this.f2235k.reset();
        this.f2225a[i7].d(this.f2226b[i7], this.f2235k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f2235k.computeBounds(rectF, true);
        path.op(this.f2235k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i7) {
        h(i7, cVar.f2238a).b(this.f2225a[i7], 90.0f, cVar.f2242e, cVar.f2240c, g(i7, cVar.f2238a));
        float fA = a(i7);
        this.f2226b[i7].reset();
        f(i7, cVar.f2240c, this.f2228d);
        Matrix matrix = this.f2226b[i7];
        PointF pointF = this.f2228d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2226b[i7].preRotate(fA);
    }

    private void n(int i7) {
        this.f2232h[0] = this.f2225a[i7].i();
        this.f2232h[1] = this.f2225a[i7].j();
        this.f2226b[i7].mapPoints(this.f2232h);
        float fA = a(i7);
        this.f2227c[i7].reset();
        Matrix matrix = this.f2227c[i7];
        float[] fArr = this.f2232h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f2227c[i7].preRotate(fA);
    }

    public void d(k kVar, float f7, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f2229e.rewind();
        this.f2230f.rewind();
        this.f2230f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f7, rectF, bVar, path);
        for (int i7 = 0; i7 < 4; i7++) {
            m(cVar, i7);
            n(i7);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            b(cVar, i8);
            c(cVar, i8);
        }
        path.close();
        this.f2229e.close();
        if (this.f2229e.isEmpty()) {
            return;
        }
        path.op(this.f2229e, Path.Op.UNION);
    }

    public void e(k kVar, float f7, RectF rectF, Path path) {
        d(kVar, f7, rectF, null, path);
    }
}
