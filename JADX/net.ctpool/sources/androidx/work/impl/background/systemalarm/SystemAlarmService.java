package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.n;
import androidx.work.impl.background.systemalarm.g;
import l0.i;
import r0.x;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends n implements g.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f9351p = i.i("SystemAlarmService");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f9352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9353o;

    private void f() {
        g gVar = new g(this);
        this.f9352n = gVar;
        gVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void a() {
        this.f9353o = true;
        i.e().a(f9351p, "All commands completed in dispatcher");
        x.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.f9353o = false;
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f9353o = true;
        this.f9352n.j();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f9353o) {
            i.e().f(f9351p, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f9352n.j();
            f();
            this.f9353o = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f9352n.b(intent, i8);
        return 3;
    }
}
