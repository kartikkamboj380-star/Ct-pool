package com.dooboolab.rniap;

import android.util.Log;
import com.facebook.react.bridge.ObjectAlreadyConsumedException;
import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(Promise promise, String str) {
        w5.k.f(promise, "<this>");
        w5.k.f(str, "message");
        c(promise, str, null, null);
    }

    public static final void b(Promise promise, String str, String str2) {
        w5.k.f(promise, "<this>");
        c(promise, str, str2, null);
    }

    public static final void c(Promise promise, String str, String str2, Throwable th) {
        w5.k.f(promise, "<this>");
        if (str == null) {
            str = "";
        }
        try {
            promise.reject(str, str2, th);
        } catch (ObjectAlreadyConsumedException e7) {
            Log.d("IapPromises", "Already consumed " + e7.getMessage());
        }
    }

    public static final void d(Promise promise, Object obj) {
        w5.k.f(promise, "<this>");
        try {
            promise.resolve(obj);
        } catch (ObjectAlreadyConsumedException e7) {
            Log.d("IapPromises", "Already consumed " + e7.getMessage());
        }
    }
}
