package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Service implements l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D f8364m = new D(this);

    @Override // androidx.lifecycle.l
    public AbstractC0651h getLifecycle() {
        return this.f8364m.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f8364m.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f8364m.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f8364m.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i7) {
        this.f8364m.e();
        super.onStart(intent, i7);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        return super.onStartCommand(intent, i7, i8);
    }
}
