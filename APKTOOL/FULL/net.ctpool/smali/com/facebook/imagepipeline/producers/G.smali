.class public Lcom/facebook/imagepipeline/producers/G;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/G$f;,
        Lcom/facebook/imagepipeline/producers/G$d;,
        Lcom/facebook/imagepipeline/producers/G$e;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcom/facebook/imagepipeline/producers/G$d;

.field private final c:Ljava/lang/Runnable;

.field private final d:Ljava/lang/Runnable;

.field private final e:I

.field f:LD1/g;

.field g:I

.field h:Lcom/facebook/imagepipeline/producers/G$f;

.field i:J

.field j:J


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/G$d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/G;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/G;->b:Lcom/facebook/imagepipeline/producers/G$d;

    iput p3, p0, Lcom/facebook/imagepipeline/producers/G;->e:I

    new-instance p1, Lcom/facebook/imagepipeline/producers/G$a;

    invoke-direct {p1, p0}, Lcom/facebook/imagepipeline/producers/G$a;-><init>(Lcom/facebook/imagepipeline/producers/G;)V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/G;->c:Ljava/lang/Runnable;

    new-instance p1, Lcom/facebook/imagepipeline/producers/G$b;

    invoke-direct {p1, p0}, Lcom/facebook/imagepipeline/producers/G$b;-><init>(Lcom/facebook/imagepipeline/producers/G;)V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/G;->d:Ljava/lang/Runnable;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    const/4 p1, 0x0

    iput p1, p0, Lcom/facebook/imagepipeline/producers/G;->g:I

    sget-object p1, Lcom/facebook/imagepipeline/producers/G$f;->m:Lcom/facebook/imagepipeline/producers/G$f;

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/G;->i:J

    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/G;->j:J

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/imagepipeline/producers/G;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/G;->d()V

    return-void
.end method

.method static bridge synthetic b(Lcom/facebook/imagepipeline/producers/G;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/G;->j()V

    return-void
.end method

.method private d()V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    iget v3, p0, Lcom/facebook/imagepipeline/producers/G;->g:I

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    const/4 v4, 0x0

    iput v4, p0, Lcom/facebook/imagepipeline/producers/G;->g:I

    sget-object v4, Lcom/facebook/imagepipeline/producers/G$f;->o:Lcom/facebook/imagepipeline/producers/G$f;

    iput-object v4, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    iput-wide v0, p0, Lcom/facebook/imagepipeline/producers/G;->j:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v2, v3}, Lcom/facebook/imagepipeline/producers/G;->i(LD1/g;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/G;->b:Lcom/facebook/imagepipeline/producers/G$d;

    invoke-interface {v0, v2, v3}, Lcom/facebook/imagepipeline/producers/G$d;->a(LD1/g;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v2}, LD1/g;->d(LD1/g;)V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/G;->g()V

    return-void

    :goto_1
    invoke-static {v2}, LD1/g;->d(LD1/g;)V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/G;->g()V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method private e(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/G;->d:Ljava/lang/Runnable;

    const-string v1, "JobScheduler_enqueueJob"

    invoke-static {v0, v1}, LE1/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    move-result-object v0

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    invoke-static {}, Lcom/facebook/imagepipeline/producers/G$e;->a()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v0, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method private g()V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    sget-object v3, Lcom/facebook/imagepipeline/producers/G$f;->p:Lcom/facebook/imagepipeline/producers/G$f;

    if-ne v2, v3, :cond_0

    iget-wide v2, p0, Lcom/facebook/imagepipeline/producers/G;->j:J

    iget v4, p0, Lcom/facebook/imagepipeline/producers/G;->e:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v0, p0, Lcom/facebook/imagepipeline/producers/G;->i:J

    sget-object v4, Lcom/facebook/imagepipeline/producers/G$f;->n:Lcom/facebook/imagepipeline/producers/G$f;

    iput-object v4, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    const/4 v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/facebook/imagepipeline/producers/G$f;->m:Lcom/facebook/imagepipeline/producers/G$f;

    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    sub-long/2addr v2, v0

    invoke-direct {p0, v2, v3}, Lcom/facebook/imagepipeline/producers/G;->e(J)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private static i(LD1/g;I)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    invoke-static {p1, v0}, Lcom/facebook/imagepipeline/producers/c;->n(II)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, LD1/g;->j0(LD1/g;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 24
    :goto_1
    return p0
.end method

.method private j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/G;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/G;->c:Ljava/lang/Runnable;

    const-string v2, "JobScheduler_submitJob"

    invoke-static {v1, v2}, LE1/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/imagepipeline/producers/G;->g:I

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LD1/g;->d(LD1/g;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized f()J
    .locals 4

    .line 1
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/facebook/imagepipeline/producers/G;->j:J

    iget-wide v2, p0, Lcom/facebook/imagepipeline/producers/G;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v0, v2

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public h()Z
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    iget v3, p0, Lcom/facebook/imagepipeline/producers/G;->g:I

    invoke-static {v2, v3}, Lcom/facebook/imagepipeline/producers/G;->i(LD1/g;I)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    monitor-exit p0

    return v3

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    sget-object v2, Lcom/facebook/imagepipeline/producers/G$c;->a:[I

    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/facebook/imagepipeline/producers/G$f;->p:Lcom/facebook/imagepipeline/producers/G$f;

    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    :goto_0
    const-wide/16 v5, 0x0

    goto :goto_1

    :cond_2
    iget-wide v2, p0, Lcom/facebook/imagepipeline/producers/G;->j:J

    iget v5, p0, Lcom/facebook/imagepipeline/producers/G;->e:I

    int-to-long v5, v5

    add-long/2addr v2, v5

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iput-wide v0, p0, Lcom/facebook/imagepipeline/producers/G;->i:J

    sget-object v2, Lcom/facebook/imagepipeline/producers/G$f;->n:Lcom/facebook/imagepipeline/producers/G$f;

    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/G;->h:Lcom/facebook/imagepipeline/producers/G$f;

    move v3, v4

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_3

    sub-long/2addr v5, v0

    invoke-direct {p0, v5, v6}, Lcom/facebook/imagepipeline/producers/G;->e(J)V

    :cond_3
    return v4

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public k(LD1/g;I)Z
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lcom/facebook/imagepipeline/producers/G;->i(LD1/g;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    .line 11
    .line 12
    invoke-static {p1}, LD1/g;->b(LD1/g;)LD1/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/G;->f:LD1/g;

    .line 17
    .line 18
    iput p2, p0, Lcom/facebook/imagepipeline/producers/G;->g:I

    .line 19
    .line 20
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-static {v0}, LD1/g;->d(LD1/g;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
.end method
