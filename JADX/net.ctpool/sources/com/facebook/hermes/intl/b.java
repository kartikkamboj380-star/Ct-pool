package com.facebook.hermes.intl;

import java.text.AttributedCharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f10533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f10534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f10535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f10536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f10537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final /* synthetic */ int[] f10538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ int[] f10539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ int[] f10540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final /* synthetic */ int[] f10541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final /* synthetic */ int[] f10542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final /* synthetic */ int[] f10543m;

        static {
            int[] iArr = new int[k.values().length];
            f10543m = iArr;
            try {
                iArr[k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10543m[k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10543m[k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10543m[k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10543m[k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0200b.values().length];
            f10542l = iArr2;
            try {
                iArr2[EnumC0200b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10542l[EnumC0200b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10542l[EnumC0200b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10542l[EnumC0200b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10542l[EnumC0200b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[l.values().length];
            f10541k = iArr3;
            try {
                iArr3[l.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10541k[l.LONGOFFSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10541k[l.LONGGENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10541k[l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10541k[l.SHORTOFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10541k[l.SHORTGENERIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10541k[l.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[j.values().length];
            f10540j = iArr4;
            try {
                iArr4[j.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10540j[j.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10540j[j.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr5 = new int[h.values().length];
            f10539i = iArr5;
            try {
                iArr5[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10539i[h.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10539i[h.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr6 = new int[f.values().length];
            f10538h = iArr6;
            try {
                iArr6[f.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10538h[f.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10538h[f.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr7 = new int[c.values().length];
            f10537g = iArr7;
            try {
                iArr7[c.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f10537g[c.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f10537g[c.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr8 = new int[i.values().length];
            f10536f = iArr8;
            try {
                iArr8[i.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f10536f[i.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f10536f[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f10536f[i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f10536f[i.NARROW.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f10536f[i.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr9 = new int[n.values().length];
            f10535e = iArr9;
            try {
                iArr9[n.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f10535e[n.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f10535e[n.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr10 = new int[d.values().length];
            f10534d = iArr10;
            try {
                iArr10[d.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f10534d[d.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f10534d[d.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f10534d[d.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            int[] iArr11 = new int[m.values().length];
            f10533c = iArr11;
            try {
                iArr11[m.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f10533c[m.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f10533c[m.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f10533c[m.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            int[] iArr12 = new int[g.values().length];
            f10532b = iArr12;
            try {
                iArr12[g.H11.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f10532b[g.H12.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f10532b[g.H23.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f10532b[g.H24.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f10532b[g.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr13 = new int[e.values().length];
            f10531a = iArr13;
            try {
                iArr13[e.BESTFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f10531a[e.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.b$b, reason: collision with other inner class name */
    public enum EnumC0200b {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10542l[ordinal()];
            if (i7 == 1) {
                return "full";
            }
            if (i7 == 2) {
                return "long";
            }
            if (i7 == 3) {
                return "medium";
            }
            if (i7 == 4) {
                return "short";
            }
            if (i7 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum c {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String h() {
            int i7 = a.f10537g[ordinal()];
            if (i7 == 1) {
                return "d";
            }
            if (i7 == 2) {
                return "dd";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10537g[ordinal()];
            if (i7 == 1) {
                return "numeric";
            }
            if (i7 == 2) {
                return "2-digit";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String h() {
            int i7 = a.f10534d[ordinal()];
            if (i7 == 1) {
                return "GGGG";
            }
            if (i7 == 2) {
                return "GGG";
            }
            if (i7 == 3) {
                return "G5";
            }
            if (i7 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10534d[ordinal()];
            if (i7 == 1) {
                return "long";
            }
            if (i7 == 2) {
                return "short";
            }
            if (i7 == 3) {
                return "narrow";
            }
            if (i7 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum e {
        BESTFIT,
        BASIC;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10531a[ordinal()];
            if (i7 == 1) {
                return "best fit";
            }
            if (i7 == 2) {
                return "basic";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum f {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String h() {
            int i7 = a.f10538h[ordinal()];
            if (i7 == 1) {
                return "h";
            }
            if (i7 == 2) {
                return "hh";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        public String j() {
            int i7 = a.f10538h[ordinal()];
            if (i7 == 1) {
                return "k";
            }
            if (i7 == 2) {
                return "kk";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10538h[ordinal()];
            if (i7 == 1) {
                return "numeric";
            }
            if (i7 == 2) {
                return "2-digit";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum g {
        H11,
        H12,
        H23,
        H24,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10532b[ordinal()];
            if (i7 == 1) {
                return "h11";
            }
            if (i7 == 2) {
                return "h12";
            }
            if (i7 == 3) {
                return "h23";
            }
            if (i7 == 4) {
                return "h24";
            }
            if (i7 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum h {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String h() {
            int i7 = a.f10539i[ordinal()];
            if (i7 == 1) {
                return "m";
            }
            if (i7 == 2) {
                return "mm";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10539i[ordinal()];
            if (i7 == 1) {
                return "numeric";
            }
            if (i7 == 2) {
                return "2-digit";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum i {
        NUMERIC,
        DIGIT2,
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String h() {
            switch (a.f10536f[ordinal()]) {
                case 1:
                    return "M";
                case 2:
                    return "MM";
                case 3:
                    return "MMMM";
                case 4:
                    return "MMM";
                case 5:
                    return "MMMMM";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f10536f[ordinal()]) {
                case 1:
                    return "numeric";
                case 2:
                    return "2-digit";
                case 3:
                    return "long";
                case 4:
                    return "short";
                case 5:
                    return "narrow";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum j {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String h() {
            int i7 = a.f10540j[ordinal()];
            if (i7 == 1) {
                return "s";
            }
            if (i7 == 2) {
                return "ss";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10540j[ordinal()];
            if (i7 == 1) {
                return "numeric";
            }
            if (i7 == 2) {
                return "2-digit";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum k {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10543m[ordinal()];
            if (i7 == 1) {
                return "full";
            }
            if (i7 == 2) {
                return "long";
            }
            if (i7 == 3) {
                return "medium";
            }
            if (i7 == 4) {
                return "short";
            }
            if (i7 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum l {
        LONG,
        LONGOFFSET,
        LONGGENERIC,
        SHORT,
        SHORTOFFSET,
        SHORTGENERIC,
        UNDEFINED;

        public String h() {
            switch (a.f10541k[ordinal()]) {
                case 1:
                    return "zzzz";
                case 2:
                    return "OOOO";
                case 3:
                    return "vvvv";
                case 4:
                    return "z";
                case 5:
                    return "O";
                case 6:
                    return "v";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f10541k[ordinal()]) {
                case 1:
                    return "long";
                case 2:
                    return "longOffset";
                case 3:
                    return "longGeneric";
                case 4:
                    return "short";
                case 5:
                    return "shortOffset";
                case 6:
                    return "shortGeneric";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum m {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String h() {
            int i7 = a.f10533c[ordinal()];
            if (i7 == 1) {
                return "EEEE";
            }
            if (i7 == 2) {
                return "EEE";
            }
            if (i7 == 3) {
                return "EEEEE";
            }
            if (i7 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10533c[ordinal()];
            if (i7 == 1) {
                return "long";
            }
            if (i7 == 2) {
                return "short";
            }
            if (i7 == 3) {
                return "narrow";
            }
            if (i7 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum n {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String h() {
            int i7 = a.f10535e[ordinal()];
            if (i7 == 1) {
                return "yyyy";
            }
            if (i7 == 2) {
                return "yy";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10535e[ordinal()];
            if (i7 == 1) {
                return "numeric";
            }
            if (i7 == 2) {
                return "2-digit";
            }
            if (i7 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d7);

    String b(double d7);

    String c(q1.b bVar);

    g d(q1.b bVar);

    String e(q1.b bVar);

    void f(q1.b bVar, String str, String str2, e eVar, m mVar, d dVar, n nVar, i iVar, c cVar, f fVar, h hVar, j jVar, l lVar, g gVar, Object obj, EnumC0200b enumC0200b, k kVar, Object obj2);

    String g(AttributedCharacterIterator.Attribute attribute, String str);

    String h(q1.b bVar);
}
