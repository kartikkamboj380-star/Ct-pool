.class Lcom/tenjin/android/TenjinSDK$AsyncEvent;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/TenjinSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private adImpressionData:Lorg/json/JSONObject;

.field private adRevenueAdNetwork:Ljava/lang/String;

.field private currencyCode:Ljava/lang/String;

.field private dataSignature:Ljava/lang/String;

.field private event:Lcom/tenjin/android/store/QueueEvent;

.field private eventId:Ljava/lang/String;

.field private intValue:I

.field private name:Ljava/lang/String;

.field private params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private postURL:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private purchaseData:Ljava/lang/String;

.field private quantity:I

.field private receiptId:Ljava/lang/String;

.field final synthetic this$0:Lcom/tenjin/android/TenjinSDK;

.field private type:Ljava/lang/String;

.field private unitPrice:D

.field private userId:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/model/Transaction;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "https://track.tenjin.com/v0/event"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->transactionEventName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    invoke-static {p2}, Lcom/tenjin/android/model/EventKey;->getEventKey(Lcom/tenjin/android/model/Transaction;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    const-string p1, "https://track.tenjin.com/v0/purchase"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->getProductId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->productId:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->getCurrencyCode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->currencyCode:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->getQuantity()I

    move-result p1

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->quantity:I

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->getUnitPrice()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->unitPrice:D

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->getReceiptId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->receiptId:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->getUserId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->userId:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/tenjin/android/model/Transaction;->getPurchaseData()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->purchaseData:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/model/Transaction;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/model/Transaction;)V

    return-void
.end method

.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/store/QueueEvent;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "https://track.tenjin.com/v0/event"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getParams()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->params:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getEndpoint()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->event:Lcom/tenjin/android/store/QueueEvent;

    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/store/QueueEvent;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/store/QueueEvent;)V

    return-void
.end method

.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "https://track.tenjin.com/v0/event"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    const-string p1, "eventName"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    invoke-static {p2}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->name:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;I)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "https://track.tenjin.com/v0/event"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    const-string p1, "eventNameIntValue"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->name:Ljava/lang/String;

    iput p3, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;ILcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "https://track.tenjin.com/v0/event"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    const-string p1, "eventNameValue"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->name:Ljava/lang/String;

    iput-object p3, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->value:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;ID)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "https://track.tenjin.com/v0/event"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    const-string p1, "eventNameTransaction"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    invoke-static {p2, p3, p4, p5, p6}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;ID)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    const-string p1, "https://track.tenjin.com/v0/purchase"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->productId:Ljava/lang/String;

    iput-object p3, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->currencyCode:Ljava/lang/String;

    iput p4, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->quantity:I

    iput-wide p5, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->unitPrice:D

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;IDLcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 11
    invoke-direct/range {p0 .. p6}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;ID)V

    return-void
.end method

