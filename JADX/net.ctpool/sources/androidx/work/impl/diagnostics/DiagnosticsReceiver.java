package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import l0.i;
import l0.k;
import l0.t;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9410a = i.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        i.e().a(f9410a, "Requesting diagnostics");
        try {
            t.h(context).d(k.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e7) {
            i.e().d(f9410a, "WorkManager is not initialized", e7);
        }
    }
}
