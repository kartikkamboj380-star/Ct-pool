package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public c.a o() {
        c.a aVarD = c.a.d(g());
        k.e(aVarD, "success(inputData)");
        return aVarD;
    }
}
