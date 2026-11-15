package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC0665e;
import androidx.work.impl.v;
import androidx.work.impl.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l0.i;
import q0.m;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0665e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f9396p = i.i("SystemJobService");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private E f9397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f9398n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w f9399o = new w();

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static m b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.InterfaceC0665e
    /* JADX INFO: renamed from: a */
    public void l(m mVar, boolean z6) {
        JobParameters jobParameters;
        i.e().a(f9396p, mVar.b() + " executed on JobScheduler");
        synchronized (this.f9398n) {
            jobParameters = (JobParameters) this.f9398n.remove(mVar);
        }
        this.f9399o.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            E eQ = E.q(getApplicationContext());
            this.f9397m = eQ;
            eQ.s().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            i.e().k(f9396p, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        E e7 = this.f9397m;
        if (e7 != null) {
            e7.s().n(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f9397m == null) {
            i.e().a(f9396p, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m mVarB = b(jobParameters);
        if (mVarB == null) {
            i.e().c(f9396p, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f9398n) {
            try {
                if (this.f9398n.containsKey(mVarB)) {
                    i.e().a(f9396p, "Job is already being executed by SystemJobService: " + mVarB);
                    return false;
                }
                i.e().a(f9396p, "onStartJob for " + mVarB);
                this.f9398n.put(mVarB, jobParameters);
                int i7 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f9223b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f9222a = Arrays.asList(a.a(jobParameters));
                }
                if (i7 >= 28) {
                    aVar.f9224c = b.a(jobParameters);
                }
                this.f9397m.C(this.f9399o.d(mVarB), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f9397m == null) {
            i.e().a(f9396p, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m mVarB = b(jobParameters);
        if (mVarB == null) {
            i.e().c(f9396p, "WorkSpec id not found!");
            return false;
        }
        i.e().a(f9396p, "onStopJob for " + mVarB);
        synchronized (this.f9398n) {
            this.f9398n.remove(mVarB);
        }
        v vVarB = this.f9399o.b(mVarB);
        if (vVarB != null) {
            this.f9397m.E(vVarB);
        }
        return !this.f9397m.s().j(mVarB.b());
    }
}
