.class public abstract Lcom/facebook/imagepipeline/producers/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/g0;


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/h0;

.field private final b:Lcom/facebook/imagepipeline/producers/g0;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/h0;Lcom/facebook/imagepipeline/producers/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/imagepipeline/producers/h0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/g0;->a(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/imagepipeline/producers/h0;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public d(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/imagepipeline/producers/h0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/g0;->d(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/facebook/imagepipeline/producers/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/imagepipeline/producers/h0;->g(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    move-object v0, v1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/imagepipeline/producers/h0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->a:Lcom/facebook/imagepipeline/producers/h0;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/facebook/imagepipeline/producers/h0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/E;->b:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    :cond_1
    return-void
.end method
