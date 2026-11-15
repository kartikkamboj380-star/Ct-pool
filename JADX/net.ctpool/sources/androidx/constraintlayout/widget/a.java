package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f6373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f6374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f6376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f6378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6379g;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0128a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6380a;

        static {
            int[] iArr = new int[b.values().length];
            f6380a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6380a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6380a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6380a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6380a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6380a[b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6380a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(a aVar, Object obj) {
        this.f6373a = aVar.f6373a;
        this.f6374b = aVar.f6374b;
        d(obj);
    }

    public static HashMap a(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
            } catch (IllegalAccessException e7) {
                e = e7;
                e.printStackTrace();
            } catch (NoSuchMethodException e8) {
                e = e8;
                e.printStackTrace();
            } catch (InvocationTargetException e9) {
                e = e9;
                e.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap map) {
        b bVar;
        Object string;
        int integer;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f6745n2);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == g.f6751o2) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == g.f6757p2) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == g.f6769r2) {
                    bVar = b.COLOR_TYPE;
                } else if (index == g.f6763q2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == g.f6793v2) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == g.f6775s2) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == g.f6781t2) {
                        bVar = b.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == g.f6787u2) {
                        bVar = b.INT_TYPE;
                        integer = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj = string;
                        bVar2 = bVar;
                        objValueOf = obj;
                    } else if (index == g.f6799w2) {
                        bVar = b.STRING_TYPE;
                        string = typedArrayObtainStyledAttributes.getString(index);
                        Object obj2 = string;
                        bVar2 = bVar;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj22 = string;
                    bVar2 = bVar;
                    objValueOf = obj22;
                }
                integer = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj222 = string;
                bVar2 = bVar;
                objValueOf = obj222;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new a(string2, bVar2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap map) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            String str2 = "set" + str;
            try {
                switch (C0128a.f6380a[aVar.f6374b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f6379g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f6379g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f6375c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f6376d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f6377e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f6378f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f6376d));
                        break;
                }
            } catch (IllegalAccessException e7) {
                e = e7;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e8) {
                Log.e("TransitionLayout", e8.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e9) {
                e = e9;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (C0128a.f6380a[this.f6374b.ordinal()]) {
            case 1:
            case 2:
                this.f6379g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f6375c = ((Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.f6376d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f6377e = (String) obj;
                break;
            case 6:
                this.f6378f = ((Boolean) obj).booleanValue();
                break;
        }
    }

    public a(String str, b bVar, Object obj) {
        this.f6373a = str;
        this.f6374b = bVar;
        d(obj);
    }
}
