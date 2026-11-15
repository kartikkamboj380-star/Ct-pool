package l0;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21080a = i.i("WorkerFactory");

    class a extends v {
        a() {
        }

        @Override // l0.v
        public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static v c() {
        return new a();
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        androidx.work.c cVarA = a(context, str, workerParameters);
        if (cVarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            } catch (Throwable th) {
                i.e().d(f21080a, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    cVarA = (androidx.work.c) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    i.e().d(f21080a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (cVarA == null || !cVarA.j()) {
            return cVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
