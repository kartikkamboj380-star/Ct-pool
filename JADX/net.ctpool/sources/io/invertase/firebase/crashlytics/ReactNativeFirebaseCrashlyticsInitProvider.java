package io.invertase.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import g5.h;
import g5.i;
import g5.j;
import g5.k;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseCrashlyticsInitProvider extends h {
    static boolean a() {
        boolean zB;
        StringBuilder sb;
        String str;
        i iVarH = i.h();
        j jVarD = j.d();
        k kVarF = k.f();
        if (kVarF.b("crashlytics_auto_collection_enabled")) {
            zB = kVarF.d("crashlytics_auto_collection_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsCollectionEnabled via RNFBPreferences: ";
        } else if (iVarH.a("crashlytics_auto_collection_enabled")) {
            zB = iVarH.d("crashlytics_auto_collection_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsCollectionEnabled via RNFBJSON: ";
        } else {
            zB = jVarD.b("crashlytics_auto_collection_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsCollectionEnabled via RNFBMeta: ";
        }
        sb.append(str);
        sb.append(zB);
        Log.d("RNFBCrashlyticsInit", sb.toString());
        Log.d("RNFBCrashlyticsInit", "isCrashlyticsCollectionEnabled final value: " + zB);
        return zB;
    }

    static boolean b() {
        boolean zB;
        StringBuilder sb;
        String str;
        i iVarH = i.h();
        j jVarD = j.d();
        k kVarF = k.f();
        if (kVarF.b("crashlytics_javascript_exception_handler_chaining_enabled")) {
            zB = kVarF.d("crashlytics_javascript_exception_handler_chaining_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBPreferences: ";
        } else if (iVarH.a("crashlytics_javascript_exception_handler_chaining_enabled")) {
            zB = iVarH.d("crashlytics_javascript_exception_handler_chaining_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBJSON: ";
        } else {
            zB = jVarD.b("crashlytics_javascript_exception_handler_chaining_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBMeta: ";
        }
        sb.append(str);
        sb.append(zB);
        Log.d("RNFBCrashlyticsInit", sb.toString());
        Log.d("RNFBCrashlyticsInit", "isCrashlyticsJavascriptExceptionHandlerChainingEnabled final value: " + zB);
        return zB;
    }

    static boolean c() {
        boolean zB;
        StringBuilder sb;
        String str;
        i iVarH = i.h();
        j jVarD = j.d();
        k kVarF = k.f();
        if (kVarF.b("crashlytics_is_error_generation_on_js_crash_enabled")) {
            zB = kVarF.d("crashlytics_is_error_generation_on_js_crash_enabled", true);
            sb = new StringBuilder();
            str = "isErrorGenerationOnJSCrashEnabled via RNFBPreferences: ";
        } else if (iVarH.a("crashlytics_is_error_generation_on_js_crash_enabled")) {
            zB = iVarH.d("crashlytics_is_error_generation_on_js_crash_enabled", true);
            sb = new StringBuilder();
            str = "isErrorGenerationOnJSCrashEnabled via RNFBJSON: ";
        } else {
            zB = jVarD.b("crashlytics_is_error_generation_on_js_crash_enabled", true);
            sb = new StringBuilder();
            str = "isErrorGenerationOnJSCrashEnabled via RNFBMeta: ";
        }
        sb.append(str);
        sb.append(zB);
        Log.d("RNFBCrashlyticsInit", sb.toString());
        Log.d("RNFBCrashlyticsInit", "isErrorGenerationOnJSCrashEnabled final value: " + zB);
        return zB;
    }

    @Override // g5.h, android.content.ContentProvider
    public boolean onCreate() {
        super.onCreate();
        try {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(a());
            Log.i("RNFBCrashlyticsInit", "initialization successful");
            return true;
        } catch (Exception e7) {
            Log.e("RNFBCrashlyticsInit", "initialization failed", e7);
            return false;
        }
    }
}
