package r0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: r0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2021l {
    public static final void c(Context context, Z.g gVar) {
        w5.k.f(context, "context");
        w5.k.f(gVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i7 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i8 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.q();
            try {
                gVar.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                gVar.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i8)});
                sharedPreferences.edit().clear().apply();
                gVar.d0();
            } finally {
                gVar.s0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        Long lA = workDatabase.f().a(str);
        int iLongValue = lA != null ? (int) lA.longValue() : 0;
        e(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i7) {
        workDatabase.f().b(new q0.d(str, Long.valueOf(i7)));
    }
}
