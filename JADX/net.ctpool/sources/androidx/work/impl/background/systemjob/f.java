package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Iterator;
import l0.C1844b;
import l0.EnumC1843a;
import l0.i;
import l0.j;
import q0.u;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f9400b = i.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f9401a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9402a;

        static {
            int[] iArr = new int[j.values().length];
            f9402a = iArr;
            try {
                iArr[j.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9402a[j.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9402a[j.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9402a[j.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9402a[j.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    f(Context context) {
        this.f9401a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(C1844b.C0298b c0298b) {
        return new JobInfo.TriggerContentUri(c0298b.a(), c0298b.b() ? 1 : 0);
    }

    static int c(j jVar) {
        int i7 = a.f9402a[jVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        if (i7 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        i.e().a(f9400b, "API version too low. Cannot convert network type value " + jVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, j jVar) {
        if (Build.VERSION.SDK_INT < 30 || jVar != j.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(jVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(u uVar, int i7) {
        C1844b c1844b = uVar.f21804j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f21795a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.j());
        JobInfo.Builder extras = new JobInfo.Builder(i7, this.f9401a).setRequiresCharging(c1844b.g()).setRequiresDeviceIdle(c1844b.h()).setExtras(persistableBundle);
        d(extras, c1844b.d());
        if (!c1844b.h()) {
            extras.setBackoffCriteria(uVar.f21807m, uVar.f21806l == EnumC1843a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(uVar.c() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!uVar.f21811q) {
            extras.setImportantWhileForeground(true);
        }
        if (c1844b.e()) {
            Iterator it = c1844b.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((C1844b.C0298b) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c1844b.b());
            extras.setTriggerContentMaxDelay(c1844b.a());
        }
        extras.setPersisted(false);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            extras.setRequiresBatteryNotLow(c1844b.f());
            extras.setRequiresStorageNotLow(c1844b.i());
        }
        boolean z6 = uVar.f21805k > 0;
        boolean z7 = jMax > 0;
        if (i8 >= 31 && uVar.f21811q && !z6 && !z7) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
