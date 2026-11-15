package com.facebook.react.views.text;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public enum t {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13146a;

        static {
            int[] iArr = new int[t.values().length];
            f13146a = iArr;
            try {
                iArr[t.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13146a[t.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13146a[t.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String h(String str, t tVar) {
        if (str == null) {
            return null;
        }
        int i7 = a.f13146a[tVar.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? str : j(str) : str.toLowerCase() : str.toUpperCase();
    }

    private static String j(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        while (true) {
            int i7 = iFirst;
            iFirst = wordInstance.next();
            if (iFirst == -1) {
                return sb.toString();
            }
            String strSubstring = str.substring(i7, iFirst);
            if (Character.isLetterOrDigit(strSubstring.charAt(0))) {
                sb.append(Character.toUpperCase(strSubstring.charAt(0)));
                strSubstring = strSubstring.substring(1).toLowerCase();
            }
            sb.append(strSubstring);
        }
    }
}
