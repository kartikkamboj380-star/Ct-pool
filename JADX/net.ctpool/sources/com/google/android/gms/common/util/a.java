package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f13751a = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f13751a.matcher(str);
        StringBuilder sb = null;
        int iEnd = 0;
        while (matcher.find()) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            int iStart = matcher.start();
            int i7 = iStart;
            while (i7 >= 0 && str.charAt(i7) == '\\') {
                i7--;
            }
            if ((iStart - i7) % 2 != 0) {
                int i8 = Integer.parseInt(matcher.group().substring(2), 16);
                sb.append((CharSequence) str, iEnd, matcher.start());
                if (i8 == 92) {
                    sb.append("\\\\");
                } else {
                    sb.append(Character.toChars(i8));
                }
                iEnd = matcher.end();
            }
        }
        if (sb == null) {
            return str;
        }
        if (iEnd < matcher.regionEnd()) {
            sb.append((CharSequence) str, iEnd, matcher.regionEnd());
        }
        return sb.toString();
    }
}
