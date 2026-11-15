.class public Lcom/tenjin/android/utils/adnetwork/CASHelper;
.super Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;
.source "SourceFile"


# static fields
.field public static final KEY_AD_NETWORK:Ljava/lang/String; = "network_name"

.field public static final KEY_AD_UNIT:Ljava/lang/String; = "ad_unit_id"

.field public static final KEY_CREATIVE_ID:Ljava/lang/String; = "creative_id"

.field public static final KEY_FORMAT:Ljava/lang/String; = "format"

.field public static final KEY_PRECISION:Ljava/lang/String; = "revenue_precision"

.field public static final KEY_REVENUE:Ljava/lang/String; = "revenue"

.field private static final METHOD_AD_NETWORK:Ljava/lang/String; = "getNetwork"

.field private static final METHOD_AD_TYPE:Ljava/lang/String; = "getAdType"

.field private static final METHOD_AD_UNIT_ID:Ljava/lang/String; = "getIdentifier"

.field private static final METHOD_CREATIVE_ID:Ljava/lang/String; = "getCreativeIdentifier"

.field private static final METHOD_PRECISION:Ljava/lang/String; = "getPriceAccuracy"

.field private static final METHOD_REVENUE:Ljava/lang/String; = "getCpm"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    const-string v0, "IronSource"

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;-><init>()V

    return-void
.end method

.method public static convertToJsonObject(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "ad_unit_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/CASHelper;->getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "creative_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/CASHelper;->getCreativeId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "network_name"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/CASHelper;->getAdNetwork(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "revenue"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/CASHelper;->getRevenue(Ljava/lang/Object;)D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "revenue_precision"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/CASHelper;->getPrecision(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "format"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/CASHelper;->getFormat(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v1, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error while creating JSON object from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-object v0
.end method

.method private static getAdNetwork(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getNetwork"

    const-string v1, "network_name"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getIdentifier"

    const-string v1, "ad_unit_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getCreativeId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getCreativeIdentifier"

    const-string v1, "creative_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getFormat(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAdType"

    const-string v1, "format"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getIntFromEnum(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const-string p0, "none"

    return-object p0

    :cond_0
    const-string p0, "rewarded"

    return-object p0

    :cond_1
    const-string p0, "native"

    return-object p0

    :cond_2
    const-string p0, "interstitial"

    return-object p0

    :cond_3
    const-string p0, "banner"

    return-object p0
.end method

.method private static getPrecision(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getPriceAccuracy"

    const-string v1, "revenue_precision"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p0, "none"

    return-object p0

    :cond_0
    const-string p0, "undisclosed"

    return-object p0

    :cond_1
    const-string p0, "bid"

    return-object p0

    :cond_2
    const-string p0, "floor"

    return-object p0
.end method

.method private static getRevenue(Ljava/lang/Object;)D
    .locals 2

    const-string v0, "getCpm"

    const-string v1, "revenue"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getDouble(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method
