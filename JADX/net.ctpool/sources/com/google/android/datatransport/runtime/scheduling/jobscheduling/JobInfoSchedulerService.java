package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import U2.p;
import U2.u;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import f3.AbstractC1649a;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i8 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        p.a aVarD = p.a().b(string).d(AbstractC1649a.b(i7));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        u.c().e().v(aVarD.a(), i8, new Runnable() { // from class: b3.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f9590m.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
