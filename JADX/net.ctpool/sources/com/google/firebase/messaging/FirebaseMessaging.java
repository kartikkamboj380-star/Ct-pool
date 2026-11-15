package com.google.firebase.messaging;

import C4.a;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.Y;
import com.google.firebase.messaging.d0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n3.C1908a;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;
import z3.InterfaceC2268h;
import z3.InterfaceC2271k;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static d0 f17504m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static ScheduledExecutorService f17506o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y3.f f17507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f17508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f17509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y f17510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f17511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f17512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f17513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2272l f17514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final L f17515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f17517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f17503l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static D4.b f17505n = new D4.b() { // from class: com.google.firebase.messaging.r
        @Override // D4.b
        public final Object get() {
            return FirebaseMessaging.L();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A4.d f17518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private A4.b f17520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f17521d;

        a(A4.d dVar) {
            this.f17518a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(A4.a aVar) {
            if (c()) {
                FirebaseMessaging.this.U();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextM = FirebaseMessaging.this.f17507a.m();
            SharedPreferences sharedPreferences = contextM.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextM.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextM.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f17519b) {
                    return;
                }
                Boolean boolE = e();
                this.f17521d = boolE;
                if (boolE == null) {
                    A4.b bVar = new A4.b() { // from class: com.google.firebase.messaging.D
                        @Override // A4.b
                        public final void a(A4.a aVar) {
                            this.f17500a.d(aVar);
                        }
                    };
                    this.f17520c = bVar;
                    this.f17518a.b(Y3.b.class, bVar);
                }
                this.f17519b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f17521d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f17507a.x();
        }

        synchronized void f(boolean z6) {
            try {
                b();
                A4.b bVar = this.f17520c;
                if (bVar != null) {
                    this.f17518a.a(Y3.b.class, bVar);
                    this.f17520c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f17507a.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z6);
                editorEdit.apply();
                if (z6) {
                    FirebaseMessaging.this.U();
                }
                this.f17521d = Boolean.valueOf(z6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    FirebaseMessaging(Y3.f fVar, C4.a aVar, D4.b bVar, A4.d dVar, L l7, G g7, Executor executor, Executor executor2, Executor executor3) {
        this.f17516j = false;
        f17505n = bVar;
        this.f17507a = fVar;
        this.f17511e = new a(dVar);
        Context contextM = fVar.m();
        this.f17508b = contextM;
        C1552q c1552q = new C1552q();
        this.f17517k = c1552q;
        this.f17515i = l7;
        this.f17509c = g7;
        this.f17510d = new Y(executor);
        this.f17512f = executor2;
        this.f17513g = executor3;
        Context contextM2 = fVar.m();
        if (contextM2 instanceof Application) {
            ((Application) contextM2).registerActivityLifecycleCallbacks(c1552q);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextM2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0012a() { // from class: com.google.firebase.messaging.w
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f17719m.I();
            }
        });
        AbstractC2272l abstractC2272lF = i0.f(this, l7, g7, contextM, AbstractC1550o.g());
        this.f17514h = abstractC2272lF;
        abstractC2272lF.f(executor2, new InterfaceC2268h() { // from class: com.google.firebase.messaging.y
            @Override // z3.InterfaceC2268h
            public final void b(Object obj) {
                this.f17720a.J((i0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f17721m.K();
            }
        });
    }

    private void A(String str) {
        if ("[DEFAULT]".equals(this.f17507a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f17507a.q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C1549n(this.f17508b).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC2272l D(String str, d0.a aVar, String str2) {
        t(this.f17508b).g(u(), str, str2, this.f17515i.a());
        if (aVar == null || !str2.equals(aVar.f17625a)) {
            A(str2);
        }
        return AbstractC2275o.f(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC2272l E(final String str, final d0.a aVar) {
        return this.f17509c.g().q(this.f17513g, new InterfaceC2271k() { // from class: com.google.firebase.messaging.t
            @Override // z3.InterfaceC2271k
            public final AbstractC2272l then(Object obj) {
                return this.f17711a.D(str, aVar, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(C2273m c2273m) {
        try {
            AbstractC2275o.a(this.f17509c.c());
            t(this.f17508b).d(u(), L.c(this.f17507a));
            c2273m.c(null);
        } catch (Exception e7) {
            c2273m.b(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(C2273m c2273m) {
        try {
            c2273m.c(n());
        } catch (Exception e7) {
            c2273m.b(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(C1908a c1908a) {
        if (c1908a != null) {
            K.y(c1908a.w());
            y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        if (B()) {
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(i0 i0Var) {
        if (B()) {
            i0Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ S2.j L() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2272l M(String str, i0 i0Var) {
        return i0Var.r(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2272l N(String str, i0 i0Var) {
        return i0Var.u(str);
    }

    private boolean S() {
        S.c(this.f17508b);
        if (!S.d(this.f17508b)) {
            return false;
        }
        if (this.f17507a.k(Z3.a.class) != null) {
            return true;
        }
        return K.a() && f17505n != null;
    }

    private synchronized void T() {
        if (!this.f17516j) {
            W(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (X(w())) {
            T();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(Y3.f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.k(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging s() {
        return getInstance(Y3.f.o());
    }

    private static synchronized d0 t(Context context) {
        try {
            if (f17504m == null) {
                f17504m = new d0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17504m;
    }

    private String u() {
        return "[DEFAULT]".equals(this.f17507a.q()) ? "" : this.f17507a.s();
    }

    public static S2.j x() {
        return (S2.j) f17505n.get();
    }

    private void y() {
        this.f17509c.f().f(this.f17512f, new InterfaceC2268h() { // from class: com.google.firebase.messaging.B
            @Override // z3.InterfaceC2268h
            public final void b(Object obj) {
                this.f17498a.H((C1908a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void K() {
        S.c(this.f17508b);
        U.g(this.f17508b, this.f17509c, S());
        if (S()) {
            y();
        }
    }

    public boolean B() {
        return this.f17511e.c();
    }

    boolean C() {
        return this.f17515i.g();
    }

    public void O(V v6) {
        if (TextUtils.isEmpty(v6.l1())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f17508b, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        v6.n1(intent);
        this.f17508b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void P(boolean z6) {
        this.f17511e.f(z6);
    }

    public void Q(boolean z6) {
        K.B(z6);
        U.g(this.f17508b, this.f17509c, S());
    }

    synchronized void R(boolean z6) {
        this.f17516j = z6;
    }

    public AbstractC2272l V(final String str) {
        return this.f17514h.r(new InterfaceC2271k() { // from class: com.google.firebase.messaging.A
            @Override // z3.InterfaceC2271k
            public final AbstractC2272l then(Object obj) {
                return FirebaseMessaging.M(str, (i0) obj);
            }
        });
    }

    synchronized void W(long j7) {
        q(new e0(this, Math.min(Math.max(30L, 2 * j7), f17503l)), j7);
        this.f17516j = true;
    }

    boolean X(d0.a aVar) {
        return aVar == null || aVar.b(this.f17515i.a());
    }

    public AbstractC2272l Y(final String str) {
        return this.f17514h.r(new InterfaceC2271k() { // from class: com.google.firebase.messaging.C
            @Override // z3.InterfaceC2271k
            public final AbstractC2272l then(Object obj) {
                return FirebaseMessaging.N(str, (i0) obj);
            }
        });
    }

    String n() throws IOException {
        final d0.a aVarW = w();
        if (!X(aVarW)) {
            return aVarW.f17625a;
        }
        final String strC = L.c(this.f17507a);
        try {
            return (String) AbstractC2275o.a(this.f17510d.b(strC, new Y.a() { // from class: com.google.firebase.messaging.s
                @Override // com.google.firebase.messaging.Y.a
                public final AbstractC2272l start() {
                    return this.f17708a.E(strC, aVarW);
                }
            }));
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException(e7);
        }
    }

    public AbstractC2272l o() {
        if (w() == null) {
            return AbstractC2275o.f(null);
        }
        final C2273m c2273m = new C2273m();
        AbstractC1550o.e().execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f17716m.F(c2273m);
            }
        });
        return c2273m.a();
    }

    public boolean p() {
        return K.a();
    }

    void q(Runnable runnable, long j7) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f17506o == null) {
                    f17506o = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f17506o.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context r() {
        return this.f17508b;
    }

    public AbstractC2272l v() {
        final C2273m c2273m = new C2273m();
        this.f17512f.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f17714m.G(c2273m);
            }
        });
        return c2273m.a();
    }

    d0.a w() {
        return t(this.f17508b).e(u(), L.c(this.f17507a));
    }

    FirebaseMessaging(Y3.f fVar, C4.a aVar, D4.b bVar, D4.b bVar2, E4.e eVar, D4.b bVar3, A4.d dVar) {
        this(fVar, aVar, bVar, bVar2, eVar, bVar3, dVar, new L(fVar.m()));
    }

    FirebaseMessaging(Y3.f fVar, C4.a aVar, D4.b bVar, D4.b bVar2, E4.e eVar, D4.b bVar3, A4.d dVar, L l7) {
        this(fVar, aVar, bVar3, dVar, l7, new G(fVar, l7, bVar, bVar2, eVar), AbstractC1550o.f(), AbstractC1550o.c(), AbstractC1550o.b());
    }
}
