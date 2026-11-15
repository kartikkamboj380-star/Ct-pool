package e2;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop;

/* JADX INFO: renamed from: e2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1621c implements InterfaceC1620b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f19168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f19169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f19170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f19171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f19172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f19173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f19174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f19175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f19176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f19177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f19178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f19179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f19180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f19181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f19182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f19183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f19184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f19185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f19186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Boolean f19187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Boolean f19188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f19189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f19190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Boolean f19191x;

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean allowCollapsableChildren() {
        Boolean boolValueOf = this.f19169b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.allowCollapsableChildren());
            this.f19169b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean allowRecursiveCommitsWithSynchronousMountOnAndroid() {
        Boolean boolValueOf = this.f19170c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.allowRecursiveCommitsWithSynchronousMountOnAndroid());
            this.f19170c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        Boolean boolValueOf = this.f19171d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.batchRenderingUpdatesInEventLoop());
            this.f19171d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = this.f19168a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.f19168a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean destroyFabricSurfacesInReactInstanceManager() {
        Boolean boolValueOf = this.f19172e;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.destroyFabricSurfacesInReactInstanceManager());
            this.f19172e = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBackgroundExecutor() {
        Boolean boolValueOf = this.f19173f;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBackgroundExecutor());
            this.f19173f = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCleanTextInputYogaNode() {
        Boolean boolValueOf = this.f19174g;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCleanTextInputYogaNode());
            this.f19174g = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        Boolean boolValueOf = this.f19175h;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableGranularShadowTreeStateReconciliation());
            this.f19175h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        Boolean boolValueOf = this.f19176i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMicrotasks());
            this.f19176i = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean boolValueOf = this.f19177j;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.f19177j = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean boolValueOf = this.f19178k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.f19178k = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak() {
        Boolean boolValueOf = this.f19179l;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak());
            this.f19179l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean forceBatchingMountItemsOnAndroid() {
        Boolean boolValueOf = this.f19180m;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.forceBatchingMountItemsOnAndroid());
            this.f19180m = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledDebug() {
        Boolean boolValueOf = this.f19181n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledDebug());
            this.f19181n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = this.f19182o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.f19182o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean boolValueOf = this.f19183p;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.f19183p = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventDoubleTextMeasure() {
        Boolean boolValueOf = this.f19184q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.preventDoubleTextMeasure());
            this.f19184q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean setAndroidLayoutDirection() {
        Boolean boolValueOf = this.f19185r;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.setAndroidLayoutDirection());
            this.f19185r = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean boolValueOf = this.f19186s;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useImmediateExecutorInAndroidBridgeless());
            this.f19186s = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        Boolean boolValueOf = this.f19187t;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useModernRuntimeScheduler());
            this.f19187t = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = this.f19188u;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.f19188u = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean boolValueOf = this.f19189v;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdate());
            this.f19189v = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        Boolean boolValueOf = this.f19190w;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdateOnLayout());
            this.f19190w = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // e2.InterfaceC1620b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useStateAlignmentMechanism() {
        Boolean boolValueOf = this.f19191x;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useStateAlignmentMechanism());
            this.f19191x = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
