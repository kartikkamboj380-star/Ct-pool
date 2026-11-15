.class public Lcom/tenjin/android/config/SDKConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ILRD_ENABLED:Ljava/lang/Boolean;

.field private static final SUBSCRIPTION_ENABLED:Ljava/lang/Boolean;


# instance fields
.field private final _store:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lcom/tenjin/android/config/SDKConfig;->ILRD_ENABLED:Ljava/lang/Boolean;

    sput-object v0, Lcom/tenjin/android/config/SDKConfig;->SUBSCRIPTION_ENABLED:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/tenjin/android/config/SDKConfig;->loadDefaults()V

    invoke-direct {p0}, Lcom/tenjin/android/config/SDKConfig;->loadOverrides()V

    return-void
.end method

.method private loadDefaults()V
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeyILRDEnabled:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeySubscriptionEnabled:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeySubscriptionHost:Ljava/lang/String;

    const-string v2, "https://subscription-server.staging.tenjin.com"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeySubscriptionEndpoint:Ljava/lang/String;

    const-string v2, "subscriptions"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeyBaseHost:Ljava/lang/String;

    const-string v2, "https://track.tenjin.com"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private loadOverrides()V
    .locals 3

    sget-object v0, Lcom/tenjin/android/config/SDKConfig;->ILRD_ENABLED:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeyILRDEnabled:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tenjin/android/utils/TenjinUtils;->isNullOrEmpty(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    sget-object v2, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeyILRDEnabled:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object v0, Lcom/tenjin/android/config/SDKConfig;->SUBSCRIPTION_ENABLED:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeySubscriptionEnabled:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tenjin/android/utils/TenjinUtils;->isNullOrEmpty(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    iget-object v1, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    sget-object v2, Lcom/tenjin/android/config/SDKConfigKeys;->TenjinConfigKeySubscriptionEnabled:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method


# virtual methods
.method public boolForKey(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public set(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TenjinSDK"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public stringForKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/config/SDKConfig;->_store:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
