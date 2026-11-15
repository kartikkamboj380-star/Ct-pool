.class public final Lcom/tenjin/android/model/Transaction;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appStore:Lcom/tenjin/android/enums/AppStoreTypeEnum;

.field private currencyCode:Ljava/lang/String;

.field private dataSignature:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private purchaseData:Ljava/lang/String;

.field private quantity:I

.field private receiptId:Ljava/lang/String;

.field private unitPrice:D

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/enums/AppStoreTypeEnum;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "appStore"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productId"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currencyCode"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiptId"

    invoke-static {p7, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p8, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseData"

    invoke-static {p9, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSignature"

    invoke-static {p10, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->appStore:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    iput-object p2, p0, Lcom/tenjin/android/model/Transaction;->productId:Ljava/lang/String;

    iput-object p3, p0, Lcom/tenjin/android/model/Transaction;->currencyCode:Ljava/lang/String;

    iput p4, p0, Lcom/tenjin/android/model/Transaction;->quantity:I

    iput-wide p5, p0, Lcom/tenjin/android/model/Transaction;->unitPrice:D

    iput-object p7, p0, Lcom/tenjin/android/model/Transaction;->receiptId:Ljava/lang/String;

    iput-object p8, p0, Lcom/tenjin/android/model/Transaction;->userId:Ljava/lang/String;

    iput-object p9, p0, Lcom/tenjin/android/model/Transaction;->purchaseData:Ljava/lang/String;

    iput-object p10, p0, Lcom/tenjin/android/model/Transaction;->dataSignature:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tenjin/android/enums/AppStoreTypeEnum;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    .line 2
    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x20

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object/from16 v12, p9

    :goto_2
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_3

    move-object v13, v2

    goto :goto_3

    :cond_3
    move-object/from16 v13, p10

    :goto_3
    move-object v3, p0

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-wide/from16 v8, p5

    invoke-direct/range {v3 .. v13}, Lcom/tenjin/android/model/Transaction;-><init>(Lcom/tenjin/android/enums/AppStoreTypeEnum;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getAppStore()Lcom/tenjin/android/enums/AppStoreTypeEnum;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->appStore:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    return-object v0
.end method

.method public final getCurrencyCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->currencyCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->dataSignature:Ljava/lang/String;

    return-object v0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPurchaseData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->purchaseData:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuantity()I
    .locals 1

    iget v0, p0, Lcom/tenjin/android/model/Transaction;->quantity:I

    return v0
.end method

.method public final getReceiptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->receiptId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitPrice()D
    .locals 2

    iget-wide v0, p0, Lcom/tenjin/android/model/Transaction;->unitPrice:D

    return-wide v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final setAppStore(Lcom/tenjin/android/enums/AppStoreTypeEnum;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->appStore:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    return-void
.end method

.method public final setCurrencyCode(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->currencyCode:Ljava/lang/String;

    return-void
.end method

.method public final setDataSignature(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->dataSignature:Ljava/lang/String;

    return-void
.end method

.method public final setProductId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->productId:Ljava/lang/String;

    return-void
.end method

.method public final setPurchaseData(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->purchaseData:Ljava/lang/String;

    return-void
.end method

.method public final setQuantity(I)V
    .locals 0

    iput p1, p0, Lcom/tenjin/android/model/Transaction;->quantity:I

    return-void
.end method

.method public final setReceiptId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->receiptId:Ljava/lang/String;

    return-void
.end method

.method public final setUnitPrice(D)V
    .locals 0

    iput-wide p1, p0, Lcom/tenjin/android/model/Transaction;->unitPrice:D

    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tenjin/android/model/Transaction;->userId:Ljava/lang/String;

    return-void
.end method

.method public final transactionEventName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->appStore:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    sget-object v1, Lcom/tenjin/android/enums/AppStoreTypeEnum;->AMAZON:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    if-ne v0, v1, :cond_0

    const-string v0, "eventNameTransactionAmazon"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/model/Transaction;->purchaseData:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "eventNameTransactionData"

    goto :goto_0

    :cond_1
    const-string v0, "eventNameTransaction"

    :goto_0
    return-object v0
.end method
