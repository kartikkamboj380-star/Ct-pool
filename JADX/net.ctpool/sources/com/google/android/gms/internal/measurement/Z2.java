package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f14491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f14492b = !a();

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    private static boolean d(Context context) {
        if (f14492b) {
            return true;
        }
        synchronized (Z2.class) {
            try {
                if (f14492b) {
                    return true;
                }
                boolean zE = e(context);
                if (zE) {
                    f14492b = zE;
                }
                return zE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean e(Context context) {
        boolean z6;
        boolean z7 = true;
        int i7 = 1;
        while (true) {
            z6 = false;
            if (i7 > 2) {
                break;
            }
            if (f14491a == null) {
                f14491a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f14491a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z7 = false;
                }
            } catch (NullPointerException e7) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e7);
                f14491a = null;
                i7++;
            }
        }
        z6 = z7;
        if (z6) {
            f14491a = null;
        }
        return z6;
    }
}
