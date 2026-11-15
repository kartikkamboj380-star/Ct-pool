.class Lcom/facebook/react/uimanager/events/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/uimanager/events/f;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/events/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/events/f;Lcom/facebook/react/uimanager/events/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/f$c;-><init>(Lcom/facebook/react/uimanager/events/f;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-string v0, "DispatchEventsRunnable"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    const-string v0, "ScheduleDispatchFrameCallback"

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v3}, Lcom/facebook/react/uimanager/events/f;->q(Lcom/facebook/react/uimanager/events/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v3

    invoke-static {v1, v2, v0, v3}, LP2/a;->d(JLjava/lang/String;I)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lcom/facebook/react/uimanager/events/f;->u(Lcom/facebook/react/uimanager/events/f;Z)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/f;->t(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    move-result-object v0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/f;->n(Lcom/facebook/react/uimanager/events/f;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v4}, Lcom/facebook/react/uimanager/events/f;->o(Lcom/facebook/react/uimanager/events/f;)I

    move-result v4

    if-lez v4, :cond_3

    iget-object v4, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v4}, Lcom/facebook/react/uimanager/events/f;->o(Lcom/facebook/react/uimanager/events/f;)I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_0

    iget-object v4, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v4}, Lcom/facebook/react/uimanager/events/f;->m(Lcom/facebook/react/uimanager/events/f;)[Lcom/facebook/react/uimanager/events/d;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v5}, Lcom/facebook/react/uimanager/events/f;->o(Lcom/facebook/react/uimanager/events/f;)I

    move-result v5

    invoke-static {}, Lcom/facebook/react/uimanager/events/f;->y()Ljava/util/Comparator;

    move-result-object v6

    invoke-static {v4, v3, v5, v6}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    goto :goto_0

    :catchall_0
    move-exception v3

    goto :goto_3

    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v4}, Lcom/facebook/react/uimanager/events/f;->o(Lcom/facebook/react/uimanager/events/f;)I

    move-result v4

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v4}, Lcom/facebook/react/uimanager/events/f;->m(Lcom/facebook/react/uimanager/events/f;)[Lcom/facebook/react/uimanager/events/d;

    move-result-object v4

    aget-object v4, v4, v3

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/d;->getUniqueID()I

    move-result v6

    invoke-static {v1, v2, v5, v6}, LP2/a;->d(JLjava/lang/String;I)V

    iget-object v5, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v5}, Lcom/facebook/react/uimanager/events/f;->t(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/react/uimanager/events/d;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/d;->dispose()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v3}, Lcom/facebook/react/uimanager/events/f;->v(Lcom/facebook/react/uimanager/events/f;)V

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v3}, Lcom/facebook/react/uimanager/events/f;->l(Lcom/facebook/react/uimanager/events/f;)Landroid/util/LongSparseArray;

    move-result-object v3

    invoke-virtual {v3}, Landroid/util/LongSparseArray;->clear()V

    :cond_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f$c;->m:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/f;->r(Lcom/facebook/react/uimanager/events/f;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/uimanager/events/a;

    invoke-interface {v3}, Lcom/facebook/react/uimanager/events/a;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_4
    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-void

    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    invoke-static {v1, v2}, LP2/a;->g(J)V

    throw v0
.end method
