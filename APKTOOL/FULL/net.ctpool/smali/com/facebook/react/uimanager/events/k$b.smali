.class Lcom/facebook/react/uimanager/events/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private volatile a:Z

.field private b:Z

.field final synthetic c:Lcom/facebook/react/uimanager/events/k;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/events/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/k$b;->c:Lcom/facebook/react/uimanager/events/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/k$b;->a:Z

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/k$b;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/events/k;Lcom/facebook/react/uimanager/events/l;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/k$b;-><init>(Lcom/facebook/react/uimanager/events/k;)V

    return-void
.end method

.method private c()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->q:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/uimanager/events/k$b;->c:Lcom/facebook/react/uimanager/events/k;

    invoke-static {v2}, Lcom/facebook/react/uimanager/events/k;->j(Lcom/facebook/react/uimanager/events/k;)Lcom/facebook/react/uimanager/events/k$b;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/k$b;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/k$b;->a:Z

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k$b;->c()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/k$b;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k$b;->c:Lcom/facebook/react/uimanager/events/k;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/k;->l(Lcom/facebook/react/uimanager/events/k;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isOnUiQueueThread()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/k$b;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/k$b;->c:Lcom/facebook/react/uimanager/events/k;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/k;->l(Lcom/facebook/react/uimanager/events/k;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/uimanager/events/k$b$a;

    invoke-direct {v1, p0}, Lcom/facebook/react/uimanager/events/k$b$a;-><init>(Lcom/facebook/react/uimanager/events/k$b;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnUiQueueThread(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/k$b;->b:Z

    return-void
.end method

.method public doFrame(J)V
    .locals 2

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean p1, p0, Lcom/facebook/react/uimanager/events/k$b;->b:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/k$b;->a:Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/k$b;->c()V

    :goto_0
    const-string p1, "BatchEventDispatchedListeners"

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    iget-object p1, p0, Lcom/facebook/react/uimanager/events/k$b;->c:Lcom/facebook/react/uimanager/events/k;

    invoke-static {p1}, Lcom/facebook/react/uimanager/events/k;->k(Lcom/facebook/react/uimanager/events/k;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/uimanager/events/a;

    invoke-interface {p2}, Lcom/facebook/react/uimanager/events/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-static {v0, v1}, LP2/a;->g(J)V

    return-void

    :goto_2
    invoke-static {v0, v1}, LP2/a;->g(J)V

    throw p1
.end method
