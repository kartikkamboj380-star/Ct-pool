package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0984m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f14001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f14002b = !b();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, NullPointerException -> 0x0045, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        int i7;
        boolean z6;
        if (b() && !f14002b) {
            synchronized (AbstractC0984m.class) {
                try {
                    if (!f14002b) {
                        i7 = 1;
                        while (true) {
                            if (i7 <= 2) {
                                if (f14001a == null) {
                                    f14001a = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = f14001a;
                                if (userManager != null) {
                                    if (userManager.isUserUnlocked()) {
                                        break;
                                    }
                                    if (!userManager.isUserRunning(Process.myUserHandle())) {
                                        break;
                                    }
                                    if (z6) {
                                        f14001a = null;
                                    }
                                } else {
                                    z6 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z6 = false;
                        if (z6) {
                        }
                        if (z6) {
                            f14002b = true;
                        }
                        if (!z6) {
                            return true;
                        }
                    }
                } catch (NullPointerException e7) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e7);
                    f14001a = null;
                    i7++;
                } finally {
                }
            }
        }
        return false;
    }

    public static boolean b() {
        return true;
    }
}
