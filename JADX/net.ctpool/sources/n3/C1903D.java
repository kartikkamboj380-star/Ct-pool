package n3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import z3.AbstractC2272l;

/* JADX INFO: renamed from: n3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1903D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C1903D f21356e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f21358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f21359c = new x(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21360d = 1;

    C1903D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f21358b = scheduledExecutorService;
        this.f21357a = context.getApplicationContext();
    }

    public static synchronized C1903D b(Context context) {
        try {
            if (f21356e == null) {
                s3.e.a();
                f21356e = new C1903D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21356e;
    }

    private final synchronized int f() {
        int i7;
        i7 = this.f21360d;
        this.f21360d = i7 + 1;
        return i7;
    }

    private final synchronized AbstractC2272l g(AbstractC1900A abstractC1900A) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(abstractC1900A.toString()));
            }
            if (!this.f21359c.g(abstractC1900A)) {
                x xVar = new x(this, null);
                this.f21359c = xVar;
                xVar.g(abstractC1900A);
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC1900A.f21353b.a();
    }

    public final AbstractC2272l c(int i7, Bundle bundle) {
        return g(new z(f(), i7, bundle));
    }

    public final AbstractC2272l d(int i7, Bundle bundle) {
        return g(new C1902C(f(), i7, bundle));
    }
}
