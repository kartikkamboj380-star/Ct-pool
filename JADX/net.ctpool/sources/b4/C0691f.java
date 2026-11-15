package b4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: b4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f9686b;

    /* JADX INFO: renamed from: b4.f$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f9687a;

        private b(Class cls) {
            this.f9687a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f9687a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f9687a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // b4.C0691f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: b4.f$c */
    interface c {
        List a(Object obj);
    }

    C0691f(Object obj, c cVar) {
        this.f9685a = obj;
        this.f9686b = cVar;
    }

    public static C0691f c(Context context, Class cls) {
        return new C0691f(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e7) {
            throw new v(String.format("Could not instantiate %s.", str), e7);
        } catch (InstantiationException e8) {
            throw new v(String.format("Could not instantiate %s.", str), e8);
        } catch (NoSuchMethodException e9) {
            throw new v(String.format("Could not instantiate %s", str), e9);
        } catch (InvocationTargetException e10) {
            throw new v(String.format("Could not instantiate %s", str), e10);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f9686b.a(this.f9685a)) {
            arrayList.add(new D4.b() { // from class: b4.e
                @Override // D4.b
                public final Object get() {
                    return C0691f.d(str);
                }
            });
        }
        return arrayList;
    }
}
