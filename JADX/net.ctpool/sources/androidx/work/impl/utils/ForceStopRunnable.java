package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.A;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l0.i;
import l0.s;
import q0.r;
import q0.u;
import q0.v;
import r0.AbstractC2015f;
import r0.q;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f9474q = i.i("ForceStopRunnable");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f9475r = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f9476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E f9477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q f9478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9479p = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f9480a = i.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            i.e().j(f9480a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, E e7) {
        this.f9476m = context.getApplicationContext();
        this.f9477n = e7;
        this.f9478o = e7.r();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i7) {
        return PendingIntent.getBroadcast(context, -1, c(context), i7);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f9475r;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = g.i(this.f9476m, this.f9477n);
        WorkDatabase workDatabaseV = this.f9477n.v();
        v vVarJ = workDatabaseV.j();
        r rVarI = workDatabaseV.i();
        workDatabaseV.beginTransaction();
        try {
            List<u> listM = vVarJ.m();
            boolean z6 = (listM == null || listM.isEmpty()) ? false : true;
            if (z6) {
                for (u uVar : listM) {
                    vVarJ.l(s.ENQUEUED, uVar.f21795a);
                    vVarJ.e(uVar.f21795a, -1L);
                }
            }
            rVarI.b();
            workDatabaseV.setTransactionSuccessful();
            workDatabaseV.endTransaction();
            return z6 || zI;
        } catch (Throwable th) {
            workDatabaseV.endTransaction();
            throw th;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            i.e().a(f9474q, "Rescheduling Workers.");
            this.f9477n.z();
            this.f9477n.r().e(false);
        } else if (e()) {
            i.e().a(f9474q, "Application was force-stopped, rescheduling.");
            this.f9477n.z();
            this.f9478o.d(System.currentTimeMillis());
        } else if (zA) {
            i.e().a(f9474q, "Found unfinished work, scheduling it.");
            androidx.work.impl.u.b(this.f9477n.o(), this.f9477n.v(), this.f9477n.t());
        }
    }

    public boolean e() {
        try {
            int i7 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f9476m, i7 >= 31 ? 570425344 : 536870912);
            if (i7 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f9476m.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f9478o.a();
                    for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                        ApplicationExitInfo applicationExitInfoA = AbstractC2015f.a(historicalProcessExitReasons.get(i8));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f9476m);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e7) {
            e = e7;
            i.e().l(f9474q, "Ignoring exception", e);
            return true;
        } catch (SecurityException e8) {
            e = e8;
            i.e().l(f9474q, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a aVarO = this.f9477n.o();
        if (TextUtils.isEmpty(aVarO.c())) {
            i.e().a(f9474q, "The default process name was not specified.");
            return true;
        }
        boolean zB = r0.r.b(this.f9476m, aVarO);
        i.e().a(f9474q, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f9477n.r().b();
    }

    public void i(long j7) {
        try {
            Thread.sleep(j7);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IllegalStateException illegalStateException;
        androidx.core.util.a aVarE;
        int i7;
        try {
            if (f()) {
                while (true) {
                    try {
                        A.d(this.f9476m);
                        i.e().a(f9474q, "Performing cleanup operations.");
                    } catch (SQLiteException e7) {
                        i.e().c(f9474q, "Unexpected SQLite exception during migrations");
                        illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e7);
                        aVarE = this.f9477n.o().e();
                        if (aVarE == null) {
                            throw illegalStateException;
                        }
                    }
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e8) {
                        i7 = this.f9479p + 1;
                        this.f9479p = i7;
                        if (i7 >= 3) {
                            i iVarE = i.e();
                            String str = f9474q;
                            iVarE.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            aVarE = this.f9477n.o().e();
                            if (aVarE == null) {
                                throw illegalStateException;
                            }
                            i.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                            aVarE.a(illegalStateException);
                        } else {
                            i.e().b(f9474q, "Retrying after " + (((long) i7) * 300), e8);
                            i(((long) this.f9479p) * 300);
                        }
                    }
                    i.e().b(f9474q, "Retrying after " + (((long) i7) * 300), e8);
                    i(((long) this.f9479p) * 300);
                }
                aVarE.a(illegalStateException);
            }
        } finally {
            this.f9477n.y();
        }
    }
}
