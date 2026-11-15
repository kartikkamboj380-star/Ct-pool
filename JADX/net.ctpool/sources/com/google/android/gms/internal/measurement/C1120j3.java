package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1120j3 implements InterfaceC1111i3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1120j3 f14636c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f14638b;

    private C1120j3() {
        this.f14637a = null;
        this.f14638b = null;
    }

    static C1120j3 a(Context context) {
        C1120j3 c1120j3;
        synchronized (C1120j3.class) {
            try {
                if (f14636c == null) {
                    f14636c = androidx.core.content.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1120j3(context) : new C1120j3();
                }
                c1120j3 = f14636c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1120j3;
    }

    static synchronized void b() {
        Context context;
        try {
            C1120j3 c1120j3 = f14636c;
            if (c1120j3 != null && (context = c1120j3.f14637a) != null && c1120j3.f14638b != null) {
                context.getContentResolver().unregisterContentObserver(f14636c.f14638b);
            }
            f14636c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1111i3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String f(final String str) {
        Context context = this.f14637a;
        if (context != null && !Z2.b(context)) {
            try {
                return (String) AbstractC1102h3.a(new InterfaceC1129k3() { // from class: com.google.android.gms.internal.measurement.m3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC1129k3
                    public final Object a() {
                        return this.f14736a.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e7) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e7);
            }
        }
        return null;
    }

    final /* synthetic */ String c(String str) {
        return Q2.a(this.f14637a.getContentResolver(), str, null);
    }

    private C1120j3(Context context) {
        this.f14637a = context;
        C1138l3 c1138l3 = new C1138l3(this, null);
        this.f14638b = c1138l3;
        context.getContentResolver().registerContentObserver(P2.f14305a, true, c1138l3);
    }
}
