.class public Lcom/facebook/imagepipeline/producers/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/k$a;
    }
.end annotation


# instance fields
.field private final a:Lw1/x;

.field private final b:Lw1/j;

.field private final c:Lw1/j;

.field private final d:Lw1/k;

.field private final e:Lcom/facebook/imagepipeline/producers/d0;

.field private final f:Lw1/d;

.field private final g:Lw1/d;


# direct methods
.method public constructor <init>(Lw1/x;Lw1/j;Lw1/j;Lw1/k;Lw1/d;Lw1/d;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/k;->a:Lw1/x;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/k;->b:Lw1/j;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/k;->c:Lw1/j;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/k;->d:Lw1/k;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/k;->f:Lw1/d;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/k;->g:Lw1/d;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/k;->e:Lcom/facebook/imagepipeline/producers/d0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "BitmapProbeProducer#produceResults"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    new-instance v1, Lcom/facebook/imagepipeline/producers/k$a;

    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/k;->a:Lw1/x;

    iget-object v6, p0, Lcom/facebook/imagepipeline/producers/k;->b:Lw1/j;

    iget-object v7, p0, Lcom/facebook/imagepipeline/producers/k;->c:Lw1/j;

    iget-object v8, p0, Lcom/facebook/imagepipeline/producers/k;->d:Lw1/k;

    iget-object v9, p0, Lcom/facebook/imagepipeline/producers/k;->f:Lw1/d;

    iget-object v10, p0, Lcom/facebook/imagepipeline/producers/k;->g:Lw1/d;

    move-object v2, v1

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v10}, Lcom/facebook/imagepipeline/producers/k$a;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lw1/x;Lw1/j;Lw1/j;Lw1/k;Lw1/d;Lw1/d;)V

    const-string p1, "BitmapProbeProducer"

    const/4 v2, 0x0

    invoke-interface {v0, p2, p1, v2}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "mInputProducer.produceResult"

    invoke-static {p1}, LK1/b;->a(Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/k;->e:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {p1, v1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LK1/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LK1/b;->b()V

    :cond_3
    return-void

    :goto_1
    invoke-static {}, LK1/b;->d()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LK1/b;->b()V

    :cond_4
    throw p1
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BitmapProbeProducer"

    return-object v0
.end method
