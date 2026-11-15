package B5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends A5.a {
    @Override // A5.a
    public Random c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        k.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
