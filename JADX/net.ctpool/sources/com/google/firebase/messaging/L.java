package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17540e = 0;

    L(Context context) {
        this.f17536a = context;
    }

    static String c(Y3.f fVar) {
        String strF = fVar.r().f();
        if (strF != null) {
            return strF;
        }
        String strC = fVar.r().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f17536a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f17536a.getPackageName());
        if (packageInfoF != null) {
            this.f17537b = Integer.toString(packageInfoF.versionCode);
            this.f17538c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f17537b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17537b;
    }

    synchronized String b() {
        try {
            if (this.f17538c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17538c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f17539d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f17539d = packageInfoF.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17539d;
    }

    synchronized int e() {
        int i7 = this.f17540e;
        if (i7 != 0) {
            return i7;
        }
        PackageManager packageManager = this.f17536a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f17540e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f17540e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f17540e = 2;
        } else {
            this.f17540e = 1;
        }
        return this.f17540e;
    }

    boolean g() {
        return e() != 0;
    }
}
