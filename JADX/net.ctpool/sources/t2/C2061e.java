package t2;

import T5.B;
import T5.D;
import T5.H;
import T5.I;
import T5.z;
import android.os.Handler;
import android.os.Looper;
import i6.i;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: t2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2061e extends I {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f22306i = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22307a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f22309c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private H f22312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f22313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f22314h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22310d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22308b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t2.e$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2061e.this.l();
        }
    }

    /* JADX INFO: renamed from: t2.e$b */
    public interface b {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: t2.e$c */
    public interface c {
        void a(i iVar);

        void onMessage(String str);
    }

    public C2061e(String str, c cVar, b bVar) {
        this.f22307a = str;
        this.f22313g = cVar;
        this.f22314h = bVar;
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f22309c = aVar.e(10L, timeUnit).N(10L, timeUnit).M(0L, TimeUnit.MINUTES).b();
    }

    private void h(String str, Throwable th) {
        P0.a.k(f22306i, "Error occurred, shutting down websocket connection: " + str, th);
        j();
    }

    private void j() {
        H h7 = this.f22312f;
        if (h7 != null) {
            try {
                h7.f(1000, "End of session");
            } catch (Exception unused) {
            }
            this.f22312f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        if (!this.f22310d) {
            k();
        }
    }

    private void m() {
        if (this.f22310d) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.f22311e) {
            P0.a.G(f22306i, "Couldn't connect to \"" + this.f22307a + "\", will silently retry");
            this.f22311e = true;
        }
        this.f22308b.postDelayed(new a(), 2000L);
    }

    @Override // T5.I
    public synchronized void a(H h7, int i7, String str) {
        try {
            this.f22312f = null;
            if (!this.f22310d) {
                b bVar = this.f22314h;
                if (bVar != null) {
                    bVar.a();
                }
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // T5.I
    public synchronized void c(H h7, Throwable th, D d7) {
        try {
            if (this.f22312f != null) {
                h("Websocket exception", th);
            }
            if (!this.f22310d) {
                b bVar = this.f22314h;
                if (bVar != null) {
                    bVar.a();
                }
                m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // T5.I
    public synchronized void d(H h7, i iVar) {
        c cVar = this.f22313g;
        if (cVar != null) {
            cVar.a(iVar);
        }
    }

    @Override // T5.I
    public synchronized void e(H h7, String str) {
        c cVar = this.f22313g;
        if (cVar != null) {
            cVar.onMessage(str);
        }
    }

    @Override // T5.I
    public synchronized void f(H h7, D d7) {
        this.f22312f = h7;
        this.f22311e = false;
        b bVar = this.f22314h;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void i() {
        this.f22310d = true;
        j();
        this.f22313g = null;
        b bVar = this.f22314h;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void k() {
        if (this.f22310d) {
            throw new IllegalStateException("Can't connect closed client");
        }
        this.f22309c.C(new B.a().m(this.f22307a).b(), this);
    }

    public synchronized void n(String str) {
        H h7 = this.f22312f;
        if (h7 == null) {
            throw new ClosedChannelException();
        }
        h7.b(str);
    }
}
