.class public Lcom/facebook/imagepipeline/producers/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/a0$a;
    }
.end annotation


# instance fields
.field private final a:Lw1/x;

.field private final b:Lw1/k;

.field private final c:Lcom/facebook/imagepipeline/producers/d0;


# direct methods
.method public constructor <init>(Lw1/x;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/a0;->a:Lw1/x;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/a0;->b:Lw1/k;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/a0;->c:Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 11

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, LJ1/b;->k()LJ1/d;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-interface {v3}, LJ1/d;->b()LI0/d;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/a0;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, p2, v3}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/a0;->b:Lw1/k;

    invoke-interface {v3, v1, v2}, Lw1/k;->b(LJ1/b;Ljava/lang/Object;)LI0/d;

    move-result-object v6

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LJ1/b;->x(I)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/a0;->a:Lw1/x;

    invoke-interface {v1, v6}, Lw1/x;->get(Ljava/lang/Object;)LS0/a;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    const-string v10, "cached_value_found"

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/a0;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/a0;->c()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, p2, v5}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v3, "true"

    invoke-static {v10, v3}, LO0/g;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    :cond_2
    invoke-interface {v0, p2, v4, v3}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    const-string v3, "PostprocessedBitmapMemoryCacheProducer"

    invoke-interface {v0, p2, v3, v2}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    const-string v0, "memory_bitmap"

    const-string v3, "postprocessed"

    invoke-interface {p2, v0, v3}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-interface {p1, p2}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    invoke-interface {p1, v1, v2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    invoke-virtual {v1}, LS0/a;->close()V

    goto :goto_1

    :cond_3
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LJ1/b;->x(I)Z

    move-result v9

    new-instance v1, Lcom/facebook/imagepipeline/producers/a0$a;

    iget-object v8, p0, Lcom/facebook/imagepipeline/producers/a0;->a:Lw1/x;

    const/4 v7, 0x0

    move-object v4, v1

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lcom/facebook/imagepipeline/producers/a0$a;-><init>(Lcom/facebook/imagepipeline/producers/n;LI0/d;ZLw1/x;Z)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/a0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/a0;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p2, v2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "false"

    invoke-static {v10, v2}, LO0/g;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    :cond_4
    invoke-interface {v0, p2, p1, v3}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/a0;->c:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {p1, v1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    :goto_1
    return-void

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/a0;->c:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "PostprocessedBitmapMemoryCacheProducer"

    return-object v0
.end method
