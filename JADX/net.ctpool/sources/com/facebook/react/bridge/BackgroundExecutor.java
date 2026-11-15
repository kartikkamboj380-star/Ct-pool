package com.facebook.react.bridge;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class BackgroundExecutor {
    private static final String TAG = "FabricBackgroundExecutor";
    private final ExecutorService mExecutorService;

    private static class NamedThreadFactory implements ThreadFactory {
        private final String mName;

        public NamedThreadFactory(String str) {
            this.mName = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName(this.mName);
            return threadNewThread;
        }
    }

    @R1.a
    private BackgroundExecutor(String str) {
        this.mExecutorService = Executors.newFixedThreadPool(1, new NamedThreadFactory(str));
    }

    @R1.a
    private void queueRunnable(Runnable runnable) {
        ReactNoCrashSoftException reactNoCrashSoftException;
        if (runnable == null) {
            reactNoCrashSoftException = new ReactNoCrashSoftException("runnable is null");
        } else {
            ExecutorService executorService = this.mExecutorService;
            if (executorService != null) {
                executorService.execute(runnable);
                return;
            }
            reactNoCrashSoftException = new ReactNoCrashSoftException("executorService is null");
        }
        ReactSoftExceptionLogger.logSoftException(TAG, reactNoCrashSoftException);
    }
}
