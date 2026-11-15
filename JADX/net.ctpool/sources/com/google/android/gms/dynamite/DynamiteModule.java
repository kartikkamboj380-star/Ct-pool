package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p3.AbstractC1964a;
import p3.AbstractC1965b;
import p3.AbstractC1967d;
import p3.AbstractC1969f;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f13760h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f13761i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f13762j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f13763k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f13764l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static m f13769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n f13770r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13771a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f13765m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f13766n = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f13767o = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13754b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13755c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13756d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f13757e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f13758f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f13759g = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f13768p = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th, AbstractC1969f abstractC1969f) {
            super(str, th);
        }

        /* synthetic */ a(String str, AbstractC1969f abstractC1969f) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z6);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0224b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13772a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13773b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f13774c = 0;
        }

        C0224b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f13771a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0226: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:116:0x0226 */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule d(Context context, b bVar, String str) throws Throwable {
        k kVar;
        k kVar2;
        int i7;
        DynamiteModule dynamiteModuleG;
        com.google.android.gms.dynamic.a aVarL0;
        DynamiteModule dynamiteModule;
        n nVar;
        boolean z6;
        com.google.android.gms.dynamic.a aVarI0;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f13765m;
        k kVar3 = (k) threadLocal.get();
        k kVar4 = new k(null);
        threadLocal.set(kVar4);
        ThreadLocal threadLocal2 = f13766n;
        Long l7 = (Long) threadLocal2.get();
        long jLongValue = l7.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0224b c0224bA = bVar.a(context, str, f13767o);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + c0224bA.f13772a + " and remote module " + str + ":" + c0224bA.f13773b);
            int i8 = c0224bA.f13774c;
            if (i8 != 0) {
                if (i8 == -1) {
                    if (c0224bA.f13772a != 0) {
                        i8 = -1;
                    }
                }
                if (i8 != 1 || c0224bA.f13773b != 0) {
                    if (i8 == -1) {
                        dynamiteModuleG = g(applicationContext, str);
                        kVar2 = kVar3;
                    } else {
                        try {
                            if (i8 != 1) {
                                throw new a("VersionPolicy returned invalid code:" + i8, null);
                            }
                            try {
                                try {
                                    int i9 = c0224bA.f13773b;
                                    try {
                                        try {
                                            try {
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (RemoteException e7) {
                                            e = e7;
                                        } catch (a e8) {
                                            throw e8;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            CrashUtils.addDynamiteErrorToDropBox(context, th);
                                            throw new a("Failed to load remote module.", th, null);
                                        }
                                    } catch (RemoteException e9) {
                                        e = e9;
                                    } catch (a e10) {
                                        throw e10;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new a("Failed to load remote module.", th, null);
                                    }
                                    synchronized (DynamiteModule.class) {
                                        try {
                                            if (!j(context)) {
                                                throw new a("Remote loading disabled", null);
                                            }
                                            Boolean bool = f13760h;
                                            if (bool == null) {
                                                throw new a("Failed to determine which loading route to use.", null);
                                            }
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i9);
                                                synchronized (DynamiteModule.class) {
                                                    try {
                                                        nVar = f13770r;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        while (true) {
                                                            try {
                                                                throw th;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (nVar == null) {
                                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                                }
                                                k kVar5 = (k) threadLocal.get();
                                                if (kVar5 == null || kVar5.f13775a == null) {
                                                    throw new a("No result cursor", null);
                                                }
                                                Context applicationContext2 = context.getApplicationContext();
                                                Cursor cursor2 = kVar5.f13775a;
                                                com.google.android.gms.dynamic.b.k0(null);
                                                synchronized (DynamiteModule.class) {
                                                    kVar2 = kVar3;
                                                    z6 = f13763k >= 2;
                                                }
                                                if (z6) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    aVarI0 = nVar.j0(com.google.android.gms.dynamic.b.k0(applicationContext2), str, i9, com.google.android.gms.dynamic.b.k0(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    aVarI0 = nVar.i0(com.google.android.gms.dynamic.b.k0(applicationContext2), str, i9, com.google.android.gms.dynamic.b.k0(cursor2));
                                                }
                                                Context context2 = (Context) com.google.android.gms.dynamic.b.j0(aVarI0);
                                                if (context2 == null) {
                                                    throw new a("Failed to get module context", null);
                                                }
                                                dynamiteModule = new DynamiteModule(context2);
                                            } else {
                                                kVar2 = kVar3;
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i9);
                                                m mVarK = k(context);
                                                if (mVarK == null) {
                                                    throw new a("Failed to create IDynamiteLoader.", null);
                                                }
                                                int iI0 = mVarK.i0();
                                                if (iI0 >= 3) {
                                                    k kVar6 = (k) threadLocal.get();
                                                    if (kVar6 == null) {
                                                        throw new a("No cached result cursor holder", null);
                                                    }
                                                    aVarL0 = mVarK.m0(com.google.android.gms.dynamic.b.k0(context), str, i9, com.google.android.gms.dynamic.b.k0(kVar6.f13775a));
                                                } else if (iI0 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    aVarL0 = mVarK.n0(com.google.android.gms.dynamic.b.k0(context), str, i9);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    aVarL0 = mVarK.l0(com.google.android.gms.dynamic.b.k0(context), str, i9);
                                                }
                                                Object objJ0 = com.google.android.gms.dynamic.b.j0(aVarL0);
                                                if (objJ0 == null) {
                                                    throw new a("Failed to load remote module.", null);
                                                }
                                                dynamiteModule = new DynamiteModule((Context) objJ0);
                                            }
                                            dynamiteModuleG = dynamiteModule;
                                            throw new a("Failed to load remote module.", e, null);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            throw th;
                                        }
                                    }
                                } catch (a e11) {
                                    e = e11;
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                                    i7 = c0224bA.f13772a;
                                    if (i7 != 0 || bVar.a(context, str, new l(i7, 0)).f13774c != -1) {
                                        throw new a("Remote load failed. No local fallback found.", e, null);
                                    }
                                    dynamiteModuleG = g(applicationContext, str);
                                    if (jLongValue != 0) {
                                    }
                                    cursor = kVar4.f13775a;
                                    if (cursor != null) {
                                    }
                                    f13765m.set(kVar2);
                                    return dynamiteModuleG;
                                }
                            } catch (a e12) {
                                e = e12;
                                kVar2 = kVar3;
                                Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                                i7 = c0224bA.f13772a;
                                if (i7 != 0) {
                                }
                                throw new a("Remote load failed. No local fallback found.", e, null);
                            } catch (Throwable th7) {
                                th = th7;
                                if (jLongValue == 0) {
                                    f13766n.remove();
                                } else {
                                    f13766n.set(l7);
                                }
                                Cursor cursor3 = kVar4.f13775a;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                f13765m.set(kVar3);
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            kVar3 = kVar;
                        }
                    }
                    if (jLongValue != 0) {
                        f13766n.remove();
                    } else {
                        f13766n.set(l7);
                    }
                    cursor = kVar4.f13775a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    f13765m.set(kVar2);
                    return dynamiteModuleG;
                }
            }
            throw new a("No acceptable module " + str + " found. Local version is " + c0224bA.f13772a + " and remote version is " + c0224bA.f13773b + ".", null);
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0175 A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00e9, blocks: (B:3:0x0002, B:64:0x00de, B:66:0x00e4, B:73:0x0108, B:101:0x0167, B:105:0x0175, B:123:0x01c7, B:124:0x01ca, B:118:0x01bf, B:71:0x00ed, B:126:0x01cc, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00db, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00b9, B:63:0x00dd, B:61:0x00bf), top: B:137:0x0002, inners: #1, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x0036, TryCatch #12 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b6, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00ad, B:17:0x003e), top: B:144:0x0026, inners: #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bd -> B:132:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01bf -> B:132:0x01c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z6) {
        Field declaredField;
        Throwable th;
        RemoteException e7;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f13760h;
                int iJ0 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e8.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                            f13760h = bool;
                        } else if (classLoader != null) {
                            try {
                                h(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                            f13760h = bool;
                        } else {
                            if (!j(context)) {
                                return 0;
                            }
                            if (!f13762j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (bool2.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                } else {
                                    try {
                                        int iF = f(context, str, z6, true);
                                        String str2 = f13761i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderA = AbstractC1967d.a();
                                            if (classLoaderA == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC1965b.a();
                                                    String str3 = f13761i;
                                                    Preconditions.checkNotNull(str3);
                                                    classLoaderA = AbstractC1964a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f13761i;
                                                    Preconditions.checkNotNull(str4);
                                                    classLoaderA = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            h(classLoaderA);
                                            declaredField.set(null, classLoaderA);
                                            f13760h = bool2;
                                            return iF;
                                        }
                                        return iF;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    }
                                }
                                bool = Boolean.FALSE;
                                f13760h = bool;
                            }
                        }
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z6, false);
                    } catch (a e9) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e9.getMessage());
                        return 0;
                    }
                }
                m mVarK = k(context);
                try {
                    if (mVarK != null) {
                        try {
                            int iI0 = mVarK.i0();
                            if (iI0 >= 3) {
                                k kVar = (k) f13765m.get();
                                if (kVar == null || (cursor = kVar.f13775a) == null) {
                                    Cursor cursor2 = (Cursor) com.google.android.gms.dynamic.b.j0(mVarK.o0(com.google.android.gms.dynamic.b.k0(context), str, z6, ((Long) f13766n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i7 = cursor2.getInt(0);
                                                cursor = (i7 <= 0 || !i(cursor2)) ? cursor2 : null;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                iJ0 = i7;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                            }
                                        } catch (RemoteException e10) {
                                            e7 = e10;
                                            cursor = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e7.getMessage());
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor2 != null) {
                                        }
                                    }
                                } else {
                                    iJ0 = cursor.getInt(0);
                                }
                            } else if (iI0 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iJ0 = mVarK.k0(com.google.android.gms.dynamic.b.k0(context), str, z6);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iJ0 = mVarK.j0(com.google.android.gms.dynamic.b.k0(context), str, z6);
                            }
                        } catch (RemoteException e11) {
                            e7 = e11;
                        }
                    }
                    return iJ0;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int f(Context context, String str, boolean z6, boolean z7) throws Throwable {
        Throwable th;
        Exception e7;
        ?? r02 = 0;
        ?? r03 = 0;
        ?? r04 = 0;
        ?? r05 = 0;
        try {
            try {
                boolean z8 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f13766n.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z9 = false;
                            int i7 = cursorQuery.getInt(0);
                            if (i7 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f13761i = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f13763k = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z8 = false;
                                            }
                                            f13762j = z8;
                                            z9 = z8;
                                        }
                                    } finally {
                                    }
                                }
                                if (i(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z7 && z9) {
                                throw new a("forcing fallback to container DynamiteLoader impl", r04 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i7;
                        }
                    } catch (Exception e8) {
                        e7 = e8;
                        if (e7 instanceof a) {
                            throw e7;
                        }
                        throw new a("V2 version check failed: " + e7.getMessage(), e7, r03 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", r05 == true ? 1 : 0);
            } catch (Throwable th2) {
                th = th2;
                r02 = context;
                if (r02 != 0) {
                    r02.close();
                }
                throw th;
            }
        } catch (Exception e9) {
            e7 = e9;
        } catch (Throwable th3) {
            th = th3;
            if (r02 != 0) {
            }
            throw th;
        }
    }

    private static DynamiteModule g(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void h(ClassLoader classLoader) throws a {
        n nVar;
        AbstractC1969f abstractC1969f = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f13770r = nVar;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new a("Failed to instantiate dynamite loader", e, abstractC1969f);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, abstractC1969f);
        } catch (InstantiationException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, abstractC1969f);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, abstractC1969f);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, abstractC1969f);
        }
    }

    private static boolean i(Cursor cursor) {
        k kVar = (k) f13765m.get();
        if (kVar == null || kVar.f13775a != null) {
            return false;
        }
        kVar.f13775a = cursor;
        return true;
    }

    private static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f13764l)) {
            return true;
        }
        boolean z6 = false;
        if (f13764l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            f13764l = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f13762j = true;
            }
        }
        if (!z6) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    private static m k(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f13769q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f13769q = mVar;
                    return mVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    public IBinder c(String str) throws a {
        try {
            return (IBinder) this.f13771a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e7, null);
        }
    }
}
