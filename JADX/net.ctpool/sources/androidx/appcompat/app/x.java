package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f5218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f5219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f5220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f5221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f5222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f5223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f5224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f5225h;

    static class a {
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f5225h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f5224g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
            }
            f5225h = true;
        }
        Field field = f5224g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e8) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e8);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f5219b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f5218a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e9);
            }
            f5219b = true;
        }
        Field field2 = f5218a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e10);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f5221d) {
            try {
                f5220c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            f5221d = true;
        }
        Class cls = f5220c;
        if (cls == null) {
            return;
        }
        if (!f5223f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f5222e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e8);
            }
            f5223f = true;
        }
        Field field = f5222e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e9) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e9);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
