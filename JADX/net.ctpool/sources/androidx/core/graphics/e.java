package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.d;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class f7139b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Constructor f7140c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f7141d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f7142e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f7143f = false;

    e() {
    }

    private static boolean h(Object obj, String str, int i7, boolean z6) throws NoSuchMethodException {
        k();
        try {
            return ((Boolean) f7141d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException {
        k();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f7139b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f7142e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f7143f) {
            return;
        }
        f7143f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f7140c = constructor;
        f7139b = cls;
        f7141d = method2;
        f7142e = method;
    }

    private static Object l() throws NoSuchMethodException {
        k();
        try {
            return f7140c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // androidx.core.graphics.j
    public Typeface a(Context context, d.c cVar, Resources resources, int i7) throws NoSuchMethodException {
        Object objL = l();
        for (d.C0137d c0137d : cVar.a()) {
            File fileE = k.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!k.c(fileE, resources, c0137d.b())) {
                    return null;
                }
                if (!h(objL, fileE.getPath(), c0137d.e(), c0137d.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return i(objL);
    }

    @Override // androidx.core.graphics.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        if (bVarArr.length < 1) {
            return null;
        }
        g.b bVarG = g(bVarArr, i7);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ != null && fileJ.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileJ);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceC = super.c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
