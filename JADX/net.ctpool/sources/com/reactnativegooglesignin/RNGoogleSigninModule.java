package com.reactnativegooglesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.AccountType;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import k3.AbstractC1820c;
import z3.AbstractC2272l;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
public class RNGoogleSigninModule extends NativeGoogleSigninSpec {
    public static final String PLAY_SERVICES_NOT_AVAILABLE = "PLAY_SERVICES_NOT_AVAILABLE";
    public static final int RC_SIGN_IN = 9001;
    public static final int REQUEST_CODE_ADD_SCOPES = 53295;
    public static final int REQUEST_CODE_RECOVER_AUTH = 53294;
    private static final String SHOULD_RECOVER = "SHOULD_RECOVER";
    private com.google.android.gms.auth.api.signin.b _apiClient;
    private com.reactnativegooglesignin.b pendingAuthRecovery;
    private final com.reactnativegooglesignin.c signInOrAddScopesPromiseWrapper;
    private final com.reactnativegooglesignin.c silentSignInPromiseWrapper;
    private final com.reactnativegooglesignin.c tokenClearingPromiseWrapper;
    private final com.reactnativegooglesignin.c tokenRetrievalPromiseWrapper;

    private static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f18311a;

        a(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f18311a = new WeakReference(rNGoogleSigninModule);
        }

        private void a(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap) {
            Activity currentActivity = rNGoogleSigninModule.getCurrentActivity();
            if (currentActivity != null) {
                rNGoogleSigninModule.pendingAuthRecovery = new com.reactnativegooglesignin.b(writableMap);
                currentActivity.startActivityForResult(((UserRecoverableAuthException) exc).a(), RNGoogleSigninModule.REQUEST_CODE_RECOVER_AUTH);
                return;
            }
            rNGoogleSigninModule.pendingAuthRecovery = null;
            rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().c("Cannot attempt recovery auth because app is not in foreground. " + exc.getLocalizedMessage());
        }

        private void c(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap, WritableMap writableMap2) {
            if ((exc instanceof UserRecoverableAuthException) && writableMap2 != null && writableMap2.hasKey(RNGoogleSigninModule.SHOULD_RECOVER) && writableMap2.getBoolean(RNGoogleSigninModule.SHOULD_RECOVER)) {
                a(rNGoogleSigninModule, exc, writableMap);
            } else {
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().b(exc);
            }
        }

        private void d(RNGoogleSigninModule rNGoogleSigninModule, WritableMap writableMap) {
            writableMap.putString("accessToken", h3.b.b(rNGoogleSigninModule.getReactApplicationContext(), new Account(writableMap.getMap("user").getString(Scopes.EMAIL), AccountType.GOOGLE), o.e(writableMap.getArray("scopes"))));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(WritableMap... writableMapArr) {
            WritableMap writableMap = writableMapArr[0];
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f18311a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            try {
                d(rNGoogleSigninModule, writableMap);
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().g(writableMap);
            } catch (Exception e7) {
                c(rNGoogleSigninModule, e7, writableMap, writableMapArr.length >= 2 ? writableMapArr[1] : null);
            }
            return null;
        }
    }

