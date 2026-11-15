.class public Lcom/facebook/react/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final B:Ljava/lang/String; = "K"


# instance fields
.field private A:LX1/h;

.field private final a:Ljava/util/List;

.field private b:Ljava/lang/String;

.field private c:Lcom/facebook/react/bridge/JSBundleLoader;

.field private d:Ljava/lang/String;

.field private e:Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;

.field private f:Landroid/app/Application;

.field private g:Z

.field private h:Lcom/facebook/react/devsupport/F;

.field private i:Z

.field private j:Z

.field private k:Lcom/facebook/react/common/LifecycleState;

.field private l:Lcom/facebook/react/bridge/JSExceptionHandler;

.field private m:Landroid/app/Activity;

.field private n:Lm2/b;

.field private o:Z

.field private p:LX1/b;

.field private q:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

.field private r:I

.field private s:I

.field private t:Lcom/facebook/react/bridge/UIManagerProvider;

.field private u:Ljava/util/Map;

.field private v:Lcom/facebook/react/T$a;

.field private w:LS1/j;

.field private x:LX1/c;

.field private y:Lcom/facebook/react/i;

.field private z:Ld2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/K;->a:Ljava/util/List;

    const/4 v0, 0x1

    iput v0, p0, Lcom/facebook/react/K;->r:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/react/K;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/K;->y:Lcom/facebook/react/i;

    iput-object v0, p0, Lcom/facebook/react/K;->z:Ld2/b;

    iput-object v0, p0, Lcom/facebook/react/K;->A:LX1/h;

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 1

    .line 1
    invoke-static {p3}, Lcom/facebook/react/H;->K(Landroid/content/Context;)V

    iget-object p3, p0, Lcom/facebook/react/K;->y:Lcom/facebook/react/i;

    if-nez p3, :cond_1

    :try_start_0
    invoke-static {}, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a()V

    new-instance p3, Lcom/facebook/hermes/reactexecutor/a;

    invoke-direct {p3}, Lcom/facebook/hermes/reactexecutor/a;-><init>()V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    :try_start_1
    invoke-static {}, Lcom/facebook/react/jscexecutor/JSCExecutor;->b()V

    new-instance p3, Lg2/a;

    invoke-direct {p3, p1, p2}, Lg2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1

    return-object p3

    :catch_1
    move-exception p1

    sget-object p2, Lcom/facebook/react/K;->B:Ljava/lang/String;

    const-string p3, "Unable to load neither the Hermes nor the JSC native library. Your application is not built correctly and will fail to execute"

    invoke-static {p2, p3}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "__cxa_bad_typeid"

    invoke-virtual {p2, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    throw p1

    :cond_1
    sget-object v0, Lcom/facebook/react/i;->n:Lcom/facebook/react/i;

    if-ne p3, v0, :cond_2

    invoke-static {}, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a()V

    new-instance p1, Lcom/facebook/hermes/reactexecutor/a;

    invoke-direct {p1}, Lcom/facebook/hermes/reactexecutor/a;-><init>()V

    return-object p1

    :cond_2
    invoke-static {}, Lcom/facebook/react/jscexecutor/JSCExecutor;->b()V

    new-instance p3, Lg2/a;

    invoke-direct {p3, p1, p2}, Lg2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p3
.end method


# virtual methods
.method public a(Lcom/facebook/react/M;)Lcom/facebook/react/K;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/K;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lcom/facebook/react/H;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/react/K;->f:Landroid/app/Application;

    const-string v2, "Application property has not been set with this builder"

    invoke-static {v1, v2}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/facebook/react/K;->k:Lcom/facebook/react/common/LifecycleState;

    sget-object v2, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lcom/facebook/react/K;->m:Landroid/app/Activity;

    const-string v2, "Activity needs to be set if initial lifecycle state is resumed"

    invoke-static {v1, v2}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    iget-boolean v1, v0, Lcom/facebook/react/K;->g:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    iget-object v1, v0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, v0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v2

    :goto_1
    const-string v4, "JS Bundle File or Asset URL has to be provided when dev support is disabled"

    invoke-static {v1, v4}, LO1/a;->b(ZLjava/lang/String;)V

    iget-object v1, v0, Lcom/facebook/react/K;->d:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :cond_4
    :goto_2
    const-string v1, "Either MainModulePath or JS Bundle File needs to be provided"

    invoke-static {v2, v1}, LO1/a;->b(ZLjava/lang/String;)V

    iget-object v1, v0, Lcom/facebook/react/K;->f:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lq2/a;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v31, Lcom/facebook/react/H;

    iget-object v5, v0, Lcom/facebook/react/K;->f:Landroid/app/Application;

    iget-object v6, v0, Lcom/facebook/react/K;->m:Landroid/app/Activity;

    iget-object v7, v0, Lcom/facebook/react/K;->n:Lm2/b;

    iget-object v4, v0, Lcom/facebook/react/K;->q:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    if-nez v4, :cond_5

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v0, v1, v2, v4}, Lcom/facebook/react/K;->c(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    move-result-object v1

    move-object v8, v1

    goto :goto_3

    :cond_5
    move-object v8, v4

    :goto_3
    iget-object v1, v0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    if-nez v1, :cond_6

    iget-object v2, v0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v1, v0, Lcom/facebook/react/K;->f:Landroid/app/Application;

    invoke-static {v1, v2, v3}, Lcom/facebook/react/bridge/JSBundleLoader;->createAssetLoader(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object v1

    :cond_6
    move-object v9, v1

    iget-object v10, v0, Lcom/facebook/react/K;->d:Ljava/lang/String;

    iget-object v11, v0, Lcom/facebook/react/K;->a:Ljava/util/List;

    iget-boolean v12, v0, Lcom/facebook/react/K;->g:Z

    iget-object v1, v0, Lcom/facebook/react/K;->h:Lcom/facebook/react/devsupport/F;

    if-nez v1, :cond_7

    new-instance v1, Lcom/facebook/react/devsupport/e;

    invoke-direct {v1}, Lcom/facebook/react/devsupport/e;-><init>()V

    :cond_7
    move-object v13, v1

    iget-boolean v14, v0, Lcom/facebook/react/K;->i:Z

    iget-boolean v15, v0, Lcom/facebook/react/K;->j:Z

    iget-object v1, v0, Lcom/facebook/react/K;->e:Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/facebook/react/K;->k:Lcom/facebook/react/common/LifecycleState;

    const-string v2, "Initial lifecycle state was not set"

    invoke-static {v1, v2}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lcom/facebook/react/common/LifecycleState;

    iget-object v1, v0, Lcom/facebook/react/K;->l:Lcom/facebook/react/bridge/JSExceptionHandler;

    move-object/from16 v18, v1

    iget-boolean v1, v0, Lcom/facebook/react/K;->o:Z

    move/from16 v20, v1

    iget-object v1, v0, Lcom/facebook/react/K;->p:LX1/b;

    move-object/from16 v21, v1

    iget v1, v0, Lcom/facebook/react/K;->r:I

    move/from16 v22, v1

    iget v1, v0, Lcom/facebook/react/K;->s:I

    move/from16 v23, v1

    iget-object v1, v0, Lcom/facebook/react/K;->t:Lcom/facebook/react/bridge/UIManagerProvider;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/facebook/react/K;->u:Ljava/util/Map;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/facebook/react/K;->v:Lcom/facebook/react/T$a;

    move-object/from16 v26, v1

    iget-object v1, v0, Lcom/facebook/react/K;->w:LS1/j;

    move-object/from16 v27, v1

    iget-object v1, v0, Lcom/facebook/react/K;->x:LX1/c;

    move-object/from16 v28, v1

    iget-object v1, v0, Lcom/facebook/react/K;->z:Ld2/b;

    move-object/from16 v29, v1

    iget-object v1, v0, Lcom/facebook/react/K;->A:LX1/h;

    move-object/from16 v30, v1

    const/16 v19, 0x0

    move-object/from16 v4, v31

    invoke-direct/range {v4 .. v30}, Lcom/facebook/react/H;-><init>(Landroid/content/Context;Landroid/app/Activity;Lm2/b;Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/lang/String;Ljava/util/List;ZLcom/facebook/react/devsupport/F;ZZLcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;Lcom/facebook/react/common/LifecycleState;Lcom/facebook/react/bridge/JSExceptionHandler;LX1/i;ZLX1/b;IILcom/facebook/react/bridge/UIManagerProvider;Ljava/util/Map;Lcom/facebook/react/T$a;LS1/j;LX1/c;Ld2/b;LX1/h;)V

    return-object v31
.end method

.method public d(Landroid/app/Application;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->f:Landroid/app/Application;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/react/K;
    .locals 3

    .line 1
    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "assets://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    return-object p0
.end method

.method public f(Ld2/b;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->z:Ld2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(LX1/c;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->x:LX1/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public h(Lcom/facebook/react/devsupport/F;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->h:Lcom/facebook/react/devsupport/F;

    return-object p0
.end method

.method public i(Lcom/facebook/react/common/LifecycleState;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->k:Lcom/facebook/react/common/LifecycleState;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/facebook/react/K;
    .locals 1

    .line 1
    const-string v0, "assets://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    return-object p0

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/bridge/JSBundleLoader;->createFileLoader(Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/react/K;->k(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/K;

    move-result-object p1

    return-object p1
.end method

.method public k(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    return-object p0
.end method

.method public l(Lcom/facebook/react/i;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->y:Lcom/facebook/react/i;

    return-object p0
.end method

.method public m(Lcom/facebook/react/bridge/JSExceptionHandler;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->l:Lcom/facebook/react/bridge/JSExceptionHandler;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->d:Ljava/lang/String;

    return-object p0
.end method

.method public o(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->q:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    return-object p0
.end method

.method public p(Z)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/K;->o:Z

    return-object p0
.end method

.method public q(LX1/h;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->A:LX1/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public r(Lcom/facebook/react/T$a;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->v:Lcom/facebook/react/T$a;

    return-object p0
.end method

.method public s(LX1/i;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    return-object p0
.end method

.method public t(Z)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/K;->i:Z

    return-object p0
.end method

.method public u(LS1/j;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->w:LS1/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public v(Lcom/facebook/react/bridge/UIManagerProvider;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->t:Lcom/facebook/react/bridge/UIManagerProvider;

    return-object p0
.end method

.method public w(Z)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/K;->g:Z

    return-object p0
.end method