.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "https://track.tenjin.com/v0/event"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    const-string p1, "eventNameTransactionData"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    invoke-static/range {p2 .. p8}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    const-string p1, "https://track.tenjin.com/v0/purchase"

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->productId:Ljava/lang/String;

    iput-object p3, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->currencyCode:Ljava/lang/String;

    iput p4, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->quantity:I

    iput-wide p5, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->unitPrice:D

    iput-object p7, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->purchaseData:Ljava/lang/String;

    iput-object p8, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->dataSignature:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 13
    invoke-direct/range {p0 .. p8}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 15
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string v0, "https://track.tenjin.com/v0/event"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v1, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :goto_0
    move v0, v1

    goto :goto_1

    :sswitch_0
    const-string v0, "tradplus"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    goto :goto_1

    :sswitch_1
    const-string v0, "applovin"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    goto :goto_1

    :sswitch_2
    const-string v0, "topon"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    goto :goto_1

    :sswitch_3
    const-string v0, "admob"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "cas"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    goto :goto_1

    :sswitch_5
    const-string v0, "hyperbid"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_6
    const-string v2, "ironsource"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    :goto_1
    packed-switch v0, :pswitch_data_0

    const-string v0, "eventAdImpressionData"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impression"

    :goto_2
    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    goto :goto_3

    :pswitch_0
    const-string v0, "eventAdImpressionDataTradPlus"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impressions/tradplus"

    goto :goto_2

    :pswitch_1
    const-string v0, "eventAdImpressionDataAppLovin"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impressions/max"

    goto :goto_2

    :pswitch_2
    const-string v0, "eventAdImpressionDataTopOn"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impressions/topon"

    goto :goto_2

    :pswitch_3
    const-string v0, "eventAdImpressionDataAdMob"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impressions/admob"

    goto :goto_2

    :pswitch_4
    const-string v0, "eventAdImpressionDataCAS"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impressions/cas"

    goto :goto_2

    :pswitch_5
    const-string v0, "eventAdImpressionDataHyperBid"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impressions/hyperbid"

    goto :goto_2

    :pswitch_6
    const-string v0, "eventAdImpressionDataIronSource"

    iput-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    const-string v0, "https://track.tenjin.com/v0/ad_impressions/ironsource"

    goto :goto_2

    :goto_3
    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adRevenueAdNetwork:Ljava/lang/String;

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK;->access$2200(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    iput-object p3, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adImpressionData:Lorg/json/JSONObject;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3746d91d -> :sswitch_6
        -0x6d068ef -> :sswitch_5
        0x17fd5 -> :sswitch_4
        0x58603fd -> :sswitch_3
        0x696cdf4 -> :sswitch_2
        0x4650da37 -> :sswitch_1
        0x4bca883b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Lorg/json/JSONObject;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic a(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->lambda$handleCacheEvent$0(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$3200(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->type:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3300(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3400(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->value:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3500(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)I
    .locals 0

    iget p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    return p0
.end method

.method static synthetic access$3600(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->productId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3700(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->currencyCode:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3800(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)I
    .locals 0

    iget p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->quantity:I

    return p0
.end method

.method static synthetic access$3900(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)D
    .locals 2

    iget-wide v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->unitPrice:D

    return-wide v0
.end method

.method static synthetic access$4000(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->purchaseData:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$4100(Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->dataSignature:Ljava/lang/String;

    return-object p0
.end method

.method private static synthetic lambda$handleCacheEvent$0(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;Ljava/util/List;)V
    .locals 0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/tenjin/android/store/TenjinDatasource;->insertEvent(Lcom/tenjin/android/store/QueueEvent;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 9

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->name:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, ""

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_a

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->params:Ljava/util/Map;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0}, Lcom/tenjin/android/TenjinSDK;->access$1700(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->params:Ljava/util/Map;

    if-nez v1, :cond_2

    const-string v1, "event"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->value:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const-string v1, "value"

    if-nez p1, :cond_3

    :try_start_2
    iget p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->intValue:I

    if-eqz p1, :cond_3

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->value:Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    const-string v1, "https://track.tenjin.com/v0/purchase"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "currency"

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->currencyCode:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "product_id"

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->productId:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "quantity"

    iget v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->quantity:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "price"

    iget-wide v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->unitPrice:D

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->dataSignature:Ljava/lang/String;

    if-eqz p1, :cond_5

    const-string v1, "signature"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->purchaseData:Ljava/lang/String;

    if-eqz p1, :cond_6

    const-string v1, "receipt"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->receiptId:Ljava/lang/String;

    if-eqz p1, :cond_7

    const-string v1, "receipt_id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->userId:Ljava/lang/String;

    if-eqz p1, :cond_8

    const-string v1, "user_id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adRevenueAdNetwork:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_d

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adImpressionData:Lorg/json/JSONObject;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adRevenueAdNetwork:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const-string v2, "ironsource"

    const-string v3, "hyperbid"

    const-string v4, "cas"

    const-string v5, "topon"

    const-string v6, "tradplus"

    const-string v7, "admob"

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    :try_start_3
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x6

    goto :goto_2

    :sswitch_1
    const-string v1, "applovin"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x0

    goto :goto_2

    :sswitch_2
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x4

    goto :goto_2

    :sswitch_3
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x3

    goto :goto_2

    :sswitch_4
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x5

    goto :goto_2

    :sswitch_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x2

    goto :goto_2

    :sswitch_6
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz p1, :cond_9

    const/4 p1, 0x1

    goto :goto_2

    :cond_9
    :goto_1
    const/4 p1, -0x1

    :goto_2
    const-string v1, "publisher_revenue"

    const-string v8, "revenue"

    packed-switch p1, :pswitch_data_0

    :try_start_4
    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adRevenueAdNetwork:Ljava/lang/String;

    goto :goto_4

    :pswitch_0
    move-object v2, v6

    :goto_3
    :pswitch_1
    move-object v1, v8

    goto :goto_4

    :pswitch_2
    move-object v2, v4

    goto :goto_3

    :pswitch_3
    move-object v2, v5

    goto :goto_4

    :pswitch_4
    const-string v1, "value_micros"

    move-object v2, v7

    goto :goto_4

    :pswitch_5
    move-object v2, v3

    goto :goto_4

    :pswitch_6
    const-string v2, "max"

    goto :goto_3

    :goto_4
    const-string p1, "ad_revenue_mediation"

    iget-object v3, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adRevenueAdNetwork:Ljava/lang/String;

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :try_start_5
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adRevenueAdNetwork:Ljava/lang/String;

    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-wide v3, 0x412e848000000000L    # 1000000.0

    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adImpressionData:Lorg/json/JSONObject;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    div-double/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_5

    :catch_1
    move-exception p1

    goto :goto_6

    :cond_a
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adImpressionData:Lorg/json/JSONObject;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    mul-double/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :goto_5
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v3}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/text/DecimalFormat;

    const-string v5, "################################################.###########################################"

    invoke-virtual {v4, v5}, Ljava/text/DecimalFormat;->applyPattern(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "[publisher_revenue_decimal]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-virtual {v3, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[publisher_revenue_micro]"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_7

    :goto_6
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_c
    :goto_7
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adImpressionData:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->adImpressionData:Lorg/json/JSONObject;

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_d
    const-string p1, "Authorization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Basic "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v2}, Lcom/tenjin/android/TenjinSDK;->access$900(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const/16 v3, 0xa

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/tenjin/android/HttpConnection;

    invoke-direct {p1}, Lcom/tenjin/android/HttpConnection;-><init>()V

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    invoke-virtual {p1, v1, v0, v2}, Lcom/tenjin/android/HttpConnection;->connectWithRetryCheck(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Landroid/util/Pair;

    move-result-object p1

    new-instance v1, Lcom/tenjin/android/store/TenjinDatasource;

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v2}, Lcom/tenjin/android/TenjinSDK;->access$1800(Lcom/tenjin/android/TenjinSDK;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tenjin/android/store/TenjinDatasource;-><init>(Landroid/content/Context;)V

    iget-object v2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v1}, Lcom/tenjin/android/store/TenjinDatasource;->getCacheEventSetting()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_e

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->event:Lcom/tenjin/android/store/QueueEvent;

    if-eqz v2, :cond_e

    invoke-virtual {v1, v2}, Lcom/tenjin/android/store/TenjinDatasource;->deleteEvent(Lcom/tenjin/android/store/QueueEvent;)V

    goto :goto_9

    :cond_e
    iget-object v2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_f

    iget-object v2, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v1}, Lcom/tenjin/android/store/TenjinDatasource;->getCacheEventSetting()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->event:Lcom/tenjin/android/store/QueueEvent;

    if-nez v1, :cond_f

    new-instance v1, Lcom/tenjin/android/store/QueueEvent;

    invoke-direct {v1}, Lcom/tenjin/android/store/QueueEvent;-><init>()V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Lcom/tenjin/android/store/QueueEvent;->setDate(Ljava/util/Date;)V

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->postURL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/tenjin/android/store/QueueEvent;->setEndpoint(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/tenjin/android/store/QueueEvent;->setParams(Ljava/util/Map;)V

    invoke-virtual {p0, v1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->handleCacheEvent(Lcom/tenjin/android/store/QueueEvent;)V

    :cond_f
    :goto_9
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    return-object p1

    :goto_a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :catch_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x3746d91d -> :sswitch_6
        -0x6d068ef -> :sswitch_5
        0x17fd5 -> :sswitch_4
        0x58603fd -> :sswitch_3
        0x696cdf4 -> :sswitch_2
        0x4650da37 -> :sswitch_1
        0x4bca883b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method handleCacheEvent(Lcom/tenjin/android/store/QueueEvent;)V
    .locals 3

    new-instance v0, Lcom/tenjin/android/store/TenjinDatasource;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$1800(Lcom/tenjin/android/TenjinSDK;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tenjin/android/store/TenjinDatasource;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/tenjin/android/store/QueueEvent;->getParams()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lcom/tenjin/android/b;

    invoke-direct {v2, v0, p1}, Lcom/tenjin/android/b;-><init>(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)V

    invoke-virtual {v0, v1, v2}, Lcom/tenjin/android/store/TenjinDatasource;->getEventWithParams(Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->event:Lcom/tenjin/android/store/QueueEvent;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {p1, p0}, Lcom/tenjin/android/TenjinSDK;->access$2400(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/TenjinSDK$AsyncEvent;)Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tenjin/android/TenjinSDK;->access$1100(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)Z

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->eventId:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tenjin/android/TenjinSDK;->access$2300(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)Z

    :goto_1
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncEvent;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
