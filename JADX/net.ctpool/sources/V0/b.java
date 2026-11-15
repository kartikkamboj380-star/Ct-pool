package V0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    @O0.d
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @O0.d
    long nowNanos();
}
