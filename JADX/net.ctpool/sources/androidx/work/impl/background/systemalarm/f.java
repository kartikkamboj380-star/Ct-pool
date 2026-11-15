package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l0.i;
import n0.InterfaceC1893c;
import p0.n;
import q0.m;
import q0.u;
import q0.x;
import r0.C2009D;

/* JADX INFO: loaded from: classes.dex */
public class f implements InterfaceC1893c, C2009D.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f9367y = i.i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f9368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f9369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f9370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final g f9371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n0.e f9372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f9373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f9374s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f9375t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Executor f9376u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private PowerManager.WakeLock f9377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final v f9379x;

    f(Context context, int i7, g gVar, v vVar) {
        this.f9368m = context;
        this.f9369n = i7;
        this.f9371p = gVar;
        this.f9370o = vVar.a();
        this.f9379x = vVar;
        n nVarU = gVar.g().u();
        this.f9375t = gVar.f().b();
        this.f9376u = gVar.f().a();
        this.f9372q = new n0.e(nVarU, this);
        this.f9378w = false;
        this.f9374s = 0;
        this.f9373r = new Object();
    }

    private void e() {
        synchronized (this.f9373r) {
            try {
                this.f9372q.a();
                this.f9371p.h().b(this.f9370o);
                PowerManager.WakeLock wakeLock = this.f9377v;
                if (wakeLock != null && wakeLock.isHeld()) {
                    i.e().a(f9367y, "Releasing wakelock " + this.f9377v + "for WorkSpec " + this.f9370o);
                    this.f9377v.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f9374s != 0) {
            i.e().a(f9367y, "Already started work for " + this.f9370o);
            return;
        }
        this.f9374s = 1;
        i.e().a(f9367y, "onAllConstraintsMet for " + this.f9370o);
        if (this.f9371p.e().p(this.f9379x)) {
            this.f9371p.h().a(this.f9370o, 600000L, this);
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        i iVarE;
        String str;
        StringBuilder sb;
        String strB = this.f9370o.b();
        if (this.f9374s < 2) {
            this.f9374s = 2;
            i iVarE2 = i.e();
            str = f9367y;
            iVarE2.a(str, "Stopping work for WorkSpec " + strB);
            this.f9376u.execute(new g.b(this.f9371p, b.f(this.f9368m, this.f9370o), this.f9369n));
            if (this.f9371p.e().k(this.f9370o.b())) {
                i.e().a(str, "WorkSpec " + strB + " needs to be rescheduled");
                this.f9376u.execute(new g.b(this.f9371p, b.e(this.f9368m, this.f9370o), this.f9369n));
                return;
            }
            iVarE = i.e();
            sb = new StringBuilder();
            sb.append("Processor does not have WorkSpec ");
            sb.append(strB);
            strB = ". No need to reschedule";
        } else {
            iVarE = i.e();
            str = f9367y;
            sb = new StringBuilder();
            sb.append("Already stopped work for ");
        }
        sb.append(strB);
        iVarE.a(str, sb.toString());
    }

    @Override // r0.C2009D.a
    public void a(m mVar) {
        i.e().a(f9367y, "Exceeded time limits on execution for " + mVar);
        this.f9375t.execute(new d(this));
    }

    @Override // n0.InterfaceC1893c
    public void b(List list) {
        this.f9375t.execute(new d(this));
    }

    @Override // n0.InterfaceC1893c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (x.a((u) it.next()).equals(this.f9370o)) {
                this.f9375t.execute(new Runnable() { // from class: androidx.work.impl.background.systemalarm.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9366m.i();
                    }
                });
                return;
            }
        }
    }

    void g() {
        String strB = this.f9370o.b();
        this.f9377v = r0.x.b(this.f9368m, strB + " (" + this.f9369n + ")");
        i iVarE = i.e();
        String str = f9367y;
        iVarE.a(str, "Acquiring wakelock " + this.f9377v + "for WorkSpec " + strB);
        this.f9377v.acquire();
        u uVarQ = this.f9371p.g().v().j().q(strB);
        if (uVarQ == null) {
            this.f9375t.execute(new d(this));
            return;
        }
        boolean zH = uVarQ.h();
        this.f9378w = zH;
        if (zH) {
            this.f9372q.b(Collections.singletonList(uVarQ));
            return;
        }
        i.e().a(str, "No constraints for " + strB);
        f(Collections.singletonList(uVarQ));
    }

    void h(boolean z6) {
        i.e().a(f9367y, "onExecuted " + this.f9370o + ", " + z6);
        e();
        if (z6) {
            this.f9376u.execute(new g.b(this.f9371p, b.e(this.f9368m, this.f9370o), this.f9369n));
        }
        if (this.f9378w) {
            this.f9376u.execute(new g.b(this.f9371p, b.b(this.f9368m), this.f9369n));
        }
    }
}
