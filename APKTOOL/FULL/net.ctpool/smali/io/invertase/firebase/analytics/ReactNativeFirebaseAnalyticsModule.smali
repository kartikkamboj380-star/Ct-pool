.class public Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;
.super Lio/invertase/firebase/common/ReactNativeFirebaseModule;
.source "SourceFile"


# static fields
.field private static final SERVICE_NAME:Ljava/lang/String; = "Analytics"


# instance fields
.field private final module:Lio/invertase/firebase/analytics/v;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    const-string v0, "Analytics"

    invoke-direct {p0, p1, v0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V

    new-instance v1, Lio/invertase/firebase/analytics/v;

    invoke-direct {v1, p1, v0}, Lio/invertase/firebase/analytics/v;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$resetAnalyticsData$8(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$setConsent$10(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$setUserProperty$6(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$setUserId$5(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic e(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$setSessionTimeoutDuration$2(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$setDefaultEventParameters$9(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$getSessionId$4(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic h(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$logEvent$0(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic i(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$setUserProperties$7(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic j(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$getAppInstanceId$3(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic k(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->lambda$setAnalyticsCollectionEnabled$1(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method private static synthetic lambda$getAppInstanceId$3(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$getSessionId$4(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Long;->doubleValue()D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    return-void
.end method

.method private static synthetic lambda$logEvent$0(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$resetAnalyticsData$8(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$setAnalyticsCollectionEnabled$1(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$setConsent$10(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$setDefaultEventParameters$9(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$setSessionTimeoutDuration$2(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$setUserId$5(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$setUserProperties$7(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private static synthetic lambda$setUserProperty$6(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method private toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;
    .locals 5

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "items"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/os/Bundle;

    if-eqz v2, :cond_2

    check-cast v1, Landroid/os/Bundle;

    const-string v2, "quantity"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    double-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    :cond_3
    const-string v0, "extend_session"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    double-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_4
    return-object p1
.end method


# virtual methods
.method public getAppInstanceId(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-virtual {v0}, Lio/invertase/firebase/analytics/v;->l()Lz3/l;

    move-result-object v0

    new-instance v1, Lio/invertase/firebase/analytics/a;

    invoke-direct {v1, p1}, Lio/invertase/firebase/analytics/a;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public getSessionId(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-virtual {v0}, Lio/invertase/firebase/analytics/v;->m()Lz3/l;

    move-result-object v0

    new-instance v1, Lio/invertase/firebase/analytics/f;

    invoke-direct {v1, p1}, Lio/invertase/firebase/analytics/f;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public logEvent(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-direct {p0, p2}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/invertase/firebase/analytics/v;->w(Ljava/lang/String;Landroid/os/Bundle;)Lz3/l;

    move-result-object p1

    new-instance p2, Lio/invertase/firebase/analytics/e;

    invoke-direct {p2, p3}, Lio/invertase/firebase/analytics/e;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, p2}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public resetAnalyticsData(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-virtual {v0}, Lio/invertase/firebase/analytics/v;->x()Lz3/l;

    move-result-object v0

    new-instance v1, Lio/invertase/firebase/analytics/g;

    invoke-direct {v1, p1}, Lio/invertase/firebase/analytics/g;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public setAnalyticsCollectionEnabled(Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->y(Ljava/lang/Boolean;)Lz3/l;

    move-result-object p1

    new-instance v0, Lio/invertase/firebase/analytics/d;

    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/d;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public setConsent(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->z(Landroid/os/Bundle;)Lz3/l;

    move-result-object p1

    new-instance v0, Lio/invertase/firebase/analytics/c;

    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/c;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public setDefaultEventParameters(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->A(Landroid/os/Bundle;)Lz3/l;

    move-result-object p1

    new-instance v0, Lio/invertase/firebase/analytics/h;

    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/h;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public setSessionTimeoutDuration(DLcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    double-to-long p1, p1

    invoke-virtual {v0, p1, p2}, Lio/invertase/firebase/analytics/v;->B(J)Lz3/l;

    move-result-object p1

    new-instance p2, Lio/invertase/firebase/analytics/j;

    invoke-direct {p2, p3}, Lio/invertase/firebase/analytics/j;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, p2}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public setUserId(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->C(Ljava/lang/String;)Lz3/l;

    move-result-object p1

    new-instance v0, Lio/invertase/firebase/analytics/k;

    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/k;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public setUserProperties(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->D(Landroid/os/Bundle;)Lz3/l;

    move-result-object p1

    new-instance v0, Lio/invertase/firebase/analytics/i;

    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/i;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    invoke-virtual {v0, p1, p2}, Lio/invertase/firebase/analytics/v;->E(Ljava/lang/String;Ljava/lang/String;)Lz3/l;

    move-result-object p1

    new-instance p2, Lio/invertase/firebase/analytics/b;

    invoke-direct {p2, p3}, Lio/invertase/firebase/analytics/b;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, p2}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method
