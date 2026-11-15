.class public Lcom/facebook/imagepipeline/producers/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/r0$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/d0;

.field private final b:I

.field private c:I

.field private final d:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field private final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(ILjava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/imagepipeline/producers/r0;->b:I

    invoke-static {p2}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/r0;->e:Ljava/util/concurrent/Executor;

    invoke-static {p3}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/imagepipeline/producers/d0;

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/r0;->a:Lcom/facebook/imagepipeline/producers/d0;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/r0;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    const/4 p1, 0x0

    iput p1, p0, Lcom/facebook/imagepipeline/producers/r0;->c:I

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/r0;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/r0;->e:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/r0;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/imagepipeline/producers/r0;->c:I

    return p0
.end method

.method static bridge synthetic e(Lcom/facebook/imagepipeline/producers/r0;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/r0;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/facebook/imagepipeline/producers/r0;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/imagepipeline/producers/r0;->c:I

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    const-string v1, "ThrottlingProducer"

    invoke-interface {v0, p2, v1}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/facebook/imagepipeline/producers/r0;->c:I

    iget v1, p0, Lcom/facebook/imagepipeline/producers/r0;->b:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/r0;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    add-int/2addr v0, v2

    iput v0, p0, Lcom/facebook/imagepipeline/producers/r0;->c:I

    const/4 v2, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/r0;->g(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method g(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    const-string v1, "ThrottlingProducer"

    const/4 v2, 0x0

    invoke-interface {v0, p2, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/r0;->a:Lcom/facebook/imagepipeline/producers/d0;

    new-instance v1, Lcom/facebook/imagepipeline/producers/r0$a;

    invoke-direct {v1, p0, p1, v2}, Lcom/facebook/imagepipeline/producers/r0$a;-><init>(Lcom/facebook/imagepipeline/producers/r0;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/s0;)V

    invoke-interface {v0, v1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method
