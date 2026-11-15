package r0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f22098a;

    public q(WorkDatabase workDatabase) {
        this.f22098a = workDatabase;
    }

    public static void c(Context context, Z.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j7 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j8 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.q();
            try {
                gVar.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j7)});
                gVar.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j8)});
                sharedPreferences.edit().clear().apply();
                gVar.d0();
            } finally {
                gVar.s0();
            }
        }
    }

    public long a() {
        Long lA = this.f22098a.f().a("last_force_stop_ms");
        if (lA != null) {
            return lA.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lA = this.f22098a.f().a("reschedule_needed");
        return lA != null && lA.longValue() == 1;
    }

    public void d(long j7) {
        this.f22098a.f().b(new q0.d("last_force_stop_ms", Long.valueOf(j7)));
    }

    public void e(boolean z6) {
        this.f22098a.f().b(new q0.d("reschedule_needed", z6));
    }
}
