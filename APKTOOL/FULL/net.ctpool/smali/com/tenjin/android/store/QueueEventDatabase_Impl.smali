.class public final Lcom/tenjin/android/store/QueueEventDatabase_Impl;
.super Lcom/tenjin/android/store/QueueEventDatabase;
.source "SourceFile"


# instance fields
.field private volatile _queueEventDao:Lcom/tenjin/android/store/QueueEventDao;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/store/QueueEventDatabase;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$300(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$400(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$500(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$602(Lcom/tenjin/android/store/QueueEventDatabase_Impl;LZ/g;)LZ/g;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/room/u;->mDatabase:LZ/g;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic access$700(Lcom/tenjin/android/store/QueueEventDatabase_Impl;LZ/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/u;->internalInitInvalidationTracker(LZ/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic access$800(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$900(Lcom/tenjin/android/store/QueueEventDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public clearAllTables()V
    .locals 4

    const-string v0, "VACUUM"

    const-string v1, "PRAGMA wal_checkpoint(FULL)"

    invoke-super {p0}, Landroidx/room/u;->assertNotMainThread()V

    invoke-super {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v2

    invoke-interface {v2}, LZ/h;->l0()LZ/g;

    move-result-object v2

    :try_start_0
    invoke-super {p0}, Landroidx/room/u;->beginTransaction()V

    const-string v3, "DELETE FROM `QueueEvent`"

    invoke-interface {v2, v3}, LZ/g;->u(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Landroidx/room/u;->endTransaction()V

    invoke-interface {v2, v1}, LZ/g;->o0(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-interface {v2}, LZ/g;->I0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v2, v0}, LZ/g;->u(Ljava/lang/String;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v3

    invoke-super {p0}, Landroidx/room/u;->endTransaction()V

    invoke-interface {v2, v1}, LZ/g;->o0(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-interface {v2}, LZ/g;->I0()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v2, v0}, LZ/g;->u(Ljava/lang/String;)V

    :cond_1
    throw v3
.end method

.method protected createInvalidationTracker()Landroidx/room/o;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/o;

    const-string v3, "QueueEvent"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/o;-><init>(Landroidx/room/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method protected createOpenHelper(Landroidx/room/f;)LZ/h;
    .locals 4

    .line 1
    new-instance v0, Landroidx/room/w;

    .line 2
    .line 3
    new-instance v1, Lcom/tenjin/android/store/QueueEventDatabase_Impl$1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Lcom/tenjin/android/store/QueueEventDatabase_Impl$1;-><init>(Lcom/tenjin/android/store/QueueEventDatabase_Impl;I)V

    .line 7
    .line 8
    .line 9
    const-string v2, "0a5a33ee0f6cf2beee6328f77b70fd7e"

    .line 10
    .line 11
    const-string v3, "6dbe33cc61883e1527e006254ba6946d"

    .line 12
    .line 13
    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/room/w;-><init>(Landroidx/room/f;Landroidx/room/w$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p1, Landroidx/room/f;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v1}, LZ/h$b;->a(Landroid/content/Context;)LZ/h$b$a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p1, Landroidx/room/f;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, LZ/h$b$a;->d(Ljava/lang/String;)LZ/h$b$a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, v0}, LZ/h$b$a;->c(LZ/h$a;)LZ/h$b$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, LZ/h$b$a;->b()LZ/h$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object p1, p1, Landroidx/room/f;->c:LZ/h$c;

    .line 37
    .line 38
    invoke-interface {p1, v0}, LZ/h$c;->a(LZ/h$b;)LZ/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "LW/a;",
            ">;",
            "LW/a;",
            ">;)",
            "Ljava/util/List<",
            "LW/b;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    new-array p1, p1, [LW/b;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getRequiredAutoMigrationSpecs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "LW/a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method protected getRequiredTypeConverters()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-class v1, Lcom/tenjin/android/store/QueueEventDao;

    invoke-static {}, Lcom/tenjin/android/store/QueueEventDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public queueEventDao()Lcom/tenjin/android/store/QueueEventDao;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDatabase_Impl;->_queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDatabase_Impl;->_queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDatabase_Impl;->_queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/tenjin/android/store/QueueEventDao_Impl;

    invoke-direct {v0, p0}, Lcom/tenjin/android/store/QueueEventDao_Impl;-><init>(Landroidx/room/u;)V

    iput-object v0, p0, Lcom/tenjin/android/store/QueueEventDatabase_Impl;->_queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDatabase_Impl;->_queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
