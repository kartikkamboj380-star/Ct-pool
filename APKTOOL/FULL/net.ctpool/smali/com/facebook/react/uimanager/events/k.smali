.class public Lcom/facebook/react/uimanager/events/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/e;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/k$b;
    }
.end annotation


# instance fields
.field private final m:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

.field private final n:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final q:Lcom/facebook/react/uimanager/events/k$b;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/k;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lcom/facebook/react/uimanager/events/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/uimanager/events/k$b;-><init>(Lcom/facebook/react/uimanager/events/k;Lcom/facebook/react/uimanager/events/l;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/k;->q:Lcom/facebook/react/uimanager/events/k$b;

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/k;->n:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    new-instance v0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/k;->m:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    return-void
.end method

.method static bridge synthetic j(Lcom/facebook/react/uimanager/events/k;)Lcom/facebook/react/uimanager/events/k$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/k;->q:Lcom/facebook/react/uimanager/events/k$b;

    return-object p0
.end method

.method static bridge synthetic k(Lcom/facebook/react/uimanager/events/k;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method static bridge synthetic l(Lcom/facebook/react/uimanager/events/k;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/k;->n:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method static bridge synthetic m(Lcom/facebook/react/uimanager/events/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k;->p()V

    return-void
.end method

.method private n(Lcom/facebook/react/uimanager/events/d;)V
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FabricEventDispatcher.dispatchSynchronous(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->n:Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 v3, 0x2

    invoke-static {v0, v3}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    instance-of v3, v0, Lcom/facebook/react/uimanager/events/p;

    if-eqz v3, :cond_0

    move-object v4, v0

    check-cast v4, Lcom/facebook/react/uimanager/events/p;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v5

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v6

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->canCoalesce()Z

    move-result v8

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v9

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventCategory()I

    move-result v10

    const/4 v11, 0x1

    invoke-interface/range {v4 .. v11}, Lcom/facebook/react/uimanager/events/p;->receiveEvent(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;IZ)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p1, "FabricEventDispatcher"

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v3, "Fabric UIManager expected to implement SynchronousEventReceiver."

    invoke-direct {v0, v3}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-void

    :goto_1
    invoke-static {v1, v2}, LP2/a;->g(J)V

    throw p1
.end method

.method private o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->m:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->q:Lcom/facebook/react/uimanager/events/k$b;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/k$b;->b()V

    :cond_0
    return-void
.end method

.method private p()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->q:Lcom/facebook/react/uimanager/events/k$b;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/k$b;->d()V

    return-void
.end method


# virtual methods
.method public a(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->m:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->register(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    return-void
.end method

.method public b(Lcom/facebook/react/uimanager/events/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lcom/facebook/react/uimanager/events/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/events/i;

    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/events/i;->a(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->experimental_isSynchronous()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/k;->n(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->m:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/events/d;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    :goto_1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->dispose()V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k;->o()V

    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k;->o()V

    return-void
.end method

.method public e(Lcom/facebook/react/uimanager/events/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(Lcom/facebook/react/uimanager/events/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/k$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/k$a;-><init>(Lcom/facebook/react/uimanager/events/k;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public h(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->m:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->register(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    return-void
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k;->m:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->unregister(I)V

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k;->p()V

    return-void
.end method

.method public onHostPause()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k;->p()V

    return-void
.end method

.method public onHostResume()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k;->o()V

    return-void
.end method
