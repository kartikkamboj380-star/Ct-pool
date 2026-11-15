package androidx.work;

import X3.d;
import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import l0.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f9257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WorkerParameters f9258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f9259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f9260p;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0179a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f9261a;

            public C0179a() {
                this(androidx.work.b.f9254c);
            }

            public androidx.work.b e() {
                return this.f9261a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0179a.class != obj.getClass()) {
                    return false;
                }
                return this.f9261a.equals(((C0179a) obj).f9261a);
            }

            public int hashCode() {
                return (C0179a.class.getName().hashCode() * 31) + this.f9261a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f9261a + '}';
            }

            public C0179a(androidx.work.b bVar) {
                this.f9261a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0180c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f9262a;

            public C0180c() {
                this(androidx.work.b.f9254c);
            }

            public androidx.work.b e() {
                return this.f9262a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0180c.class != obj.getClass()) {
                    return false;
                }
                return this.f9262a.equals(((C0180c) obj).f9262a);
            }

            public int hashCode() {
                return (C0180c.class.getName().hashCode() * 31) + this.f9262a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f9262a + '}';
            }

            public C0180c(androidx.work.b bVar) {
                this.f9262a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0179a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0180c();
        }

        public static a d(androidx.work.b bVar) {
            return new C0180c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f9257m = context;
        this.f9258n = workerParameters;
    }

    public final Context a() {
        return this.f9257m;
    }

    public Executor c() {
        return this.f9258n.a();
    }

    public d d() {
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        cVarT.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarT;
    }

    public final UUID e() {
        return this.f9258n.c();
    }

    public final b g() {
        return this.f9258n.d();
    }

    public v h() {
        return this.f9258n.e();
    }

    public final boolean i() {
        return this.f9259o;
    }

    public final boolean j() {
        return this.f9260p;
    }

    public void k() {
    }

    public final void l() {
        this.f9260p = true;
    }

    public abstract d m();

    public final void n() {
        this.f9259o = true;
        k();
    }
}
