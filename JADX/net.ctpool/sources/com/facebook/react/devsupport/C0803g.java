package com.facebook.react.devsupport;

import T5.B;
import T5.InterfaceC0459e;
import T5.InterfaceC0460f;
import T5.z;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.C0797a;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import n2.InterfaceC1899a;
import q2.AbstractC1988a;
import t2.AbstractC2059c;
import t2.AbstractC2063g;
import t2.C2058b;
import t2.C2060d;
import t2.C2061e;
import t2.InterfaceC2064h;
import t2.RunnableC2057a;

/* JADX INFO: renamed from: com.facebook.react.devsupport.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0803g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1899a f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2060d f11628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T5.z f11629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0797a f11630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U f11631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f11632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2058b f11634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private K f11635i;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$a */
    class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f11636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11637b;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.g$a$a, reason: collision with other inner class name */
        class C0211a extends AbstractC2059c {
            C0211a() {
            }

            @Override // t2.InterfaceC2062f
            public void a(Object obj) {
                a.this.f11636a.d();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.g$a$b */
        class b extends AbstractC2059c {
            b() {
            }

            @Override // t2.InterfaceC2062f
            public void a(Object obj) {
                a.this.f11636a.b();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.g$a$c */
        class c extends AbstractC2063g {
            c() {
            }

            @Override // t2.InterfaceC2062f
            public void b(Object obj, InterfaceC2064h interfaceC2064h) {
                a.this.f11636a.c(interfaceC2064h);
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.g$a$d */
        class d implements C2061e.b {
            d() {
            }

            @Override // t2.C2061e.b
            public void a() {
                a.this.f11636a.e();
            }

            @Override // t2.C2061e.b
            public void b() {
                a.this.f11636a.a();
            }
        }

        a(h hVar, String str) {
            this.f11636a = hVar;
            this.f11637b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            HashMap map = new HashMap();
            map.put("reload", new C0211a());
            map.put("devMenu", new b());
            map.put("captureHeap", new c());
            Map mapF = this.f11636a.f();
            if (mapF != null) {
                map.putAll(mapF);
            }
            map.putAll(new RunnableC2057a().d());
            d dVar = new d();
            C0803g.this.f11634h = new C2058b(this.f11637b, C0803g.this.f11628b, map, dVar);
            C0803g.this.f11634h.f();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$b */
    class b extends AsyncTask {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (C0803g.this.f11634h != null) {
                C0803g.this.f11634h.e();
                C0803g.this.f11634h = null;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$c */
    class c extends AsyncTask {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            C0803g c0803g;
            K l7;
            if (InspectorFlags.getFuseboxEnabled()) {
                c0803g = C0803g.this;
                l7 = new CxxInspectorPackagerConnection(C0803g.this.s(), C0803g.this.f11633g);
            } else {
                c0803g = C0803g.this;
                l7 = new L(c0803g.s(), C0803g.this.f11633g);
            }
            c0803g.f11635i = l7;
            C0803g.this.f11635i.connect();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$d */
    class d extends AsyncTask {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (C0803g.this.f11635i != null) {
                C0803g.this.f11635i.closeQuietly();
                C0803g.this.f11635i = null;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$g, reason: collision with other inner class name */
    private enum EnumC0212g {
        BUNDLE("bundle"),
        MAP("map");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f11653m;

        EnumC0212g(String str) {
            this.f11653m = str;
        }

        public String h() {
            return this.f11653m;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$h */
    public interface h {
        void a();

        void b();

        void c(InterfaceC2064h interfaceC2064h);

        void d();

        void e();

        Map f();
    }

    public C0803g(InterfaceC1899a interfaceC1899a, Context context, C2060d c2060d) {
        this.f11627a = interfaceC1899a;
        this.f11628b = c2060d;
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        T5.z zVarB = aVar.e(5000L, timeUnit).M(0L, timeUnit).N(0L, timeUnit).b();
        this.f11629c = zVarB;
        this.f11630d = new C0797a(zVarB);
        this.f11631e = new U(zVarB);
        this.f11632f = context;
        this.f11633g = context.getPackageName();
    }

    private String j(String str, EnumC0212g enumC0212g) {
        return k(str, enumC0212g, this.f11628b.a());
    }

    private String k(String str, EnumC0212g enumC0212g, String str2) {
        return l(str, enumC0212g, str2, false, true);
    }

    private String l(String str, EnumC0212g enumC0212g, String str2, boolean z6, boolean z7) {
        boolean zP = p();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", str2, str, enumC0212g.h(), Boolean.valueOf(zP), Boolean.valueOf(zP), Boolean.valueOf(t()), this.f11633g, z6 ? "true" : "false", z7 ? "true" : "false"));
        sb.append(InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "");
        return sb.toString();
    }

    private String m() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", this.f11628b.a());
    }

    private boolean p() {
        return this.f11627a.h();
    }

    private String r() {
        return u(String.format(Locale.US, "android-%s-%s-%s", this.f11633g, Settings.Secure.getString(this.f11632f.getContentResolver(), "android_id"), InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String s() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s", this.f11628b.a(), Uri.encode(AbstractC1988a.d()), Uri.encode(this.f11633g), Uri.encode(r()));
    }

    private boolean t() {
        return this.f11627a.d();
    }

    private static String u(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            try {
                byte[] bArrDigest = messageDigest.digest(str.getBytes("UTF-8"));
                return String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19]));
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError("This environment doesn't support UTF-8 encoding", e7);
            }
        } catch (NoSuchAlgorithmException e8) {
            throw new AssertionError("Could not get standard SHA-256 algorithm", e8);
        }
    }

    public void A(String str, h hVar) {
        if (this.f11634h != null) {
            P0.a.G("ReactNative", "Packager connection already open, nooping.");
        } else {
            new a(hVar, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void h() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void i() {
        new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void n() {
        K k7 = this.f11635i;
        if (k7 != null) {
            k7.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    public void o(X1.b bVar, File file, String str, C0797a.c cVar) {
        this.f11630d.e(bVar, file, str, cVar);
    }

    public String q(String str) {
        return k(str, EnumC0212g.BUNDLE, this.f11628b.a());
    }

    public String v(String str) {
        return j(str, EnumC0212g.BUNDLE);
    }

    public void w(X1.g gVar) {
        String strA = this.f11628b.a();
        if (strA != null) {
            this.f11631e.b(strA, gVar);
        } else {
            P0.a.G("ReactNative", "No packager host configured.");
            gVar.a(false);
        }
    }

    public void x() {
        this.f11629c.a(new B.a().m(m()).b()).S0(new e());
    }

    public void y(ReactContext reactContext, String str) {
        this.f11629c.a(new B.a().m(String.format(Locale.US, "http://%s/open-debugger?appId=%s&device=%s", this.f11628b.a(), Uri.encode(this.f11633g), Uri.encode(r()))).g("POST", T5.C.d(null, "")).b()).S0(new f(reactContext, str));
    }

    public void z() {
        if (this.f11635i != null) {
            P0.a.G("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$e */
    class e implements InterfaceC0460f {
        e() {
        }

        @Override // T5.InterfaceC0460f
        public void a(InterfaceC0459e interfaceC0459e, T5.D d7) {
        }

        @Override // T5.InterfaceC0460f
        public void b(InterfaceC0459e interfaceC0459e, IOException iOException) {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$f */
    class f implements InterfaceC0460f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactContext f11647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11648b;

        f(ReactContext reactContext, String str) {
            this.f11647a = reactContext;
            this.f11648b = str;
        }

        @Override // T5.InterfaceC0460f
        public void b(InterfaceC0459e interfaceC0459e, IOException iOException) {
            E2.c.d(this.f11647a, this.f11648b);
        }

        @Override // T5.InterfaceC0460f
        public void a(InterfaceC0459e interfaceC0459e, T5.D d7) {
        }
    }
}
