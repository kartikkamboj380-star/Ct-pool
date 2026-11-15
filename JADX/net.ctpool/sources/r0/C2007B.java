package r0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import s0.InterfaceC2034b;

/* JADX INFO: renamed from: r0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2007B implements l0.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f22061d = l0.i.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2034b f22062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f22063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final q0.v f22064c;

    /* JADX INFO: renamed from: r0.B$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f22065m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ UUID f22066n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ l0.e f22067o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f22068p;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, l0.e eVar, Context context) {
            this.f22065m = cVar;
            this.f22066n = uuid;
            this.f22067o = eVar;
            this.f22068p = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f22065m.isCancelled()) {
                    String string = this.f22066n.toString();
                    q0.u uVarQ = C2007B.this.f22064c.q(string);
                    if (uVarQ == null || uVarQ.f21796b.h()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C2007B.this.f22063b.b(string, this.f22067o);
                    this.f22068p.startService(androidx.work.impl.foreground.b.d(this.f22068p, q0.x.a(uVarQ), this.f22067o));
                }
                this.f22065m.p(null);
            } catch (Throwable th) {
                this.f22065m.q(th);
            }
        }
    }

    public C2007B(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, InterfaceC2034b interfaceC2034b) {
        this.f22063b = aVar;
        this.f22062a = interfaceC2034b;
        this.f22064c = workDatabase.j();
    }

    @Override // l0.f
    public X3.d a(Context context, UUID uuid, l0.e eVar) {
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        this.f22062a.c(new a(cVarT, uuid, eVar, context));
        return cVarT;
    }
}
