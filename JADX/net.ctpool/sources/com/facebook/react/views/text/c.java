package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C0892s;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.U;
import com.facebook.react.uimanager.V;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends C0895v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected r f13019A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected boolean f13020B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected int f13021C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f13022D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected int f13023E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected I.e f13024F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected I.f f13025G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected int f13026H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected int f13027I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f13028J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected int f13029K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected int f13030L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected float f13031M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected float f13032N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected float f13033O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected int f13034P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected boolean f13035Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected boolean f13036R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected boolean f13037S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f13038T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected float f13039U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected int f13040V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected int f13041W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected String f13042X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected String f13043Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected boolean f13044Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected Map f13045a0;

    public c() {
        this(null);
    }

    private static void x1(c cVar, SpannableStringBuilder spannableStringBuilder, List list, r rVar, boolean z6, Map map, int i7) {
        float fD0;
        float fL;
        r rVarA = cVar.f13019A;
        if (rVar != null) {
            rVarA = rVar.a(rVarA);
        }
        r rVar2 = rVarA;
        int iB = cVar.b();
        for (int i8 = 0; i8 < iB; i8++) {
            V vA = cVar.a(i8);
            if (vA instanceof e) {
                spannableStringBuilder.append((CharSequence) t.h(((e) vA).w1(), rVar2.l()));
            } else if (vA instanceof c) {
                x1((c) vA, spannableStringBuilder, list, rVar2, z6, map, spannableStringBuilder.length());
            } else if (vA instanceof L2.a) {
                spannableStringBuilder.append("0");
                list.add(new M2.l(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((L2.a) vA).x1()));
            } else {
                if (!z6) {
                    throw new C0892s("Unexpected view type nested under a <Text> or <TextInput> node: " + vA.getClass());
                }
                int iR = vA.r();
                YogaValue yogaValueD = vA.D();
                YogaValue yogaValueN = vA.n();
                w wVar = yogaValueD.f13364b;
                w wVar2 = w.POINT;
                if (wVar == wVar2 && yogaValueN.f13364b == wVar2) {
                    fD0 = yogaValueD.f13363a;
                    fL = yogaValueN.f13363a;
                } else {
                    vA.t();
                    fD0 = vA.d0();
                    fL = vA.l();
                }
                spannableStringBuilder.append("0");
                list.add(new M2.l(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new M2.o(iR, (int) fD0, (int) fL)));
                map.put(Integer.valueOf(iR), vA);
                vA.e();
            }
            vA.e();
        }
        int length = spannableStringBuilder.length();
        if (length >= i7) {
            if (cVar.f13020B) {
                list.add(new M2.l(i7, length, new M2.g(cVar.f13021C)));
            }
            if (cVar.f13022D) {
                list.add(new M2.l(i7, length, new M2.e(cVar.f13023E)));
            }
            I.f fVar = cVar.f13025G;
            if (fVar == null ? cVar.f13024F == I.e.LINK : fVar == I.f.LINK) {
                list.add(new M2.l(i7, length, new M2.f(cVar.r())));
            }
            float fD = rVar2.d();
            if (!Float.isNaN(fD) && (rVar == null || rVar.d() != fD)) {
                list.add(new M2.l(i7, length, new M2.a(fD)));
            }
            int iC = rVar2.c();
            if (rVar == null || rVar.c() != iC) {
                list.add(new M2.l(i7, length, new M2.d(iC)));
            }
            if (cVar.f13040V != -1 || cVar.f13041W != -1 || cVar.f13042X != null) {
                list.add(new M2.l(i7, length, new M2.c(cVar.f13040V, cVar.f13041W, cVar.f13043Y, cVar.f13042X, cVar.G().getAssets())));
            }
            if (cVar.f13035Q) {
                list.add(new M2.l(i7, length, new M2.k()));
            }
            if (cVar.f13036R) {
                list.add(new M2.l(i7, length, new M2.i()));
            }
            if ((cVar.f13031M != 0.0f || cVar.f13032N != 0.0f || cVar.f13033O != 0.0f) && Color.alpha(cVar.f13034P) != 0) {
                list.add(new M2.l(i7, length, new M2.m(cVar.f13031M, cVar.f13032N, cVar.f13033O, cVar.f13034P)));
            }
            float fE = rVar2.e();
            if (!Float.isNaN(fE) && (rVar == null || rVar.e() != fE)) {
                list.add(new M2.l(i7, length, new M2.b(fE)));
            }
            list.add(new M2.l(i7, length, new M2.j(cVar.r())));
        }
    }

    @InterfaceC2218a(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (u()) {
            this.f13024F = I.e.j(str);
            y0();
        }
    }

    @InterfaceC2218a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z6) {
        if (z6 != this.f13038T) {
            this.f13038T = z6;
            y0();
        }
    }

    @InterfaceC2218a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z6) {
        if (z6 != this.f13019A.b()) {
            this.f13019A.m(z6);
            y0();
        }
    }

    @InterfaceC2218a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (u()) {
            boolean z6 = num != null;
            this.f13022D = z6;
            if (z6) {
                this.f13023E = num.intValue();
            }
            y0();
        }
    }

    @InterfaceC2218a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z6 = num != null;
        this.f13020B = z6;
        if (z6) {
            this.f13021C = num.intValue();
        }
        y0();
    }

    @InterfaceC2218a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f13042X = str;
        y0();
    }

    @InterfaceC2218a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f7) {
        this.f13019A.n(f7);
        y0();
    }

    @InterfaceC2218a(name = "fontStyle")
    public void setFontStyle(String str) {
        int iB = o.b(str);
        if (iB != this.f13040V) {
            this.f13040V = iB;
            y0();
        }
    }

    @InterfaceC2218a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strC = o.c(readableArray);
        if (TextUtils.equals(strC, this.f13043Y)) {
            return;
        }
        this.f13043Y = strC;
        y0();
    }

    @InterfaceC2218a(name = "fontWeight")
    public void setFontWeight(String str) {
        int iD = o.d(str);
        if (iD != this.f13041W) {
            this.f13041W = iD;
            y0();
        }
    }

    @InterfaceC2218a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z6) {
        this.f13037S = z6;
    }

    @InterfaceC2218a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f7) {
        this.f13019A.p(f7);
        y0();
    }

    @InterfaceC2218a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f7) {
        this.f13019A.q(f7);
        y0();
    }

    @InterfaceC2218a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f7) {
        if (f7 != this.f13019A.k()) {
            this.f13019A.r(f7);
            y0();
        }
    }

    @InterfaceC2218a(name = "minimumFontScale")
    public void setMinimumFontScale(float f7) {
        if (f7 != this.f13039U) {
            this.f13039U = f7;
            y0();
        }
    }

    @InterfaceC2218a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i7) {
        if (i7 == 0) {
            i7 = -1;
        }
        this.f13026H = i7;
        y0();
    }

    @InterfaceC2218a(name = "role")
    public void setRole(String str) {
        if (u()) {
            this.f13025G = I.f.h(str);
            y0();
        }
    }

    @InterfaceC2218a(name = "textAlign")
    public void setTextAlign(String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f13030L = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f13027I = 0;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.f13027I = 5;
                } else if ("center".equals(str)) {
                    this.f13027I = 1;
                } else {
                    P0.a.G("ReactNative", "Invalid textAlign: " + str);
                    this.f13027I = 0;
                }
            }
            y0();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13030L = 1;
        }
        this.f13027I = 3;
        y0();
    }

    @InterfaceC2218a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        int i7;
        if (str == null || "highQuality".equals(str)) {
            this.f13028J = 1;
        } else {
            if ("simple".equals(str)) {
                i7 = 0;
            } else if ("balanced".equals(str)) {
                i7 = 2;
            } else {
                P0.a.G("ReactNative", "Invalid textBreakStrategy: " + str);
                this.f13028J = 1;
            }
            this.f13028J = i7;
        }
        y0();
    }

    @InterfaceC2218a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f13035Q = false;
        this.f13036R = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f13035Q = true;
                } else if ("line-through".equals(str2)) {
                    this.f13036R = true;
                }
            }
        }
        y0();
    }

    @InterfaceC2218a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i7) {
        if (i7 != this.f13034P) {
            this.f13034P = i7;
            y0();
        }
    }

    @InterfaceC2218a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f13031M = 0.0f;
        this.f13032N = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f13031M = G.c(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f13032N = G.c(readableMap.getDouble("height"));
            }
        }
        y0();
    }

    @InterfaceC2218a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f7) {
        if (f7 != this.f13033O) {
            this.f13033O = f7;
            y0();
        }
    }

    @InterfaceC2218a(name = "textTransform")
    public void setTextTransform(String str) {
        r rVar;
        t tVar;
        if (str == null) {
            rVar = this.f13019A;
            tVar = t.UNSET;
        } else if ("none".equals(str)) {
            rVar = this.f13019A;
            tVar = t.NONE;
        } else if ("uppercase".equals(str)) {
            rVar = this.f13019A;
            tVar = t.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            rVar = this.f13019A;
            tVar = t.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            rVar = this.f13019A;
            tVar = t.CAPITALIZE;
        } else {
            P0.a.G("ReactNative", "Invalid textTransform: " + str);
            rVar = this.f13019A;
            tVar = t.UNSET;
        }
        rVar.s(tVar);
        y0();
    }

    protected Spannable y1(c cVar, String str, boolean z6, D d7) {
        int iB;
        O1.a.b((z6 && d7 == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z6 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) t.h(str, cVar.f13019A.l()));
        }
        x1(cVar, spannableStringBuilder, arrayList, null, z6, map, 0);
        cVar.f13044Z = false;
        cVar.f13045a0 = map;
        float f7 = Float.NaN;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            M2.l lVar = (M2.l) arrayList.get((arrayList.size() - i7) - 1);
            M2.h hVar = lVar.f2039c;
            boolean z7 = hVar instanceof M2.n;
            if (z7 || (hVar instanceof M2.o)) {
                if (z7) {
                    iB = ((M2.n) hVar).b();
                    cVar.f13044Z = true;
                } else {
                    M2.o oVar = (M2.o) hVar;
                    int iA = oVar.a();
                    U u6 = (U) map.get(Integer.valueOf(oVar.b()));
                    d7.h(u6);
                    u6.O(cVar);
                    iB = iA;
                }
                if (Float.isNaN(f7) || iB > f7) {
                    f7 = iB;
                }
            }
            lVar.a(spannableStringBuilder, i7);
        }
        cVar.f13019A.o(f7);
        return spannableStringBuilder;
    }

    public c(n nVar) {
        this.f13020B = false;
        this.f13022D = false;
        this.f13024F = null;
        this.f13025G = null;
        this.f13026H = -1;
        this.f13027I = 0;
        this.f13028J = 1;
        this.f13029K = 0;
        this.f13030L = 0;
        this.f13031M = 0.0f;
        this.f13032N = 0.0f;
        this.f13033O = 0.0f;
        this.f13034P = 1426063360;
        this.f13035Q = false;
        this.f13036R = false;
        this.f13037S = true;
        this.f13038T = false;
        this.f13039U = 0.0f;
        this.f13040V = -1;
        this.f13041W = -1;
        this.f13042X = null;
        this.f13043Y = null;
        this.f13044Z = false;
        this.f13019A = new r();
    }
}
