package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.g f14025a;

    r(n.g gVar) {
        this.f14025a = gVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        n.g gVar;
        if (uri != null) {
            gVar = (n.g) this.f14025a.get(uri.toString());
        } else {
            gVar = null;
        }
        if (gVar == null) {
            return null;
        }
        return (String) gVar.get("".concat(str3));
    }
}
