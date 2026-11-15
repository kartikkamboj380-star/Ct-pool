package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.e0;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.M;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
public class m extends D implements M {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f13085G = new ViewGroup.LayoutParams(0, 0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f13086A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f13087B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f13088C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f13089D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.facebook.react.views.view.g f13090E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Spannable f13091F;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f13093u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextUtils.TruncateAt f13094v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f13095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f13096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f13097y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f13098z;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public m(Context context) {
        super(context);
        s();
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof e0) {
            context = ((e0) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private void r() {
        if (!Float.isNaN(this.f13096x)) {
            setTextSize(0, this.f13096x);
        }
        if (Float.isNaN(this.f13098z)) {
            return;
        }
        super.setLetterSpacing(this.f13098z);
    }

    private void s() {
        com.facebook.react.views.view.g gVar = this.f13090E;
        if (gVar != null) {
            gVar.a();
        }
        this.f13090E = new com.facebook.react.views.view.g(this);
        this.f13093u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f13095w = false;
        this.f13086A = 0;
        this.f13087B = false;
        this.f13088C = false;
        this.f13089D = false;
        this.f13094v = TextUtils.TruncateAt.END;
        this.f13096x = Float.NaN;
        this.f13097y = Float.NaN;
        this.f13098z = 0.0f;
        this.f13091F = null;
    }

    private static WritableMap t(int i7, int i8, int i9, int i10, int i11, int i12) {
        String str;
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i7 == 8) {
            str = "gone";
        } else {
            if (i7 == 0) {
                writableMapCreateMap.putString("visibility", "visible");
                writableMapCreateMap.putInt("index", i8);
                writableMapCreateMap.putDouble("left", G.b(i9));
                writableMapCreateMap.putDouble("top", G.b(i10));
                writableMapCreateMap.putDouble("right", G.b(i11));
                writableMapCreateMap.putDouble("bottom", G.b(i12));
                return writableMapCreateMap;
            }
            str = "unknown";
        }
        writableMapCreateMap.putString("visibility", str);
        writableMapCreateMap.putInt("index", i8);
        return writableMapCreateMap;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (H.N(this)) {
            C0574a c0574aL = H.l(this);
            if (c0574aL instanceof A.a) {
                return ((A.a) c0574aL).v(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.f13091F;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f13092t && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (M2.n nVar : (M2.n[]) spanned.getSpans(0, spanned.length(), M2.n.class)) {
                if (nVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f13088C);
        if (this.f13092t && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (M2.n nVar : (M2.n[]) spanned.getSpans(0, spanned.length(), M2.n.class)) {
                nVar.c();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f13092t && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (M2.n nVar : (M2.n[]) spanned.getSpans(0, spanned.length(), M2.n.class)) {
                nVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f13095w && getSpanned() != null && this.f13089D) {
            this.f13089D = false;
            Spannable spanned = getSpanned();
            float width = getWidth();
            com.facebook.yoga.p pVar = com.facebook.yoga.p.EXACTLY;
            s.a(spanned, width, pVar, getHeight(), pVar, this.f13097y, this.f13093u, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL);
            setText(getSpanned());
        }
        this.f13090E.d(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f13092t && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (M2.n nVar : (M2.n[]) spanned.getSpans(0, spanned.length(), M2.n.class)) {
                nVar.e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159 A[SYNTHETIC] */
    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        M2.o[] oVarArr;
        int i11;
        int i12;
        Spanned spanned;
        int lineRight;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float lineWidth;
        int id = getId();
        if (!(getText() instanceof Spanned) || C2239a.a(id) == 2) {
            return;
        }
        UIManagerModule uIManagerModule = (UIManagerModule) O1.a.c((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class));
        Spanned spanned2 = (Spanned) getText();
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        M2.o[] oVarArr2 = (M2.o[]) spanned2.getSpans(0, spanned2.length(), M2.o.class);
        ArrayList arrayList = this.f13087B ? new ArrayList(oVarArr2.length) : null;
        int i18 = i9 - i7;
        int i19 = i10 - i8;
        int length = oVarArr2.length;
        int i20 = 0;
        while (i20 < length) {
            M2.o oVar = oVarArr2[i20];
            View viewResolveView = uIManagerModule.resolveView(oVar.b());
            int spanStart = spanned2.getSpanStart(oVar);
            int lineForOffset = layout.getLineForOffset(spanStart);
            if ((layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.f13093u && spanStart < layout.getLineEnd(lineForOffset)) {
                int iC = oVar.c();
                int iA = oVar.a();
                oVarArr = oVarArr2;
                boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
                i11 = length;
                i12 = id;
                boolean z7 = layout.getParagraphDirection(lineForOffset) == -1;
                if (spanStart == spanned2.length() - 1) {
                    if (spanned2.length() > 0) {
                        spanned = spanned2;
                        if (spanned2.charAt(layout.getLineEnd(lineForOffset) - 1) == '\n') {
                            lineWidth = layout.getLineMax(lineForOffset);
                        }
                        if (z7) {
                            lineRight = (int) layout.getLineRight(lineForOffset);
                            lineRight -= iC;
                            int totalPaddingRight = lineRight + (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                            int i21 = i7 + totalPaddingRight;
                            int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - iA;
                            int i22 = i8 + totalPaddingTop;
                            if (i18 <= totalPaddingRight) {
                                int i23 = i21 + iC;
                                int i24 = i22 + iA;
                                viewResolveView.setVisibility(i13);
                                viewResolveView.layout(i21, i22, i23, i24);
                                if (!this.f13087B) {
                                }
                            }
                        } else {
                            lineRight = i18 - ((int) lineWidth);
                            int totalPaddingRight2 = lineRight + (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                            int i212 = i7 + totalPaddingRight2;
                            int totalPaddingTop2 = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - iA;
                            int i222 = i8 + totalPaddingTop2;
                            i13 = (i18 <= totalPaddingRight2 || i19 <= totalPaddingTop2) ? 8 : 0;
                            int i232 = i212 + iC;
                            int i242 = i222 + iA;
                            viewResolveView.setVisibility(i13);
                            viewResolveView.layout(i212, i222, i232, i242);
                            if (!this.f13087B) {
                                i14 = i212;
                                i15 = i222;
                                i16 = i232;
                                i17 = i242;
                                arrayList.add(t(i13, spanStart, i14, i15, i16, i17));
                            }
                        }
                    } else {
                        spanned = spanned2;
                    }
                    lineWidth = layout.getLineWidth(lineForOffset);
                    if (z7) {
                    }
                } else {
                    spanned = spanned2;
                    int primaryHorizontal = (int) (z7 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart));
                    lineRight = z7 ? i18 - (((int) layout.getLineRight(lineForOffset)) - primaryHorizontal) : primaryHorizontal;
                    if (zIsRtlCharAt) {
                        lineRight -= iC;
                    }
                    int totalPaddingRight22 = lineRight + (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                    int i2122 = i7 + totalPaddingRight22;
                    int totalPaddingTop22 = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - iA;
                    int i2222 = i8 + totalPaddingTop22;
                    if (i18 <= totalPaddingRight22) {
                    }
                }
            } else {
                i12 = id;
                spanned = spanned2;
                oVarArr = oVarArr2;
                i11 = length;
                viewResolveView.setVisibility(8);
                if (this.f13087B) {
                    i16 = -1;
                    i17 = -1;
                    i13 = 8;
                    i14 = -1;
                    i15 = -1;
                    arrayList.add(t(i13, spanStart, i14, i15, i16, i17));
                }
            }
            i20++;
            length = i11;
            oVarArr2 = oVarArr;
            id = i12;
            spanned2 = spanned;
        }
        int i25 = id;
        if (this.f13087B) {
            Collections.sort(arrayList, new a());
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap((WritableMap) it.next());
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putArray("inlineViews", writableArrayCreateArray);
            if (uIManagerModule != null) {
                uIManagerModule.receiveEvent(i25, "topInlineViewLayout", writableMapCreateMap);
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f13092t && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (M2.n nVar : (M2.n[]) spanned.getSpans(0, spanned.length(), M2.n.class)) {
                nVar.f();
            }
        }
    }

    @Override // com.facebook.react.uimanager.M
    public int reactTagForTouch(float f7, float f8) {
        int i7;
        CharSequence text = getText();
        int id = getId();
        int i8 = (int) f7;
        int i9 = (int) f8;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i9);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i8 >= lineLeft && i8 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i8);
                M2.j[] jVarArr = (M2.j[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, M2.j.class);
                if (jVarArr != null) {
                    int length = text.length();
                    for (int i10 = 0; i10 < jVarArr.length; i10++) {
                        int spanStart = spanned.getSpanStart(jVarArr[i10]);
                        int spanEnd = spanned.getSpanEnd(jVarArr[i10]);
                        if (spanEnd >= offsetForHorizontal && (i7 = spanEnd - spanStart) <= length) {
                            id = jVarArr[i10].a();
                            length = i7;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e7) {
                P0.a.j("ReactNative", "Crash in HorizontalMeasurementProvider: " + e7.getMessage());
            }
        }
        return id;
    }

    public void setAdjustFontSizeToFit(boolean z6) {
        this.f13095w = z6;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f13090E.e(i7);
    }

    public void setBorderRadius(float f7) {
        this.f13090E.g(f7);
    }

    public void setBorderStyle(String str) {
        this.f13090E.i(str);
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i7) {
        super.setBreakStrategy(i7);
        this.f13089D = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f13094v = truncateAt;
    }

    public void setFontSize(float f7) {
        this.f13096x = (float) Math.ceil(this.f13095w ? G.f(f7) : G.d(f7));
        r();
    }

    void setGravityHorizontal(int i7) {
        if (i7 == 0) {
            i7 = 8388611;
        }
        setGravity(i7 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i7) {
        if (i7 == 0) {
            i7 = 48;
        }
        setGravity(i7 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i7) {
        super.setHyphenationFrequency(i7);
        this.f13089D = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z6) {
        super.setIncludeFontPadding(z6);
        this.f13089D = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f7) {
        if (Float.isNaN(f7)) {
            return;
        }
        this.f13098z = G.d(f7) / this.f13096x;
        r();
    }

    public void setLinkifyMask(int i7) {
        this.f13086A = i7;
    }

    public void setMinimumFontSize(float f7) {
        this.f13097y = f7;
        this.f13089D = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z6) {
        this.f13087B = z6;
    }

    public void setNumberOfLines(int i7) {
        if (i7 == 0) {
            i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f13093u = i7;
        setMaxLines(i7);
        this.f13089D = true;
    }

    public void setOverflow(String str) {
        this.f13090E.k(str);
    }

    public void setSpanned(Spannable spannable) {
        this.f13091F = spannable;
        this.f13089D = true;
    }

    public void setText(i iVar) {
        this.f13092t = iVar.b();
        if (getLayoutParams() == null) {
            setLayoutParams(f13085G);
        }
        Spannable spannableI = iVar.i();
        int i7 = this.f13086A;
        if (i7 > 0) {
            Linkify.addLinks(spannableI, i7);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(spannableI);
        float f7 = iVar.f();
        float fH = iVar.h();
        float fG = iVar.g();
        float fE = iVar.e();
        if (f7 != -1.0f && fH != -1.0f && fG != -1.0f && fE != -1.0f) {
            setPadding((int) Math.floor(f7), (int) Math.floor(fH), (int) Math.floor(fG), (int) Math.floor(fE));
        }
        int iJ = iVar.j();
        if (iJ != getGravityHorizontal()) {
            setGravityHorizontal(iJ);
        }
        if (getBreakStrategy() != iVar.k()) {
            setBreakStrategy(iVar.k());
        }
        if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != iVar.d()) {
            setJustificationMode(iVar.d());
        }
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z6) {
        this.f13088C = z6;
        super.setTextIsSelectable(z6);
    }

    void u() {
        s();
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(f13085G);
        super.setText((CharSequence) null);
        r();
        setGravity(8388659);
        setNumberOfLines(this.f13093u);
        setAdjustFontSizeToFit(this.f13095w);
        setLinkifyMask(this.f13086A);
        setTextIsSelectable(this.f13088C);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.f13094v);
        setEnabled(true);
        if (i7 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        y();
    }

    public void v(int i7, float f7, float f8) {
        this.f13090E.f(i7, f7, f8);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f13092t && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (M2.n nVar : (M2.n[]) spanned.getSpans(0, spanned.length(), M2.n.class)) {
                if (nVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void w(float f7, int i7) {
        this.f13090E.h(f7, i7);
    }

    public void x(int i7, float f7) {
        this.f13090E.j(i7, f7);
    }

    public void y() {
        setEllipsize((this.f13093u == Integer.MAX_VALUE || this.f13095w) ? null : this.f13094v);
    }
}
