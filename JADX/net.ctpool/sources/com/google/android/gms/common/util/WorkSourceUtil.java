package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        zzb = method;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        zzc = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        zzd = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        zze = method4;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        zzf = method5;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e7) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e7);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        zzg = method6;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e8);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        zzh = method7;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        zzi = method8;
        zzj = null;
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(WorkSource workSource, int i7, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i7), str);
                return;
            } catch (Exception e7) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i7));
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
            }
        }
    }

    @KeepForSdk
    public static WorkSource fromPackage(Context context, String str) {
        String str2;
        ApplicationInfo applicationInfo;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (applicationInfo == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i7 = applicationInfo.uid;
        WorkSource workSource = new WorkSource();
        add(workSource, i7, str);
        return workSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        String str3;
        Method method;
        ApplicationInfo applicationInfo;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i7 = -1;
        try {
            applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "Could not find package: ";
        }
        if (applicationInfo == null) {
            str3 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str3.concat(str));
            if (i7 >= 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = zzg;
            if (method2 == null || (method = zzh) == null) {
                add(workSource, i7, str);
            } else {
                try {
                    Object objInvoke = method2.invoke(workSource, null);
                    int i8 = zza;
                    if (i7 != i8) {
                        method.invoke(objInvoke, Integer.valueOf(i7), str);
                    }
                    method.invoke(objInvoke, Integer.valueOf(i8), str2);
                } catch (Exception e7) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e7);
                }
            }
            return workSource;
        }
        i7 = applicationInfo.uid;
        if (i7 >= 0) {
        }
    }

    @KeepForSdk
    public static int get(WorkSource workSource, int i7) {
        Method method = zze;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, Integer.valueOf(i7));
            Preconditions.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e7) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
            return 0;
        }
    }

    @KeepForSdk
    public static String getName(WorkSource workSource, int i7) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i7));
        } catch (Exception e7) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
            return null;
        }
    }

    @KeepForSdk
    public static List<String> getNames(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i7 = 0; i7 < size; i7++) {
                String name = getName(workSource, i7);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(Context context) {
        Boolean bool = zzj;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z6 = b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        zzj = Boolean.valueOf(z6);
        return z6;
    }

    @KeepForSdk
    public static boolean isEmpty(WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e7) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e7);
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(WorkSource workSource) {
        Method method = zzd;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            Preconditions.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e7) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
            return 0;
        }
    }
}
