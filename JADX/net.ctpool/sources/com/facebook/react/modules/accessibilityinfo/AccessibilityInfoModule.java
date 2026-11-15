package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.api.CommonStatusCodes;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeAccessibilityInfoSpec.NAME)
public final class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    private static final a Companion = new a(null);
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final AccessibilityManager accessibilityManager;
    private final b accessibilityServiceChangeListener;
    private boolean accessibilityServiceEnabled;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private int recommendedTimeout;
    private boolean reduceMotionEnabled;
    private boolean touchExplorationEnabled;
    private final c touchExplorationStateChangeListener;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z6) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(z6);
        }
    }

    private final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        public c() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z6) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z6);
        }
    }

    public static final class d extends ContentObserver {
        d(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            onChange(z6, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6, Uri uri) {
            if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                AccessibilityInfoModule.this.updateAndSendReduceMotionChangeEvent();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "context");
        this.animationScaleObserver = new d(UiThreadUtil.getUiThreadHandler());
        this.touchExplorationStateChangeListener = new c();
        this.accessibilityServiceChangeListener = new b();
        Object systemService = reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        k.e(contentResolver, "getContentResolver(...)");
        this.contentResolver = contentResolver;
        this.touchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        this.accessibilityServiceEnabled = accessibilityManager.isEnabled();
        this.reduceMotionEnabled = isReduceMotionEnabledValue();
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    private final boolean isReduceMotionEnabledValue() {
        String string = Settings.Global.getString(this.contentResolver, "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendAccessibilityServiceChangeEvent(boolean z6) {
        if (this.accessibilityServiceEnabled != z6) {
            this.accessibilityServiceEnabled = z6;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.accessibilityServiceEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendReduceMotionChangeEvent() {
        boolean zIsReduceMotionEnabledValue = isReduceMotionEnabledValue();
        if (this.reduceMotionEnabled != zIsReduceMotionEnabledValue) {
            this.reduceMotionEnabled = zIsReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.reduceMotionEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendTouchExplorationChangeEvent(boolean z6) {
        if (this.touchExplorationEnabled != z6) {
            this.touchExplorationEnabled = z6;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.touchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String str) {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(str);
        accessibilityEventObtain.setClassName(AccessibilityInfoModule.class.getName());
        accessibilityEventObtain.setPackageName(getReactApplicationContext().getPackageName());
        this.accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void getRecommendedTimeoutMillis(double d7, Callback callback) {
        k.f(callback, "successCallback");
        if (Build.VERSION.SDK_INT < 29) {
            callback.invoke(Integer.valueOf((int) d7));
            return;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        int recommendedTimeoutMillis = accessibilityManager != null ? accessibilityManager.getRecommendedTimeoutMillis((int) d7, 4) : 0;
        this.recommendedTimeout = recommendedTimeoutMillis;
        callback.invoke(Integer.valueOf(recommendedTimeoutMillis));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        boolean z6 = false;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null && accessibilityManager2.isEnabled()) {
            z6 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z6);
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isAccessibilityServiceEnabled(Callback callback) {
        k.f(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.accessibilityServiceEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback callback) {
        k.f(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.reduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback callback) {
        k.f(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.touchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void onHostPause() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.removeAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void onHostResume() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.addAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        boolean z6 = false;
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        AccessibilityManager accessibilityManager3 = this.accessibilityManager;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager3 != null && accessibilityManager3.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager4 = this.accessibilityManager;
        if (accessibilityManager4 != null && accessibilityManager4.isEnabled()) {
            z6 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z6);
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double d7) {
    }
}
