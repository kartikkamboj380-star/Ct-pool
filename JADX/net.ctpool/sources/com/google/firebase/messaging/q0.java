package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z3.AbstractC2272l;
import z3.C2273m;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
class q0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f17701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f17702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f17703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n0 f17704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17705f;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f17706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C2273m f17707b = new C2273m();

        a(Intent intent) {
            this.f17706a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f17706a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17695m.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().b(scheduledExecutorService, new InterfaceC2266f() { // from class: com.google.firebase.messaging.p0
                @Override // z3.InterfaceC2266f
                public final void a(AbstractC2272l abstractC2272l) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f17707b.e(null);
        }

        AbstractC2272l e() {
            return this.f17707b.a();
        }
    }

    q0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f17703d.isEmpty()) {
            ((a) this.f17703d.poll()).d();
        }
    }

    private synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f17703d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                n0 n0Var = this.f17704e;
                if (n0Var == null || !n0Var.isBinderAlive()) {
                    d();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f17704e.c((a) this.f17703d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f17705f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f17705f) {
            return;
        }
        this.f17705f = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f17700a, this.f17701b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e7) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e7);
        }
        this.f17705f = false;
        a();
    }

    synchronized AbstractC2272l c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f17702c);
            this.f17703d.add(aVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f17705f = false;
            if (iBinder instanceof n0) {
                this.f17704e = (n0) iBinder;
                b();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    q0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f17703d = new ArrayDeque();
        this.f17705f = false;
        Context applicationContext = context.getApplicationContext();
        this.f17700a = applicationContext;
        this.f17701b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f17702c = scheduledExecutorService;
    }
}
