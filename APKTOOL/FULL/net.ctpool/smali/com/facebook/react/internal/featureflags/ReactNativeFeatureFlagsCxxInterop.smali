.class public final Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;

    invoke-direct {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;-><init>()V

    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->a:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;

    const-string v0, "react_featureflagsjni"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native allowCollapsableChildren()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native allowRecursiveCommitsWithSynchronousMountOnAndroid()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native batchRenderingUpdatesInEventLoop()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native commonTestFlag()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native dangerouslyReset()V
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native destroyFabricSurfacesInReactInstanceManager()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native enableBackgroundExecutor()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native enableCleanTextInputYogaNode()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native enableGranularShadowTreeStateReconciliation()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native enableMicrotasks()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native enableSynchronousStateUpdates()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native enableUIConsistency()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native forceBatchingMountItemsOnAndroid()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native fuseboxEnabledDebug()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native fuseboxEnabledRelease()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native lazyAnimationCallbacks()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native override(Ljava/lang/Object;)V
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native preventDoubleTextMeasure()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native setAndroidLayoutDirection()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native useImmediateExecutorInAndroidBridgeless()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native useModernRuntimeScheduler()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native useNativeViewConfigsInBridgelessMode()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native useRuntimeShadowNodeReferenceUpdate()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native useRuntimeShadowNodeReferenceUpdateOnLayout()Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final native useStateAlignmentMechanism()Z
    .annotation build LR1/a;
    .end annotation
.end method
