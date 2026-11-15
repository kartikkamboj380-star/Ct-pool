.class Lcom/facebook/react/uimanager/events/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private volatile a:Z

.field private b:Z

.field final synthetic c:Lcom/facebook/react/uimanager/events/f;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/events/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/f$d;->a:Z

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/f$d;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/events/f;Lcom/facebook/react/uimanager/events/h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/f$d;-><init>(Lcom/facebook/react/uimanager/events/f;)V

    return-void
.end method

.method private c()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableFabricRendererExclusively:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->q:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v2}, Lcom/facebook/react/uimanager/events/f;->j(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/uimanager/events/f$d;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/f$d;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/f$d;->a:Z

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f$d;->c()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/f$d;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/f;->s(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isOnUiQueueThread()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/f$d;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/f;->s(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/uimanager/events/f$d$a;

    invoke-direct {v1, p0}, Lcom/facebook/react/uimanager/events/f$d$a;-><init>(Lcom/facebook/react/uimanager/events/f$d;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnUiQueueThread(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/f$d;->b:Z

    return-void
.end method

.method public doFrame(J)V
    .locals 3

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean p1, p0, Lcom/facebook/react/uimanager/events/f$d;->b:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/f$d;->a:Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f$d;->c()V

    :goto_0
    const-wide/16 p1, 0x0

    const-string v0, "ScheduleDispatchFrameCallback"

    invoke-static {p1, p2, v0}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/f;->w(Lcom/facebook/react/uimanager/events/f;)V

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/f;->p(Lcom/facebook/react/uimanager/events/f;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/events/f;->u(Lcom/facebook/react/uimanager/events/f;Z)V

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/f;->q(Lcom/facebook/react/uimanager/events/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-static {p1, p2, v0, v1}, LP2/a;->j(JLjava/lang/String;I)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/f;->s(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f$d;->c:Lcom/facebook/react/uimanager/events/f;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/f;->k(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/uimanager/events/f$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnJSQueueThread(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {p1, p2}, LP2/a;->g(J)V

    return-void

    :goto_2
    invoke-static {p1, p2}, LP2/a;->g(J)V

    throw v0
.end method
