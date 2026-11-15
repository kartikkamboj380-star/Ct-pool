package h4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import e4.C1629g;
import e4.InterfaceC1623a;
import f4.InterfaceC1650a;
import h4.E;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.F;
import k4.G;
import n4.C1928g;
import p4.C1973d;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;
import z3.InterfaceC2271k;

/* JADX INFO: renamed from: h4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1728q {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final FilenameFilter f19764t = new FilenameFilter() { // from class: h4.p
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C1728q.M(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f19766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1711B f19767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j4.n f19768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i4.f f19769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L f19770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1928g f19771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1713b f19772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j4.e f19773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC1623a f19774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC1650a f19775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1725n f19776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c0 f19777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private E f19778n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p4.j f19779o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final C2273m f19780p = new C2273m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final C2273m f19781q = new C2273m();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final C2273m f19782r = new C2273m();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicBoolean f19783s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h4.q$a */
    class a implements E.a {
        a() {
        }

        @Override // h4.E.a
        public void a(p4.j jVar, Thread thread, Throwable th) {
            C1728q.this.I(jVar, thread, th);
        }
    }

    /* JADX INFO: renamed from: h4.q$b */
    class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f19785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f19786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f19787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p4.j f19788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f19789e;

        /* JADX INFO: renamed from: h4.q$b$a */
        class a implements InterfaceC2271k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19791a;

            a(String str) {
                this.f19791a = str;
            }

            @Override // z3.InterfaceC2271k
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC2272l then(C1973d c1973d) {
                if (c1973d != null) {
                    return AbstractC2275o.h(C1728q.this.P(), C1728q.this.f19777m.A(C1728q.this.f19769e.f19951a, b.this.f19789e ? this.f19791a : null));
                }
                C1629g.f().k("Received null app settings, cannot send reports at crash time.");
                return AbstractC2275o.f(null);
            }
        }

        b(long j7, Throwable th, Thread thread, p4.j jVar, boolean z6) {
            this.f19785a = j7;
            this.f19786b = th;
            this.f19787c = thread;
            this.f19788d = jVar;
            this.f19789e = z6;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2272l call() {
            long jG = C1728q.G(this.f19785a);
            String strC = C1728q.this.C();
            if (strC == null) {
                C1629g.f().d("Tried to write a fatal exception while no session was open.");
                return AbstractC2275o.f(null);
            }
            C1728q.this.f19767c.a();
            C1728q.this.f19777m.v(this.f19786b, this.f19787c, strC, jG);
            C1728q.this.x(this.f19785a);
            C1728q.this.u(this.f19788d);
            C1728q.this.w(new C1720i().c(), Boolean.valueOf(this.f19789e));
            return !C1728q.this.f19766b.d() ? AbstractC2275o.f(null) : this.f19788d.a().q(C1728q.this.f19769e.f19951a, new a(strC));
        }
    }

    /* JADX INFO: renamed from: h4.q$c */
    class c implements InterfaceC2271k {
        c() {
        }

        @Override // z3.InterfaceC2271k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2272l then(Void r12) {
            return AbstractC2275o.f(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: h4.q$d */
    class d implements InterfaceC2271k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2272l f19794a;

        /* JADX INFO: renamed from: h4.q$d$a */
        class a implements InterfaceC2271k {
            a() {
            }

            @Override // z3.InterfaceC2271k
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC2272l then(C1973d c1973d) {
                if (c1973d == null) {
                    C1629g.f().k("Received null app settings at app startup. Cannot send cached reports");
                } else {
                    C1728q.this.P();
                    C1728q.this.f19777m.z(C1728q.this.f19769e.f19951a);
                    C1728q.this.f19782r.e(null);
                }
                return AbstractC2275o.f(null);
            }
        }

        d(AbstractC2272l abstractC2272l) {
            this.f19794a = abstractC2272l;
        }

        @Override // z3.InterfaceC2271k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2272l then(Boolean bool) {
            if (bool.booleanValue()) {
                C1629g.f().b("Sending cached crash reports...");
                C1728q.this.f19766b.c(bool.booleanValue());
                return this.f19794a.q(C1728q.this.f19769e.f19951a, new a());
            }
            C1629g.f().i("Deleting cached crash reports...");
            C1728q.r(C1728q.this.N());
            C1728q.this.f19777m.y();
            C1728q.this.f19782r.e(null);
            return AbstractC2275o.f(null);
        }
    }

    /* JADX INFO: renamed from: h4.q$e */
    class e implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f19797a;

        e(long j7) {
            this.f19797a = j7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f19797a);
            C1728q.this.f19775k.a("_ae", bundle);
            return null;
        }
    }

    C1728q(Context context, L l7, G g7, C1928g c1928g, C1711B c1711b, C1713b c1713b, j4.n nVar, j4.e eVar, c0 c0Var, InterfaceC1623a interfaceC1623a, InterfaceC1650a interfaceC1650a, C1725n c1725n, i4.f fVar) {
        this.f19765a = context;
        this.f19770f = l7;
        this.f19766b = g7;
        this.f19771g = c1928g;
        this.f19767c = c1711b;
        this.f19772h = c1713b;
        this.f19768d = nVar;
        this.f19773i = eVar;
        this.f19774j = interfaceC1623a;
        this.f19775k = interfaceC1650a;
        this.f19776l = c1725n;
        this.f19777m = c0Var;
        this.f19769e = fVar;
    }

    private static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C() {
        SortedSet sortedSetR = this.f19777m.r();
        if (sortedSetR.isEmpty()) {
            return null;
        }
        return (String) sortedSetR.first();
    }

    private static long D() {
        return G(System.currentTimeMillis());
    }

    static List E(e4.h hVar, String str, C1928g c1928g, byte[] bArr) {
        File fileQ = c1928g.q(str, "user-data");
        File fileQ2 = c1928g.q(str, "keys");
        File fileQ3 = c1928g.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1719h("logs_file", "logs", bArr));
        arrayList.add(new J("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new J("session_meta_file", "session", hVar.f()));
        arrayList.add(new J("app_meta_file", "app", hVar.a()));
        arrayList.add(new J("device_meta_file", "device", hVar.c()));
        arrayList.add(new J("os_meta_file", "os", hVar.b()));
        arrayList.add(R(hVar));
        arrayList.add(new J("user_meta_file", "user", fileQ));
        arrayList.add(new J("keys_file", "keys", fileQ2));
        arrayList.add(new J("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    private InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            C1629g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        C1629g.f().g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long G(long j7) {
        return j7 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(String str) {
        w(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean M(File file, String str) {
        return str.startsWith(".ae");
    }

    private AbstractC2272l O(long j7) {
        if (B()) {
            C1629g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return AbstractC2275o.f(null);
        }
        C1629g.f().b("Logging app exception event to Firebase Analytics");
        return AbstractC2275o.d(new ScheduledThreadPoolExecutor(1), new e(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC2272l P() {
        ArrayList arrayList = new ArrayList();
        for (File file : N()) {
            try {
                arrayList.add(O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C1629g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return AbstractC2275o.g(arrayList);
    }

    private static boolean Q(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            C1629g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C1629g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static O R(e4.h hVar) {
        File fileE = hVar.e();
        return (fileE == null || !fileE.exists()) ? new C1719h("minidump_file", "minidump", new byte[]{0}) : new J("minidump_file", "minidump", fileE);
    }

    private static byte[] T(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    private AbstractC2272l a0() {
        if (this.f19766b.d()) {
            C1629g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f19780p.e(Boolean.FALSE);
            return AbstractC2275o.f(Boolean.TRUE);
        }
        C1629g.f().b("Automatic data collection is disabled.");
        C1629g.f().i("Notifying that unsent reports are available.");
        this.f19780p.e(Boolean.TRUE);
        AbstractC2272l abstractC2272lR = this.f19766b.j().r(new c());
        C1629g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return i4.b.c(abstractC2272lR, this.f19781q.a());
    }

    private void b0(String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            C1629g.f().i("ANR feature enabled, but device is API " + i7);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f19765a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f19777m.x(str, historicalProcessExitReasons, new j4.e(this.f19771g, str), j4.n.k(str, this.f19771g, this.f19769e));
        } else {
            C1629g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static G.a o(L l7, C1713b c1713b) {
        return G.a.b(l7.f(), c1713b.f19713f, c1713b.f19714g, l7.a().c(), H.h(c1713b.f19711d).j(), c1713b.f19715h);
    }

    private static G.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(AbstractC1721j.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC1721j.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), AbstractC1721j.w(), AbstractC1721j.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c q() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC1721j.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(boolean z6, p4.j jVar, boolean z7) {
        String str;
        i4.f.c();
        ArrayList arrayList = new ArrayList(this.f19777m.r());
        if (arrayList.size() <= z6) {
            C1629g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z6 ? 1 : 0);
        if (z7 && jVar.b().f21619b.f21627b) {
            b0(str2);
        } else {
            C1629g.f().i("ANR feature disabled.");
        }
        if (z7 && this.f19774j.d(str2)) {
            z(str2);
        }
        if (z6 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f19776l.e(null);
            str = null;
        }
        this.f19777m.l(D(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, Boolean bool) {
        long jD = D();
        C1629g.f().b("Opening a new session with ID " + str);
        this.f19774j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C1710A.q()), jD, k4.G.b(o(this.f19770f, this.f19772h), q(), p(this.f19765a)));
        if (bool.booleanValue() && str != null) {
            this.f19768d.p(str);
        }
        this.f19773i.e(str);
        this.f19776l.e(str);
        this.f19777m.s(str, jD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(long j7) {
        try {
            if (this.f19771g.g(".ae" + j7).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e7) {
            C1629g.f().l("Could not create app exception marker file.", e7);
        }
    }

    private void z(String str) {
        C1629g.f().i("Finalizing native report for session " + str);
        e4.h hVarA = this.f19774j.a(str);
        File fileE = hVarA.e();
        F.a aVarD = hVarA.d();
        if (Q(str, fileE, aVarD)) {
            C1629g.f().k("No native core present");
            return;
        }
        long jLastModified = fileE.lastModified();
        j4.e eVar = new j4.e(this.f19771g, str);
        File fileK = this.f19771g.k(str);
        if (!fileK.isDirectory()) {
            C1629g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(jLastModified);
        List listE = E(hVarA, str, this.f19771g, eVar.b());
        P.b(fileK, listE);
        C1629g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f19777m.k(str, listE, aVarD);
        eVar.a();
    }

    boolean A(p4.j jVar) {
        i4.f.c();
        if (K()) {
            C1629g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C1629g.f().i("Finalizing previously open sessions.");
        try {
            v(true, jVar, true);
            C1629g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e7) {
            C1629g.f().e("Unable to finalize previously open sessions.", e7);
            return false;
        }
    }

    String H() {
        InputStream inputStreamF = F("META-INF/version-control-info.textproto");
        if (inputStreamF == null) {
            return null;
        }
        C1629g.f().b("Read version control info");
        return Base64.encodeToString(T(inputStreamF), 0);
    }

    void I(p4.j jVar, Thread thread, Throwable th) {
        J(jVar, thread, th, false);
    }

    synchronized void J(p4.j jVar, Thread thread, Throwable th, boolean z6) {
        C1629g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        AbstractC2272l abstractC2272lG = this.f19769e.f19951a.g(new b(System.currentTimeMillis(), th, thread, jVar, z6));
        if (!z6) {
            try {
                try {
                    f0.b(abstractC2272lG);
                } catch (TimeoutException unused) {
                    C1629g.f().d("Cannot send reports. Timed out while fetching settings.");
                }
            } catch (Exception e7) {
                C1629g.f().e("Error handling uncaught exception", e7);
            }
        }
    }

    boolean K() {
        E e7 = this.f19778n;
        return e7 != null && e7.a();
    }

    List N() {
        return this.f19771g.h(f19764t);
    }

    void S(final String str) {
        this.f19769e.f19951a.f(new Runnable() { // from class: h4.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f19762m.L(str);
            }
        });
    }

    void U() {
        try {
            String strH = H();
            if (strH != null) {
                X("com.crashlytics.version-control-info", strH);
                C1629g.f().g("Saved version control info");
            }
        } catch (IOException e7) {
            C1629g.f().l("Unable to save version control info", e7);
        }
    }

    AbstractC2272l V() {
        this.f19781q.e(Boolean.TRUE);
        return this.f19782r.a();
    }

    void W(String str, String str2) {
        try {
            this.f19768d.n(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = this.f19765a;
            if (context != null && AbstractC1721j.u(context)) {
                throw e7;
            }
            C1629g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void X(String str, String str2) {
        try {
            this.f19768d.o(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = this.f19765a;
            if (context != null && AbstractC1721j.u(context)) {
                throw e7;
            }
            C1629g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void Y(String str) {
        this.f19768d.q(str);
    }

    void Z(AbstractC2272l abstractC2272l) {
        if (this.f19777m.o()) {
            C1629g.f().i("Crash reports are available to be sent.");
            a0().q(this.f19769e.f19951a, new d(abstractC2272l));
        } else {
            C1629g.f().i("No crash reports are available to be sent.");
            this.f19780p.e(Boolean.FALSE);
        }
    }

    void c0(Thread thread, Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (K()) {
            return;
        }
        long jG = G(jCurrentTimeMillis);
        String strC = C();
        if (strC == null) {
            C1629g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f19777m.w(th, thread, strC, jG);
        }
    }

    void d0(long j7, String str) {
        if (K()) {
            return;
        }
        this.f19773i.g(j7, str);
    }

    AbstractC2272l n() {
        if (this.f19783s.compareAndSet(false, true)) {
            return this.f19780p.a();
        }
        C1629g.f().k("checkForUnsentReports should only be called once per execution.");
        return AbstractC2275o.f(Boolean.FALSE);
    }

    AbstractC2272l s() {
        this.f19781q.e(Boolean.FALSE);
        return this.f19782r.a();
    }

    boolean t() {
        i4.f.c();
        if (!this.f19767c.c()) {
            String strC = C();
            return strC != null && this.f19774j.d(strC);
        }
        C1629g.f().i("Found previous crash marker.");
        this.f19767c.d();
        return true;
    }

    void u(p4.j jVar) {
        v(false, jVar, false);
    }

    void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, p4.j jVar) {
        this.f19779o = jVar;
        S(str);
        E e7 = new E(new a(), jVar, uncaughtExceptionHandler, this.f19774j);
        this.f19778n = e7;
        Thread.setDefaultUncaughtExceptionHandler(e7);
    }
}
