package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import l0.i;
import q0.j;
import q0.l;
import q0.m;
import r0.C2020k;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9354a = i.i("Alarms");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    static class C0181a {
        static void a(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
            alarmManager.setExact(i7, j7, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j jVarG = workDatabase.g();
        q0.i iVarE = jVarG.e(mVar);
        if (iVarE != null) {
            b(context, mVar, iVarE.f21770c);
            i.e().a(f9354a, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            jVarG.c(mVar);
        }
    }

    private static void b(Context context, m mVar, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.c(context, mVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        i.e().a(f9354a, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i7 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j7) {
        int iC;
        j jVarG = workDatabase.g();
        q0.i iVarE = jVarG.e(mVar);
        if (iVarE != null) {
            b(context, mVar, iVarE.f21770c);
            iC = iVarE.f21770c;
        } else {
            iC = new C2020k(workDatabase).c();
            jVarG.b(l.a(mVar, iC));
        }
        d(context, mVar, iC, j7);
    }

    private static void d(Context context, m mVar, int i7, long j7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.c(context, mVar), 201326592);
        if (alarmManager != null) {
            C0181a.a(alarmManager, 0, j7, service);
        }
    }
}
