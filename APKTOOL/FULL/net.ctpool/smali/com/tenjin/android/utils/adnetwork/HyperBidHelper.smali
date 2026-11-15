.class public Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;
.super Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;
.source "SourceFile"


# static fields
.field public static final KEY_AD_NETWORK_TYPE:Ljava/lang/String; = "ad_network_type"

.field public static final KEY_AD_SOURCE_ID:Ljava/lang/String; = "adsource_id"

.field public static final KEY_AD_SOURCE_INDEX:Ljava/lang/String; = "adsource_index"

.field public static final KEY_CHANNEL:Ljava/lang/String; = "channel"

.field public static final KEY_COUNTRY:Ljava/lang/String; = "country"

.field public static final KEY_CURRENCY:Ljava/lang/String; = "currency"

.field public static final KEY_CUSTOM_RULE:Ljava/lang/String; = "custom_rule"

.field public static final KEY_ECPM:Ljava/lang/String; = "ecpm"

.field public static final KEY_ECPM_LEVEL:Ljava/lang/String; = "ecpm_level"

.field public static final KEY_ECPM_PRECISION:Ljava/lang/String; = "ecpm_precision"

.field public static final KEY_HEADER_BIDDING_ADSOURCE:Ljava/lang/String; = "is_header_bidding_adsource"

.field public static final KEY_HYPERBID_AD_FORMAT:Ljava/lang/String; = "hyper_bid_ad_format"

.field public static final KEY_HYPERBID_PLACEMENT_ID:Ljava/lang/String; = "hyper_bid_placement_id"

.field public static final KEY_NETWORK_FIRM_ID:Ljava/lang/String; = "network_firm_id"

.field public static final KEY_NETWORK_PLACEMENT_ID:Ljava/lang/String; = "network_placement_id"

.field public static final KEY_PUBLISHER_REVENUE:Ljava/lang/String; = "publisher_revenue"

.field public static final KEY_REWARD_USER_CUSTOM_DATA:Ljava/lang/String; = "reward_user_custom_data"

.field public static final KEY_SCENARIO_ID:Ljava/lang/String; = "scenario_id"

.field public static final KEY_SCENARIO_REWARD_NAME:Ljava/lang/String; = "scenario_reward_name"

.field public static final KEY_SCENARIO_REWARD_NUMBER:Ljava/lang/String; = "scenario_reward_number"

.field public static final KEY_SEGMENT_ID:Ljava/lang/String; = "segment_id"

.field public static final KEY_SHOW_ID:Ljava/lang/String; = "show_id"

.field public static final KEY_SUB_CHANNEL:Ljava/lang/String; = "sub_channel"

.field private static final METHOD_AD_NETWORK_TYPE:Ljava/lang/String; = "getAdNetworkType"

.field private static final METHOD_AD_SOURCE_ID:Ljava/lang/String; = "getAdsourceId"

.field private static final METHOD_AD_SOURCE_INDEX:Ljava/lang/String; = "getAdsourceIndex"

.field private static final METHOD_CHANNEL:Ljava/lang/String; = "getChannel"

.field private static final METHOD_COUNTRY:Ljava/lang/String; = "getCountry"

.field private static final METHOD_CURRENCY:Ljava/lang/String; = "getCurrency"

.field private static final METHOD_CUSTOM_RULE:Ljava/lang/String; = "getCustomRule"

.field private static final METHOD_ECPM:Ljava/lang/String; = "getEcpm"

.field private static final METHOD_ECPM_LEVEL:Ljava/lang/String; = "getEcpmLevel"

.field private static final METHOD_ECPM_PRECISION:Ljava/lang/String; = "getEcpmPrecision"

.field private static final METHOD_HEADER_BIDDING_ADSOURCE:Ljava/lang/String; = "isHeaderBiddingAdsource"

.field private static final METHOD_HYPERBID_AD_FORMAT:Ljava/lang/String; = "getHyperBidAdFormat"

.field private static final METHOD_HYPERBID_PLACEMENT_ID:Ljava/lang/String; = "getHyperBidPlacementId"

.field private static final METHOD_NETWORK_FIRM_ID:Ljava/lang/String; = "getNetworkFirmId"

.field private static final METHOD_NETWORK_PLACEMENT_ID:Ljava/lang/String; = "getNetworkPlacementId"

