package com.reactnativegooglesignin;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeGoogleSigninSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RNGoogleSignin";

    public NativeGoogleSigninSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @R1.a
    @ReactMethod
    public abstract void addScopes(ReadableMap readableMap, Promise promise);

    @R1.a
    @ReactMethod
    public abstract void clearCachedAccessToken(String str, Promise promise);

    @R1.a
    @ReactMethod
    public abstract void configure(ReadableMap readableMap, Promise promise);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @R1.a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getCurrentUser();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @R1.a
    @ReactMethod
    public abstract void getTokens(Promise promise);

    protected abstract Map<String, Object> getTypedExportedConstants();

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean hasPreviousSignIn();

    @R1.a
    @ReactMethod
    public abstract void playServicesAvailable(boolean z6, Promise promise);

    @R1.a
    @ReactMethod
    public abstract void revokeAccess(Promise promise);

    @R1.a
    @ReactMethod
    public abstract void signIn(ReadableMap readableMap, Promise promise);

    @R1.a
    @ReactMethod
    public abstract void signInSilently(Promise promise);

    @R1.a
    @ReactMethod
    public abstract void signOut(Promise promise);
}
