package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.G;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13137a = "s";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TextPaint f13138b = new TextPaint(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap f13139c = new ConcurrentHashMap();

    public static void a(Spannable spannable, float f7, com.facebook.yoga.p pVar, float f8, com.facebook.yoga.p pVar2, double d7, int i7, boolean z6, int i8, int i9, Layout.Alignment alignment) {
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, f13138b);
        Layout layoutC = c(spannable, metricsIsBoring, f7, pVar, z6, i8, i9, alignment);
        int iD = (int) (Double.isNaN(d7) ? G.d(4.0f) : d7);
        int i10 = 0;
        int iMax = iD;
        for (M2.d dVar : (M2.d[]) spannable.getSpans(0, spannable.length(), M2.d.class)) {
            iMax = Math.max(iMax, dVar.getSize());
        }
        int i11 = iMax;
        while (i11 > iD) {
            if ((i7 == -1 || i7 == 0 || layoutC.getLineCount() <= i7) && (pVar2 == com.facebook.yoga.p.UNDEFINED || layoutC.getHeight() <= f8)) {
                return;
            }
            int iMax2 = i11 - Math.max(1, (int) G.d(1.0f));
            float f9 = iMax2 / iMax;
            M2.d[] dVarArr = (M2.d[]) spannable.getSpans(i10, spannable.length(), M2.d.class);
            int length = dVarArr.length;
            int i12 = i10;
            while (i12 < length) {
                M2.d dVar2 = dVarArr[i12];
                spannable.setSpan(new M2.d((int) Math.max(dVar2.getSize() * f9, iD)), spannable.getSpanStart(dVar2), spannable.getSpanEnd(dVar2), spannable.getSpanFlags(dVar2));
                spannable.removeSpan(dVar2);
                i12++;
                f9 = f9;
            }
            layoutC = c(spannable, metricsIsBoring, f7, pVar, z6, i8, i9, alignment);
            i11 = iMax2;
            i10 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r21.add(new M2.l(r6, r8, new M2.f(r11)));
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(Context context, com.facebook.react.common.mapbuffer.a aVar, SpannableStringBuilder spannableStringBuilder, List list) {
        int count = aVar.getCount();
        for (int i7 = 0; i7 < count; i7++) {
            com.facebook.react.common.mapbuffer.a aVarD0 = aVar.D0(i7);
            int length = spannableStringBuilder.length();
            q qVarA = q.a(aVarD0.D0(5));
            spannableStringBuilder.append((CharSequence) t.h(aVarD0.getString(0), qVarA.f13117n));
            int length2 = spannableStringBuilder.length();
            int i8 = aVarD0.j0(1) ? aVarD0.getInt(1) : -1;
            if (aVarD0.j0(2) && aVarD0.getBoolean(2)) {
                list.add(new M2.l(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new M2.o(i8, (int) G.e(aVarD0.getDouble(3)), (int) G.e(aVarD0.getDouble(4)))));
            } else if (length2 >= length) {
                if ((r5 = qVarA.f13126w) != null) {
                    if (qVarA.f13105b) {
                        list.add(new M2.l(length, length2, new M2.g(qVarA.f13107d)));
                    }
                    if (qVarA.f13108e) {
                        list.add(new M2.l(length, length2, new M2.e(qVarA.f13109f)));
                    }
                    if (!Float.isNaN(qVarA.f())) {
                        list.add(new M2.l(length, length2, new M2.a(qVarA.f())));
                    }
                    list.add(new M2.l(length, length2, new M2.d(qVarA.f13111h)));
                    if (qVarA.f13127x == -1 || qVarA.f13128y != -1 || qVarA.f13129z != null) {
                        list.add(new M2.l(length, length2, new M2.c(qVarA.f13127x, qVarA.f13128y, qVarA.f13101A, qVarA.f13129z, context.getAssets())));
                    }
                    if (qVarA.f13122s) {
                        list.add(new M2.l(length, length2, new M2.k()));
                    }
                    if (qVarA.f13123t) {
                        list.add(new M2.l(length, length2, new M2.i()));
                    }
                    if ((qVarA.f13118o == 0.0f || qVarA.f13119p != 0.0f || qVarA.f13120q != 0.0f) && Color.alpha(qVarA.f13121r) != 0) {
                        list.add(new M2.l(length, length2, new M2.m(qVarA.f13118o, qVarA.f13119p, qVarA.f13120q, qVarA.f13121r)));
                    }
                    if (!Float.isNaN(qVarA.b())) {
                        list.add(new M2.l(length, length2, new M2.b(qVarA.b())));
                    }
                    list.add(new M2.l(length, length2, new M2.j(i8)));
                } else {
                    if (qVarA.f13105b) {
                    }
                    if (qVarA.f13108e) {
                    }
                    if (!Float.isNaN(qVarA.f())) {
                    }
                    list.add(new M2.l(length, length2, new M2.d(qVarA.f13111h)));
                    if (qVarA.f13127x == -1) {
                        list.add(new M2.l(length, length2, new M2.c(qVarA.f13127x, qVarA.f13128y, qVarA.f13101A, qVarA.f13129z, context.getAssets())));
                        if (qVarA.f13122s) {
                        }
                        if (qVarA.f13123t) {
                        }
                        if (qVarA.f13118o == 0.0f) {
                            list.add(new M2.l(length, length2, new M2.m(qVarA.f13118o, qVarA.f13119p, qVarA.f13120q, qVarA.f13121r)));
                            if (!Float.isNaN(qVarA.b())) {
                            }
                            list.add(new M2.l(length, length2, new M2.j(i8)));
                        } else {
                            list.add(new M2.l(length, length2, new M2.m(qVarA.f13118o, qVarA.f13119p, qVarA.f13120q, qVarA.f13121r)));
                            if (!Float.isNaN(qVarA.b())) {
                            }
                            list.add(new M2.l(length, length2, new M2.j(i8)));
                        }
                    }
                }
            }
        }
    }

    private static Layout c(Spannable spannable, BoringLayout.Metrics metrics, float f7, com.facebook.yoga.p pVar, boolean z6, int i7, int i8, Layout.Alignment alignment) {
        StaticLayout.Builder textDirection;
        int i9;
        int length = spannable.length();
        boolean z7 = pVar == com.facebook.yoga.p.UNDEFINED || f7 < 0.0f;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, f13138b) : Float.NaN;
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        if (metrics == null && (z7 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f7))) {
            if (pVar == com.facebook.yoga.p.EXACTLY) {
                desiredWidth = f7;
            }
            textDirection = StaticLayout.Builder.obtain(spannable, 0, length, f13138b, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z6).setBreakStrategy(i7).setHyphenationFrequency(i8).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        } else {
            if (metrics != null && (z7 || metrics.width <= f7)) {
                int iCeil = metrics.width;
                if (pVar == com.facebook.yoga.p.EXACTLY) {
                    iCeil = (int) Math.ceil(f7);
                }
                if (metrics.width < 0) {
                    ReactSoftExceptionLogger.logSoftException(f13137a, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
                    i9 = 0;
                } else {
                    i9 = iCeil;
                }
                return BoringLayout.make(spannable, f13138b, i9, alignment, 1.0f, 0.0f, metrics, z6);
            }
            textDirection = StaticLayout.Builder.obtain(spannable, 0, length, f13138b, (int) Math.ceil(f7)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z6).setBreakStrategy(i7).setHyphenationFrequency(i8).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (Build.VERSION.SDK_INT >= 28) {
                textDirection.setUseLineSpacingFromFallbacks(true);
            }
        }
        return textDirection.build();
    }

    private static Spannable d(Context context, com.facebook.react.common.mapbuffer.a aVar, n nVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        b(context, aVar.D0(2), spannableStringBuilder, arrayList);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((M2.l) arrayList.get((arrayList.size() - i7) - 1)).a(spannableStringBuilder, i7);
        }
        if (nVar != null) {
            nVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void e(int i7) {
        f13139c.remove(Integer.valueOf(i7));
    }

    public static Spannable f(Context context, com.facebook.react.common.mapbuffer.a aVar, n nVar) {
        if (!aVar.j0(3)) {
            return d(context, aVar, nVar);
        }
        return (Spannable) f13139c.get(Integer.valueOf(aVar.getInt(3)));
    }

    public static Layout.Alignment g(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable) {
        if (!aVar.j0(2)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        boolean z6 = i(aVar) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z6 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        com.facebook.react.common.mapbuffer.a aVarD0 = aVar.D0(2);
        if (aVarD0.getCount() == 0) {
            return alignment;
        }
        com.facebook.react.common.mapbuffer.a aVarD02 = aVarD0.D0(0).D0(5);
        if (!aVarD02.j0(12)) {
            return alignment;
        }
        String string = aVarD02.getString(12);
        if (string.equals("center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (string.equals("right")) {
            return z6 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return alignment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r4 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r4 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable, int i7) {
        Layout.Alignment alignmentG = g(aVar, spannable);
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        if (alignmentG != Layout.Alignment.ALIGN_NORMAL) {
            if (alignmentG != Layout.Alignment.ALIGN_OPPOSITE) {
                if (alignmentG == Layout.Alignment.ALIGN_CENTER) {
                    return 1;
                }
                return i7;
            }
        }
    }

    public static boolean i(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.j0(2)) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a aVarD0 = aVar.D0(2);
        if (aVarD0.getCount() == 0) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a aVarD02 = aVarD0.D0(0).D0(5);
        return aVarD02.j0(23) && q.e(aVarD02.getString(23)) == 1;
    }

    public static WritableArray j(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f7, float f8) {
        TextPaint textPaint;
        Spannable spannableF = f(context, aVar, null);
        TextPaint textPaint2 = f13138b;
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannableF, textPaint2);
        int iH = q.h(aVar2.getString(2));
        boolean z6 = aVar2.j0(4) ? aVar2.getBoolean(4) : true;
        int iH2 = q.h(aVar2.getString(5));
        boolean z7 = aVar2.j0(3) ? aVar2.getBoolean(3) : false;
        int i7 = aVar2.j0(0) ? aVar2.getInt(0) : -1;
        Layout.Alignment alignmentG = g(aVar, spannableF);
        if (z7) {
            textPaint = textPaint2;
            a(spannableF, f7, com.facebook.yoga.p.EXACTLY, f8, com.facebook.yoga.p.UNDEFINED, aVar2.j0(6) ? aVar2.getDouble(6) : Double.NaN, i7, z6, iH, iH2, alignmentG);
        } else {
            textPaint = textPaint2;
        }
        return b.a(spannableF, c(spannableF, metricsIsBoring, f7, com.facebook.yoga.p.EXACTLY, z6, iH, iH2, alignmentG), textPaint, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long k(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f7, com.facebook.yoga.p pVar, float f8, com.facebook.yoga.p pVar2, n nVar, float[] fArr) {
        int i7;
        int i8;
        int i9;
        float fCeil;
        float lineBottom;
        char c7;
        float lineRight;
        char c8;
        float lineWidth;
        Spannable spannableF = f(context, aVar, nVar);
        if (spannableF == null) {
            return 0L;
        }
        int iH = q.h(aVar2.getString(2));
        boolean z6 = aVar2.j0(4) ? aVar2.getBoolean(4) : true;
        int iC = q.c(aVar2.getString(5));
        boolean z7 = aVar2.j0(3) ? aVar2.getBoolean(3) : false;
        int i10 = aVar2.j0(0) ? aVar2.getInt(0) : -1;
        Layout.Alignment alignmentG = g(aVar, spannableF);
        if (z7) {
            i7 = i10;
            i8 = -1;
            i9 = 0;
            a(spannableF, f7, pVar, f8, pVar2, aVar2.j0(6) ? aVar2.getDouble(6) : Double.NaN, i10, z6, iH, iC, alignmentG);
        } else {
            i7 = i10;
            i8 = -1;
            i9 = 0;
        }
        Layout layoutC = c(spannableF, BoringLayout.isBoring(spannableF, f13138b), f7, pVar, z6, iH, iC, alignmentG);
        int lineCount = (i7 == i8 || i7 == 0) ? layoutC.getLineCount() : Math.min(i7, layoutC.getLineCount());
        char c9 = '\n';
        int i11 = i8;
        if (pVar == com.facebook.yoga.p.EXACTLY) {
            fCeil = f7;
        } else {
            fCeil = 0.0f;
            for (int i12 = i9; i12 < lineCount; i12++) {
                float lineWidth2 = (spannableF.length() <= 0 || spannableF.charAt(layoutC.getLineEnd(i12) + (-1)) != '\n') ? layoutC.getLineWidth(i12) : layoutC.getLineMax(i12);
                if (lineWidth2 > fCeil) {
                    fCeil = lineWidth2;
                }
            }
            if (pVar == com.facebook.yoga.p.AT_MOST && fCeil > f7) {
            }
        }
        if (Build.VERSION.SDK_INT > 29) {
            fCeil = (float) Math.ceil(fCeil);
        }
        if (pVar2 != com.facebook.yoga.p.EXACTLY) {
            lineBottom = layoutC.getLineBottom(lineCount - 1);
            if (pVar2 == com.facebook.yoga.p.AT_MOST && lineBottom > f8) {
                lineBottom = f8;
            }
        }
        int i13 = i9;
        int i14 = i13;
        while (i14 < spannableF.length()) {
            int iNextSpanTransition = spannableF.nextSpanTransition(i14, spannableF.length(), M2.o.class);
            M2.o[] oVarArr = (M2.o[]) spannableF.getSpans(i14, iNextSpanTransition, M2.o.class);
            int length = oVarArr.length;
            int i15 = i9;
            while (i15 < length) {
                M2.o oVar = oVarArr[i15];
                int spanStart = spannableF.getSpanStart(oVar);
                int lineForOffset = layoutC.getLineForOffset(spanStart);
                if (layoutC.getEllipsisCount(lineForOffset) <= 0 || spanStart < layoutC.getLineStart(lineForOffset) + layoutC.getEllipsisStart(lineForOffset) || spanStart >= layoutC.getLineEnd(lineForOffset)) {
                    float fC = oVar.c();
                    float fA = oVar.a();
                    boolean zIsRtlCharAt = layoutC.isRtlCharAt(spanStart);
                    int i16 = layoutC.getParagraphDirection(lineForOffset) == i11 ? 1 : i9;
                    if (spanStart == spannableF.length() - 1) {
                        if (spannableF.length() > 0) {
                            c8 = '\n';
                            if (spannableF.charAt(layoutC.getLineEnd(lineForOffset) - 1) == '\n') {
                                lineWidth = layoutC.getLineMax(lineForOffset);
                            }
                            lineRight = i16 == 0 ? fCeil - lineWidth : layoutC.getLineRight(lineForOffset) - fC;
                            c7 = c8;
                        } else {
                            c8 = '\n';
                        }
                        lineWidth = layoutC.getLineWidth(lineForOffset);
                        if (i16 == 0) {
                        }
                        c7 = c8;
                    } else {
                        c7 = '\n';
                        float primaryHorizontal = i16 == zIsRtlCharAt ? layoutC.getPrimaryHorizontal(spanStart) : layoutC.getSecondaryHorizontal(spanStart);
                        lineRight = (i16 == 0 || zIsRtlCharAt) ? primaryHorizontal : fCeil - (layoutC.getLineRight(lineForOffset) - primaryHorizontal);
                        if (zIsRtlCharAt) {
                            lineRight -= fC;
                        }
                    }
                    float lineBaseline = layoutC.getLineBaseline(lineForOffset) - fA;
                    int i17 = i13 * 2;
                    fArr[i17] = G.b(lineBaseline);
                    fArr[i17 + 1] = G.b(lineRight);
                    i13++;
                } else {
                    c7 = c9;
                }
                i15++;
                c9 = c7;
                i11 = -1;
            }
            i14 = iNextSpanTransition;
        }
        return com.facebook.yoga.q.a(G.b(fCeil), G.b(lineBottom));
    }

    public static void l(int i7, Spannable spannable) {
        f13139c.put(Integer.valueOf(i7), spannable);
    }
}
