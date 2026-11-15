package com.google.android.gms.internal.auth;

import android.net.Uri;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1890a f13777a = new C1890a();

    public static synchronized Uri a(String str) {
        C1890a c1890a = f13777a;
        Uri uri = (Uri) c1890a.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c1890a.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
