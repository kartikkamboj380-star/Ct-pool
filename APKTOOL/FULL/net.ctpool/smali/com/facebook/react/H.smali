.class public Lcom/facebook/react/H;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/H$f;
    }
.end annotation


# static fields
.field private static final D:Ljava/lang/String; = "H"


# instance fields
.field private final A:Lcom/facebook/react/T$a;

.field private B:Ljava/util/List;

.field private C:Z

.field private final a:Ljava/util/Set;

.field private volatile b:Lcom/facebook/react/common/LifecycleState;

.field private c:Lcom/facebook/react/H$f;

.field private volatile d:Ljava/lang/Thread;

.field private final e:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

.field private f:Ljava/util/Collection;

.field private final g:Lcom/facebook/react/bridge/JSBundleLoader;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/util/List;

.field private final j:LX1/e;

.field private final k:Z

.field private final l:Z

.field private final m:Z

.field private final n:Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;

.field private final o:Ljava/lang/Object;

.field private volatile p:Lcom/facebook/react/bridge/ReactContext;

.field private final q:Landroid/content/Context;

.field private r:Lm2/b;

.field private s:Landroid/app/Activity;

.field private t:Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

.field private final u:Ljava/util/Collection;

.field private volatile v:Z

.field private volatile w:Ljava/lang/Boolean;

.field private final x:Lcom/facebook/react/j;

.field private final y:Lcom/facebook/react/bridge/JSExceptionHandler;

