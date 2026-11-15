.class Lcom/facebook/react/modules/core/JavaTimerManager$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;->setSendIdleEvents(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Z

.field final synthetic n:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;Z)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$b;->n:Lcom/facebook/react/modules/core/JavaTimerManager;

    iput-boolean p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$b;->m:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$b;->n:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->f(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$b;->m:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$b;->n:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->p(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$b;->n:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->o(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
