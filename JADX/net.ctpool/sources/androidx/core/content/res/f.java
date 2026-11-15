package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f7092a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f7093b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f7094c = new Object();

    static class a {
        static Drawable a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }

        static Drawable b(Resources resources, int i7, int i8, Resources.Theme theme) {
            return resources.getDrawableForDensity(i7, i8, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColor(i7, theme);
        }

        static ColorStateList b(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColorStateList(i7, theme);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f7095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f7096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f7097c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f7095a = colorStateList;
            this.f7096b = configuration;
            this.f7097c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f7098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f7099b;

        d(Resources resources, Resources.Theme theme) {
            this.f7098a = resources;
            this.f7099b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7098a.equals(dVar.f7098a) && androidx.core.util.b.a(this.f7099b, dVar.f7099b);
        }

        public int hashCode() {
            return androidx.core.util.b.b(this.f7098a, this.f7099b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i7, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7105m.f(i7);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7103m.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i7);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    /* JADX INFO: renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    public static final class C0138f {

        /* JADX INFO: renamed from: androidx.core.content.res.f$f$a */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f7100a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f7101b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f7102c;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            static void a(Resources.Theme theme) {
                Method method;
                synchronized (f7100a) {
                    if (f7102c) {
                        method = f7101b;
                        if (method != null) {
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f7101b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e7) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e7);
                        }
                        f7102c = true;
                        method = f7101b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e8) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e8);
                                f7101b = null;
                            }
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.core.content.res.f$f$b */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f7094c) {
            try {
                WeakHashMap weakHashMap = f7093b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i7, new c(colorStateList, dVar.f7098a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f7097c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList b(d dVar, int i7) {
        c cVar;
        synchronized (f7094c) {
            try {
                SparseArray sparseArray = (SparseArray) f7093b.get(dVar);
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i7)) != null) {
                    if (cVar.f7096b.equals(dVar.f7098a.getConfiguration())) {
                        Resources.Theme theme = dVar.f7099b;
                        if (theme != null || cVar.f7097c != 0) {
                            if (theme != null) {
                            }
                        }
                        return cVar.f7095a;
                    }
                    sparseArray.remove(i7);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface c(Context context, int i7) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i7, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i7, Resources.Theme theme) {
        return b.a(resources, i7, theme);
    }

    public static ColorStateList e(Resources resources, int i7, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i7);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i7, theme);
        if (colorStateListL == null) {
            return b.b(resources, i7, theme);
        }
        a(dVar, i7, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable f(Resources resources, int i7, Resources.Theme theme) {
        return a.a(resources, i7, theme);
    }

    public static Drawable g(Resources resources, int i7, int i8, Resources.Theme theme) {
        return a.b(resources, i7, i8, theme);
    }

    public static Typeface h(Context context, int i7) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i7, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i7, TypedValue typedValue, int i8, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i7, typedValue, i8, eVar, null, true, false);
    }

    public static void j(Context context, int i7, e eVar, Handler handler) {
        androidx.core.util.f.f(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i7, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue k() {
        ThreadLocal threadLocal = f7092a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList l(Resources resources, int i7, Resources.Theme theme) {
        if (m(resources, i7)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            return null;
        }
    }

    private static boolean m(Resources resources, int i7) {
        TypedValue typedValueK = k();
        resources.getValue(i7, typedValueK, true);
        int i8 = typedValueK.type;
        return i8 >= 28 && i8 <= 31;
    }

    private static Typeface n(Context context, int i7, TypedValue typedValue, int i8, e eVar, Handler handler, boolean z6, boolean z7) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i7, i8, eVar, handler, z6, z7);
        if (typefaceO != null || eVar != null || z7) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface o(Context context, Resources resources, TypedValue typedValue, int i7, int i8, e eVar, Handler handler, boolean z6, boolean z7) {
        StringBuilder sb;
        String str;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i7) + "\" (" + Integer.toHexString(i7) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        int i9 = 0;
        if (!string.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceF = androidx.core.graphics.d.f(resources, i7, string, typedValue.assetCookie, i8);
        if (typefaceF != null) {
            if (eVar != null) {
                eVar.d(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z7) {
            return null;
        }
        try {
        } catch (IOException e7) {
            e = e7;
            i9 = -3;
        } catch (XmlPullParserException e8) {
            e = e8;
            i9 = -3;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceD = androidx.core.graphics.d.d(context, resources, i7, string, typedValue.assetCookie, i8);
                if (eVar != null) {
                    if (typefaceD != null) {
                        eVar.d(typefaceD, handler);
                    } else {
                        eVar.c(-3, handler);
                    }
                }
                return typefaceD;
            }
            d.b bVarB = androidx.core.content.res.d.b(resources.getXml(i7), resources);
            if (bVarB != null) {
                return androidx.core.graphics.d.c(context, bVarB, resources, i7, string, typedValue.assetCookie, i8, eVar, handler, z6);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        } catch (IOException e9) {
            e = e9;
            sb = new StringBuilder();
            str = "Failed to read xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (eVar != null) {
                return null;
            }
            eVar.c(i9, handler);
            return null;
        } catch (XmlPullParserException e10) {
            e = e10;
            sb = new StringBuilder();
            str = "Failed to parse xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (eVar != null) {
            }
        }
    }
}
