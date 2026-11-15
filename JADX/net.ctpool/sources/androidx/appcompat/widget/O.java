package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f5717a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f5718b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f5719c = new Rect();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final boolean f5720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Method f5721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Field f5722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Field f5723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Field f5724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Field f5725f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z6;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z6 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            field4 = null;
                            z6 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z6 = false;
                    if (z6) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z6 = false;
                    if (z6) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z6 = false;
                    if (z6) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z6 = false;
                if (z6) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z6 = false;
                if (z6) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z6 = false;
                if (z6) {
                }
            }
            if (z6) {
                f5721b = method;
                f5722c = field;
                f5723d = field2;
                f5724e = field3;
                f5725f = field4;
                f5720a = true;
                return;
            }
            f5721b = null;
            f5722c = null;
            f5723d = null;
            f5724e = null;
            f5725f = null;
            f5720a = false;
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f5720a) {
                try {
                    Object objInvoke = f5721b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f5722c.getInt(objInvoke), f5723d.getInt(objInvoke), f5724e.getInt(objInvoke), f5725f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return O.f5719c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f5717a);
        } else {
            drawable.setState(f5718b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(androidx.core.graphics.drawable.a.k(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
