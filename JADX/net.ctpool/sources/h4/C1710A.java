package h4;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import e4.C1629g;
import e4.InterfaceC1623a;
import f4.InterfaceC1650a;
import g4.InterfaceC1694a;
import g4.InterfaceC1695b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.C1928g;
import q4.C1998a;
import q4.C2000c;
import z3.AbstractC2272l;

/* JADX INFO: renamed from: h4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1710A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y3.f f19634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f19635c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1711B f19638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1711B f19639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1728q f19641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final L f19642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1928g f19643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1695b f19644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1650a f19645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1725n f19646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC1623a f19647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e4.l f19648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i4.f f19649q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19637e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f19636d = new Q();

    public C1710A(Y3.f fVar, L l7, InterfaceC1623a interfaceC1623a, G g7, InterfaceC1695b interfaceC1695b, InterfaceC1650a interfaceC1650a, C1928g c1928g, C1725n c1725n, e4.l lVar, i4.f fVar2) {
        this.f19634b = fVar;
        this.f19635c = g7;
        this.f19633a = fVar.m();
        this.f19642j = l7;
        this.f19647o = interfaceC1623a;
        this.f19644l = interfaceC1695b;
        this.f19645m = interfaceC1650a;
        this.f19643k = c1928g;
        this.f19646n = c1725n;
        this.f19648p = lVar;
        this.f19649q = fVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(String str) {
        this.f19641i.Y(str);
    }

    private void i() {
        boolean zEquals;
        try {
            zEquals = Boolean.TRUE.equals((Boolean) this.f19649q.f19951a.c().submit(new Callable() { // from class: h4.v
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f19808a.t();
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            zEquals = false;
        }
        this.f19640h = zEquals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void v(p4.j jVar) {
        i4.f.c();
        E();
        try {
            try {
                this.f19644l.a(new InterfaceC1694a() { // from class: h4.y
                    @Override // g4.InterfaceC1694a
                    public final void a(String str) {
                        this.f19814a.B(str);
                    }
                });
                this.f19641i.U();
            } catch (Exception e7) {
                C1629g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e7);
            }
            if (!jVar.b().f21619b.f21626a) {
                C1629g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f19641i.A(jVar)) {
                C1629g.f().k("Previous sessions could not be finalized.");
            }
            this.f19641i.Z(jVar.a());
            D();
        } catch (Throwable th) {
            D();
            throw th;
        }
    }

    private void p(final p4.j jVar) {
        C1629g c1629gF;
        String str;
        Future<?> futureSubmit = this.f19649q.f19951a.c().submit(new Runnable() { // from class: h4.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f19812m.v(jVar);
            }
        });
        C1629g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            C1629g.f().e("Crashlytics was interrupted during initialization.", e7);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            e = e8;
            c1629gF = C1629g.f();
            str = "Crashlytics encountered a problem during initialization.";
            c1629gF.e(str, e);
        } catch (TimeoutException e9) {
            e = e9;
            c1629gF = C1629g.f();
            str = "Crashlytics timed out during initialization.";
            c1629gF.e(str, e);
        }
    }

    public static String q() {
        return "19.2.1";
    }

    static boolean r(String str, boolean z6) {
        if (!z6) {
            C1629g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean t() {
        return Boolean.valueOf(this.f19641i.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(long j7, String str) {
        this.f19641i.d0(j7, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(final long j7, final String str) {
        this.f19649q.f19952b.f(new Runnable() { // from class: h4.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f19815m.w(j7, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Throwable th) {
        this.f19641i.c0(Thread.currentThread(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(String str, String str2) {
        this.f19641i.W(str, str2);
    }

    public void B(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f19637e;
        this.f19649q.f19951a.f(new Runnable() { // from class: h4.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f19809m.x(jCurrentTimeMillis, str);
            }
        });
    }

    public void C(final Throwable th) {
        this.f19649q.f19951a.f(new Runnable() { // from class: h4.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f19801m.y(th);
            }
        });
    }

    void D() {
        i4.f.c();
        try {
            if (this.f19638f.d()) {
                return;
            }
            C1629g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e7) {
            C1629g.f().e("Problem encountered deleting Crashlytics initialization marker.", e7);
        }
    }

    void E() {
        i4.f.c();
        this.f19638f.a();
        C1629g.f().i("Initialization marker file was created.");
    }

    public boolean F(C1713b c1713b, p4.j jVar) {
        if (!r(c1713b.f19709b, AbstractC1721j.i(this.f19633a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C1720i().c();
        try {
            this.f19639g = new C1711B("crash_marker", this.f19643k);
            this.f19638f = new C1711B("initialization_marker", this.f19643k);
            j4.n nVar = new j4.n(strC, this.f19643k, this.f19649q);
            j4.e eVar = new j4.e(this.f19643k);
            C1998a c1998a = new C1998a(1024, new C2000c(10));
            this.f19648p.c(nVar);
            this.f19641i = new C1728q(this.f19633a, this.f19642j, this.f19635c, this.f19643k, this.f19639g, c1713b, nVar, eVar, c0.i(this.f19633a, this.f19642j, this.f19643k, c1713b, eVar, nVar, c1998a, jVar, this.f19636d, this.f19646n, this.f19649q), this.f19647o, this.f19645m, this.f19646n, this.f19649q);
            boolean zM = m();
            i();
            this.f19641i.y(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zM || !AbstractC1721j.d(this.f19633a)) {
                C1629g.f().b("Successfully configured exception handler.");
                return true;
            }
            C1629g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            p(jVar);
            return false;
        } catch (Exception e7) {
            C1629g.f().e("Crashlytics was not started due to an exception during initialization", e7);
            this.f19641i = null;
            return false;
        }
    }

    public AbstractC2272l G() {
        return this.f19641i.V();
    }

    public void H(Boolean bool) {
        this.f19635c.h(bool);
    }

    public void I(final String str, final String str2) {
        this.f19649q.f19951a.f(new Runnable() { // from class: h4.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f19805m.z(str, str2);
            }
        });
    }

    public void J(final String str) {
        this.f19649q.f19951a.f(new Runnable() { // from class: h4.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f19803m.A(str);
            }
        });
    }

    public AbstractC2272l j() {
        return this.f19641i.n();
    }

    public AbstractC2272l k() {
        return this.f19641i.s();
    }

    public boolean l() {
        return this.f19640h;
    }

    boolean m() {
        return this.f19638f.c();
    }

    public AbstractC2272l o(final p4.j jVar) {
        return this.f19649q.f19951a.f(new Runnable() { // from class: h4.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f19799m.u(jVar);
            }
        });
    }

    public boolean s() {
        return this.f19635c.d();
    }
}
