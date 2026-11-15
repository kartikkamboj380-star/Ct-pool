.class Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;
.super Lcom/facebook/react/bridge/GuardedAsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;->multiGet(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/bridge/Callback;

.field final synthetic b:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic c:Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->c:Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;

    iput-object p3, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->a:Lcom/facebook/react/bridge/Callback;

    iput-object p4, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedAsyncTask;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)V
    .locals 14

    .line 1
    iget-object p1, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->c:Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;

    invoke-static {p1}, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;->b(Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->a:Lcom/facebook/react/bridge/Callback;

    invoke-static {v0}, Lcom/reactnativecommunity/asyncstorage/b;->a(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "key"

    const-string v1, "value"

    filled-new-array {p1, v1}, [Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v10

    const/4 v11, 0x0

    move v12, v11

    :goto_0
    iget-object v2, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v12, v2, :cond_5

    iget-object v2, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    sub-int/2addr v2, v12

    const/16 v3, 0x3e7

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v13

    iget-object v2, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->c:Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;

    invoke-static {v2}, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;->a(Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule;)Lcom/reactnativecommunity/asyncstorage/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/reactnativecommunity/asyncstorage/k;->g()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-static {v13}, Lcom/reactnativecommunity/asyncstorage/a;->a(I)Ljava/lang/String;

    move-result-object v5

    iget-object v3, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {v3, v12, v13}, Lcom/reactnativecommunity/asyncstorage/a;->b(Lcom/facebook/react/bridge/ReadableArray;II)[Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v3, "catalystLocalStorage"

    const/4 v7, 0x0

    move-object v4, p1

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v3

    iget-object v4, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v4}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v4

    if-eq v3, v4, :cond_1

    move v3, v12

    :goto_1
    add-int v4, v12, v13

    if-ge v3, v4, :cond_1

    iget-object v4, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v4, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v3

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    invoke-interface {v10, v3}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_2

    :cond_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v4

    invoke-interface {v4, v3}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    invoke-interface {v4}, Lcom/facebook/react/bridge/WritableArray;->pushNull()V

    invoke-interface {v10, v4}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    add-int/lit16 v12, v12, 0x3e7

    goto/16 :goto_0

    :goto_3
    :try_start_1
    const-string v1, "ReactNative"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, p1}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->a:Lcom/facebook/react/bridge/Callback;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/reactnativecommunity/asyncstorage/b;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-void

    :goto_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw p1

    :cond_5
    iget-object p1, p0, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->a:Lcom/facebook/react/bridge/Callback;

    filled-new-array {v0, v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method protected bridge synthetic doInBackgroundGuarded([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/asyncstorage/AsyncStorageModule$a;->a([Ljava/lang/Void;)V

    return-void
.end method
