package Y5;

import T5.F;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f4592a = new LinkedHashSet();

    public final synchronized void a(F f7) {
        w5.k.f(f7, "route");
        this.f4592a.remove(f7);
    }

    public final synchronized void b(F f7) {
        w5.k.f(f7, "failedRoute");
        this.f4592a.add(f7);
    }

    public final synchronized boolean c(F f7) {
        w5.k.f(f7, "route");
        return this.f4592a.contains(f7);
    }
}
