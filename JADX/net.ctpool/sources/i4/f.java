package i4;

import F5.g;
import android.os.Looper;
import e4.C1629g;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;
import w5.i;
import w5.k;
import w5.l;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f19949e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f19950f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f19951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f19952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f19953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f19954d;

    public static final class a {

        /* JADX INFO: renamed from: i4.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0266a extends i implements InterfaceC2171a {
            C0266a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.f22718n).k());
            }
        }

        static final class b extends l implements InterfaceC2171a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final b f19955m = new b();

            b() {
                super(0);
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a background thread, was called on " + f.f19949e.j() + '.';
            }
        }

        /* synthetic */ class c extends i implements InterfaceC2171a {
            c(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.f22718n).l());
            }
        }

        static final class d extends l implements InterfaceC2171a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final d f19956m = new d();

            d() {
                super(0);
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + f.f19949e.j() + '.';
            }
        }

        /* synthetic */ class e extends i implements InterfaceC2171a {
            e(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.f22718n).m());
            }
        }

        /* JADX INFO: renamed from: i4.f$a$f, reason: collision with other inner class name */
        static final class C0267f extends l implements InterfaceC2171a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final C0267f f19957m = new C0267f();

            C0267f() {
                super(0);
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + f.f19949e.j() + '.';
            }
        }

        private a() {
        }

        private final void h(InterfaceC2171a interfaceC2171a, InterfaceC2171a interfaceC2171a2) {
            if (((Boolean) interfaceC2171a.invoke()).booleanValue()) {
                return;
            }
            C1629g.f().b((String) interfaceC2171a2.invoke());
            i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String j() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k() {
            String strJ = j();
            k.e(strJ, "threadName");
            return g.G(strJ, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l() {
            String strJ = j();
            k.e(strJ, "threadName");
            return g.G(strJ, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void e() {
            h(new C0266a(this), b.f19955m);
        }

        public final void f() {
            h(new c(this), d.f19956m);
        }

        public final void g() {
            h(new e(this), C0267f.f19957m);
        }

        public final boolean i() {
            return f.f19950f;
        }

        public final void n(boolean z6) {
            f.f19950f = z6;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(ExecutorService executorService, ExecutorService executorService2) {
        k.f(executorService, "backgroundExecutorService");
        k.f(executorService2, "blockingExecutorService");
        this.f19951a = new e(executorService);
        this.f19952b = new e(executorService);
        this.f19953c = new e(executorService);
        this.f19954d = new e(executorService2);
    }

    public static final void c() {
        f19949e.e();
    }

    public static final void d() {
        f19949e.f();
    }

    public static final void e() {
        f19949e.g();
    }

    public static final void f(boolean z6) {
        f19949e.n(z6);
    }
}
