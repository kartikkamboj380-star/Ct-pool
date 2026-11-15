.class public Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;
.super Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;
.source "SourceFile"


# static fields
.field public static final KEY_AB_TEST:Ljava/lang/String; = "ab_test"

.field public static final KEY_AD_NETWORK:Ljava/lang/String; = "network_name"

.field public static final KEY_AD_UNIT:Ljava/lang/String; = "ad_unit_id"

.field public static final KEY_COUNTRY:Ljava/lang/String; = "country"

.field public static final KEY_FORMAT:Ljava/lang/String; = "format"

.field public static final KEY_PLACEMENT:Ljava/lang/String; = "placement"

.field public static final KEY_PRECISION:Ljava/lang/String; = "revenue_precision"

.field public static final KEY_REVENUE:Ljava/lang/String; = "revenue"

.field public static final KEY_SEGMENT:Ljava/lang/String; = "segment"

.field private static final METHOD_AD_NETWORK:Ljava/lang/String; = "adSourceName"

.field private static final METHOD_AD_TYPE:Ljava/lang/String; = "format"

.field private static final METHOD_AD_UNIT_ID:Ljava/lang/String; = "tpAdUnitId"

.field private static final METHOD_BUCKET:Ljava/lang/String; = "bucketId"

.field private static final METHOD_COUNTRY:Ljava/lang/String; = "isoCode"

.field private static final METHOD_PLACEMENT:Ljava/lang/String; = "adSourcePlacementId"

.field private static final METHOD_PRECISION:Ljava/lang/String; = "ecpmPrecision"

.field private static final METHOD_REVENUE:Ljava/lang/String; = "ecpm"

.field private static final METHOD_SEGMENT:Ljava/lang/String; = "segmentId"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    const-string v0, "TradPlus"

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->useFields:Z

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

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "network_name"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getAdNetwork(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "revenue"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getRevenue(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "revenue_precision"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getPrecision(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "format"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getFormat(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "segment"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getSegmentId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ab_test"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getBucketId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "country"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getCountry(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "placement"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/TradPlusHelper;->getPlacementId(Ljava/lang/Object;)Ljava/lang/String;

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

    const-string v0, "adSourceName"

    const-string v1, "network_name"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "tpAdUnitId"

    const-string v1, "ad_unit_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getBucketId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "bucketId"

    const-string v1, "ab_test"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getCountry(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "isoCode"

    const-string v1, "country"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getFormat(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "format"

    invoke-static {p0, v0, v0}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getPlacementId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "adSourcePlacementId"

    const-string v1, "placement"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getPrecision(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "ecpmPrecision"

    const-string v1, "revenue_precision"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getRevenue(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "ecpm"

    const-string v1, "revenue"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getSegmentId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "segmentId"

    const-string v1, "segment"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
