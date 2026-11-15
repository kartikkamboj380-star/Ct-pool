package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import java.text.AttributedCharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f10612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f10613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f10614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f10615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f10616g;

        static {
            int[] iArr = new int[d.values().length];
            f10616g = iArr;
            try {
                iArr[d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10616g[d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0201c.values().length];
            f10615f = iArr2;
            try {
                iArr2[EnumC0201c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10615f[EnumC0201c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10615f[EnumC0201c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10615f[EnumC0201c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[i.values().length];
            f10614e = iArr3;
            try {
                iArr3[i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10614e[i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10614e[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[g.values().length];
            f10613d = iArr4;
            try {
                iArr4[g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10613d[g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10613d[g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10613d[g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[b.values().length];
            f10612c = iArr5;
            try {
                iArr5[b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10612c[b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[e.values().length];
            f10611b = iArr6;
            try {
                iArr6[e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10611b[e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10611b[e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10611b[e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[h.values().length];
            f10610a = iArr7;
            try {
                iArr7[h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10610a[h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10610a[h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10610a[h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public enum b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10612c[ordinal()];
            if (i7 == 1) {
                return "short";
            }
            if (i7 == 2) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.c$c, reason: collision with other inner class name */
    public enum EnumC0201c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int h() {
            return a.f10615f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10615f[ordinal()];
            if (i7 == 1) {
                return "symbol";
            }
            if (i7 == 2) {
                return "narrowSymbol";
            }
            if (i7 == 3) {
                return "code";
            }
            if (i7 == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10616g[ordinal()];
            if (i7 == 1) {
                return "accounting";
            }
            if (i7 == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10611b[ordinal()];
            if (i7 == 1) {
                return "standard";
            }
            if (i7 == 2) {
                return "scientific";
            }
            if (i7 == 3) {
                return "engineering";
            }
            if (i7 == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    public enum g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10613d[ordinal()];
            if (i7 == 1) {
                return "auto";
            }
            if (i7 == 2) {
                return "always";
            }
            if (i7 == 3) {
                return "never";
            }
            if (i7 == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int h(e eVar, d dVar) throws q1.e {
            int i7 = a.f10610a[ordinal()];
            if (i7 == 2) {
                return 2;
            }
            if (i7 != 3) {
                return (eVar == e.SCIENTIFIC || eVar == e.ENGINEERING) ? 3 : 0;
            }
            if (dVar == d.ACCOUNTING) {
                return 7;
            }
            if (dVar == d.STANDARD) {
                return 1;
            }
            throw new q1.e("Unrecognized formatting style requested.");
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10610a[ordinal()];
            if (i7 == 1) {
                return "decimal";
            }
            if (i7 == 2) {
                return "percent";
            }
            if (i7 == 3) {
                return "currency";
            }
            if (i7 == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum i {
        SHORT,
        NARROW,
        LONG;

        public MeasureFormat.FormatWidth h() {
            int i7 = a.f10614e[ordinal()];
            return i7 != 2 ? i7 != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f10614e[ordinal()];
            if (i7 == 1) {
                return "short";
            }
            if (i7 == 2) {
                return "narrow";
            }
            if (i7 == 3) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d7);

    String b(double d7);

    String c(q1.b bVar);

    c d(String str, i iVar);

    c e(g gVar);

    c f(String str, EnumC0201c enumC0201c);

    c g(f fVar, int i7, int i8);

    String h(AttributedCharacterIterator.Attribute attribute, double d7);

    c i(int i7);

    c j(boolean z6);

    c k(f fVar, int i7, int i8);

    c l(q1.b bVar, String str, h hVar, d dVar, e eVar, b bVar2);
}
