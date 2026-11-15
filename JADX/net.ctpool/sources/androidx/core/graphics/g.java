package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.d;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Class f7148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Constructor f7149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Method f7150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Method f7151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Method f7152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final Method f7153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Method f7154m;

    public g() {
        Class clsV;
        Constructor constructorW;
        Method methodS;
        Method methodT;
        Method methodX;
        Method methodR;
        Method methodU;
        try {
            clsV = v();
            constructorW = w(clsV);
            methodS = s(clsV);
            methodT = t(clsV);
            methodX = x(clsV);
            methodR = r(clsV);
            methodU = u(clsV);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e7.getClass().getName(), e7);
            clsV = null;
            constructorW = null;
            methodS = null;
            methodT = null;
            methodX = null;
            methodR = null;
            methodU = null;
        }
        this.f7148g = clsV;
        this.f7149h = constructorW;
        this.f7150i = methodS;
        this.f7151j = methodT;
        this.f7152k = methodX;
        this.f7153l = methodR;
        this.f7154m = methodU;
    }

    private Object l() {
        try {
            return this.f7149h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f7153l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f7150i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i7, int i8, int i9) {
        try {
            return ((Boolean) this.f7151j.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Integer.valueOf(i9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f7152k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f7150i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f7150i != null;
    }

    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface a(Context context, d.c cVar, Resources resources, int i7) {
        if (!q()) {
            return super.a(context, cVar, resources, i7);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (d.C0137d c0137d : cVar.a()) {
            if (!n(context, objL, c0137d.a(), c0137d.c(), c0137d.e(), c0137d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0137d.d()))) {
                m(objL);
                return null;
            }
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        Typeface typefaceI;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
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
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapH = k.h(context, bVarArr, cancellationSignal);
        Object objL = l();
        if (objL == null) {
            return null;
        }
        boolean z6 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapH.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(objL, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(objL);
                    return null;
                }
                z6 = true;
            }
        }
        if (!z6) {
            m(objL);
            return null;
        }
        if (p(objL) && (typefaceI = i(objL)) != null) {
            return Typeface.create(typefaceI, i7);
        }
        return null;
    }

    @Override // androidx.core.graphics.j
    public Typeface d(Context context, Resources resources, int i7, String str, int i8) {
        if (!q()) {
            return super.d(context, resources, i7, str, i8);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (!n(context, objL, str, 0, -1, -1, null)) {
            m(objL);
            return null;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f7148g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f7154m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method s(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor w(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method x(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
