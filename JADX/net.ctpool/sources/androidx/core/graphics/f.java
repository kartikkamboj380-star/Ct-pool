package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.d;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f7144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f7145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f7146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f7147e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            method2 = null;
        }
        f7145c = constructor;
        f7144b = cls;
        f7146d = method2;
        f7147e = method;
    }

    f() {
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z6) {
        try {
            return ((Boolean) f7146d.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f7144b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f7147e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f7146d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f7145c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.j
    public Typeface a(Context context, d.c cVar, Resources resources, int i7) {
        Object objK = k();
        if (objK == null) {
            return null;
        }
        for (d.C0137d c0137d : cVar.a()) {
            ByteBuffer byteBufferB = k.b(context, resources, c0137d.b());
            if (byteBufferB == null || !h(objK, byteBufferB, c0137d.c(), c0137d.e(), c0137d.f())) {
                return null;
            }
        }
        return i(objK);
    }

    @Override // androidx.core.graphics.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        Object objK = k();
        if (objK == null) {
            return null;
        }
        n.g gVar = new n.g();
        for (g.b bVar : bVarArr) {
            Uri uriD = bVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) gVar.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = k.f(context, cancellationSignal, uriD);
                gVar.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !h(objK, byteBufferF, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface typefaceI = i(objK);
        if (typefaceI == null) {
            return null;
        }
        return Typeface.create(typefaceI, i7);
    }
}
