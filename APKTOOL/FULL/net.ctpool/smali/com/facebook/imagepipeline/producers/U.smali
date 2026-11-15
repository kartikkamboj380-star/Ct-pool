.class public abstract Lcom/facebook/imagepipeline/producers/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/U$a;
    }
.end annotation


# instance fields
.field final a:Ljava/util/Map;

.field private final b:Lcom/facebook/imagepipeline/producers/d0;

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/imagepipeline/producers/U;-><init>(Lcom/facebook/imagepipeline/producers/d0;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method protected constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U;->b:Lcom/facebook/imagepipeline/producers/d0;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U;->a:Ljava/util/Map;

    iput-boolean p4, p0, Lcom/facebook/imagepipeline/producers/U;->c:Z

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/U;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/U;->e:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/U;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/U;->e:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/U;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/U;->b:Lcom/facebook/imagepipeline/producers/d0;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/facebook/imagepipeline/producers/U;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/imagepipeline/producers/U;->c:Z

    return p0
.end method

.method static bridge synthetic f(Lcom/facebook/imagepipeline/producers/U;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/U;->d:Ljava/lang/String;

    return-object p0
.end method

.method private declared-synchronized h(Ljava/lang/Object;)Lcom/facebook/imagepipeline/producers/U$a;
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/facebook/imagepipeline/producers/U$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/U$a;-><init>(Lcom/facebook/imagepipeline/producers/U;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MultiplexProducer#produceResults"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U;->d:Ljava/lang/String;

    invoke-interface {v0, p2, v1}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/facebook/imagepipeline/producers/U;->j(Lcom/facebook/imagepipeline/producers/e0;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/producers/U;->i(Ljava/lang/Object;)Lcom/facebook/imagepipeline/producers/U$a;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/U;->h(Ljava/lang/Object;)Lcom/facebook/imagepipeline/producers/U$a;

    move-result-object v1

    const/4 v2, 0x1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1, p1, p2}, Lcom/facebook/imagepipeline/producers/U$a;->h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v2, :cond_3

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->l()Z

    move-result p1

    invoke-static {p1}, LW0/e;->j(Z)LW0/e;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/facebook/imagepipeline/producers/U$a;->c(Lcom/facebook/imagepipeline/producers/U$a;LW0/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LK1/b;->b()V

    :cond_4
    return-void

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    invoke-static {}, LK1/b;->d()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, LK1/b;->b()V

    :cond_5
    throw p1
.end method

.method protected abstract g(Ljava/io/Closeable;)Ljava/io/Closeable;
.end method

.method protected declared-synchronized i(Ljava/lang/Object;)Lcom/facebook/imagepipeline/producers/U$a;
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/imagepipeline/producers/U$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected abstract j(Lcom/facebook/imagepipeline/producers/e0;)Ljava/lang/Object;
.end method

.method protected declared-synchronized k(Ljava/lang/Object;Lcom/facebook/imagepipeline/producers/U$a;)V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/U;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method
