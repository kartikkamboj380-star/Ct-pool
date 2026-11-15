package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1022z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile S f14052a = S.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f14053b = new Object();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #1 {all -> 0x004b, blocks: (B:12:0x0035, B:14:0x003d, B:15:0x0049, B:19:0x004d, B:21:0x0059, B:25:0x0069, B:27:0x006f, B:34:0x008a, B:35:0x0094, B:29:0x0079, B:30:0x007d, B:31:0x0083), top: B:42:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z6 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (!f14052a.b()) {
            synchronized (f14053b) {
                try {
                    if (f14052a.b()) {
                        return ((Boolean) f14052a.a()).booleanValue();
                    }
                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                        if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                            try {
                                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                    z6 = true;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                        f14052a = S.d(Boolean.valueOf(z6));
                    }
                } finally {
                }
            }
        }
        return ((Boolean) f14052a.a()).booleanValue();
    }
}
