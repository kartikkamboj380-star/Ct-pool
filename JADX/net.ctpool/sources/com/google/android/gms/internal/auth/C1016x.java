package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1016x implements InterfaceC1007u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1016x f14046c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f14048b;

    private C1016x() {
        this.f14047a = null;
        this.f14048b = null;
    }

    static C1016x b(Context context) {
        C1016x c1016x;
        synchronized (C1016x.class) {
            try {
                if (f14046c == null) {
                    f14046c = androidx.core.content.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1016x(context) : new C1016x();
                }
                c1016x = f14046c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1016x;
    }

    static synchronized void e() {
        Context context;
        try {
            C1016x c1016x = f14046c;
            if (c1016x != null && (context = c1016x.f14047a) != null && c1016x.f14048b != null) {
                context.getContentResolver().unregisterContentObserver(f14046c.f14048b);
            }
            f14046c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC1007u
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f14047a;
        if (context != null && !AbstractC0984m.a(context)) {
            try {
                return (String) AbstractC1001s.a(new InterfaceC1004t() { // from class: com.google.android.gms.internal.auth.v
                    @Override // com.google.android.gms.internal.auth.InterfaceC1004t
                    public final Object a() {
                        return this.f14039a.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e7) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e7);
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return AbstractC0981l.a(this.f14047a.getContentResolver(), str, null);
    }

    private C1016x(Context context) {
        this.f14047a = context;
        C1013w c1013w = new C1013w(this, null);
        this.f14048b = c1013w;
        context.getContentResolver().registerContentObserver(AbstractC0981l.f13988a, true, c1013w);
    }
}
