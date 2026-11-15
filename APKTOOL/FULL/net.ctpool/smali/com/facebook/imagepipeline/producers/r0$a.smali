.class Lcom/facebook/imagepipeline/producers/r0$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lcom/facebook/imagepipeline/producers/r0;


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/r0;Lcom/facebook/imagepipeline/producers/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/r0$a;->c:Lcom/facebook/imagepipeline/producers/r0;

    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/r0;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/s0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/r0$a;-><init>(Lcom/facebook/imagepipeline/producers/r0;Lcom/facebook/imagepipeline/producers/n;)V

    return-void
.end method

.method private q()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/r0$a;->c:Lcom/facebook/imagepipeline/producers/r0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/r0$a;->c:Lcom/facebook/imagepipeline/producers/r0;

    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/r0;->e(Lcom/facebook/imagepipeline/producers/r0;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    if-nez v1, :cond_0

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/r0$a;->c:Lcom/facebook/imagepipeline/producers/r0;

    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/r0;->d(Lcom/facebook/imagepipeline/producers/r0;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v2, v3}, Lcom/facebook/imagepipeline/producers/r0;->f(Lcom/facebook/imagepipeline/producers/r0;I)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/r0$a;->c:Lcom/facebook/imagepipeline/producers/r0;

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/r0;->c(Lcom/facebook/imagepipeline/producers/r0;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v2, Lcom/facebook/imagepipeline/producers/r0$a$a;

    invoke-direct {v2, p0, v1}, Lcom/facebook/imagepipeline/producers/r0$a$a;-><init>(Lcom/facebook/imagepipeline/producers/r0$a;Landroid/util/Pair;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method protected g()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/n;->b()V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/r0$a;->q()V

    return-void
.end method

.method protected h(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/r0$a;->q()V

    return-void
.end method

.method protected i(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/r0$a;->q()V

    :cond_0
    return-void
.end method
