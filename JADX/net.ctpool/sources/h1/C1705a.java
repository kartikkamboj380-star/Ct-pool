package h1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import i1.b;
import j1.p;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: h1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1705a extends Drawable implements b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f19561B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f19562C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f19563D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f19564E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f19565F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f19566G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private String f19567H;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f19570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f19571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f19575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p.b f19576s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f19578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19579v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private HashMap f19577t = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19580w = 80;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f19581x = new Paint(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Matrix f19582y = new Matrix();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Rect f19583z = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final RectF f19560A = new RectF();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f19568I = -1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f19569J = 0;

    public C1705a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i7) {
        String str3 = str + ": ";
        float fMeasureText = this.f19581x.measureText(str3);
        float fMeasureText2 = this.f19581x.measureText(str2);
        this.f19581x.setColor(1711276032);
        int i8 = this.f19564E;
        int i9 = this.f19565F;
        canvas.drawRect(i8 - 4, i9 + 8, i8 + fMeasureText + fMeasureText2 + 4.0f, i9 + this.f19563D + 8, this.f19581x);
        this.f19581x.setColor(-1);
        canvas.drawText(str3, this.f19564E, this.f19565F, this.f19581x);
        this.f19581x.setColor(i7);
        canvas.drawText(str2, this.f19564E + fMeasureText, this.f19565F, this.f19581x);
        this.f19565F += this.f19563D;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i7, int i8) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i8, rect.height() / i7)));
        this.f19581x.setTextSize(iMin);
        int i9 = iMin + 8;
        this.f19563D = i9;
        int i10 = this.f19580w;
        if (i10 == 80) {
            this.f19563D = i9 * (-1);
        }
        this.f19561B = rect.left + 10;
        this.f19562C = i10 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // i1.b
    public void a(long j7) {
        this.f19566G = j7;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f19577t.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f19581x.setStyle(Paint.Style.STROKE);
        this.f19581x.setStrokeWidth(2.0f);
        this.f19581x.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f19581x);
        Paint paint = this.f19581x;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f19581x.setColor(this.f19569J);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f19581x);
        this.f19581x.setStyle(style);
        this.f19581x.setStrokeWidth(0.0f);
        this.f19581x.setColor(-1);
        this.f19564E = this.f19561B;
        this.f19565F = this.f19562C;
        String str = this.f19571n;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f19570m, str));
        } else {
            d(canvas, "ID", this.f19570m);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f19572o), Integer.valueOf(this.f19573p)), f(this.f19572o, this.f19573p, this.f19576s));
        int i7 = this.f19573p;
        if (i7 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f19572o / i7));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f19574q / 1024)));
        String str2 = this.f19575r;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i8 = this.f19578u;
        if (i8 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i8), Integer.valueOf(this.f19579v)));
        }
        p.b bVar = this.f19576s;
        if (bVar != null) {
            c(canvas, "scale", bVar);
        }
        long j7 = this.f19566G;
        if (j7 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j7)));
        }
        String str3 = this.f19567H;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f19568I);
        }
        for (Map.Entry entry : this.f19577t.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    int f(int i7, int i8, p.b bVar) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i7 > 0 && i8 > 0) {
            if (bVar != null) {
                Rect rect = this.f19583z;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f19582y.reset();
                bVar.a(this.f19582y, this.f19583z, i7, i8, 0.0f, 0.0f);
                RectF rectF = this.f19560A;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i7;
                rectF.bottom = i8;
                this.f19582y.mapRect(rectF);
                int iWidth2 = (int) this.f19560A.width();
                int iHeight2 = (int) this.f19560A.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            }
            float f7 = iWidth;
            float f8 = f7 * 0.1f;
            float f9 = f7 * 0.5f;
            float f10 = iHeight;
            float f11 = 0.1f * f10;
            float f12 = f10 * 0.5f;
            int iAbs = Math.abs(i7 - iWidth);
            int iAbs2 = Math.abs(i8 - iHeight);
            float f13 = iAbs;
            if (f13 < f8 && iAbs2 < f11) {
                return -16711936;
            }
            if (f13 < f9 && iAbs2 < f12) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f19572o = -1;
        this.f19573p = -1;
        this.f19574q = -1;
        this.f19577t = new HashMap();
        this.f19578u = -1;
        this.f19579v = -1;
        this.f19575r = null;
        j(null);
        this.f19566G = -1L;
        this.f19567H = null;
        this.f19568I = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f19570m = str;
        invalidateSelf();
    }

    public void k(int i7, int i8) {
        this.f19572o = i7;
        this.f19573p = i8;
        invalidateSelf();
    }

    public void l(int i7) {
        this.f19574q = i7;
    }

    public void m(p.b bVar) {
        this.f19576s = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
