package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: renamed from: androidx.core.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553e {

    /* JADX INFO: renamed from: androidx.core.app.e$a */
    static class a {
        static void a(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
            alarmManager.setExact(i7, j7, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$b */
    static class b {
        static AlarmManager.AlarmClockInfo a(long j7, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j7, pendingIntent);
        }

        static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$c */
    static class c {
        static void a(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i7, j7, pendingIntent);
        }

        static void b(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i7, j7, pendingIntent);
        }
    }

    public static void a(AlarmManager alarmManager, long j7, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        b.b(alarmManager, b.a(j7, pendingIntent), pendingIntent2);
    }

    public static void b(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
        c.a(alarmManager, i7, j7, pendingIntent);
    }

    public static void c(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
        a.a(alarmManager, i7, j7, pendingIntent);
    }

    public static void d(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
        c.b(alarmManager, i7, j7, pendingIntent);
    }
}
