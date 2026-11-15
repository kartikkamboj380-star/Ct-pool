package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static t f13283b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f13293l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f13284c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Context f13285d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile A[] f13286e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f13287f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static O2.g f13288g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashSet f13289h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f13290i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f13291j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f13292k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f13294m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f13282a = true;

    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th);
        }
    }

    private static void a(ArrayList arrayList, int i7) {
        C0919a c0919a = new C0919a(f13285d, i7);
        m.a("SoLoader", "Adding application source: " + c0919a.toString());
        arrayList.add(0, c0919a);
    }

    private static void b(Context context, ArrayList arrayList, int i7) {
        if ((f13293l & 8) != 0) {
            File fileN = C.n(context, "lib-main");
            try {
                if (fileN.exists()) {
                    SysUtil.c(fileN);
                    return;
                }
                return;
            } catch (Throwable th) {
                m.h("SoLoader", "Failed to delete " + fileN.getCanonicalPath(), th);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        C0921c c0921c = new C0921c(context, file, "lib-main", i7);
        arrayList2.add(c0921c);
        m.a("SoLoader", "adding backup source from : " + c0921c.toString());
        c(context, i7, arrayList2);
        arrayList.addAll(0, arrayList2);
    }

    private static void c(Context context, int i7, ArrayList arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            m.a("SoLoader", "adding backup sources from split apks");
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                File file = new File(strArr[i8]);
                StringBuilder sb = new StringBuilder();
                sb.append("lib-");
                int i10 = i9 + 1;
                sb.append(i9);
                C0921c c0921c = new C0921c(context, file, sb.toString(), i7);
                m.a("SoLoader", "adding backup source: " + c0921c.toString());
                if (c0921c.v()) {
                    arrayList.add(c0921c);
                }
                i8++;
                i9 = i10;
            }
        }
    }

    private static void d(Context context, ArrayList arrayList) {
        d dVar = new d(context);
        m.a("SoLoader", "validating/adding directApk source: " + dVar.toString());
        if (dVar.n()) {
            arrayList.add(0, dVar);
        }
    }

    private static void e(ArrayList arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            m.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new e(new File(str3), 2));
        }
    }

    private static void f(Context context, ArrayList arrayList) {
        B b7 = new B();
        m.a("SoLoader", "adding systemLoadWrapper source: " + b7);
        arrayList.add(0, b7);
    }

    private static void g() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void h(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        boolean z6;
        ReentrantReadWriteLock reentrantReadWriteLock = f13284c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f13286e == null) {
                m.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z6 = true;
            } else {
                z6 = false;
            }
            if (f13282a) {
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (A a7 : f13286e) {
                            if (a7.d(str, i7, threadPolicy) != 0) {
                                if (z6) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw x.b(str, f13285d, f13286e);
                    } catch (IOException e7) {
                        y yVar = new y(str, e7.toString());
                        yVar.initCause(e7);
                        throw yVar;
                    }
                } finally {
                }
            } finally {
                if (f13282a) {
                    Api18TraceUtils.b();
                }
                if (z6) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    private static int i(Context context) {
        String str;
        int i7 = f13294m;
        if (i7 != 0) {
            return i7;
        }
        if (context == null) {
            str = "context is null, fallback to THIRD_PARTY_APP appType";
        } else {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i8 = applicationInfo.flags;
            i = (i8 & 1) != 0 ? (i8 & 128) != 0 ? 3 : 2 : 1;
            str = "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i;
        }
        m.a("SoLoader", str);
        return i;
    }

    public static void init(Context context, int i7) {
        l(context, i7, null);
    }

    private static int j() {
        int i7 = f13294m;
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2 || i7 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    private static synchronized O2.f k() {
        O2.g gVar;
        gVar = f13288g;
        return gVar == null ? null : gVar.get();
    }

    public static void l(Context context, int i7, t tVar) {
        N2.b cVar;
        if (r()) {
            m.g("SoLoader", "SoLoader already initialized");
            return;
        }
        m.g("SoLoader", "Initializing SoLoader: " + i7);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zO = o(context);
            f13292k = zO;
            if (zO) {
                int i8 = i(context);
                f13294m = i8;
                if ((i7 & 128) == 0 && SysUtil.l(context, i8)) {
                    i7 |= 8;
                }
                p(context, tVar);
                q(context, i7);
                m.f("SoLoader", "Init SoLoader delegate");
                cVar = new q();
            } else {
                n();
                m.f("SoLoader", "Init System Loader delegate");
                cVar = new N2.c();
            }
            N2.a.b(cVar);
            m.g("SoLoader", "SoLoader initialized: " + i7);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static void m(Context context, boolean z6) {
        try {
            l(context, z6 ? 1 : 0, null);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static void n() {
        if (f13286e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f13284c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f13286e != null) {
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                f13286e = new A[0];
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            f13284c.writeLock().unlock();
            throw th;
        }
    }

    private static boolean o(Context context) {
        String packageName;
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
        } catch (Exception e7) {
            e = e7;
            packageName = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
        } catch (Exception e8) {
            e = e8;
            m.h("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void p(Context context, t tVar) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    m.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f13285d = context;
                f13288g = new O2.d(context);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tVar != null || f13283b == null) {
            if (tVar != null) {
                f13283b = tVar;
            } else {
                f13283b = new u();
            }
        }
    }

    private static void q(Context context, int i7) {
        if (f13286e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f13284c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f13286e != null) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f13293l = i7;
            ArrayList arrayList = new ArrayList();
            if ((i7 & 512) != 0) {
                f(context, arrayList);
            } else {
                e(arrayList);
                if (context != null) {
                    if ((i7 & 1) != 0) {
                        a(arrayList, j());
                        m.a("SoLoader", "Adding exo package source: lib-main");
                        arrayList.add(0, new j(context, "lib-main"));
                    } else {
                        if (SysUtil.l(context, f13294m)) {
                            d(context, arrayList);
                        }
                        a(arrayList, j());
                        b(context, arrayList, 1);
                    }
                }
            }
            A[] aArr = (A[]) arrayList.toArray(new A[arrayList.size()]);
            int iY = y();
            int length = aArr.length;
            while (true) {
                int i8 = length - 1;
                if (length <= 0) {
                    f13286e = aArr;
                    f13287f.getAndIncrement();
                    m.a("SoLoader", "init finish: " + f13286e.length + " SO sources prepared");
                    f13284c.writeLock().unlock();
                    return;
                }
                m.a("SoLoader", "Preparing SO source: " + aArr[i8]);
                boolean z6 = f13282a;
                if (z6) {
                    Api18TraceUtils.a("SoLoader", "_", aArr[i8].getClass().getSimpleName());
                }
                aArr[i8].e(iY);
                if (z6) {
                    Api18TraceUtils.b();
                }
                length = i8;
            }
        } catch (Throwable th) {
            f13284c.writeLock().unlock();
            throw th;
        }
    }

    public static boolean r() {
        if (f13286e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f13284c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z6 = f13286e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z6;
        } catch (Throwable th) {
            f13284c.readLock().unlock();
            throw th;
        }
    }

    static void s(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        w(str, null, null, i7 | 1, threadPolicy);
    }

    public static boolean t(String str) {
        return f13292k ? u(str, 0) : N2.a.d(str);
    }

    public static boolean u(String str, int i7) {
        Boolean boolX = x(str);
        if (boolX != null) {
            return boolX.booleanValue();
        }
        if (!f13292k) {
            return N2.a.d(str);
        }
        if (f13294m != 2) {
        }
        String strB = n.b(str);
        return v(System.mapLibraryName(strB != null ? strB : str), str, strB, i7, null);
    }

    private static boolean v(String str, String str2, String str3, int i7, StrictMode.ThreadPolicy threadPolicy) {
        O2.f fVarK = null;
        while (true) {
            try {
                return w(str, str2, str3, i7, threadPolicy);
            } catch (UnsatisfiedLinkError e7) {
                m.h("SoLoader", "Starting recovery for " + str, e7);
                f13284c.writeLock().lock();
                if (fVarK == null) {
                    try {
                        try {
                            fVarK = k();
                        } catch (r e8) {
                            m.c("SoLoader", "Base APK not found during recovery", e8);
                            throw e8;
                        } catch (Exception e9) {
                            m.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e9);
                            throw e7;
                        }
                    } catch (Throwable th) {
                        f13284c.writeLock().unlock();
                        throw th;
                    }
                }
                if (fVarK == null || !fVarK.a(e7, f13286e)) {
                    f13284c.writeLock().unlock();
                    m.g("SoLoader", "Failed to recover");
                    throw e7;
                }
                f13287f.getAndIncrement();
                m.g("SoLoader", "Attempting to load library again");
                f13284c.writeLock().unlock();
            }
        }
        f13284c.writeLock().unlock();
        m.g("SoLoader", "Failed to recover");
        throw e7;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3 A[Catch: all -> 0x005e, PHI: r3
      0x00c3: PHI (r3v3 boolean) = (r3v2 boolean), (r3v4 boolean), (r3v4 boolean) binds: [B:25:0x0047, B:41:0x0065, B:47:0x009d] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {, blocks: (B:27:0x004b, B:32:0x0055, B:42:0x0067, B:43:0x0080, B:44:0x0098, B:50:0x00a0, B:52:0x00a2, B:54:0x00a8, B:56:0x00b0, B:57:0x00bf, B:58:0x00c0, B:60:0x00c2, B:61:0x00c3, B:63:0x00c7, B:65:0x00cd, B:70:0x00da, B:72:0x00de, B:75:0x010d, B:82:0x0138, B:84:0x013c, B:85:0x013f, B:86:0x0140, B:73:0x00e5, B:80:0x0114, B:81:0x0137, B:28:0x004c, B:31:0x0054, B:40:0x0064, B:45:0x0099, B:46:0x009c), top: B:106:0x004b, outer: #5, inners: #1, #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[Catch: all -> 0x005e, TryCatch #7 {, blocks: (B:27:0x004b, B:32:0x0055, B:42:0x0067, B:43:0x0080, B:44:0x0098, B:50:0x00a0, B:52:0x00a2, B:54:0x00a8, B:56:0x00b0, B:57:0x00bf, B:58:0x00c0, B:60:0x00c2, B:61:0x00c3, B:63:0x00c7, B:65:0x00cd, B:70:0x00da, B:72:0x00de, B:75:0x010d, B:82:0x0138, B:84:0x013c, B:85:0x013f, B:86:0x0140, B:73:0x00e5, B:80:0x0114, B:81:0x0137, B:28:0x004c, B:31:0x0054, B:40:0x0064, B:45:0x0099, B:46:0x009c), top: B:106:0x004b, outer: #5, inners: #1, #2, #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean w(String str, String str2, String str3, int i7, StrictMode.ThreadPolicy threadPolicy) {
        boolean z6;
        Object obj;
        boolean z7 = false;
        if (!TextUtils.isEmpty(str2) && f13291j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet hashSet = f13289h;
                if (!hashSet.contains(str)) {
                    z6 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z6 = true;
                }
                Map map = f13290i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f13284c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z6) {
                            synchronized (SoLoader.class) {
                                if (hashSet.contains(str)) {
                                    if (str3 == null) {
                                        reentrantReadWriteLock.readLock().unlock();
                                        return false;
                                    }
                                    z6 = true;
                                }
                                if (z6) {
                                    if ((i7 & 16) == 0) {
                                    }
                                    reentrantReadWriteLock.readLock().unlock();
                                    return !z6;
                                }
                                try {
                                    m.a("SoLoader", "About to load: " + str);
                                    h(str, i7, threadPolicy);
                                    m.a("SoLoader", "Loaded: " + str);
                                    synchronized (SoLoader.class) {
                                        hashSet.add(str);
                                    }
                                    if ((i7 & 16) == 0) {
                                        if (!TextUtils.isEmpty(str2) && f13291j.contains(str2)) {
                                            z7 = true;
                                        }
                                        if (str3 != null && !z7) {
                                            boolean z8 = f13282a;
                                            if (z8) {
                                                Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                            }
                                            try {
                                                try {
                                                    m.a("SoLoader", "About to merge: " + str2 + " / " + str);
                                                    n.a(str2);
                                                    f13291j.add(str2);
                                                    if (z8) {
                                                        Api18TraceUtils.b();
                                                    }
                                                } catch (Throwable th) {
                                                    if (f13282a) {
                                                        Api18TraceUtils.b();
                                                    }
                                                    throw th;
                                                }
                                            } catch (UnsatisfiedLinkError e7) {
                                                throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e7);
                                            }
                                        }
                                    }
                                    reentrantReadWriteLock.readLock().unlock();
                                    return !z6;
                                } catch (UnsatisfiedLinkError e8) {
                                    String message = e8.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e8;
                                    }
                                    throw new a(e8, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    f13284c.readLock().unlock();
                    throw th2;
                }
            } finally {
            }
        }
    }

    private static Boolean x(String str) {
        Boolean boolValueOf;
        if (f13286e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f13284c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f13286e == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean z6 = !f13289h.contains(str);
                            if (z6) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z6);
                        } finally {
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                g();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th) {
            f13284c.readLock().unlock();
            throw th;
        }
    }

    private static int y() {
        ReentrantReadWriteLock reentrantReadWriteLock = f13284c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i7 = f13293l;
            int i8 = (i7 & 2) != 0 ? 1 : 0;
            if ((i7 & 256) != 0) {
                i8 |= 4;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i8;
        } catch (Throwable th) {
            f13284c.writeLock().unlock();
            throw th;
        }
    }
}
