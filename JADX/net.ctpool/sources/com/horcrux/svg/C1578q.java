package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1578q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final C1578q f18029p = new C1578q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f18030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f18031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final X f18032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadableMap f18033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Z f18034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f18035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f18036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f18037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Y f18038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final a0 f18039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f18040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final double f18041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final double f18042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final double f18043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f18044o;

    /* JADX INFO: renamed from: com.horcrux.svg.q$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Z[] f18045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f18046b;

        static {
            Z z6 = Z.w100;
            Z z7 = Z.w200;
            Z z8 = Z.w300;
            Z z9 = Z.Normal;
            Z z10 = Z.w500;
            Z z11 = Z.w600;
            Z z12 = Z.Bold;
            Z z13 = Z.w800;
            Z z14 = Z.w900;
            f18045a = new Z[]{z6, z6, z7, z8, z9, z10, z11, z12, z13, z14, z14};
            f18046b = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        private static int a(int i7) {
            if (i7 < 350) {
                return 400;
            }
            if (i7 < 550) {
                return 700;
            }
            if (i7 < 900) {
                return 900;
            }
            return i7;
        }

        static int b(Z z6, C1578q c1578q) {
            return z6 == Z.Bolder ? a(c1578q.f18035f) : z6 == Z.Lighter ? c(c1578q.f18035f) : f18046b[z6.ordinal()];
        }

        private static int c(int i7) {
            if (i7 < 100) {
                return i7;
            }
            if (i7 < 550) {
                return 100;
            }
            return i7 < 750 ? 400 : 700;
        }

        static Z d(int i7) {
            return f18045a[Math.round(i7 / 100.0f)];
        }
    }

    private C1578q() {
        this.f18033d = null;
        this.f18031b = "";
        this.f18032c = X.normal;
        this.f18034e = Z.Normal;
        this.f18035f = 400;
        this.f18036g = "";
        this.f18037h = "";
        this.f18038i = Y.normal;
        this.f18039j = a0.start;
        this.f18040k = b0.None;
        this.f18044o = false;
        this.f18041l = 0.0d;
        this.f18030a = 12.0d;
        this.f18042m = 0.0d;
        this.f18043n = 0.0d;
    }

    private void a(C1578q c1578q, double d7) {
        long jRound = Math.round(d7);
        if (jRound < 1 || jRound > 1000) {
            b(c1578q);
            return;
        }
        int i7 = (int) jRound;
        this.f18035f = i7;
        this.f18034e = a.d(i7);
    }

    private void b(C1578q c1578q) {
        this.f18035f = c1578q.f18035f;
        this.f18034e = c1578q.f18034e;
    }

    private double c(ReadableMap readableMap, String str, double d7, double d8, double d9) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : F.b(readableMap.getString(str), d9, d7, d8);
    }

    C1578q(ReadableMap readableMap, C1578q c1578q, double d7) {
        double d8;
        double d9 = c1578q.f18030a;
        if (readableMap.hasKey("fontSize")) {
            this.f18030a = c(readableMap, "fontSize", 1.0d, d9, d9);
        } else {
            this.f18030a = d9;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                d8 = readableMap.getDouble("fontWeight");
            } else {
                String string = readableMap.getString("fontWeight");
                if (Z.j(string)) {
                    int iB = a.b(Z.h(string), c1578q);
                    this.f18035f = iB;
                    this.f18034e = a.d(iB);
                } else {
                    d8 = string != null ? Double.parseDouble(string) : d8;
                    b(c1578q);
                }
            }
            a(c1578q, d8);
        } else {
            b(c1578q);
        }
        this.f18033d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c1578q.f18033d;
        this.f18031b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : c1578q.f18031b;
        this.f18032c = readableMap.hasKey("fontStyle") ? X.valueOf(readableMap.getString("fontStyle")) : c1578q.f18032c;
        this.f18036g = readableMap.hasKey("fontFeatureSettings") ? readableMap.getString("fontFeatureSettings") : c1578q.f18036g;
        this.f18037h = readableMap.hasKey("fontVariationSettings") ? readableMap.getString("fontVariationSettings") : c1578q.f18037h;
        this.f18038i = readableMap.hasKey("fontVariantLigatures") ? Y.valueOf(readableMap.getString("fontVariantLigatures")) : c1578q.f18038i;
        this.f18039j = readableMap.hasKey("textAnchor") ? a0.valueOf(readableMap.getString("textAnchor")) : c1578q.f18039j;
        this.f18040k = readableMap.hasKey("textDecoration") ? b0.h(readableMap.getString("textDecoration")) : c1578q.f18040k;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.f18044o = zHasKey || c1578q.f18044o;
        this.f18041l = zHasKey ? c(readableMap, "kerning", d7, this.f18030a, 0.0d) : c1578q.f18041l;
        this.f18042m = readableMap.hasKey("wordSpacing") ? c(readableMap, "wordSpacing", d7, this.f18030a, 0.0d) : c1578q.f18042m;
        this.f18043n = readableMap.hasKey("letterSpacing") ? c(readableMap, "letterSpacing", d7, this.f18030a, 0.0d) : c1578q.f18043n;
    }
}
