package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.C1890a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048b3 implements InterfaceC1111i3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f14516h = new C1890a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f14517i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f14518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f14519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f14520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f14521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f14522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Map f14523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f14524g;

    private C1048b3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C1066d3 c1066d3 = new C1066d3(this, null);
        this.f14521d = c1066d3;
        this.f14522e = new Object();
        this.f14524g = new ArrayList();
        U3.h.i(contentResolver);
        U3.h.i(uri);
        this.f14518a = contentResolver;
        this.f14519b = uri;
        this.f14520c = runnable;
        contentResolver.registerContentObserver(uri, false, c1066d3);
    }

    public static C1048b3 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C1048b3 c1048b3;
        synchronized (C1048b3.class) {
            Map map = f14516h;
            c1048b3 = (C1048b3) map.get(uri);
            if (c1048b3 == null) {
                try {
                    C1048b3 c1048b32 = new C1048b3(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c1048b32);
                    } catch (SecurityException unused) {
                    }
                    c1048b3 = c1048b32;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1048b3;
    }

    static synchronized void d() {
        try {
            for (C1048b3 c1048b3 : f14516h.values()) {
                c1048b3.f14518a.unregisterContentObserver(c1048b3.f14521d);
            }
            f14516h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final Map g() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) AbstractC1102h3.a(new InterfaceC1129k3() { // from class: com.google.android.gms.internal.measurement.e3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC1129k3
                    public final Object a() {
                        return this.f14574a.c();
                    }
                });
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (SQLiteException | IllegalStateException | SecurityException e7) {
            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e7);
            return Collections.emptyMap();
        }
    }

    public final Map b() {
        Map mapG = this.f14523f;
        if (mapG == null) {
            synchronized (this.f14522e) {
                try {
                    mapG = this.f14523f;
                    if (mapG == null) {
                        mapG = g();
                        this.f14523f = mapG;
                    }
                } finally {
                }
            }
        }
        return mapG != null ? mapG : Collections.emptyMap();
    }

    final /* synthetic */ Map c() {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f14518a.acquireUnstableContentProviderClient(this.f14519b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.f14519b, f14517i, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map mapEmptyMap2 = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap2;
                }
                Map c1890a = count <= 256 ? new C1890a(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c1890a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c1890a;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map mapEmptyMap3 = Collections.emptyMap();
                cursorQuery.close();
                return mapEmptyMap3;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException e7) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e7);
            return Collections.emptyMap();
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public final void e() {
        synchronized (this.f14522e) {
            this.f14523f = null;
            this.f14520c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f14524g.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.y.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1111i3
    public final /* synthetic */ Object f(String str) {
        return (String) b().get(str);
    }
}
