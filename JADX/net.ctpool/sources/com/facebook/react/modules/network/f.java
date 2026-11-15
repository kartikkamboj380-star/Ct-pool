package com.facebook.react.modules.network;

/* JADX INFO: loaded from: classes.dex */
abstract class f {
    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z6 = false;
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                z6 = true;
            } else {
                sb.append(cCharAt);
            }
        }
        return z6 ? sb.toString() : str;
    }
}
