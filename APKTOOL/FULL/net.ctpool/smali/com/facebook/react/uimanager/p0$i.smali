.class Lcom/facebook/react/uimanager/p0$i;
.super Lcom/facebook/react/uimanager/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "i"
.end annotation


# instance fields
.field private final b:I

.field final synthetic c:Lcom/facebook/react/uimanager/p0;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/bridge/ReactContext;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p2}, Lcom/facebook/react/uimanager/p;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    iput p3, p0, Lcom/facebook/react/uimanager/p0$i;->b:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/r0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/p0$i;-><init>(Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/bridge/ReactContext;I)V

    return-void
.end method

.method private b(J)V
    .locals 8

    .line 1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    const-wide/16 v2, 0x10

    sub-long/2addr v2, v0

    iget v0, p0, Lcom/facebook/react/uimanager/p0$i;->b:I

    int-to-long v0, v0

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->g(Lcom/facebook/react/uimanager/p0;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    invoke-static {v1}, Lcom/facebook/react/uimanager/p0;->f(Lcom/facebook/react/uimanager/p0;)Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    monitor-exit v0

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    invoke-static {v1}, Lcom/facebook/react/uimanager/p0;->f(Lcom/facebook/react/uimanager/p0;)Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/p0$r;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    invoke-interface {v1}, Lcom/facebook/react/uimanager/p0$r;->f()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->e(Lcom/facebook/react/uimanager/p0;)J

    move-result-wide v4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v2

    add-long/2addr v4, v6

    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/p0;->o(Lcom/facebook/react/uimanager/p0;J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/facebook/react/uimanager/p0;->n(Lcom/facebook/react/uimanager/p0;Z)V

    throw p1

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->a(Lcom/facebook/react/uimanager/p0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "ReactNative"

    const-string p2, "Not flushing pending UI operations because of previously thrown Exception"

    invoke-static {p1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "dispatchNonBatchedUIOperations"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/p0$i;->b(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    iget-object p1, p0, Lcom/facebook/react/uimanager/p0$i;->c:Lcom/facebook/react/uimanager/p0;

    invoke-static {p1}, Lcom/facebook/react/uimanager/p0;->w(Lcom/facebook/react/uimanager/p0;)V

    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object p1

    sget-object p2, Lcom/facebook/react/modules/core/a$b;->o:Lcom/facebook/react/modules/core/a$b;

    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v1, v2}, LP2/a;->g(J)V

    throw p1
.end method
