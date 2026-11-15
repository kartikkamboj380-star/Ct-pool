.class public Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;
.super Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;
.source "SourceFile"


# static fields
.field public static final KEY_AB:Ljava/lang/String; = "ab"

.field public static final KEY_AD_NETWORK:Ljava/lang/String; = "ad_network"

.field public static final KEY_AD_UNIT:Ljava/lang/String; = "ad_unit"

.field public static final KEY_AUCTION_ID:Ljava/lang/String; = "auction_id"

.field public static final KEY_COUNTRY:Ljava/lang/String; = "country"

.field public static final KEY_ENCRYPTED_CPM:Ljava/lang/String; = "encrypted_cpm"

.field public static final KEY_INSTANCE_ID:Ljava/lang/String; = "instance_id"

.field public static final KEY_INSTANCE_NAME:Ljava/lang/String; = "instance_name"

.field public static final KEY_LIFETIME_REVENUE:Ljava/lang/String; = "lifetime_revenue"

.field public static final KEY_PLACEMENT:Ljava/lang/String; = "placement"

.field public static final KEY_PRECISION:Ljava/lang/String; = "precision"

.field public static final KEY_REVENUE:Ljava/lang/String; = "revenue"

.field public static final KEY_SEGMENT_NAME:Ljava/lang/String; = "segment_name"

.field private static final METHOD_AB:Ljava/lang/String; = "getAb"

.field private static final METHOD_AD_NETWORK:Ljava/lang/String; = "getAdNetwork"

.field private static final METHOD_AD_UNIT:Ljava/lang/String; = "getAdUnit"

.field private static final METHOD_AUCTION_ID:Ljava/lang/String; = "getAuctionId"

.field private static final METHOD_COUNTRY:Ljava/lang/String; = "getCountry"

.field private static final METHOD_ENCRYPTED_CPM:Ljava/lang/String; = "getEncryptedCPM"

.field private static final METHOD_INSTANCE_ID:Ljava/lang/String; = "getInstanceId"

.field private static final METHOD_INSTANCE_NAME:Ljava/lang/String; = "getInstanceName"

.field private static final METHOD_LIFETIME_REVENUE:Ljava/lang/String; = "getLifetimeRevenue"

.field private static final METHOD_PLACEMENT:Ljava/lang/String; = "getPlacement"

.field private static final METHOD_PRECISION:Ljava/lang/String; = "getPrecision"

.field private static final METHOD_REVENUE:Ljava/lang/String; = "getRevenue"

.field private static final METHOD_SEGMENT_NAME:Ljava/lang/String; = "getSegmentName"


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
    const-string v1, "auction_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getAuctionId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ad_unit"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getAdUnit(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "country"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getCountry(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ab"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getAb(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "segment_name"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getSegmentName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "placement"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getPlacement(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ad_network"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getAdNetwork(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "instance_name"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getInstanceName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "instance_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getInstanceId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "revenue"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getRevenue(Ljava/lang/Object;)D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "precision"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getPrecision(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "lifetime_revenue"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getLifetimeRevenue(Ljava/lang/Object;)D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "encrypted_cpm"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/IronSourceHelper;->getEncryptedCPM(Ljava/lang/Object;)Ljava/lang/String;

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

.method private static getAb(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAb"

    const-string v1, "ab"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAdNetwork(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAdNetwork"

    const-string v1, "ad_network"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAdUnit(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAdUnit"

    const-string v1, "ad_unit"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAuctionId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAuctionId"

    const-string v1, "auction_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getCountry(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getCountry"

    const-string v1, "country"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getEncryptedCPM(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getEncryptedCPM"

    const-string v1, "encrypted_cpm"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getInstanceId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getInstanceId"

    const-string v1, "instance_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getInstanceName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getInstanceName"

    const-string v1, "instance_name"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getLifetimeRevenue(Ljava/lang/Object;)D
    .locals 2

    const-string v0, "getLifetimeRevenue"

    const-string v1, "lifetime_revenue"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getDouble(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method private static getPlacement(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getPlacement"

    const-string v1, "placement"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getPrecision(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getPrecision"

    const-string v1, "precision"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getRevenue(Ljava/lang/Object;)D
    .locals 2

    const-string v0, "getRevenue"

    const-string v1, "revenue"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getDouble(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method private static getSegmentName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getSegmentName"

    const-string v1, "segment_name"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
