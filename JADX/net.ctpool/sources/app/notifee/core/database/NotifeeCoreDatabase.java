package app.notifee.core.database;

import S5.p;
import W.b;
import Z.g;
import android.content.Context;
import androidx.room.t;
import androidx.room.u;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotifeeCoreDatabase extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile NotifeeCoreDatabase f9539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f9540b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9541c = new a(1, 2);

    public class a extends b {
        public a(int i7, int i8) {
            super(i7, i8);
        }

        @Override // W.b
        public void a(g gVar) {
            gVar.u("ALTER TABLE work_data ADD COLUMN with_alarm_manager INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static NotifeeCoreDatabase e(Context context) {
        if (f9539a == null) {
            synchronized (NotifeeCoreDatabase.class) {
                try {
                    if (f9539a == null) {
                        f9539a = (NotifeeCoreDatabase) t.a(context.getApplicationContext(), NotifeeCoreDatabase.class, "notifee_core_database").b(f9541c).d();
                    }
                } finally {
                }
            }
        }
        return f9539a;
    }

    public abstract p d();
}
