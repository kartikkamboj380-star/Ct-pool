package i6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class m extends D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private D f20028f;

    public m(D d7) {
        w5.k.f(d7, "delegate");
        this.f20028f = d7;
    }

    @Override // i6.D
    public D a() {
        return this.f20028f.a();
    }

    @Override // i6.D
    public D b() {
        return this.f20028f.b();
    }

    @Override // i6.D
    public long c() {
        return this.f20028f.c();
    }

    @Override // i6.D
    public D d(long j7) {
        return this.f20028f.d(j7);
    }

    @Override // i6.D
    public boolean e() {
        return this.f20028f.e();
    }

    @Override // i6.D
    public void f() throws InterruptedIOException {
        this.f20028f.f();
    }

    @Override // i6.D
    public D g(long j7, TimeUnit timeUnit) {
        w5.k.f(timeUnit, "unit");
        return this.f20028f.g(j7, timeUnit);
    }

    @Override // i6.D
    public long h() {
        return this.f20028f.h();
    }

    public final D i() {
        return this.f20028f;
    }

    public final m j(D d7) {
        w5.k.f(d7, "delegate");
        this.f20028f = d7;
        return this;
    }
}
