package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zzb;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d7, double d8, double d9, String str) {
        if (d7 < d8) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d8), Double.valueOf(d9)));
        }
        if (d7 <= d9) {
            return d7;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d8), Double.valueOf(d9)));
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static <T> T checkNotNull(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException("null reference");
    }

    @KeepForSdk
    public static int checkNotZero(int i7) {
        if (i7 != 0) {
            return i7;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    static String zza(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i7 = 0;
        int i8 = 0;
        while (i7 < 3 && (iIndexOf = str.indexOf("%s", i8)) != -1) {
            sb.append(str.substring(i8, iIndexOf));
            sb.append(objArr[i7]);
            i8 = iIndexOf + 2;
            i7++;
        }
        sb.append(str.substring(i8));
        if (i7 < 3) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i9 = i7 + 1; i9 < 3; i9++) {
                sb.append(", ");
                sb.append(objArr[i9]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f7, float f8, float f9, String str) {
        if (f7 < f8) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f8), Float.valueOf(f9)));
        }
        if (f7 <= f9) {
            return f7;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f8), Float.valueOf(f9)));
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkMainThread(String str) {
        if (!zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static String checkNotEmpty(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(String str) {
        if (zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static <T> T checkNotNull(T t6, Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i7, Object obj) {
        if (i7 != 0) {
            return i7;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i7, int i8, int i9, String str) {
        if (i7 < i8) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        if (i7 <= i9) {
            return i7;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    @KeepForSdk
    public static long checkNotZero(long j7) {
        if (j7 != 0) {
            return j7;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j7, long j8, long j9, String str) {
        if (j7 < j8) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j8), Long.valueOf(j9)));
        }
        if (j7 <= j9) {
            return j7;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j8), Long.valueOf(j9)));
    }

    @KeepForSdk
    public static long checkNotZero(long j7, Object obj) {
        if (j7 != 0) {
            return j7;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
