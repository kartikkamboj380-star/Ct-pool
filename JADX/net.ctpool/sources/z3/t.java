package z3;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23292a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f23294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Exception f23298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23299h;

    public t(int i7, O o6) {
        this.f23293b = i7;
        this.f23294c = o6;
    }

    private final void d() {
        if (this.f23295d + this.f23296e + this.f23297f == this.f23293b) {
            if (this.f23298g == null) {
                if (this.f23299h) {
                    this.f23294c.u();
                    return;
                } else {
                    this.f23294c.t(null);
                    return;
                }
            }
            this.f23294c.s(new ExecutionException(this.f23296e + " out of " + this.f23293b + " underlying tasks failed", this.f23298g));
        }
    }

    @Override // z3.InterfaceC2265e
    public final void a() {
        synchronized (this.f23292a) {
            this.f23297f++;
            this.f23299h = true;
            d();
        }
    }

    @Override // z3.InterfaceC2268h
    public final void b(Object obj) {
        synchronized (this.f23292a) {
            this.f23295d++;
            d();
        }
    }

    @Override // z3.InterfaceC2267g
    public final void c(Exception exc) {
        synchronized (this.f23292a) {
            this.f23296e++;
            this.f23298g = exc;
            d();
        }
    }
}
