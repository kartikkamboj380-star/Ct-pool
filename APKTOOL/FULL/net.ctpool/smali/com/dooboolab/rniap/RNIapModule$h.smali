.class final Lcom/dooboolab/rniap/RNIapModule$h;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->getItemsByType(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic n:Lcom/facebook/react/bridge/Promise;

.field final synthetic o:Ljava/lang/String;

.field final synthetic p:Lcom/dooboolab/rniap/RNIapModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/dooboolab/rniap/RNIapModule;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$h;->m:Lcom/facebook/react/bridge/ReadableArray;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule$h;->n:Lcom/facebook/react/bridge/Promise;

    iput-object p3, p0, Lcom/dooboolab/rniap/RNIapModule$h;->o:Ljava/lang/String;

    iput-object p4, p0, Lcom/dooboolab/rniap/RNIapModule$h;->p:Lcom/dooboolab/rniap/RNIapModule;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule$h;->c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V

    return-void
.end method

.method private static final c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "this$0"

    invoke-static {v0, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$promise"

    invoke-static {v1, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "billingResult"

    invoke-static {v2, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "skuDetailsList"

    move-object/from16 v4, p3

    invoke-static {v4, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, v1}, Lcom/dooboolab/rniap/RNIapModule;->access$isValidResult(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v2

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/billingclient/api/g;

    invoke-static/range {p0 .. p0}, Lcom/dooboolab/rniap/RNIapModule;->access$getSkus$p(Lcom/dooboolab/rniap/RNIapModule;)Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->d()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getProductId(...)"

    invoke-static {v6, v7}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v5

    const-string v6, "productId"

    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->d()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "title"

    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->g()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "description"

    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->a()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "productType"

    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "name"

    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->c()Lcom/android/billingclient/api/g$b;

    move-result-object v6

    const-string v7, "priceAmountMicros"

    const-string v8, "formattedPrice"

    const-string v9, "priceCurrencyCode"

    if-eqz v6, :cond_1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v10

    invoke-virtual {v6}, Lcom/android/billingclient/api/g$b;->c()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v9, v11}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/android/billingclient/api/g$b;->a()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v8, v11}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/android/billingclient/api/g$b;->b()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v10, v7, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "oneTimePurchaseOfferDetails"

    invoke-interface {v5, v6, v10}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    :cond_1
    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->f()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v6

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/android/billingclient/api/g$e;

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v11

    invoke-virtual {v10}, Lcom/android/billingclient/api/g$e;->a()Ljava/lang/String;

    move-result-object v12

    const-string v13, "basePlanId"

    invoke-interface {v11, v13, v12}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v12, "offerId"

    invoke-virtual {v10}, Lcom/android/billingclient/api/g$e;->b()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v11, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v12, "offerToken"

    invoke-virtual {v10}, Lcom/android/billingclient/api/g$e;->d()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v11, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v12

    invoke-virtual {v10}, Lcom/android/billingclient/api/g$e;->c()Ljava/util/List;

    move-result-object v13

    const-string v14, "getOfferTags(...)"

    invoke-static {v13, v14}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v12, v14}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string v13, "offerTags"

    invoke-interface {v11, v13, v12}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v12

    invoke-virtual {v10}, Lcom/android/billingclient/api/g$e;->e()Lcom/android/billingclient/api/g$d;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/g$d;->a()Ljava/util/List;

    move-result-object v10

    const-string v13, "getPricingPhaseList(...)"

    invoke-static {v10, v13}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/android/billingclient/api/g$c;

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v14

    invoke-virtual {v13}, Lcom/android/billingclient/api/g$c;->c()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v8, v15}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v13}, Lcom/android/billingclient/api/g$c;->e()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v9, v15}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "billingPeriod"

    invoke-virtual {v13}, Lcom/android/billingclient/api/g$c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "billingCycleCount"

    invoke-virtual {v13}, Lcom/android/billingclient/api/g$c;->a()I

    move-result v15

    invoke-interface {v14, v0, v15}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v13}, Lcom/android/billingclient/api/g$c;->d()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v7, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "recurrenceMode"

    invoke-virtual {v13}, Lcom/android/billingclient/api/g$c;->f()I

    move-result v13

    invoke-interface {v14, v0, v13}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-interface {v12, v14}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    move-object/from16 v0, p0

    goto :goto_3

    :cond_3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v10, "pricingPhaseList"

    invoke-interface {v0, v10, v12}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v10, "pricingPhases"

    invoke-interface {v11, v10, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-interface {v6, v11}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_4
    const-string v0, "subscriptionOfferDetails"

    invoke-interface {v5, v0, v6}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    :cond_5
    invoke-interface {v2, v5}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_6
    invoke-static {v1, v2}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/android/billingclient/api/b;)V
    .locals 7

    .line 1
    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule$h;->m:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const-string v3, "build(...)"

    if-ge v2, v1, :cond_1

    iget-object v4, p0, Lcom/dooboolab/rniap/RNIapModule$h;->m:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v4, v2}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v4

    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lcom/dooboolab/rniap/RNIapModule$h;->m:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v4, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, p0, Lcom/dooboolab/rniap/RNIapModule$h;->o:Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/h$b;->a()Lcom/android/billingclient/api/h$b$a;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/android/billingclient/api/h$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/android/billingclient/api/h$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/android/billingclient/api/h$b$a;->a()Lcom/android/billingclient/api/h$b;

    move-result-object v4

    invoke-static {v4, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$h;->n:Lcom/facebook/react/bridge/Promise;

    const-string v0, "EMPTY_SKU_LIST"

    const-string v1, "The SKU list is empty."

    invoke-static {p1, v0, v1}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/android/billingclient/api/h;->a()Lcom/android/billingclient/api/h$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/h$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object v0

    invoke-static {v0, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule$h;->p:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v2, p0, Lcom/dooboolab/rniap/RNIapModule$h;->n:Lcom/facebook/react/bridge/Promise;

    new-instance v3, Lcom/dooboolab/rniap/l;

    invoke-direct {v3, v1, v2}, Lcom/dooboolab/rniap/l;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/b;->h(Lcom/android/billingclient/api/h;LC0/f;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$h;->b(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
