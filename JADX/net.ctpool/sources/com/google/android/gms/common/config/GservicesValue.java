package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    protected final String zza;
    protected final Object zzb;
    private Object zzd = null;

    protected GservicesValue(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String str, Float f7) {
        return new d(str, f7);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get() {
        T t6;
        T t7 = (T) this.zzd;
        if (t7 != null) {
            return t7;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        try {
            t6 = (T) zza(this.zza);
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                t6 = (T) zza(this.zza);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return t6;
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    public void override(T t6) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = t6;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    protected abstract Object zza(String str);

    @KeepForSdk
    public static GservicesValue<Integer> value(String str, Integer num) {
        return new c(str, num);
    }

    @KeepForSdk
    public static GservicesValue<Long> value(String str, Long l7) {
        return new b(str, l7);
    }

    @KeepForSdk
    public static GservicesValue<String> value(String str, String str2) {
        return new e(str, str2);
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String str, boolean z6) {
        return new a(str, Boolean.valueOf(z6));
    }
}
