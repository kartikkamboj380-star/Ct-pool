.class public Lcom/tenjin/TenjinModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# instance fields
.field public instance:Lcom/tenjin/android/TenjinSDK;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    iput-object p1, p0, Lcom/tenjin/TenjinModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method public static synthetic a(Lcom/tenjin/TenjinModule;Lcom/facebook/react/bridge/Callback;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tenjin/TenjinModule;->lambda$getAttributionInfo$0(Lcom/facebook/react/bridge/Callback;Ljava/util/Map;)V

    return-void
.end method

.method private convertArrayToJson(Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;
    .locals 4

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    sget-object v2, Lcom/tenjin/TenjinModule$1;->$SwitchMap$com$facebook$react$bridge$ReadableType:[I

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    const/4 v3, 0x3

    if-eq v2, v3, :cond_3

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    const/4 v3, 0x5

    if-eq v2, v3, :cond_1

    const/4 v3, 0x6

    if-eq v2, v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/tenjin/TenjinModule;->convertArrayToJson(Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_1
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_1

    :cond_2
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;

    goto :goto_2

    :cond_4
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method private convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;
    .locals 5

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/tenjin/TenjinModule$1;->$SwitchMap$com$facebook$react$bridge$ReadableType:[I

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/TenjinModule;->convertArrayToJson(Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;

    move-result-object v3

    :goto_1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :pswitch_1
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object v3

    goto :goto_1

    :pswitch_2
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :pswitch_3
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    goto :goto_0

    :pswitch_4
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :pswitch_5
    sget-object v3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private synthetic lambda$getAttributionInfo$0(Lcom/facebook/react/bridge/Callback;Ljava/util/Map;)V
    .locals 1

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lcom/tenjin/TenjinModule;->convertJsonToMap(Lorg/json/JSONObject;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private readableToArray(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/String;
    .locals 3

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public appendAppSubversion(Ljava/lang/Double;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {p1}, Ljava/lang/Double;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->appendAppSubversion(Ljava/lang/Integer;)V

    return-void
.end method

.method public connect()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->connect()V

    return-void
.end method

.method public convertJsonToArray(Lorg/json/JSONArray;)Lcom/facebook/react/bridge/WritableArray;
    .locals 4

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeArray;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_6

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_0

    check-cast v2, Lorg/json/JSONObject;

    invoke-virtual {p0, v2}, Lcom/tenjin/TenjinModule;->convertJsonToMap(Lorg/json/JSONObject;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_2

    :cond_0
    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_1

    check-cast v2, Lorg/json/JSONArray;

    invoke-virtual {p0, v2}, Lcom/tenjin/TenjinModule;->convertJsonToArray(Lorg/json/JSONArray;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_2

    :cond_1
    instance-of v3, v2, Ljava/lang/Boolean;

    if-eqz v3, :cond_2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushBoolean(Z)V

    goto :goto_2

    :cond_2
    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    goto :goto_2

    :cond_3
    instance-of v3, v2, Ljava/lang/Double;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    goto :goto_2

    :cond_4
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_5

    check-cast v2, Ljava/lang/String;

    :goto_1
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public convertJsonToMap(Lorg/json/JSONObject;)Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lorg/json/JSONObject;

    if-eqz v4, :cond_1

    check-cast v3, Lorg/json/JSONObject;

    invoke-virtual {p0, v3}, Lcom/tenjin/TenjinModule;->convertJsonToMap(Lorg/json/JSONObject;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_0

    :cond_1
    instance-of v4, v3, Lorg/json/JSONArray;

    if-eqz v4, :cond_2

    check-cast v3, Lorg/json/JSONArray;

    invoke-virtual {p0, v3}, Lcom/tenjin/TenjinModule;->convertJsonToArray(Lorg/json/JSONArray;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v4

    invoke-interface {v0, v2, v4}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v4, "option_values"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "options"

    invoke-virtual {p0, v3}, Lcom/tenjin/TenjinModule;->convertJsonToArray(Lorg/json/JSONArray;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_0

    :cond_2
    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_4

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_4
    instance-of v4, v3, Ljava/lang/Double;

    if-eqz v4, :cond_5

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-interface {v0, v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    :cond_5
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_6

    check-cast v3, Ljava/lang/String;

    :goto_1
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_7
    return-object v0
.end method

.method public eventAdImpressionAdMob(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAdMob(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public eventAdImpressionAppLovin(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionAppLovin(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public eventAdImpressionHyperBid(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionHyperBid(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public eventAdImpressionIronSource(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionIronSource(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public eventAdImpressionTopOn(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionTopOn(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public eventAdImpressionTradPlus(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->convertMapToJson(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventAdImpressionTradPlus(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public eventWithName(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->eventWithName(Ljava/lang/String;)V

    return-void
.end method

.method public eventWithNameAndValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0, p1, p2}, Lcom/tenjin/android/TenjinSDK;->eventWithNameAndValue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public getAnalyticsInstallationId(Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->getAnalyticsInstallationId()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public getAttributionInfo(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object p2, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    new-instance v0, Lcom/tenjin/a;

    invoke-direct {v0, p0, p1}, Lcom/tenjin/a;-><init>(Lcom/tenjin/TenjinModule;Lcom/facebook/react/bridge/Callback;)V

    invoke-virtual {p2, v0}, Lcom/tenjin/android/TenjinSDK;->getAttributionInfo(Lcom/tenjin/android/AttributionInfoCallback;)V

    return-void
.end method

.method public getCustomerUserId(Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->getCustomerUserId()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "Tenjin"

    return-object v0
.end method

.method public initialize(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v0, p1}, Lcom/tenjin/android/TenjinSDK;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tenjin/android/TenjinSDK;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    return-void
.end method

.method public optIn()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->optIn()V

    return-void
.end method

.method public optInGoogleDMA()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->optInGoogleDMA()V

    return-void
.end method

.method public optInOutUsingCMP()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->optInOutUsingCMP()Z

    return-void
.end method

.method public optInParams(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->readableToArray(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->optInParams([Ljava/lang/String;)V

    return-void
.end method

.method public optOut()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->optOut()V

    return-void
.end method

.method public optOutGoogleDMA()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0}, Lcom/tenjin/android/TenjinSDK;->optOutGoogleDMA()V

    return-void
.end method

.method public optOutParams(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0, p1}, Lcom/tenjin/TenjinModule;->readableToArray(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->optOutParams([Ljava/lang/String;)V

    return-void
.end method

.method public setAppStore(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    sget-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->unspecified:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "other"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "amazon"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "googleplay"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    sget-object p1, Lcom/tenjin/android/TenjinSDK$AppStoreType;->unspecified:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    goto :goto_1

    :pswitch_0
    sget-object p1, Lcom/tenjin/android/TenjinSDK$AppStoreType;->other:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    goto :goto_1

    :pswitch_1
    sget-object p1, Lcom/tenjin/android/TenjinSDK$AppStoreType;->amazon:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lcom/tenjin/android/TenjinSDK$AppStoreType;->googleplay:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    :goto_1
    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->setAppStore(Lcom/tenjin/android/TenjinSDK$AppStoreType;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5b73db13 -> :sswitch_2
        -0x544bf9fc -> :sswitch_1
        0x6527f10 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setCacheEventSetting(Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->setCacheEventSetting(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setCustomerUserId(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {v0, p1}, Lcom/tenjin/android/TenjinSDK;->setCustomerUserId(Ljava/lang/String;)V

    return-void
.end method

.method public setGoogleDMAParameters(Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/tenjin/android/TenjinSDK;->setGoogleDMAParameters(ZZ)V

    return-void
.end method

.method public transaction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v3

    invoke-virtual {p4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/tenjin/android/TenjinSDK;->transaction(Ljava/lang/String;Ljava/lang/String;ID)V

    return-void
.end method

.method public transactionWithReceipt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/tenjin/TenjinModule;->instance:Lcom/tenjin/android/TenjinSDK;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v3

    invoke-virtual {p4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    move-object v1, p1

    move-object v2, p2

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lcom/tenjin/android/TenjinSDK;->transaction(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
