.class public abstract Lcom/facebook/imagepipeline/producers/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:LR0/i;


# direct methods
.method protected constructor <init>(Ljava/util/concurrent/Executor;LR0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/L;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/L;->b:LR0/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 10

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v7

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v6

    const-string v0, "local"

    const-string v1, "fetch"

    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lcom/facebook/imagepipeline/producers/L$a;

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/L;->f()Ljava/lang/String;

    move-result-object v5

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, v7

    move-object v4, p2

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/facebook/imagepipeline/producers/L$a;-><init>(Lcom/facebook/imagepipeline/producers/L;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;LJ1/b;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;)V

    new-instance p1, Lcom/facebook/imagepipeline/producers/L$b;

    invoke-direct {p1, p0, v9}, Lcom/facebook/imagepipeline/producers/L$b;-><init>(Lcom/facebook/imagepipeline/producers/L;Lcom/facebook/imagepipeline/producers/m0;)V

    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/L;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected c(Ljava/io/InputStream;I)LD1/g;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gtz p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/L;->b:LR0/i;

    .line 5
    .line 6
    invoke-interface {p2, p1}, LR0/i;->c(Ljava/io/InputStream;)LR0/h;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-static {p2}, LS0/a;->J(Ljava/io/Closeable;)LS0/a;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    move-object v0, p2

    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p2

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/L;->b:LR0/i;

    .line 19
    .line 20
    invoke-interface {v1, p1, p2}, LR0/i;->d(Ljava/io/InputStream;I)LR0/h;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    goto :goto_0

    .line 25
    :goto_1
    new-instance p2, LD1/g;

    .line 26
    .line 27
    invoke-direct {p2, v0}, LD1/g;-><init>(LS0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, LO0/b;->b(Ljava/io/InputStream;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, LS0/a;->g(LS0/a;)V

    .line 34
    .line 35
    .line 36
    return-object p2

    .line 37
    :goto_2
    invoke-static {p1}, LO0/b;->b(Ljava/io/InputStream;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, LS0/a;->g(LS0/a;)V

    .line 41
    .line 42
    .line 43
    throw p2
.end method

.method protected abstract d(LJ1/b;)LD1/g;
.end method

.method protected e(Ljava/io/InputStream;I)LD1/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/L;->c(Ljava/io/InputStream;I)LD1/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected abstract f()Ljava/lang/String;
.end method
