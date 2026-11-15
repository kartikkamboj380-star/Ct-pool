package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1174p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile U3.g f14777a = U3.g.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f14778b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean b(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z6 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (!f14777a.c()) {
            synchronized (f14778b) {
                try {
                    if (f14777a.c()) {
                        return ((Boolean) f14777a.b()).booleanValue();
                    }
                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                        if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                        }
                        f14777a = U3.g.d(Boolean.valueOf(z6));
                    }
                    if (a(context)) {
                        z6 = true;
                    }
                    f14777a = U3.g.d(Boolean.valueOf(z6));
                } finally {
                }
            }
        }
        return ((Boolean) f14777a.b()).booleanValue();
    }
}
