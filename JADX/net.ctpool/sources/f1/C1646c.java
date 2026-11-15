package f1;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: f1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1646c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1646c f19264b = new C1646c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f19265c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f19266a = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: f1.c$a */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C1646c() {
    }

    public static C1646c a() {
        return f19265c ? new C1646c() : f19264b;
    }

    public void b(a aVar) {
        if (f19265c) {
            for (int i7 = 5; !this.f19266a.offer(aVar) && i7 > 0; i7--) {
                this.f19266a.poll();
            }
        }
    }

    public String toString() {
        return this.f19266a.toString();
    }
}
