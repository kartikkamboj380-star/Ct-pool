package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public final class D3 implements InterfaceC1111i3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f14160g = new C1890a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f14161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f14162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f14163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f14164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Map f14165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f14166f;

    private D3(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.C3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f14151a.d(sharedPreferences2, str);
            }
        };
        this.f14163c = onSharedPreferenceChangeListener;
        this.f14164d = new Object();
        this.f14166f = new ArrayList();
        this.f14161a = sharedPreferences;
        this.f14162b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferencesA = AbstractC1256z0.a(context, str, 0, AbstractC1224v0.f14930a);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return sharedPreferencesA;
            }
            if (Z2.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferencesA2 = AbstractC1256z0.a(context, str.substring(12), 0, AbstractC1224v0.f14930a);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return sharedPreferencesA2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    static D3 b(Context context, String str, Runnable runnable) {
        D3 d32;
        if (!((!Z2.a() || str.startsWith("direct_boot:")) ? true : Z2.c(context))) {
            return null;
        }
        synchronized (D3.class) {
            try {
                Map map = f14160g;
                d32 = (D3) map.get(str);
                if (d32 == null) {
                    d32 = new D3(a(context, str), runnable);
                    map.put(str, d32);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d32;
    }

    static synchronized void c() {
        try {
            for (D3 d32 : f14160g.values()) {
                d32.f14161a.unregisterOnSharedPreferenceChangeListener(d32.f14163c);
            }
            f14160g.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f14164d) {
            this.f14165e = null;
            this.f14162b.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f14166f.iterator();
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
    public final Object f(String str) {
        Map<String, ?> map = this.f14165e;
        if (map == null) {
            synchronized (this.f14164d) {
                try {
                    map = this.f14165e;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f14161a.getAll();
                            this.f14165e = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
