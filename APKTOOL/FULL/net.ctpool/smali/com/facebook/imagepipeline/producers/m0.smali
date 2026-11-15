.class public abstract Lcom/facebook/imagepipeline/producers/m0;
.super LM0/e;
.source "SourceFile"


# instance fields
.field private final n:Lcom/facebook/imagepipeline/producers/n;

.field private final o:Lcom/facebook/imagepipeline/producers/g0;

.field private final p:Lcom/facebook/imagepipeline/producers/e0;

.field private final q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V
    .locals 1

    const-string v0, "consumer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "producerListener"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "producerContext"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "producerName"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LM0/e;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0;->n:Lcom/facebook/imagepipeline/producers/n;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/m0;->o:Lcom/facebook/imagepipeline/producers/g0;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/m0;->p:Lcom/facebook/imagepipeline/producers/e0;

    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/m0;->q:Ljava/lang/String;

    invoke-interface {p2, p3, p4}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0;->o:Lcom/facebook/imagepipeline/producers/g0;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0;->p:Lcom/facebook/imagepipeline/producers/e0;

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0;->g()Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/g0;->d(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0;->n:Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/n;->b()V

    return-void
.end method

.method protected e(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "e"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0;->o:Lcom/facebook/imagepipeline/producers/g0;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0;->p:Lcom/facebook/imagepipeline/producers/e0;

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/m0;->h(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0, v1, v2, p1, v3}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0;->n:Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected f(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0;->o:Lcom/facebook/imagepipeline/producers/g0;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0;->p:Lcom/facebook/imagepipeline/producers/e0;

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/m0;->i(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0;->n:Lcom/facebook/imagepipeline/producers/n;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    return-void
.end method

.method protected g()Ljava/util/Map;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected h(Ljava/lang/Exception;)Ljava/util/Map;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected i(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method
