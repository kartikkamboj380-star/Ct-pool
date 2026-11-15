package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.U;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.p0;
import java.util.ArrayList;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public class h extends c {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final TextPaint f13068f0 = new TextPaint(1);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Spannable f13069b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f13070c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final com.facebook.yoga.o f13071d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final com.facebook.yoga.b f13072e0;

    class a implements com.facebook.yoga.o {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
        @Override // com.facebook.yoga.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long V(com.facebook.yoga.r rVar, float f7, com.facebook.yoga.p pVar, float f8, com.facebook.yoga.p pVar2) {
            float lineBottom;
            float fCeil = f7;
            Spannable spannable = (Spannable) O1.a.d(h.this.f13069b0, "Spannable element has not been prepared in onBeforeLayout");
            Layout layoutF1 = h.this.F1(spannable, fCeil, pVar);
            h hVar = h.this;
            int i7 = -1;
            int i8 = 0;
            int i9 = 1;
            if (hVar.f13038T) {
                int iC = hVar.f13019A.c();
                int iC2 = h.this.f13019A.c();
                float f9 = iC;
                int iMax = (int) Math.max(h.this.f13039U * f9, G.d(4.0f));
                while (iC2 > iMax && ((h.this.f13026H != i7 && layoutF1.getLineCount() > h.this.f13026H) || (pVar2 != com.facebook.yoga.p.UNDEFINED && layoutF1.getHeight() > f8))) {
                    iC2 -= Math.max(i9, (int) G.d(1.0f));
                    float f10 = iC2 / f9;
                    M2.d[] dVarArr = (M2.d[]) spannable.getSpans(i8, spannable.length(), M2.d.class);
                    int length = dVarArr.length;
                    int i10 = i8;
                    while (i10 < length) {
                        M2.d dVar = dVarArr[i10];
                        spannable.setSpan(new M2.d((int) Math.max(dVar.getSize() * f10, iMax)), spannable.getSpanStart(dVar), spannable.getSpanEnd(dVar), spannable.getSpanFlags(dVar));
                        spannable.removeSpan(dVar);
                        i10++;
                        f10 = f10;
                    }
                    layoutF1 = h.this.F1(spannable, fCeil, pVar);
                    i7 = -1;
                    i8 = 0;
                    i9 = 1;
                }
            }
            if (h.this.f13070c0) {
                C0872e0 c0872e0G = h.this.G();
                WritableArray writableArrayA = com.facebook.react.views.text.b.a(spannable, layoutF1, h.f13068f0, c0872e0G);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("lines", writableArrayA);
                if (c0872e0G.hasActiveReactInstance()) {
                    ((RCTEventEmitter) c0872e0G.getJSModule(RCTEventEmitter.class)).receiveEvent(h.this.r(), "topTextLayout", writableMapCreateMap);
                } else {
                    ReactSoftExceptionLogger.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
                }
            }
            int i11 = h.this.f13026H;
            int lineCount = i11 == -1 ? layoutF1.getLineCount() : Math.min(i11, layoutF1.getLineCount());
            if (pVar != com.facebook.yoga.p.EXACTLY) {
                float f11 = 0.0f;
                for (int i12 = 0; i12 < lineCount; i12++) {
                    float lineWidth = (spannable.length() <= 0 || spannable.charAt(layoutF1.getLineEnd(i12) - 1) != '\n') ? layoutF1.getLineWidth(i12) : layoutF1.getLineMax(i12);
                    if (lineWidth > f11) {
                        f11 = lineWidth;
                    }
                }
                if (pVar != com.facebook.yoga.p.AT_MOST || f11 <= fCeil) {
                    fCeil = f11;
                }
            }
            if (Build.VERSION.SDK_INT > 29) {
                fCeil = (float) Math.ceil(fCeil);
            }
            if (pVar2 != com.facebook.yoga.p.EXACTLY) {
                lineBottom = layoutF1.getLineBottom(lineCount - 1);
                if (pVar2 == com.facebook.yoga.p.AT_MOST && lineBottom > f8) {
                    lineBottom = f8;
                }
            }
            return com.facebook.yoga.q.a(fCeil, lineBottom);
        }
    }

    class b implements com.facebook.yoga.b {
        b() {
        }

        @Override // com.facebook.yoga.b
        public float a(com.facebook.yoga.r rVar, float f7, float f8) {
            Layout layoutF1 = h.this.F1((Spannable) O1.a.d(h.this.f13069b0, "Spannable element has not been prepared in onBeforeLayout"), f7, com.facebook.yoga.p.EXACTLY);
            return layoutF1.getLineBaseline(layoutF1.getLineCount() - 1);
        }
    }

    public h(n nVar) {
        super(nVar);
        this.f13071d0 = new a();
        this.f13072e0 = new b();
        E1();
    }

    private int D1() {
        int i7 = this.f13027I;
        if (h0() != com.facebook.yoga.h.RTL) {
            return i7;
        }
        if (i7 == 5) {
            return 3;
        }
        if (i7 == 3) {
            return 5;
        }
        return i7;
    }

    private void E1() {
        if (u()) {
            return;
        }
        Y0(this.f13071d0);
        G0(this.f13072e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[PHI: r12
      0x0085: PHI (r12v10 android.text.StaticLayout$Builder) = (r12v6 android.text.StaticLayout$Builder), (r12v16 android.text.StaticLayout$Builder) binds: [B:44:0x00da, B:32:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Layout F1(Spannable spannable, float f7, com.facebook.yoga.p pVar) {
        StaticLayout.Builder hyphenationFrequency;
        TextPaint textPaint = f13068f0;
        textPaint.setTextSize(this.f13019A.c());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z6 = pVar == com.facebook.yoga.p.UNDEFINED || f7 < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int iD1 = D1();
        if (iD1 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (iD1 != 3 && iD1 == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (metricsIsBoring == null && (z6 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f7))) {
            hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f13037S).setBreakStrategy(this.f13028J).setHyphenationFrequency(this.f13029K);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                hyphenationFrequency.setJustificationMode(this.f13030L);
            }
            if (i7 >= 28) {
            }
        } else {
            if (metricsIsBoring != null && (z6 || metricsIsBoring.width <= f7)) {
                return BoringLayout.make(spannable, textPaint, Math.max(metricsIsBoring.width, 0), alignment2, 1.0f, 0.0f, metricsIsBoring, this.f13037S);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 > 29) {
                f7 = (float) Math.ceil(f7);
            }
            hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f7).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f13037S).setBreakStrategy(this.f13028J).setHyphenationFrequency(this.f13029K);
            if (i8 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
        }
        return hyphenationFrequency.build();
    }

    @Override // com.facebook.react.uimanager.V
    public void A0(p0 p0Var) {
        super.A0(p0Var);
        Spannable spannable = this.f13069b0;
        if (spannable != null) {
            p0Var.O(r(), new i(spannable, -1, this.f13044Z, l0(4), l0(1), l0(5), l0(3), D1(), this.f13028J, this.f13030L));
        }
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public void W(D d7) {
        this.f13069b0 = y1(this, null, true, d7);
        y0();
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public Iterable o() {
        Map map = this.f13045a0;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) O1.a.d(this.f13069b0, "Spannable element has not been prepared in onBeforeLayout");
        M2.o[] oVarArr = (M2.o[]) spanned.getSpans(0, spanned.length(), M2.o.class);
        ArrayList arrayList = new ArrayList(oVarArr.length);
        for (M2.o oVar : oVarArr) {
            U u6 = (U) this.f13045a0.get(Integer.valueOf(oVar.b()));
            u6.t();
            arrayList.add(u6);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.V
    public boolean p0() {
        return true;
    }

    @InterfaceC2218a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z6) {
        this.f13070c0 = z6;
    }

    @Override // com.facebook.react.uimanager.V
    public boolean v0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.V
    public void y0() {
        super.y0();
        super.i();
    }
}
