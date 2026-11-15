package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import z3.InterfaceC2268h;

/* JADX INFO: loaded from: classes.dex */
abstract class U {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z6) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z6;
    }

    static void f(Context context, boolean z6) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z6);
        editorEdit.apply();
    }

    static void g(final Context context, G g7, final boolean z6) {
        if (PlatformVersion.isAtLeastQ() && !d(b(context), z6)) {
            g7.l(z6).f(new U.m(), new InterfaceC2268h() { // from class: com.google.firebase.messaging.T
                @Override // z3.InterfaceC2268h
                public final void b(Object obj) {
                    U.h(context, z6);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Context context, boolean z6) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z6);
        editorEdit.apply();
    }
}
