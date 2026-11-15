package androidx.core.os;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f7160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f7161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7162d;

    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface b {
        void a();
    }

    private void d() {
        while (this.f7162d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f7159a) {
                    return;
                }
                this.f7159a = true;
                this.f7162d = true;
                b bVar = this.f7160b;
                Object obj = this.f7161c;
                if (bVar != null) {
                    try {
                        bVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f7162d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    a.a(obj);
                }
                synchronized (this) {
                    this.f7162d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f7161c == null) {
                    CancellationSignal cancellationSignalB = a.b();
                    this.f7161c = cancellationSignalB;
                    if (this.f7159a) {
                        a.a(cancellationSignalB);
                    }
                }
                obj = this.f7161c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void c(b bVar) {
        synchronized (this) {
            try {
                d();
                if (this.f7160b == bVar) {
                    return;
                }
                this.f7160b = bVar;
                if (this.f7159a && bVar != null) {
                    bVar.a();
                }
            } finally {
            }
        }
    }
}
