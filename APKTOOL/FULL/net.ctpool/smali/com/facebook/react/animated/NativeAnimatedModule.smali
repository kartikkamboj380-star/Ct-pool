.class public Lcom/facebook/react/animated/NativeAnimatedModule;
.super Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;
.implements Lcom/facebook/react/bridge/UIManagerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/NativeAnimatedModule$A;,
        Lcom/facebook/react/animated/NativeAnimatedModule$B;,
        Lcom/facebook/react/animated/NativeAnimatedModule$z;
    }
.end annotation

.annotation runtime Li2/a;
    name = "NativeAnimatedModule"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final ANIMATED_MODULE_DEBUG:Z = false


# instance fields
.field private final mAnimatedFrameCallback:Lcom/facebook/react/uimanager/p;

.field private mBatchingControlledByJS:Z

.field private volatile mCurrentBatchNumber:J

.field private volatile mCurrentFrameNumber:J

.field private mEnqueuedAnimationOnFrame:Z

.field private mInitializedForFabric:Z

.field private mInitializedForNonFabric:Z

.field private final mNodesManager:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/facebook/react/animated/p;",
            ">;"
        }
    .end annotation
.end field

.field private mNumFabricAnimations:I

.field private mNumNonFabricAnimations:I

.field private final mOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

.field private final mPreOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

.field private final mReactChoreographer:Lcom/facebook/react/modules/core/a;

.field private mUIManagerType:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$A;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$A;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/n;)V

    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$A;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/n;)V

    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mPreOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNodesManager:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mBatchingControlledByJS:Z

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mInitializedForFabric:Z

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mInitializedForNonFabric:Z

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mEnqueuedAnimationOnFrame:Z

    const/4 v1, 0x1

    iput v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    iput v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumFabricAnimations:I

    iput v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumNonFabricAnimations:I

    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mReactChoreographer:Lcom/facebook/react/modules/core/a;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$k;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$k;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/bridge/ReactContext;)V

    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mAnimatedFrameCallback:Lcom/facebook/react/uimanager/p;

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/animated/NativeAnimatedModule$A;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    return-object p0
.end method

