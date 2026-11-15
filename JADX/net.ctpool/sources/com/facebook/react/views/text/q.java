package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.common.mapbuffer.a;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.W;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int f13100D = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f13107d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f13109f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f13104a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f13105b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f13106c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f13108e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f13110g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f13111h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f13112i = -1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f13113j = -1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f13114k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f13115l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f13116m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected t f13117n = t.NONE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected float f13118o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected float f13119p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f13120q = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f13121r = 1426063360;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f13122s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f13123t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f13124u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected I.e f13125v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected I.f f13126w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f13127x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f13128y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected String f13129z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected String f13101A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected boolean f13102B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected float f13103C = Float.NaN;

    private q() {
    }

    private void A(String str) {
        t tVar;
        if (str == null || "none".equals(str)) {
            tVar = t.NONE;
        } else if ("uppercase".equals(str)) {
            tVar = t.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            tVar = t.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            tVar = t.CAPITALIZE;
        } else {
            P0.a.G("ReactNative", "Invalid textTransform: " + str);
            tVar = t.NONE;
        }
        this.f13117n = tVar;
    }

    public static q a(com.facebook.react.common.mapbuffer.a aVar) {
        q qVar = new q();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            a.c cVar = (a.c) it.next();
            switch (cVar.getKey()) {
                case 0:
                    qVar.l(Integer.valueOf(cVar.d()));
                    break;
                case 1:
                    qVar.k(Integer.valueOf(cVar.d()));
                    break;
                case 3:
                    qVar.m(cVar.c());
                    break;
                case 4:
                    qVar.n((float) cVar.b());
                    break;
                case 6:
                    qVar.q(cVar.c());
                    break;
                case 7:
                    qVar.o(cVar.c());
                    break;
                case 8:
                    qVar.p(cVar.e());
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    qVar.j(cVar.f());
                    break;
                case 10:
                    qVar.s((float) cVar.b());
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    qVar.t((float) cVar.b());
                    break;
                case 15:
                    qVar.v(cVar.c());
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    qVar.z((float) cVar.b());
                    break;
                case 19:
                    qVar.w(cVar.d());
                    break;
                case 20:
                    qVar.x((float) cVar.b());
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    qVar.y((float) cVar.b());
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    qVar.r(cVar.c());
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    qVar.i(cVar.c());
                    break;
                case 26:
                    qVar.u(I.f.values()[cVar.d()]);
                    break;
                case 27:
                    qVar.A(cVar.c());
                    break;
            }
        }
        return qVar;
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("normal")) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    public static int d(W w6, int i7) {
        if (!w6.c("textAlign")) {
            return i7;
        }
        if (!"justify".equals(w6.b("textAlign")) || Build.VERSION.SDK_INT < 26) {
            return f13100D;
        }
        return 1;
    }

    public static int e(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        P0.a.G("ReactNative", "Invalid layoutDirection: " + str);
        return -1;
    }

    public static int g(W w6, boolean z6, int i7) {
        if (!w6.c("textAlign")) {
            return i7;
        }
        String strB = w6.b("textAlign");
        if ("justify".equals(strB)) {
            return 3;
        }
        if (strB != null && !"auto".equals(strB)) {
            if ("left".equals(strB)) {
                return z6 ? 5 : 3;
            }
            if ("right".equals(strB)) {
                return z6 ? 3 : 5;
            }
            if ("center".equals(strB)) {
                return 1;
            }
            P0.a.G("ReactNative", "Invalid textAlign: " + strB);
        }
        return 0;
    }

    public static int h(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals("simple") ? 1 : 0;
    }

    private void i(String str) {
        this.f13125v = str == null ? null : I.e.j(str);
    }

    private void j(boolean z6) {
        if (z6 != this.f13106c) {
            this.f13106c = z6;
            n(this.f13112i);
            t(this.f13113j);
            s(this.f13114k);
        }
    }

    private void k(Integer num) {
        boolean z6 = num != null;
        this.f13108e = z6;
        if (z6) {
            this.f13109f = num.intValue();
        }
    }

    private void l(Integer num) {
        boolean z6 = num != null;
        this.f13105b = z6;
        if (z6) {
            this.f13107d = num.intValue();
        }
    }

    private void m(String str) {
        this.f13129z = str;
    }

    private void n(float f7) {
        this.f13112i = f7;
        if (f7 != -1.0f) {
            f7 = (float) Math.ceil(this.f13106c ? G.f(f7) : G.d(f7));
        }
        this.f13111h = (int) f7;
    }

    private void o(String str) {
        this.f13127x = o.b(str);
    }

    private void p(com.facebook.react.common.mapbuffer.a aVar) {
        String strJoin;
        String str;
        if (aVar == null || aVar.getCount() == 0) {
            strJoin = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = aVar.iterator();
            while (it.hasNext()) {
                String strC = ((a.c) it.next()).c();
                if (strC != null) {
                    switch (strC) {
                        case "stylistic-thirteen":
                            str = "'ss13'";
                            arrayList.add(str);
                            break;
                        case "stylistic-fifteen":
                            str = "'ss15'";
                            arrayList.add(str);
                            break;
                        case "stylistic-eighteen":
                            str = "'ss18'";
                            arrayList.add(str);
                            break;
                        case "proportional-nums":
                            str = "'pnum'";
                            arrayList.add(str);
                            break;
                        case "lining-nums":
                            str = "'lnum'";
                            arrayList.add(str);
                            break;
                        case "tabular-nums":
                            str = "'tnum'";
                            arrayList.add(str);
                            break;
                        case "oldstyle-nums":
                            str = "'onum'";
                            arrayList.add(str);
                            break;
                        case "stylistic-eight":
                            str = "'ss08'";
                            arrayList.add(str);
                            break;
                        case "stylistic-seven":
                            str = "'ss07'";
                            arrayList.add(str);
                            break;
                        case "stylistic-three":
                            str = "'ss03'";
                            arrayList.add(str);
                            break;
                        case "stylistic-eleven":
                            str = "'ss11'";
                            arrayList.add(str);
                            break;
                        case "stylistic-five":
                            str = "'ss05'";
                            arrayList.add(str);
                            break;
                        case "stylistic-four":
                            str = "'ss04'";
                            arrayList.add(str);
                            break;
                        case "stylistic-nine":
                            str = "'ss09'";
                            arrayList.add(str);
                            break;
                        case "stylistic-one":
                            str = "'ss01'";
                            arrayList.add(str);
                            break;
                        case "stylistic-six":
                            str = "'ss06'";
                            arrayList.add(str);
                            break;
                        case "stylistic-ten":
                            str = "'ss10'";
                            arrayList.add(str);
                            break;
                        case "stylistic-two":
                            str = "'ss02'";
                            arrayList.add(str);
                            break;
                        case "stylistic-sixteen":
                            str = "'ss16'";
                            arrayList.add(str);
                            break;
                        case "stylistic-twelve":
                            str = "'ss12'";
                            arrayList.add(str);
                            break;
                        case "stylistic-twenty":
                            str = "'ss20'";
                            arrayList.add(str);
                            break;
                        case "small-caps":
                            str = "'smcp'";
                            arrayList.add(str);
                            break;
                        case "stylistic-nineteen":
                            str = "'ss19'";
                            arrayList.add(str);
                            break;
                        case "stylistic-fourteen":
                            str = "'ss14'";
                            arrayList.add(str);
                            break;
                        case "stylistic-seventeen":
                            str = "'ss17'";
                            arrayList.add(str);
                            break;
                    }
                }
            }
            strJoin = TextUtils.join(", ", arrayList);
        }
        this.f13101A = strJoin;
    }

    private void q(String str) {
        this.f13128y = o.d(str);
    }

    private void r(String str) {
        this.f13116m = e(str);
    }

    private void s(float f7) {
        this.f13114k = f7;
    }

    private void t(float f7) {
        this.f13113j = f7;
        this.f13104a = f7 == -1.0f ? Float.NaN : this.f13106c ? G.f(f7) : G.d(f7);
    }

    private void u(I.f fVar) {
        this.f13126w = fVar;
    }

    private void v(String str) {
        this.f13122s = false;
        this.f13123t = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f13122s = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f13123t = true;
                }
            }
        }
    }

    private void w(int i7) {
        if (i7 != this.f13121r) {
            this.f13121r = i7;
        }
    }

    private void x(float f7) {
        this.f13118o = G.d(f7);
    }

    private void y(float f7) {
        this.f13119p = G.d(f7);
    }

    private void z(float f7) {
        if (f7 != this.f13120q) {
            this.f13120q = f7;
        }
    }

    public float b() {
        if (!Float.isNaN(this.f13104a) && !Float.isNaN(this.f13103C)) {
            float f7 = this.f13103C;
            if (f7 > this.f13104a) {
                return f7;
            }
        }
        return this.f13104a;
    }

    public float f() {
        float f7 = this.f13106c ? G.f(this.f13114k) : G.d(this.f13114k);
        int i7 = this.f13111h;
        if (i7 > 0) {
            return f7 / i7;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f13111h);
    }
}
