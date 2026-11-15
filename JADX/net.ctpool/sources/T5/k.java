package T5;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5.h f3557a;

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public final Y5.h a() {
        return this.f3557a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i7, long j7, TimeUnit timeUnit) {
        this(new Y5.h(X5.e.f4367h, i7, j7, timeUnit));
        w5.k.f(timeUnit, "timeUnit");
    }

    public k(Y5.h hVar) {
        w5.k.f(hVar, "delegate");
        this.f3557a = hVar;
    }
}
