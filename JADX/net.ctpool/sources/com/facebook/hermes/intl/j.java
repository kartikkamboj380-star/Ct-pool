package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.c;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Format f10662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.icu.text.NumberFormat f10663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q1.g f10664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.h f10665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MeasureUnit f10666e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10667a;

        static {
            int[] iArr = new int[c.g.values().length];
            f10667a = iArr;
            try {
                iArr[c.g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10667a[c.g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10667a[c.g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j() {
    }

    public static int n(String str) throws q1.e {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new q1.e("Invalid currency code !");
        }
    }

    private void o(android.icu.text.NumberFormat numberFormat, q1.b bVar, c.h hVar) {
        this.f10663b = numberFormat;
        this.f10662a = numberFormat;
        this.f10664c = (q1.g) bVar;
        this.f10665d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) throws q1.e {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                if (measureUnit.getSubtype().equals(measureUnit.getType() + "-" + str)) {
                }
            }
            return measureUnit;
        }
        throw new q1.e("Unknown unit: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.text.AttributedCharacterIterator] */
    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator a(double d7) {
        try {
            Format format = this.f10662a;
            d7 = format.formatToCharacterIterator((!(format instanceof MeasureFormat) || this.f10666e == null) ? Double.valueOf(d7) : new Measure(Double.valueOf(d7), this.f10666e));
            return d7;
        } catch (NumberFormatException unused) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d7));
        } catch (RuntimeException | Exception unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    @Override // com.facebook.hermes.intl.c
    public String b(double d7) {
        try {
            try {
                Format format = this.f10662a;
                d7 = format.format((!(format instanceof MeasureFormat) || this.f10666e == null) ? Double.valueOf(d7) : new Measure(Double.valueOf(d7), this.f10666e));
                return d7;
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d7);
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d7);
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String c(q1.b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.c
    public String h(AttributedCharacterIterator.Attribute attribute, double d7) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d7, 0.0d) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d7) ? "nan" : Double.isInfinite(d7) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? "group" : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? "currency" : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j l(q1.b bVar, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar2) throws q1.e {
        android.icu.text.NumberFormat numberFormat;
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(q1.d.h(str)) == null) {
                    throw new q1.e("Invalid numbering system: " + str);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(q1.d.h(str));
                bVar.g("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new q1.e("Invalid numbering system: " + str);
            }
        }
        if (eVar == c.e.COMPACT && (hVar == c.h.DECIMAL || hVar == c.h.UNIT)) {
            numberFormat = CompactDecimalFormat.getInstance((ULocale) bVar.h(), bVar2 == c.b.SHORT ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG);
        } else {
            numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) bVar.h(), hVar.h(eVar, dVar));
            if (eVar == c.e.ENGINEERING) {
                numberFormat.setMaximumIntegerDigits(3);
            }
        }
        o(numberFormat, bVar, hVar);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j f(String str, c.EnumC0201c enumC0201c) {
        if (this.f10665d == c.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f10663b.setCurrency(currency);
            if (enumC0201c != c.EnumC0201c.CODE) {
                str = currency.getName(this.f10664c.h(), enumC0201c.h(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f10663b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j k(c.f fVar, int i7, int i8) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i7 >= 0) {
                this.f10663b.setMinimumFractionDigits(i7);
            }
            if (i8 >= 0) {
                this.f10663b.setMaximumFractionDigits(i8);
            }
            android.icu.text.NumberFormat numberFormat = this.f10663b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j j(boolean z6) {
        this.f10663b.setGroupingUsed(z6);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public j i(int i7) {
        if (i7 != -1) {
            this.f10663b.setMinimumIntegerDigits(i7);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public j e(c.g gVar) {
        android.icu.text.NumberFormat numberFormat = this.f10663b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            int i7 = a.f10667a[gVar.ordinal()];
            if (i7 == 1) {
                decimalFormat.setPositivePrefix("");
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativePrefix("");
                decimalFormat.setNegativeSuffix("");
            } else if (i7 == 2 || i7 == 3) {
                if (!decimalFormat.getNegativePrefix().isEmpty()) {
                    decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
                if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                    decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j g(c.f fVar, int i7, int i8) throws q1.e {
        android.icu.text.NumberFormat numberFormat = this.f10663b;
        if ((numberFormat instanceof DecimalFormat) && fVar == c.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i7 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i7);
            }
            if (i8 >= 0) {
                if (i8 < decimalFormat.getMinimumSignificantDigits()) {
                    throw new q1.e("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
                decimalFormat.setMaximumSignificantDigits(i8);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j d(String str, c.i iVar) {
        if (this.f10665d == c.h.UNIT) {
            this.f10666e = p(str);
            this.f10662a = MeasureFormat.getInstance(this.f10664c.h(), iVar.h(), this.f10663b);
        }
        return this;
    }
}
