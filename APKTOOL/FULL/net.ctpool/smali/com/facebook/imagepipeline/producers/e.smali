.class public Lcom/facebook/imagepipeline/producers/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/e0;


# static fields
.field private static final A:Ljava/lang/Object;

.field public static final z:Ljava/util/Set;


# instance fields
.field private final m:LJ1/b;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/String;

.field private final p:Lcom/facebook/imagepipeline/producers/g0;

.field private final q:Ljava/lang/Object;

.field private final r:LJ1/b$c;

.field private final s:Ljava/util/Map;

.field private t:Z

.field private u:Lx1/e;

.field private v:Z

.field private w:Z

.field private final x:Ljava/util/List;

.field private final y:Ly1/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "id"

    const-string v1, "uri_source"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LO0/h;->c([Ljava/lang/Object;)LO0/h;

    move-result-object v0

    sput-object v0, Lcom/facebook/imagepipeline/producers/e;->z:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/imagepipeline/producers/e;->A:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LJ1/b;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V
    .locals 12

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    .line 1
    invoke-direct/range {v0 .. v11}, Lcom/facebook/imagepipeline/producers/e;-><init>(LJ1/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    return-void
.end method

.method public constructor <init>(LJ1/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/e;->m:LJ1/b;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/e;->n:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->s:Ljava/util/Map;

    const-string v1, "id"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_0

    const-string p1, "null-request"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object p1

    :goto_0
    const-string p2, "uri_source"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p4}, Lcom/facebook/imagepipeline/producers/e;->j(Ljava/util/Map;)V

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/e;->o:Ljava/lang/String;

    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/e;->p:Lcom/facebook/imagepipeline/producers/g0;

    if-eqz p6, :cond_1

    goto :goto_1

    :cond_1
    sget-object p6, Lcom/facebook/imagepipeline/producers/e;->A:Ljava/lang/Object;

    :goto_1
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/e;->q:Ljava/lang/Object;

    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/e;->r:LJ1/b$c;

    iput-boolean p8, p0, Lcom/facebook/imagepipeline/producers/e;->t:Z

    iput-object p10, p0, Lcom/facebook/imagepipeline/producers/e;->u:Lx1/e;

    iput-boolean p9, p0, Lcom/facebook/imagepipeline/producers/e;->v:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/imagepipeline/producers/e;->w:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/e;->x:Ljava/util/List;

    iput-object p11, p0, Lcom/facebook/imagepipeline/producers/e;->y:Ly1/m;

    return-void
.end method

.method public static c(Ljava/util/List;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/imagepipeline/producers/f0;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/f0;->a()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static h(Ljava/util/List;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/imagepipeline/producers/f0;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/f0;->b()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static i(Ljava/util/List;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/imagepipeline/producers/f0;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/f0;->d()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static k(Ljava/util/List;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/imagepipeline/producers/f0;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/f0;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public B()Lcom/facebook/imagepipeline/producers/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->p:Lcom/facebook/imagepipeline/producers/g0;

    return-object v0
.end method

.method public declared-synchronized J()Z
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/e;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public U()LJ1/b$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->r:LJ1/b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->q:Ljava/lang/Object;

    return-object v0
.end method

.method public declared-synchronized b()Lx1/e;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->u:Lx1/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
.end method

.method public d()LJ1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->m:LJ1/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Lcom/facebook/imagepipeline/producers/f0;)V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/e;->w:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/f0;->a()V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public f()Ly1/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->y:Ly1/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->s:Ljava/util/Map;

    const-string v1, "origin"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/e;->s:Ljava/util/Map;

    const-string v0, "origin_sub"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getExtras()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->s:Ljava/util/Map;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->n:Ljava/lang/String;

    return-object v0
.end method

.method public j(Ljava/util/Map;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/imagepipeline/producers/e;->w(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public declared-synchronized l()Z
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/e;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public m()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/e;->p()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/e;->c(Ljava/util/List;)V

    return-void
.end method

.method public n(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->o:Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized p()Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/e;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/producers/e;->w:Z

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/e;->x:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized q(Z)Ljava/util/List;
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/e;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v0, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_1
    iput-boolean p1, p0, Lcom/facebook/imagepipeline/producers/e;->v:Z

    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->x:Ljava/util/List;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized r(Z)Ljava/util/List;
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/e;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v0, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_1
    iput-boolean p1, p0, Lcom/facebook/imagepipeline/producers/e;->t:Z

    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->x:Ljava/util/List;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized s(Lx1/e;)Ljava/util/List;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->u:Lx1/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/e;->u:Lx1/e;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->x:Ljava/util/List;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit p0

    .line 22
    throw p1
.end method

.method public w(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/imagepipeline/producers/e;->z:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/e;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public z(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "default"

    invoke-virtual {p0, p1, v0}, Lcom/facebook/imagepipeline/producers/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
