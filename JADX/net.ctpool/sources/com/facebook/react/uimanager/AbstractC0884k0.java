package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import y2.C2239a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0884k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12618a = "com.facebook.react.uimanager.k0";

    public static float[] a(Context context) {
        EditText editText = new EditText(context);
        return new float[]{G.b(androidx.core.view.H.G(editText)), G.b(androidx.core.view.H.F(editText)), G.b(editText.getPaddingTop()), G.b(editText.getPaddingBottom())};
    }

    public static com.facebook.react.uimanager.events.e b(ReactContext reactContext, int i7) {
        if (reactContext.isBridgeless()) {
            boolean z6 = reactContext instanceof C0872e0;
            Object objB = reactContext;
            if (z6) {
                objB = ((C0872e0) reactContext).b();
            }
            return ((com.facebook.react.uimanager.events.j) objB).getEventDispatcher();
        }
        UIManager uIManagerH = h(reactContext, i7, false);
        if (uIManagerH == null) {
            ReactSoftExceptionLogger.logSoftException(f12618a, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i7));
            return null;
        }
        com.facebook.react.uimanager.events.e eVar = (com.facebook.react.uimanager.events.e) uIManagerH.getEventDispatcher();
        if (eVar == null) {
            ReactSoftExceptionLogger.logSoftException(f12618a, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i7));
        }
        return eVar;
    }

    public static com.facebook.react.uimanager.events.e c(ReactContext reactContext, int i7) {
        com.facebook.react.uimanager.events.e eVarB = b(reactContext, C2239a.a(i7));
        if (eVarB == null) {
            ReactSoftExceptionLogger.logSoftException(f12618a, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i7));
        }
        return eVarB;
    }

    public static ReactContext d(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int e(Context context) {
        if (context instanceof C0872e0) {
            return ((C0872e0) context).c();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(View view) {
        if (view instanceof S) {
            S s6 = (S) view;
            if (s6.getUIManagerType() == 2) {
                return s6.getRootViewTag();
            }
            return -1;
        }
        int id = view.getId();
        if (C2239a.a(id) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof C0872e0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int iE = e(context);
        if (iE == -1) {
            ReactSoftExceptionLogger.logSoftException(f12618a, new IllegalStateException("Fabric View [" + id + "] does not have SurfaceId associated with it"));
        }
        return iE;
    }

    public static UIManager g(ReactContext reactContext, int i7) {
        return h(reactContext, i7, true);
    }

    private static UIManager h(ReactContext reactContext, int i7, boolean z6) {
        String str;
        ReactNoCrashSoftException reactNoCrashSoftException;
        if (reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            str = f12618a;
            reactNoCrashSoftException = new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet.");
        } else {
            if (reactContext.hasCatalystInstance()) {
                if (!reactContext.hasActiveReactInstance()) {
                    ReactSoftExceptionLogger.logSoftException(f12618a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
                    if (z6) {
                        return null;
                    }
                }
                CatalystInstance catalystInstance = reactContext.getCatalystInstance();
                try {
                    return i7 == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
                } catch (IllegalArgumentException unused) {
                    ReactSoftExceptionLogger.logSoftException(f12618a, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i7));
                    return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
                }
            }
            str = f12618a;
            reactNoCrashSoftException = new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance.");
        }
        ReactSoftExceptionLogger.logSoftException(str, reactNoCrashSoftException);
        return null;
    }

    public static UIManager i(ReactContext reactContext, int i7) {
        return g(reactContext, C2239a.a(i7));
    }
}
