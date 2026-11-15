.class public Lcom/tenjin/android/model/EventName;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private adImpressionAdNetwork:Ljava/lang/String;

.field private adImpressionData:Lorg/json/JSONObject;

.field private attributionInfoCallback:Lcom/tenjin/android/AttributionInfoCallback;

.field private currencyCode:Ljava/lang/String;

.field private dataSignature:Ljava/lang/String;

.field private deferredDeeplinkCallback:Lcom/tenjin/android/Callback;

.field private intValue:I

.field private name:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private purchaseData:Ljava/lang/String;

.field private quantity:I

.field private receiptId:Ljava/lang/String;

.field private transactionData:Lcom/tenjin/android/model/Transaction;

.field private final type:Ljava/lang/String;

.field private unitPrice:D

.field private userId:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/model/Transaction;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    iput v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    invoke-virtual {p1}, Lcom/tenjin/android/model/Transaction;->transactionEventName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->transactionData:Lcom/tenjin/android/model/Transaction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    iput v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    const-string v0, "eventName"

    iput-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->name:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    const-string v0, "eventNameIntValue"

    iput-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->name:Ljava/lang/String;

    iput p2, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    iput v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    instance-of p1, p2, Lcom/tenjin/android/Callback;

    if-eqz p1, :cond_0

    check-cast p2, Lcom/tenjin/android/Callback;

    iput-object p2, p0, Lcom/tenjin/android/model/EventName;->deferredDeeplinkCallback:Lcom/tenjin/android/Callback;

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lcom/tenjin/android/AttributionInfoCallback;

    if-eqz p1, :cond_1

    check-cast p2, Lcom/tenjin/android/AttributionInfoCallback;

    iput-object p2, p0, Lcom/tenjin/android/model/EventName;->attributionInfoCallback:Lcom/tenjin/android/AttributionInfoCallback;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Missing callback implementation"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    iput v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    const-string v0, "eventNameValue"

    iput-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->name:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/model/EventName;->value:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    iput-object p2, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->name:Ljava/lang/String;

    iput p3, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ID)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    const-string v0, "eventNameTransaction"

    iput-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->productId:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/model/EventName;->currencyCode:Ljava/lang/String;

    iput p3, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    iput-wide p4, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    const-string v0, "eventNameTransactionData"

    iput-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->productId:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/model/EventName;->currencyCode:Ljava/lang/String;

    iput p3, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    iput-wide p4, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    iput-object p6, p0, Lcom/tenjin/android/model/EventName;->purchaseData:Ljava/lang/String;

    iput-object p7, p0, Lcom/tenjin/android/model/EventName;->dataSignature:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    iput v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :goto_0
    move v0, v1

    goto :goto_1

    :sswitch_0
    const-string v0, "applovin"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    goto :goto_1

    :sswitch_1
    const-string v0, "topon"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    goto :goto_1

    :sswitch_2
    const-string v0, "admob"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "hyperbid"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_4
    const-string v2, "ironsource"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    packed-switch v0, :pswitch_data_0

    const-string v0, "eventAdImpressionData"

    :goto_2
    iput-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    goto :goto_3

    :pswitch_0
    const-string v0, "eventAdImpressionDataAppLovin"

    goto :goto_2

    :pswitch_1
    const-string v0, "eventAdImpressionDataTopOn"

    goto :goto_2

    :pswitch_2
    const-string v0, "eventAdImpressionDataAdMob"

    goto :goto_2

    :pswitch_3
    const-string v0, "eventAdImpressionDataHyperBid"

    goto :goto_2

    :pswitch_4
    const-string v0, "eventAdImpressionDataIronSource"

    goto :goto_2

    :goto_3
    iput-object p1, p0, Lcom/tenjin/android/model/EventName;->adImpressionAdNetwork:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/model/EventName;->adImpressionData:Lorg/json/JSONObject;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3746d91d -> :sswitch_4
        -0x6d068ef -> :sswitch_3
        0x58603fd -> :sswitch_2
        0x696cdf4 -> :sswitch_1
        0x4650da37 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getAdImpressionAdNetwork()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->adImpressionAdNetwork:Ljava/lang/String;

    return-object v0
.end method

.method public getAdImpressionData()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->adImpressionData:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getAttributionInfoCallback()Lcom/tenjin/android/AttributionInfoCallback;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->attributionInfoCallback:Lcom/tenjin/android/AttributionInfoCallback;

    return-object v0
.end method

.method public getCurrencyCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->currencyCode:Ljava/lang/String;

    return-object v0
.end method

.method public getDataSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->dataSignature:Ljava/lang/String;

    return-object v0
.end method

.method public getDeferredDeeplinkCallback()Lcom/tenjin/android/Callback;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->deferredDeeplinkCallback:Lcom/tenjin/android/Callback;

    return-object v0
.end method

.method public getIntValue()I
    .locals 1

    iget v0, p0, Lcom/tenjin/android/model/EventName;->intValue:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->purchaseData:Ljava/lang/String;

    return-object v0
.end method

.method public getQuantity()I
    .locals 1

    iget v0, p0, Lcom/tenjin/android/model/EventName;->quantity:I

    return v0
.end method

.method public getReceiptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->receiptId:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionData()Lcom/tenjin/android/model/Transaction;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->transactionData:Lcom/tenjin/android/model/Transaction;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUnitPrice()D
    .locals 2

    iget-wide v0, p0, Lcom/tenjin/android/model/EventName;->unitPrice:D

    return-wide v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/EventName;->value:Ljava/lang/String;

    return-object v0
.end method
