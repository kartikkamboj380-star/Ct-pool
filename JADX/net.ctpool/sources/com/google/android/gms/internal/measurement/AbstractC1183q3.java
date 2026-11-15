package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.C1156n3;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1183q3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f14786h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile B3 f14787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static F3 f14788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f14789k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1251y3 f14790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f14792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f14793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f14794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f14796g;

    static {
        new AtomicReference();
        f14788j = new F3(new E3() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // com.google.android.gms.internal.measurement.E3
            public final boolean a() {
                return AbstractC1183q3.n();
            }
        });
        f14789k = new AtomicInteger();
    }

    private AbstractC1183q3(C1251y3 c1251y3, String str, Object obj, boolean z6) {
        this.f14793d = -1;
        String str2 = c1251y3.f14979a;
        if (str2 == null && c1251y3.f14980b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c1251y3.f14980b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f14790a = c1251y3;
        this.f14791b = str;
        this.f14792c = obj;
        this.f14795f = z6;
        this.f14796g = false;
    }

    static /* synthetic */ AbstractC1183q3 b(C1251y3 c1251y3, String str, Boolean bool, boolean z6) {
        return new C1243x3(c1251y3, str, bool, true);
    }

    static /* synthetic */ AbstractC1183q3 c(C1251y3 c1251y3, String str, Double d7, boolean z6) {
        return new C1235w3(c1251y3, str, d7, true);
    }

    static /* synthetic */ AbstractC1183q3 d(C1251y3 c1251y3, String str, Long l7, boolean z6) {
        return new C1218u3(c1251y3, str, l7, true);
    }

    static /* synthetic */ AbstractC1183q3 e(C1251y3 c1251y3, String str, String str2, boolean z6) {
        return new C1259z3(c1251y3, str, str2, true);
    }

    private final Object g(B3 b32) {
        U3.c cVar;
        C1251y3 c1251y3 = this.f14790a;
        if (!c1251y3.f14983e && ((cVar = c1251y3.f14987i) == null || ((Boolean) cVar.apply(b32.a())).booleanValue())) {
            C1120j3 c1120j3A = C1120j3.a(b32.a());
            C1251y3 c1251y32 = this.f14790a;
            Object objF = c1120j3A.f(c1251y32.f14983e ? null : i(c1251y32.f14981c));
            if (objF != null) {
                return h(objF);
            }
        }
        return null;
    }

    private final String i(String str) {
        if (str != null && str.isEmpty()) {
            return this.f14791b;
        }
        return str + this.f14791b;
    }

    private final Object j(B3 b32) {
        Object objF;
        InterfaceC1111i3 interfaceC1111i3A = this.f14790a.f14980b != null ? AbstractC1174p3.b(b32.a(), this.f14790a.f14980b) ? this.f14790a.f14986h ? C1048b3.a(b32.a().getContentResolver(), AbstractC1191r3.a(AbstractC1191r3.b(b32.a(), this.f14790a.f14980b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.t3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1183q3.m();
            }
        }) : C1048b3.a(b32.a().getContentResolver(), this.f14790a.f14980b, new Runnable() { // from class: com.google.android.gms.internal.measurement.t3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1183q3.m();
            }
        }) : null : D3.b(b32.a(), this.f14790a.f14979a, new Runnable() { // from class: com.google.android.gms.internal.measurement.t3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1183q3.m();
            }
        });
        if (interfaceC1111i3A == null || (objF = interfaceC1111i3A.f(k())) == null) {
            return null;
        }
        return h(objF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(final Context context) {
        if (f14787i != null || context == null) {
            return;
        }
        Object obj = f14786h;
        synchronized (obj) {
            try {
                if (f14787i == null) {
                    synchronized (obj) {
                        B3 b32 = f14787i;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (b32 == null || b32.a() != context) {
                            if (b32 != null) {
                                C1048b3.d();
                                D3.c();
                                C1120j3.b();
                            }
                            f14787i = new C1057c3(context, U3.l.a(new U3.k() { // from class: com.google.android.gms.internal.measurement.s3
                                @Override // U3.k
                                public final Object get() {
                                    return C1156n3.a.a(context);
                                }
                            }));
                            f14789k.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static void m() {
        f14789k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final Object o() {
        return this.f14792c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:20:0x0055, B:22:0x0060, B:35:0x0080, B:38:0x0088, B:39:0x008d, B:40:0x0091, B:25:0x0067, B:34:0x007c, B:28:0x006e, B:31:0x0075, B:41:0x0095), top: B:47:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f() {
        Object objJ;
        if (!this.f14795f) {
            U3.h.o(f14788j.a(this.f14791b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i7 = f14789k.get();
        if (this.f14793d < i7) {
            synchronized (this) {
                try {
                    if (this.f14793d < i7) {
                        B3 b32 = f14787i;
                        U3.g gVarA = U3.g.a();
                        String strA = null;
                        if (b32 != null) {
                            gVarA = (U3.g) b32.b().get();
                            if (gVarA.c()) {
                                InterfaceC1165o3 interfaceC1165o3 = (InterfaceC1165o3) gVarA.b();
                                C1251y3 c1251y3 = this.f14790a;
                                strA = interfaceC1165o3.a(c1251y3.f14980b, c1251y3.f14979a, c1251y3.f14982d, this.f14791b);
                            }
                        }
                        U3.h.o(b32 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (this.f14790a.f14984f) {
                            objJ = g(b32);
                            if (objJ == null && (objJ = j(b32)) == null) {
                                objJ = o();
                            }
                            if (gVarA.c()) {
                                objJ = strA == null ? o() : h(strA);
                            }
                            this.f14794e = objJ;
                            this.f14793d = i7;
                        } else {
                            objJ = j(b32);
                            if (objJ == null && (objJ = g(b32)) == null) {
                            }
                            if (gVarA.c()) {
                            }
                            this.f14794e = objJ;
                            this.f14793d = i7;
                        }
                    }
                } finally {
                }
            }
        }
        return this.f14794e;
    }

    abstract Object h(Object obj);

    public final String k() {
        return i(this.f14790a.f14982d);
    }
}
