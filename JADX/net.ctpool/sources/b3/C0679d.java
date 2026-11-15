package b3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import c3.InterfaceC0717d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import f3.AbstractC1649a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: b3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0679d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0717d f9588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f9589c;

    public C0679d(Context context, InterfaceC0717d interfaceC0717d, f fVar) {
        this.f9587a = context;
        this.f9588b = interfaceC0717d;
        this.f9589c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i7, int i8) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i9 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i7) {
                return i9 >= i8;
            }
        }
        return false;
    }

    @Override // b3.x
    public void a(U2.p pVar, int i7, boolean z6) {
        ComponentName componentName = new ComponentName(this.f9587a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f9587a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z6 && d(jobScheduler, iC, i7)) {
            Y2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jP = this.f9588b.p(pVar);
        JobInfo.Builder builderC = this.f9589c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jP, i7);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i7);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", AbstractC1649a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        Y2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f9589c.g(pVar.d(), jP, i7)), Long.valueOf(jP), Integer.valueOf(i7));
        jobScheduler.schedule(builderC.build());
    }

    @Override // b3.x
    public void b(U2.p pVar, int i7) {
        a(pVar, i7, false);
    }

    int c(U2.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f9587a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC1649a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
