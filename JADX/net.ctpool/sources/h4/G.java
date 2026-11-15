package h4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import e4.C1629g;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f19665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y3.f f19666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C2273m f19668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f19669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f19671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2273m f19672h;

    public G(Y3.f fVar) {
        Object obj = new Object();
        this.f19667c = obj;
        this.f19668d = new C2273m();
        this.f19669e = false;
        this.f19670f = false;
        this.f19672h = new C2273m();
        Context contextM = fVar.m();
        this.f19666b = fVar;
        this.f19665a = AbstractC1721j.q(contextM);
        Boolean boolB = b();
        this.f19671g = boolB == null ? a(contextM) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f19668d.e(null);
                    this.f19669e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f19670f = false;
            return null;
        }
        this.f19670f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    private Boolean b() {
        if (!this.f19665a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f19670f = false;
        return Boolean.valueOf(this.f19665a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f19666b.x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z6) {
        C1629g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z6 ? "ENABLED" : "DISABLED", this.f19671g == null ? "global Firebase setting" : this.f19670f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e7) {
            C1629g.f().e("Could not read data collection permission from manifest", e7);
            return null;
        }
    }

    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public void c(boolean z6) {
        if (!z6) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f19672h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f19671g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f19670f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f19671g = bool != null ? bool : a(this.f19666b.m());
        i(this.f19665a, bool);
        synchronized (this.f19667c) {
            try {
                if (d()) {
                    if (!this.f19669e) {
                        this.f19668d.e(null);
                        this.f19669e = true;
                    }
                } else if (this.f19669e) {
                    this.f19668d = new C2273m();
                    this.f19669e = false;
                }
            } finally {
            }
        }
    }

    public AbstractC2272l j() {
        AbstractC2272l abstractC2272lA;
        synchronized (this.f19667c) {
            abstractC2272lA = this.f19668d.a();
        }
        return abstractC2272lA;
    }

    public AbstractC2272l k() {
        return i4.b.c(this.f19672h.a(), j());
    }
}
