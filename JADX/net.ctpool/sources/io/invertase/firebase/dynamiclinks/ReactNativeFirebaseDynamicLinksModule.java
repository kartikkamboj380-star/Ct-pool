package io.invertase.firebase.dynamiclinks;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.common.internal.ImagesContract;
import g5.C1698b;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.Objects;
import java.util.concurrent.Callable;
import t4.AbstractC2067b;
import t4.C2066a;
import t4.C2068c;
import t4.InterfaceC2069d;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseDynamicLinksModule extends ReactNativeFirebaseModule implements ActivityEventListener, LifecycleEventListener {
    private static final String SHORT_LINK_TYPE_SHORT = "SHORT";
    private static final String SHORT_LINK_TYPE_UNGUESSABLE = "UNGUESSABLE";
    private static final String TAG = "DynamicLinks";
    private boolean gotInitialLink;
    private boolean hostResumed;
    private int initialLinkMinimumVersion;
    private String initialLinkUrl;
    private Promise initialPromise;
    private boolean launchedFromHistory;

    ReactNativeFirebaseDynamicLinksModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.initialLinkUrl = null;
        this.initialLinkMinimumVersion = 0;
        this.gotInitialLink = false;
        this.hostResumed = false;
        this.launchedFromHistory = false;
        this.initialPromise = null;
        getReactApplicationContext().addActivityEventListener(this);
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    private void buildAnalyticsParameters(ReadableMap readableMap, C2066a.c cVar) {
        if (readableMap == null) {
            return;
        }
        C2066a.d.C0315a c0315a = new C2066a.d.C0315a();
        if (readableMap.hasKey("campaign")) {
            c0315a.b(readableMap.getString("campaign"));
        }
        if (readableMap.hasKey("content")) {
            c0315a.c(readableMap.getString("content"));
        }
        if (readableMap.hasKey("medium")) {
            c0315a.d(readableMap.getString("medium"));
        }
        if (readableMap.hasKey("source")) {
            c0315a.e(readableMap.getString("source"));
        }
        if (readableMap.hasKey("term")) {
            c0315a.f(readableMap.getString("term"));
        }
        cVar.f(c0315a.a());
    }

    private void buildAndroidParameters(ReadableMap readableMap, C2066a.c cVar) {
        if (readableMap == null) {
            return;
        }
        String string = readableMap.getString("packageName");
        Objects.requireNonNull(string);
        C2066a.b.C0314a c0314a = new C2066a.b.C0314a(string);
        if (readableMap.hasKey("fallbackUrl")) {
            c0314a.b(Uri.parse(readableMap.getString("fallbackUrl")));
        }
        if (readableMap.hasKey("minimumVersion")) {
            String string2 = readableMap.getString("minimumVersion");
            Objects.requireNonNull(string2);
            c0314a.c(Integer.parseInt(string2));
        }
        cVar.d(c0314a.a());
    }

    private void buildIosParameters(ReadableMap readableMap, C2066a.c cVar) {
        if (readableMap == null) {
            return;
        }
        String string = readableMap.getString("bundleId");
        Objects.requireNonNull(string);
        C2066a.e.C0316a c0316a = new C2066a.e.C0316a(string);
        if (readableMap.hasKey("appStoreId")) {
            c0316a.b(readableMap.getString("appStoreId"));
        }
        if (readableMap.hasKey("customScheme")) {
            c0316a.c(readableMap.getString("customScheme"));
        }
        if (readableMap.hasKey("fallbackUrl")) {
            c0316a.d(Uri.parse(readableMap.getString("fallbackUrl")));
        }
        if (readableMap.hasKey("iPadBundleId")) {
            c0316a.e(readableMap.getString("iPadBundleId"));
        }
        if (readableMap.hasKey("iPadFallbackUrl")) {
            c0316a.f(Uri.parse(readableMap.getString("iPadFallbackUrl")));
        }
        if (readableMap.hasKey("minimumVersion")) {
            c0316a.g(readableMap.getString("minimumVersion"));
        }
        cVar.g(c0316a.a());
    }

    private void buildItunesParameters(ReadableMap readableMap, C2066a.c cVar) {
        if (readableMap == null) {
            return;
        }
        C2066a.f.C0317a c0317a = new C2066a.f.C0317a();
        if (readableMap.hasKey("affiliateToken")) {
            c0317a.b(readableMap.getString("affiliateToken"));
        }
        if (readableMap.hasKey("campaignToken")) {
            c0317a.c(readableMap.getString("campaignToken"));
        }
        if (readableMap.hasKey("providerToken")) {
            c0317a.d(readableMap.getString("providerToken"));
        }
        cVar.h(c0317a.a());
    }

    private void buildNavigationParameters(ReadableMap readableMap, C2066a.c cVar) {
        if (readableMap == null) {
            return;
        }
        C2066a.g.C0318a c0318a = new C2066a.g.C0318a();
        if (readableMap.hasKey("forcedRedirectEnabled")) {
            c0318a.b(readableMap.getBoolean("forcedRedirectEnabled"));
        }
        cVar.k(c0318a.a());
    }

    private void buildSocialParameters(ReadableMap readableMap, C2066a.c cVar) {
        if (readableMap == null) {
            return;
        }
        C2066a.h.C0319a c0319a = new C2066a.h.C0319a();
        if (readableMap.hasKey("descriptionText")) {
            c0319a.b(readableMap.getString("descriptionText"));
        }
        if (readableMap.hasKey("imageUrl")) {
            c0319a.c(Uri.parse(readableMap.getString("imageUrl")));
        }
        if (readableMap.hasKey("title")) {
            c0319a.d(readableMap.getString("title"));
        }
        cVar.l(c0319a.a());
    }

    private C2066a.c createDynamicLinkBuilder(ReadableMap readableMap) {
        C2066a.c cVarA = AbstractC2067b.d().a();
        cVarA.i(Uri.parse(readableMap.getString("link")));
        String string = readableMap.getString("domainUriPrefix");
        Objects.requireNonNull(string);
        cVarA.e(string);
        if (readableMap.hasKey("ios")) {
            buildIosParameters(readableMap.getMap("ios"), cVarA);
        }
        if (readableMap.hasKey("itunes")) {
            buildItunesParameters(readableMap.getMap("itunes"), cVarA);
        }
        if (readableMap.hasKey("social")) {
            buildSocialParameters(readableMap.getMap("social"), cVarA);
        }
        if (readableMap.hasKey("android")) {
            buildAndroidParameters(readableMap.getMap("android"), cVarA);
        }
        if (readableMap.hasKey("analytics")) {
            buildAnalyticsParameters(readableMap.getMap("analytics"), cVarA);
        }
        if (readableMap.hasKey("navigation")) {
            buildNavigationParameters(readableMap.getMap("navigation"), cVarA);
        }
        if (readableMap.hasKey("otherPlatform") && readableMap.getMap("otherPlatform").hasKey("fallbackUrl")) {
            cVarA.j(Uri.parse(String.valueOf(cVarA.a().a()) + "&ofl=" + readableMap.getMap("otherPlatform").getString("fallbackUrl")));
        }
        return cVarA;
    }

    private WritableMap dynamicLinkToWritableMap(String str, int i7, WritableMap writableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(ImagesContract.URL, str);
        if (i7 == 0) {
            writableMapCreateMap.putNull("minimumAppVersion");
        } else {
            writableMapCreateMap.putInt("minimumAppVersion", i7);
        }
        writableMapCreateMap.putMap("utmParameters", writableMap);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$buildLink$0(ReadableMap readableMap) {
        return createDynamicLinkBuilder(readableMap).a().a().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buildLink$1(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            Log.e(TAG, "RNFB: Unknown error while building Dynamic Link ", abstractC2272l.k());
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "build-failed", abstractC2272l.k().getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC2069d lambda$buildShortLink$2(ReadableMap readableMap, String str) {
        AbstractC2272l abstractC2272lB;
        int i7;
        C2066a.c cVarCreateDynamicLinkBuilder = createDynamicLinkBuilder(readableMap);
        if (SHORT_LINK_TYPE_SHORT.equals(str)) {
            i7 = 2;
        } else {
            if (!SHORT_LINK_TYPE_UNGUESSABLE.equals(str)) {
                abstractC2272lB = cVarCreateDynamicLinkBuilder.b();
                return (InterfaceC2069d) AbstractC2275o.a(abstractC2272lB);
            }
            i7 = 1;
        }
        abstractC2272lB = cVarCreateDynamicLinkBuilder.c(i7);
        return (InterfaceC2069d) AbstractC2275o.a(abstractC2272lB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buildShortLink$3(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(((InterfaceC2069d) abstractC2272l.l()).f().toString());
            return;
        }
        Log.e(TAG, "RNFB: Unknown error while building Dynamic Link " + abstractC2272l.k().getMessage());
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "build-failed", abstractC2272l.k().getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getInitialLink$4(Promise promise, AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.p()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "initial-link-error", abstractC2272l.k().getMessage());
            return;
        }
        this.gotInitialLink = true;
        C2068c c2068c = (C2068c) abstractC2272l.l();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (c2068c != null) {
            this.initialLinkUrl = c2068c.a().toString();
            this.initialLinkMinimumVersion = c2068c.b();
            writableNativeMap = Arguments.makeNativeMap(c2068c.c());
        }
        String str = this.initialLinkUrl;
        promise.resolve((str == null || this.launchedFromHistory) ? null : dynamicLinkToWritableMap(str, this.initialLinkMinimumVersion, writableNativeMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewIntent$6(AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.p()) {
            Log.e(TAG, "RNFB: An unknown exception occurred calling getDynamicLink", abstractC2272l.k());
            return;
        }
        C2068c c2068c = (C2068c) abstractC2272l.l();
        if (c2068c != null) {
            g5.g.i().o(new C1698b("dynamic_links_link_received", dynamicLinkToWritableMap(c2068c.a().toString(), c2068c.b(), Arguments.makeNativeMap(c2068c.c()))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveLink$5(Promise promise, AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.p()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "resolve-link-error", abstractC2272l.k().getMessage());
            return;
        }
        C2068c c2068c = (C2068c) abstractC2272l.l();
        if (c2068c == null || c2068c.a() == null || c2068c.a().toString() == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "not-found", "Dynamic link not found");
        } else {
            promise.resolve(dynamicLinkToWritableMap(c2068c.a().toString(), c2068c.b(), Arguments.makeNativeMap(c2068c.c())));
        }
    }

    @ReactMethod
    public void buildLink(final ReadableMap readableMap, final Promise promise) {
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.dynamiclinks.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20114a.lambda$buildLink$0(readableMap);
            }
        }).b(getExecutor(), new InterfaceC2266f() { // from class: io.invertase.firebase.dynamiclinks.d
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseDynamicLinksModule.lambda$buildLink$1(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void buildShortLink(final ReadableMap readableMap, final String str, final Promise promise) {
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.dynamiclinks.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20119a.lambda$buildShortLink$2(readableMap, str);
            }
        }).b(getExecutor(), new InterfaceC2266f() { // from class: io.invertase.firebase.dynamiclinks.g
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseDynamicLinksModule.lambda$buildShortLink$3(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void getInitialLink(final Promise promise) {
        if (this.gotInitialLink) {
            promise.resolve(null);
            return;
        }
        if (!this.hostResumed) {
            this.initialPromise = promise;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
            return;
        }
        Intent intent = currentActivity.getIntent();
        if (intent == null) {
            promise.resolve(null);
        } else {
            this.launchedFromHistory = (intent.getFlags() & 1048576) != 0;
            AbstractC2067b.d().b(intent).c(new InterfaceC2266f() { // from class: io.invertase.firebase.dynamiclinks.b
                @Override // z3.InterfaceC2266f
                public final void a(AbstractC2272l abstractC2272l) {
                    this.f20112a.lambda$getInitialLink$4(promise, abstractC2272l);
                }
            });
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeActivityEventListener(this);
        getReactApplicationContext().addLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i7, int i8, Intent intent) {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.initialLinkUrl = null;
        this.gotInitialLink = false;
        this.initialLinkMinimumVersion = 0;
        this.launchedFromHistory = false;
        this.initialPromise = null;
        this.hostResumed = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.hostResumed = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.hostResumed = true;
        Promise promise = this.initialPromise;
        if (promise != null) {
            getInitialLink(promise);
            this.initialPromise = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        AbstractC2067b.d().b(intent).c(new InterfaceC2266f() { // from class: io.invertase.firebase.dynamiclinks.a
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                this.f20111a.lambda$onNewIntent$6(abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void resolveLink(String str, final Promise promise) {
        try {
            AbstractC2067b.d().c(Uri.parse(str)).c(new InterfaceC2266f() { // from class: io.invertase.firebase.dynamiclinks.e
                @Override // z3.InterfaceC2266f
                public final void a(AbstractC2272l abstractC2272l) {
                    this.f20117a.lambda$resolveLink$5(promise, abstractC2272l);
                }
            });
        } catch (Exception unused) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "resolve-link-error", "Unknown resolve failure");
        }
    }
}
