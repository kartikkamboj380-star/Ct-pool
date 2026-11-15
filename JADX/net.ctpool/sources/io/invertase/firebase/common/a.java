package io.invertase.firebase.common;

import g5.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f20101e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RejectedExecutionHandler f20105d = new RejectedExecutionHandler() { // from class: g5.n
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            this.f19551a.h(runnable, threadPoolExecutor);
        }
    };

    a(String str) {
        this.f20102a = str;
        i iVarH = i.h();
        this.f20103b = iVarH.e("android_task_executor_maximum_pool_size", 1);
        this.f20104c = iVarH.e("android_task_executor_keep_alive_seconds", 3);
    }

    private ExecutorService e(boolean z6) {
        if (z6) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f20103b, this.f20104c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f20105d);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        f().execute(runnable);
    }

    public ExecutorService b() {
        return c(this.f20103b <= 1, "");
    }

    public ExecutorService c(boolean z6, String str) {
        String strD = d(z6, str);
        Map map = f20101e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(strD);
                if (executorService != null) {
                    return executorService;
                }
                ExecutorService executorServiceE = e(z6);
                map.put(strD, executorServiceE);
                return executorServiceE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(boolean z6, String str) {
        StringBuilder sb;
        String str2;
        if (z6) {
            sb = new StringBuilder();
            sb.append(this.f20102a);
            str2 = "TransactionalExecutor";
        } else {
            sb = new StringBuilder();
            sb.append(this.f20102a);
            str2 = "Executor";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public ExecutorService f() {
        return c(true, "");
    }

    public ExecutorService g(String str) {
        if (this.f20103b == 0) {
            str = "";
        }
        return c(true, str);
    }

    public void i(String str) {
        Map map = f20101e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Map map = f20101e;
        synchronized (map) {
            try {
                for (String str : new ArrayList(map.keySet())) {
                    if (str.startsWith(this.f20102a)) {
                        i(str);
                    } else {
                        f20101e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
