package com.facebook.react.modules.fresco;

import T5.w;
import T5.z;
import c1.c;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.e;
import com.facebook.react.modules.network.h;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import i2.InterfaceC1741a;
import java.util.HashSet;
import p2.C1963b;
import u1.C2125a;
import y1.k;
import y1.l;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = FrescoModule.NAME, needsEagerInit = true)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private l mConfig;
    private k mImagePipeline;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, (l) null);
    }

    private static l getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).a();
    }

    public static l.a getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new C1963b());
        z zVarA = h.a();
        ((com.facebook.react.modules.network.a) zVarA.p()).c(new w(new e(reactContext)));
        return C2125a.a(reactContext.getApplicationContext(), zVarA).R(new a(zVarA)).P(false).S(hashSet);
    }

    private k getImagePipeline() {
        if (this.mImagePipeline == null) {
            this.mImagePipeline = c.a();
        }
        return this.mImagePipeline;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        getImagePipeline().c();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(reactApplicationContext);
            }
            c.e(reactApplicationContext.getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            P0.a.G("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            getImagePipeline().e();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, k kVar, boolean z6) {
        this(reactApplicationContext, kVar, z6, false);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, k kVar, boolean z6, boolean z7) {
        this(reactApplicationContext, z6);
        this.mImagePipeline = kVar;
        if (z7) {
            sHasBeenInitialized = true;
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z6) {
        this(reactApplicationContext, z6, (l) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z6, l lVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z6;
        this.mConfig = lVar;
    }
}
