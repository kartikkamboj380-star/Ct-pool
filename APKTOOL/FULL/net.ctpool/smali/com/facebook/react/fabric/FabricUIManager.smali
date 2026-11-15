.class public Lcom/facebook/react/fabric/FabricUIManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/UIManager;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;
.implements LZ1/b;
.implements Lcom/facebook/react/uimanager/events/p;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingNativeLoadLibrary"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/FabricUIManager$f;,
        Lcom/facebook/react/fabric/FabricUIManager$g;
    }
.end annotation


# static fields
.field public static final ENABLE_FABRIC_LOGS:Z

.field public static final ENABLE_FABRIC_PERF_LOGS:Z

.field private static final FABRIC_PERF_LOGGER:Lcom/facebook/react/fabric/b$a;

.field public static final IS_DEVELOPMENT_ENVIRONMENT:Z = false

.field public static final TAG:Ljava/lang/String; = "FabricUIManager"


# instance fields
.field private final mBatchEventDispatchedListener:Lcom/facebook/react/uimanager/events/a;

.field private mBinding:Lcom/facebook/react/fabric/a;

.field private mCommitStartTime:J

.field private mCurrentSynchronousCommitNumber:I

.field private volatile mDestroyed:Z

.field public mDevToolsReactPerfLogger:Lcom/facebook/react/fabric/b;

.field private final mDispatchUIFrameCallback:Lcom/facebook/react/fabric/FabricUIManager$f;

.field private mDispatchViewUpdatesTime:J

.field private mDriveCxxAnimations:Z

.field private final mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

.field private mFinishTransactionCPPTime:J

.field private mFinishTransactionTime:J

.field private mInteropUIBlockListener:LY1/a;

.field private mLayoutTime:J

.field private final mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/facebook/react/bridge/UIManagerListener;",
            ">;"
        }
    .end annotation
.end field

.field private final mMountItemDispatcher:La2/b;

.field private final mMountItemExecutor:La2/c$a;

.field private mMountNotificationScheduled:Z

.field private final mMountedSurfaceIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mMountingManager:La2/c;

.field private final mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final mSynchronousEvents:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/facebook/react/fabric/m;",
            ">;"
        }
    .end annotation
.end field

