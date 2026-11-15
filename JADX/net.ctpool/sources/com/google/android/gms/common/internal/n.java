package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.common.s;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ExecutorService f13699a;

    static {
        s.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("CallbackExecutor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13699a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
