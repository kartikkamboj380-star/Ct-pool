package com.facebook.soloader;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class x extends y {
    public x(String str, String str2) {
        super(str, str2);
    }

    public static x b(String str, Context context, A[] aArr) {
        StringBuilder sb = new StringBuilder("couldn't find DSO to load: ");
        sb.append(str);
        sb.append("\n\texisting SO sources: ");
        for (int i7 = 0; i7 < aArr.length; i7++) {
            sb.append("\n\t\tSoSource ");
            sb.append(i7);
            sb.append(": ");
            sb.append(aArr[i7].toString());
        }
        if (context != null) {
            sb.append("\n\tNative lib dir: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            sb.append("\n");
        }
        return new x(str, sb.toString());
    }
}
