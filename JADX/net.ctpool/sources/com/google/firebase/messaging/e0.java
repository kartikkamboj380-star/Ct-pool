package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class e0 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f17629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PowerManager.WakeLock f17630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final FirebaseMessaging f17631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ExecutorService f17632p = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e0 f17633a;

        public a(e0 e0Var) {
            this.f17633a = e0Var;
        }

        public void a() {
            if (e0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f17633a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e0 e0Var = this.f17633a;
            if (e0Var != null && e0Var.d()) {
                if (e0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f17633a.f17631o.q(this.f17633a, 0L);
                this.f17633a.b().unregisterReceiver(this);
                this.f17633a = null;
            }
        }
    }

    public e0(FirebaseMessaging firebaseMessaging, long j7) {
        this.f17631o = firebaseMessaging;
        this.f17629m = j7;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f17630n = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f17631o.r();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        String str;
        try {
            if (this.f17631o.n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            if (G.i(e7.getMessage())) {
                str = "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval";
            } else {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a0.b().e(b())) {
            this.f17630n.acquire();
        }
        try {
            try {
                this.f17631o.R(true);
            } catch (IOException e7) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                this.f17631o.R(false);
                if (!a0.b().e(b())) {
                    return;
                }
            }
            if (!this.f17631o.C()) {
                this.f17631o.R(false);
                if (a0.b().e(b())) {
                    this.f17630n.release();
                    return;
                }
                return;
            }
            if (a0.b().d(b()) && !d()) {
                new a(this).a();
                if (a0.b().e(b())) {
                    this.f17630n.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f17631o.R(false);
            } else {
                this.f17631o.W(this.f17629m);
            }
            if (!a0.b().e(b())) {
                return;
            }
            this.f17630n.release();
        } catch (Throwable th) {
            if (a0.b().e(b())) {
                this.f17630n.release();
            }
            throw th;
        }
    }
}
