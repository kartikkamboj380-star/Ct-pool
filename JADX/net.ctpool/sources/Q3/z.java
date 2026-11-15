package Q3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class z implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f2789a;

    /* synthetic */ z(A a7, y yVar) {
        this.f2789a = a7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2789a.f2748b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        A a7 = this.f2789a;
        a7.c().post(new w(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2789a.f2748b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        A a7 = this.f2789a;
        a7.c().post(new x(this));
    }
}
