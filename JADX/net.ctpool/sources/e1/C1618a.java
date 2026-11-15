package e1;

import O0.l;
import O0.o;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import j1.t;
import java.io.Closeable;
import p1.C1961a;
import p1.b;
import p1.e;
import p1.h;
import p1.i;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1618a extends C1961a implements Closeable, t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static HandlerC0253a f19153t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final V0.b f19154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i f19155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h f19156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o f19157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f19158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f19159s;

    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    static class HandlerC0253a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f19160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f19161b;

        public HandlerC0253a(Looper looper, h hVar, h hVar2) {
            super(looper);
            this.f19160a = hVar;
            this.f19161b = hVar2;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            i iVar = (i) l.g(message.obj);
            h hVar = this.f19161b;
            int i7 = message.what;
            if (i7 == 1) {
                e eVarA = e.f21544n.a(message.arg1);
                if (eVarA == null) {
                    throw new IllegalArgumentException("Invalid ImageLoadStatus value: " + message.arg1);
                }
                this.f19160a.a(iVar, eVarA);
                if (hVar != null) {
                    hVar.a(iVar, eVarA);
                    return;
                }
                return;
            }
            if (i7 != 2) {
                return;
            }
            p1.l lVarA = p1.l.f21601n.a(message.arg1);
            if (lVarA == null) {
                throw new IllegalArgumentException("Invalid VisibilityState value: " + message.arg1);
            }
            this.f19160a.b(iVar, lVarA);
            if (hVar != null) {
                hVar.b(iVar, lVarA);
            }
        }
    }

    public C1618a(V0.b bVar, i iVar, h hVar, o oVar) {
        this(bVar, iVar, hVar, oVar, true);
    }

    private boolean U() {
        boolean zBooleanValue = ((Boolean) this.f19157q.get()).booleanValue();
        if (zBooleanValue && f19153t == null) {
            n();
        }
        return zBooleanValue;
    }

    private void W(i iVar, e eVar) {
        iVar.n(eVar);
        if (U()) {
            Message messageObtainMessage = ((HandlerC0253a) l.g(f19153t)).obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.arg1 = eVar.j();
            messageObtainMessage.obj = iVar;
            f19153t.sendMessage(messageObtainMessage);
            return;
        }
        this.f19156p.a(iVar, eVar);
        h hVar = this.f19158r;
        if (hVar != null) {
            hVar.a(iVar, eVar);
        }
    }

    private void a0(i iVar, p1.l lVar) {
        if (U()) {
            Message messageObtainMessage = ((HandlerC0253a) l.g(f19153t)).obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.arg1 = lVar.j();
            messageObtainMessage.obj = iVar;
            f19153t.sendMessage(messageObtainMessage);
            return;
        }
        this.f19156p.b(iVar, lVar);
        h hVar = this.f19158r;
        if (hVar != null) {
            hVar.b(iVar, lVar);
        }
    }

    private synchronized void n() {
        if (f19153t != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
        handlerThread.start();
        f19153t = new HandlerC0253a((Looper) l.g(handlerThread.getLooper()), this.f19156p, this.f19158r);
    }

    private void z(i iVar, long j7) {
        iVar.x(false);
        iVar.r(j7);
        a0(iVar, p1.l.INVISIBLE);
    }

    public void B(i iVar, long j7) {
        iVar.x(true);
        iVar.w(j7);
        a0(iVar, p1.l.VISIBLE);
    }

    public void J() {
        this.f19155o.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        J();
    }

    @Override // j1.t
    public void d(boolean z6) {
        if (z6) {
            B(this.f19155o, this.f19154n.now());
        } else {
            z(this.f19155o, this.f19154n.now());
        }
    }

    @Override // p1.C1961a, p1.b
    public void e(String str, Object obj, b.a aVar) {
        long jNow = this.f19154n.now();
        i iVar = this.f19155o;
        iVar.c();
        iVar.j(jNow);
        iVar.h(str);
        iVar.d(obj);
        iVar.l(aVar);
        W(iVar, e.REQUESTED);
        if (this.f19159s) {
            B(iVar, jNow);
        }
    }

    @Override // p1.C1961a, p1.b
    public void f(String str, b.a aVar) {
        long jNow = this.f19154n.now();
        i iVar = this.f19155o;
        iVar.l(aVar);
        iVar.h(str);
        e eVarA = iVar.a();
        if (eVarA != e.SUCCESS && eVarA != e.ERROR && eVarA != e.DRAW) {
            iVar.e(jNow);
            W(iVar, e.CANCELED);
        }
        W(iVar, e.RELEASED);
        if (this.f19159s) {
            z(iVar, jNow);
        }
    }

    @Override // p1.C1961a, p1.b
    public void g(String str, Throwable th, b.a aVar) {
        long jNow = this.f19154n.now();
        i iVar = this.f19155o;
        iVar.l(aVar);
        iVar.f(jNow);
        iVar.h(str);
        iVar.k(th);
        W(iVar, e.ERROR);
        z(iVar, jNow);
    }

    @Override // p1.C1961a, p1.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(String str, D1.i iVar, b.a aVar) {
        long jNow = this.f19154n.now();
        i iVar2 = this.f19155o;
        iVar2.l(aVar);
        iVar2.g(jNow);
        iVar2.p(jNow);
        iVar2.h(str);
        iVar2.m(iVar);
        W(iVar2, e.SUCCESS);
    }

    @Override // p1.C1961a, p1.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void a(String str, D1.i iVar) {
        long jNow = this.f19154n.now();
        i iVar2 = this.f19155o;
        iVar2.i(jNow);
        iVar2.h(str);
        iVar2.m(iVar);
        W(iVar2, e.INTERMEDIATE_AVAILABLE);
    }

    public C1618a(V0.b bVar, i iVar, h hVar, o oVar, boolean z6) {
        this.f19158r = null;
        this.f19154n = bVar;
        this.f19155o = iVar;
        this.f19156p = hVar;
        this.f19157q = oVar;
        this.f19159s = z6;
    }

    @Override // j1.t
    public void b() {
    }
}