    private class b extends BaseActivityEventListener {
        private b() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i7, int i8, Intent intent) {
            com.reactnativegooglesignin.c cVar;
            String str;
            if (i7 == 9001) {
                AbstractC2272l abstractC2272lC = com.google.android.gms.auth.api.signin.a.c(intent);
                RNGoogleSigninModule rNGoogleSigninModule = RNGoogleSigninModule.this;
                rNGoogleSigninModule.handleSignInTaskResult(abstractC2272lC, rNGoogleSigninModule.signInOrAddScopesPromiseWrapper);
                return;
            }
            if (i7 == 53294) {
                RNGoogleSigninModule rNGoogleSigninModule2 = RNGoogleSigninModule.this;
                if (i8 == -1) {
                    rNGoogleSigninModule2.rerunFailedAuthTokenTask();
                    return;
                } else {
                    cVar = rNGoogleSigninModule2.tokenRetrievalPromiseWrapper;
                    str = "Failed authentication recovery attempt, probably user-rejected.";
                }
            } else {
                if (i7 != 53295) {
                    return;
                }
                cVar = RNGoogleSigninModule.this.signInOrAddScopesPromiseWrapper;
                if (i8 == -1) {
                    cVar.g(Boolean.TRUE);
                    return;
                }
                str = "Failed to add scopes.";
            }
            cVar.c(str);
        }
    }

    private static class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f18313a;

        c(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f18313a = new WeakReference(rNGoogleSigninModule);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f18313a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            com.reactnativegooglesignin.c tokenClearingPromiseWrapper = rNGoogleSigninModule.getTokenClearingPromiseWrapper();
            try {
                h3.b.a(rNGoogleSigninModule.getReactApplicationContext(), strArr[0]);
                tokenClearingPromiseWrapper.g(null);
            } catch (Exception e7) {
                tokenClearingPromiseWrapper.b(e7);
            }
            return null;
        }
    }

    public RNGoogleSigninModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.signInOrAddScopesPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        this.silentSignInPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        this.tokenRetrievalPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        this.tokenClearingPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        reactApplicationContext.addActivityEventListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSignInTaskResult(AbstractC2272l abstractC2272l, com.reactnativegooglesignin.c cVar) {
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) abstractC2272l.m(ApiException.class);
            if (googleSignInAccount == null) {
                cVar.c("GoogleSignInAccount instance was null");
            } else {
                cVar.g(o.d(googleSignInAccount));
            }
        } catch (ApiException e7) {
            cVar.b(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleSignOutOrRevokeAccessTask, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$signOut$3(AbstractC2272l abstractC2272l, Promise promise) {
        if (abstractC2272l.p()) {
            promise.resolve(null);
            return;
        }
        int iB = o.b(abstractC2272l);
        promise.reject(String.valueOf(iB), AbstractC1820c.getStatusCodeString(iB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signIn$2(Activity activity) {
        activity.startActivityForResult(this._apiClient.c(), RC_SIGN_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$0(AbstractC2272l abstractC2272l) {
        handleSignInTaskResult(abstractC2272l, this.silentSignInPromiseWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$1() {
        AbstractC2272l abstractC2272lF = this._apiClient.f();
        if (abstractC2272lF.p()) {
            handleSignInTaskResult(abstractC2272lF, this.silentSignInPromiseWrapper);
        } else {
            abstractC2272lF.c(new InterfaceC2266f() { // from class: com.reactnativegooglesignin.f
                @Override // z3.InterfaceC2266f
                public final void a(AbstractC2272l abstractC2272l) {
                    this.f18320a.lambda$signInSilently$0(abstractC2272l);
                }
            });
        }
    }

    static void rejectWithNullActivity(Promise promise) {
        promise.reject(NativeGoogleSigninSpec.NAME, "activity is null");
    }

    private void rejectWithNullClientError(Promise promise) {
        promise.reject(NativeGoogleSigninSpec.NAME, "apiClient is null - call configure() first");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rerunFailedAuthTokenTask() {
        WritableMap writableMapA = this.pendingAuthRecovery.a();
        if (writableMapA != null) {
            new a(this).execute(writableMapA, null);
        } else {
            this.tokenRetrievalPromiseWrapper.c("rerunFailedAuthTokenTask: recovery failed");
        }
    }

    private void startTokenRetrievalTaskWithRecovery(GoogleSignInAccount googleSignInAccount) {
        WritableMap writableMapD = o.d(googleSignInAccount);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(SHOULD_RECOVER, true);
        new a(this).execute(writableMapD, writableMapCreateMap);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void addScopes(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
            return;
        }
        GoogleSignInAccount googleSignInAccountB = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (googleSignInAccountB == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "addScopes");
            com.google.android.gms.auth.api.signin.a.d(currentActivity, REQUEST_CODE_ADD_SCOPES, googleSignInAccountB, o.a(readableMap.getArray("scopes")));
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void clearCachedAccessToken(String str, Promise promise) {
        this.tokenClearingPromiseWrapper.h(promise, "clearCachedAccessToken");
        new c(this).execute(str);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        this._apiClient = com.google.android.gms.auth.api.signin.a.a(getReactApplicationContext(), o.c(o.a(readableMap.hasKey("scopes") ? readableMap.getArray("scopes") : Arguments.createArray()), readableMap.hasKey("webClientId") ? readableMap.getString("webClientId") : null, readableMap.hasKey("offlineAccess") && readableMap.getBoolean("offlineAccess"), readableMap.hasKey("forceCodeForRefreshToken") && readableMap.getBoolean("forceCodeForRefreshToken"), readableMap.hasKey("accountName") ? readableMap.getString("accountName") : null, readableMap.hasKey("hostedDomain") ? readableMap.getString("hostedDomain") : null));
        promise.resolve(null);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCurrentUser() {
        GoogleSignInAccount googleSignInAccountB = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (googleSignInAccountB == null) {
            return null;
        }
        return o.d(googleSignInAccountB);
    }

    public com.reactnativegooglesignin.c getTokenClearingPromiseWrapper() {
        return this.tokenClearingPromiseWrapper;
    }

    public com.reactnativegooglesignin.c getTokenRetrievalPromiseWrapper() {
        return this.tokenRetrievalPromiseWrapper;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void getTokens(Promise promise) {
        GoogleSignInAccount googleSignInAccountB = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (googleSignInAccountB == null) {
            promise.reject("getTokens", "getTokens requires a user to be signed in");
        } else {
            this.tokenRetrievalPromiseWrapper.h(promise, "getTokens");
            startTokenRetrievalTaskWithRecovery(googleSignInAccountB);
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    protected Map<String, Object> getTypedExportedConstants() {
        HashMap map = new HashMap();
        map.put("BUTTON_SIZE_ICON", 2);
        map.put("BUTTON_SIZE_STANDARD", 0);
        map.put("BUTTON_SIZE_WIDE", 1);
        map.put("SIGN_IN_CANCELLED", String.valueOf(12501));
        map.put("SIGN_IN_REQUIRED", String.valueOf(4));
        map.put("SCOPES_ALREADY_GRANTED", "NEVER_HAPPENS_ON_ANDROID");
        map.put("ONE_TAP_START_FAILED", "ONE_TAP_START_FAILED");
        map.put("NO_SAVED_CREDENTIAL_FOUND", "NO_SAVED_CREDENTIAL_FOUND");
        map.put("IN_PROGRESS", "ASYNC_OP_IN_PROGRESS");
        map.put(PLAY_SERVICES_NOT_AVAILABLE, PLAY_SERVICES_NOT_AVAILABLE);
        return map;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasPreviousSignIn() {
        return com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext()) != null;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void playServicesAvailable(boolean z6, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.w(NativeGoogleSigninSpec.NAME, "could not determine playServicesAvailable, activity is null");
            rejectWithNullActivity(promise);
            return;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(currentActivity);
        if (iIsGooglePlayServicesAvailable == 0) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        if (z6 && googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            googleApiAvailability.getErrorDialog(currentActivity, iIsGooglePlayServicesAvailable, 2404).show();
        }
        promise.reject(PLAY_SERVICES_NOT_AVAILABLE, "Play services not available");
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void revokeAccess(final Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.d().c(new InterfaceC2266f() { // from class: com.reactnativegooglesignin.i
                @Override // z3.InterfaceC2266f
                public final void a(AbstractC2272l abstractC2272l) {
                    this.f18325a.lambda$revokeAccess$4(promise, abstractC2272l);
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signIn(ReadableMap readableMap, Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "signIn");
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativegooglesignin.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18323m.lambda$signIn$2(currentActivity);
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signInSilently(Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
        } else {
            this.silentSignInPromiseWrapper.h(promise, "signInSilently");
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativegooglesignin.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18327m.lambda$signInSilently$1();
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signOut(final Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.e().c(new InterfaceC2266f() { // from class: com.reactnativegooglesignin.g
                @Override // z3.InterfaceC2266f
                public final void a(AbstractC2272l abstractC2272l) {
                    this.f18321a.lambda$signOut$3(promise, abstractC2272l);
                }
            });
        }
    }
}
