package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class j0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f17672r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static Boolean f17673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Boolean f17674t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f17675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final L f17676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final PowerManager.WakeLock f17677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final i0 f17678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f17679q;

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j0 f17680a;

        public a(j0 j0Var) {
            this.f17680a = j0Var;
        }

        public void a() {
            if (j0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            j0.this.f17675m.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                j0 j0Var = this.f17680a;
                if (j0Var == null) {
                    return;
                }
                if (j0Var.i()) {
                    if (j0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f17680a.f17678p.m(this.f17680a, 0L);
                    context.unregisterReceiver(this);
                    this.f17680a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    j0(i0 i0Var, Context context, L l7, long j7) {
        this.f17678p = i0Var;
        this.f17675m = context;
        this.f17679q = j7;
        this.f17676n = l7;
        this.f17677o = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f17672r) {
            try {
                Boolean bool = f17674t;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f17674t = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z6 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z6 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z6;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f17672r) {
            try {
                Boolean bool = f17673s;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f17673s = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean i() {
        boolean z6;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17675m.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z6 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f17675m)) {
            this.f17677o.acquire(AbstractC1540e.f17628a);
        }
        try {
            try {
                try {
                    this.f17678p.o(true);
                } catch (Throwable th) {
                    if (h(this.f17675m)) {
                        try {
                            this.f17677o.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e7.getMessage());
                this.f17678p.o(false);
                if (!h(this.f17675m)) {
                    return;
                } else {
                    wakeLock = this.f17677o;
                }
            }
            if (!this.f17676n.g()) {
                this.f17678p.o(false);
                if (h(this.f17675m)) {
                    try {
                        this.f17677o.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f(this.f17675m) && !i()) {
                new a(this).a();
                if (h(this.f17675m)) {
                    try {
                        this.f17677o.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f17678p.s()) {
                this.f17678p.o(false);
            } else {
                this.f17678p.t(this.f17679q);
            }
            if (h(this.f17675m)) {
                wakeLock = this.f17677o;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
