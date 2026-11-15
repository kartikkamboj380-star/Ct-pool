package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Interpolator f9095s = new LinearInterpolator();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Interpolator f9096t = new M.b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f9097u = {-16777216};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c f9098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f9099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Resources f9100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Animator f9101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f9102q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f9103r;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f9104a;

        a(c cVar) {
            this.f9104a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f9104a);
            b.this.b(fFloatValue, this.f9104a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0176b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f9106a;

        C0176b(c cVar) {
            this.f9106a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f9106a, true);
            this.f9106a.A();
            this.f9106a.l();
            b bVar = b.this;
            if (!bVar.f9103r) {
                bVar.f9102q += 1.0f;
                return;
            }
            bVar.f9103r = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f9106a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f9102q = 0.0f;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f9108a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f9109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f9110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f9111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f9112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f9113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f9114g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f9115h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f9116i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f9117j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f9118k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f9119l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f9120m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f9121n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f9122o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f9123p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f9124q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f9125r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f9126s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f9127t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f9128u;

        c() {
            Paint paint = new Paint();
            this.f9109b = paint;
            Paint paint2 = new Paint();
            this.f9110c = paint2;
            Paint paint3 = new Paint();
            this.f9111d = paint3;
            this.f9112e = 0.0f;
            this.f9113f = 0.0f;
            this.f9114g = 0.0f;
            this.f9115h = 5.0f;
            this.f9123p = 1.0f;
            this.f9127t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f9118k = this.f9112e;
            this.f9119l = this.f9113f;
            this.f9120m = this.f9114g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f9108a;
            float f7 = this.f9124q;
            float fMin = (this.f9115h / 2.0f) + f7;
            if (f7 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f9125r * this.f9123p) / 2.0f, this.f9115h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f8 = this.f9112e;
            float f9 = this.f9114g;
            float f10 = (f8 + f9) * 360.0f;
            float f11 = ((this.f9113f + f9) * 360.0f) - f10;
            this.f9109b.setColor(this.f9128u);
            this.f9109b.setAlpha(this.f9127t);
            float f12 = this.f9115h / 2.0f;
            rectF.inset(f12, f12);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f9111d);
            float f13 = -f12;
            rectF.inset(f13, f13);
            canvas.drawArc(rectF, f10, f11, false, this.f9109b);
            b(canvas, f10, f11, rectF);
        }

        void b(Canvas canvas, float f7, float f8, RectF rectF) {
            if (this.f9121n) {
                Path path = this.f9122o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f9122o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f9 = (this.f9125r * this.f9123p) / 2.0f;
                this.f9122o.moveTo(0.0f, 0.0f);
                this.f9122o.lineTo(this.f9125r * this.f9123p, 0.0f);
                Path path3 = this.f9122o;
                float f10 = this.f9125r;
                float f11 = this.f9123p;
                path3.lineTo((f10 * f11) / 2.0f, this.f9126s * f11);
                this.f9122o.offset((fMin + rectF.centerX()) - f9, rectF.centerY() + (this.f9115h / 2.0f));
                this.f9122o.close();
                this.f9110c.setColor(this.f9128u);
                this.f9110c.setAlpha(this.f9127t);
                canvas.save();
                canvas.rotate(f7 + f8, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f9122o, this.f9110c);
                canvas.restore();
            }
        }

        int c() {
            return this.f9127t;
        }

        float d() {
            return this.f9113f;
        }

        int e() {
            return this.f9116i[f()];
        }

        int f() {
            return (this.f9117j + 1) % this.f9116i.length;
        }

        float g() {
            return this.f9112e;
        }

        int h() {
            return this.f9116i[this.f9117j];
        }

        float i() {
            return this.f9119l;
        }

        float j() {
            return this.f9120m;
        }

        float k() {
            return this.f9118k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f9118k = 0.0f;
            this.f9119l = 0.0f;
            this.f9120m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i7) {
            this.f9127t = i7;
        }

        void o(float f7, float f8) {
            this.f9125r = (int) f7;
            this.f9126s = (int) f8;
        }

        void p(float f7) {
            if (f7 != this.f9123p) {
                this.f9123p = f7;
            }
        }

        void q(float f7) {
            this.f9124q = f7;
        }

        void r(int i7) {
            this.f9128u = i7;
        }

        void s(ColorFilter colorFilter) {
            this.f9109b.setColorFilter(colorFilter);
        }

        void t(int i7) {
            this.f9117j = i7;
            this.f9128u = this.f9116i[i7];
        }

        void u(int[] iArr) {
            this.f9116i = iArr;
            t(0);
        }

        void v(float f7) {
            this.f9113f = f7;
        }

        void w(float f7) {
            this.f9114g = f7;
        }

        void x(boolean z6) {
            if (this.f9121n != z6) {
                this.f9121n = z6;
            }
        }

        void y(float f7) {
            this.f9112e = f7;
        }

        void z(float f7) {
            this.f9115h = f7;
            this.f9109b.setStrokeWidth(f7);
        }
    }

    public b(Context context) {
        this.f9100o = ((Context) f.f(context)).getResources();
        c cVar = new c();
        this.f9098m = cVar;
        cVar.u(f9097u);
        k(2.5f);
        m();
    }

    private void a(float f7, c cVar) {
        n(f7, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f7));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f7));
    }

    private int c(float f7, int i7, int i8) {
        return ((((i7 >> 24) & 255) + ((int) ((((i8 >> 24) & 255) - r0) * f7))) << 24) | ((((i7 >> 16) & 255) + ((int) ((((i8 >> 16) & 255) - r1) * f7))) << 16) | ((((i7 >> 8) & 255) + ((int) ((((i8 >> 8) & 255) - r2) * f7))) << 8) | ((i7 & 255) + ((int) (f7 * ((i8 & 255) - r8))));
    }

    private void h(float f7) {
        this.f9099n = f7;
    }

    private void i(float f7, float f8, float f9, float f10) {
        c cVar = this.f9098m;
        float f11 = this.f9100o.getDisplayMetrics().density;
        cVar.z(f8 * f11);
        cVar.q(f7 * f11);
        cVar.t(0);
        cVar.o(f9 * f11, f10 * f11);
    }

    private void m() {
        c cVar = this.f9098m;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f9095s);
        valueAnimatorOfFloat.addListener(new C0176b(cVar));
        this.f9101p = valueAnimatorOfFloat;
    }

    void b(float f7, c cVar, boolean z6) {
        float interpolation;
        float interpolation2;
        if (this.f9103r) {
            a(f7, cVar);
            return;
        }
        if (f7 != 1.0f || z6) {
            float fJ = cVar.j();
            if (f7 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f9096t.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f9096t.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f8 = fJ + (0.20999998f * f7);
            float f9 = (f7 + this.f9102q) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f8);
            h(f9);
        }
    }

    public void d(boolean z6) {
        this.f9098m.x(z6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f9099n, bounds.exactCenterX(), bounds.exactCenterY());
        this.f9098m.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f7) {
        this.f9098m.p(f7);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f9098m.u(iArr);
        this.f9098m.t(0);
        invalidateSelf();
    }

    public void g(float f7) {
        this.f9098m.w(f7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9098m.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f9101p.isRunning();
    }

    public void j(float f7, float f8) {
        this.f9098m.y(f7);
        this.f9098m.v(f8);
        invalidateSelf();
    }

    public void k(float f7) {
        this.f9098m.z(f7);
        invalidateSelf();
    }

    public void l(int i7) {
        float f7;
        float f8;
        float f9;
        float f10;
        if (i7 == 0) {
            f7 = 12.0f;
            f8 = 6.0f;
            f9 = 11.0f;
            f10 = 3.0f;
        } else {
            f7 = 10.0f;
            f8 = 5.0f;
            f9 = 7.5f;
            f10 = 2.5f;
        }
        i(f9, f10, f7, f8);
        invalidateSelf();
    }

    void n(float f7, c cVar) {
        cVar.r(f7 > 0.75f ? c((f7 - 0.75f) / 0.25f, cVar.h(), cVar.e()) : cVar.h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f9098m.n(i7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9098m.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j7;
        this.f9101p.cancel();
        this.f9098m.A();
        if (this.f9098m.d() != this.f9098m.g()) {
            this.f9103r = true;
            animator = this.f9101p;
            j7 = 666;
        } else {
            this.f9098m.t(0);
            this.f9098m.m();
            animator = this.f9101p;
            j7 = 1332;
        }
        animator.setDuration(j7);
        this.f9101p.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f9101p.cancel();
        h(0.0f);
        this.f9098m.x(false);
        this.f9098m.t(0);
        this.f9098m.m();
        invalidateSelf();
    }
}
