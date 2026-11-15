.class public Lcom/tenjin/android/TenjinSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tenjin/android/TenjinSDK$AsyncEvent;,
        Lcom/tenjin/android/TenjinSDK$AppStoreType;,
        Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;,
        Lcom/tenjin/android/TenjinSDK$AsyncConnect;,
        Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;,
        Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;
    }
.end annotation


# static fields
.field public static final DEEPLINK_URL:Ljava/lang/String; = "deferred_deeplink_url"

.field private static final FETCH_ATTRIBUTION_INFO_DATA_MAX_BACKOFF_TIME:I = 0x2710

.field private static final FETCH_ATTRIBUTION_INFO_DATA_RETRY_COUNT:I = 0x5

.field private static appStoreType:Lcom/tenjin/android/TenjinSDK$AppStoreType;

.field private static final attributionInfoSent:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final deepLinkSent:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static tenjinSDK:Lcom/tenjin/android/TenjinSDK;

.field public static wrapperVersion:Ljava/lang/String;


# instance fields
.field private amazonSandboxMode:Z

.field private apiKey:Ljava/lang/String;

.field private appSubversion:Ljava/lang/Integer;

.field private async:Lcom/tenjin/android/utils/threading/IThreading;

.field private attributionResult:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private callback:Lcom/tenjin/android/Callback;

.field private clickedTenjinLink:Z

.field private config:Lcom/tenjin/android/config/SDKConfig;

.field private connectTask:Landroid/os/AsyncTask;

.field private connectThreshold:J

.field private final consentParamFilter:Lcom/tenjin/android/params/ConsentParamFilter;

.field private context:Landroid/content/Context;

.field private deferredDeeplink:Ljava/lang/String;

.field private final paramProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tenjin/android/params/base/ParamProvider;",
            ">;"
        }
    .end annotation
.end field

.field private requestProcessingQueue:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private requestQueue:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private requestThreshold:J

.field private result:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private sessionId:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private startup:Lcom/tenjin/android/utils/TenjinStartup;

.field private final startupLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK;->deepLinkSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK;->attributionInfoSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v0, ""

    sput-object v0, Lcom/tenjin/android/TenjinSDK;->wrapperVersion:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK;->getStandardParams(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3, p4}, Lcom/tenjin/android/TenjinSDK;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tenjin/android/params/base/ParamProvider;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/tenjin/android/params/ConsentParamFilter;

    invoke-direct {v0}, Lcom/tenjin/android/params/ConsentParamFilter;-><init>()V

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK;->consentParamFilter:Lcom/tenjin/android/params/ConsentParamFilter;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK;->deferredDeeplink:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tenjin/android/TenjinSDK;->clickedTenjinLink:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/tenjin/android/TenjinSDK;->connectThreshold:J

    const-wide/16 v2, 0x3e8

    iput-wide v2, p0, Lcom/tenjin/android/TenjinSDK;->requestThreshold:J

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    iput-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestProcessingQueue:Ljava/util/Map;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    iput-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/tenjin/android/TenjinSDK;->result:Ljava/util/Map;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/tenjin/android/TenjinSDK;->attributionResult:Ljava/util/Map;

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    iput-boolean v1, p0, Lcom/tenjin/android/TenjinSDK;->amazonSandboxMode:Z

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK;->apiKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/tenjin/android/TenjinSDK;->sharedSecret:Ljava/lang/String;

    iput-object p4, p0, Lcom/tenjin/android/TenjinSDK;->appSubversion:Ljava/lang/Integer;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK;->startupLock:Ljava/lang/Object;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    new-instance p2, Lcom/tenjin/android/config/SDKConfig;

    invoke-direct {p2}, Lcom/tenjin/android/config/SDKConfig;-><init>()V

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK;->config:Lcom/tenjin/android/config/SDKConfig;

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK;->paramProviders:Ljava/util/List;

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    sput-wide p1, Lcom/tenjin/android/utils/TenjinUtils;->startTime:J

    return-void
.end method

