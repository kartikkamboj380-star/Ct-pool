.class public final Lcom/facebook/imagepipeline/producers/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/d0;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    const-string v0, "inputProducer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/s;->a:Lcom/facebook/imagepipeline/producers/d0;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/s;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static synthetic c(Lcom/facebook/imagepipeline/producers/s;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/s;->d(Lcom/facebook/imagepipeline/producers/s;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method

.method private static final d(Lcom/facebook/imagepipeline/producers/s;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$consumer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/s;->a:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 3

    .line 1
    const-string v0, "consumer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/s;->b:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v1, :cond_0

    new-instance v2, Lcom/facebook/imagepipeline/producers/r;

    invoke-direct {v2, p0, p1, p2}, Lcom/facebook/imagepipeline/producers/r;-><init>(Lcom/facebook/imagepipeline/producers/s;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    invoke-virtual {v0}, LJ1/b;->e()I

    move-result p1

    int-to-long p1, p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, p1, p2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/s;->a:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    :goto_0
    return-void
.end method
