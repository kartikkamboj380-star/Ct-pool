package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.n;
import androidx.work.impl.foreground.b;
import l0.i;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends n implements b.InterfaceC0182b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f9412r = i.i("SystemFgService");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static SystemForegroundService f9413s = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f9414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    androidx.work.impl.foreground.b f9416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    NotificationManager f9417q;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f9418m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Notification f9419n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f9420o;

        a(int i7, Notification notification, int i8) {
            this.f9418m = i7;
            this.f9419n = notification;
            this.f9420o = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                e.a(SystemForegroundService.this, this.f9418m, this.f9419n, this.f9420o);
            } else if (i7 >= 29) {
                d.a(SystemForegroundService.this, this.f9418m, this.f9419n, this.f9420o);
            } else {
                SystemForegroundService.this.startForeground(this.f9418m, this.f9419n);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f9422m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Notification f9423n;

        b(int i7, Notification notification) {
            this.f9422m = i7;
            this.f9423n = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f9417q.notify(this.f9422m, this.f9423n);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f9425m;

        c(int i7) {
            this.f9425m = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f9417q.cancel(this.f9425m);
        }
    }

    static class d {
        static void a(Service service, int i7, Notification notification, int i8) {
            service.startForeground(i7, notification, i8);
        }
    }

    static class e {
        static void a(Service service, int i7, Notification notification, int i8) {
            service.startForeground(i7, notification, i8);
        }
    }

    private void g() {
        this.f9414n = new Handler(Looper.getMainLooper());
        this.f9417q = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f9416p = bVar;
        bVar.n(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0182b
    public void c(int i7, int i8, Notification notification) {
        this.f9414n.post(new a(i7, notification, i8));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0182b
    public void d(int i7, Notification notification) {
        this.f9414n.post(new b(i7, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0182b
    public void e(int i7) {
        this.f9414n.post(new c(i7));
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onCreate() {
        super.onCreate();
        f9413s = this;
        g();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f9416p.l();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f9415o) {
            i.e().f(f9412r, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f9416p.l();
            g();
            this.f9415o = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f9416p.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0182b
    public void stop() {
        this.f9415o = true;
        i.e().a(f9412r, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f9413s = null;
        stopSelf();
    }
}
