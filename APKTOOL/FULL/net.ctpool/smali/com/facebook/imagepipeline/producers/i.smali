.class public Lcom/facebook/imagepipeline/producers/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


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
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/i;->a:Lw1/x;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/i;->b:Lw1/k;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/i;->c:Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/i;)Lw1/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/i;->a:Lw1/x;

    return-object p0
.end method

.method private static f(LD1/h;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    invoke-interface {p0}, LD1/h;->getExtras()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1, p0}, Lo1/a;->j(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 10

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "BitmapMemoryCacheProducer#produceResults"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    :goto_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/i;->b:Lw1/k;

    invoke-interface {v3, v1, v2}, Lw1/k;->a(LJ1/b;Ljava/lang/Object;)LI0/d;

    move-result-object v1

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LJ1/b;->x(I)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/i;->a:Lw1/x;

    invoke-interface {v2, v1}, Lw1/x;->get(Ljava/lang/Object;)LS0/a;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    const-string v5, "memory_bitmap"

    const-string v6, "cached_value_found"

    if-eqz v2, :cond_5

    :try_start_1
    invoke-virtual {v2}, LS0/a;->j()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LD1/h;

    invoke-static {v7, p2}, Lcom/facebook/imagepipeline/producers/i;->f(LD1/h;Lcom/facebook/imagepipeline/producers/e0;)V

    invoke-virtual {v2}, LS0/a;->j()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LD1/d;

    invoke-interface {v7}, LD1/d;->t0()LD1/l;

    move-result-object v7

    invoke-interface {v7}, LD1/l;->a()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, p2, v9}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    const-string v9, "true"

    invoke-static {v6, v9}, LO0/g;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v9

    goto :goto_2

    :cond_2
    move-object v9, v4

    :goto_2
    invoke-interface {v0, p2, v8, v9}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, p2, v8, v3}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->d()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p2, v5, v8}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-interface {p1, v8}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    :cond_3
    invoke-static {v7}, Lcom/facebook/imagepipeline/producers/c;->l(Z)I

    move-result v8

    invoke-interface {p1, v2, v8}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    invoke-virtual {v2}, LS0/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_5

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LK1/b;->b()V

    :cond_4
    return-void

    :cond_5
    :try_start_2
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    move-result-object v2

    invoke-virtual {v2}, LJ1/b$c;->h()I

    move-result v2

    sget-object v7, LJ1/b$c;->q:LJ1/b$c;

    invoke-virtual {v7}, LJ1/b$c;->h()I

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v8, "false"

    if-lt v2, v7, :cond_8

    :try_start_3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p2, v2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v6, v8}, LO0/g;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    goto :goto_3

    :cond_6
    move-object v2, v4

    :goto_3
    invoke-interface {v0, p2, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, p2, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v5, v0}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v4, v3}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LK1/b;->b()V

    :cond_7
    return-void

    :cond_8
    :try_start_4
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, LJ1/b;->x(I)Z

    move-result v2

    invoke-virtual {p0, p1, v1, v2}, Lcom/facebook/imagepipeline/producers/i;->g(Lcom/facebook/imagepipeline/producers/n;LI0/d;Z)Lcom/facebook/imagepipeline/producers/n;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/i;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p2, v2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v6, v8}, LO0/g;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    :cond_9
    invoke-interface {v0, p2, v1, v4}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "mInputProducer.produceResult"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    :cond_a
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/i;->c:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LK1/b;->b()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_b
    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, LK1/b;->b()V

    :cond_c
    return-void

    :goto_4
    invoke-static {}, LK1/b;->d()Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-static {}, LK1/b;->b()V

    :cond_d
    throw p1
.end method

.method protected d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "pipe_bg"

    return-object v0
.end method

.method protected e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BitmapMemoryCacheProducer"

    return-object v0
.end method

.method protected g(Lcom/facebook/imagepipeline/producers/n;LI0/d;Z)Lcom/facebook/imagepipeline/producers/n;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/i$a;-><init>(Lcom/facebook/imagepipeline/producers/i;Lcom/facebook/imagepipeline/producers/n;LI0/d;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
