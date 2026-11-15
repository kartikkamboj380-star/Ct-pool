.class public abstract Lcom/facebook/imagepipeline/memory/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/memory/a$c;,
        Lcom/facebook/imagepipeline/memory/a$b;,
        Lcom/facebook/imagepipeline/memory/a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field final b:LR0/d;

.field final c:LG1/G;

.field final d:Landroid/util/SparseArray;

.field final e:Ljava/util/Set;

.field private f:Z

.field final g:Lcom/facebook/imagepipeline/memory/a$a;

.field final h:Lcom/facebook/imagepipeline/memory/a$a;

.field private final i:LG1/H;

.field private j:Z


# direct methods
.method public constructor <init>(LR0/d;LG1/G;LG1/H;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LR0/d;

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->b:LR0/d;

    invoke-static {p2}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG1/G;

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    invoke-static {p3}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LG1/H;

    iput-object p2, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    iput-object p2, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    iget-boolean p1, p1, LG1/G;->f:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/a;->q()V

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/util/SparseIntArray;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroid/util/SparseIntArray;-><init>(I)V

    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->u(Landroid/util/SparseIntArray;)V

    :goto_0
    invoke-static {}, LO0/n;->b()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->e:Ljava/util/Set;

    new-instance p1, Lcom/facebook/imagepipeline/memory/a$a;

    invoke-direct {p1}, Lcom/facebook/imagepipeline/memory/a$a;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    new-instance p1, Lcom/facebook/imagepipeline/memory/a$a;

    invoke-direct {p1}, Lcom/facebook/imagepipeline/memory/a$a;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    return-void
.end method

.method public constructor <init>(LR0/d;LG1/G;LG1/H;Z)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/memory/a;-><init>(LR0/d;LG1/G;LG1/H;)V

    iput-boolean p4, p0, Lcom/facebook/imagepipeline/memory/a;->j:Z

    return-void
.end method

.method private declared-synchronized h()V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/a;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, LO0/l;->i(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method private i(Landroid/util/SparseIntArray;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v3

    iget-object v4, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    new-instance v5, Lcom/facebook/imagepipeline/memory/b;

    invoke-virtual {p0, v2}, Lcom/facebook/imagepipeline/memory/a;->o(I)I

    move-result v6

    iget-object v7, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget-boolean v7, v7, LG1/G;->f:Z

    invoke-direct {v5, v6, v3, v0, v7}, Lcom/facebook/imagepipeline/memory/b;-><init>(IIIZ)V

    invoke-virtual {v4, v2, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private declared-synchronized l(I)Lcom/facebook/imagepipeline/memory/b;
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/imagepipeline/memory/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized q()V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget-object v0, v0, LG1/G;->c:Landroid/util/SparseIntArray;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/memory/a;->i(Landroid/util/SparseIntArray;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/memory/a;->f:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/memory/a;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized u(Landroid/util/SparseIntArray;)V
    .locals 10

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget-object v0, v0, LG1/G;->c:Landroid/util/SparseIntArray;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v3

    invoke-virtual {v0, v2}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v4

    invoke-virtual {p1, v3, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v5

    iget-object v6, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    new-instance v7, Lcom/facebook/imagepipeline/memory/b;

    invoke-virtual {p0, v3}, Lcom/facebook/imagepipeline/memory/a;->o(I)I

    move-result v8

    iget-object v9, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget-boolean v9, v9, LG1/G;->f:Z

    invoke-direct {v7, v8, v4, v5, v9}, Lcom/facebook/imagepipeline/memory/b;-><init>(IIIZ)V

    invoke-virtual {v6, v3, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iput-boolean v1, p0, Lcom/facebook/imagepipeline/memory/a;->f:Z

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/imagepipeline/memory/a;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method private v()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    invoke-static {v0}, LP0/a;->u(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v2, "Used = (%d, %d); Free = (%d, %d)"

    invoke-static/range {v1 .. v6}, LP0/a;->z(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->n(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/memory/a;->o(I)I

    move-result v1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/memory/a;->l(I)Lcom/facebook/imagepipeline/memory/b;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->e:Ljava/util/Set;

    invoke-interface {v3, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v2, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v3, "release (free, value unrecognized) (object, size) = (%x, %s)"

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v3, v0}, LP0/a;->h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    :goto_0
    invoke-interface {p1, v1}, LG1/H;->e(I)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    const/4 v3, 0x2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/facebook/imagepipeline/memory/b;->f()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/a;->s()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->t(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2, p1}, Lcom/facebook/imagepipeline/memory/b;->h(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {v2, v1}, Lcom/facebook/imagepipeline/memory/a$a;->b(I)V

    iget-object v2, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {v2, v1}, Lcom/facebook/imagepipeline/memory/a$a;->a(I)V

    iget-object v2, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    invoke-interface {v2, v1}, LG1/H;->g(I)V

    invoke-static {v3}, LP0/a;->u(I)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v2, "release (reuse) (object, size) = (%x, %s)"

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v2, p1, v0}, LP0/a;->x(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/facebook/imagepipeline/memory/b;->b()V

    :cond_3
    invoke-static {v3}, LP0/a;->u(I)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v3, "release (free) (object, size) = (%x, %s)"

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v3, v4, v0}, LP0/a;->x(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {p1, v1}, Lcom/facebook/imagepipeline/memory/a$a;->a(I)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    goto :goto_0

    :cond_5
    :goto_2
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/a;->v()V

    monitor-exit p0

    return-void

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected abstract f(I)Ljava/lang/Object;
.end method

.method declared-synchronized g(I)Z
    .locals 6

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/memory/a;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget v2, v0, LG1/G;->a:I

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v3, v3, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    sub-int v4, v2, v3

    const/4 v5, 0x0

    if-le p1, v4, :cond_1

    iget-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    invoke-interface {p1}, LG1/H;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v5

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    iget v0, v0, LG1/G;->b:I

    iget-object v4, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v4, v4, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    add-int/2addr v3, v4

    sub-int v3, v0, v3

    if-le p1, v3, :cond_2

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/memory/a;->x(I)V

    :cond_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v3, v3, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    add-int/2addr v0, v3

    sub-int/2addr v2, v0

    if-le p1, v2, :cond_3

    iget-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    invoke-interface {p1}, LG1/H;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v5

    :cond_3
    monitor-exit p0

    return v1

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 4

    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/a;->h()V

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->m(I)I

    move-result p1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->k(I)Lcom/facebook/imagepipeline/memory/b;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/memory/a;->p(Lcom/facebook/imagepipeline/memory/b;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object p1, p0, Lcom/facebook/imagepipeline/memory/a;->e:Ljava/util/Set;

    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, LO0/l;->i(Z)V

    invoke-virtual {p0, v2}, Lcom/facebook/imagepipeline/memory/a;->n(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->o(I)I

    move-result v0

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {v3, v0}, Lcom/facebook/imagepipeline/memory/a$a;->b(I)V

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {v3, v0}, Lcom/facebook/imagepipeline/memory/a$a;->a(I)V

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    invoke-interface {v3, v0}, LG1/H;->b(I)V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/a;->v()V

    invoke-static {v1}, LP0/a;->u(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v1, "get (reuse) (object, size) = (%x, %s)"

    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, v1, v3, p1}, LP0/a;->x(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v2

    :cond_1
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->o(I)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/facebook/imagepipeline/memory/a;->g(I)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {v3, v2}, Lcom/facebook/imagepipeline/memory/a$a;->b(I)V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/b;->e()V

    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->f(I)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    monitor-enter p0

    :try_start_2
    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {v3, v2}, Lcom/facebook/imagepipeline/memory/a$a;->a(I)V

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->k(I)Lcom/facebook/imagepipeline/memory/b;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/facebook/imagepipeline/memory/b;->b()V

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {v0}, LO0/q;->c(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_2
    monitor-enter p0

    :try_start_3
    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->e:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, LO0/l;->i(Z)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/a;->y()V

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    invoke-interface {v3, v2}, LG1/H;->a(I)V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/a;->v()V

    invoke-static {v1}, LP0/a;->u(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v2, "get (alloc) (object, size) = (%x, %s)"

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1, v2, v3, p1}, LP0/a;->x(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :catchall_3
    move-exception p1

    goto :goto_4

    :cond_4
    :goto_3
    monitor-exit p0

    return-object v0

    :goto_4
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    throw p1

    :goto_5
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    :cond_5
    :try_start_5
    new-instance p1, Lcom/facebook/imagepipeline/memory/a$c;

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget v0, v0, LG1/G;->a:I

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v1, v1, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v3, v3, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    invoke-direct {p1, v0, v1, v3, v2}, Lcom/facebook/imagepipeline/memory/a$c;-><init>(IIII)V

    throw p1

    :goto_6
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method protected abstract j(Ljava/lang/Object;)V
.end method

.method declared-synchronized k(I)Lcom/facebook/imagepipeline/memory/b;
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/imagepipeline/memory/b;

    if-nez v0, :cond_2

    iget-boolean v1, p0, Lcom/facebook/imagepipeline/memory/a;->f:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, LP0/a;->u(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v1, "creating new bucket %s"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->w(I)Lcom/facebook/imagepipeline/memory/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_2
    :goto_1
    monitor-exit p0

    return-object v0

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method protected abstract m(I)I
.end method

.method protected abstract n(Ljava/lang/Object;)I
.end method

.method protected abstract o(I)I
.end method

.method protected declared-synchronized p(Lcom/facebook/imagepipeline/memory/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/memory/b;->c()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected r()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->b:LR0/d;

    invoke-interface {v0, p0}, LR0/d;->a(LR0/c;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    invoke-interface {v0, p0}, LG1/H;->c(Lcom/facebook/imagepipeline/memory/a;)V

    return-void
.end method

.method declared-synchronized s()Z
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v1, v1, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget v1, v1, LG1/G;->b:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->i:LG1/H;

    invoke-interface {v1}, LG1/H;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit p0

    return v0

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method protected t(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method w(I)Lcom/facebook/imagepipeline/memory/b;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/memory/b;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/a;->o(I)I

    move-result p1

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget-boolean v1, v1, LG1/G;->f:Z

    const v2, 0x7fffffff

    const/4 v3, 0x0

    invoke-direct {v0, p1, v2, v3, v1}, Lcom/facebook/imagepipeline/memory/b;-><init>(IIIZ)V

    return-object v0
.end method

.method declared-synchronized x(I)V
    .locals 7

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v0, v0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v1, v1, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    add-int/2addr v0, v1

    sub-int/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v1, 0x2

    :try_start_1
    invoke-static {v1}, LP0/a;->u(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v3, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v5, v5, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    iget-object v6, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v6, v6, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    add-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v3, v4, v5, v6}, LP0/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/a;->v()V

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    if-gtz v0, :cond_2

    goto :goto_4

    :cond_2
    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/imagepipeline/memory/b;

    invoke-static {v3}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/imagepipeline/memory/b;

    :goto_2
    if-lez v0, :cond_4

    invoke-virtual {v3}, Lcom/facebook/imagepipeline/memory/b;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v4}, Lcom/facebook/imagepipeline/memory/a;->j(Ljava/lang/Object;)V

    iget v4, v3, Lcom/facebook/imagepipeline/memory/b;->a:I

    sub-int/2addr v0, v4

    iget-object v5, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    invoke-virtual {v5, v4}, Lcom/facebook/imagepipeline/memory/a$a;->a(I)V

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    :goto_4
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/a;->v()V

    invoke-static {v1}, LP0/a;->u(I)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->a:Ljava/lang/Class;

    const-string v1, "trimToSize: TargetSize = %d; Final Size = %d"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v2, p0, Lcom/facebook/imagepipeline/memory/a;->g:Lcom/facebook/imagepipeline/memory/a$a;

    iget v2, v2, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    iget-object v3, p0, Lcom/facebook/imagepipeline/memory/a;->h:Lcom/facebook/imagepipeline/memory/a$a;

    iget v3, v3, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, LP0/a;->x(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_6
    monitor-exit p0

    return-void

    :goto_5
    monitor-exit p0

    throw p1
.end method

.method declared-synchronized y()V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/a;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/a;->c:LG1/G;

    iget v0, v0, LG1/G;->b:I

    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/memory/a;->x(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method
