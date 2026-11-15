package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a0 f17605e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17606a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f17607b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f17608c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f17609d = new ArrayDeque();

    private a0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strF = f(context, intent);
        if (strF != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strF);
            }
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if (e(context)) {
                componentNameStartService = l0.h(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e7) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
            return 402;
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e8);
            return 401;
        }
    }

    static synchronized a0 b() {
        try {
            if (f17605e == null) {
                f17605e = new a0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17605e;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        try {
            String str3 = this.f17606a;
            if (str3 != null) {
                return str3;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        str2 = context.getPackageName() + serviceInfo.name;
                    } else {
                        str2 = serviceInfo.name;
                    }
                    this.f17606a = str2;
                    return this.f17606a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    Intent c() {
        return (Intent) this.f17609d.poll();
    }

    boolean d(Context context) {
        if (this.f17608c == null) {
            this.f17608c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f17607b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f17608c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f17607b == null) {
            this.f17607b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f17607b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f17607b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f17609d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
