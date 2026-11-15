package u1;

import T5.B;
import T5.C0458d;
import T5.D;
import T5.E;
import T5.InterfaceC0459e;
import T5.InterfaceC0460f;
import T5.z;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.AbstractC0767d;
import com.facebook.imagepipeline.producers.AbstractC0769f;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.InterfaceC0777n;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.e0;
import i5.q;
import i5.u;
import j5.AbstractC1787F;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.AbstractC2070a;
import u1.b;
import w5.k;
import x1.C2210a;

/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC0767d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f22483d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0459e.a f22484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f22485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0458d f22486c;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: u1.b$b, reason: collision with other inner class name */
    public static final class C0320b extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f22487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f22488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f22489h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0320b(InterfaceC0777n interfaceC0777n, e0 e0Var) {
            super(interfaceC0777n, e0Var);
            k.f(interfaceC0777n, "consumer");
            k.f(e0Var, "producerContext");
        }
    }

    public static final class c extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0459e f22490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f22491b;

        c(InterfaceC0459e interfaceC0459e, b bVar) {
            this.f22490a = interfaceC0459e;
            this.f22491b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(InterfaceC0459e interfaceC0459e) {
            interfaceC0459e.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            if (!k.b(Looper.myLooper(), Looper.getMainLooper())) {
                this.f22490a.cancel();
                return;
            }
            Executor executor = this.f22491b.f22485b;
            final InterfaceC0459e interfaceC0459e = this.f22490a;
            executor.execute(new Runnable() { // from class: u1.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.f(interfaceC0459e);
                }
            });
        }
    }

    public static final class d implements InterfaceC0460f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0320b f22492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f22493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ X.a f22494c;

        d(C0320b c0320b, b bVar, X.a aVar) {
            this.f22492a = c0320b;
            this.f22493b = bVar;
            this.f22494c = aVar;
        }

        @Override // T5.InterfaceC0460f
        public void a(InterfaceC0459e interfaceC0459e, D d7) throws IOException {
            k.f(interfaceC0459e, "call");
            k.f(d7, "response");
            this.f22492a.f22488g = SystemClock.elapsedRealtime();
            E eA = d7.a();
            u uVar = null;
            if (eA != null) {
                b bVar = this.f22493b;
                X.a aVar = this.f22494c;
                C0320b c0320b = this.f22492a;
                try {
                    try {
                        if (d7.z()) {
                            C2210a c2210aC = C2210a.f22788c.c(d7.l("Content-Range"));
                            if (c2210aC != null && (c2210aC.f22790a != 0 || c2210aC.f22791b != Integer.MAX_VALUE)) {
                                c0320b.j(c2210aC);
                                c0320b.i(8);
                            }
                            aVar.c(eA.a(), eA.e() < 0 ? 0 : (int) eA.e());
                        } else {
                            bVar.l(interfaceC0459e, new IOException("Unexpected HTTP code " + d7), aVar);
                        }
                    } catch (Exception e7) {
                        bVar.l(interfaceC0459e, e7, aVar);
                    }
                    u uVar2 = u.f19985a;
                    AbstractC2070a.a(eA, null);
                    uVar = u.f19985a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC2070a.a(eA, th);
                        throw th2;
                    }
                }
            }
            if (uVar == null) {
                this.f22493b.l(interfaceC0459e, new IOException("Response body null: " + d7), this.f22494c);
            }
        }

        @Override // T5.InterfaceC0460f
        public void b(InterfaceC0459e interfaceC0459e, IOException iOException) {
            k.f(interfaceC0459e, "call");
            k.f(iOException, "e");
            this.f22493b.l(interfaceC0459e, iOException, this.f22494c);
        }
    }

    public b(InterfaceC0459e.a aVar, Executor executor, boolean z6) {
        k.f(aVar, "callFactory");
        k.f(executor, "cancellationExecutor");
        this.f22484a = aVar;
        this.f22485b = executor;
        this.f22486c = z6 ? new C0458d.a().e().a() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(InterfaceC0459e interfaceC0459e, Exception exc, X.a aVar) {
        if (interfaceC0459e.n0()) {
            aVar.b();
        } else {
            aVar.a(exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0320b e(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        k.f(interfaceC0777n, "consumer");
        k.f(e0Var, "context");
        return new C0320b(interfaceC0777n, e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(C0320b c0320b, X.a aVar) {
        k.f(c0320b, "fetchState");
        k.f(aVar, "callback");
        c0320b.f22487f = SystemClock.elapsedRealtime();
        Uri uriG = c0320b.g();
        k.e(uriG, "fetchState.uri");
        try {
            B.a aVarD = new B.a().m(uriG.toString()).d();
            C0458d c0458d = this.f22486c;
            if (c0458d != null) {
                k.e(aVarD, "requestBuilder");
                aVarD.c(c0458d);
            }
            C2210a c2210aB = c0320b.b().d().b();
            if (c2210aB != null) {
                aVarD.a("Range", c2210aB.d());
            }
            B b7 = aVarD.b();
            k.e(b7, "requestBuilder.build()");
            j(c0320b, aVar, b7);
        } catch (Exception e7) {
            aVar.a(e7);
        }
    }

    protected void j(C0320b c0320b, X.a aVar, B b7) {
        k.f(c0320b, "fetchState");
        k.f(aVar, "callback");
        k.f(b7, "request");
        InterfaceC0459e interfaceC0459eA = this.f22484a.a(b7);
        c0320b.b().e(new c(interfaceC0459eA, this));
        interfaceC0459eA.S0(new d(c0320b, this, aVar));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map c(C0320b c0320b, int i7) {
        k.f(c0320b, "fetchState");
        return AbstractC1787F.i(q.a("queue_time", String.valueOf(c0320b.f22488g - c0320b.f22487f)), q.a("fetch_time", String.valueOf(c0320b.f22489h - c0320b.f22488g)), q.a("total_time", String.valueOf(c0320b.f22489h - c0320b.f22487f)), q.a("image_size", String.valueOf(i7)));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(C0320b c0320b, int i7) {
        k.f(c0320b, "fetchState");
        c0320b.f22489h = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ b(InterfaceC0459e.a aVar, Executor executor, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executor, (i7 & 4) != 0 ? true : z6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(z zVar) {
        k.f(zVar, "okHttpClient");
        ExecutorService executorServiceC = zVar.q().c();
        k.e(executorServiceC, "okHttpClient.dispatcher().executorService()");
        this(zVar, executorServiceC, false, 4, null);
    }
}
