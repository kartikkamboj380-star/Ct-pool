package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l0.i;
import l0.s;
import q0.l;
import q0.m;
import q0.u;
import q0.v;
import q0.x;
import r0.C2020k;

/* JADX INFO: loaded from: classes.dex */
public class g implements t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f9403q = i.i("SystemJobScheduler");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f9404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JobScheduler f9405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final E f9406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final f f9407p;

    public g(Context context, E e7) {
        this(context, e7, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    public static void a(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void b(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            i.e().d(f9403q, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            m mVarH = h(jobInfo);
            if (mVarH != null && str.equals(mVarH.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            i.e().d(f9403q, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, E e7) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listA = e7.v().g().a();
        boolean z6 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                m mVarH = h(jobInfo);
                if (mVarH != null) {
                    hashSet.add(mVarH.b());
                } else {
                    b(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                i.e().a(f9403q, "Reconciling jobs");
                z6 = true;
                break;
            }
        }
        if (z6) {
            WorkDatabase workDatabaseV = e7.v();
            workDatabaseV.beginTransaction();
            try {
                v vVarJ = workDatabaseV.j();
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    vVarJ.e((String) it2.next(), -1L);
                }
                workDatabaseV.setTransactionSuccessful();
                workDatabaseV.endTransaction();
            } catch (Throwable th) {
                workDatabaseV.endTransaction();
                throw th;
            }
        }
        return z6;
    }

    @Override // androidx.work.impl.t
    public boolean c() {
        return true;
    }

    @Override // androidx.work.impl.t
    public void d(String str) {
        List listF = f(this.f9404m, this.f9405n, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            b(this.f9405n, ((Integer) it.next()).intValue());
        }
        this.f9406o.v().g().f(str);
    }

    @Override // androidx.work.impl.t
    public void e(u... uVarArr) {
        WorkDatabase workDatabaseV = this.f9406o.v();
        C2020k c2020k = new C2020k(workDatabaseV);
        for (u uVar : uVarArr) {
            workDatabaseV.beginTransaction();
            try {
                u uVarQ = workDatabaseV.j().q(uVar.f21795a);
                if (uVarQ == null) {
                    i.e().k(f9403q, "Skipping scheduling " + uVar.f21795a + " because it's no longer in the DB");
                } else if (uVarQ.f21796b != s.ENQUEUED) {
                    i.e().k(f9403q, "Skipping scheduling " + uVar.f21795a + " because it is no longer enqueued");
                } else {
                    m mVarA = x.a(uVar);
                    q0.i iVarE = workDatabaseV.g().e(mVarA);
                    int iE = iVarE != null ? iVarE.f21770c : c2020k.e(this.f9406o.o().i(), this.f9406o.o().g());
                    if (iVarE == null) {
                        this.f9406o.v().g().b(l.a(mVarA, iE));
                    }
                    j(uVar, iE);
                }
                workDatabaseV.setTransactionSuccessful();
            } finally {
                workDatabaseV.endTransaction();
            }
        }
    }

    public void j(u uVar, int i7) {
        JobInfo jobInfoA = this.f9407p.a(uVar, i7);
        i iVarE = i.e();
        String str = f9403q;
        iVarE.a(str, "Scheduling work ID " + uVar.f21795a + "Job ID " + i7);
        try {
            if (this.f9405n.schedule(jobInfoA) == 0) {
                i.e().k(str, "Unable to schedule work ID " + uVar.f21795a);
                if (uVar.f21811q && uVar.f21812r == l0.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f21811q = false;
                    i.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", uVar.f21795a));
                    j(uVar, i7);
                }
            }
        } catch (IllegalStateException e7) {
            List listG = g(this.f9404m, this.f9405n);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f9406o.v().j().j().size()), Integer.valueOf(this.f9406o.o().h()));
            i.e().c(f9403q, str2);
            IllegalStateException illegalStateException = new IllegalStateException(str2, e7);
            androidx.core.util.a aVarL = this.f9406o.o().l();
            if (aVarL == null) {
                throw illegalStateException;
            }
            aVarL.a(illegalStateException);
        } catch (Throwable th) {
            i.e().d(f9403q, "Unable to schedule " + uVar, th);
        }
    }

    public g(Context context, E e7, JobScheduler jobScheduler, f fVar) {
        this.f9404m = context;
        this.f9406o = e7;
        this.f9405n = jobScheduler;
        this.f9407p = fVar;
    }
}
