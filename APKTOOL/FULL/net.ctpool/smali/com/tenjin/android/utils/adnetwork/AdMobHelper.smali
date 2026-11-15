.class public Lcom/tenjin/android/utils/adnetwork/AdMobHelper;
.super Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;
.source "SourceFile"


# static fields
.field public static final KEY_AD_UNIT_ID:Ljava/lang/String; = "ad_unit_id"

.field public static final KEY_CURRENCY_CODE:Ljava/lang/String; = "currency_code"

.field public static final KEY_MEDIATION_ADAPTER_CLASS:Ljava/lang/String; = "mediation_adapter_class_name"

.field public static final KEY_PRECISION_TYPE:Ljava/lang/String; = "precision_type"

.field public static final KEY_RESPONSE_ID:Ljava/lang/String; = "response_id"

.field public static final KEY_VALUE_MICROS:Ljava/lang/String; = "value_micros"

.field private static final METHOD_AD_UNIT_ID:Ljava/lang/String; = "getAdUnitId"

.field private static final METHOD_CURRENCY_CODE:Ljava/lang/String; = "getCurrencyCode"

.field private static final METHOD_MEDIATION_ADAPTER_CLASS:Ljava/lang/String; = "getMediationAdapterClassName"

.field private static final METHOD_PRECISION_TYPE:Ljava/lang/String; = "getPrecisionType"

.field private static final METHOD_RESPONSE_ID:Ljava/lang/String; = "getResponseId"

.field private static final METHOD_RESPONSE_INFO:Ljava/lang/String; = "getResponseInfo"

.field private static final METHOD_VALUE_MICROS:Ljava/lang/String; = "getValueMicros"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->logTag:Ljava/lang/String;

    const-string v0, "AdMob"

    sput-object v0, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->helperObjectName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;-><init>()V

    return-void
.end method

.method public static convertToJsonObject(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "precision_type"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;->getPrecisionType(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "value_micros"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;->getValueMicros(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "currency_code"

    invoke-static {p0}, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;->getCurrencyCode(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "ad_unit_id"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;->getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "mediation_adapter_class_name"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;->getMediationAdapterClassName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "response_id"

    invoke-static {p1}, Lcom/tenjin/android/utils/adnetwork/AdMobHelper;->getResponseId(Ljava/lang/Object;)Ljava/lang/String;

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

.method private static getAdUnitId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getAdUnitId"

    const-string v1, "ad_unit_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getCurrencyCode(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getCurrencyCode"

    const-string v1, "currency_code"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getMediationAdapterClassName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getResponseInfo"

    invoke-static {p0, v0, v0}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getObject(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getMediationAdapterClassName"

    const-string v1, "mediation_adapter_class_name"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getPrecisionType(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "getPrecisionType"

    const-string v1, "precision_type"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static getResponseId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "getResponseInfo"

    invoke-static {p0, v0, v0}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getObject(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getResponseId"

    const-string v1, "response_id"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getValueMicros(Ljava/lang/Object;)J
    .locals 2

    const-string v0, "getValueMicros"

    const-string v1, "value_micros"

    invoke-static {p0, v0, v1}, Lcom/tenjin/android/utils/adnetwork/BaseAdNetworkHelper;->getLong(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method
