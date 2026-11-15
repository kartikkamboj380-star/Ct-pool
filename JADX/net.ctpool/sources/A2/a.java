package A2;

import C2.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.util.f;
import com.facebook.react.uimanager.C0868c0;
import com.facebook.react.uimanager.C0889o;
import com.facebook.react.uimanager.C0897x;
import com.facebook.react.uimanager.EnumC0898y;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Context f62A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0868c0 f64a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0868c0 f65b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0868c0 f66c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f67d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f68e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f69f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f70g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f71h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f72i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f74k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f75l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f76m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f77n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RectF f78o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PointF f79p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PointF f80q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PointF f81r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PointF f82s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f73j = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f83t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Paint f84u = new Paint(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f85v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f86w = 255;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f87x = 0.8f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private C2.b f88y = new C2.b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private c f89z = new c();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f63B = -1;

    /* JADX INFO: renamed from: A2.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0004a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90a;

        static {
            int[] iArr = new int[b.values().length];
            f90a = iArr;
            try {
                iArr[b.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90a[b.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90a[b.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect h(b bVar, float f7) {
            int i7 = C0004a.f90a[bVar.ordinal()];
            if (i7 == 2) {
                float f8 = f7 * 3.0f;
                return new DashPathEffect(new float[]{f8, f8, f8, f8}, 0.0f);
            }
            if (i7 != 3) {
                return null;
            }
            return new DashPathEffect(new float[]{f7, f7, f7, f7}, 0.0f);
        }
    }

    public a(Context context) {
        this.f62A = context;
    }

    private void A() {
        float f7;
        if (this.f83t) {
            this.f83t = false;
            if (this.f68e == null) {
                this.f68e = new Path();
            }
            if (this.f69f == null) {
                this.f69f = new Path();
            }
            if (this.f70g == null) {
                this.f70g = new Path();
            }
            if (this.f71h == null) {
                this.f71h = new Path();
            }
            if (this.f74k == null) {
                this.f74k = new Path();
            }
            if (this.f75l == null) {
                this.f75l = new RectF();
            }
            if (this.f76m == null) {
                this.f76m = new RectF();
            }
            if (this.f77n == null) {
                this.f77n = new RectF();
            }
            if (this.f78o == null) {
                this.f78o = new RectF();
            }
            this.f68e.reset();
            this.f69f.reset();
            this.f70g.reset();
            this.f71h.reset();
            this.f74k.reset();
            this.f75l.set(getBounds());
            this.f76m.set(getBounds());
            this.f77n.set(getBounds());
            this.f78o.set(getBounds());
            RectF rectFI = i();
            int iF = f(0);
            int iF2 = f(1);
            int iF3 = f(2);
            int iF4 = f(3);
            int iF5 = f(8);
            int iF6 = f(9);
            int iF7 = f(11);
            int iF8 = f(10);
            if (o(9)) {
                iF2 = iF6;
                iF4 = iF2;
            }
            if (!o(10)) {
                iF8 = iF4;
            }
            if (!o(11)) {
                iF7 = iF2;
            }
            if (Color.alpha(iF) == 0 || Color.alpha(iF7) == 0 || Color.alpha(iF3) == 0 || Color.alpha(iF8) == 0 || Color.alpha(iF5) == 0) {
                f7 = 0.0f;
            } else {
                RectF rectF = this.f75l;
                rectF.top += rectFI.top;
                rectF.bottom -= rectFI.bottom;
                rectF.left += rectFI.left;
                rectF.right -= rectFI.right;
                f7 = 0.8f;
            }
            RectF rectF2 = this.f78o;
            rectF2.top += rectFI.top * 0.5f;
            rectF2.bottom -= rectFI.bottom * 0.5f;
            rectF2.left += rectFI.left * 0.5f;
            rectF2.right -= rectFI.right * 0.5f;
            c cVarC = this.f88y.c(getLayoutDirection(), this.f62A, this.f76m.width(), this.f76m.height());
            this.f89z = cVarC;
            float fC = cVarC.c();
            float fD = this.f89z.d();
            float fA = this.f89z.a();
            float fB = this.f89z.b();
            float fMax = Math.max(fC - rectFI.left, 0.0f);
            float fMax2 = Math.max(fC - rectFI.top, 0.0f);
            float fMax3 = Math.max(fD - rectFI.right, 0.0f);
            float fMax4 = Math.max(fD - rectFI.top, 0.0f);
            float fMax5 = Math.max(fB - rectFI.right, 0.0f);
            float fMax6 = Math.max(fB - rectFI.bottom, 0.0f);
            float fMax7 = Math.max(fA - rectFI.left, 0.0f);
            float fMax8 = Math.max(fA - rectFI.bottom, 0.0f);
            Path.Direction direction = Path.Direction.CW;
            this.f68e.addRoundRect(this.f75l, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, direction);
            Path path = this.f69f;
            RectF rectF3 = this.f75l;
            path.addRoundRect(rectF3.left - f7, rectF3.top - f7, rectF3.right + f7, rectF3.bottom + f7, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, direction);
            this.f70g.addRoundRect(this.f76m, new float[]{fC, fC, fD, fD, fB, fB, fA, fA}, direction);
            C0868c0 c0868c0 = this.f64a;
            float fA2 = c0868c0 != null ? c0868c0.a(8) / 2.0f : 0.0f;
            float f8 = fC + fA2;
            float f9 = fD + fA2;
            float f10 = fB + fA2;
            float f11 = fA + fA2;
            this.f71h.addRoundRect(this.f77n, new float[]{f8, f8, f9, f9, f10, f10, f11, f11}, direction);
            Path path2 = this.f74k;
            RectF rectF4 = this.f78o;
            float f12 = rectFI.left;
            float fMax9 = Math.max(fC - (f12 * 0.5f), f12 > 0.0f ? fC / f12 : 0.0f);
            float f13 = rectFI.top;
            float fMax10 = Math.max(fC - (f13 * 0.5f), f13 > 0.0f ? fC / f13 : 0.0f);
            float f14 = rectFI.right;
            float fMax11 = Math.max(fD - (f14 * 0.5f), f14 > 0.0f ? fD / f14 : 0.0f);
            float f15 = rectFI.top;
            float fMax12 = Math.max(fD - (f15 * 0.5f), f15 > 0.0f ? fD / f15 : 0.0f);
            float f16 = rectFI.right;
            float fMax13 = Math.max(fB - (f16 * 0.5f), f16 > 0.0f ? fB / f16 : 0.0f);
            float f17 = rectFI.bottom;
            float fMax14 = Math.max(fB - (f17 * 0.5f), f17 > 0.0f ? fB / f17 : 0.0f);
            float f18 = rectFI.left;
            float fMax15 = Math.max(fA - (f18 * 0.5f), f18 > 0.0f ? fA / f18 : 0.0f);
            float f19 = rectFI.bottom;
            path2.addRoundRect(rectF4, new float[]{fMax9, fMax10, fMax11, fMax12, fMax13, fMax14, fMax15, Math.max(fA - (f19 * 0.5f), f19 > 0.0f ? fA / f19 : 0.0f)}, direction);
            if (this.f79p == null) {
                this.f79p = new PointF();
            }
            PointF pointF = this.f79p;
            RectF rectF5 = this.f75l;
            float f20 = rectF5.left;
            pointF.x = f20;
            float f21 = rectF5.top;
            pointF.y = f21;
            RectF rectF6 = this.f76m;
            j(f20, f21, (fMax * 2.0f) + f20, (fMax2 * 2.0f) + f21, rectF6.left, rectF6.top, f20, f21, pointF);
            if (this.f82s == null) {
                this.f82s = new PointF();
            }
            PointF pointF2 = this.f82s;
            RectF rectF7 = this.f75l;
            float f22 = rectF7.left;
            pointF2.x = f22;
            float f23 = rectF7.bottom;
            pointF2.y = f23;
            RectF rectF8 = this.f76m;
            j(f22, f23 - (fMax8 * 2.0f), (fMax7 * 2.0f) + f22, f23, rectF8.left, rectF8.bottom, f22, f23, pointF2);
            if (this.f80q == null) {
                this.f80q = new PointF();
            }
            PointF pointF3 = this.f80q;
            RectF rectF9 = this.f75l;
            float f24 = rectF9.right;
            pointF3.x = f24;
            float f25 = rectF9.top;
            pointF3.y = f25;
            RectF rectF10 = this.f76m;
            j(f24 - (fMax3 * 2.0f), f25, f24, (fMax4 * 2.0f) + f25, rectF10.right, rectF10.top, f24, f25, pointF3);
            if (this.f81r == null) {
                this.f81r = new PointF();
            }
            PointF pointF4 = this.f81r;
            RectF rectF11 = this.f75l;
            float f26 = rectF11.right;
            pointF4.x = f26;
            float f27 = rectF11.bottom;
            pointF4.y = f27;
            RectF rectF12 = this.f76m;
            j(f26 - (fMax5 * 2.0f), f27 - (fMax6 * 2.0f), f26, f27, rectF12.right, rectF12.bottom, f26, f27, pointF4);
        }
    }

    private void B() {
        b bVar = this.f67d;
        this.f84u.setPathEffect(bVar != null ? b.h(bVar, k()) : null);
    }

    private void C(int i7) {
        b bVar = this.f67d;
        this.f84u.setPathEffect(bVar != null ? b.h(bVar, i7) : null);
    }

    private static int a(float f7, float f8) {
        return ((((int) f7) << 24) & (-16777216)) | (((int) f8) & 16777215);
    }

    private void b(Canvas canvas, int i7, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        if (i7 == 0) {
            return;
        }
        if (this.f72i == null) {
            this.f72i = new Path();
        }
        this.f84u.setColor(i7);
        this.f72i.reset();
        this.f72i.moveTo(f7, f8);
        this.f72i.lineTo(f9, f10);
        this.f72i.lineTo(f11, f12);
        this.f72i.lineTo(f13, f14);
        this.f72i.lineTo(f7, f8);
        canvas.drawPath(this.f72i, this.f84u);
    }

    private void c(Canvas canvas) {
        int i7;
        int i8;
        int i9;
        this.f84u.setStyle(Paint.Style.FILL);
        int iP = p(this.f85v, this.f86w);
        if (Color.alpha(iP) != 0) {
            this.f84u.setColor(iP);
            canvas.drawRect(getBounds(), this.f84u);
        }
        RectF rectFI = i();
        int iRound = Math.round(rectFI.left);
        int iRound2 = Math.round(rectFI.top);
        int iRound3 = Math.round(rectFI.right);
        int iRound4 = Math.round(rectFI.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int iF = f(0);
            int iF2 = f(1);
            int iF3 = f(2);
            int iF4 = f(3);
            int iF5 = f(9);
            int iF6 = f(11);
            int iF7 = f(10);
            if (o(9)) {
                iF2 = iF5;
                iF4 = iF2;
            }
            if (!o(10)) {
                iF7 = iF4;
            }
            if (!o(11)) {
                iF6 = iF2;
            }
            boolean z6 = getLayoutDirection() == 1;
            int iF8 = f(4);
            int iF9 = f(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f62A)) {
                if (o(4)) {
                    iF = iF8;
                }
                if (o(5)) {
                    iF3 = iF9;
                }
                int i10 = z6 ? iF3 : iF;
                if (!z6) {
                    iF = iF3;
                }
                i8 = iF;
                i7 = i10;
            } else {
                int i11 = z6 ? iF9 : iF8;
                if (!z6) {
                    iF8 = iF9;
                }
                boolean zO = o(4);
                boolean zO2 = o(5);
                boolean z7 = z6 ? zO2 : zO;
                if (!z6) {
                    zO = zO2;
                }
                if (z7) {
                    iF = i11;
                }
                i7 = iF;
                i8 = zO ? iF8 : iF3;
            }
            int i12 = bounds.left;
            int i13 = bounds.top;
            int i14 = i7;
            int iE = e(iRound, iRound2, iRound3, iRound4, i7, iF6, i8, iF7);
            if (iE == 0) {
                this.f84u.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (iRound > 0) {
                    float f7 = i12;
                    float f8 = i12 + iRound;
                    i9 = i13;
                    b(canvas, i14, f7, i13, f8, i13 + iRound2, f8, r8 - iRound4, f7, i13 + iHeight);
                } else {
                    i9 = i13;
                }
                if (iRound2 > 0) {
                    float f9 = i9;
                    float f10 = i9 + iRound2;
                    b(canvas, iF6, i12, f9, i12 + iRound, f10, r9 - iRound3, f10, i12 + iWidth, f9);
                }
                if (iRound3 > 0) {
                    int i15 = i12 + iWidth;
                    float f11 = i15;
                    float f12 = i15 - iRound3;
                    b(canvas, i8, f11, i9, f11, i9 + iHeight, f12, r8 - iRound4, f12, i9 + iRound2);
                }
                if (iRound4 > 0) {
                    int i16 = i9 + iHeight;
                    float f13 = i16;
                    float f14 = i16 - iRound4;
                    b(canvas, iF7, i12, f13, i12 + iWidth, f13, r9 - iRound3, f14, i12 + iRound, f14);
                }
                this.f84u.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iE) != 0) {
                int i17 = bounds.right;
                int i18 = bounds.bottom;
                this.f84u.setColor(iE);
                this.f84u.setStyle(Paint.Style.STROKE);
                if (iRound > 0) {
                    this.f73j.reset();
                    int iRound5 = Math.round(rectFI.left);
                    C(iRound5);
                    this.f84u.setStrokeWidth(iRound5);
                    float f15 = i12 + (iRound5 / 2);
                    this.f73j.moveTo(f15, i13);
                    this.f73j.lineTo(f15, i18);
                    canvas.drawPath(this.f73j, this.f84u);
                }
                if (iRound2 > 0) {
                    this.f73j.reset();
                    int iRound6 = Math.round(rectFI.top);
                    C(iRound6);
                    this.f84u.setStrokeWidth(iRound6);
                    float f16 = i13 + (iRound6 / 2);
                    this.f73j.moveTo(i12, f16);
                    this.f73j.lineTo(i17, f16);
                    canvas.drawPath(this.f73j, this.f84u);
                }
                if (iRound3 > 0) {
                    this.f73j.reset();
                    int iRound7 = Math.round(rectFI.right);
                    C(iRound7);
                    this.f84u.setStrokeWidth(iRound7);
                    float f17 = i17 - (iRound7 / 2);
                    this.f73j.moveTo(f17, i13);
                    this.f73j.lineTo(f17, i18);
                    canvas.drawPath(this.f73j, this.f84u);
                }
                if (iRound4 > 0) {
                    this.f73j.reset();
                    int iRound8 = Math.round(rectFI.bottom);
                    C(iRound8);
                    this.f84u.setStrokeWidth(iRound8);
                    float f18 = i18 - (iRound8 / 2);
                    this.f73j.moveTo(i12, f18);
                    this.f73j.lineTo(i17, f18);
                    canvas.drawPath(this.f73j, this.f84u);
                }
            }
        }
    }

    private void d(Canvas canvas) {
        int i7;
        int i8;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        float f7;
        float f8;
        float f9;
        float f10;
        int i9;
        PointF pointF4;
        A();
        canvas.save();
        canvas.clipPath((Path) f.f(this.f70g), Region.Op.INTERSECT);
        int iK = androidx.core.graphics.a.k(this.f85v, getOpacity());
        if (Color.alpha(iK) != 0) {
            this.f84u.setColor(iK);
            this.f84u.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) f.f(this.f69f), this.f84u);
        }
        RectF rectFI = i();
        int iF = f(0);
        int iF2 = f(1);
        int iF3 = f(2);
        int iF4 = f(3);
        int iF5 = f(9);
        int iF6 = f(11);
        int iF7 = f(10);
        if (o(9)) {
            iF2 = iF5;
            iF4 = iF2;
        }
        if (!o(10)) {
            iF7 = iF4;
        }
        int i10 = o(11) ? iF6 : iF2;
        if (rectFI.top > 0.0f || rectFI.bottom > 0.0f || rectFI.left > 0.0f || rectFI.right > 0.0f) {
            float fK = k();
            int iF8 = f(8);
            if (rectFI.top != fK || rectFI.bottom != fK || rectFI.left != fK || rectFI.right != fK || iF != iF8 || i10 != iF8 || iF3 != iF8 || iF7 != iF8) {
                this.f84u.setStyle(Paint.Style.FILL);
                canvas.clipPath((Path) f.f(this.f68e), Region.Op.DIFFERENCE);
                boolean z6 = getLayoutDirection() == 1;
                int iF9 = f(4);
                int iF10 = f(5);
                if (com.facebook.react.modules.i18nmanager.a.f().d(this.f62A)) {
                    if (o(4)) {
                        iF = iF9;
                    }
                    if (o(5)) {
                        iF3 = iF10;
                    }
                    i7 = z6 ? iF3 : iF;
                    if (!z6) {
                        iF = iF3;
                    }
                    i8 = iF;
                } else {
                    int i11 = z6 ? iF10 : iF9;
                    if (!z6) {
                        iF9 = iF10;
                    }
                    boolean zO = o(4);
                    boolean zO2 = o(5);
                    boolean z7 = z6 ? zO2 : zO;
                    if (!z6) {
                        zO = zO2;
                    }
                    if (z7) {
                        iF = i11;
                    }
                    if (zO) {
                        i7 = iF;
                        i8 = iF9;
                    } else {
                        i7 = iF;
                        i8 = iF3;
                    }
                }
                RectF rectF = (RectF) f.f(this.f76m);
                float f11 = rectF.left;
                float f12 = rectF.right;
                float f13 = rectF.top;
                float f14 = rectF.bottom;
                PointF pointF5 = (PointF) f.f(this.f79p);
                PointF pointF6 = (PointF) f.f(this.f80q);
                PointF pointF7 = (PointF) f.f(this.f82s);
                PointF pointF8 = (PointF) f.f(this.f81r);
                if (rectFI.left > 0.0f) {
                    pointF = pointF8;
                    i9 = iF7;
                    pointF4 = pointF6;
                    pointF2 = pointF7;
                    pointF3 = pointF5;
                    f7 = f14;
                    f8 = f13;
                    f9 = f12;
                    f10 = f11;
                    b(canvas, i7, f11, f13 - 0.8f, pointF5.x, pointF5.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f11, f14 + 0.8f);
                } else {
                    pointF = pointF8;
                    pointF2 = pointF7;
                    pointF3 = pointF5;
                    f7 = f14;
                    f8 = f13;
                    f9 = f12;
                    f10 = f11;
                    i9 = iF7;
                    pointF4 = pointF6;
                }
                if (rectFI.top > 0.0f) {
                    b(canvas, i10, f10 - 0.8f, f8, pointF3.x - 0.8f, pointF3.y, pointF4.x + 0.8f, pointF4.y, f9 + 0.8f, f8);
                }
                if (rectFI.right > 0.0f) {
                    b(canvas, i8, f9, f8 - 0.8f, pointF4.x, pointF4.y - 0.8f, pointF.x, pointF.y + 0.8f, f9, f7 + 0.8f);
                }
                if (rectFI.bottom > 0.0f) {
                    PointF pointF9 = pointF2;
                    b(canvas, i9, f10 - 0.8f, f7, pointF9.x - 0.8f, pointF9.y, pointF.x + 0.8f, pointF.y, f9 + 0.8f, f7);
                }
            } else if (fK > 0.0f) {
                this.f84u.setColor(p(iF8, this.f86w));
                this.f84u.setStyle(Paint.Style.STROKE);
                this.f84u.setStrokeWidth(fK);
                canvas.drawPath((Path) f.f(this.f74k), this.f84u);
            }
        }
        canvas.restore();
    }

    private static int e(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = (i10 > 0 ? i14 : -1) & (i7 > 0 ? i11 : -1) & (i8 > 0 ? i12 : -1) & (i9 > 0 ? i13 : -1);
        if (i7 <= 0) {
            i11 = 0;
        }
        if (i8 <= 0) {
            i12 = 0;
        }
        int i16 = i11 | i12;
        if (i9 <= 0) {
            i13 = 0;
        }
        int i17 = i16 | i13;
        if (i10 <= 0) {
            i14 = 0;
        }
        if (i15 == (i17 | i14)) {
            return i15;
        }
        return 0;
    }

    private static void j(double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, PointF pointF) {
        double d15 = (d7 + d9) / 2.0d;
        double d16 = (d8 + d10) / 2.0d;
        double d17 = d11 - d15;
        double d18 = d12 - d16;
        double dAbs = Math.abs(d9 - d7) / 2.0d;
        double dAbs2 = Math.abs(d10 - d8) / 2.0d;
        double d19 = ((d14 - d16) - d18) / ((d13 - d15) - d17);
        double d20 = d18 - (d17 * d19);
        double d21 = dAbs2 * dAbs2;
        double d22 = dAbs * dAbs;
        double d23 = d21 + (d22 * d19 * d19);
        double d24 = dAbs * 2.0d * dAbs * d20 * d19;
        double d25 = (-(d22 * ((d20 * d20) - d21))) / d23;
        double d26 = d23 * 2.0d;
        double dSqrt = ((-d24) / d26) - Math.sqrt(d25 + Math.pow(d24 / d26, 2.0d));
        double d27 = (d19 * dSqrt) + d20;
        double d28 = dSqrt + d15;
        double d29 = d27 + d16;
        if (Double.isNaN(d28) || Double.isNaN(d29)) {
            return;
        }
        pointF.x = (float) d28;
        pointF.y = (float) d29;
    }

    private boolean o(int i7) {
        C0868c0 c0868c0 = this.f65b;
        float fA = c0868c0 != null ? c0868c0.a(i7) : Float.NaN;
        C0868c0 c0868c02 = this.f66c;
        return (Float.isNaN(fA) || Float.isNaN(c0868c02 != null ? c0868c02.a(i7) : Float.NaN)) ? false : true;
    }

    private static int p(int i7, int i8) {
        if (i8 == 255) {
            return i7;
        }
        if (i8 == 0) {
            return i7 & 16777215;
        }
        return (i7 & 16777215) | ((((i7 >>> 24) * (i8 + (i8 >> 7))) >> 8) << 24);
    }

    private void q(int i7, float f7) {
        if (this.f66c == null) {
            this.f66c = new C0868c0(255.0f);
        }
        if (C0889o.a(this.f66c.b(i7), f7)) {
            return;
        }
        this.f66c.c(i7, f7);
        invalidateSelf();
    }

    private void s(int i7, float f7) {
        if (this.f65b == null) {
            this.f65b = new C0868c0(0.0f);
        }
        if (C0889o.a(this.f65b.b(i7), f7)) {
            return;
        }
        this.f65b.c(i7, f7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        B();
        if (n()) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    public int f(int i7) {
        C0868c0 c0868c0 = this.f65b;
        float fA = c0868c0 != null ? c0868c0.a(i7) : 0.0f;
        C0868c0 c0868c02 = this.f66c;
        return a(c0868c02 != null ? c0868c02.a(i7) : 255.0f, fA);
    }

    public float g(float f7, int i7) {
        C0868c0 c0868c0 = this.f64a;
        if (c0868c0 == null) {
            return f7;
        }
        float fB = c0868c0.b(i7);
        return Float.isNaN(fB) ? f7 : fB;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f86w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        int i7 = this.f63B;
        return i7 == -1 ? super.getLayoutDirection() : i7;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (Color.alpha(this.f85v) * this.f86w) >> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (!n()) {
            outline.setRect(getBounds());
        } else {
            A();
            outline.setConvexPath((Path) f.f(this.f71h));
        }
    }

    public c h() {
        return this.f89z;
    }

    public RectF i() {
        float fG = g(0.0f, 8);
        float fG2 = g(fG, 1);
        float fG3 = g(fG, 3);
        float fG4 = g(fG, 0);
        float fG5 = g(fG, 2);
        if (this.f64a != null) {
            boolean z6 = getLayoutDirection() == 1;
            float fB = this.f64a.b(4);
            float fB2 = this.f64a.b(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f62A)) {
                if (!Float.isNaN(fB)) {
                    fG4 = fB;
                }
                if (!Float.isNaN(fB2)) {
                    fG5 = fB2;
                }
                float f7 = z6 ? fG5 : fG4;
                if (z6) {
                    fG5 = fG4;
                }
                fG4 = f7;
            } else {
                float f8 = z6 ? fB2 : fB;
                if (!z6) {
                    fB = fB2;
                }
                if (!Float.isNaN(f8)) {
                    fG4 = f8;
                }
                if (!Float.isNaN(fB)) {
                    fG5 = fB;
                }
            }
        }
        return new RectF(fG4, fG2, fG5, fG3);
    }

    public float k() {
        C0868c0 c0868c0 = this.f64a;
        if (c0868c0 == null || Float.isNaN(c0868c0.b(8))) {
            return 0.0f;
        }
        return this.f64a.b(8);
    }

    public Path l() {
        if (!n()) {
            return null;
        }
        A();
        return new Path((Path) f.f(this.f68e));
    }

    public RectF m() {
        RectF rectFI = i();
        return rectFI == null ? new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()) : new RectF(rectFI.left, rectFI.top, getBounds().width() - rectFI.right, getBounds().height() - rectFI.bottom);
    }

    public boolean n() {
        return this.f88y.b();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f83t = true;
    }

    public void r(int i7, float f7, float f8) {
        s(i7, f7);
        q(i7, f8);
        this.f83t = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (i7 != this.f86w) {
            this.f86w = i7;
            invalidateSelf();
        }
    }

    public void t(C2.a aVar, C0897x c0897x) {
        if (Objects.equals(c0897x, this.f88y.a(aVar))) {
            return;
        }
        this.f88y.d(aVar, c0897x);
        this.f83t = true;
        invalidateSelf();
    }

    public void u(String str) {
        b bVarValueOf = str == null ? null : b.valueOf(str.toUpperCase(Locale.US));
        if (this.f67d != bVarValueOf) {
            this.f67d = bVarValueOf;
            this.f83t = true;
            invalidateSelf();
        }
    }

    public void v(int i7, float f7) {
        if (this.f64a == null) {
            this.f64a = new C0868c0();
        }
        if (C0889o.a(this.f64a.b(i7), f7)) {
            return;
        }
        this.f64a.c(i7, f7);
        if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) {
            this.f83t = true;
        }
        invalidateSelf();
    }

    public void w(int i7) {
        this.f85v = i7;
        invalidateSelf();
    }

    public void x(int i7) {
        if (this.f63B != i7) {
            this.f63B = i7;
        }
    }

    public void y(float f7) {
        Float fValueOf = Float.isNaN(f7) ? null : Float.valueOf(f7);
        if (fValueOf == null) {
            t(C2.a.f915m, null);
        } else {
            t(C2.a.f915m, new C0897x(fValueOf.floatValue(), EnumC0898y.f12740m));
        }
    }

    public void z(float f7, int i7) {
        Float fValueOf = Float.isNaN(f7) ? null : Float.valueOf(f7);
        if (fValueOf == null) {
            this.f88y.d(C2.a.values()[i7], null);
        } else {
            t(C2.a.values()[i7], new C0897x(fValueOf.floatValue(), EnumC0898y.f12740m));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
