package s0;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: s0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2034b {
    Executor a();

    InterfaceExecutorC2033a b();

    default void c(Runnable runnable) {
        b().execute(runnable);
    }
}
