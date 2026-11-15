.class public final Lcom/tenjin/android/store/QueueEventDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/store/QueueEventDao;


# instance fields
.field private final __db:Landroidx/room/u;

.field private final __deletionAdapterOfQueueEvent:Landroidx/room/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/h;"
        }
    .end annotation
.end field

.field private final __insertionAdapterOfQueueEvent:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDeleteAllEvents:Landroidx/room/A;

.field private final __preparedStmtOfDeleteOldEvents:Landroidx/room/A;


# direct methods
.method public constructor <init>(Landroidx/room/u;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    new-instance v0, Lcom/tenjin/android/store/QueueEventDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lcom/tenjin/android/store/QueueEventDao_Impl$1;-><init>(Lcom/tenjin/android/store/QueueEventDao_Impl;Landroidx/room/u;)V

    iput-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__insertionAdapterOfQueueEvent:Landroidx/room/i;

    new-instance v0, Lcom/tenjin/android/store/QueueEventDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lcom/tenjin/android/store/QueueEventDao_Impl$2;-><init>(Lcom/tenjin/android/store/QueueEventDao_Impl;Landroidx/room/u;)V

    iput-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__deletionAdapterOfQueueEvent:Landroidx/room/h;

    new-instance v0, Lcom/tenjin/android/store/QueueEventDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lcom/tenjin/android/store/QueueEventDao_Impl$3;-><init>(Lcom/tenjin/android/store/QueueEventDao_Impl;Landroidx/room/u;)V

    iput-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteAllEvents:Landroidx/room/A;

    new-instance v0, Lcom/tenjin/android/store/QueueEventDao_Impl$4;

    invoke-direct {v0, p0, p1}, Lcom/tenjin/android/store/QueueEventDao_Impl$4;-><init>(Lcom/tenjin/android/store/QueueEventDao_Impl;Landroidx/room/u;)V

    iput-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteOldEvents:Landroidx/room/A;

    return-void
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public delete(Lcom/tenjin/android/store/QueueEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->beginTransaction()V

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__deletionAdapterOfQueueEvent:Landroidx/room/h;

    invoke-virtual {v0, p1}, Landroidx/room/h;->handle(Ljava/lang/Object;)I

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->endTransaction()V

    throw p1
.end method

.method public deleteAllEvents()V
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteAllEvents:Landroidx/room/A;

    invoke-virtual {v0}, Landroidx/room/A;->acquire()LZ/k;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v1}, Landroidx/room/u;->beginTransaction()V

    :try_start_0
    invoke-interface {v0}, LZ/k;->D()I

    iget-object v1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v1}, Landroidx/room/u;->endTransaction()V

    iget-object v1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteAllEvents:Landroidx/room/A;

    invoke-virtual {v1, v0}, Landroidx/room/A;->release(LZ/k;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v2}, Landroidx/room/u;->endTransaction()V

    iget-object v2, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteAllEvents:Landroidx/room/A;

    invoke-virtual {v2, v0}, Landroidx/room/A;->release(LZ/k;)V

    throw v1
.end method

.method public deleteOldEvents(Ljava/util/Date;)V
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteOldEvents:Landroidx/room/A;

    invoke-virtual {v0}, Landroidx/room/A;->acquire()LZ/k;

    move-result-object v0

    invoke-static {p1}, Lcom/tenjin/android/store/TenjinRoomConverters;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p1

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, LZ/i;->A0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, LZ/i;->b0(IJ)V

    :goto_0
    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->beginTransaction()V

    :try_start_0
    invoke-interface {v0}, LZ/k;->D()I

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->endTransaction()V

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteOldEvents:Landroidx/room/A;

    invoke-virtual {p1, v0}, Landroidx/room/A;->release(LZ/k;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v1}, Landroidx/room/u;->endTransaction()V

    iget-object v1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__preparedStmtOfDeleteOldEvents:Landroidx/room/A;

    invoke-virtual {v1, v0}, Landroidx/room/A;->release(LZ/k;)V

    throw p1
.end method

.method public getAllEvents(Ljava/util/Date;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")",
            "Ljava/util/List<",
            "Lcom/tenjin/android/store/QueueEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM QueueEvent WHERE date >= ? ORDER BY date DESC"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/room/x;->d(Ljava/lang/String;I)Landroidx/room/x;

    move-result-object v0

    invoke-static {p1}, Lcom/tenjin/android/store/TenjinRoomConverters;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/room/x;->A0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroidx/room/x;->b0(IJ)V

    :goto_0
    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, LX/b;->b(Landroidx/room/u;LZ/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v1, "id"

    invoke-static {p1, v1}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string v3, "params"

    invoke-static {p1, v3}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "date"

    invoke-static {p1, v4}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "endpoint"

    invoke-static {p1, v5}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-eqz v7, :cond_4

    new-instance v7, Lcom/tenjin/android/store/QueueEvent;

    invoke-direct {v7}, Lcom/tenjin/android/store/QueueEvent;-><init>()V

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setId(I)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v8, v2

    goto :goto_2

    :cond_1
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_2
    invoke-static {v8}, Lcom/tenjin/android/store/TenjinRoomConverters;->fromString(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setParams(Ljava/util/Map;)V

    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v8, v2

    goto :goto_3

    :cond_2
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_3
    invoke-static {v8}, Lcom/tenjin/android/store/TenjinRoomConverters;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setDate(Ljava/util/Date;)V

    invoke-interface {p1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object v8, v2

    goto :goto_4

    :cond_3
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_4
    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setEndpoint(Ljava/lang/String;)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    return-object v6

    :goto_5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    throw v1
.end method

.method public getEventsFromParams(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tenjin/android/store/QueueEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM QueueEvent WHERE params == ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/room/x;->d(Ljava/lang/String;I)Landroidx/room/x;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/room/x;->A0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Landroidx/room/x;->v(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, LX/b;->b(Landroidx/room/u;LZ/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v1, "id"

    invoke-static {p1, v1}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string v3, "params"

    invoke-static {p1, v3}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "date"

    invoke-static {p1, v4}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "endpoint"

    invoke-static {p1, v5}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-eqz v7, :cond_4

    new-instance v7, Lcom/tenjin/android/store/QueueEvent;

    invoke-direct {v7}, Lcom/tenjin/android/store/QueueEvent;-><init>()V

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setId(I)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v8, v2

    goto :goto_2

    :cond_1
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_2
    invoke-static {v8}, Lcom/tenjin/android/store/TenjinRoomConverters;->fromString(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setParams(Ljava/util/Map;)V

    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v8, v2

    goto :goto_3

    :cond_2
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_3
    invoke-static {v8}, Lcom/tenjin/android/store/TenjinRoomConverters;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setDate(Ljava/util/Date;)V

    invoke-interface {p1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object v8, v2

    goto :goto_4

    :cond_3
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_4
    invoke-virtual {v7, v8}, Lcom/tenjin/android/store/QueueEvent;->setEndpoint(Ljava/lang/String;)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    return-object v6

    :goto_5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    throw v1
.end method

.method public insert(Lcom/tenjin/android/store/QueueEvent;)J
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->beginTransaction()V

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__insertionAdapterOfQueueEvent:Landroidx/room/i;

    invoke-virtual {v0, p1}, Landroidx/room/i;->insertAndReturnId(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->endTransaction()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEventDao_Impl;->__db:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->endTransaction()V

    throw p1
.end method
