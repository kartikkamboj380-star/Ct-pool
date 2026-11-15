package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.H;
import d0.AbstractC1602a;

/* JADX INFO: loaded from: classes.dex */
class a extends ImageView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation.AnimationListener f9089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f9091o;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private static class C0175a extends OvalShape {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Paint f9092m = new Paint();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f9093n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private a f9094o;

        C0175a(a aVar, int i7) {
            this.f9094o = aVar;
            this.f9093n = i7;
            a((int) rect().width());
        }

        private void a(int i7) {
            float f7 = i7 / 2;
            this.f9092m.setShader(new RadialGradient(f7, f7, this.f9093n, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f9094o.getWidth() / 2;
            float height = this.f9094o.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f9092m);
            canvas.drawCircle(width, height, r0 - this.f9093n, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f7, float f8) {
            super.onResize(f7, f8);
            a((int) f7);
        }
    }

    a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f7 = getContext().getResources().getDisplayMetrics().density;
        int i7 = (int) (1.75f * f7);
        int i8 = (int) (0.0f * f7);
        this.f9090n = (int) (3.5f * f7);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(AbstractC1602a.f18659f);
        this.f9091o = typedArrayObtainStyledAttributes.getColor(AbstractC1602a.f18660g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            H.x0(this, f7 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0175a(this, this.f9090n));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f9090n, i8, i7, 503316480);
            int i9 = this.f9090n;
            setPadding(i9, i9, i9, i9);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f9091o);
        H.t0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f9089m = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f9089m;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f9089m;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f9090n * 2), getMeasuredHeight() + (this.f9090n * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i7);
            this.f9091o = i7;
        }
    }
}
