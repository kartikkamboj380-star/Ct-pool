.class public Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;
.super Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;
.source "SourceFile"


# static fields
.field private static final APPLOVIN_SDK_CLASS:Ljava/lang/String; = "com.applovin.sdk.AppLovinSdk"

.field private static final DEFAULT_CURRENCY:Ljava/lang/String; = "USD"

.field public static final KEY_AD_REVENUE_CURRENCY:Ljava/lang/String; = "ad_revenue_currency"

.field public static final KEY_AD_UNIT_ID:Ljava/lang/String; = "ad_unit_id"

.field public static final KEY_COUNTRY:Ljava/lang/String; = "country"

.field public static final KEY_CREATIVE_ID:Ljava/lang/String; = "creative_id"

.field public static final KEY_FORMAT:Ljava/lang/String; = "format"

.field public static final KEY_NETWORK_NAME:Ljava/lang/String; = "network_name"

.field public static final KEY_NETWORK_PLACEMENT:Ljava/lang/String; = "network_placement"

.field public static final KEY_PLACEMENT:Ljava/lang/String; = "placement"

.field public static final KEY_REVENUE:Ljava/lang/String; = "revenue"

.field public static final KEY_REVENUE_PRECISION:Ljava/lang/String; = "revenue_precision"

.field private static final METHOD_AD_UNIT_ID:Ljava/lang/String; = "getAdUnitId"

.field private static final METHOD_CONFIGURATION:Ljava/lang/String; = "getConfiguration"

.field private static final METHOD_COUNTRY_CODE:Ljava/lang/String; = "getCountryCode"

.field private static final METHOD_CREATIVE_ID:Ljava/lang/String; = "getCreativeId"

.field private static final METHOD_DISPLAY_NAME:Ljava/lang/String; = "getDisplayName"

.field private static final METHOD_FORMAT:Ljava/lang/String; = "getFormat"

.field private static final METHOD_INSTANCE:Ljava/lang/String; = "getInstance"

.field private static final METHOD_NETWORK_NAME:Ljava/lang/String; = "getNetworkName"

.field private static final METHOD_NETWORK_PLACEMENT:Ljava/lang/String; = "getNetworkPlacement"

.field private static final METHOD_PLACEMENT:Ljava/lang/String; = "getPlacement"

.field private static final METHOD_REVENUE:Ljava/lang/String; = "getRevenue"

.field private static final METHOD_REVENUE_PRECISION:Ljava/lang/String; = "getRevenuePrecision"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    const-string v0, "AppLovin"

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;-><init>()V

    return-void
.end method

.method public static convertToJsonObject(Landroid/content/Context;Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "revenue"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getRevenue(Ljava/lang/Object;)D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "ad_revenue_currency"

    const-string v2, "USD"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "country"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getCountry(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "network_name"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getNetworkName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "ad_unit_id"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "format"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getAdFormatName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "placement"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getPlacement(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "network_placement"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getNetworkPlacement(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "creative_id"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getCreativeId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "revenue_precision"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AppLovinHelper;->getRevenuePrecision(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object p1, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error while creating JSON object from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " data"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-object v0
.end method

.method private static getAdFormatName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "getFormat"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v0, v3}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "getDisplayName"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v0, v2}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v1, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error while getting adFormatName data from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " object"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-object v0
.end method

.method private static getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAdUnitId"

    const-string v1, "ad_unit_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getCountry(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.applovin.sdk.AppLovinSdk"

    const-string v2, "getInstance"

    const-class v3, Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, v2, v3, p0}, Lcom/tenjin/android/utils/Reflection;->runStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "getConfiguration"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v0, v3}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "getCountryCode"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v0, v2}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v1, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error while getting countryCode data from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " object"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-object v0
.end method

.method private static getCreativeId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getCreativeId"

    const-string v1, "creative_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getNetworkName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getNetworkName"

    const-string v1, "network_name"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getNetworkPlacement(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getNetworkPlacement"

    const-string v1, "network_placement"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getPlacement(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getPlacement"

    const-string v1, "placement"

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

.method private static getRevenuePrecision(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getRevenuePrecision"

    const-string v1, "revenue_precision"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
