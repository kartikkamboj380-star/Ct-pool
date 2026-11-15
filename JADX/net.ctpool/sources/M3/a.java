package M3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f2048i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f2049j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f2050k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f2051l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f2052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f2053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f2054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f2058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f2059h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i7, float f7, float f8) {
        boolean z6 = f8 < 0.0f;
        Path path = this.f2058g;
        if (z6) {
            int[] iArr = f2050k;
            iArr[0] = 0;
            iArr[1] = this.f2057f;
            iArr[2] = this.f2056e;
            iArr[3] = this.f2055d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f7, f8);
            path.close();
            float f9 = -i7;
            rectF.inset(f9, f9);
            int[] iArr2 = f2050k;
            iArr2[0] = 0;
            iArr2[1] = this.f2055d;
            iArr2[2] = this.f2056e;
            iArr2[3] = this.f2057f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f10 = 1.0f - (i7 / fWidth);
        float[] fArr = f2051l;
        fArr[1] = f10;
        fArr[2] = ((1.0f - f10) / 2.0f) + f10;
        this.f2053b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f2050k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z6) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f2059h);
        }
        canvas.drawArc(rectF, f7, f8, true, this.f2053b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i7) {
        rectF.bottom += i7;
        rectF.offset(0.0f, -i7);
        int[] iArr = f2048i;
        iArr[0] = this.f2057f;
        iArr[1] = this.f2056e;
        iArr[2] = this.f2055d;
        Paint paint = this.f2054c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, f2049j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f2054c);
        canvas.restore();
    }

    public Paint c() {
        return this.f2052a;
    }

    public void d(int i7) {
        this.f2055d = androidx.core.graphics.a.k(i7, 68);
        this.f2056e = androidx.core.graphics.a.k(i7, 20);
        this.f2057f = androidx.core.graphics.a.k(i7, 0);
        this.f2052a.setColor(this.f2055d);
    }

    public a(int i7) {
        this.f2058g = new Path();
        this.f2059h = new Paint();
        this.f2052a = new Paint();
        d(i7);
        this.f2059h.setColor(0);
        Paint paint = new Paint(4);
        this.f2053b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2054c = new Paint(paint);
    }
}
