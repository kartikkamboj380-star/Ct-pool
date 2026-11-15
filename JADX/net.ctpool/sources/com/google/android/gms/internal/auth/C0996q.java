package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.C1890a;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0996q implements InterfaceC1007u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f14012h = new C1890a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f14013i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f14014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f14015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f14016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f14017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f14018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Map f14019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f14020g;

    private C0996q(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C0993p c0993p = new C0993p(this, null);
        this.f14017d = c0993p;
        this.f14018e = new Object();
        this.f14020g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f14014a = contentResolver;
        this.f14015b = uri;
        this.f14016c = runnable;
        contentResolver.registerContentObserver(uri, false, c0993p);
    }

    public static C0996q b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C0996q c0996q;
        synchronized (C0996q.class) {
            Map map = f14012h;
            c0996q = (C0996q) map.get(uri);
            if (c0996q == null) {
                try {
                    C0996q c0996q2 = new C0996q(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c0996q2);
                    } catch (SecurityException unused) {
                    }
                    c0996q = c0996q2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c0996q;
    }

    static synchronized void d() {
        try {
            for (C0996q c0996q : f14012h.values()) {
                c0996q.f14014a.unregisterContentObserver(c0996q.f14017d);
            }
            f14012h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.google.android.gms.internal.auth.InterfaceC1007u
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        ?? r02;
        Map map2 = this.f14019f;
        Map mapEmptyMap = map2;
        if (map2 == null) {
            synchronized (this.f14018e) {
                Map map3 = this.f14019f;
                if (map3 != null) {
                    r02 = map3;
                } else {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) AbstractC1001s.a(new InterfaceC1004t() { // from class: com.google.android.gms.internal.auth.o
                                @Override // com.google.android.gms.internal.auth.InterfaceC1004t
                                public final Object a() {
                                    return this.f14010a.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f14019f = map;
                        threadPolicyAllowThreadDiskReads = map;
                        r02 = threadPolicyAllowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
            mapEmptyMap = r02;
        }
        if (mapEmptyMap == 0) {
            mapEmptyMap = Collections.emptyMap();
        }
        return (String) mapEmptyMap.get(str);
    }

    final /* synthetic */ Map c() {
        Cursor cursorQuery = this.f14014a.query(this.f14015b, f14013i, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c1890a = count <= 256 ? new C1890a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c1890a.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c1890a;
        } finally {
            cursorQuery.close();
        }
    }

    public final void e() {
        synchronized (this.f14018e) {
            this.f14019f = null;
            M.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f14020g.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.y.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
