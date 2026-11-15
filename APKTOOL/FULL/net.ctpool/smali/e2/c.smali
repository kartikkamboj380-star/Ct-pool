.class public final Le2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le2/b;


# instance fields
.field private a:Ljava/lang/Boolean;

.field private b:Ljava/lang/Boolean;

.field private c:Ljava/lang/Boolean;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/Boolean;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/lang/Boolean;

.field private h:Ljava/lang/Boolean;

.field private i:Ljava/lang/Boolean;

.field private j:Ljava/lang/Boolean;

.field private k:Ljava/lang/Boolean;

.field private l:Ljava/lang/Boolean;

.field private m:Ljava/lang/Boolean;

.field private n:Ljava/lang/Boolean;

.field private o:Ljava/lang/Boolean;

.field private p:Ljava/lang/Boolean;

.field private q:Ljava/lang/Boolean;

.field private r:Ljava/lang/Boolean;

.field private s:Ljava/lang/Boolean;

.field private t:Ljava/lang/Boolean;

.field private u:Ljava/lang/Boolean;

.field private v:Ljava/lang/Boolean;

.field private w:Ljava/lang/Boolean;

.field private x:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public allowCollapsableChildren()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->b:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->allowCollapsableChildren()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->b:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public allowRecursiveCommitsWithSynchronousMountOnAndroid()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->allowRecursiveCommitsWithSynchronousMountOnAndroid()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->c:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public batchRenderingUpdatesInEventLoop()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->batchRenderingUpdatesInEventLoop()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->d:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public commonTestFlag()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->a:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->commonTestFlag()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->a:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public destroyFabricSurfacesInReactInstanceManager()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->destroyFabricSurfacesInReactInstanceManager()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->e:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public enableBackgroundExecutor()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->f:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->enableBackgroundExecutor()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->f:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public enableCleanTextInputYogaNode()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->g:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->enableCleanTextInputYogaNode()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->g:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public enableGranularShadowTreeStateReconciliation()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->h:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->enableGranularShadowTreeStateReconciliation()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->h:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public enableMicrotasks()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->i:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->enableMicrotasks()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->i:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public enableSynchronousStateUpdates()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->j:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->enableSynchronousStateUpdates()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->j:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public enableUIConsistency()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->k:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->enableUIConsistency()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->k:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->l:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->l:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public forceBatchingMountItemsOnAndroid()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->forceBatchingMountItemsOnAndroid()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->m:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public fuseboxEnabledDebug()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->n:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->fuseboxEnabledDebug()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->n:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public fuseboxEnabledRelease()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->o:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->fuseboxEnabledRelease()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->o:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public lazyAnimationCallbacks()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->p:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->lazyAnimationCallbacks()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->p:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public preventDoubleTextMeasure()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->q:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->preventDoubleTextMeasure()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->q:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public setAndroidLayoutDirection()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->r:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->setAndroidLayoutDirection()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->r:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public useImmediateExecutorInAndroidBridgeless()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->s:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->useImmediateExecutorInAndroidBridgeless()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->s:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public useModernRuntimeScheduler()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->t:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->useModernRuntimeScheduler()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->t:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public useNativeViewConfigsInBridgelessMode()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->u:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->useNativeViewConfigsInBridgelessMode()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->u:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public useRuntimeShadowNodeReferenceUpdate()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->v:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->useRuntimeShadowNodeReferenceUpdate()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->v:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public useRuntimeShadowNodeReferenceUpdateOnLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->w:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->useRuntimeShadowNodeReferenceUpdateOnLayout()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->w:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public useStateAlignmentMechanism()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->x:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->useStateAlignmentMechanism()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le2/c;->x:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method
