package p0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f21508f;

    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w5.k.f(context, "context");
            w5.k.f(intent, "intent");
            e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, InterfaceC2034b interfaceC2034b) {
        super(context, interfaceC2034b);
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
        this.f21508f = new a();
    }

    @Override // p0.h
    public void h() {
        l0.i.e().a(f.f21510a, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f21508f, j());
    }

    @Override // p0.h
    public void i() {
        l0.i.e().a(f.f21510a, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f21508f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
