package i6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19993c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f19990e = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f19989d = new a();

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public D a() {
        this.f19991a = false;
        return this;
    }

    public D b() {
        this.f19993c = 0L;
        return this;
    }

    public long c() {
        if (this.f19991a) {
            return this.f19992b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public D d(long j7) {
        this.f19991a = true;
        this.f19992b = j7;
        return this;
    }

    public boolean e() {
        return this.f19991a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f19991a && this.f19992b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public D g(long j7, TimeUnit timeUnit) {
        w5.k.f(timeUnit, "unit");
        if (j7 >= 0) {
            this.f19993c = timeUnit.toNanos(j7);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j7).toString());
    }

    public long h() {
        return this.f19993c;
    }

    public static final class a extends D {
        a() {
        }

        @Override // i6.D
        public D g(long j7, TimeUnit timeUnit) {
            w5.k.f(timeUnit, "unit");
            return this;
        }

        @Override // i6.D
        public void f() {
        }

        @Override // i6.D
        public D d(long j7) {
            return this;
        }
    }
}
