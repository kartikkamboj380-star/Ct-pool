package g5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f19548a = new j();

    private Bundle c() {
        ApplicationInfo applicationInfo;
        try {
            Context contextA = io.invertase.firebase.app.a.a();
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static j d() {
        return f19548a;
    }

    public WritableMap a() {
        Bundle bundleC = c();
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (bundleC == null) {
            return writableMapCreateMap;
        }
        for (String str : bundleC.keySet()) {
            if (str.startsWith("rnfirebase_")) {
                Object obj = bundleC.get(str);
                if (obj == null) {
                    writableMapCreateMap.putNull(str);
                } else if (obj instanceof String) {
                    writableMapCreateMap.putString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
                }
            }
        }
        return writableMapCreateMap;
    }

    public boolean b(String str, boolean z6) {
        Bundle bundleC = c();
        if (bundleC == null) {
            return z6;
        }
        return bundleC.getBoolean("rnfirebase_" + str, z6);
    }
}
