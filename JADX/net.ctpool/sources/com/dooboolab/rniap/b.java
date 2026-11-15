package com.dooboolab.rniap;

import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10436a = new b();

    private b() {
    }

    public final a a(int i7) {
        a aVar;
        a aVar2;
        if (i7 != 12) {
            switch (i7) {
                case -2:
                    aVar2 = new a("E_SERVICE_ERROR", "This feature is not available on your device.");
                    break;
                case -1:
                    aVar = new a("E_NETWORK_ERROR", "The service is disconnected (check your internet connection.)");
                    break;
                case 0:
                    aVar2 = new a("OK", "");
                    break;
                case 1:
                    aVar2 = new a("E_USER_CANCELLED", "Payment is Cancelled.");
                    break;
                case 2:
                    aVar2 = new a("E_SERVICE_ERROR", "The service is unreachable. This may be your internet connection, or the Play Store may be down.");
                    break;
                case 3:
                    aVar2 = new a("E_SERVICE_ERROR", "Billing is unavailable. This may be a problem with your device, or the Play Store may be down.");
                    break;
                case 4:
                    aVar2 = new a("E_ITEM_UNAVAILABLE", "That item is unavailable.");
                    break;
                case 5:
                    aVar2 = new a("E_DEVELOPER_ERROR", "Google is indicating that we have some issue connecting to payment.");
                    break;
                case 6:
                    aVar2 = new a("E_UNKNOWN", "An unknown or unexpected error has occurred. Please try again later.");
                    break;
                case 7:
                    aVar2 = new a("E_ALREADY_OWNED", "You already own this item.");
                    break;
                default:
                    aVar2 = new a("E_UNKNOWN", "Purchase failed with code: " + i7);
                    break;
            }
            Log.e("IapPromises", "Error Code : " + i7);
            return aVar2;
        }
        aVar = new a("E_NETWORK_ERROR", "You have problem with network connection.");
        aVar2 = aVar;
        Log.e("IapPromises", "Error Code : " + i7);
        return aVar2;
    }

    public final void b(Promise promise, int i7) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        a aVarA = a(i7);
        d.b(promise, aVarA.a(), aVarA.b());
    }

    public final void c(String str, int i7) {
        w5.k.f(str, "key");
        a aVarA = a(i7);
        c.f10437a.c(str, aVarA.a(), aVarA.b(), null);
    }
}
