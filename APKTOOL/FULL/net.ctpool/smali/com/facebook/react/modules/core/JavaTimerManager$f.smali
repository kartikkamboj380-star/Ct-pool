.class Lcom/facebook/react/modules/core/JavaTimerManager$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private a:Lcom/facebook/react/bridge/WritableArray;

.field final synthetic b:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method private constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->a:Lcom/facebook/react/bridge/WritableArray;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;Lm2/f;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/core/JavaTimerManager$f;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->c(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->d(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->k(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->m(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->m(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/modules/core/JavaTimerManager$e;

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->d(Lcom/facebook/react/modules/core/JavaTimerManager$e;)J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-gez v1, :cond_3

    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->m(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/modules/core/JavaTimerManager$e;

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->a:Lcom/facebook/react/bridge/WritableArray;

    if-nez v2, :cond_1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->a:Lcom/facebook/react/bridge/WritableArray;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->a:Lcom/facebook/react/bridge/WritableArray;

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->a(Lcom/facebook/react/modules/core/JavaTimerManager$e;)I

    move-result v3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->c(Lcom/facebook/react/modules/core/JavaTimerManager$e;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->b(Lcom/facebook/react/modules/core/JavaTimerManager$e;)I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, p1

    invoke-static {v1, v2, v3}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->e(Lcom/facebook/react/modules/core/JavaTimerManager$e;J)V

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v2}, Lcom/facebook/react/modules/core/JavaTimerManager;->m(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v2}, Lcom/facebook/react/modules/core/JavaTimerManager;->l(Lcom/facebook/react/modules/core/JavaTimerManager;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->a(Lcom/facebook/react/modules/core/JavaTimerManager$e;)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_0

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->a:Lcom/facebook/react/bridge/WritableArray;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->g(Lcom/facebook/react/modules/core/JavaTimerManager;)Lm2/c;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->a:Lcom/facebook/react/bridge/WritableArray;

    invoke-interface {p1, p2}, Lm2/c;->callTimers(Lcom/facebook/react/bridge/WritableArray;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->a:Lcom/facebook/react/bridge/WritableArray;

    :cond_4
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$f;->b:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->i(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/a;

    move-result-object p1

    sget-object p2, Lcom/facebook/react/modules/core/a$b;->q:Lcom/facebook/react/modules/core/a$b;

    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
