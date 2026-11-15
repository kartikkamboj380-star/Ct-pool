.class public Lcom/tenjin/android/params/TenjinParams;
.super Lcom/tenjin/android/params/base/AParamProvider;
.source "SourceFile"


# instance fields
.field private final store:Lcom/tenjin/android/store/DataStore;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/store/DataStore;)V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/params/base/AParamProvider;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/TenjinParams;->store:Lcom/tenjin/android/store/DataStore;

    return-void
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

    const-string v0, "sdk_version"

    invoke-virtual {p0}, Lcom/tenjin/android/params/TenjinParams;->getSdkVersion()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "analytics_installation_id"

    invoke-virtual {p0}, Lcom/tenjin/android/params/TenjinParams;->getAnalyticsInstallationID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public getAnalyticsInstallationID()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/params/TenjinParams;->store:Lcom/tenjin/android/store/DataStore;

    const-string v1, "tenjinReferenceId"

    invoke-interface {v0, v1}, Lcom/tenjin/android/store/DataStore;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    const-string v3, "analyticsInstallationId"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/params/TenjinParams;->store:Lcom/tenjin/android/store/DataStore;

    invoke-interface {v0, v1, v2}, Lcom/tenjin/android/store/DataStore;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/tenjin/android/params/TenjinParams;->store:Lcom/tenjin/android/store/DataStore;

    invoke-interface {v2, v1}, Lcom/tenjin/android/store/DataStore;->remove(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tenjin/android/params/TenjinParams;->store:Lcom/tenjin/android/store/DataStore;

    invoke-interface {v1, v3, v0}, Lcom/tenjin/android/store/DataStore;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/params/TenjinParams;->store:Lcom/tenjin/android/store/DataStore;

    invoke-interface {v0, v3, v2}, Lcom/tenjin/android/store/DataStore;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/params/TenjinParams;->store:Lcom/tenjin/android/store/DataStore;

    invoke-interface {v1, v3, v0}, Lcom/tenjin/android/store/DataStore;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public getSdkVersion()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/tenjin/android/TenjinSDK;->wrapperVersion:Ljava/lang/String;

    const-string v1, "1.16.5"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/tenjin/android/TenjinSDK;->wrapperVersion:Ljava/lang/String;

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s-%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method