.field private static final METHOD_PUBLISHER_REVENUE:Ljava/lang/String; = "getPublisherRevenue"

.field private static final METHOD_REWARD_USER_CUSTOM_DATA:Ljava/lang/String; = "getRewardUserCustomData"

.field private static final METHOD_SCENARIO_ID:Ljava/lang/String; = "getScenarioId"

.field private static final METHOD_SCENARIO_REWARD_NAME:Ljava/lang/String; = "getScenarioRewardName"

.field private static final METHOD_SCENARIO_REWARD_NUMBER:Ljava/lang/String; = "getScenarioRewardNumber"

.field private static final METHOD_SEGMENT_ID:Ljava/lang/String; = "getSegmentId"

.field private static final METHOD_SHOW_ID:Ljava/lang/String; = "getShowId"

.field private static final METHOD_SUB_CHANNEL:Ljava/lang/String; = "getSubChannel"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    const-string v0, "HyperBid"

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
    const-string v1, "network_firm_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getNetworkFirmId(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "adsource_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getAdsourceId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "adsource_index"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getAdsourceIndex(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "ecpm"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getEcpm(Ljava/lang/Object;)D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "is_header_bidding_adsource"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->isHeaderBiddingAdsource(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "show_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getShowId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "publisher_revenue"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getPublisherRevenue(Ljava/lang/Object;)D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "currency"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getCurrency(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "country"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getCountry(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hyper_bid_placement_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getHyperBidPlacementId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hyper_bid_ad_format"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getHyperBidAdFormat(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ecpm_precision"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getEcpmPrecision(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ad_network_type"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getAdNetworkType(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "network_placement_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getNetworkPlacementId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ecpm_level"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getEcpmLevel(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "segment_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getSegmentId(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "scenario_id"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getScenarioId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "scenario_reward_name"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getScenarioRewardName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "scenario_reward_number"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getScenarioRewardNumber(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "sub_channel"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getSubChannel(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "channel"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getChannel(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "custom_rule"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getCustomRule(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "reward_user_custom_data"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/HyperBidHelper;->getRewardUserCustomData(Ljava/lang/Object;)Ljava/lang/String;

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

.method private static getAdNetworkType(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAdNetworkType"

    const-string v1, "ad_network_type"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAdsourceId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAdsourceId"

    const-string v1, "adsource_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAdsourceIndex(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "getAdsourceIndex"

    const-string v1, "adsource_index"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static getChannel(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getChannel"

    const-string v1, "channel"

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

.method private static getCurrency(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getCurrency"

    const-string v1, "currency"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getCustomRule(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getCustomRule"

    const-string v1, "custom_rule"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getEcpm(Ljava/lang/Object;)D
    .locals 2

    const-string v0, "getEcpm"

    const-string v1, "ecpm"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getDouble(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method private static getEcpmLevel(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "getEcpmLevel"

    const-string v1, "ecpm_level"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static getEcpmPrecision(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getEcpmPrecision"

    const-string v1, "ecpm_precision"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getHyperBidAdFormat(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getHyperBidAdFormat"

    const-string v1, "hyper_bid_ad_format"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getHyperBidPlacementId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getHyperBidPlacementId"

    const-string v1, "hyper_bid_placement_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getNetworkFirmId(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "getNetworkFirmId"

    const-string v1, "network_firm_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static getNetworkPlacementId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getNetworkPlacementId"

    const-string v1, "network_placement_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getPublisherRevenue(Ljava/lang/Object;)D
    .locals 2

    const-string v0, "getPublisherRevenue"

    const-string v1, "publisher_revenue"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getDouble(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method private static getRewardUserCustomData(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getRewardUserCustomData"

    const-string v1, "reward_user_custom_data"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getScenarioId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getScenarioId"

    const-string v1, "scenario_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getScenarioRewardName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getScenarioRewardName"

    const-string v1, "scenario_reward_name"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getScenarioRewardNumber(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "getScenarioRewardNumber"

    const-string v1, "scenario_reward_number"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static getSegmentId(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "getSegmentId"

    const-string v1, "segment_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static getShowId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getShowId"

    const-string v1, "show_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getSubChannel(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getSubChannel"

    const-string v1, "sub_channel"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static isHeaderBiddingAdsource(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "isHeaderBiddingAdsource"

    const-string v1, "is_header_bidding_adsource"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method
