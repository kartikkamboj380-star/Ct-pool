package app.notifee.core;

import X3.d;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.concurrent.futures.c;
import androidx.work.WorkerParameters;
import androidx.work.c;
import u0.R0;

/* JADX INFO: loaded from: classes.dex */
public class Worker extends c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c.a f9538q;

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c.a aVar) {
        this.f9538q = aVar;
        String strM = g().m("workType");
        if (strM == null) {
            Logger.d("Worker", "received task with no input key type.");
            aVar.b(c.a.c());
            return "Worker.startWork operation cancelled - no input.";
        }
        if (strM.equals("app.notifee.core.BlockStateBroadcastReceiver.WORKER")) {
            Logger.d("Worker", "received task with type " + strM);
            BlockStateBroadcastReceiver.d(g(), aVar);
            return "Worker.startWork operation created successfully.";
        }
        if (strM.equals("app.notifee.core.NotificationManager.TRIGGER")) {
            R0.q(g(), aVar);
            return "Worker.startWork operation created successfully.";
        }
        Logger.d("Worker", "unknown work type received: " + strM);
        aVar.b(c.a.c());
        return "Worker.startWork operation cancelled - unknown work type.";
    }

    @Override // androidx.work.c
    public void k() {
        c.a aVar = this.f9538q;
        if (aVar != null) {
            aVar.b(c.a.a());
        }
        this.f9538q = null;
    }

    @Override // androidx.work.c
    public d m() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0127c() { // from class: u0.w
            @Override // androidx.concurrent.futures.c.InterfaceC0127c
            public final Object a(c.a aVar) {
                return this.f22479a.p(aVar);
            }
        });
    }
}
