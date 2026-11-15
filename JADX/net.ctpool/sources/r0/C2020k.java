package r0;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: r0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2020k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f22096a;

    public C2020k(WorkDatabase workDatabase) {
        w5.k.f(workDatabase, "workDatabase");
        this.f22096a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(C2020k c2020k) {
        w5.k.f(c2020k, "this$0");
        return Integer.valueOf(AbstractC2021l.d(c2020k.f22096a, "next_alarm_manager_id"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(C2020k c2020k, int i7, int i8) {
        w5.k.f(c2020k, "this$0");
        int iD = AbstractC2021l.d(c2020k.f22096a, "next_job_scheduler_id");
        if (i7 > iD || iD > i8) {
            AbstractC2021l.e(c2020k.f22096a, "next_job_scheduler_id", i7 + 1);
        } else {
            i7 = iD;
        }
        return Integer.valueOf(i7);
    }

    public final int c() {
        Object objRunInTransaction = this.f22096a.runInTransaction((Callable<Object>) new Callable() { // from class: r0.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2020k.d(this.f22092a);
            }
        });
        w5.k.e(objRunInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int e(final int i7, final int i8) {
        Object objRunInTransaction = this.f22096a.runInTransaction((Callable<Object>) new Callable() { // from class: r0.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2020k.f(this.f22093a, i7, i8);
            }
        });
        w5.k.e(objRunInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objRunInTransaction).intValue();
    }
}
