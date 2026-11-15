package h4;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f19701a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f19702b = new AtomicInteger();

    public void a() {
        this.f19702b.getAndIncrement();
    }

    public void b() {
        this.f19701a.getAndIncrement();
    }

    public void c() {
        this.f19702b.set(0);
    }
}