.method static synthetic access$000(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method private addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$B;->c(J)V

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->a(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method private addPreOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$B;->c(J)V

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mPreOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->a(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method private addUnbatchedOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$B;->c(J)V

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->a(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method static bridge synthetic b(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/animated/NativeAnimatedModule$A;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mPreOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/modules/core/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mReactChoreographer:Lcom/facebook/react/modules/core/a;

    return-object p0
.end method

.method private clearFrameCallback()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mReactChoreographer:Lcom/facebook/react/modules/core/a;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/a;

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->p:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mAnimatedFrameCallback:Lcom/facebook/react/uimanager/p;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->o(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mEnqueuedAnimationOnFrame:Z

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/react/animated/NativeAnimatedModule;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mEnqueuedAnimationOnFrame:Z

    return-void
.end method

.method private decrementInFlightAnimationsForViewTag(I)V
    .locals 3

    invoke-static {p1}, Ly2/a;->a(I)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumFabricAnimations:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumFabricAnimations:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumNonFabricAnimations:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumNonFabricAnimations:I

    :goto_0
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumNonFabricAnimations:I

    if-nez p1, :cond_1

    iget v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumFabricAnimations:I

    if-lez v2, :cond_1

    iget v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    if-eq v2, v1, :cond_1

    iput v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumFabricAnimations:I

    if-nez v1, :cond_2

    if-lez p1, :cond_2

    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    if-eq p1, v0, :cond_2

    iput v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    :cond_2
    :goto_1
    return-void
.end method

.method static bridge synthetic e(Lcom/facebook/react/animated/NativeAnimatedModule;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->decrementInFlightAnimationsForViewTag(I)V

    return-void
.end method

.method private enqueueFrameCallback()V
    .locals 3

    iget-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mEnqueuedAnimationOnFrame:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mReactChoreographer:Lcom/facebook/react/modules/core/a;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/a;

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->p:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mAnimatedFrameCallback:Lcom/facebook/react/uimanager/p;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mEnqueuedAnimationOnFrame:Z

    :cond_0
    return-void
.end method

.method static bridge synthetic f(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueueFrameCallback()V

    return-void
.end method

.method private initializeLifecycleEventListenersForViewTag(I)V
    .locals 3

    invoke-static {p1}, Ly2/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumFabricAnimations:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumFabricAnimations:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumNonFabricAnimations:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNumNonFabricAnimations:I

    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()Lcom/facebook/react/animated/p;

    move-result-object p1

    if-eqz p1, :cond_1

    iget v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    invoke-virtual {p1, v2}, Lcom/facebook/react/animated/p;->p(I)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v2, "initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"

    invoke-direct {p1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const-string v2, "NativeAnimatedModule"

    invoke-static {v2, p1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    if-ne p1, v1, :cond_2

    iget-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mInitializedForFabric:Z

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_2
    iget-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mInitializedForNonFabric:Z

    if-eqz p1, :cond_3

    :goto_2
    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    if-eqz p1, :cond_5

    iget v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    invoke-static {p1, v2}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1, p0}, Lcom/facebook/react/bridge/UIManager;->addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    if-ne p1, v1, :cond_4

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mInitializedForFabric:Z

    goto :goto_3

    :cond_4
    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mInitializedForNonFabric:Z

    :cond_5
    :goto_3
    return-void
.end method


# virtual methods
.method public addAnimatedEventToView(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    double-to-int p1, p1

    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$m;

    invoke-direct {p2, p0, p1, p3, p4}, Lcom/facebook/react/animated/NativeAnimatedModule$m;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public addListener(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public connectAnimatedNodeToView(DD)V
    .locals 0

    double-to-int p1, p1

    double-to-int p2, p3

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$i;

    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$i;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public connectAnimatedNodes(DD)V
    .locals 0

    double-to-int p1, p1

    double-to-int p2, p3

    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$g;

    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$g;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public createAnimatedNode(DLcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$t;

    invoke-direct {p2, p0, p1, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$t;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableMap;)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public didDispatchMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 6

    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iget-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mBatchingControlledByJS:Z

    if-nez p1, :cond_1

    iget-wide v4, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentFrameNumber:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentFrameNumber:J

    iget-wide v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentFrameNumber:J

    iget-wide v4, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x2

    cmp-long p1, v2, v4

    if-lez p1, :cond_1

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentFrameNumber:J

    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    :cond_1
    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mPreOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()Lcom/facebook/react/animated/p;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->c(JLcom/facebook/react/animated/p;)V

    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()Lcom/facebook/react/animated/p;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->c(JLcom/facebook/react/animated/p;)V

    return-void
.end method

.method public didMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    return-void
.end method

.method public didScheduleMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 4

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentFrameNumber:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentFrameNumber:J

    return-void
.end method

.method public disconnectAnimatedNodeFromView(DD)V
    .locals 0

    double-to-int p1, p1

    double-to-int p2, p3

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->decrementInFlightAnimationsForViewTag(I)V

    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$j;

    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$j;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public disconnectAnimatedNodes(DD)V
    .locals 0

    double-to-int p1, p1

    double-to-int p2, p3

    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$h;

    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$h;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public dropAnimatedNode(D)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$y;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$y;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public extractAnimatedNodeOffset(D)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$d;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$d;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public finishOperationBatch()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mBatchingControlledByJS:Z

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    return-void
.end method

.method public flattenAnimatedNodeOffset(D)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$c;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$c;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public getNodesManager()Lcom/facebook/react/animated/p;
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNodesManager:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNodesManager:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lcom/facebook/react/animated/p;

    invoke-direct {v2, v0}, Lcom/facebook/react/animated/p;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    const/4 v0, 0x0

    invoke-static {v1, v0, v2}, Lcom/facebook/jni/a;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNodesManager:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/p;

    return-object v0
.end method

.method public getValue(DLcom/facebook/react/bridge/Callback;)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$o;

    invoke-direct {p2, p0, p1, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$o;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/Callback;)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public initialize()V
    .locals 1

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->initialize()V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method public invalidate()V
    .locals 1

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->clearFrameCallback()V

    return-void
.end method

.method public onHostPause()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->clearFrameCallback()V

    return-void
.end method

.method public onHostResume()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueueFrameCallback()V

    return-void
.end method

.method public queueAndExecuteBatchedOperations(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 5

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v2, v1, 0x1

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v3

    invoke-static {v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;->h(I)Lcom/facebook/react/animated/NativeAnimatedModule$z;

    move-result-object v3

    sget-object v4, Lcom/facebook/react/animated/NativeAnimatedModule$q;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    packed-switch v3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Batch animation execution op: fetching viewTag: unknown op code"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    invoke-direct {p0, v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    :pswitch_1
    add-int/lit8 v1, v1, 0x4

    goto :goto_0

    :pswitch_2
    add-int/lit8 v2, v1, 0x2

    add-int/lit8 v1, v1, 0x3

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    invoke-direct {p0, v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    goto :goto_0

    :pswitch_3
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :pswitch_4
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->startOperationBatch()V

    new-instance v1, Lcom/facebook/react/animated/NativeAnimatedModule$p;

    invoke-direct {v1, p0, v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$p;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableArray;)V

    invoke-direct {p0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->addUnbatchedOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->finishOperationBatch()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public removeAnimatedEventFromView(DLjava/lang/String;D)V
    .locals 0

    double-to-int p1, p1

    double-to-int p2, p4

    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->decrementInFlightAnimationsForViewTag(I)V

    new-instance p4, Lcom/facebook/react/animated/NativeAnimatedModule$n;

    invoke-direct {p4, p0, p1, p3, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$n;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILjava/lang/String;I)V

    invoke-direct {p0, p4}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    return-void
.end method

.method public restoreDefaultValues(D)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$l;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$l;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addPreOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public setAnimatedNodeOffset(DD)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$b;

    invoke-direct {p2, p0, p1, p3, p4}, Lcom/facebook/react/animated/NativeAnimatedModule$b;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ID)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public setAnimatedNodeValue(DD)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$a;

    invoke-direct {p2, p0, p1, p3, p4}, Lcom/facebook/react/animated/NativeAnimatedModule$a;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ID)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public setNodesManager(Lcom/facebook/react/animated/p;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mNodesManager:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public startAnimatingNode(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 6

    double-to-int v2, p1

    double-to-int v3, p3

    new-instance p1, Lcom/facebook/react/animated/NativeAnimatedModule$e;

    move-object v0, p1

    move-object v1, p0

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/animated/NativeAnimatedModule$e;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->addUnbatchedOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public startListeningToAnimatedNodeValue(D)V
    .locals 1

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$v;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$v;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$w;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$w;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/animated/c;)V

    invoke-direct {p0, v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public startOperationBatch()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mBatchingControlledByJS:Z

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    return-void
.end method

.method public stopAnimation(D)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$f;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$f;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public stopListeningToAnimatedNodeValue(D)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$x;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$x;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public updateAnimatedNodeConfig(DLcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    double-to-int p1, p1

    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$u;

    invoke-direct {p2, p0, p1, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$u;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableMap;)V

    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V

    return-void
.end method

.method public willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-virtual {v0}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mPreOperations:Lcom/facebook/react/animated/NativeAnimatedModule$A;

    invoke-virtual {v0}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mUIManagerType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->mCurrentBatchNumber:J

    new-instance v2, Lcom/facebook/react/animated/NativeAnimatedModule$r;

    invoke-direct {v2, p0, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$r;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;J)V

    new-instance v3, Lcom/facebook/react/animated/NativeAnimatedModule$s;

    invoke-direct {v3, p0, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$s;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;J)V

    check-cast p1, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {p1, v2}, Lcom/facebook/react/uimanager/UIManagerModule;->prependUIBlock(Lcom/facebook/react/uimanager/i0;)V

    invoke-virtual {p1, v3}, Lcom/facebook/react/uimanager/UIManagerModule;->addUIBlock(Lcom/facebook/react/uimanager/i0;)V

    return-void
.end method

.method public willMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    return-void
.end method
