.class Lcom/facebook/react/runtime/ReactInstance$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/H0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/runtime/ReactInstance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Lcom/facebook/react/runtime/c;

.field private c:Ljava/util/Map;

.field private d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/facebook/react/runtime/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->c:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->d:Ljava/util/Map;

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactInstance$b;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/facebook/react/runtime/ReactInstance$b;->b:Lcom/facebook/react/runtime/c;

    return-void
.end method

.method private d(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/M;

    instance-of v2, v1, Lcom/facebook/react/Z;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/facebook/react/Z;

    iget-object v2, p0, Lcom/facebook/react/runtime/ReactInstance$b;->b:Lcom/facebook/react/runtime/c;

    invoke-interface {v1, v2, p1}, Lcom/facebook/react/Z;->createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->c:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public declared-synchronized a()Ljava/util/Collection;
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactInstance$b;->e()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactInstance$b;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactInstance$b;->d(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactInstance$b;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c()Ljava/util/Map;
    .locals 5

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->d:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactInstance$b;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/M;

    instance-of v3, v2, Lcom/facebook/react/Z;

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactInstance$b;->b:Lcom/facebook/react/runtime/c;

    invoke-interface {v2, v3}, Lcom/facebook/react/M;->createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/uimanager/ViewManager;

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    iput-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$b;->d:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()Ljava/util/Collection;
    .locals 4

    .line 1
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactInstance$b;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/M;

    instance-of v3, v2, Lcom/facebook/react/Z;

    if-eqz v3, :cond_0

    check-cast v2, Lcom/facebook/react/Z;

    iget-object v3, p0, Lcom/facebook/react/runtime/ReactInstance$b;->b:Lcom/facebook/react/runtime/c;

    invoke-interface {v2, v3}, Lcom/facebook/react/Z;->getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method
