.class public Lcom/tenjin/android/params/ConsentParamFilter;
.super Lcom/tenjin/android/params/base/AParamProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;
    }
.end annotation


# static fields
.field private static final optOutKeysToRetain:[Ljava/lang/String;


# instance fields
.field private customOptInParameters:[Ljava/lang/String;

.field private customOptOutParameters:[Ljava/lang/String;

.field protected userState:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/tenjin/android/config/TenjinConsts;->REFERRAL_PARAMS:[Ljava/lang/String;

    sget-object v1, Lcom/tenjin/android/config/TenjinConsts;->REQUIRED_PARAMS:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/TenjinUtils;->concat([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Lcom/tenjin/android/params/ConsentParamFilter;->optOutKeysToRetain:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/tenjin/android/params/base/AParamProvider;-><init>()V

    sget-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->IMPLICIT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    iput-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->userState:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptOutParameters:[Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptInParameters:[Ljava/lang/String;

    return-void
.end method

.method private filterMap(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p2, v2

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getOptInWhitelistParams(Ljava/util/Map;)Ljava/util/Map;
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

    iget-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptInParameters:[Ljava/lang/String;

    sget-object v1, Lcom/tenjin/android/config/TenjinConsts;->REQUIRED_PARAMS:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/TenjinUtils;->concat([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const-string v1, "device_all"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/tenjin/android/config/TenjinConsts;->DEVICE_ALL_PARAMS:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/TenjinUtils;->concat([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :cond_0
    const-string v1, "referrer"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/tenjin/android/config/TenjinConsts;->REFERRAL_PARAMS:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/TenjinUtils;->concat([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :cond_1
    invoke-direct {p0, p1, v0}, Lcom/tenjin/android/params/ConsentParamFilter;->filterMap(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptInParameters:[Ljava/lang/String;

    const-string v1, ","

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/TenjinUtils;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "opt_in_params"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method private getOptOutBlacklistParams(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
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

    iget-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptOutParameters:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {p1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptOutParameters:[Ljava/lang/String;

    const-string v1, ","

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/TenjinUtils;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "opt_out_params"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method


# virtual methods
.method public apply(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
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

    sget-object v0, Lcom/tenjin/android/params/ConsentParamFilter$1;->$SwitchMap$com$tenjin$android$params$ConsentParamFilter$ConsentState:[I

    iget-object v1, p0, Lcom/tenjin/android/params/ConsentParamFilter;->userState:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lcom/tenjin/android/params/ConsentParamFilter;->getOptInWhitelistParams(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-direct {p0, p1}, Lcom/tenjin/android/params/ConsentParamFilter;->getOptOutBlacklistParams(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/tenjin/android/params/ConsentParamFilter;->optOutKeysToRetain:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/tenjin/android/params/ConsentParamFilter;->filterMap(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "opt_out"

    :goto_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    const-string v0, "opt_in"

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public optIn()V
    .locals 1

    sget-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTIN:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    iput-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->userState:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    return-void
.end method

.method public optInToParameters([Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptInParameters:[Ljava/lang/String;

    sget-object p1, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTIN_WHITELIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    iput-object p1, p0, Lcom/tenjin/android/params/ConsentParamFilter;->userState:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    return-void
.end method

.method public optOut()V
    .locals 1

    sget-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTOUT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    iput-object v0, p0, Lcom/tenjin/android/params/ConsentParamFilter;->userState:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    return-void
.end method

.method public outOutOfParameters([Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/params/ConsentParamFilter;->customOptOutParameters:[Ljava/lang/String;

    sget-object p1, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTOUT_BLACKLIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    iput-object p1, p0, Lcom/tenjin/android/params/ConsentParamFilter;->userState:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    return-void
.end method
