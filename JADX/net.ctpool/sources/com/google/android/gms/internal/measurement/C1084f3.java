package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1084f3 implements InterfaceC1165o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.g f14580a;

    C1084f3(n.g gVar) {
        this.f14580a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1165o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Uri uri, String str, String str2, String str3) {
        n.g gVar;
        if (uri == null) {
            if (str == null) {
                gVar = null;
            }
            if (gVar != null) {
                return null;
            }
            if (str2 != null) {
                str3 = str2 + str3;
            }
            return (String) gVar.get(str3);
        }
        str = uri.toString();
        n.g gVar2 = this.f14580a;
        if (gVar2 != null) {
            gVar = (n.g) gVar2.get(str);
        }
        if (gVar != null) {
        }
    }
}
