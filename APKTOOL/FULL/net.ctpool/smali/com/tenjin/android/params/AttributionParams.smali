.class public Lcom/tenjin/android/params/AttributionParams;
.super Lcom/tenjin/android/params/base/AParamProvider;
.source "SourceFile"


# static fields
.field private static final REFERRAL_THREADS_NUMBER:I = 0x2

.field private static final TAG:Ljava/lang/String; = "AttributionParams"


# instance fields
.field private final context:Landroid/content/Context;

.field private final dataStore:Lcom/tenjin/android/store/DataStore;

.field private huaweiAttribution:Lcom/tenjin/android/utils/StoreAttribution;

.field private playStoreAttribution:Lcom/tenjin/android/utils/StoreAttribution;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tenjin/android/store/DataStore;)V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/params/base/AParamProvider;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/AttributionParams;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    return-void
.end method

.method static synthetic access$000(Lcom/tenjin/android/params/AttributionParams;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/params/AttributionParams;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/tenjin/android/params/AttributionParams;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/tenjin/android/params/AttributionParams;->huaweiAttributionCallback(Ljava/lang/String;JJ)V

    return-void
.end method

.method static synthetic access$200(Lcom/tenjin/android/params/AttributionParams;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/tenjin/android/params/AttributionParams;->playStoreAttributionCallback(Ljava/lang/String;JJ)V

    return-void
.end method

.method private alreadyRetrievedReferral()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    const-string v1, "tenjinGoogleInstallReferrer"

    invoke-interface {v0, v1}, Lcom/tenjin/android/store/DataStore;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    const-string v1, "tenjinHuaweiInstallReferrer"

    invoke-interface {v0, v1}, Lcom/tenjin/android/store/DataStore;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private getHuaweiReferralData(Ljava/util/concurrent/CountDownLatch;)Ljava/lang/Thread;
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/tenjin/android/params/AttributionParams$1;

    invoke-direct {v1, p0, p1}, Lcom/tenjin/android/params/AttributionParams$1;-><init>(Lcom/tenjin/android/params/AttributionParams;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method private getReferralData(Ljava/util/concurrent/CountDownLatch;)Ljava/lang/Thread;
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/tenjin/android/params/AttributionParams$2;

    invoke-direct {v1, p0, p1}, Lcom/tenjin/android/params/AttributionParams$2;-><init>(Lcom/tenjin/android/params/AttributionParams;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method private huaweiAttributionCallback(Ljava/lang/String;JJ)V
    .locals 2

    new-instance v0, Lcom/tenjin/android/utils/StoreAttribution;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Store;->Huawei:Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/tenjin/android/utils/StoreAttribution;-><init>(Lcom/tenjin/android/utils/StoreAttribution$Store;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    iput-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->huaweiAttribution:Lcom/tenjin/android/utils/StoreAttribution;

    iget-object p1, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/utils/StoreAttribution;->save(Lcom/tenjin/android/store/DataStore;)V

    return-void
.end method

.method private loadReferralData()V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Store;->PlayStore:Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/StoreAttribution;->load(Lcom/tenjin/android/store/DataStore;Lcom/tenjin/android/utils/StoreAttribution$Store;)Lcom/tenjin/android/utils/StoreAttribution;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->playStoreAttribution:Lcom/tenjin/android/utils/StoreAttribution;

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Store;->Huawei:Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/StoreAttribution;->load(Lcom/tenjin/android/store/DataStore;Lcom/tenjin/android/utils/StoreAttribution$Store;)Lcom/tenjin/android/utils/StoreAttribution;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->huaweiAttribution:Lcom/tenjin/android/utils/StoreAttribution;

    return-void
.end method

.method private playStoreAttributionCallback(Ljava/lang/String;JJ)V
    .locals 2

    new-instance v0, Lcom/tenjin/android/utils/StoreAttribution;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Store;->PlayStore:Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/tenjin/android/utils/StoreAttribution;-><init>(Lcom/tenjin/android/utils/StoreAttribution$Store;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    iput-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->playStoreAttribution:Lcom/tenjin/android/utils/StoreAttribution;

    iget-object p1, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/utils/StoreAttribution;->save(Lcom/tenjin/android/store/DataStore;)V

    return-void
.end method


# virtual methods
.method public apply(Ljava/util/Map;)Ljava/util/Map;
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

    invoke-virtual {p0}, Lcom/tenjin/android/params/AttributionParams;->hasReferralBeenApplied()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->playStoreAttribution:Lcom/tenjin/android/utils/StoreAttribution;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/utils/StoreAttribution;->apply(Ljava/util/Map;)V

    :cond_1
    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->huaweiAttribution:Lcom/tenjin/android/utils/StoreAttribution;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/tenjin/android/utils/StoreAttribution;->apply(Ljava/util/Map;)V

    :cond_2
    return-object p1
.end method

.method public getAttribution()V
    .locals 3

    invoke-direct {p0}, Lcom/tenjin/android/params/AttributionParams;->alreadyRetrievedReferral()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/tenjin/android/params/AttributionParams;->getReferralData(Ljava/util/concurrent/CountDownLatch;)Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    invoke-direct {p0, v0}, Lcom/tenjin/android/params/AttributionParams;->getHuaweiReferralData(Ljava/util/concurrent/CountDownLatch;)Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Thread;->join()V

    invoke-virtual {v2}, Ljava/lang/Thread;->join()V

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error retrieving referral data from play store, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AttributionParams"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/tenjin/android/params/AttributionParams;->loadReferralData()V

    :goto_0
    return-void
.end method

.method public hasReferralBeenApplied()Z
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams;->dataStore:Lcom/tenjin/android/store/DataStore;

    const-string v1, "tenjinInstallReferrerSent"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/tenjin/android/store/DataStore;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
