.class public final Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;
.super Lapp/notifee/core/database/NotifeeCoreDatabase;
.source "SourceFile"


# instance fields
.field public volatile d:LS5/p;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lapp/notifee/core/database/NotifeeCoreDatabase;-><init>()V

    return-void
.end method

.method public static synthetic f(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;LZ/g;)LZ/g;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/room/u;->mDatabase:LZ/g;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic g(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic h(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic i(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;LZ/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/u;->internalInitInvalidationTracker(LZ/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic k(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic l(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic m(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic n(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic o(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic p(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public clearAllTables()V
    .locals 4

    const-string v0, "VACUUM"

    const-string v1, "PRAGMA wal_checkpoint(FULL)"

    invoke-virtual {p0}, Landroidx/room/u;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v2

    invoke-interface {v2}, LZ/h;->l0()LZ/g;

    move-result-object v2

    :try_start_0
    invoke-virtual {p0}, Landroidx/room/u;->beginTransaction()V

    const-string v3, "DELETE FROM `work_data`"

    invoke-interface {v2, v3}, LZ/g;->u(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

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

    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

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

.method public createInvalidationTracker()Landroidx/room/o;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/o;

    const-string v3, "work_data"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/o;-><init>(Landroidx/room/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createOpenHelper(Landroidx/room/f;)LZ/h;
    .locals 4

    .line 1
    new-instance v0, Landroidx/room/w;

    .line 2
    .line 3
    new-instance v1, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl$a;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, p0, v2}, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl$a;-><init>(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;I)V

    .line 7
    .line 8
    .line 9
    const-string v2, "24b2477514809255df232947ce7928c4"

    .line 10
    .line 11
    const-string v3, "1ddaa4b892e61b0f7010597ddc582ed3"

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

.method public d()LS5/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->d:LS5/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->d:LS5/p;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->d:LS5/p;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, LS5/q;

    .line 14
    .line 15
    invoke-direct {v0, p0}, LS5/q;-><init>(Landroidx/room/u;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->d:LS5/p;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->d:LS5/p;

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v0
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    const/4 p1, 0x0

    new-array p1, p1, [LW/b;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getRequiredAutoMigrationSpecs()Ljava/util/Set;
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public getRequiredTypeConverters()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-class v1, LS5/p;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
