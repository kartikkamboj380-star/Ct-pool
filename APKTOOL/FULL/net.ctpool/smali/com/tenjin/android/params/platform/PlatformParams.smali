.class public Lcom/tenjin/android/params/platform/PlatformParams;
.super Lcom/tenjin/android/params/base/AParamProvider;
.source "SourceFile"


# instance fields
.field public final adInfo:Lcom/tenjin/android/model/AdvertiserInfo;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/model/AdvertiserInfo;)V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/params/base/AParamProvider;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/platform/PlatformParams;->adInfo:Lcom/tenjin/android/model/AdvertiserInfo;

    return-void
.end method

.method public static adInfoForAmazon(Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;)Lcom/tenjin/android/model/AdvertiserInfo;
    .locals 5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v1, Lcom/tenjin/android/model/AdvertiserInfo;

    invoke-direct {v1}, Lcom/tenjin/android/model/AdvertiserInfo;-><init>()V

    :try_start_0
    invoke-interface {p0}, Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;->getId()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface {p0}, Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;->isLimitAdTrackingEnabled()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string p0, "PlatformParams"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Got advertising ID from Amazon provider: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", LAT: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    const-string v2, ""

    :goto_0
    const-string v3, "Tenjin"

    const-string v4, "Error retrieving Amazon advertising info"

    invoke-static {v3, v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    invoke-virtual {v1, v2}, Lcom/tenjin/android/model/AdvertiserInfo;->setAdvertisingId(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/tenjin/android/model/AdvertiserInfo;->setLimitAdTracking(Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public static adInfoForGooglePlay(Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;Lcom/tenjin/android/params/platform/IDataSource;)Lcom/tenjin/android/model/AdvertiserInfo;
    .locals 6

    const-string v0, ", LAT: "

    const-string v1, "PlatformParams"

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :try_start_0
    invoke-interface {p0}, Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0}, Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;->isLimitAdTrackingEnabled()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Got advertising ID from provider: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v3, :cond_0

    invoke-interface {p1, v3, p0}, Lcom/tenjin/android/params/platform/IDataSource;->setAdvertisingIdInfo(Ljava/lang/String;Ljava/lang/Boolean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v2, "Failed to get advertising ID from provider, checking stored data."

    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-interface {p1}, Lcom/tenjin/android/params/platform/IDataSource;->getStoredAdvertisingId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lcom/tenjin/android/params/platform/IDataSource;->getStoredLimitAdTracking()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1}, Lcom/tenjin/android/params/platform/IDataSource;->getStoredAdvertisingId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/tenjin/android/params/platform/IDataSource;->getStoredLimitAdTracking()Ljava/lang/Boolean;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Using stored advertising ID: "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    new-instance p1, Lcom/tenjin/android/model/AdvertiserInfo;

    invoke-direct {p1}, Lcom/tenjin/android/model/AdvertiserInfo;-><init>()V

    invoke-virtual {p1, v3}, Lcom/tenjin/android/model/AdvertiserInfo;->setAdvertisingId(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/tenjin/android/model/AdvertiserInfo;->setLimitAdTracking(Ljava/lang/Boolean;)V

    invoke-virtual {p1, v2}, Lcom/tenjin/android/model/AdvertiserInfo;->setIsFromLocalStorage(Ljava/lang/Boolean;)V

    return-object p1

    :cond_1
    const-string p1, "No stored data available, rethrowing exception."

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Failed to get advertising ID from Google provider and no stored data available"

    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static getAdvertisingInfoObject(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tenjin/android/params/platform/PlatformParams;->getAdvertisingInfoObjectWithRetry(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getAdvertisingInfoObjectWithRetry(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Tenjin"

    if-gtz v0, :cond_0

    const-string p0, "Failed to retrieve advertising ID - giving up"

    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    :try_start_0
    const-string v0, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    const-string v3, "getAdvertisingIdInfo"

    const-class v4, Landroid/content/Context;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v3, v4, v5}, Lcom/tenjin/android/utils/Reflection;->runStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    instance-of v3, v0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v3, :cond_2

    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ad id retrieval failed "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "com.google.android.gms.common.GooglePlayServicesRepairableException"

    invoke-static {v2}, Lcom/tenjin/android/utils/Reflection;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    instance-of v3, v0, Ljava/io/IOException;

    if-nez v3, :cond_1

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/tenjin/android/params/platform/PlatformParams;->getAdvertisingInfoObjectWithRetry(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static getParamsForPlatform(Landroid/content/Context;)Lcom/tenjin/android/params/platform/PlatformParams;
    .locals 3

    new-instance v0, Lcom/tenjin/android/store/TenjinDatasource;

    invoke-direct {v0, p0}, Lcom/tenjin/android/store/TenjinDatasource;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/tenjin/android/params/AndroidParams;->getPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v2, "amazon"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/tenjin/android/params/platform/AmazonAdvertisingIdProvider;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tenjin/android/params/platform/AmazonAdvertisingIdProvider;-><init>(Landroid/content/ContentResolver;)V

    invoke-static {v0}, Lcom/tenjin/android/params/platform/PlatformParams;->adInfoForAmazon(Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;)Lcom/tenjin/android/model/AdvertiserInfo;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/tenjin/android/params/platform/GoogleAdvertisingIdProvider;

    invoke-static {p0}, Lcom/tenjin/android/params/platform/PlatformParams;->getAdvertisingInfoObject(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tenjin/android/params/platform/GoogleAdvertisingIdProvider;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lcom/tenjin/android/params/platform/PlatformParams;->adInfoForGooglePlay(Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;Lcom/tenjin/android/params/platform/IDataSource;)Lcom/tenjin/android/model/AdvertiserInfo;

    move-result-object v0

    new-instance v1, Lcom/tenjin/android/utils/OaidRequester;

    invoke-direct {v1, p0}, Lcom/tenjin/android/utils/OaidRequester;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/tenjin/android/utils/OaidRequester;->getOaid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tenjin/android/model/AdvertiserInfo;->setOaid(Ljava/lang/String;)V

    new-instance v1, Lcom/tenjin/android/utils/ImeiRequester;

    invoke-direct {v1, p0}, Lcom/tenjin/android/utils/ImeiRequester;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/tenjin/android/utils/ImeiRequester;->getImei()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tenjin/android/model/AdvertiserInfo;->setImei(Ljava/lang/String;)V

    move-object p0, v0

    :goto_0
    new-instance v0, Lcom/tenjin/android/params/platform/PlatformParams;

    invoke-direct {v0, p0}, Lcom/tenjin/android/params/platform/PlatformParams;-><init>(Lcom/tenjin/android/model/AdvertiserInfo;)V

    return-object v0
.end method


# virtual methods
.method public apply(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
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

    iget-object v0, p0, Lcom/tenjin/android/params/platform/PlatformParams;->adInfo:Lcom/tenjin/android/model/AdvertiserInfo;

    invoke-virtual {v0}, Lcom/tenjin/android/model/AdvertiserInfo;->getAdvertisingId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "advertising_id"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/params/platform/PlatformParams;->adInfo:Lcom/tenjin/android/model/AdvertiserInfo;

    invoke-virtual {v0}, Lcom/tenjin/android/model/AdvertiserInfo;->getLimitAdTracking()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "limit_ad_tracking"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/params/platform/PlatformParams;->adInfo:Lcom/tenjin/android/model/AdvertiserInfo;

    invoke-virtual {v0}, Lcom/tenjin/android/model/AdvertiserInfo;->getIsFromLocalStorage()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ad_id_local"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/params/platform/PlatformParams;->adInfo:Lcom/tenjin/android/model/AdvertiserInfo;

    invoke-virtual {v0}, Lcom/tenjin/android/model/AdvertiserInfo;->getOaid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "oaid"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/params/platform/PlatformParams;->adInfo:Lcom/tenjin/android/model/AdvertiserInfo;

    invoke-virtual {v0}, Lcom/tenjin/android/model/AdvertiserInfo;->getImei()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "imei"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p1
.end method

.method public isReady()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/params/platform/PlatformParams;->adInfo:Lcom/tenjin/android/model/AdvertiserInfo;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