.field private final z:Lcom/facebook/react/bridge/UIManagerProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lm2/b;Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/lang/String;Ljava/util/List;ZLcom/facebook/react/devsupport/F;ZZLcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;Lcom/facebook/react/common/LifecycleState;Lcom/facebook/react/bridge/JSExceptionHandler;LX1/i;ZLX1/b;IILcom/facebook/react/bridge/UIManagerProvider;Ljava/util/Map;Lcom/facebook/react/T$a;LS1/j;LX1/c;Ld2/b;LX1/h;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v14, p8

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    iput-object v2, v1, Lcom/facebook/react/H;->a:Ljava/util/Set;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/facebook/react/H;->f:Ljava/util/Collection;

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, Lcom/facebook/react/H;->o:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lcom/facebook/react/H;->u:Ljava/util/Collection;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/facebook/react/H;->v:Z

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v2, v1, Lcom/facebook/react/H;->w:Ljava/lang/Boolean;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/facebook/react/H;->C:Z

    sget-object v2, Lcom/facebook/react/H;->D:Ljava/lang/String;

    const-string v3, "ReactInstanceManager.ctor()"

    invoke-static {v2, v3}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lcom/facebook/react/H;->K(Landroid/content/Context;)V

    invoke-static/range {p1 .. p1}, Lcom/facebook/react/uimanager/h;->f(Landroid/content/Context;)V

    iput-object v0, v1, Lcom/facebook/react/H;->q:Landroid/content/Context;

    move-object/from16 v2, p2

    iput-object v2, v1, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    move-object/from16 v2, p3

    iput-object v2, v1, Lcom/facebook/react/H;->r:Lm2/b;

    move-object/from16 v2, p4

    iput-object v2, v1, Lcom/facebook/react/H;->e:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    move-object/from16 v2, p5

    iput-object v2, v1, Lcom/facebook/react/H;->g:Lcom/facebook/react/bridge/JSBundleLoader;

    move-object/from16 v5, p6

    iput-object v5, v1, Lcom/facebook/react/H;->h:Ljava/lang/String;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    iput-object v15, v1, Lcom/facebook/react/H;->i:Ljava/util/List;

    iput-boolean v14, v1, Lcom/facebook/react/H;->k:Z

    move/from16 v2, p10

    iput-boolean v2, v1, Lcom/facebook/react/H;->l:Z

    move/from16 v2, p11

    iput-boolean v2, v1, Lcom/facebook/react/H;->m:Z

    const-string v2, "ReactInstanceManager.initDevSupportManager"

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v2}, LP2/a;->c(JLjava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/H;->v()Lcom/facebook/react/devsupport/a0;

    move-result-object v4

    move-object/from16 v2, p9

    move-object/from16 v3, p1

    move/from16 v6, p8

    move-object/from16 v7, p15

    move-object/from16 v8, p17

    move/from16 v9, p18

    move-object/from16 v10, p21

    move-object/from16 v11, p23

    move-wide/from16 v16, v12

    move-object/from16 v12, p24

    move-object/from16 v13, p26

    invoke-interface/range {v2 .. v13}, Lcom/facebook/react/devsupport/F;->a(Landroid/content/Context;Lcom/facebook/react/devsupport/a0;Ljava/lang/String;ZLX1/i;LX1/b;ILjava/util/Map;LS1/j;LX1/c;LX1/h;)LX1/e;

    move-result-object v2

    iput-object v2, v1, Lcom/facebook/react/H;->j:LX1/e;

    invoke-static/range {v16 .. v17}, LP2/a;->g(J)V

    move-object/from16 v3, p12

    iput-object v3, v1, Lcom/facebook/react/H;->n:Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;

    move-object/from16 v3, p13

    iput-object v3, v1, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    new-instance v3, Lcom/facebook/react/j;

    invoke-direct {v3, v0}, Lcom/facebook/react/j;-><init>(Landroid/content/Context;)V

    iput-object v3, v1, Lcom/facebook/react/H;->x:Lcom/facebook/react/j;

    move-object/from16 v0, p14

    iput-object v0, v1, Lcom/facebook/react/H;->y:Lcom/facebook/react/bridge/JSExceptionHandler;

    move-object/from16 v0, p22

    iput-object v0, v1, Lcom/facebook/react/H;->A:Lcom/facebook/react/T$a;

    monitor-enter v15

    :try_start_0
    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v0

    sget-object v3, Lb1/a;->c:LZ0/a;

    const-string v4, "RNCore: Use Split Packages"

    invoke-interface {v0, v3, v4}, La1/b;->b(LZ0/a;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/d;

    new-instance v3, Lcom/facebook/react/H$a;

    invoke-direct {v3, v1}, Lcom/facebook/react/H$a;-><init>(Lcom/facebook/react/H;)V

    move/from16 v4, p16

    move/from16 v5, p19

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/facebook/react/d;-><init>(Lcom/facebook/react/H;Lm2/b;ZI)V

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v14, :cond_0

    new-instance v0, Lcom/facebook/react/g;

    invoke-direct {v0}, Lcom/facebook/react/g;-><init>()V

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    move-object/from16 v0, p7

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :goto_0
    invoke-interface {v15, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p20

    iput-object v0, v1, Lcom/facebook/react/H;->z:Lcom/facebook/react/bridge/UIManagerProvider;

    if-eqz p25, :cond_1

    move-object/from16 v0, p25

    goto :goto_1

    :cond_1
    invoke-static {}, Ld2/a;->b()Ld2/a;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/facebook/react/modules/core/a;->i(Ld2/b;)V

    if-eqz v14, :cond_2

    invoke-interface {v2}, LX1/e;->z()V

    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/H;->o0()V

    return-void

    :goto_2
    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private B(Lcom/facebook/react/uimanager/S;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 4

    .line 1
    const-string v0, "ReactInstanceManager.detachRootViewFromInstance()"

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getState()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getUIManagerType()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getRootViewTag()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    invoke-static {p2, v0}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/UIManager;->stopSurface(I)V

    goto :goto_0

    :cond_1
    const-string p2, "Failed to stop surface, UIManager has already gone away"

    invoke-static {v1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget-object p2, Lcom/facebook/react/H;->D:Ljava/lang/String;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "detachRootViewFromInstance called with ReactRootView with invalid id"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object p2

    const-class v0, Lcom/facebook/react/modules/appregistry/AppRegistry;

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/CatalystInstance;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/modules/appregistry/AppRegistry;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getRootViewTag()I

    move-result v0

    invoke-interface {p2, v0}, Lcom/facebook/react/modules/appregistry/AppRegistry;->unmountApplicationComponentAtRootTag(I)V

    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/react/H;->u(Lcom/facebook/react/uimanager/S;)V

    return-void
.end method

.method private E()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->e:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    return-object v0
.end method

.method private F()Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->t:Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    new-instance v1, Lcom/facebook/react/H$e;

    invoke-direct {v1, p0}, Lcom/facebook/react/H$e;-><init>(Lcom/facebook/react/H;)V

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;-><init>(Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;)V

    iput-object v0, p0, Lcom/facebook/react/H;->t:Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/H;->t:Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    return-object v0
.end method

.method static K(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/soloader/SoLoader;->m(Landroid/content/Context;Z)V

    return-void
.end method

.method private L()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/H;->r:Lm2/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm2/b;->c()V

    :cond_0
    return-void
.end method

.method private static synthetic M(ILcom/facebook/react/uimanager/S;)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    const-string v2, "pre_rootView.onAttachedToReactInstance"

    invoke-static {v0, v1, v2, p0}, LP2/a;->e(JLjava/lang/String;I)V

    const/16 p0, 0x65

    invoke-interface {p1, p0}, Lcom/facebook/react/uimanager/S;->c(I)V

    return-void
.end method

.method private synthetic N()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->c:Lcom/facebook/react/H$f;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/react/H;->q0(Lcom/facebook/react/H$f;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/H;->c:Lcom/facebook/react/H$f;

    :cond_0
    return-void
.end method

.method private synthetic O(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/react/H;->r0(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/JSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic P(Lcom/facebook/react/H$f;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->REACT_CONTEXT_THREAD_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    iget-object v0, p0, Lcom/facebook/react/H;->w:Ljava/lang/Boolean;

    monitor-enter v0

    :catch_0
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/H;->w:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    iget-object v1, p0, Lcom/facebook/react/H;->w:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/H;->v:Z

    const/4 v0, -0x4

    const/4 v1, 0x0

    :try_start_3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->VM_INIT:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    invoke-virtual {p1}, Lcom/facebook/react/H$f;->b()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/bridge/JavaScriptExecutorFactory;->create()Lcom/facebook/react/bridge/JavaScriptExecutor;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/react/H$f;->a()Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/H;->w(Lcom/facebook/react/bridge/JavaScriptExecutor;Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    iput-object v1, p0, Lcom/facebook/react/H;->d:Ljava/lang/Thread;

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->PRE_SETUP_REACT_CONTEXT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    new-instance v0, Lcom/facebook/react/C;

    invoke-direct {v0, p0}, Lcom/facebook/react/C;-><init>(Lcom/facebook/react/H;)V

    new-instance v1, Lcom/facebook/react/D;

    invoke-direct {v1, p0, p1}, Lcom/facebook/react/D;-><init>(Lcom/facebook/react/H;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/JSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    :goto_1
    return-void

    :catch_2
    move-exception p1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/H;->v:Z

    iput-object v1, p0, Lcom/facebook/react/H;->d:Ljava/lang/Thread;

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/JSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    return-void

    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method private synthetic Q([Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H;->T()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    invoke-interface {v2, p2}, Lcom/facebook/react/z;->a(Lcom/facebook/react/bridge/ReactContext;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static synthetic R()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CHANGE_THREAD_PRIORITY:Lcom/facebook/react/bridge/ReactMarkerConstants;

    const-string v1, "js_default"

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic S()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    return-void
.end method

.method private declared-synchronized T()V
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/react/H;->W(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized U()V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v2, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    iput-object v1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v2, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    if-ne v1, v2, :cond_2

    iget-boolean v1, p0, Lcom/facebook/react/H;->m:Z

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->onHostDestroy(Z)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/H;->z()V

    :cond_2
    :goto_1
    sget-object v0, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    iput-object v0, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized V()V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v2, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    :goto_0
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v2, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v0, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    iput-object v0, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized W(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    if-eq p1, v1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    if-ne p1, v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    :cond_1
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    iput-object p1, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public static synthetic a()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/facebook/react/H;->S()V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H;->N()V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/H;Lcom/facebook/react/H$f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/H;->P(Lcom/facebook/react/H$f;)V

    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/H;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/H;->O(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public static synthetic e(ILcom/facebook/react/uimanager/S;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/H;->M(ILcom/facebook/react/uimanager/S;)V

    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/H;[Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/H;->Q([Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public static synthetic g()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/facebook/react/H;->R()V

    return-void
.end method

.method private g0()V
    .locals 2

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "ReactInstanceManager.onJSBundleLoadedFromServer()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0}, LX1/e;->v()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v1}, LX1/e;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/JSBundleLoader;->createCachedBundleFromNetworkLoader(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/H;->e:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    invoke-direct {p0, v1, v0}, Lcom/facebook/react/H;->l0(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;)V

    return-void
.end method

.method static bridge synthetic h(Lcom/facebook/react/H;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/facebook/react/H;)LX1/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/H;->j:LX1/e;

    return-object p0
.end method

.method static bridge synthetic j(Lcom/facebook/react/H;)Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/H;->t:Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    return-object p0
.end method

.method private j0(Lcom/facebook/react/M;Lcom/facebook/react/k;)V
    .locals 5

    .line 1
    const-string v0, "processPackage"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "className"

    invoke-virtual {v0, v4, v3}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    instance-of v0, p1, Lcom/facebook/react/P;

    if-eqz v0, :cond_0

    move-object v3, p1

    check-cast v3, Lcom/facebook/react/P;

    invoke-interface {v3}, Lcom/facebook/react/P;->a()V

    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/react/k;->b(Lcom/facebook/react/M;)V

    if-eqz v0, :cond_1

    check-cast p1, Lcom/facebook/react/P;

    invoke-interface {p1}, Lcom/facebook/react/P;->b()V

    :cond_1
    invoke-static {v1, v2}, LP2/b;->b(J)LP2/b$a;

    move-result-object p1

    invoke-virtual {p1}, LP2/b$a;->c()V

    return-void
.end method

.method static bridge synthetic k(Lcom/facebook/react/H;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/H;->C:Z

    return p0
.end method

.method private k0(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/bridge/NativeModuleRegistry;
    .locals 5

    .line 1
    new-instance v0, Lcom/facebook/react/k;

    invoke-direct {v0, p1, p0}, Lcom/facebook/react/k;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/H;)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->PROCESS_PACKAGES_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    iget-object p1, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    monitor-enter p1

    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/M;

    const-string v4, "createAndProcessCustomReactPackage"

    invoke-static {v2, v3, v4}, LP2/a;->c(JLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/H;->j0(Lcom/facebook/react/M;Lcom/facebook/react/k;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2, v3}, LP2/a;->g(J)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-static {v2, v3}, LP2/a;->g(J)V

    throw p2

    :cond_0
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->PROCESS_PACKAGES_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->BUILD_NATIVE_MODULE_REGISTRY_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string p1, "buildNativeModuleRegistry"

    invoke-static {v2, v3, p1}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_3
    invoke-virtual {v0}, Lcom/facebook/react/k;->a()Lcom/facebook/react/bridge/NativeModuleRegistry;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-static {v2, v3}, LP2/a;->g(J)V

    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->BUILD_NATIVE_MODULE_REGISTRY_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-object p1

    :catchall_2
    move-exception p1

    invoke-static {v2, v3}, LP2/a;->g(J)V

    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->BUILD_NATIVE_MODULE_REGISTRY_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    throw p1

    :goto_1
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p2
.end method

.method static bridge synthetic l(Lcom/facebook/react/H;)Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H;->E()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    move-result-object p0

    return-object p0
.end method

.method private l0(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;)V
    .locals 2

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "ReactInstanceManager.recreateReactContextInBackground()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    new-instance v0, Lcom/facebook/react/H$f;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/H$f;-><init>(Lcom/facebook/react/H;Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;)V

    iget-object p1, p0, Lcom/facebook/react/H;->d:Ljava/lang/Thread;

    if-nez p1, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/react/H;->q0(Lcom/facebook/react/H$f;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/facebook/react/H;->c:Lcom/facebook/react/H$f;

    :goto_0
    return-void
.end method

.method static bridge synthetic m(Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H;->L()V

    return-void
.end method

.method private m0()V
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/H;->D:Ljava/lang/String;

    const-string v1, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v0

    sget-object v1, Lb1/a;->c:LZ0/a;

    const-string v2, "RNCore: load from BundleLoader"

    invoke-interface {v0, v1, v2}, La1/b;->b(LZ0/a;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/H;->e:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    iget-object v1, p0, Lcom/facebook/react/H;->g:Lcom/facebook/react/bridge/JSBundleLoader;

    invoke-direct {p0, v0, v1}, Lcom/facebook/react/H;->l0(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;)V

    return-void
.end method

.method static bridge synthetic n(Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H;->g0()V

    return-void
.end method

.method private n0()V
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/H;->D:Ljava/lang/String;

    const-string v1, "ReactInstanceManager.recreateReactContextInBackgroundInner()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v0

    sget-object v1, Lb1/a;->c:LZ0/a;

    const-string v2, "RNCore: recreateReactContextInBackground"

    invoke-interface {v0, v1, v2}, La1/b;->b(LZ0/a;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean v0, p0, Lcom/facebook/react/H;->k:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/H;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0}, LX1/e;->w()Ln2/a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, LP2/a;->h(J)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/H;->g:Lcom/facebook/react/bridge/JSBundleLoader;

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0}, LX1/e;->q()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/H;->j:LX1/e;

    new-instance v2, Lcom/facebook/react/H$c;

    invoke-direct {v2, p0, v0}, Lcom/facebook/react/H$c;-><init>(Lcom/facebook/react/H;Ln2/a;)V

    invoke-interface {v1, v2}, LX1/e;->u(LX1/g;)V

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/H;->m0()V

    return-void
.end method

.method static bridge synthetic o(Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H;->m0()V

    return-void
.end method

.method private o0()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Exception;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    :try_start_0
    const-class v1, Lcom/facebook/react/H;

    const-string v2, "I"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "ReactInstanceHolder"

    const-string v2, "Failed to set cxx error handler function"

    invoke-static {v1, v2, v0}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->setHandleErrorFunc(Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    return-void
.end method

.method static bridge synthetic p(Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H;->u0()V

    return-void
.end method

.method private q0(Lcom/facebook/react/H$f;)V
    .locals 4

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "ReactInstanceManager.runCreateReactContextOnNewThread()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->REACT_BRIDGE_LOADING_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    iget-object v0, p0, Lcom/facebook/react/H;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/H;->o:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    invoke-direct {p0, v2}, Lcom/facebook/react/H;->t0(Lcom/facebook/react/bridge/ReactContext;)V

    iput-object v3, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/facebook/react/A;

    invoke-direct {v1, p0, p1}, Lcom/facebook/react/A;-><init>(Lcom/facebook/react/H;Lcom/facebook/react/H$f;)V

    const-string p1, "create_react_context"

    invoke-direct {v0, v3, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/react/H;->d:Ljava/lang/Thread;

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->REACT_CONTEXT_THREAD_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    iget-object p1, p0, Lcom/facebook/react/H;->d:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method private r0(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 5

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "ReactInstanceManager.setupReactContext()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->PRE_SETUP_REACT_CONTEXT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->SETUP_REACT_CONTEXT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string v0, "setupReactContext"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/H;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v3, p0, Lcom/facebook/react/H;->o:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/bridge/ReactContext;

    iput-object v4, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object v3

    invoke-static {v3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/bridge/CatalystInstance;

    invoke-interface {v3}, Lcom/facebook/react/bridge/CatalystInstance;->initialize()V

    iget-object v4, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v4, p1}, LX1/e;->p(Lcom/facebook/react/bridge/ReactContext;)V

    iget-object v4, p0, Lcom/facebook/react/H;->x:Lcom/facebook/react/j;

    invoke-virtual {v4, v3}, Lcom/facebook/react/j;->a(Lcom/facebook/react/bridge/MemoryPressureListener;)V

    sget-object v3, Lcom/facebook/react/bridge/ReactMarkerConstants;->ATTACH_MEASURED_ROOT_VIEWS_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v3}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    iget-object v3, p0, Lcom/facebook/react/H;->a:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/uimanager/S;

    invoke-direct {p0, v4}, Lcom/facebook/react/H;->s(Lcom/facebook/react/uimanager/S;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object v3, Lcom/facebook/react/bridge/ReactMarkerConstants;->ATTACH_MEASURED_ROOT_VIEWS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v3}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/facebook/react/H;->u:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Lcom/facebook/react/z;

    iget-object v3, p0, Lcom/facebook/react/H;->u:Ljava/util/Collection;

    invoke-interface {v3, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/z;

    new-instance v3, Lcom/facebook/react/E;

    invoke-direct {v3, p0, v0, p1}, Lcom/facebook/react/E;-><init>(Lcom/facebook/react/H;[Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-static {v3}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    new-instance v0, Lcom/facebook/react/F;

    invoke-direct {v0}, Lcom/facebook/react/F;-><init>()V

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->runOnJSQueueThread(Ljava/lang/Runnable;)Z

    new-instance v0, Lcom/facebook/react/G;

    invoke-direct {v0}, Lcom/facebook/react/G;-><init>()V

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->SETUP_REACT_CONTEXT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->REACT_BRIDGE_LOADING_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method private s(Lcom/facebook/react/uimanager/S;)V
    .locals 11

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "ReactInstanceManager.attachRootViewToInstance()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getState()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "attachRootViewToInstance"

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v0}, LP2/a;->c(JLjava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getUIManagerType()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getAppProperties()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getUIManagerType()I

    move-result v1

    const/4 v6, 0x2

    if-ne v1, v6, :cond_2

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getRootViewGroup()Landroid/view/ViewGroup;

    move-result-object v6

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getJSModuleName()Ljava/lang/String;

    move-result-object v7

    if-nez v0, :cond_1

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getWidthMeasureSpec()I

    move-result v9

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getHeightMeasureSpec()I

    move-result v10

    invoke-interface/range {v5 .. v10}, Lcom/facebook/react/bridge/UIManager;->startSurface(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)I

    move-result v0

    invoke-interface {p1, v2}, Lcom/facebook/react/uimanager/S;->setShouldLogContentAppeared(Z)V

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getRootViewGroup()Landroid/view/ViewGroup;

    move-result-object v1

    if-nez v0, :cond_3

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    :goto_2
    invoke-interface {v5, v1, v0}, Lcom/facebook/react/bridge/UIManager;->addRootView(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;)I

    move-result v0

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/S;->setRootViewTag(I)V

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->e()V

    :goto_3
    const-string v1, "pre_rootView.onAttachedToReactInstance"

    invoke-static {v3, v4, v1, v0}, LP2/a;->a(JLjava/lang/String;I)V

    new-instance v1, Lcom/facebook/react/B;

    invoke-direct {v1, v0, p1}, Lcom/facebook/react/B;-><init>(ILcom/facebook/react/uimanager/S;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    invoke-static {v3, v4}, LP2/a;->g(J)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to attach a rootView to ReactInstance when UIManager is not properly initialized."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static t()Lcom/facebook/react/K;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/K;

    invoke-direct {v0}, Lcom/facebook/react/K;-><init>()V

    return-object v0
.end method

.method private t0(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 3

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "ReactInstanceManager.tearDownReactContext()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/H;->b:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/H;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/H;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/uimanager/S;

    invoke-direct {p0, v2, p1}, Lcom/facebook/react/H;->B(Lcom/facebook/react/uimanager/S;Lcom/facebook/react/bridge/ReactContext;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/facebook/react/H;->x:Lcom/facebook/react/j;

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/j;->d(Lcom/facebook/react/bridge/MemoryPressureListener;)V

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->destroy()V

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0, p1}, LX1/e;->D(Lcom/facebook/react/bridge/ReactContext;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private u(Lcom/facebook/react/uimanager/S;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getState()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    invoke-interface {p1}, Lcom/facebook/react/uimanager/S;->getRootViewGroup()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    return-void
.end method

.method private u0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "toggleElementInspector"

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/facebook/react/H;->D:Ljava/lang/String;

    new-instance v1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v2, "Cannot toggleElementInspector, CatalystInstance not available"

    invoke-direct {v1, v2}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private v()Lcom/facebook/react/devsupport/a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/H$b;

    invoke-direct {v0, p0}, Lcom/facebook/react/H$b;-><init>(Lcom/facebook/react/H;)V

    return-object v0
.end method

.method private w(Lcom/facebook/react/bridge/JavaScriptExecutor;Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 7

    .line 1
    const-string v0, "ReactNative"

    const-string v1, "ReactInstanceManager.createReactContext()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_REACT_CONTEXT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-virtual {p1}, Lcom/facebook/react/bridge/JavaScriptExecutor;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/bridge/BridgeReactContext;

    iget-object v1, p0, Lcom/facebook/react/H;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/BridgeReactContext;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/facebook/react/H;->y:Lcom/facebook/react/bridge/JSExceptionHandler;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/H;->j:LX1/e;

    :goto_0
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->setJSExceptionHandler(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    iget-object v2, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    invoke-direct {p0, v0, v2}, Lcom/facebook/react/H;->k0(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/bridge/NativeModuleRegistry;

    move-result-object v2

    new-instance v3, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;

    invoke-direct {v3}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;-><init>()V

    invoke-static {}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;->createDefault()Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;->setReactQueueConfigurationSpec(Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;)Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;->setJSExecutor(Lcom/facebook/react/bridge/JavaScriptExecutor;)Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;->setRegistry(Lcom/facebook/react/bridge/NativeModuleRegistry;)Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;->setJSBundleLoader(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;->setJSExceptionHandler(Lcom/facebook/react/bridge/JSExceptionHandler;)Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;

    move-result-object p1

    invoke-direct {p0}, Lcom/facebook/react/H;->F()Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;->setInspectorTarget(Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;)Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;

    move-result-object p1

    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_CATALYST_INSTANCE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string p2, "createCatalystInstance"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p2}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/react/bridge/CatalystInstanceImpl$Builder;->build()Lcom/facebook/react/bridge/CatalystInstanceImpl;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_CATALYST_INSTANCE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/BridgeReactContext;->initializeWithInstance(Lcom/facebook/react/bridge/CatalystInstance;)V

    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getRuntimeScheduler()Lcom/facebook/react/bridge/RuntimeScheduler;

    sget-boolean p2, Lcom/facebook/react/config/ReactFeatureFlags;->useTurboModules:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/facebook/react/H;->A:Lcom/facebook/react/T$a;

    if-eqz p2, :cond_1

    iget-object v3, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    invoke-virtual {p2, v3}, Lcom/facebook/react/T$a;->c(Ljava/util/List;)Lcom/facebook/react/T$a;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/facebook/react/T$a;->d(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/T$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/facebook/react/T$a;->a()Lcom/facebook/react/T;

    move-result-object p2

    new-instance v3, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;

    move-result-object v4

    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;

    move-result-object v5

    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getNativeMethodCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;

    move-result-object v6

    invoke-direct {v3, v4, p2, v5, v6}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;-><init>(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;)V

    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/CatalystInstance;->setTurboModuleRegistry(Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;)V

    invoke-virtual {v3}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getEagerInitModuleNames()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/facebook/react/H;->z:Lcom/facebook/react/bridge/UIManagerProvider;

    if-eqz p2, :cond_2

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/UIManagerProvider;->createUIManager(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/CatalystInstance;->setFabricUIManager(Lcom/facebook/react/bridge/UIManager;)V

    invoke-interface {p2}, Lcom/facebook/react/bridge/UIManager;->initialize()V

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/CatalystInstance;->setFabricUIManager(Lcom/facebook/react/bridge/UIManager;)V

    :cond_2
    iget-object p2, p0, Lcom/facebook/react/H;->n:Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;

    if-eqz p2, :cond_3

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/CatalystInstance;->addBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V

    :cond_3
    invoke-static {v1, v2}, LP2/a;->h(J)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "__RCTProfileIsProfiling"

    const-string v3, "true"

    invoke-interface {p1, p2, v3}, Lcom/facebook/react/bridge/CatalystInstance;->setGlobalVariable(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->PRE_RUN_JS_BUNDLE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string p2, "runJSBundle"

    invoke-static {v1, v2, p2}, LP2/a;->c(JLjava/lang/String;)V

    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->runJSBundle()V

    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_CATALYST_INSTANCE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    throw p1
.end method

.method private z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->t:Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/H;->t:Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    :cond_0
    return-void
.end method


# virtual methods
.method public A(Lcom/facebook/react/uimanager/S;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/H;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/H;->B(Lcom/facebook/react/uimanager/S;Lcom/facebook/react/bridge/ReactContext;)V

    :cond_1
    return-void
.end method

.method public C()Lcom/facebook/react/bridge/ReactContext;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public D()LX1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public G(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_VIEW_MANAGERS_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string v0, "createAllViewManagers"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/H;->B:Ljava/util/List;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p0, Lcom/facebook/react/H;->B:Ljava/util/List;

    if-nez v3, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/react/M;

    invoke-interface {v5, p1}, Lcom/facebook/react/M;->createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iput-object v3, p0, Lcom/facebook/react/H;->B:Ljava/util/List;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_VIEW_MANAGERS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-object v3

    :cond_1
    :try_start_2
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    iget-object p1, p0, Lcom/facebook/react/H;->B:Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_VIEW_MANAGERS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-object p1

    :goto_3
    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_VIEW_MANAGERS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    throw p1
.end method

.method public H()Ljava/util/Collection;
    .locals 10

    .line 1
    const-string v0, "ReactInstanceManager.getViewManagerNames"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/H;->f:Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/react/H;->o:Ljava/lang/Object;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_3

    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v0, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v4, p0, Lcom/facebook/react/H;->f:Ljava/util/Collection;

    if-nez v4, :cond_5

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    iget-object v5, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/M;

    const-string v7, "ReactInstanceManager.getViewManagerName"

    invoke-static {v1, v2, v7}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v7

    const-string v8, "Package"

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v7

    invoke-virtual {v7}, LP2/b$a;->c()V

    instance-of v7, v6, Lcom/facebook/react/Z;

    if-eqz v7, :cond_2

    check-cast v6, Lcom/facebook/react/Z;

    invoke-interface {v6, v3}, Lcom/facebook/react/Z;->getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v4, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :catchall_0
    move-exception v3

    goto :goto_2

    :cond_2
    const-string v7, "ReactNative"

    const-string v8, "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded"

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v8, v6}, LP0/a;->I(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    invoke-static {v1, v2}, LP2/a;->g(J)V

    goto :goto_0

    :cond_4
    iput-object v4, p0, Lcom/facebook/react/H;->f:Ljava/util/Collection;

    :cond_5
    iget-object v3, p0, Lcom/facebook/react/H;->f:Ljava/util/Collection;

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-object v3

    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v3

    goto :goto_4

    :cond_6
    :goto_3
    :try_start_7
    const-string v3, "ReactNative"

    const-string v4, "Calling getViewManagerNames without active context"

    invoke-static {v3, v4}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-object v3

    :goto_4
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :goto_5
    invoke-static {v1, v2}, LP2/a;->g(J)V

    throw v0
.end method

.method public I(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/JSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    return-void
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/H;->v:Z

    return v0
.end method

.method public X(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/bridge/ReactContext;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public Y()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/H;->p:Lcom/facebook/react/bridge/ReactContext;

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/react/H;->D:Ljava/lang/String;

    const-string v1, "Instance detached from instance manager"

    invoke-static {v0, v1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/H;->L()V

    goto :goto_0

    :cond_0
    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;->emitHardwareBackPressed()V

    :cond_1
    :goto_0
    return-void
.end method

.method public Z(Landroid/content/Context;Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p2

    if-eqz p2, :cond_0

    const-class v0, Lcom/facebook/react/modules/appearance/AppearanceModule;

    invoke-virtual {p2, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/modules/appearance/AppearanceModule;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lcom/facebook/react/modules/appearance/AppearanceModule;->onConfigurationChanged(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public a0()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean v0, p0, Lcom/facebook/react/H;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LX1/e;->s(Z)V

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/H;->U()V

    iget-boolean v0, p0, Lcom/facebook/react/H;->m:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    :cond_1
    return-void
.end method

.method public b0(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/H;->a0()V

    :cond_0
    return-void
.end method

.method public c0()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/H;->r:Lm2/b;

    iget-boolean v0, p0, Lcom/facebook/react/H;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LX1/e;->s(Z)V

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/H;->V()V

    return-void
.end method

.method public d0(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/H;->l:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, LO1/a;->a(Z)V

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    if-eqz v0, :cond_3

    if-ne p1, v0, :cond_2

    move v1, v2

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Paused activity: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, LO1/a;->b(ZLjava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/H;->c0()V

    return-void
.end method

.method public e0(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iput-object p1, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    iget-boolean v0, p0, Lcom/facebook/react/H;->k:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/view/H;->S(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/facebook/react/H$d;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/H$d;-><init>(Lcom/facebook/react/H;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lcom/facebook/react/H;->l:Z

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {p1, v0}, LX1/e;->s(Z)V

    :cond_2
    :goto_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/facebook/react/H;->W(Z)V

    return-void
.end method

.method public f0(Landroid/app/Activity;Lm2/b;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/H;->r:Lm2/b;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/facebook/react/H;->e0(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h0(Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/facebook/react/H;->D:Ljava/lang/String;

    const-string v0, "Instance detached from instance manager"

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "android.nfc.action.NDEF_DISCOVERED"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;->emitNewIntentReceived(Landroid/net/Uri;)V

    :cond_2
    iget-object v1, p0, Lcom/facebook/react/H;->s:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/bridge/ReactContext;->onNewIntent(Landroid/app/Activity;Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method public i0(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->onWindowFocusChange(Z)V

    :cond_0
    return-void
.end method

.method public p0(Lcom/facebook/react/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->u:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public q(Lcom/facebook/react/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->u:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(Lcom/facebook/react/uimanager/S;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/H;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/react/H;->u(Lcom/facebook/react/uimanager/S;)V

    goto :goto_0

    :cond_0
    const-string v0, "ReactNative"

    const-string v1, "ReactRoot was attached multiple times"

    invoke-static {v0, v1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/H;->d:Ljava/lang/Thread;

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/facebook/react/H;->s(Lcom/facebook/react/uimanager/S;)V

    :cond_1
    return-void
.end method

.method public s0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/H;->j:LX1/e;

    invoke-interface {v0}, LX1/e;->C()V

    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/H;->D:Ljava/lang/String;

    const-string v1, "ReactInstanceManager.createReactContextInBackground()"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean v0, p0, Lcom/facebook/react/H;->v:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/H;->v:Z

    invoke-direct {p0}, Lcom/facebook/react/H;->n0()V

    :cond_0
    return-void
.end method

.method public y(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v3, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    monitor-enter v3

    :try_start_1
    iget-object v0, p0, Lcom/facebook/react/H;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/M;

    instance-of v5, v4, Lcom/facebook/react/Z;

    if-eqz v5, :cond_1

    check-cast v4, Lcom/facebook/react/Z;

    invoke-interface {v4, v1, p1}, Lcom/facebook/react/Z;->createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object v4

    if-eqz v4, :cond_1

    monitor-exit v3

    return-object v4

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    monitor-exit v3

    return-object v2

    :goto_0
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_3
    :goto_1
    :try_start_2
    monitor-exit v0

    return-object v2

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
