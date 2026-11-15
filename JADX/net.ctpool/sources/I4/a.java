package I4;

import A4.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f1523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f1524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1525d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f1522a = contextA;
        this.f1523b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f1524c = cVar;
        this.f1525d = c();
    }

    private static Context a(Context context) {
        return b.b(context);
    }

    private boolean c() {
        return this.f1523b.contains("firebase_data_collection_default_enabled") ? this.f1523b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f1522a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f1522a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z6) {
        if (this.f1525d != z6) {
            this.f1525d = z6;
            this.f1524c.d(new A4.a(Y3.b.class, new Y3.b(z6)));
        }
    }

    public synchronized boolean b() {
        return this.f1525d;
    }

    public synchronized void e(Boolean bool) {
        boolean zEquals;
        try {
            if (bool == null) {
                this.f1523b.edit().remove("firebase_data_collection_default_enabled").apply();
                zEquals = d();
            } else {
                zEquals = Boolean.TRUE.equals(bool);
                this.f1523b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
            }
            f(zEquals);
        } catch (Throwable th) {
            throw th;
        }
    }
}