.field private final mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableFabricLogs:Z

    if-nez v0, :cond_1

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v0

    sget-object v1, Lb1/a;->g:LZ0/a;

    invoke-interface {v0, v1}, La1/b;->c(LZ0/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    sput-boolean v0, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    sput-boolean v0, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_PERF_LOGS:Z

    new-instance v0, Lcom/facebook/react/fabric/e;

    invoke-direct {v0}, Lcom/facebook/react/fabric/e;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/FabricUIManager;->FABRIC_PERF_LOGGER:Lcom/facebook/react/fabric/b$a;

    invoke-static {}, Lcom/facebook/react/fabric/d;->a()V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/G0;Lcom/facebook/react/uimanager/events/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountNotificationScheduled:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountedSurfaceIds:Ljava/util/List;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mSynchronousEvents:Ljava/util/Set;

    iput-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDestroyed:Z

    iput-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDriveCxxAnimations:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchViewUpdatesTime:J

    iput-wide v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mCommitStartTime:J

    iput-wide v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mLayoutTime:J

    iput-wide v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mFinishTransactionTime:J

    iput-wide v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mFinishTransactionCPPTime:J

    const/16 v0, 0x2710

    iput v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mCurrentSynchronousCommitNumber:I

    new-instance v0, Lcom/facebook/react/fabric/FabricUIManager$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/fabric/FabricUIManager$a;-><init>(Lcom/facebook/react/fabric/FabricUIManager;)V

    iput-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemExecutor:La2/c$a;

    new-instance v1, Lcom/facebook/react/fabric/FabricUIManager$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/facebook/react/fabric/FabricUIManager$f;-><init>(Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/fabric/f;)V

    iput-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchUIFrameCallback:Lcom/facebook/react/fabric/FabricUIManager$f;

    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    new-instance v1, La2/c;

    invoke-direct {v1, p2, v0}, La2/c;-><init>(Lcom/facebook/react/uimanager/G0;La2/c$a;)V

    iput-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    new-instance v0, La2/b;

    new-instance v3, Lcom/facebook/react/fabric/FabricUIManager$g;

    invoke-direct {v3, p0, v2}, Lcom/facebook/react/fabric/FabricUIManager$g;-><init>(Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/g;)V

    invoke-direct {v0, v1, v3}, La2/b;-><init>(La2/c;La2/b$a;)V

    iput-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    new-instance v0, Lcom/facebook/react/uimanager/events/k;

    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/k;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    iput-object p3, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBatchEventDispatchedListener:Lcom/facebook/react/uimanager/events/a;

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    iput-object p2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {p1, p2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/fabric/b$b;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/fabric/FabricUIManager;->lambda$static$0(Lcom/facebook/react/fabric/b$b;)V

    return-void
.end method

.method static bridge synthetic b(Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/react/fabric/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/fabric/FabricUIManager;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDestroyed:Z

    return p0
.end method

.method private createIntBufferBatchMountItem(I[I[Ljava/lang/Object;I)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 1

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-array p2, v0, [I

    :cond_0
    if-nez p3, :cond_1

    new-array p3, v0, [Ljava/lang/Object;

    :cond_1
    invoke-static {p1, p2, p3, p4}, Lcom/facebook/react/fabric/mounting/mountitems/f;->c(I[I[Ljava/lang/Object;I)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    move-result-object p1

    return-object p1
.end method

.method static bridge synthetic d(Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/react/fabric/FabricUIManager$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchUIFrameCallback:Lcom/facebook/react/fabric/FabricUIManager$f;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/fabric/FabricUIManager;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDriveCxxAnimations:Z

    return p0
.end method

.method static bridge synthetic f(Lcom/facebook/react/fabric/FabricUIManager;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/facebook/react/fabric/FabricUIManager;)La2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    return-object p0
.end method

.method private getInteropUIBlockListener()LY1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mInteropUIBlockListener:LY1/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LY1/a;

    .line 6
    .line 7
    invoke-direct {v0}, LY1/a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mInteropUIBlockListener:LY1/a;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/facebook/react/fabric/FabricUIManager;->addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mInteropUIBlockListener:LY1/a;

    .line 16
    .line 17
    return-object v0
.end method

.method static bridge synthetic h(Lcom/facebook/react/fabric/FabricUIManager;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountNotificationScheduled:Z

    return p0
.end method

.method static bridge synthetic i(Lcom/facebook/react/fabric/FabricUIManager;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountedSurfaceIds:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic j(Lcom/facebook/react/fabric/FabricUIManager;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mSynchronousEvents:Ljava/util/Set;

    return-object p0
.end method

.method static bridge synthetic k(Lcom/facebook/react/fabric/FabricUIManager;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountNotificationScheduled:Z

    return-void
.end method

.method private static synthetic lambda$static$0(Lcom/facebook/react/fabric/b$b;)V
    .locals 39

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/fabric/b$b;->f()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/fabric/b$b;->o()J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/fabric/b$b;->j()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/fabric/b$b;->s()J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/fabric/b$b;->c()J

    move-result-wide v8

    sget-object v10, Lcom/facebook/react/fabric/b;->c:Lcom/facebook/react/fabric/l;

    invoke-virtual {v10, v0, v1}, Lcom/facebook/react/fabric/l;->c(J)V

    sget-object v11, Lcom/facebook/react/fabric/b;->d:Lcom/facebook/react/fabric/l;

    invoke-virtual {v11, v2, v3}, Lcom/facebook/react/fabric/l;->c(J)V

    sget-object v12, Lcom/facebook/react/fabric/b;->e:Lcom/facebook/react/fabric/l;

    invoke-virtual {v12, v4, v5}, Lcom/facebook/react/fabric/l;->c(J)V

    sget-object v13, Lcom/facebook/react/fabric/b;->f:Lcom/facebook/react/fabric/l;

    invoke-virtual {v13, v6, v7}, Lcom/facebook/react/fabric/l;->c(J)V

    sget-object v14, Lcom/facebook/react/fabric/b;->g:Lcom/facebook/react/fabric/l;

    invoke-virtual {v14, v8, v9}, Lcom/facebook/react/fabric/l;->c(J)V

    sget-object v15, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/fabric/b$b;->h()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    invoke-virtual {v10}, Lcom/facebook/react/fabric/l;->d()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v20

    invoke-virtual {v10}, Lcom/facebook/react/fabric/l;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v21

    invoke-virtual {v10}, Lcom/facebook/react/fabric/l;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v23

    invoke-virtual {v11}, Lcom/facebook/react/fabric/l;->d()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v24

    invoke-virtual {v11}, Lcom/facebook/react/fabric/l;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v25

    invoke-virtual {v11}, Lcom/facebook/react/fabric/l;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v26

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v27

    invoke-virtual {v12}, Lcom/facebook/react/fabric/l;->d()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v28

    invoke-virtual {v12}, Lcom/facebook/react/fabric/l;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v29

    invoke-virtual {v12}, Lcom/facebook/react/fabric/l;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v30

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v31

    invoke-virtual {v13}, Lcom/facebook/react/fabric/l;->d()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v32

    invoke-virtual {v13}, Lcom/facebook/react/fabric/l;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v33

    invoke-virtual {v13}, Lcom/facebook/react/fabric/l;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v34

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v35

    invoke-virtual {v14}, Lcom/facebook/react/fabric/l;->d()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v36

    invoke-virtual {v14}, Lcom/facebook/react/fabric/l;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v37

    invoke-virtual {v14}, Lcom/facebook/react/fabric/l;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v38

    filled-new-array/range {v18 .. v38}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n"

    invoke-static {v15, v1, v0}, LP0/a;->t(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private measure(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FFFF)J
    .locals 11

    .line 1
    const/4 v10, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/fabric/FabricUIManager;->measure(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FFFF[F)J

    move-result-wide v0

    return-wide v0
.end method

.method private measure(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FFFF[F)J
    .locals 13

    .line 2
    move-object v0, p0

    move v1, p1

    if-lez v1, :cond_1

    iget-object v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    const-string v3, "measure"

    invoke-virtual {v2, p1, v3}, La2/c;->f(ILjava/lang/String;)La2/f;

    move-result-object v1

    invoke-virtual {v1}, La2/f;->y()Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/16 v1, 0x0

    return-wide v1

    :cond_0
    invoke-virtual {v1}, La2/f;->p()Lcom/facebook/react/uimanager/e0;

    move-result-object v1

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    goto :goto_0

    :goto_1
    iget-object v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-static/range {p6 .. p7}, La2/a;->d(FF)F

    move-result v8

    invoke-static/range {p6 .. p7}, La2/a;->c(FF)Lcom/facebook/yoga/p;

    move-result-object v9

    invoke-static/range {p8 .. p9}, La2/a;->d(FF)F

    move-result v10

    invoke-static/range {p8 .. p9}, La2/a;->c(FF)Lcom/facebook/yoga/p;

    move-result-object v11

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v12, p10

    invoke-virtual/range {v2 .. v12}, La2/c;->k(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J

    move-result-wide v1

    return-wide v1
.end method

.method private measureLines(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FF)Lcom/facebook/react/bridge/NativeArray;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    invoke-static {p4}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p4

    invoke-static {v0, p1, p2, p3, p4}, Lcom/facebook/react/views/text/s;->j(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;FF)Lcom/facebook/react/bridge/WritableArray;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/NativeArray;

    return-object p1
.end method

.method private measureMapBuffer(ILjava/lang/String;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FFFF[F)J
    .locals 13

    move-object v0, p0

    move v1, p1

    if-lez v1, :cond_1

    iget-object v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    const-string v3, "measure"

    invoke-virtual {v2, p1, v3}, La2/c;->f(ILjava/lang/String;)La2/f;

    move-result-object v1

    invoke-virtual {v1}, La2/f;->y()Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/16 v1, 0x0

    return-wide v1

    :cond_0
    invoke-virtual {v1}, La2/f;->p()Lcom/facebook/react/uimanager/e0;

    move-result-object v1

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    goto :goto_0

    :goto_1
    iget-object v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-static/range {p6 .. p7}, La2/a;->d(FF)F

    move-result v8

    invoke-static/range {p6 .. p7}, La2/a;->c(FF)Lcom/facebook/yoga/p;

    move-result-object v9

    invoke-static/range {p8 .. p9}, La2/a;->d(FF)F

    move-result v10

    invoke-static/range {p8 .. p9}, La2/a;->c(FF)Lcom/facebook/yoga/p;

    move-result-object v11

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v12, p10

    invoke-virtual/range {v2 .. v12}, La2/c;->l(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J

    move-result-wide v1

    return-wide v1
.end method

.method private preallocateView(IILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 8

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    move-object v4, p4

    check-cast v4, Lcom/facebook/react/bridge/ReadableMap;

    move-object v5, p5

    check-cast v5, Lcom/facebook/react/uimanager/d0;

    move-object v6, p6

    check-cast v6, Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v7, p7

    invoke-static/range {v1 .. v7}, Lcom/facebook/react/fabric/mounting/mountitems/f;->d(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/d0;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    move-result-object p1

    invoke-virtual {v0, p1}, La2/b;->b(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    return-void
.end method

.method private scheduleMountItem(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;IJJJJJJJI)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v3, p3

    move-wide/from16 v5, p9

    move-wide/from16 v7, p11

    move-wide/from16 v9, p13

    move-wide/from16 v11, p15

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v13

    instance-of v15, v1, Lcom/facebook/react/fabric/mounting/mountitems/a;

    if-eqz v15, :cond_0

    move-object/from16 v16, v1

    check-cast v16, Lcom/facebook/react/fabric/mounting/mountitems/a;

    invoke-interface/range {v16 .. v16}, Lcom/facebook/react/fabric/mounting/mountitems/a;->a()Z

    move-result v16

    if-eqz v16, :cond_1

    :cond_0
    if-nez v15, :cond_2

    if-eqz v1, :cond_2

    :cond_1
    const/16 v16, 0x1

    goto :goto_0

    :cond_2
    const/16 v16, 0x0

    :goto_0
    iget-object v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v2

    move-object/from16 v2, v17

    check-cast v2, Lcom/facebook/react/bridge/UIManagerListener;

    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/UIManagerListener;->didScheduleMountItems(Lcom/facebook/react/bridge/UIManager;)V

    move-object/from16 v2, v18

    goto :goto_1

    :cond_3
    if-eqz v15, :cond_4

    iput-wide v3, v0, Lcom/facebook/react/fabric/FabricUIManager;->mCommitStartTime:J

    sub-long v2, v7, v5

    iput-wide v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mLayoutTime:J

    sub-long v2, v11, v9

    iput-wide v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mFinishTransactionCPPTime:J

    sub-long/2addr v13, v9

    iput-wide v13, v0, Lcom/facebook/react/fabric/FabricUIManager;->mFinishTransactionTime:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchViewUpdatesTime:J

    :cond_4
    if-eqz v16, :cond_5

    iget-object v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-virtual {v2, v1}, La2/b;->a(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    new-instance v1, Lcom/facebook/react/fabric/FabricUIManager$c;

    iget-object v2, v0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {v1, v0, v2}, Lcom/facebook/react/fabric/FabricUIManager$c;-><init>(Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/bridge/ReactContext;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->isOnUiThread()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_5
    if-eqz v15, :cond_6

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_COMMIT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    const/4 v2, 0x0

    move/from16 v3, p2

    move-wide/from16 v13, p3

    invoke-static {v1, v2, v3, v13, v14}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_FINISH_TRANSACTION_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v1, v2, v3, v9, v10}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_FINISH_TRANSACTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v1, v2, v3, v11, v12}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_DIFF_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    move-wide/from16 v9, p5

    invoke-static {v1, v2, v3, v9, v10}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_DIFF_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    move-wide/from16 v9, p7

    invoke-static {v1, v2, v3, v9, v10}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v1, v2, v3, v5, v6}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v1, v2, v3, v7, v8}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_AFFECTED_NODES:Lcom/facebook/react/bridge/ReactMarkerConstants;

    const/4 v4, 0x0

    move-object/from16 p3, v1

    move-object/from16 p4, v4

    move/from16 p5, p2

    move-wide/from16 p6, p11

    move/from16 p8, p17

    invoke-static/range {p3 .. p8}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJI)V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_COMMIT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v1, v2, v3}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    :cond_6
    return-void
.end method


# virtual methods
.method public addRootView(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Lcom/facebook/react/bridge/WritableMap;",
            ")I"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    new-instance v1, Lcom/facebook/react/uimanager/s;

    const-string v2, "Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."

    invoke-direct {v1, v2}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, p1

    check-cast v1, Lcom/facebook/react/uimanager/S;

    invoke-interface {v1}, Lcom/facebook/react/uimanager/S;->getRootViewTag()I

    move-result v2

    new-instance v3, Lcom/facebook/react/uimanager/e0;

    iget-object v4, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-interface {v1}, Lcom/facebook/react/uimanager/S;->getSurfaceID()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v5, v6, v2}, Lcom/facebook/react/uimanager/e0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v4, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {v4, v2, v3, p1}, La2/c;->p(ILcom/facebook/react/uimanager/e0;Landroid/view/View;)La2/f;

    invoke-interface {v1}, Lcom/facebook/react/uimanager/S;->getJSModuleName()Ljava/lang/String;

    move-result-object p1

    sget-boolean v1, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    if-eqz v1, :cond_0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Starting surface for module: %s and reactTag: %d"

    invoke-static {v0, v3, p1, v1}, LP0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    check-cast p2, Lcom/facebook/react/bridge/NativeMap;

    invoke-interface {v0, v2, p1, p2}, Lcom/facebook/react/fabric/a;->startSurface(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V

    return v2
.end method

.method public addUIBlock(LZ1/a;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->unstable_useFabricInterop:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/react/fabric/FabricUIManager;->getInteropUIBlockListener()LY1/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LY1/a;->a(LZ1/a;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public attachRootView(Lc2/b;Landroid/view/View;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/e0;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {p1}, Lc2/b;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-interface {p1}, Lc2/b;->getSurfaceId()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/react/uimanager/e0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    .line 21
    .line 22
    invoke-interface {p1}, Lc2/b;->getSurfaceId()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1, v2, p2, v0}, La2/c;->a(ILandroid/view/View;Lcom/facebook/react/uimanager/e0;)V

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    invoke-interface {p1, p2}, Lc2/b;->c(Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public clearJSResponder()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    new-instance v1, Lcom/facebook/react/fabric/FabricUIManager$e;

    invoke-direct {v1, p0}, Lcom/facebook/react/fabric/FabricUIManager$e;-><init>(Lcom/facebook/react/fabric/FabricUIManager;)V

    invoke-virtual {v0, v1}, La2/b;->a(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    return-void
.end method

.method createDispatchCommandMountItemForInterop(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;
    .locals 1

    :try_start_0
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, p2, v0, p4}, Lcom/facebook/react/fabric/mounting/mountitems/f;->a(IIILcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-static {p1, p2, p3, p4}, Lcom/facebook/react/fabric/mounting/mountitems/f;->b(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;

    move-result-object p1

    return-object p1
.end method

.method public dispatchCommand(IIILcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-static {p1, p2, p3, p4}, Lcom/facebook/react/fabric/mounting/mountitems/f;->a(IIILcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;

    move-result-object p1

    invoke-virtual {v0, p1}, La2/b;->c(Lcom/facebook/react/fabric/mounting/mountitems/b;)V

    return-void
.end method

.method public dispatchCommand(IILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public dispatchCommand(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 3
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->unstable_useFabricInterop:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/react/fabric/FabricUIManager;->createDispatchCommandMountItemForInterop(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, La2/b;->c(Lcom/facebook/react/fabric/mounting/mountitems/b;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-static {p1, p2, p3, p4}, Lcom/facebook/react/fabric/mounting/mountitems/f;->b(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-void
.end method

.method public dispatchCommand(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getColor(I[Ljava/lang/String;)I
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    const-string v1, "getColor"

    invoke-virtual {v0, p1, v1}, La2/c;->f(ILjava/lang/String;)La2/f;

    move-result-object p1

    invoke-virtual {p1}, La2/f;->p()Lcom/facebook/react/uimanager/e0;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    array-length v1, p2

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p2, v2

    invoke-static {p1, v3}, Lcom/facebook/react/bridge/ColorPropConverter;->resolveResourcePath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public getEventDispatcher()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    return-object v0
.end method

.method public bridge synthetic getEventDispatcher()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/facebook/react/fabric/FabricUIManager;->getEventDispatcher()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0
.end method

.method public getInspectorDataForInstance(ILandroid/view/View;)Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {v0, p1, p2}, La2/c;->d(II)Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    invoke-interface {p2, p1}, Lcom/facebook/react/fabric/a;->getInspectorDataForInstance(Lcom/facebook/react/fabric/events/EventEmitterWrapper;)Lcom/facebook/react/bridge/ReadableNativeMap;

    move-result-object p1

    return-object p1
.end method

.method public getPerformanceCounters()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-wide v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mCommitStartTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "CommitStartTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mLayoutTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "LayoutTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchViewUpdatesTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "DispatchViewUpdatesTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-virtual {v1}, La2/b;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "RunStartTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-virtual {v1}, La2/b;->l()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "BatchedExecutionTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mFinishTransactionTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "FinishFabricTransactionTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mFinishTransactionCPPTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "FinishFabricTransactionCPPTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public getThemeData(I[F)Z
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    const-string v1, "getThemeData"

    invoke-virtual {v0, p1, v1}, La2/c;->f(ILjava/lang/String;)La2/f;

    move-result-object p1

    invoke-virtual {p1}, La2/f;->p()Lcom/facebook/react/uimanager/e0;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    sget-object p1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    const-string p2, "\"themedReactContext\" is null when call \"getThemeData\""

    invoke-static {p1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/uimanager/k0;->a(Landroid/content/Context;)[F

    move-result-object p1

    aget v1, p1, v0

    aput v1, p2, v0

    const/4 v0, 0x1

    aget v1, p1, v0

    aput v1, p2, v0

    const/4 v1, 0x2

    aget v2, p1, v1

    aput v2, p2, v1

    const/4 v1, 0x3

    aget p1, p1, v1

    aput p1, p2, v1

    return v0
.end method

.method public initialize()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    new-instance v1, Lcom/facebook/react/fabric/events/FabricEventEmitter;

    invoke-direct {v1, p0}, Lcom/facebook/react/fabric/events/FabricEventEmitter;-><init>(Lcom/facebook/react/fabric/FabricUIManager;)V

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/facebook/react/uimanager/events/e;->h(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBatchEventDispatchedListener:Lcom/facebook/react/uimanager/events/a;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/e;->f(Lcom/facebook/react/uimanager/events/a;)V

    sget-boolean v0, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_PERF_LOGS:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/react/fabric/b;

    invoke-direct {v0}, Lcom/facebook/react/fabric/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDevToolsReactPerfLogger:Lcom/facebook/react/fabric/b;

    sget-object v1, Lcom/facebook/react/fabric/FabricUIManager;->FABRIC_PERF_LOGGER:Lcom/facebook/react/fabric/b$a;

    invoke-virtual {v0, v1}, Lcom/facebook/react/fabric/b;->a(Lcom/facebook/react/fabric/b$a;)V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDevToolsReactPerfLogger:Lcom/facebook/react/fabric/b;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->addFabricListener(Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;)V

    :cond_0
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->unstable_useFabricInterop:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/facebook/react/internal/interop/InteropEventEmitter;

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {v0, v1}, Lcom/facebook/react/internal/interop/InteropEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-class v2, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/react/bridge/ReactContext;->internal_registerInteropModule(Ljava/lang/Class;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public invalidate()V
    .locals 3

    sget-object v0, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    const-string v1, "FabricUIManager.invalidate"

    invoke-static {v0, v1}, LP0/a;->p(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDevToolsReactPerfLogger:Lcom/facebook/react/fabric/b;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/facebook/react/fabric/FabricUIManager;->FABRIC_PERF_LOGGER:Lcom/facebook/react/fabric/b$a;

    invoke-virtual {v1, v2}, Lcom/facebook/react/fabric/b;->d(Lcom/facebook/react/fabric/b$a;)V

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDevToolsReactPerfLogger:Lcom/facebook/react/fabric/b;

    invoke-static {v1}, Lcom/facebook/react/bridge/ReactMarker;->removeFabricListener(Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;)V

    :cond_0
    iget-boolean v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDestroyed:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot double-destroy FabricUIManager"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDestroyed:Z

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchUIFrameCallback:Lcom/facebook/react/fabric/FabricUIManager$f;

    invoke-virtual {v0}, Lcom/facebook/react/fabric/FabricUIManager$f;->b()V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBatchEventDispatchedListener:Lcom/facebook/react/uimanager/events/a;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/e;->e(Lcom/facebook/react/uimanager/events/a;)V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/e;->i(I)V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/G0;->f()V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-virtual {p0}, Lcom/facebook/react/fabric/FabricUIManager;->onHostPause()V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    invoke-interface {v0}, Lcom/facebook/react/fabric/a;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    invoke-static {}, Lcom/facebook/react/uimanager/C0;->a()V

    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/events/e;->g()V

    :cond_2
    return-void
.end method

.method public onAllAnimationsComplete()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDriveCxxAnimations:Z

    return-void
.end method

.method public onAnimationStarted()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDriveCxxAnimations:Z

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    return-void
.end method

.method public onHostPause()V
    .locals 3

    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->o:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchUIFrameCallback:Lcom/facebook/react/fabric/FabricUIManager$f;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->o(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public onHostResume()V
    .locals 3

    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->o:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDispatchUIFrameCallback:Lcom/facebook/react/fabric/FabricUIManager$f;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public onRequestEventBeat()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/events/e;->d()V

    return-void
.end method

.method public prependUIBlock(LZ1/a;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->unstable_useFabricInterop:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/react/fabric/FabricUIManager;->getInteropUIBlockListener()LY1/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LY1/a;->b(LZ1/a;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public profileNextBatch()V
    .locals 0

    return-void
.end method

.method public receiveEvent(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 7

    .line 1
    const/4 v4, 0x0

    const/4 v6, 0x2

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/react/fabric/FabricUIManager;->receiveEvent(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;I)V

    return-void
.end method

.method public receiveEvent(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;I)V
    .locals 8

    .line 2
    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/facebook/react/fabric/FabricUIManager;->receiveEvent(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;IZ)V

    return-void
.end method

.method public receiveEvent(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;IZ)V
    .locals 7

    .line 3
    iget-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mDestroyed:Z

    if-eqz v0, :cond_0

    sget-object p1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    const-string p2, "Attempted to receiveEvent after destruction"

    invoke-static {p1, p2}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {v0, p1, p2}, La2/c;->d(II)Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object p7, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {p7, p2}, La2/c;->i(I)Z

    move-result p7

    if-eqz p7, :cond_1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, La2/c;->c(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;I)V

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Unable to invoke event: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " for reactTag: "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_2
    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/facebook/react/fabric/FabricUIManager;->mSynchronousEvents:Ljava/util/Set;

    new-instance p6, Lcom/facebook/react/fabric/m;

    invoke-direct {p6, p1, p2, p3}, Lcom/facebook/react/fabric/m;-><init>(IILjava/lang/String;)V

    invoke-interface {p4, p6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0, p3, p5}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->c(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_1

    :cond_3
    if-eqz p4, :cond_4

    invoke-virtual {v0, p3, p5}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->d(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0, p3, p5, p6}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->b(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 7

    .line 4
    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v1, -0x1

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/react/fabric/FabricUIManager;->receiveEvent(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;I)V

    return-void
.end method

.method public removeUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public resolveCustomDirectEventName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "top"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "on"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public resolveView(I)Landroid/view/View;
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {v0, p1}, La2/c;->g(I)La2/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, La2/f;->t(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public sendAccessibilityEvent(II)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    const/4 v1, -0x1

    invoke-static {v1, p1, p2}, Lcom/facebook/react/fabric/mounting/mountitems/f;->e(III)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    move-result-object p1

    invoke-virtual {v0, p1}, La2/b;->a(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    return-void
.end method

.method public sendAccessibilityEventFromJS(IILjava/lang/String;)V
    .locals 1

    const-string v0, "focus"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p3, 0x8

    goto :goto_0

    :cond_0
    const-string v0, "windowStateChange"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p3, 0x20

    goto :goto_0

    :cond_1
    const-string v0, "click"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    const-string v0, "viewHoverEnter"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 p3, 0x80

    :goto_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-static {p1, p2, p3}, Lcom/facebook/react/fabric/mounting/mountitems/f;->e(III)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    move-result-object p1

    invoke-virtual {v0, p1}, La2/b;->a(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "sendAccessibilityEventFromJS: invalid eventType "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBinding(Lcom/facebook/react/fabric/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    return-void
.end method

.method public setJSResponder(IIIZ)V
    .locals 8

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    new-instance v7, Lcom/facebook/react/fabric/FabricUIManager$d;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/fabric/FabricUIManager$d;-><init>(Lcom/facebook/react/fabric/FabricUIManager;IIIZ)V

    invoke-virtual {v0, v7}, La2/b;->a(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    return-void
.end method

.method public startSurface(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)I
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/WritableMap;",
            "II)I"
        }
    .end annotation

    .line 1
    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object v2, v1

    check-cast v2, Lcom/facebook/react/uimanager/S;

    invoke-interface {v2}, Lcom/facebook/react/uimanager/S;->getRootViewTag()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v4, Lcom/facebook/react/uimanager/e0;

    iget-object v5, v0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {v4, v5, v2, v3, v13}, Lcom/facebook/react/uimanager/e0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;I)V

    sget-boolean v5, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    if-eqz v5, :cond_0

    sget-object v5, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "Starting surface for module: %s and reactTag: %d"

    invoke-static {v5, v7, v3, v6}, LP0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    iget-object v5, v0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {v5, v13, v4, v1}, La2/c;->p(ILcom/facebook/react/uimanager/e0;Landroid/view/View;)La2/f;

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->isOnUiThread()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static/range {p1 .. p1}, Lcom/facebook/react/uimanager/a0;->b(Landroid/view/View;)Landroid/graphics/Point;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance v1, Landroid/graphics/Point;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4}, Landroid/graphics/Point;-><init>(II)V

    :goto_0
    iget-object v4, v0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    move-object/from16 v5, p3

    check-cast v5, Lcom/facebook/react/bridge/NativeMap;

    invoke-static/range {p4 .. p4}, La2/a;->a(I)F

    move-result v6

    invoke-static/range {p4 .. p4}, La2/a;->b(I)F

    move-result v7

    invoke-static/range {p5 .. p5}, La2/a;->a(I)F

    move-result v8

    invoke-static/range {p5 .. p5}, La2/a;->b(I)F

    move-result v9

    iget v10, v1, Landroid/graphics/Point;->x:I

    int-to-float v10, v10

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v11, v1

    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    move-result v12

    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    move-result v14

    move-object v1, v4

    move v2, v13

    move-object/from16 v3, p2

    move-object v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v14

    invoke-interface/range {v1 .. v12}, Lcom/facebook/react/fabric/a;->startSurfaceWithConstraints(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;FFFFFFZZ)V

    return v13
.end method

.method public startSurface(Lc2/b;Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    .line 2
    invoke-static {}, Lcom/facebook/react/uimanager/T;->a()I

    move-result v0

    new-instance v1, Lcom/facebook/react/uimanager/e0;

    iget-object v2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mReactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-interface {p1}, Lc2/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, p2, v3, v0}, Lcom/facebook/react/uimanager/e0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;I)V

    iget-object p2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {p2, v0, v1, p3}, La2/c;->p(ILcom/facebook/react/uimanager/e0;Landroid/view/View;)La2/f;

    invoke-interface {p1, v0}, Lc2/b;->a(I)V

    instance-of p2, p1, Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    move-object v0, p1

    check-cast v0, Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    invoke-interface {p2, v0}, Lcom/facebook/react/fabric/a;->registerSurface(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V

    :cond_0
    if-eqz p3, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1, p2}, Lc2/b;->c(Z)V

    invoke-interface {p1}, Lc2/b;->start()V

    return-void
.end method

.method public stopSurface(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {v0, p1}, La2/c;->q(I)V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    invoke-interface {v0, p1}, Lcom/facebook/react/fabric/a;->stopSurface(I)V

    return-void
.end method

.method public stopSurface(Lc2/b;)V
    .locals 2

    .line 2
    invoke-interface {p1}, Lc2/b;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Trying to stop surface that hasn\'t started yet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-interface {p1}, Lc2/b;->getSurfaceId()I

    move-result v1

    invoke-virtual {v0, v1}, La2/c;->q(I)V

    invoke-interface {p1}, Lc2/b;->stop()V

    instance-of v0, p1, Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    check-cast p1, Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    invoke-interface {v0, p1}, Lcom/facebook/react/fabric/a;->unregisterSurface(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V

    :cond_1
    return-void
.end method

.method public synchronouslyUpdateViewOnUIThread(ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 5

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget v0, p0, Lcom/facebook/react/fabric/FabricUIManager;->mCurrentSynchronousCommitNumber:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mCurrentSynchronousCommitNumber:I

    new-instance v1, Lcom/facebook/react/fabric/FabricUIManager$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/fabric/FabricUIManager$b;-><init>(Lcom/facebook/react/fabric/FabricUIManager;ILcom/facebook/react/bridge/ReadableMap;)V

    iget-object p2, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {p2, p1}, La2/c;->i(I)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountItemDispatcher:La2/b;

    invoke-virtual {p1, v1}, La2/b;->a(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    return-void

    :cond_0
    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_UPDATE_UI_MAIN_THREAD_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    const/4 v2, 0x0

    invoke-static {p2, v2, v0}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    sget-boolean p2, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    if-eqz p2, :cond_1

    sget-object p2, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v3, "<hidden>"

    const-string v4, "SynchronouslyUpdateViewOnUIThread for tag %d: %s"

    invoke-static {p2, v4, p1, v3}, LP0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-interface {v1, p1}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->execute(La2/c;)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_UPDATE_UI_MAIN_THREAD_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1, v2, v0}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    return-void
.end method

.method public updateRootLayoutSpecs(IIIII)V
    .locals 11

    move-object v0, p0

    move v2, p1

    sget-boolean v1, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Updating Root Layout Specs for [%d]"

    invoke-static {v1, v4, v3}, LP0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iget-object v1, v0, Lcom/facebook/react/fabric/FabricUIManager;->mMountingManager:La2/c;

    invoke-virtual {v1, p1}, La2/c;->e(I)La2/f;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    new-instance v3, Lcom/facebook/react/uimanager/s;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Cannot updateRootLayoutSpecs on surfaceId that does not exist: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {v1}, La2/f;->p()Lcom/facebook/react/uimanager/e0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    move-result v3

    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    move-result v1

    move v10, v1

    move v9, v3

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    move v9, v1

    move v10, v9

    :goto_0
    iget-object v1, v0, Lcom/facebook/react/fabric/FabricUIManager;->mBinding:Lcom/facebook/react/fabric/a;

    invoke-static {p2}, La2/a;->a(I)F

    move-result v3

    invoke-static {p2}, La2/a;->b(I)F

    move-result v4

    invoke-static {p3}, La2/a;->a(I)F

    move-result v5

    invoke-static {p3}, La2/a;->b(I)F

    move-result v6

    move v7, p4

    int-to-float v7, v7

    move/from16 v8, p5

    int-to-float v8, v8

    move v2, p1

    invoke-interface/range {v1 .. v10}, Lcom/facebook/react/fabric/a;->setConstraints(IFFFFFFZZ)V

    return-void
.end method
