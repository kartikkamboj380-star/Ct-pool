.class public Lcom/tenjin/android/store/TenjinDatasource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/params/platform/IDataSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;
    }
.end annotation


# instance fields
.field context:Landroid/content/Context;

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field oneWeekAgo:Ljava/util/Date;

.field private final queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x240c8400

    sub-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->oneWeekAgo:Ljava/util/Date;

    invoke-static {p1}, Lcom/tenjin/android/store/QueueEventDatabase;->getDatabase(Landroid/content/Context;)Lcom/tenjin/android/store/QueueEventDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tenjin/android/store/QueueEventDatabase;->queueEventDao()Lcom/tenjin/android/store/QueueEventDao;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    const-string v0, "tenjinInstallPreferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/store/TenjinDatasource;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static synthetic a(Lcom/tenjin/android/store/TenjinDatasource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/store/TenjinDatasource;->lambda$deleteOldEvents$5()V

    return-void
.end method

.method public static synthetic b(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tenjin/android/store/TenjinDatasource;->lambda$insertEventWithFuture$1(Lcom/tenjin/android/store/QueueEvent;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tenjin/android/store/TenjinDatasource;->lambda$getAllEvents$2(Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V

    return-void
.end method

.method public static synthetic d(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tenjin/android/store/TenjinDatasource;->lambda$insertEvent$0(Lcom/tenjin/android/store/QueueEvent;)V

    return-void
.end method

.method public static synthetic e(Lcom/tenjin/android/store/TenjinDatasource;Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/store/TenjinDatasource;->lambda$getEventWithParams$3(Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V

    return-void
.end method

.method public static synthetic f(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tenjin/android/store/TenjinDatasource;->lambda$deleteEvent$4(Lcom/tenjin/android/store/QueueEvent;)V

    return-void
.end method

.method private synthetic lambda$deleteEvent$4(Lcom/tenjin/android/store/QueueEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    invoke-interface {v0, p1}, Lcom/tenjin/android/store/QueueEventDao;->delete(Lcom/tenjin/android/store/QueueEvent;)V

    return-void
.end method

.method private synthetic lambda$deleteOldEvents$5()V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    iget-object v1, p0, Lcom/tenjin/android/store/TenjinDatasource;->oneWeekAgo:Ljava/util/Date;

    invoke-interface {v0, v1}, Lcom/tenjin/android/store/QueueEventDao;->deleteOldEvents(Ljava/util/Date;)V

    return-void
.end method

.method private synthetic lambda$getAllEvents$2(Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    iget-object v1, p0, Lcom/tenjin/android/store/TenjinDatasource;->oneWeekAgo:Ljava/util/Date;

    invoke-interface {v0, v1}, Lcom/tenjin/android/store/QueueEventDao;->getAllEvents(Ljava/util/Date;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    iget-object v2, p0, Lcom/tenjin/android/store/TenjinDatasource;->oneWeekAgo:Ljava/util/Date;

    invoke-interface {v1, v2}, Lcom/tenjin/android/store/QueueEventDao;->deleteOldEvents(Ljava/util/Date;)V

    invoke-interface {p1, v0}, Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;->onEventsLoaded(Ljava/util/List;)V

    return-void
.end method

.method private synthetic lambda$getEventWithParams$3(Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    invoke-static {p1}, Lcom/tenjin/android/store/TenjinDatasource;->stringFromMap(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tenjin/android/store/QueueEventDao;->getEventsFromParams(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;->onEventsLoaded(Ljava/util/List;)V

    return-void
.end method

.method private synthetic lambda$insertEvent$0(Lcom/tenjin/android/store/QueueEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    invoke-interface {v0, p1}, Lcom/tenjin/android/store/QueueEventDao;->insert(Lcom/tenjin/android/store/QueueEvent;)J

    return-void
.end method

.method private synthetic lambda$insertEventWithFuture$1(Lcom/tenjin/android/store/QueueEvent;)Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->queueEventDao:Lcom/tenjin/android/store/QueueEventDao;

    invoke-interface {v0, p1}, Lcom/tenjin/android/store/QueueEventDao;->insert(Lcom/tenjin/android/store/QueueEvent;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public static stringFromMap(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, LR4/d;

    invoke-direct {v0}, LR4/d;-><init>()V

    invoke-virtual {v0, p0}, LR4/d;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public deleteEvent(Lcom/tenjin/android/store/QueueEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/tenjin/android/store/b;

    invoke-direct {v1, p0, p1}, Lcom/tenjin/android/store/b;-><init>(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public deleteOldEvents()V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/tenjin/android/store/f;

    invoke-direct {v1, p0}, Lcom/tenjin/android/store/f;-><init>(Lcom/tenjin/android/store/TenjinDatasource;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getAllEvents(Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/tenjin/android/store/c;

    invoke-direct {v1, p0, p1}, Lcom/tenjin/android/store/c;-><init>(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCacheEventSetting()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "TENJIN_EVENT_CACHE_ENABLED"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getEventWithParams(Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/tenjin/android/store/a;

    invoke-direct {v1, p0, p1, p2}, Lcom/tenjin/android/store/a;-><init>(Lcom/tenjin/android/store/TenjinDatasource;Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getExecutorService()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getStoredAdvertisingId()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "TENJIN_ADVERTISING_ID_STORE"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStoredLimitAdTracking()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "TENJIN_AD_TRACKING_STORE"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public insertEvent(Lcom/tenjin/android/store/QueueEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/tenjin/android/store/e;

    invoke-direct {v1, p0, p1}, Lcom/tenjin/android/store/e;-><init>(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public insertEventWithFuture(Lcom/tenjin/android/store/QueueEvent;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tenjin/android/store/QueueEvent;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/tenjin/android/store/d;

    invoke-direct {v1, p0, p1}, Lcom/tenjin/android/store/d;-><init>(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public setAdvertisingIdInfo(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TENJIN_ADVERTISING_ID_STORE"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object p1, p0, Lcom/tenjin/android/store/TenjinDatasource;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "TENJIN_AD_TRACKING_STORE"

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setCacheEventSetting(Ljava/lang/Boolean;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set event cache setting "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TenjinSDK"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/store/TenjinDatasource;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TENJIN_EVENT_CACHE_ENABLED"

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
