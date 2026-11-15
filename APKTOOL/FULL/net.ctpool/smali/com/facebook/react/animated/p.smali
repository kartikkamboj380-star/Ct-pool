.class public Lcom/facebook/react/animated/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/i;


# instance fields
.field private final a:Landroid/util/SparseArray;

.field private final b:Landroid/util/SparseArray;

.field private final c:Landroid/util/SparseArray;

.field private final d:Ljava/util/List;

.field private final e:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private f:I

.field private final g:Ljava/util/List;

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/animated/p;->d:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/animated/p;->f:I

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    iput-boolean v0, p0, Lcom/facebook/react/animated/p;->h:Z

    iput-boolean v0, p0, Lcom/facebook/react/animated/p;->i:Z

    iput-boolean v0, p0, Lcom/facebook/react/animated/p;->j:Z

    iput-object p1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method private C(Ljava/util/List;)V
    .locals 12

    .line 1
    iget v0, p0, Lcom/facebook/react/animated/p;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/facebook/react/animated/p;->f:I

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/facebook/react/animated/p;->f:I

    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/animated/b;

    iget v5, v4, Lcom/facebook/react/animated/b;->c:I

    iget v6, p0, Lcom/facebook/react/animated/p;->f:I

    if-eq v5, v6, :cond_1

    iput v6, v4, Lcom/facebook/react/animated/b;->c:I

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v0, v4}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v4, 0x1

    if-nez v1, :cond_4

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/animated/b;

    iget-object v5, v1, Lcom/facebook/react/animated/b;->a:Ljava/util/List;

    if-eqz v5, :cond_2

    move v5, v2

    :goto_1
    iget-object v6, v1, Lcom/facebook/react/animated/b;->a:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    iget-object v6, v1, Lcom/facebook/react/animated/b;->a:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/animated/b;

    iget v7, v6, Lcom/facebook/react/animated/b;->b:I

    add-int/2addr v7, v4

    iput v7, v6, Lcom/facebook/react/animated/b;->b:I

    iget v7, v6, Lcom/facebook/react/animated/b;->c:I

    iget v8, p0, Lcom/facebook/react/animated/p;->f:I

    if-eq v7, v8, :cond_3

    iput v8, v6, Lcom/facebook/react/animated/b;->c:I

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v0, v6}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iget v1, p0, Lcom/facebook/react/animated/p;->f:I

    add-int/lit8 v5, v1, 0x1

    iput v5, p0, Lcom/facebook/react/animated/p;->f:I

    if-nez v5, :cond_5

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/facebook/react/animated/p;->f:I

    :cond_5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v5, v2

    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/animated/b;

    iget v7, v6, Lcom/facebook/react/animated/b;->b:I

    if-nez v7, :cond_6

    iget v7, v6, Lcom/facebook/react/animated/b;->c:I

    iget v8, p0, Lcom/facebook/react/animated/p;->f:I

    if-eq v7, v8, :cond_6

    iput v8, v6, Lcom/facebook/react/animated/b;->c:I

    add-int/lit8 v5, v5, 0x1

    invoke-interface {v0, v6}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    move v1, v2

    :cond_8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    const-string v7, "NativeAnimatedNodesManager"

    if-nez v6, :cond_d

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/animated/b;

    :try_start_0
    invoke-virtual {v6}, Lcom/facebook/react/animated/b;->h()V

    instance-of v8, v6, Lcom/facebook/react/animated/r;

    if-eqz v8, :cond_9

    move-object v8, v6

    check-cast v8, Lcom/facebook/react/animated/r;

    invoke-virtual {v8}, Lcom/facebook/react/animated/r;->m()V
    :try_end_0
    .catch Lcom/facebook/react/bridge/JSApplicationCausedNativeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v8

    const-string v9, "Native animation workaround, frame lost as result of race condition"

    invoke-static {v7, v9, v8}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_3
    instance-of v7, v6, Lcom/facebook/react/animated/B;

    if-eqz v7, :cond_a

    move-object v7, v6

    check-cast v7, Lcom/facebook/react/animated/B;

    invoke-virtual {v7}, Lcom/facebook/react/animated/B;->m()V

    :cond_a
    iget-object v7, v6, Lcom/facebook/react/animated/b;->a:Ljava/util/List;

    if-eqz v7, :cond_8

    move v7, v2

    :goto_4
    iget-object v8, v6, Lcom/facebook/react/animated/b;->a:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_8

    iget-object v8, v6, Lcom/facebook/react/animated/b;->a:Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/react/animated/b;

    iget v9, v8, Lcom/facebook/react/animated/b;->b:I

    sub-int/2addr v9, v4

    iput v9, v8, Lcom/facebook/react/animated/b;->b:I

    iget v10, v8, Lcom/facebook/react/animated/b;->c:I

    iget v11, p0, Lcom/facebook/react/animated/p;->f:I

    if-eq v10, v11, :cond_b

    if-nez v9, :cond_b

    iput v11, v8, Lcom/facebook/react/animated/b;->c:I

    add-int/lit8 v5, v5, 0x1

    invoke-interface {v0, v8}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    if-ne v10, v11, :cond_c

    add-int/lit8 v1, v1, 0x1

    :cond_c
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_d
    if-eq v3, v5, :cond_13

    iget-boolean v0, p0, Lcom/facebook/react/animated/p;->j:Z

    if-eqz v0, :cond_e

    return-void

    :cond_e
    iput-boolean v4, p0, Lcom/facebook/react/animated/p;->j:Z

    const-string v0, "Detected animation cycle or disconnected graph. "

    invoke-static {v7, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    invoke-virtual {v0}, Lcom/facebook/react/animated/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_f
    if-lez v1, :cond_10

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "cycles ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_7

    :cond_10
    const-string p1, "disconnected regions"

    :goto_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Looks like animated nodes graph has "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", there are "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " but toposort visited only "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/facebook/react/animated/p;->h:Z

    if-eqz p1, :cond_11

    if-nez v1, :cond_11

    new-instance p1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    invoke-direct {p1, v0}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/Throwable;)V

    :goto_8
    invoke-static {v7, p1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9

    :cond_11
    if-eqz p1, :cond_12

    new-instance p1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    invoke-direct {p1, v0}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_12
    throw v0

    :cond_13
    iput-boolean v2, p0, Lcom/facebook/react/animated/p;->j:Z

    :goto_9
    return-void
.end method

.method static bridge synthetic b(Lcom/facebook/react/animated/p;Lcom/facebook/react/uimanager/events/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/p;->n(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method private n(Lcom/facebook/react/uimanager/events/d;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v2

    invoke-static {v1, v2}, Ly2/a;->b(II)I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/d$b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/animated/p;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/animated/EventAnimationDriver;

    iget v4, v3, Lcom/facebook/react/animated/EventAnimationDriver;->mViewTag:I

    iget-object v5, v3, Lcom/facebook/react/animated/EventAnimationDriver;->mEventName:Ljava/lang/String;

    invoke-interface {v0, v4, v5}, Lcom/facebook/react/uimanager/events/d$b;->a(ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v2, v3, Lcom/facebook/react/animated/EventAnimationDriver;->mValueNode:Lcom/facebook/react/animated/B;

    invoke-direct {p0, v2}, Lcom/facebook/react/animated/p;->z(Lcom/facebook/react/animated/b;)V

    invoke-virtual {p1, v3}, Lcom/facebook/react/uimanager/events/d;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    iget-object v2, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    iget-object v3, v3, Lcom/facebook/react/animated/EventAnimationDriver;->mValueNode:Lcom/facebook/react/animated/B;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    iget-object p1, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/facebook/react/animated/p;->C(Ljava/util/List;)V

    iget-object p1, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_4
    return-void
.end method

.method private q(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "on"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "top"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private z(Lcom/facebook/react/animated/b;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    iget-object v3, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/animated/e;

    iget-object v4, v3, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Lcom/facebook/react/animated/e;->c:Lcom/facebook/react/bridge/Callback;

    const-string v5, "value"

    const-string v6, "finished"

    if-eqz v4, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v4

    invoke-interface {v4, v6, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    iget-object v6, v3, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-wide v6, v6, Lcom/facebook/react/animated/B;->e:D

    invoke-interface {v4, v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object v3, v3, Lcom/facebook/react/animated/e;->c:Lcom/facebook/react/bridge/Callback;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz v4, :cond_2

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v4

    const-string v7, "animationId"

    iget v8, v3, Lcom/facebook/react/animated/e;->d:I

    invoke-interface {v4, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-interface {v4, v6, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    iget-object v3, v3, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-wide v6, v3, Lcom/facebook/react/animated/B;->e:D

    invoke-interface {v4, v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    if-nez v0, :cond_1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v0

    :cond_1
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    :cond_2
    :goto_1
    iget-object v3, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->removeAt(I)V

    add-int/lit8 v2, v2, -0x1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-string v1, "onNativeAnimatedModuleAnimationFinished"

    invoke-virtual {p1, v1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/facebook/react/animated/B;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/B;->n(Lcom/facebook/react/animated/c;)V

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startListeningToAnimatedNodeValue: Animated node ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist, or is not a \'value\' node"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public B(ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/facebook/react/animated/d;

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/react/animated/p;->z(Lcom/facebook/react/animated/b;)V

    move-object v1, v0

    check-cast v1, Lcom/facebook/react/animated/d;

    invoke-interface {v1, p2}, Lcom/facebook/react/animated/d;->a(Lcom/facebook/react/bridge/ReadableMap;)V

    iget-object p2, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateAnimatedNode: Animated node ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a(Lcom/facebook/react/uimanager/events/d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->isOnUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/react/animated/p;->n(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/react/animated/p$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/animated/p$a;-><init>(Lcom/facebook/react/animated/p;Lcom/facebook/react/uimanager/events/d;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public c(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 4

    .line 1
    const-string v0, "animatedValueTag"

    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/animated/b;

    if-eqz v1, :cond_2

    instance-of v0, v1, Lcom/facebook/react/animated/B;

    if-eqz v0, :cond_1

    const-string v0, "nativeEventPath"

    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object p3

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {p3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/p;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lcom/facebook/react/animated/EventAnimationDriver;

    check-cast v1, Lcom/facebook/react/animated/B;

    invoke-direct {p3, p2, p1, v0, v1}, Lcom/facebook/react/animated/EventAnimationDriver;-><init>(Ljava/lang/String;ILjava/util/List;Lcom/facebook/react/animated/B;)V

    iget-object p1, p0, Lcom/facebook/react/animated/p;->d:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance p3, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "addAnimatedEventToView: Animated node on view ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] connected to event handler ("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") should be of type "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p1, Lcom/facebook/react/animated/B;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_2
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "addAnimatedEventToView: Animated node with tag ["

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] does not exist"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_3

    instance-of v1, v0, Lcom/facebook/react/animated/r;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz v1, :cond_1

    invoke-static {v1, p2}, Lcom/facebook/react/uimanager/k0;->i(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    const-string p2, "NativeAnimatedNodesManager"

    invoke-static {p2, p1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    move-object v2, v0

    check-cast v2, Lcom/facebook/react/animated/r;

    invoke-virtual {v2, p2, v1}, Lcom/facebook/react/animated/r;->i(ILcom/facebook/react/bridge/UIManager;)V

    iget-object p2, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connectAnimatedNodeToView: Animated node connected to view ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] should be of type "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p2, Lcom/facebook/react/animated/r;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connectAnimatedNodeToView: Animated node with tag ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public e(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    const-string v1, "] does not exist"

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/animated/b;

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/b;->b(Lcom/facebook/react/animated/b;)V

    iget-object v0, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "connectAnimatedNodes: Animated node with tag (child) ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "connectAnimatedNodes: Animated node with tag (parent) ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public f(ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    const-string v0, "type"

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "style"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/facebook/react/animated/u;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/u;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto/16 :goto_0

    :cond_0
    const-string v1, "value"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lcom/facebook/react/animated/B;

    invoke-direct {v0, p2}, Lcom/facebook/react/animated/B;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_0

    :cond_1
    const-string v1, "color"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Lcom/facebook/react/animated/f;

    iget-object v1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {v0, p2, p0, v1}, Lcom/facebook/react/animated/f;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    goto/16 :goto_0

    :cond_2
    const-string v1, "props"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Lcom/facebook/react/animated/r;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/r;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto/16 :goto_0

    :cond_3
    const-string v1, "interpolation"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v0, Lcom/facebook/react/animated/k;

    invoke-direct {v0, p2}, Lcom/facebook/react/animated/k;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_0

    :cond_4
    const-string v1, "addition"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v0, Lcom/facebook/react/animated/a;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/a;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto/16 :goto_0

    :cond_5
    const-string v1, "subtraction"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v0, Lcom/facebook/react/animated/v;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/v;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_6
    const-string v1, "division"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v0, Lcom/facebook/react/animated/i;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/i;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_7
    const-string v1, "multiplication"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v0, Lcom/facebook/react/animated/m;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/m;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_8
    const-string v1, "modulus"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v0, Lcom/facebook/react/animated/l;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/l;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_9
    const-string v1, "diffclamp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v0, Lcom/facebook/react/animated/h;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/h;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_a
    const-string v1, "transform"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v0, Lcom/facebook/react/animated/y;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/y;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_b
    const-string v1, "tracking"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v0, Lcom/facebook/react/animated/w;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/w;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_c
    const-string v1, "object"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v0, Lcom/facebook/react/animated/q;

    invoke-direct {v0, p2, p0}, Lcom/facebook/react/animated/q;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V

    :goto_0
    iput p1, v0, Lcom/facebook/react/animated/b;->d:I

    iget-object p2, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object p2, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_d
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported node type: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createAnimatedNode: Animated node ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] already exists"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public g(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_1

    instance-of p1, v0, Lcom/facebook/react/animated/r;

    if-eqz p1, :cond_0

    check-cast v0, Lcom/facebook/react/animated/r;

    invoke-virtual {v0, p2}, Lcom/facebook/react/animated/r;->j(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "disconnectAnimatedNodeFromView: Animated node connected to view ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] should be of type "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p2, Lcom/facebook/react/animated/r;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "disconnectAnimatedNodeFromView: Animated node with tag ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public h(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    const-string v1, "] does not exist"

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/animated/b;

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/b;->g(Lcom/facebook/react/animated/b;)V

    iget-object v0, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "disconnectAnimatedNodes: Animated node with tag (child) ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "disconnectAnimatedNodes: Animated node with tag (parent) ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    iget-object v0, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public j(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/facebook/react/animated/B;

    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->i()V

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "extractAnimatedNodeOffset: Animated node ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist, or is not a \'value\' node"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/facebook/react/animated/B;

    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->j()V

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "flattenAnimatedNodeOffset: Animated node ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist, or is not a \'value\' node"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l(I)Lcom/facebook/react/animated/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/animated/b;

    return-object p1
.end method

.method public m(ILcom/facebook/react/bridge/Callback;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_2

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/facebook/react/animated/B;

    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v0

    if-eqz p2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    const-string v2, "tag"

    invoke-interface {p2, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string p1, "value"

    invoke-interface {p2, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object p1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-string v0, "onNativeAnimatedModuleGetValue"

    invoke-virtual {p1, v0, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getValue: Animated node with tag ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist or is not a \'value\' node"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public p(I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-boolean v1, p0, Lcom/facebook/react/animated/p;->h:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/facebook/react/animated/p;->i:Z

    if-eqz v1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v1, p1}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1}, Lcom/facebook/react/bridge/UIManager;->getEventDispatcher()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/events/e;

    invoke-interface {v1, p0}, Lcom/facebook/react/uimanager/events/e;->b(Lcom/facebook/react/uimanager/events/i;)V

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    iput-boolean v1, p0, Lcom/facebook/react/animated/p;->h:Z

    goto :goto_1

    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/animated/p;->i:Z

    :cond_3
    :goto_1
    return-void
.end method

.method public r(ILjava/lang/String;I)V
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/p;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/facebook/react/animated/p;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/animated/EventAnimationDriver;

    iget-object v2, v1, Lcom/facebook/react/animated/EventAnimationDriver;->mEventName:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, v1, Lcom/facebook/react/animated/EventAnimationDriver;->mViewTag:I

    if-ne p1, v2, :cond_0

    iget-object v1, v1, Lcom/facebook/react/animated/EventAnimationDriver;->mValueNode:Lcom/facebook/react/animated/B;

    iget v1, v1, Lcom/facebook/react/animated/b;->d:I

    if-ne p3, v1, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    :cond_1
    return-void
.end method

.method public s(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/animated/b;

    if-nez p1, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/facebook/react/animated/r;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/facebook/react/animated/r;

    invoke-virtual {p1}, Lcom/facebook/react/animated/r;->l()V

    return-void

    :cond_1
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Animated node connected to view [?] should be of type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lcom/facebook/react/animated/r;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(J)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/animated/b;

    iget-object v3, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    move v1, v0

    :goto_1
    iget-object v2, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/animated/e;

    invoke-virtual {v2, p1, p2}, Lcom/facebook/react/animated/e;->b(J)V

    iget-object v4, v2, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-object v5, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v2, v2, Lcom/facebook/react/animated/e;->a:Z

    if-eqz v2, :cond_1

    move v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/facebook/react/animated/p;->C(Ljava/util/List;)V

    iget-object p1, p0, Lcom/facebook/react/animated/p;->g:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    if-eqz v1, :cond_8

    iget-object p1, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    sub-int/2addr p1, v3

    const/4 p2, 0x0

    :goto_2
    if-ltz p1, :cond_7

    iget-object v0, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/e;

    iget-boolean v1, v0, Lcom/facebook/react/animated/e;->a:Z

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/facebook/react/animated/e;->c:Lcom/facebook/react/bridge/Callback;

    const-string v2, "value"

    const-string v4, "finished"

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    invoke-interface {v1, v4, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    iget-object v4, v0, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-wide v4, v4, Lcom/facebook/react/animated/B;->e:D

    invoke-interface {v1, v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object v0, v0, Lcom/facebook/react/animated/e;->c:Lcom/facebook/react/bridge/Callback;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz v1, :cond_5

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    const-string v5, "animationId"

    iget v6, v0, Lcom/facebook/react/animated/e;->d:I

    invoke-interface {v1, v5, v6}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-interface {v1, v4, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, v0, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-wide v4, v0, Lcom/facebook/react/animated/B;->e:D

    invoke-interface {v1, v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    if-nez p2, :cond_4

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object p2

    :cond_4
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->removeAt(I)V

    :cond_6
    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    :cond_7
    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-string v0, "onNativeAnimatedModuleAnimationFinished"

    invoke-virtual {p1, v0, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public u(ID)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/facebook/react/animated/B;

    iput-wide p2, v1, Lcom/facebook/react/animated/B;->f:D

    iget-object p2, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "setAnimatedNodeOffset: Animated node ["

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist, or is not a \'value\' node"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public v(ID)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/react/animated/p;->z(Lcom/facebook/react/animated/b;)V

    move-object v1, v0

    check-cast v1, Lcom/facebook/react/animated/B;

    iput-wide p2, v1, Lcom/facebook/react/animated/B;->e:D

    iget-object p2, p0, Lcom/facebook/react/animated/p;->c:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "setAnimatedNodeValue: Animated node ["

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist, or is not a \'value\' node"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public w(IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    const-string v1, "startAnimatingNode: Animated node ["

    if-eqz v0, :cond_5

    instance-of v2, v0, Lcom/facebook/react/animated/B;

    if-eqz v2, :cond_4

    iget-object v1, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/animated/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p3}, Lcom/facebook/react/animated/e;->a(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void

    :cond_0
    const-string v1, "type"

    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "frames"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p2, Lcom/facebook/react/animated/j;

    invoke-direct {p2, p3}, Lcom/facebook/react/animated/j;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_0

    :cond_1
    const-string v2, "spring"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance p2, Lcom/facebook/react/animated/t;

    invoke-direct {p2, p3}, Lcom/facebook/react/animated/t;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_0

    :cond_2
    const-string v2, "decay"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance p2, Lcom/facebook/react/animated/g;

    invoke-direct {p2, p3}, Lcom/facebook/react/animated/g;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    :goto_0
    iput p1, p2, Lcom/facebook/react/animated/e;->d:I

    iput-object p4, p2, Lcom/facebook/react/animated/e;->c:Lcom/facebook/react/bridge/Callback;

    check-cast v0, Lcom/facebook/react/animated/B;

    iput-object v0, p2, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-object p3, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {p3, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_3
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "startAnimatingNode: Unsupported animation type ["

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "]: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] should be of type "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p2, Lcom/facebook/react/animated/B;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] does not exist"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x(ILcom/facebook/react/animated/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/p;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/b;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/facebook/react/animated/B;

    invoke-virtual {v0, p2}, Lcom/facebook/react/animated/B;->n(Lcom/facebook/react/animated/c;)V

    return-void

    :cond_0
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startListeningToAnimatedNodeValue: Animated node ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] does not exist, or is not a \'value\' node"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public y(I)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/animated/e;

    iget v4, v2, Lcom/facebook/react/animated/e;->d:I

    if-ne v4, p1, :cond_2

    iget-object p1, v2, Lcom/facebook/react/animated/e;->c:Lcom/facebook/react/bridge/Callback;

    const-string v4, "value"

    const-string v5, "finished"

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p1, v5, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, v2, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-wide v5, v0, Lcom/facebook/react/animated/B;->e:D

    invoke-interface {p1, v4, v5, v6}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object v0, v2, Lcom/facebook/react/animated/e;->c:Lcom/facebook/react/bridge/Callback;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v3, "animationId"

    iget v6, v2, Lcom/facebook/react/animated/e;->d:I

    invoke-interface {p1, v3, v6}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-interface {p1, v5, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, v2, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-wide v2, v0, Lcom/facebook/react/animated/B;->e:D

    invoke-interface {p1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v3

    invoke-interface {v3, p1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/facebook/react/animated/p;->b:Landroid/util/SparseArray;

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->removeAt(I)V

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    iget-object p1, p0, Lcom/facebook/react/animated/p;->e:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-string v0, "onNativeAnimatedModuleAnimationFinished"

    invoke-virtual {p1, v0, v3}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    return-void
.end method
