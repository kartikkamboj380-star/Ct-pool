package com.facebook.react.modules.appstate;

import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import i2.InterfaceC1741a;
import i5.q;
import j5.AbstractC1787F;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "AppState")
public final class AppStateModule extends NativeAppStateSpec implements LifecycleEventListener, WindowFocusChangeListener {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    public static final a Companion = new a(null);
    private static final String INITIAL_STATE = "initialAppState";
    public static final String NAME = "AppState";
    private String appState;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.addWindowFocusChangeListener(this);
        this.appState = reactApplicationContext.getLifecycleState() == LifecycleState.f11401o ? APP_STATE_ACTIVE : APP_STATE_BACKGROUND;
    }

    private final WritableMap createAppStateEventMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("app_state", this.appState);
        k.e(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    private final void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private final void sendEvent(String str, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, obj);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void getCurrentAppState(Callback callback, Callback callback2) {
        k.f(callback, "success");
        callback.invoke(createAppStateEventMap());
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public Map<String, Object> getTypedExportedConstants() {
        return AbstractC1787F.e(q.a(INITIAL_STATE, this.appState));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.appState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.appState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.WindowFocusChangeListener
    public void onWindowFocusChange(boolean z6) {
        sendEvent("appStateFocusChange", Boolean.valueOf(z6));
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void removeListeners(double d7) {
    }
}
