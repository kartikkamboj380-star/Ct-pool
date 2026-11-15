package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import n.C1890a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1191r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1890a f14806a = new C1890a();

    public static synchronized Uri a(String str) {
        Uri uri;
        C1890a c1890a = f14806a;
        uri = (Uri) c1890a.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c1890a.put(str, uri);
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
