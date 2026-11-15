package com.facebook.react.devsupport;

import S1.g;
import X1.e;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.AbstractC0834q;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.C0797a;
import com.facebook.react.devsupport.C0803g;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC0802f;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import n2.InterfaceC1899a;
import t2.InterfaceC2064h;

/* JADX INFO: loaded from: classes.dex */
public abstract class B implements X1.e {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final X1.b f11462B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private List f11463C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Map f11464D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final S1.j f11465E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S1.g f11467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f11468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0803g f11469d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a0 f11471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f11473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f11474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final DefaultJSExceptionHandler f11475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final X1.c f11476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final X1.h f11477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private S1.i f11478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AlertDialog f11479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0799c f11480o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ReactContext f11483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1899a f11484s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f11489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private X1.j[] f11490y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private X1.f f11491z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f11470e = new LinkedHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11481p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11482q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11485t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f11486u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f11487v = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f11461A = 0;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (B.o0(context).equals(intent.getAction())) {
                if (intent.getBooleanExtra("jsproxy", false)) {
                    B.this.f11484s.f(true);
                    B.this.f11469d.x();
                } else {
                    B.this.f11484s.f(false);
                }
                B.this.q();
            }
        }
    }

    class b implements X1.d {
        b() {
        }

        @Override // X1.d
        public void a() {
            if (!B.this.f11484s.h() && B.this.f11484s.i()) {
                Toast.makeText(B.this.f11466a, B.this.f11466a.getString(AbstractC0834q.f12022h), 1).show();
                B.this.f11484s.b(false);
            }
            B.this.q();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ EditText f11494m;

        c(EditText editText) {
            this.f11494m = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            B.this.f11484s.j().c(this.f11494m.getText().toString());
            B.this.q();
        }
    }

    class d implements X1.d {
        d() {
        }

        @Override // X1.d
        public void a() {
            B.this.f11484s.c(!B.this.f11484s.a());
            B.this.f11471f.h();
        }
    }

    class e extends ArrayAdapter {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Set f11497m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i7, String[] strArr, Set set) {
            super(context, i7, strArr);
            this.f11497m = set;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i7, view, viewGroup);
            view2.setEnabled(isEnabled(i7));
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i7) {
            return !this.f11497m.contains(getItem(i7));
        }
    }

    class f implements JSCHeapCapture.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2064h f11499a;

        f(InterfaceC2064h interfaceC2064h) {
            this.f11499a = interfaceC2064h;
        }

        @Override // com.facebook.react.devsupport.JSCHeapCapture.a
        public void a(File file) {
            this.f11499a.a(file.toString());
        }

        @Override // com.facebook.react.devsupport.JSCHeapCapture.a
        public void b(JSCHeapCapture.b bVar) {
            this.f11499a.b(bVar.toString());
        }
    }

    class g implements X1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0797a.c f11501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X1.a f11502b;

        g(C0797a.c cVar, X1.a aVar) {
            this.f11501a = cVar;
            this.f11502b = aVar;
        }

        @Override // X1.b
        public void a() {
            B.this.r0();
            if (B.this.f11462B != null) {
                B.this.f11462B.a();
            }
            ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, this.f11501a.c());
            this.f11502b.a();
        }

        @Override // X1.b
        public void c(Exception exc) {
            B.this.r0();
            if (B.this.f11462B != null) {
                B.this.f11462B.c(exc);
            }
            P0.a.k("ReactNative", "Unable to download JS bundle", exc);
            B.this.N0(exc);
            this.f11502b.b(exc);
        }

        @Override // X1.b
        public void d(String str, Integer num, Integer num2) {
            B.this.f11476k.b(str, num, num2);
            if (B.this.f11462B != null) {
                B.this.f11462B.d(str, num, num2);
            }
        }
    }

    class h implements C0803g.h {
        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(InterfaceC2064h interfaceC2064h) {
            B.this.q0(interfaceC2064h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k() {
            B.this.C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            B.this.q();
        }

        @Override // com.facebook.react.devsupport.C0803g.h
        public void a() {
            B.this.f11488w = true;
        }

        @Override // com.facebook.react.devsupport.C0803g.h
        public void b() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.E
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11515m.k();
                }
            });
        }

        @Override // com.facebook.react.devsupport.C0803g.h
        public void c(final InterfaceC2064h interfaceC2064h) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11505m.j(interfaceC2064h);
                }
            });
        }

        @Override // com.facebook.react.devsupport.C0803g.h
        public void d() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                B.this.f11469d.n();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11514m.l();
                }
            });
        }

        @Override // com.facebook.react.devsupport.C0803g.h
        public void e() {
            B.this.f11488w = false;
        }

        @Override // com.facebook.react.devsupport.C0803g.h
        public Map f() {
            return B.this.f11464D;
        }
    }

    public B(Context context, a0 a0Var, String str, boolean z6, X1.i iVar, X1.b bVar, int i7, Map map, S1.j jVar, X1.c cVar, X1.h hVar) {
        this.f11471f = a0Var;
        this.f11466a = context;
        this.f11472g = str;
        SharedPreferencesOnSharedPreferenceChangeListenerC0802f sharedPreferencesOnSharedPreferenceChangeListenerC0802f = new SharedPreferencesOnSharedPreferenceChangeListenerC0802f(context, new SharedPreferencesOnSharedPreferenceChangeListenerC0802f.b() { // from class: com.facebook.react.devsupport.m
            @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC0802f.b
            public final void a() {
                this.f11671a.M0();
            }
        });
        this.f11484s = sharedPreferencesOnSharedPreferenceChangeListenerC0802f;
        this.f11469d = new C0803g(sharedPreferencesOnSharedPreferenceChangeListenerC0802f, context, sharedPreferencesOnSharedPreferenceChangeListenerC0802f.j());
        this.f11462B = bVar;
        this.f11467b = new S1.g(new g.a() { // from class: com.facebook.react.devsupport.n
            @Override // S1.g.a
            public final void a() {
                this.f11672a.C();
            }
        }, i7);
        this.f11464D = map;
        this.f11468c = new a();
        String strP0 = p0();
        this.f11473h = new File(context.getFilesDir(), strP0 + "ReactNativeDevBundle.js");
        this.f11474i = context.getDir(strP0.toLowerCase(Locale.ROOT) + "_dev_js_split_bundles", 0);
        this.f11475j = new DefaultJSExceptionHandler();
        s(z6);
        this.f11476k = cVar == null ? new C0800d(a0Var) : cVar;
        this.f11465E = jVar;
        this.f11477l = hVar == null ? new Y(new androidx.core.util.h() { // from class: com.facebook.react.devsupport.o
            @Override // androidx.core.util.h
            public final Object get() {
                return this.f11673a.u0();
            }
        }) : hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        Activity activityJ = this.f11471f.j();
        if (activityJ == null || activityJ.isFinishing()) {
            P0.a.j("ReactNative", "Unable to launch change bundle location because react activity is not available");
            return;
        }
        EditText editText = new EditText(activityJ);
        editText.setHint("localhost:8081");
        new AlertDialog.Builder(activityJ).setTitle(this.f11466a.getString(AbstractC0834q.f12016b)).setView(editText).setPositiveButton(R.string.ok, new c(editText)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        boolean z6 = !this.f11484s.i();
        this.f11484s.b(z6);
        ReactContext reactContext = this.f11483r;
        if (reactContext != null) {
            HMRClient hMRClient = (HMRClient) reactContext.getJSModule(HMRClient.class);
            if (z6) {
                hMRClient.enable();
            } else {
                hMRClient.disable();
            }
        }
        if (!z6 || this.f11484s.h()) {
            return;
        }
        Context context = this.f11466a;
        Toast.makeText(context, context.getString(AbstractC0834q.f12023i), 1).show();
        this.f11484s.l(true);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        if (!this.f11484s.g()) {
            Activity activityJ = this.f11471f.j();
            if (activityJ == null) {
                P0.a.j("ReactNative", "Unable to get reference to react activity");
            } else {
                C0799c.h(activityJ);
            }
        }
        this.f11484s.e(!r0.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0() {
        Intent intent = new Intent(this.f11466a, (Class<?>) AbstractC0804h.class);
        intent.setFlags(268435456);
        this.f11466a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(X1.d[] dVarArr, DialogInterface dialogInterface, int i7) {
        dVarArr[i7].a();
        this.f11479n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(DialogInterface dialogInterface) {
        this.f11479n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(String str, X1.j[] jVarArr, int i7, X1.f fVar) {
        S0(str, jVarArr, i7, fVar);
        if (this.f11478m == null) {
            S1.i iVarC = c(NativeRedBoxSpec.NAME);
            if (iVarC == null) {
                iVarC = new e0(this);
            }
            this.f11478m = iVarC;
            this.f11478m.f(NativeRedBoxSpec.NAME);
        }
        if (this.f11478m.a()) {
            return;
        }
        this.f11478m.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0() {
        this.f11484s.c(!r0.a());
        this.f11471f.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(int i7, String str, ReadableArray readableArray) {
        S1.i iVar = this.f11478m;
        if ((iVar == null || iVar.a()) && i7 == this.f11461A) {
            S0(str, h0.b(readableArray), i7, X1.f.f4294n);
            this.f11478m.b();
        }
    }

    private void J0(Exception exc) {
        StringBuilder sb = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("\n\n");
            sb.append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            R0(sb.toString(), exc);
        } else {
            P0.a.k("ReactNative", "Exception in native call from JS", exc);
            Q0(exc.getMessage().toString(), new X1.j[0], -1, X1.f.f4294n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        UiThreadUtil.assertOnUiThread();
        if (!this.f11487v) {
            C0799c c0799c = this.f11480o;
            if (c0799c != null) {
                c0799c.i(false);
            }
            if (this.f11486u) {
                this.f11467b.f();
                this.f11486u = false;
            }
            if (this.f11485t) {
                this.f11466a.unregisterReceiver(this.f11468c);
                this.f11485t = false;
            }
            o();
            s0();
            this.f11476k.c();
            this.f11469d.i();
            return;
        }
        C0799c c0799c2 = this.f11480o;
        if (c0799c2 != null) {
            c0799c2.i(this.f11484s.g());
        }
        if (!this.f11486u) {
            this.f11467b.e((SensorManager) this.f11466a.getSystemService("sensor"));
            this.f11486u = true;
        }
        if (!this.f11485t) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(o0(this.f11466a));
            i0(this.f11466a, this.f11468c, intentFilter, true);
            this.f11485t = true;
        }
        if (this.f11481p) {
            this.f11476k.a("Reloading...");
        }
        this.f11469d.A(getClass().getSimpleName(), new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f11662m.v0(exc);
            }
        });
    }

    private void O0(ReactContext reactContext) {
        if (this.f11483r == reactContext) {
            return;
        }
        this.f11483r = reactContext;
        C0799c c0799c = this.f11480o;
        if (c0799c != null) {
            c0799c.i(false);
        }
        if (reactContext != null) {
            this.f11480o = new C0799c(reactContext);
        }
        if (this.f11483r != null) {
            try {
                URL url = new URL(v());
                ((HMRClient) this.f11483r.getJSModule(HMRClient.class)).setup("android", url.getPath().substring(1), url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.f11484s.i());
            } catch (MalformedURLException e7) {
                R0(e7.getMessage(), e7);
            }
        }
        M0();
    }

    private void P0(String str) {
        if (this.f11466a == null) {
            return;
        }
        try {
            URL url = new URL(str);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            this.f11476k.a(this.f11466a.getString(AbstractC0834q.f12026l, url.getHost() + ":" + port));
            this.f11481p = true;
        } catch (MalformedURLException e7) {
            P0.a.j("ReactNative", "Bundle url format is invalid. \n\n" + e7.toString());
        }
    }

    private void Q0(final String str, final X1.j[] jVarArr, final int i7, final X1.f fVar) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f11680m.G0(str, jVarArr, i7, fVar);
            }
        });
    }

    private void S0(String str, X1.j[] jVarArr, int i7, X1.f fVar) {
        this.f11489x = str;
        this.f11490y = jVarArr;
        this.f11461A = i7;
        this.f11491z = fVar;
    }

    private void i0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z6) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z6 ? 2 : 4);
        }
    }

    private String m0() {
        try {
            return n0().b().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String o0(Context context) {
        return context.getPackageName() + ".RELOAD_APP_ACTION";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(InterfaceC2064h interfaceC2064h) {
        JSCHeapCapture jSCHeapCapture;
        ReactContext reactContext = this.f11483r;
        if (reactContext == null || (jSCHeapCapture = (JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)) == null) {
            return;
        }
        jSCHeapCapture.captureHeap(this.f11466a.getCacheDir().getPath(), new f(interfaceC2064h));
    }

    private void s0() {
        AlertDialog alertDialog = this.f11479n;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f11479n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(X1.g gVar) {
        this.f11469d.w(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Context u0() {
        Activity activityJ = this.f11471f.j();
        if (activityJ == null || activityJ.isFinishing()) {
            return null;
        }
        return activityJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(Exception exc) {
        R0(exc instanceof S1.c ? ((S1.c) exc).getMessage() : this.f11466a.getString(AbstractC0834q.f12031q), exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(boolean z6) {
        this.f11484s.e(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(boolean z6) {
        this.f11484s.b(z6);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(boolean z6) {
        this.f11484s.f(z6);
        q();
    }

    @Override // X1.e
    public boolean A() {
        if (this.f11487v && this.f11473h.exists()) {
            try {
                String packageName = this.f11466a.getPackageName();
                if (this.f11473h.lastModified() > this.f11466a.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", packageName));
                    if (file.exists()) {
                        return this.f11473h.lastModified() > file.lastModified();
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                P0.a.j("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @Override // X1.e
    public X1.j[] B() {
        return this.f11490y;
    }

    @Override // X1.e
    public void C() {
        Context context;
        int i7;
        Context context2;
        int i8;
        if (this.f11479n == null && this.f11487v && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            linkedHashMap.put(this.f11466a.getString(AbstractC0834q.f12030p), new b());
            if (this.f11484s.m()) {
                this.f11484s.f(false);
                q();
            }
            if (this.f11484s.k() && !this.f11484s.m()) {
                boolean z6 = this.f11488w;
                String string = this.f11466a.getString(z6 ? AbstractC0834q.f12017c : AbstractC0834q.f12018d);
                if (!z6) {
                    hashSet.add(string);
                }
                linkedHashMap.put(string, new X1.d() { // from class: com.facebook.react.devsupport.w
                    @Override // X1.d
                    public final void a() {
                        this.f11691a.z0();
                    }
                });
            }
            linkedHashMap.put(this.f11466a.getString(AbstractC0834q.f12016b), new X1.d() { // from class: com.facebook.react.devsupport.x
                @Override // X1.d
                public final void a() {
                    this.f11692a.A0();
                }
            });
            linkedHashMap.put(this.f11466a.getString(AbstractC0834q.f12025k), new d());
            if (this.f11484s.i()) {
                context = this.f11466a;
                i7 = AbstractC0834q.f12024j;
            } else {
                context = this.f11466a;
                i7 = AbstractC0834q.f12021g;
            }
            linkedHashMap.put(context.getString(i7), new X1.d() { // from class: com.facebook.react.devsupport.y
                @Override // X1.d
                public final void a() {
                    this.f11693a.B0();
                }
            });
            if (this.f11484s.g()) {
                context2 = this.f11466a;
                i8 = AbstractC0834q.f12029o;
            } else {
                context2 = this.f11466a;
                i8 = AbstractC0834q.f12028n;
            }
            linkedHashMap.put(context2.getString(i8), new X1.d() { // from class: com.facebook.react.devsupport.z
                @Override // X1.d
                public final void a() {
                    this.f11694a.C0();
                }
            });
            linkedHashMap.put(this.f11466a.getString(AbstractC0834q.f12032r), new X1.d() { // from class: com.facebook.react.devsupport.A
                @Override // X1.d
                public final void a() {
                    this.f11460a.D0();
                }
            });
            if (this.f11470e.size() > 0) {
                linkedHashMap.putAll(this.f11470e);
            }
            final X1.d[] dVarArr = (X1.d[]) linkedHashMap.values().toArray(new X1.d[0]);
            Activity activityJ = this.f11471f.j();
            if (activityJ == null || activityJ.isFinishing()) {
                P0.a.j("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(activityJ);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(activityJ);
            textView.setText(activityJ.getString(AbstractC0834q.f12019e, p0()));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String strM0 = m0();
            if (strM0 != null) {
                TextView textView2 = new TextView(activityJ);
                textView2.setText(activityJ.getString(AbstractC0834q.f12020f, strM0));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activityJ).setCustomTitle(linearLayout).setAdapter(new e(activityJ, R.layout.simple_list_item_1, (String[]) linkedHashMap.keySet().toArray(new String[0]), hashSet), new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f11666m.E0(dVarArr, dialogInterface, i9);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.k
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f11668m.F0(dialogInterface);
                }
            }).create();
            this.f11479n = alertDialogCreate;
            alertDialogCreate.show();
            ReactContext reactContext = this.f11483r;
            if (reactContext != null) {
                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit("RCTDevMenuShown", null);
            }
        }
    }

    @Override // X1.e
    public void D(ReactContext reactContext) {
        if (reactContext == this.f11483r) {
            O0(null);
        }
    }

    @Override // X1.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z0() {
        this.f11469d.y(this.f11483r, this.f11466a.getString(AbstractC0834q.f12027m));
    }

    @Override // X1.e
    public void F(final String str, final ReadableArray readableArray, final int i7) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f11685m.I0(i7, str, readableArray);
            }
        });
    }

    public void L0(String str, X1.a aVar) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        P0(str);
        C0797a.c cVar = new C0797a.c();
        this.f11469d.o(new g(cVar, aVar), this.f11473h, str, cVar);
    }

    public void M0() {
        if (UiThreadUtil.isOnUiThread()) {
            K0();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11679m.K0();
                }
            });
        }
    }

    public void R0(String str, Throwable th) {
        P0.a.k("ReactNative", "Exception in native call", th);
        Q0(str, h0.a(th), -1, X1.f.f4295o);
    }

    @Override // X1.e
    public View a(String str) {
        return this.f11471f.a(str);
    }

    @Override // X1.e
    public void b(final boolean z6) {
        if (this.f11487v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11676m.x0(z6);
                }
            });
        }
    }

    @Override // X1.e
    public S1.i c(String str) {
        S1.j jVar = this.f11465E;
        if (jVar == null) {
            return null;
        }
        return jVar.c(str);
    }

    @Override // X1.e
    public void d(View view) {
        this.f11471f.d(view);
    }

    @Override // X1.e
    public void e(final boolean z6) {
        if (this.f11487v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11669m.w0(z6);
                }
            });
        }
    }

    @Override // X1.e
    public void f(final boolean z6) {
        if (this.f11487v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11689m.y0(z6);
                }
            });
        }
    }

    @Override // X1.e
    public void g() {
        this.f11477l.g();
    }

    @Override // X1.e
    public void h() {
        if (this.f11487v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11678m.H0();
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (this.f11487v) {
            J0(exc);
        } else {
            this.f11475j.handleException(exc);
        }
    }

    @Override // X1.e
    public void i(String str, e.a aVar) {
        this.f11477l.i(str, aVar);
    }

    @Override // X1.e
    public Activity j() {
        return this.f11471f.j();
    }

    public X1.c j0() {
        return this.f11476k;
    }

    @Override // X1.e
    public String k() {
        return this.f11473h.getAbsolutePath();
    }

    public C0803g k0() {
        return this.f11469d;
    }

    @Override // X1.e
    public String l() {
        return this.f11489x;
    }

    public String l0() {
        return this.f11472g;
    }

    @Override // X1.e
    public void m() {
        this.f11469d.h();
    }

    @Override // X1.e
    public boolean n() {
        return this.f11487v;
    }

    public a0 n0() {
        return this.f11471f;
    }

    @Override // X1.e
    public void o() {
        S1.i iVar = this.f11478m;
        if (iVar == null) {
            return;
        }
        iVar.c();
    }

    @Override // X1.e
    public void p(ReactContext reactContext) {
        O0(reactContext);
    }

    protected abstract String p0();

    @Override // X1.e
    public Pair r(Pair pair) {
        List list = this.f11463C;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.y.a(it.next());
                throw null;
            }
        }
        return pair;
    }

    protected void r0() {
        this.f11476k.c();
        this.f11481p = false;
    }

    @Override // X1.e
    public void s(boolean z6) {
        this.f11487v = z6;
        M0();
    }

    @Override // X1.e
    public X1.f t() {
        return this.f11491z;
    }

    @Override // X1.e
    public void u(final X1.g gVar) {
        new Runnable() { // from class: com.facebook.react.devsupport.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f11674m.t0(gVar);
            }
        }.run();
    }

    @Override // X1.e
    public String v() {
        String str = this.f11472g;
        return str == null ? "" : this.f11469d.v((String) O1.a.c(str));
    }

    @Override // X1.e
    public InterfaceC1899a w() {
        return this.f11484s;
    }

    @Override // X1.e
    public void x(String str, X1.d dVar) {
        this.f11470e.put(str, dVar);
    }

    @Override // X1.e
    public X1.i y() {
        return null;
    }

    @Override // X1.e
    public void z() {
        if (this.f11487v) {
            this.f11469d.z();
        }
    }
}