.method public static synthetic a(Lcom/tenjin/android/TenjinSDK;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->lambda$handleCachedEvents$0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/tenjin/android/TenjinSDK;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->getParams(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1100(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->removeRequestQueue(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1200(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1300(Lcom/tenjin/android/TenjinSDK;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->paramProviders:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->startupLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/tenjin/android/TenjinSDK;)Lcom/tenjin/android/utils/TenjinStartup;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->startup:Lcom/tenjin/android/utils/TenjinStartup;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/tenjin/android/TenjinSDK;)Z
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isReadyToConnect()Z

    move-result p0

    return p0
.end method

.method static synthetic access$1700(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->getParams()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1800(Lcom/tenjin/android/TenjinSDK;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$1900()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic access$2002(Lcom/tenjin/android/TenjinSDK;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    return-object p1
.end method

.method static synthetic access$2100(Lcom/tenjin/android/TenjinSDK;)V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->processQueue()V

    return-void
.end method

.method static synthetic access$2200(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2300(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$2400(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$2500(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tenjin/android/TenjinSDK;->sendResultToCallback(Lcom/tenjin/android/Callback;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic access$2602(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;)Lcom/tenjin/android/Callback;
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK;->callback:Lcom/tenjin/android/Callback;

    return-object p1
.end method

.method static synthetic access$2700(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tenjin/android/TenjinSDK;->processOnPostExecuteCallback(Ljava/lang/String;Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V

    return-void
.end method

.method static synthetic access$2800(Lcom/tenjin/android/TenjinSDK;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/tenjin/android/TenjinSDK;->clickedTenjinLink:Z

    return p0
.end method

.method static synthetic access$2900(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->result:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$3000(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/AttributionInfoCallback;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK;->sendResultToAttributionInfoCallback(Lcom/tenjin/android/AttributionInfoCallback;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3100(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->attributionResult:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$900(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK;->apiKey:Ljava/lang/String;

    return-object p0
.end method

.method private addAppSubversionToParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->appSubversion:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->appSubversion:Ljava/lang/Integer;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "app_subversion"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private addConversionUpdateRequestQueue(I)Z
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    const-string v1, "requestConversionUpdate"

    invoke-static {v1, p1}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/tenjin/android/model/EventName;

    const-string v3, "requestConversionUpdate"

    invoke-direct {v2, v1, v3, p1}, Lcom/tenjin/android/model/EventName;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private addCustomerUserIdToParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->getCustomerUserId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "customer_user_id"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private addDeeplinkToParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->deferredDeeplink:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "deeplink_url"

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->decodeDeeplink(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private addEphemeralDataToParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "session_id"

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sent_at"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private addRequestQueue(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3200(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "eventNameTransaction"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_1
    const-string v3, "eventName"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_2
    const-string v3, "eventNameIntValue"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_3
    const-string v3, "eventNameTransactionData"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_4
    const-string v3, "eventNameValue"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    move v2, v0

    :goto_0
    packed-switch v2, :pswitch_data_0

    return v0

    :pswitch_0
    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3600(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3700(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3800(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)I

    move-result v6

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3900(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)D

    move-result-wide v7

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Ljava/lang/String;ID)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3300(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3300(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3500(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;I)Z

    move-result p1

    return p1

    :pswitch_3
    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3600(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3700(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3800(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)I

    move-result v3

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3900(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)D

    move-result-wide v4

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$4000(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$4100(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v7

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_4
    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3300(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->access$3400(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :sswitch_data_0
    .sparse-switch
        -0x7e01ffd4 -> :sswitch_4
        -0x62d0e75d -> :sswitch_3
        -0x357685d9 -> :sswitch_2
        0x1dc8445 -> :sswitch_1
        0xbd50959 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private addRequestQueue(Lcom/tenjin/android/model/Transaction;)Z
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/tenjin/android/model/EventKey;->getEventKey(Lcom/tenjin/android/model/Transaction;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/tenjin/android/model/EventName;

    invoke-direct {v2, p1}, Lcom/tenjin/android/model/EventName;-><init>(Lcom/tenjin/android/model/Transaction;)V

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private addRequestQueue(Ljava/lang/String;)Z
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/tenjin/android/model/EventName;

    invoke-direct {v2, p1}, Lcom/tenjin/android/model/EventName;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private addRequestQueue(Ljava/lang/String;I)Z
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-static {p1, p2}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/tenjin/android/model/EventName;

    invoke-direct {v2, p1, p2}, Lcom/tenjin/android/model/EventName;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private addRequestQueue(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)Z
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/tenjin/android/model/EventName;

    invoke-direct {v1, p1, p2}, Lcom/tenjin/android/model/EventName;-><init>(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V

    iget-object p2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private addRequestQueue(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-static {p1, p2}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/tenjin/android/model/EventName;

    invoke-direct {v2, p1, p2}, Lcom/tenjin/android/model/EventName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private addRequestQueue(Ljava/lang/String;Ljava/lang/String;ID)Z
    .locals 9

    .line 7
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;ID)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v8, Lcom/tenjin/android/model/EventName;

    move-object v2, v8

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, p4

    invoke-direct/range {v2 .. v7}, Lcom/tenjin/android/model/EventName;-><init>(Ljava/lang/String;Ljava/lang/String;ID)V

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {p1, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private addRequestQueue(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)Z
    .locals 12

    .line 8
    move-object v1, p0

    iget-object v2, v1, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v2

    :try_start_0
    invoke-static/range {p1 .. p7}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, v1, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    monitor-exit v2

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v11, Lcom/tenjin/android/model/EventName;

    move-object v3, v11

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-wide/from16 v7, p4

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v3 .. v10}, Lcom/tenjin/android/model/EventName;-><init>(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)V

    iget-object v3, v1, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v3, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2

    const/4 v0, 0x1

    return v0

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private addRetryEnabledToParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/tenjin/android/store/TenjinDatasource;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/store/TenjinDatasource;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/tenjin/android/store/TenjinDatasource;->getCacheEventSetting()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "retry_enabled"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private addSandboxModeToParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/tenjin/android/TenjinSDK;->amazonSandboxMode:Z

    if-eqz v0, :cond_0

    const-string v0, "sandbox"

    const-string v1, "true"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private addSignatureToParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->sharedSecret:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Lcom/tenjin/android/utils/TenjinUtils;->getHMACSignature(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "signature"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private applyTrackingParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->paramProviders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tenjin/android/params/base/ParamProvider;

    invoke-interface {v1, p1}, Lcom/tenjin/android/params/base/ParamProvider;->apply(Ljava/util/Map;)Ljava/util/Map;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private decodeDeeplink(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "UTF-8"

    :try_start_0
    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {v3, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const-string p1, ""

    return-object p1
.end method

.method private executeRequestWithCallback(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)Z

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK;->startAsyncTask(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static getAppStore()Lcom/tenjin/android/TenjinSDK$AppStoreType;
    .locals 1

    sget-object v0, Lcom/tenjin/android/TenjinSDK;->appStoreType:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tenjin/android/TenjinSDK;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    if-nez v1, :cond_1

    new-instance v1, Lcom/tenjin/android/TenjinSDK;

    invoke-direct {v1, p0, p1, v0, v0}, Lcom/tenjin/android/TenjinSDK;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    :cond_1
    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->startup()V

    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    return-object p0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static getInstanceWithAppSubversion(Landroid/content/Context;Ljava/lang/String;I)Lcom/tenjin/android/TenjinSDK;
    .locals 3

    .line 1
    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    if-nez v1, :cond_1

    new-instance v1, Lcom/tenjin/android/TenjinSDK;

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, p2}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v1, p0, p1, v0, v2}, Lcom/tenjin/android/TenjinSDK;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    :cond_1
    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->startup()V

    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    return-object p0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static getInstanceWithAppSubversion(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Lcom/tenjin/android/TenjinSDK;
    .locals 2

    .line 2
    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    if-nez v1, :cond_1

    new-instance v1, Lcom/tenjin/android/TenjinSDK;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/tenjin/android/TenjinSDK;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    :cond_1
    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->startup()V

    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    return-object p0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static getInstanceWithSharedSecret(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/tenjin/android/TenjinSDK;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    if-nez v1, :cond_1

    new-instance v1, Lcom/tenjin/android/TenjinSDK;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/tenjin/android/TenjinSDK;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v1, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    :cond_1
    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->startup()V

    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    return-object p0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static getInstanceWithSharedSecretAppSubversion(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Lcom/tenjin/android/TenjinSDK;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/tenjin/android/TenjinSDK;

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/tenjin/android/TenjinSDK;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    :cond_1
    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->startup()V

    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getInstanceWithSharedSecretAppSubversion(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/tenjin/android/TenjinSDK;
    .locals 1

    .line 2
    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/tenjin/android/TenjinSDK;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tenjin/android/TenjinSDK;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    :cond_1
    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->startup()V

    sget-object p0, Lcom/tenjin/android/TenjinSDK;->tenjinSDK:Lcom/tenjin/android/TenjinSDK;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private getJsonObjectFromJsonString(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "TenjinSDK"

    const-string v1, "Error while creating JSON object from string"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->getParams(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private getParams(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->applyTrackingParams(Ljava/util/Map;)V

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addEphemeralDataToParams(Ljava/util/Map;)V

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addAppSubversionToParams(Ljava/util/Map;)V

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addDeeplinkToParams(Ljava/util/Map;)V

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addCustomerUserIdToParams(Ljava/util/Map;)V

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addRetryEnabledToParams(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->consentParamFilter:Lcom/tenjin/android/params/ConsentParamFilter;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/params/ConsentParamFilter;->apply(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addSignatureToParams(Ljava/util/Map;)V

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addSandboxModeToParams(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-object p1
.end method

.method private static getStandardParams(Landroid/content/Context;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/tenjin/android/params/base/ParamProvider;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/tenjin/android/params/AndroidParams;

    invoke-direct {v1, p0}, Lcom/tenjin/android/params/AndroidParams;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/tenjin/android/params/TenjinParams;

    new-instance v2, Lcom/tenjin/android/store/SharedPrefsStore;

    invoke-direct {v2, p0}, Lcom/tenjin/android/store/SharedPrefsStore;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/tenjin/android/params/TenjinParams;-><init>(Lcom/tenjin/android/store/DataStore;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/tenjin/android/params/DMAParams;

    invoke-direct {v1, p0}, Lcom/tenjin/android/params/DMAParams;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/tenjin/android/params/MetaReferrerParams;

    invoke-direct {v1, p0}, Lcom/tenjin/android/params/MetaReferrerParams;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private handleCachedEvents()V
    .locals 2

    new-instance v0, Lcom/tenjin/android/store/TenjinDatasource;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/store/TenjinDatasource;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/tenjin/android/store/TenjinDatasource;->getCacheEventSetting()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/tenjin/android/a;

    invoke-direct {v1, p0}, Lcom/tenjin/android/a;-><init>(Lcom/tenjin/android/TenjinSDK;)V

    invoke-virtual {v0, v1}, Lcom/tenjin/android/store/TenjinDatasource;->getAllEvents(Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V

    :cond_0
    return-void
.end method

.method private hasJsonData(Ljava/lang/String;)Z
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lez p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return v1
.end method

.method private inRequestQueue(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private isILRDfeatureEnabled()Z
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->config:Lcom/tenjin/android/config/SDKConfig;

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeyILRDEnabled:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tenjin/android/config/SDKConfig;->boolForKey(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TenjinSDK"

    const-string v1, "Received ILRD data, but ILRD feature is not enabled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private isReadyToConnect()Z
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->startup:Lcom/tenjin/android/utils/TenjinStartup;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/tenjin/android/utils/TenjinStartup;->completed()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method private synthetic lambda$handleCachedEvents$0(Ljava/util/List;)V
    .locals 5

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tenjin/android/store/QueueEvent;

    invoke-virtual {v1}, Lcom/tenjin/android/store/QueueEvent;->getParams()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "retry_items"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v1, v3}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/store/QueueEvent;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Void;

    invoke-virtual {v2, v1, v3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private processOnPostExecuteCallback(Ljava/lang/String;Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->hasJsonData(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p2}, Lcom/tenjin/android/TenjinSDK;->removeRequestQueue(Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)Z

    :goto_0
    return-void
.end method

.method private processQueue()V
    .locals 13

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tenjin/android/model/EventName;

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "eventName"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->eventWithName(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_1

    :cond_1
    const-string v4, "eventNameValue"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v3, v2}, Lcom/tenjin/android/TenjinSDK;->eventWithNameAndValue(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v4, "eventNameIntValue"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getIntValue()I

    move-result v4

    invoke-static {v3, v4}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getIntValue()I

    move-result v2

    invoke-virtual {p0, v3, v2}, Lcom/tenjin/android/TenjinSDK;->eventWithNameAndValue(Ljava/lang/String;I)V

    goto :goto_0

    :cond_3
    const-string v4, "eventNameTransaction"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getProductId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getCurrencyCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getQuantity()I

    move-result v5

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getUnitPrice()D

    move-result-wide v6

    invoke-static {v3, v4, v5, v6, v7}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;ID)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getProductId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getCurrencyCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getQuantity()I

    move-result v7

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getUnitPrice()D

    move-result-wide v8

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/tenjin/android/TenjinSDK;->transaction(Ljava/lang/String;Ljava/lang/String;ID)V

    goto/16 :goto_0

    :cond_4
    const-string v4, "eventNameTransactionData"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getProductId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getCurrencyCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getQuantity()I

    move-result v7

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getUnitPrice()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getPurchaseData()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getDataSignature()Ljava/lang/String;

    move-result-object v11

    invoke-static/range {v5 .. v11}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getProductId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getCurrencyCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getQuantity()I

    move-result v7

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getUnitPrice()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getPurchaseData()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getDataSignature()Ljava/lang/String;

    move-result-object v11

    move-object v4, p0

    invoke-virtual/range {v4 .. v11}, Lcom/tenjin/android/TenjinSDK;->transaction(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_5
    const-string v4, "eventNameTransactionAmazon"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getProductId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getCurrencyCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getQuantity()I

    move-result v7

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getUnitPrice()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getReceiptId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getUserId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getPurchaseData()Ljava/lang/String;

    move-result-object v12

    invoke-static/range {v5 .. v12}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getTransactionData()Lcom/tenjin/android/model/Transaction;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->transactionAmazon(Lcom/tenjin/android/model/Transaction;)V

    goto/16 :goto_0

    :cond_6
    const-string v4, "eventGetDeeplink"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v3, "eventGetDeeplink"

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getDeferredDeeplinkCallback()Lcom/tenjin/android/Callback;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->getDeeplink(Lcom/tenjin/android/Callback;)V

    goto/16 :goto_0

    :cond_7
    const-string v4, "eventGetAttributionInfo"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const-string v3, "eventGetAttributionInfo"

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAttributionInfoCallback()Lcom/tenjin/android/AttributionInfoCallback;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->getAttributionInfo(Lcom/tenjin/android/AttributionInfoCallback;)V

    goto/16 :goto_0

    :cond_8
    const-string v4, "eventAdImpressionDataAppLovin"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v5, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAppLovin(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    :cond_9
    const-string v4, "eventAdImpressionDataIronSource"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v5, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionIronSource(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    :cond_a
    const-string v4, "eventAdImpressionDataHyperBid"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v5, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionHyperBid(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    :cond_b
    const-string v4, "eventAdImpressionDataAdMob"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v5, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAdMob(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    :cond_c
    const-string v4, "eventAdImpressionDataTopOn"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v5, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionTopOn(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    :cond_d
    const-string v4, "eventAdImpressionData"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v5, p0, Lcom/tenjin/android/TenjinSDK;->sessionId:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionAdNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getAdImpressionData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p0, v3, v2}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto/16 :goto_0

    :cond_e
    const-string v4, "requestConversionUpdate"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lcom/tenjin/android/model/EventName;->getIntValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/tenjin/android/TenjinSDK;->updateConversionValue(I)V

    goto/16 :goto_0

    :cond_f
    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private queueProcessingEvent(Ljava/lang/String;)Z
    .locals 3

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->requestProcessingQueue:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method private removeProcessingRequest(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestProcessingQueue:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestProcessingQueue:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private removeRequestQueue(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestQueue:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private requestIsProcessing(Ljava/lang/String;)Z
    .locals 6

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestProcessingQueue:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->requestProcessingQueue:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-string v0, "connect"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v4, p0, Lcom/tenjin/android/TenjinSDK;->connectThreshold:J

    goto :goto_0

    :cond_0
    iget-wide v4, p0, Lcom/tenjin/android/TenjinSDK;->requestThreshold:J

    :goto_0
    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->removeProcessingRequest(Ljava/lang/String;)Z

    return v1

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->queueProcessingEvent(Ljava/lang/String;)Z

    return v1
.end method

.method private sendResultToAttributionInfoCallback(Lcom/tenjin/android/AttributionInfoCallback;Ljava/lang/String;)V
    .locals 12

    const-string v0, "click_id"

    const-string v1, "deferred_deeplink_url"

    const-string v2, "remote_campaign_id"

    const-string v3, "site_id"

    const-string v4, "creative_name"

    const-string v5, "advertising_id"

    const-string v6, "campaign_id"

    const-string v7, "campaign_name"

    const-string v8, "ad_network"

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    if-eqz p2, :cond_0

    :try_start_0
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result p2

    if-lez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {v10, v8, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9, v8, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v7, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v6, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v9, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v5, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v9, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v4, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v9, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v3, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v9, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v2, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v9, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v9, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v0, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v9, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v9, p0, Lcom/tenjin/android/TenjinSDK;->attributionResult:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/tenjin/android/TenjinSDK$4;

    invoke-direct {v0, p0, p1}, Lcom/tenjin/android/TenjinSDK$4;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/AttributionInfoCallback;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private sendResultToCallback(Lcom/tenjin/android/Callback;Ljava/lang/String;Z)V
    .locals 7

    sget-object v0, Lcom/tenjin/android/TenjinSDK;->deepLinkSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p2, :cond_3

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    move-result p2

    if-lez p2, :cond_2

    invoke-virtual {v3}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object p2

    move v4, v2

    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK;->result:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_2
    iget-object p2, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    const-string v3, "tenjinInstallPreferences"

    invoke-virtual {p2, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string v3, "tenjinInstallReferrerSent"

    invoke-interface {p2, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lcom/tenjin/android/TenjinSDK;->clickedTenjinLink:Z

    const-string p2, "ad_network"

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "organic"

    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    xor-int/2addr p2, v1

    iput-boolean p2, p0, Lcom/tenjin/android/TenjinSDK;->clickedTenjinLink:Z

    :cond_3
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/tenjin/android/TenjinSDK$3;

    invoke-direct {v0, p0, p1, p3}, Lcom/tenjin/android/TenjinSDK$3;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;Z)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static setWrapperVersion(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/tenjin/android/TenjinSDK;->wrapperVersion:Ljava/lang/String;

    return-void
.end method

.method private startAsyncTask(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v0, 0x0

    const-string v1, "eventGetDeeplink"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "eventGetAttributionInfo"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;

    check-cast p2, Lcom/tenjin/android/AttributionInfoCallback;

    invoke-direct {p1, p0, p2}, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/AttributionInfoCallback;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v0, v0, [Lcom/tenjin/android/Callback;

    invoke-virtual {p1, p2, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected event name in executing request with callback: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;

    check-cast p2, Lcom/tenjin/android/Callback;

    invoke-direct {p1, p0, p2}, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v0, v0, [Lcom/tenjin/android/Callback;

    invoke-virtual {p1, p2, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method private startup()V
    .locals 3

    new-instance v0, Lcom/tenjin/android/utils/TenjinStartup;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    new-instance v2, Lcom/tenjin/android/store/SharedPrefsStore;

    invoke-direct {v2, v1}, Lcom/tenjin/android/store/SharedPrefsStore;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/utils/TenjinStartup;-><init>(Landroid/content/Context;Lcom/tenjin/android/store/DataStore;)V

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK;->startup:Lcom/tenjin/android/utils/TenjinStartup;

    new-instance v1, Lcom/tenjin/android/TenjinSDK$1;

    invoke-direct {v1, p0}, Lcom/tenjin/android/TenjinSDK$1;-><init>(Lcom/tenjin/android/TenjinSDK;)V

    iput-object v1, v0, Lcom/tenjin/android/utils/TenjinStartup;->callback:Lcom/tenjin/android/utils/TenjinStartup$StartupCallback;

    new-instance v0, Lcom/tenjin/android/TenjinSDK$2;

    invoke-direct {v0, p0}, Lcom/tenjin/android/TenjinSDK$2;-><init>(Lcom/tenjin/android/TenjinSDK;)V

    invoke-static {v0}, Lcom/tenjin/android/utils/TenjinUtils;->runAsync(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public appendAppSubversion(I)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK;->appSubversion:Ljava/lang/Integer;

    return-void
.end method

.method public appendAppSubversion(Ljava/lang/Integer;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK;->appSubversion:Ljava/lang/Integer;

    return-void
.end method

.method public connect()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lcom/tenjin/android/TenjinSDK;->connect(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public connect(Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/tenjin/android/TenjinSDK;->connect(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public connect(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 3
    const-string v0, "Connecting..."

    const-string v1, "TenjinSDK"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "optin"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->optIn()V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    const-string v0, "optout"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->optOut()V

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK;->deferredDeeplink:Ljava/lang/String;

    :cond_2
    const-string p1, "connect"

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/tenjin/android/TenjinSDK$AsyncConnect;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/tenjin/android/TenjinSDK$AsyncConnect;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, p2, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    return-void

    :cond_4
    :goto_1
    const-string p1, "Dropping duplicate connect call"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 2

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Lorg/json/JSONObject;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public eventAdImpressionAdMob(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;->convertToJsonObject(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAdMob(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionAdMob(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->getJsonObjectFromJsonString(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAdMob(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionAdMob(Lorg/json/JSONObject;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "admob"

    invoke-virtual {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionAppLovin(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->convertToJsonObject(Landroid/content/Context;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAppLovin(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionAppLovin(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->getJsonObjectFromJsonString(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAppLovin(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionAppLovin(Lorg/json/JSONObject;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "applovin"

    invoke-virtual {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionCAS(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/CASHelper;->convertToJsonObject(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionCAS(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionCAS(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionCAS(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "TenjinSDK"

    const-string v1, "Error while creating JSON CAS object from string"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public eventAdImpressionCAS(Lorg/json/JSONObject;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "cas"

    invoke-virtual {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionHyperBid(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->convertToJsonObject(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionHyperBid(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionHyperBid(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->getJsonObjectFromJsonString(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionHyperBid(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionHyperBid(Lorg/json/JSONObject;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "hyperbid"

    invoke-virtual {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionIronSource(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->convertToJsonObject(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionIronSource(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionIronSource(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->getJsonObjectFromJsonString(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionIronSource(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionIronSource(Lorg/json/JSONObject;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ironsource"

    invoke-virtual {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionTopOn(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/TopOnHelper;->convertToJsonObject(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionTopOn(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionTopOn(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionTopOn(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "TenjinSDK"

    const-string v1, "Error while creating JSON TopOn object from string"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public eventAdImpressionTopOn(Lorg/json/JSONObject;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "topon"

    invoke-virtual {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionTradPlus(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->convertToJsonObject(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionTradPlus(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventAdImpressionTradPlus(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionTradPlus(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "TenjinSDK"

    const-string v1, "Error while creating JSON CAS object from string"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public eventAdImpressionTradPlus(Lorg/json/JSONObject;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->isILRDfeatureEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "tradplus"

    invoke-virtual {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpression(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public eventWithName(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->inRequestQueue(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;)Z

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->handleCachedEvents()V

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    const-string p1, "TenjinSDK"

    const-string v0, "Tenjin WARNING: Your event was not sent because the eventName was not valid."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void
.end method

.method public eventWithNameAndValue(Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1, p2}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->inRequestQueue(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;I)Z

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->handleCachedEvents()V

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;ILcom/tenjin/android/TenjinSDK$1;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    const-string p1, "TenjinSDK"

    const-string p2, "Tenjin WARNING: Your event was not sent because the eventName or eventValue is not valid."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void
.end method

.method public eventWithNameAndValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1, p2}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->inRequestQueue(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Ljava/lang/String;)Z

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->handleCachedEvents()V

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    const-string p1, "TenjinSDK"

    const-string p2, "Tenjin WARNING: Your event was not sent because the eventName or eventValue was not valid."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void
.end method

.method public getAnalyticsInstallationId()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/tenjin/android/params/TenjinParams;

    new-instance v1, Lcom/tenjin/android/store/SharedPrefsStore;

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/tenjin/android/store/SharedPrefsStore;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/tenjin/android/params/TenjinParams;-><init>(Lcom/tenjin/android/store/DataStore;)V

    invoke-virtual {v0}, Lcom/tenjin/android/params/TenjinParams;->getAnalyticsInstallationID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAttributionInfo(Lcom/tenjin/android/AttributionInfoCallback;)V
    .locals 1

    const-string v0, "eventGetAttributionInfo"

    invoke-direct {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->executeRequestWithCallback(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V

    return-void
.end method

.method public getCustomerUserId()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    const-string v1, "tenjinInstallPreferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "TenjinSDK"

    const-string v2, "Get customer user id"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "customer_user_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeeplink(Lcom/tenjin/android/Callback;)V
    .locals 1

    const-string v0, "eventGetDeeplink"

    invoke-direct {p0, v0, p1}, Lcom/tenjin/android/TenjinSDK;->executeRequestWithCallback(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V

    return-void
.end method

.method public optIn()V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->consentParamFilter:Lcom/tenjin/android/params/ConsentParamFilter;

    invoke-virtual {v0}, Lcom/tenjin/android/params/ConsentParamFilter;->optIn()V

    return-void
.end method

.method public optInGoogleDMA()V
    .locals 2

    new-instance v0, Lcom/tenjin/android/utils/GDPRHelper;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/utils/GDPRHelper;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tenjin/android/utils/GDPRHelper;->setGoogleDMASetting(Z)V

    return-void
.end method

.method public optInOutUsingCMP()Z
    .locals 2

    new-instance v0, Lcom/tenjin/android/utils/GDPRHelper;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/utils/GDPRHelper;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/tenjin/android/utils/GDPRHelper;->optIn()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->optIn()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->optOut()V

    :goto_0
    return v0
.end method

.method public optInParams([Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->consentParamFilter:Lcom/tenjin/android/params/ConsentParamFilter;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/params/ConsentParamFilter;->optInToParameters([Ljava/lang/String;)V

    return-void
.end method

.method public optOut()V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->consentParamFilter:Lcom/tenjin/android/params/ConsentParamFilter;

    invoke-virtual {v0}, Lcom/tenjin/android/params/ConsentParamFilter;->optOut()V

    return-void
.end method

.method public optOutGoogleDMA()V
    .locals 2

    new-instance v0, Lcom/tenjin/android/utils/GDPRHelper;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/utils/GDPRHelper;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/tenjin/android/utils/GDPRHelper;->setGoogleDMASetting(Z)V

    return-void
.end method

.method public optOutParams([Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->consentParamFilter:Lcom/tenjin/android/params/ConsentParamFilter;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/params/ConsentParamFilter;->outOutOfParameters([Ljava/lang/String;)V

    return-void
.end method

.method public setAmazonSandboxMode()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tenjin/android/TenjinSDK;->amazonSandboxMode:Z

    return-void
.end method

.method public setAppStore(Lcom/tenjin/android/TenjinSDK$AppStoreType;)V
    .locals 0

    sput-object p1, Lcom/tenjin/android/TenjinSDK;->appStoreType:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    return-void
.end method

.method public setCacheEventSetting(Ljava/lang/Boolean;)V
    .locals 2

    new-instance v0, Lcom/tenjin/android/store/TenjinDatasource;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/store/TenjinDatasource;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/tenjin/android/store/TenjinDatasource;->setCacheEventSetting(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setCustomerUserId(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    const-string v1, "tenjinInstallPreferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Set customer user id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TenjinSDK"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "customer_user_id"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setGoogleDMAParameters(ZZ)V
    .locals 2

    new-instance v0, Lcom/tenjin/android/utils/GDPRHelper;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/utils/GDPRHelper;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1, p2}, Lcom/tenjin/android/utils/GDPRHelper;->setGoogleDMAParameters(ZZ)V

    return-void
.end method

.method public setSessionTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tenjin/android/TenjinSDK;->connectThreshold:J

    return-void
.end method

.method public transaction(Ljava/lang/String;Ljava/lang/String;ID)V
    .locals 9

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/tenjin/android/config/TenjinConsts;->CUR_SET:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-lez p3, :cond_2

    invoke-static {p1, p2, p3, p4, p5}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;ID)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct/range {p0 .. p5}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Ljava/lang/String;ID)Z

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->handleCachedEvents()V

    new-instance v8, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-direct/range {v0 .. v7}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;IDLcom/tenjin/android/TenjinSDK$1;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v8, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    const-string p1, "TenjinSDK"

    const-string p2, "Tenjin WARNING: Your purchase was not sent because you didn\'t have valid parameters."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void
.end method

.method public transaction(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 2
    move-object v11, p0

    const-string v0, "UTF-8"

    move-object/from16 v1, p6

    :try_start_0
    invoke-static {v1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/tenjin/android/config/TenjinConsts;->CUR_SET:Ljava/util/Set;

    move-object v10, p2

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-lez p3, :cond_2

    move-object v1, p1

    move-object v2, p2

    move/from16 v3, p3

    move-wide/from16 v4, p4

    move-object v6, v8

    move-object v7, v9

    invoke-static/range {v1 .. v7}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-wide/from16 v5, p4

    move-object v7, v8

    move-object v8, v9

    invoke-direct/range {v1 .. v8}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)Z

    iget-object v0, v11, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->handleCachedEvents()V

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v12, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move/from16 v5, p3

    move-wide/from16 v6, p4

    move-object v10, v12

    invoke-direct/range {v1 .. v10}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    const-string v0, "TenjinSDK"

    const-string v1, "Tenjin WARNING: Your purchase was not sent because you didn\'t have valid parameters."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception v0

    move-object v10, p2

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-virtual/range {p0 .. p5}, Lcom/tenjin/android/TenjinSDK;->transaction(Ljava/lang/String;Ljava/lang/String;ID)V

    return-void
.end method

.method public transactionAmazon(Lcom/tenjin/android/model/Transaction;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->getCurrencyCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->getQuantity()I

    move-result v3

    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->getUnitPrice()D

    move-result-wide v4

    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->getReceiptId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->getUserId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->getPurchaseData()Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lcom/tenjin/android/TenjinSDK;->transactionAmazon(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public transactionAmazon(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    .line 2
    move-object v1, p0

    new-instance v13, Lcom/tenjin/android/model/Transaction;

    sget-object v3, Lcom/tenjin/android/enums/AppStoreTypeEnum;->AMAZON:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    const-string v12, ""

    move-object v2, v13

    move-object v4, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    move-wide/from16 v7, p4

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v2 .. v12}, Lcom/tenjin/android/model/Transaction;-><init>(Lcom/tenjin/android/enums/AppStoreTypeEnum;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p8 .. p8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v2, "TenjinSDK"

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "UTF-8"

    move-object/from16 v3, p8

    invoke-static {v3, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/tenjin/android/model/Transaction;->setPurchaseData(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v0, "Tenjin WARNING: Your purchase was not sent because purchaseData failed to be encoded."

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    invoke-virtual {v13}, Lcom/tenjin/android/model/Transaction;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v13}, Lcom/tenjin/android/model/Transaction;->getCurrencyCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/tenjin/android/config/TenjinConsts;->CUR_SET:Ljava/util/Set;

    invoke-virtual {v13}, Lcom/tenjin/android/model/Transaction;->getCurrencyCode()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v13}, Lcom/tenjin/android/model/Transaction;->getQuantity()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {v13}, Lcom/tenjin/android/model/Transaction;->getReceiptId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v13}, Lcom/tenjin/android/model/Transaction;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v13}, Lcom/tenjin/android/model/EventKey;->getEventKey(Lcom/tenjin/android/model/Transaction;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, v13}, Lcom/tenjin/android/TenjinSDK;->addRequestQueue(Lcom/tenjin/android/model/Transaction;)Z

    iget-object v0, v1, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK;->handleCachedEvents()V

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v13, v2}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/model/Transaction;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Void;

    invoke-virtual {v0, v2, v3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_3
    const-string v0, "Tenjin WARNING: Your purchase was not sent because you didn\'t have valid parameters."

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_1
    return-void
.end method

.method public updateConversionValue(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update conversion value "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TenjinSDK"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "requestConversionUpdate"

    invoke-static {v0, p1}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->requestIsProcessing(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/tenjin/android/TenjinSDK;->inRequestQueue(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tenjin/android/TenjinSDK;->connectSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/Integer;Lcom/tenjin/android/TenjinSDK$1;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK;->addConversionUpdateRequestQueue(I)Z

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK;->connectTask:Landroid/os/AsyncTask;

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    :cond_2
    return-void
.end method
