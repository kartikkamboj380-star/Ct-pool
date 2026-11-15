package com.facebook.hermes.unicode;

import R1.a;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@a
public final class AndroidUnicodeUtils {
    private static final int FORM_C = 0;
    private static final int FORM_D = 1;
    private static final int FORM_KC = 2;
    private static final int FORM_KD = 3;
    public static final AndroidUnicodeUtils INSTANCE = new AndroidUnicodeUtils();
    private static final int TARGET_LOWERCASE = 1;
    private static final int TARGET_UPPERCASE = 0;

    private AndroidUnicodeUtils() {
    }

    @a
    public static final String convertToCase(String str, int i7, boolean z6) {
        String upperCase;
        String str2;
        k.f(str, "input");
        Locale locale = z6 ? Locale.getDefault() : Locale.ENGLISH;
        if (i7 == 0) {
            k.c(locale);
            upperCase = str.toUpperCase(locale);
            str2 = "toUpperCase(...)";
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("Invalid target case".toString());
            }
            k.c(locale);
            upperCase = str.toLowerCase(locale);
            str2 = "toLowerCase(...)";
        }
        k.e(upperCase, str2);
        return upperCase;
    }

    @a
    public static final String dateFormat(double d7, boolean z6, boolean z7) {
        DateFormat timeInstance;
        if (z6 && z7) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z6) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!z7) {
                throw new IllegalStateException("Bad dateFormat configuration".toString());
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d7)).toString();
    }

    @a
    public static final int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @a
    public static final String normalize(String str, int i7) {
        Normalizer.Form form;
        if (i7 == 0) {
            form = Normalizer.Form.NFC;
        } else if (i7 == 1) {
            form = Normalizer.Form.NFD;
        } else if (i7 == 2) {
            form = Normalizer.Form.NFKC;
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("Invalid form".toString());
            }
            form = Normalizer.Form.NFKD;
        }
        String strNormalize = Normalizer.normalize(str, form);
        k.e(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
