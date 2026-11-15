package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.ConnectionResult;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class U extends h0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Path f17856C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    String f17857D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private V f17858E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final ArrayList f17859F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final ArrayList f17860G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final AssetManager f17861H;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f17864c;

        static {
            int[] iArr = new int[W.values().length];
            f17864c = iArr;
            try {
                iArr[W.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17864c[W.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17864c[W.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17864c[W.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17864c[W.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17864c[W.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17864c[W.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17864c[W.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17864c[W.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17864c[W.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17864c[W.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17864c[W.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17864c[W.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17864c[W.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17864c[W.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17864c[W.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[c0.values().length];
            f17863b = iArr2;
            try {
                iArr2[c0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17863b[c0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[a0.values().length];
            f17862a = iArr3;
            try {
                iArr3[a0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f17862a[a0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f17862a[a0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public U(ReactContext reactContext) {
        super(reactContext);
        this.f17859F = new ArrayList();
        this.f17860G = new ArrayList();
        this.f17861H = this.mContext.getResources().getAssets();
    }

    private void S(Paint paint, C1578q c1578q) {
        StringBuilder sb;
        String str;
        int i7 = Build.VERSION.SDK_INT;
        double d7 = c1578q.f18043n;
        paint.setLetterSpacing((float) (d7 / (c1578q.f18030a * ((double) this.mScale))));
        if (d7 == 0.0d && c1578q.f18038i == Y.normal) {
            sb = new StringBuilder();
            str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ";
        } else {
            sb = new StringBuilder();
            str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
        }
        sb.append(str);
        sb.append(c1578q.f18036g);
        paint.setFontFeatureSettings(sb.toString());
        if (i7 >= 26) {
            paint.setFontVariationSettings("'wght' " + c1578q.f18035f + c1578q.f18037h);
        }
    }

    private void T(Paint paint, C1578q c1578q) {
        int i7 = 0;
        boolean z6 = c1578q.f18034e == Z.Bold || c1578q.f18035f >= 550;
        boolean z7 = c1578q.f18032c == X.italic;
        if (z6 && z7) {
            i7 = 3;
        } else if (z6) {
            i7 = 1;
        } else if (z7) {
            i7 = 2;
        }
        int i8 = c1578q.f18035f;
        String str = c1578q.f18031b;
        Typeface typefaceB = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                T.a();
                Typeface.Builder builderA = S.a(this.f17861H, str2);
                builderA.setFontVariationSettings("'wght' " + i8 + c1578q.f18037h);
                builderA.setWeight(i8);
                builderA.setItalic(z7);
                typefaceB = builderA.build();
                if (typefaceB == null) {
                    T.a();
                    Typeface.Builder builderA2 = S.a(this.f17861H, str3);
                    builderA2.setFontVariationSettings("'wght' " + i8 + c1578q.f18037h);
                    builderA2.setWeight(i8);
                    builderA2.setItalic(z7);
                    typefaceB = builderA2.build();
                }
            } else {
                try {
                    try {
                        typefaceB = Typeface.create(Typeface.createFromAsset(this.f17861H, str2), i7);
                    } catch (Exception unused) {
                        typefaceB = Typeface.create(Typeface.createFromAsset(this.f17861H, str3), i7);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typefaceB == null) {
            try {
                typefaceB = com.facebook.react.views.text.d.a().b(str, i7, this.f17861H);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceB = Typeface.create(typefaceB, i8, z7);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typefaceB);
        paint.setTextSize((float) (c1578q.f18030a * ((double) this.mScale)));
        paint.setLetterSpacing(0.0f);
    }

    private void U(Canvas canvas, Paint paint) {
        C1580s c1580sU = u();
        w();
        C1578q c1578qB = c1580sU.b();
        TextPaint textPaint = new TextPaint(paint);
        T(textPaint, c1578qB);
        S(textPaint, c1578qB);
        double dC = c1580sU.c();
        int i7 = a.f17862a[c1578qB.f18039j.ordinal()];
        StaticLayout staticLayoutX = X(textPaint, i7 != 2 ? i7 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, true, new SpannableString(this.f17857D), (int) F.a(this.f17982r, canvas.getWidth(), 0.0d, this.mScale, dC));
        int lineAscent = staticLayoutX.getLineAscent(0);
        float fL = (float) c1580sU.l(0.0d);
        float fM = (float) (c1580sU.m() + ((double) lineAscent));
        v();
        canvas.save();
        canvas.translate(fL, fM);
        staticLayoutX.draw(canvas);
        canvas.restore();
    }

    private double V(SVGLength sVGLength, double d7, double d8) {
        return F.a(sVGLength, d7, 0.0d, this.mScale, d8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path W(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z6;
        double d7;
        boolean[] zArr;
        boolean z7;
        int i7;
        C1581t c1581t;
        StringBuilder sb;
        String str2;
        C1580s c1580s;
        Path path;
        ReadableMap readableMap;
        C1581t c1581t2;
        float[] fArr;
        double d8;
        double d9;
        int i8;
        boolean z8;
        SVGLength sVGLength;
        double d10;
        boolean z9;
        double d11;
        String strC;
        W wB;
        Paint paint2;
        double d12;
        double d13;
        double d14;
        int i9;
        boolean z10;
        int i10;
        String str3;
        int i11;
        double d15;
        double d16;
        U u6;
        double d17;
        float[] fArr2;
        float[] fArr3;
        Matrix matrix;
        C1580s c1580s2;
        int i12;
        PathMeasure pathMeasure2;
        int i13;
        int i14;
        double d18;
        Path path2;
        C1581t c1581t3;
        Paint paint3;
        Matrix matrix2;
        double d19;
        char c7;
        double d20;
        C1580s c1580s3;
        char c8;
        double d21;
        String str4;
        boolean z11;
        Path pathB;
        int i15;
        int i16;
        double d22;
        U u7 = this;
        int length = str.length();
        Path path3 = new Path();
        u7.f17859F.clear();
        u7.f17860G.clear();
        if (length == 0) {
            return path3;
        }
        boolean z12 = u7.f17858E != null;
        if (z12) {
            PathMeasure pathMeasure3 = new PathMeasure(u7.f17858E.V(canvas, paint), false);
            double length2 = pathMeasure3.getLength();
            boolean zIsClosed = pathMeasure3.isClosed();
            if (length2 == 0.0d) {
                return path3;
            }
            pathMeasure = pathMeasure3;
            d7 = length2;
            z6 = zIsClosed;
        } else {
            pathMeasure = null;
            z6 = false;
            d7 = 0.0d;
        }
        C1580s c1580sU = u();
        C1578q c1578qB = c1580sU.b();
        u7.T(paint, c1578qB);
        C1581t c1581t4 = new C1581t(paint);
        boolean[] zArr2 = new boolean[length];
        char[] charArray = str.toCharArray();
        PathMeasure pathMeasure4 = pathMeasure;
        double d23 = c1578qB.f18041l;
        double d24 = c1578qB.f18042m;
        double d25 = c1578qB.f18043n;
        boolean z13 = !c1578qB.f18044o;
        if (d25 == 0.0d) {
            zArr = zArr2;
            z7 = c1578qB.f18038i == Y.normal;
            i7 = Build.VERSION.SDK_INT;
            if (z7) {
                c1581t = c1581t4;
                sb = new StringBuilder();
                str2 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
            } else {
                sb = new StringBuilder();
                c1581t = c1581t4;
                str2 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ";
            }
            sb.append(str2);
            sb.append(c1578qB.f18036g);
            paint.setFontFeatureSettings(sb.toString());
            if (i7 >= 26) {
                paint.setFontVariationSettings("'wght' " + c1578qB.f18035f + c1578qB.f18037h);
            }
            ReadableMap readableMap2 = c1578qB.f18033d;
            float[] fArr4 = new float[length];
            paint.getTextWidths(str, fArr4);
            a0 a0Var = c1578qB.f18039j;
            double dE = F().E(paint);
            double dY = u7.Y(a0Var, dE);
            double dC = c1580sU.c();
            if (z12) {
                c1580s = c1580sU;
                path = path3;
                readableMap = readableMap2;
                c1581t2 = c1581t;
                fArr = fArr4;
                d8 = d7;
                d9 = 0.0d;
                i8 = 1;
                z8 = false;
            } else {
                boolean z14 = u7.f17858E.S() == e0.sharp;
                int i17 = u7.f17858E.T() == f0.right ? -1 : 1;
                path = path3;
                c1580s = c1580sU;
                c1581t2 = c1581t;
                fArr = fArr4;
                readableMap = readableMap2;
                d8 = d7;
                double dV = V(u7.f17858E.U(), d7, dC);
                dY += dV;
                if (z6) {
                    d9 = dV + (a0Var == a0.middle ? -(d8 / 2.0d) : 0.0d);
                    d7 = d9 + d8;
                } else {
                    d7 = d8;
                    d9 = 0.0d;
                }
                z8 = z14;
                i8 = i17;
            }
            sVGLength = u7.f17983s;
            double d26 = 1.0d;
            if (sVGLength == null) {
                d11 = d8;
                z9 = z8;
                d10 = d9;
                double dA = F.a(sVGLength, canvas.getWidth(), 0.0d, u7.mScale, dC);
                if (dA < 0.0d) {
                    throw new IllegalArgumentException("Negative textLength value");
                }
                if (a.f17863b[u7.f17985u.ordinal()] != 2) {
                    d25 += (dA - dE) / ((double) (length - 1));
                } else {
                    d26 = dA / dE;
                }
            } else {
                d10 = d9;
                z9 = z8;
                d11 = d8;
            }
            double d27 = d25;
            double d28 = i8;
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            double d29 = fontMetrics.descent;
            float f7 = fontMetrics.leading;
            double d30 = d26 * d28;
            double d31 = ((double) f7) + d29;
            int i18 = i8;
            double d32 = d7;
            double d33 = (-fontMetrics.ascent) + f7;
            double dB = -fontMetrics.top;
            double d34 = dB + d31;
            strC = C();
            wB = B();
            if (wB == null) {
                switch (a.f17864c[wB.ordinal()]) {
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        paint2 = paint;
                        d12 = d11;
                        dB = -d29;
                        break;
                    case 5:
                        paint2 = paint;
                        d12 = d11;
                        dB = 0.0d;
                        break;
                    case 7:
                        Rect rect = new Rect();
                        paint2 = paint;
                        d12 = d11;
                        paint2.getTextBounds("x", 0, 1, rect);
                        dB = ((double) rect.height()) / 2.0d;
                        break;
                    case 8:
                        d31 = (d33 - d29) / 2.0d;
                        paint2 = paint;
                        dB = d31;
                        d12 = d11;
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        d22 = 0.5d;
                        d31 = d33 * d22;
                        paint2 = paint;
                        dB = d31;
                        d12 = d11;
                        break;
                    case 10:
                        d22 = 0.8d;
                        d31 = d33 * d22;
                        paint2 = paint;
                        dB = d31;
                        d12 = d11;
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    case 12:
                    case 13:
                        dB = d33;
                        d12 = d11;
                        paint2 = paint;
                        break;
                    case 14:
                        paint2 = paint;
                        dB = d31;
                        d12 = d11;
                        break;
                    case 15:
                        d31 = d34 / 2.0d;
                        paint2 = paint;
                        dB = d31;
                        d12 = d11;
                        break;
                    case 16:
                        paint2 = paint;
                        d12 = d11;
                        break;
                    default:
                        paint2 = paint;
                        dB = 0.0d;
                        d12 = d11;
                        break;
                }
            }
            if (strC == null && !strC.isEmpty() && (i16 = a.f17864c[wB.ordinal()]) != 14 && i16 != 16) {
                d13 = d12;
                switch (strC) {
                    case "baseline":
                        break;
                    case "sub":
                        d14 = d28;
                        ReadableMap readableMap3 = readableMap;
                        if (readableMap3 != null && readableMap3.hasKey("tables") && readableMap3.hasKey("unitsPerEm")) {
                            int i19 = readableMap3.getInt("unitsPerEm");
                            ReadableMap map = readableMap3.getMap("tables");
                            if (map.hasKey("os2")) {
                                ReadableMap map2 = map.getMap("os2");
                                if (map2.hasKey("ySubscriptYOffset")) {
                                    dB += ((((double) u7.mScale) * dC) * map2.getDouble("ySubscriptYOffset")) / ((double) i19);
                                }
                            }
                            break;
                        }
                        break;
                    case "super":
                        if (readableMap != null) {
                            ReadableMap readableMap4 = readableMap;
                            if (readableMap4.hasKey("tables") && readableMap4.hasKey("unitsPerEm")) {
                                int i20 = readableMap4.getInt("unitsPerEm");
                                ReadableMap map3 = readableMap4.getMap("tables");
                                if (map3.hasKey("os2")) {
                                    ReadableMap map4 = map3.getMap("os2");
                                    if (map4.hasKey("ySuperscriptYOffset")) {
                                        d14 = d28;
                                        dB -= ((((double) u7.mScale) * dC) * map4.getDouble("ySuperscriptYOffset")) / ((double) i20);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        float f8 = u7.mScale;
                        dB -= F.b(strC, ((double) f8) * dC, f8, dC);
                        break;
                }
                Matrix matrix3 = new Matrix();
                Matrix matrix4 = new Matrix();
                Matrix matrix5 = new Matrix();
                float[] fArr5 = new float[9];
                float[] fArr6 = new float[9];
                double d35 = d23;
                i9 = 0;
                while (i9 < length) {
                    double d36 = d35;
                    char c9 = charArray[i9];
                    String strValueOf = String.valueOf(c9);
                    boolean z15 = zArr[i9];
                    if (z15) {
                        str3 = "";
                        i10 = length;
                        z10 = false;
                    } else {
                        int i21 = i9;
                        z10 = false;
                        while (true) {
                            int i22 = i21 + 1;
                            if (i22 < length && fArr[i22] <= 0.0f) {
                                strValueOf = strValueOf + charArray[i22];
                                zArr[i22] = true;
                                i21 = i22;
                                length = length;
                                z10 = true;
                            }
                        }
                        i10 = length;
                        str3 = strValueOf;
                    }
                    String str5 = str3;
                    double dMeasureText = ((double) paint2.measureText(str3)) * d26;
                    if (z13) {
                        i11 = i9;
                        d36 = (((double) fArr[i9]) * d26) - dMeasureText;
                    } else {
                        i11 = i9;
                    }
                    boolean z16 = c9 == ' ';
                    double d37 = dMeasureText + (z16 ? d24 : 0.0d) + d27;
                    if (z15) {
                        d15 = d27;
                        d16 = 0.0d;
                    } else {
                        d15 = d27;
                        d16 = d36 + d37;
                    }
                    double dL = c1580s.l(d16);
                    int i23 = i11;
                    double dM = c1580s.m();
                    double dI = c1580s.i();
                    double dJ = c1580s.j();
                    double dK = c1580s.k();
                    if (z15 || z16) {
                        u6 = this;
                        d17 = dB;
                        fArr2 = fArr6;
                        fArr3 = fArr5;
                        matrix = matrix5;
                        c1580s2 = c1580s;
                        i12 = i18;
                        pathMeasure2 = pathMeasure4;
                        i13 = i10;
                        i14 = i23;
                        d18 = d30;
                        path2 = path;
                        c1581t3 = c1581t2;
                        paint3 = paint;
                        matrix2 = matrix3;
                        d19 = d13;
                    } else {
                        double d38 = dMeasureText * d14;
                        double d39 = (dY + ((dL + dI) * d14)) - (d37 * d14);
                        if (z12) {
                            c7 = c9;
                            double d40 = d39 + d38;
                            double d41 = d38 / 2.0d;
                            d20 = dK;
                            double d42 = d39 + d41;
                            if (d42 <= d32 && d42 >= d10) {
                                c1580s3 = c1580s;
                                if (z9) {
                                    PathMeasure pathMeasure5 = pathMeasure4;
                                    pathMeasure5.getMatrix((float) d42, matrix4, 3);
                                    d17 = dB;
                                    matrix2 = matrix3;
                                    fArr2 = fArr6;
                                    c8 = 2;
                                    pathMeasure2 = pathMeasure5;
                                } else {
                                    d17 = dB;
                                    pathMeasure2 = pathMeasure4;
                                    if (d39 < 0.0d) {
                                        pathMeasure2.getMatrix(0.0f, matrix3, 3);
                                        matrix3.preTranslate((float) d39, 0.0f);
                                        i15 = 1;
                                    } else {
                                        i15 = 1;
                                        pathMeasure2.getMatrix((float) d39, matrix3, 1);
                                    }
                                    pathMeasure2.getMatrix((float) d42, matrix4, i15);
                                    double d43 = d13;
                                    if (d40 > d13) {
                                        pathMeasure2.getMatrix((float) d43, matrix5, 3);
                                        matrix5.preTranslate((float) (d40 - d43), 0.0f);
                                    } else {
                                        pathMeasure2.getMatrix((float) d40, matrix5, i15);
                                    }
                                    matrix3.getValues(fArr5);
                                    matrix5.getValues(fArr6);
                                    c8 = 2;
                                    matrix2 = matrix3;
                                    d13 = d43;
                                    fArr2 = fArr6;
                                    matrix4.preRotate((float) (Math.atan2(((double) fArr6[5]) - ((double) fArr5[5]), ((double) fArr6[2]) - ((double) fArr5[2])) * 57.29577951308232d * d14));
                                }
                                matrix4.preTranslate((float) (-d41), (float) (dJ + d17));
                                d21 = d30;
                                i12 = i18;
                                matrix4.preScale((float) d21, i12);
                                matrix4.postTranslate(0.0f, (float) dM);
                            }
                            u6 = this;
                            d17 = dB;
                            fArr2 = fArr6;
                            fArr3 = fArr5;
                            matrix = matrix5;
                            c1580s2 = c1580s;
                            i12 = i18;
                            pathMeasure2 = pathMeasure4;
                            i13 = i10;
                            i14 = i23;
                            d18 = d30;
                            path2 = path;
                            c1581t3 = c1581t2;
                            paint3 = paint;
                            matrix2 = matrix3;
                            d19 = d13;
                        } else {
                            d17 = dB;
                            c7 = c9;
                            d20 = dK;
                            fArr2 = fArr6;
                            c1580s3 = c1580s;
                            i12 = i18;
                            pathMeasure2 = pathMeasure4;
                            c8 = 2;
                            matrix2 = matrix3;
                            d21 = d30;
                            matrix4.setTranslate((float) d39, (float) (dM + dJ + d17));
                        }
                        matrix4.preRotate((float) d20);
                        if (z10) {
                            Path path4 = new Path();
                            str4 = str5;
                            i14 = i23;
                            path2 = path;
                            i13 = i10;
                            d18 = d21;
                            d19 = d13;
                            z11 = true;
                            fArr3 = fArr5;
                            matrix = matrix5;
                            paint.getTextPath(str4, 0, str5.length(), 0.0f, 0.0f, path4);
                            pathB = path4;
                            c1581t3 = c1581t2;
                        } else {
                            fArr3 = fArr5;
                            matrix = matrix5;
                            char c10 = c7;
                            i13 = i10;
                            str4 = str5;
                            i14 = i23;
                            path2 = path;
                            c1581t3 = c1581t2;
                            z11 = true;
                            d18 = d21;
                            d19 = d13;
                            pathB = c1581t3.b(c10, str4);
                        }
                        RectF rectF = new RectF();
                        pathB.computeBounds(rectF, z11);
                        if (rectF.width() == 0.0f) {
                            canvas.save();
                            c1580s2 = c1580s3;
                            canvas.concat(matrix4);
                            u6 = this;
                            u6.f17859F.add(str4);
                            u6.f17860G.add(new Matrix(matrix4));
                            paint3 = paint;
                            canvas.drawText(str4, 0.0f, 0.0f, paint3);
                            canvas.restore();
                        } else {
                            u6 = this;
                            paint3 = paint;
                            c1580s2 = c1580s3;
                            pathB.transform(matrix4);
                            path2.addPath(pathB);
                        }
                    }
                    int i24 = i14 + 1;
                    c1581t2 = c1581t3;
                    matrix5 = matrix;
                    d13 = d19;
                    i18 = i12;
                    path = path2;
                    i9 = i24;
                    u7 = u6;
                    c1580s = c1580s2;
                    paint2 = paint3;
                    length = i13;
                    matrix3 = matrix2;
                    fArr6 = fArr2;
                    fArr5 = fArr3;
                    d35 = d36;
                    d30 = d18;
                    d27 = d15;
                    pathMeasure4 = pathMeasure2;
                    dB = d17;
                }
                return path;
            }
            d13 = d12;
            d14 = d28;
            Matrix matrix32 = new Matrix();
            Matrix matrix42 = new Matrix();
            Matrix matrix52 = new Matrix();
            float[] fArr52 = new float[9];
            float[] fArr62 = new float[9];
            double d352 = d23;
            i9 = 0;
            while (i9 < length) {
            }
            return path;
        }
        zArr = zArr2;
        i7 = Build.VERSION.SDK_INT;
        if (z7) {
        }
        sb.append(str2);
        sb.append(c1578qB.f18036g);
        paint.setFontFeatureSettings(sb.toString());
        if (i7 >= 26) {
        }
        ReadableMap readableMap22 = c1578qB.f18033d;
        float[] fArr42 = new float[length];
        paint.getTextWidths(str, fArr42);
        a0 a0Var2 = c1578qB.f18039j;
        double dE2 = F().E(paint);
        double dY2 = u7.Y(a0Var2, dE2);
        double dC2 = c1580sU.c();
        if (z12) {
        }
        sVGLength = u7.f17983s;
        double d262 = 1.0d;
        if (sVGLength == null) {
        }
        double d272 = d25;
        double d282 = i8;
        Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
        double d292 = fontMetrics2.descent;
        float f72 = fontMetrics2.leading;
        double d302 = d262 * d282;
        double d312 = ((double) f72) + d292;
        int i182 = i8;
        double d322 = d7;
        double d332 = (-fontMetrics2.ascent) + f72;
        double dB2 = -fontMetrics2.top;
        double d342 = dB2 + d312;
        strC = C();
        wB = B();
        if (wB == null) {
        }
        if (strC == null) {
            d13 = d12;
            d14 = d282;
        }
        Matrix matrix322 = new Matrix();
        Matrix matrix422 = new Matrix();
        Matrix matrix522 = new Matrix();
        float[] fArr522 = new float[9];
        float[] fArr622 = new float[9];
        double d3522 = d23;
        i9 = 0;
        while (i9 < length) {
        }
        return path;
    }

    private StaticLayout X(TextPaint textPaint, Layout.Alignment alignment, boolean z6, SpannableString spannableString, int i7) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i7).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z6).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double Y(a0 a0Var, double d7) {
        int i7 = a.f17862a[a0Var.ordinal()];
        if (i7 == 2) {
            return (-d7) / 2.0d;
        }
        if (i7 != 3) {
            return 0.0d;
        }
        return -d7;
    }

    private void a0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == V.class) {
                this.f17858E = (V) parent;
                return;
            } else {
                if (!(parent instanceof h0)) {
                    return;
                }
            }
        }
    }

    public static String b0(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            bArr[i7] = (byte) bidi.getRunLevel(i7);
            numArr[i7] = Integer.valueOf(i7);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < runCount; i8++) {
            int iIntValue = numArr[i8].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            if ((bArr[iIntValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    @Override // com.horcrux.svg.h0
    double E(Paint paint) {
        if (!Double.isNaN(this.f17981B)) {
            return this.f17981B;
        }
        String str = this.f17857D;
        double dE = 0.0d;
        if (str == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof h0) {
                    dE += ((h0) childAt).E(paint);
                }
            }
            this.f17981B = dE;
            return dE;
        }
        if (str.length() == 0) {
            this.f17981B = 0.0d;
            return 0.0d;
        }
        C1578q c1578qB = u().b();
        T(paint, c1578qB);
        S(paint, c1578qB);
        double dMeasureText = paint.measureText(str);
        this.f17981B = dMeasureText;
        return dMeasureText;
    }

    public void Z(String str) {
        this.f17857D = str;
        invalidate();
    }

    @Override // com.horcrux.svg.h0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f17856C = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.h0, com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        if (this.f17857D == null) {
            clip(canvas, paint);
            q(canvas, paint, f7);
            return;
        }
        SVGLength sVGLength = this.f17982r;
        if (sVGLength != null && sVGLength.f17818a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f7)) {
                U(canvas, paint);
            }
            if (setupStrokePaint(paint, f7 * this.strokeOpacity)) {
                U(canvas, paint);
                return;
            }
            return;
        }
        int size = this.f17859F.size();
        if (size > 0) {
            T(paint, u().b());
            for (int i7 = 0; i7 < size; i7++) {
                String str = (String) this.f17859F.get(i7);
                Matrix matrix = (Matrix) this.f17860G.get(i7);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        r(canvas, paint, f7);
    }

    @Override // com.horcrux.svg.h0, com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f17856C;
        if (path != null) {
            return path;
        }
        if (this.f17857D == null) {
            Path pathD = D(canvas, paint);
            this.f17856C = pathD;
            return pathD;
        }
        a0();
        w();
        this.f17856C = W(b0(this.f17857D), paint, canvas);
        v();
        return this.f17856C;
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        if (this.f17857D == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.h0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f17856C = null;
        super.invalidate();
    }
}
