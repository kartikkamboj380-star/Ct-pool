package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l0.i;
import q0.j;
import q0.o;
import q0.v;
import q0.z;
import t0.d;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a o() {
        E eQ = E.q(a());
        k.e(eQ, "getInstance(applicationContext)");
        WorkDatabase workDatabaseV = eQ.v();
        k.e(workDatabaseV, "workManager.workDatabase");
        v vVarJ = workDatabaseV.j();
        o oVarH = workDatabaseV.h();
        z zVarK = workDatabaseV.k();
        j jVarG = workDatabaseV.g();
        List listG = vVarJ.g(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listM = vVarJ.m();
        List listW = vVarJ.w(200);
        if (!listG.isEmpty()) {
            i.e().f(d.f22284a, "Recently completed work:\n\n");
            i.e().f(d.f22284a, d.d(oVarH, zVarK, jVarG, listG));
        }
        if (!listM.isEmpty()) {
            i.e().f(d.f22284a, "Running work:\n\n");
            i.e().f(d.f22284a, d.d(oVarH, zVarK, jVarG, listM));
        }
        if (!listW.isEmpty()) {
            i.e().f(d.f22284a, "Enqueued work:\n\n");
            i.e().f(d.f22284a, d.d(oVarH, zVarK, jVarG, listW));
        }
        c.a aVarC = c.a.c();
        k.e(aVarC, "success()");
        return aVarC;
    }
}
