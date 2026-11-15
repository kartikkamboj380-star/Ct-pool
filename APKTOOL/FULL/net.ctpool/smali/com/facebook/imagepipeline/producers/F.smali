.class public final Lcom/facebook/imagepipeline/producers/F;
.super Lcom/facebook/imagepipeline/producers/E;
.source "SourceFile"

# interfaces
.implements LF1/d;


# instance fields
.field private final c:LF1/e;

.field private final d:LF1/d;


# direct methods
.method public constructor <init>(LF1/e;LF1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/E;-><init>(Lcom/facebook/imagepipeline/producers/h0;Lcom/facebook/imagepipeline/producers/g0;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/F;->c:LF1/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/F;->d:LF1/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 5

    .line 1
    const-string v0, "producerContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->c:LF1/e;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->l()Z

    move-result v4

    invoke-interface {v0, v1, v2, v3, v4}, LF1/e;->f(LJ1/b;Ljava/lang/Object;Ljava/lang/String;Z)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->d:LF1/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LF1/d;->b(Lcom/facebook/imagepipeline/producers/e0;)V

    :cond_1
    return-void
.end method

.method public f(Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 4

    .line 1
    const-string v0, "producerContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->c:LF1/e;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->l()Z

    move-result v3

    invoke-interface {v0, v1, v2, v3}, LF1/e;->e(LJ1/b;Ljava/lang/String;Z)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->d:LF1/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LF1/d;->f(Lcom/facebook/imagepipeline/producers/e0;)V

    :cond_1
    return-void
.end method

.method public h(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const-string v0, "producerContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->c:LF1/e;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->l()Z

    move-result v3

    invoke-interface {v0, v1, v2, p2, v3}, LF1/e;->d(LJ1/b;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->d:LF1/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, LF1/d;->h(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public i(Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 2

    .line 1
    const-string v0, "producerContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->c:LF1/e;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LF1/e;->k(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/F;->d:LF1/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LF1/d;->i(Lcom/facebook/imagepipeline/producers/e0;)V

    :cond_1
    return-void
.end method
