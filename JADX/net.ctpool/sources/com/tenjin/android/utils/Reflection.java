package com.tenjin.android.utils;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Reflection {
    private static final String TAG = "TenjinReflection";

    public static Class forName(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object newInstance(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static Object runInstanceMethod(Object obj, String str, Class[] clsArr, Object... objArr) {
        if (obj != null && str != null) {
            try {
                return runMethod(obj.getClass(), str, obj, clsArr, objArr);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            } catch (Exception e7) {
                Log.e(TAG, "Error running instance method " + str + " on " + obj.toString() + " : " + e7.getLocalizedMessage());
            }
        }
        return null;
    }

    private static Object runMethod(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        Method method;
        if (cls == null || str == null || (method = cls.getMethod(str, clsArr)) == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static Object runStaticMethod(String str, String str2, Class[] clsArr, Object... objArr) {
        StringBuilder sb;
        String localizedMessage;
        try {
            return runMethod(Class.forName(str), str2, null, clsArr, objArr);
        } catch (ClassNotFoundException e7) {
            e = e7;
            sb = new StringBuilder();
            sb.append("Error running static method ");
            sb.append(str2);
            sb.append(" on ");
            sb.append(str);
            sb.append(" : ");
            localizedMessage = e.getMessage();
            sb.append(localizedMessage);
            Log.e(TAG, sb.toString());
            return null;
        } catch (IllegalAccessException e8) {
            e = e8;
            sb = new StringBuilder();
            sb.append("Error running static method ");
            sb.append(str2);
            sb.append(" on ");
            sb.append(str);
            sb.append(" : ");
            localizedMessage = e.getMessage();
            sb.append(localizedMessage);
            Log.e(TAG, sb.toString());
            return null;
        } catch (NoSuchMethodException e9) {
            e = e9;
            sb = new StringBuilder();
            sb.append("Error running static method ");
            sb.append(str2);
            sb.append(" on ");
            sb.append(str);
            sb.append(" : ");
            localizedMessage = e.getMessage();
            sb.append(localizedMessage);
            Log.e(TAG, sb.toString());
            return null;
        } catch (InvocationTargetException e10) {
            e = e10;
            sb = new StringBuilder();
            sb.append("Error running static method ");
            sb.append(str2);
            sb.append(" on ");
            sb.append(str);
            sb.append(" : ");
            localizedMessage = e.getMessage();
            sb.append(localizedMessage);
            Log.e(TAG, sb.toString());
            return null;
        } catch (Exception e11) {
            sb = new StringBuilder();
            sb.append("Error running static method ");
            sb.append(str2);
            sb.append(" on ");
            sb.append(str);
            sb.append(" : ");
            localizedMessage = e11.getLocalizedMessage();
            sb.append(localizedMessage);
            Log.e(TAG, sb.toString());
            return null;
        }
    }
}
