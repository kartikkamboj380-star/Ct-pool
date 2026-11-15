package V2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f4039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f4040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f4041c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f4043b = null;

        a(Context context) {
            this.f4042a = context;
        }

        private Map a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map c() {
            if (this.f4043b == null) {
                this.f4043b = a(this.f4042a);
            }
            return this.f4043b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2;
            String str3;
            String str4 = (String) c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e7) {
                e = e7;
                str2 = String.format("Class %s is not found.", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (IllegalAccessException e8) {
                e = e8;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InstantiationException e9) {
                e = e9;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (NoSuchMethodException e10) {
                e = e10;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InvocationTargetException e11) {
                e = e11;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            }
        }
    }

    k(a aVar, i iVar) {
        this.f4041c = new HashMap();
        this.f4039a = aVar;
        this.f4040b = iVar;
    }

    @Override // V2.e
    public synchronized m a(String str) {
        if (this.f4041c.containsKey(str)) {
            return (m) this.f4041c.get(str);
        }
        d dVarB = this.f4039a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f4040b.a(str));
        this.f4041c.put(str, mVarCreate);
        return mVarCreate;
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }
}
