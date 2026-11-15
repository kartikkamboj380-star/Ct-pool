package Y3;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.p;
import b4.C0688c;
import b4.C0691f;
import b4.C0699n;
import b4.w;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f4437k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map f4438l = new C1890a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f4441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0699n f4442d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f4445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final D4.b f4446h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4443e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f4444f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f4447i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f4448j = new CopyOnWriteArrayList();

    public interface a {
        void onBackgroundStateChanged(boolean z6);
    }

    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference f4449a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4449a.get() == null) {
                    b bVar = new b();
                    if (com.facebook.jni.a.a(f4449a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z6) {
            synchronized (f.f4437k) {
                try {
                    for (f fVar : new ArrayList(f.f4438l.values())) {
                        if (fVar.f4443e.get()) {
                            fVar.C(z6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference f4450b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4451a;

        public c(Context context) {
            this.f4451a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f4450b.get() == null) {
                c cVar = new c(context);
                if (com.facebook.jni.a.a(f4450b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f4451a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f4437k) {
                try {
                    Iterator it = f.f4438l.values().iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, n nVar) {
        this.f4439a = (Context) Preconditions.checkNotNull(context);
        this.f4440b = Preconditions.checkNotEmpty(str);
        this.f4441c = (n) Preconditions.checkNotNull(nVar);
        o oVarB = FirebaseInitProvider.b();
        Q4.c.b("Firebase");
        Q4.c.b("ComponentDiscovery");
        List listB = C0691f.c(context, ComponentDiscoveryService.class).b();
        Q4.c.a();
        Q4.c.b("Runtime");
        C0699n.b bVarG = C0699n.m(c4.l.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C0688c.s(context, Context.class, new Class[0])).b(C0688c.s(this, f.class, new Class[0])).b(C0688c.s(nVar, n.class, new Class[0])).g(new Q4.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(C0688c.s(oVarB, o.class, new Class[0]));
        }
        C0699n c0699nE = bVarG.e();
        this.f4442d = c0699nE;
        Q4.c.a();
        this.f4445g = new w(new D4.b() { // from class: Y3.d
            @Override // D4.b
            public final Object get() {
                return this.f4434a.z(context);
            }
        });
        this.f4446h = c0699nE.b(B4.f.class);
        g(new a() { // from class: Y3.e
            @Override // Y3.f.a
            public final void onBackgroundStateChanged(boolean z6) {
                this.f4436a.A(z6);
            }
        });
        Q4.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(boolean z6) {
        if (z6) {
            return;
        }
        ((B4.f) this.f4446h.get()).l();
    }

    private static String B(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z6) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f4447i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onBackgroundStateChanged(z6);
        }
    }

    private void D() {
        Iterator it = this.f4448j.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this.f4440b, this.f4441c);
        }
    }

    private void i() {
        Preconditions.checkState(!this.f4444f.get(), "FirebaseApp was deleted");
    }

    private static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f4437k) {
            try {
                Iterator it = f4438l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((f) it.next()).q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (f4437k) {
            arrayList = new ArrayList(f4438l.values());
        }
        return arrayList;
    }

    public static f o() {
        f fVar;
        synchronized (f4437k) {
            try {
                fVar = (f) f4438l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((B4.f) fVar.f4446h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f p(String str) {
        f fVar;
        String str2;
        synchronized (f4437k) {
            try {
                fVar = (f) f4438l.get(B(str));
                if (fVar == null) {
                    List listL = l();
                    if (listL.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listL);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((B4.f) fVar.f4446h.get()).l();
            } finally {
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!p.a(this.f4439a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f4439a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f4442d.p(y());
        ((B4.f) this.f4446h.get()).l();
    }

    public static f u(Context context) {
        synchronized (f4437k) {
            try {
                if (f4438l.containsKey("[DEFAULT]")) {
                    return o();
                }
                n nVarA = n.a(context);
                if (nVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return v(context, nVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f v(Context context, n nVar) {
        return w(context, nVar, "[DEFAULT]");
    }

    public static f w(Context context, n nVar, String str) {
        f fVar;
        b.b(context);
        String strB = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4437k) {
            Map map = f4438l;
            Preconditions.checkState(!map.containsKey(strB), "FirebaseApp name " + strB + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            fVar = new f(context, strB, nVar);
            map.put(strB, fVar);
        }
        fVar.t();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I4.a z(Context context) {
        return new I4.a(context, s(), (A4.c) this.f4442d.a(A4.c.class));
    }

    public void E(boolean z6) {
        boolean z7;
        i();
        if (this.f4443e.compareAndSet(!z6, z6)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z6 && zIsInBackground) {
                z7 = true;
            } else if (z6 || !zIsInBackground) {
                return;
            } else {
                z7 = false;
            }
            C(z7);
        }
    }

    public void F(Boolean bool) {
        i();
        ((I4.a) this.f4445g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4440b.equals(((f) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f4443e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f4447i.add(aVar);
    }

    public void h(g gVar) {
        i();
        Preconditions.checkNotNull(gVar);
        this.f4448j.add(gVar);
    }

    public int hashCode() {
        return this.f4440b.hashCode();
    }

    public void j() {
        if (this.f4444f.compareAndSet(false, true)) {
            synchronized (f4437k) {
                f4438l.remove(this.f4440b);
            }
            D();
        }
    }

    public Object k(Class cls) {
        i();
        return this.f4442d.a(cls);
    }

    public Context m() {
        i();
        return this.f4439a;
    }

    public String q() {
        i();
        return this.f4440b;
    }

    public n r() {
        i();
        return this.f4441c;
    }

    public String s() {
        return Base64Utils.encodeUrlSafeNoPadding(q().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f4440b).add("options", this.f4441c).toString();
    }

    public boolean x() {
        i();
        return ((I4.a) this.f4445g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
