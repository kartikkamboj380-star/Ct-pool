.class public final LY1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerListener;


# instance fields
.field private final m:Ljava/util/List;

.field private final n:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LY1/a;->m:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LY1/a;->n:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(LZ1/a;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "block"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY1/a;->n:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0

    .line 16
    throw p1
.end method

.method public final declared-synchronized b(LZ1/a;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "block"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY1/a;->m:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0

    .line 16
    throw p1
.end method

.method public didDispatchMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LY1/a;->didMountItems(Lcom/facebook/react/bridge/UIManager;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public didMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 2

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY1/a;->n:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, LY1/a;->n:Ljava/util/List;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    instance-of v1, p1, LZ1/b;

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    check-cast p1, LZ1/b;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    throw p1

    .line 45
    :cond_2
    iget-object p1, p0, LY1/a;->n:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public didScheduleMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LY1/a;->willMountItems(Lcom/facebook/react/bridge/UIManager;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public willMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 2

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY1/a;->m:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, LY1/a;->m:Ljava/util/List;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    instance-of v1, p1, LZ1/b;

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    check-cast p1, LZ1/b;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    throw p1

    .line 45
    :cond_2
    iget-object p1, p0, LY1/a;->m:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 48
    .line 49
    .line 50
    return-void
.end method
