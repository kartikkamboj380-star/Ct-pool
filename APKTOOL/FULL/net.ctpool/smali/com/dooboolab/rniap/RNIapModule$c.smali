.class final Lcom/dooboolab/rniap/RNIapModule$c;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->buyItemByType(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;ZLcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/bridge/Promise;

.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic p:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic q:Lcom/dooboolab/rniap/RNIapModule;

.field final synthetic r:Z

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:I

.field final synthetic u:Ljava/lang/String;

.field final synthetic v:Ljava/lang/String;

.field final synthetic w:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/dooboolab/rniap/RNIapModule;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$c;->m:Lcom/facebook/react/bridge/Promise;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule$c;->n:Ljava/lang/String;

    iput-object p3, p0, Lcom/dooboolab/rniap/RNIapModule$c;->o:Lcom/facebook/react/bridge/ReadableArray;

    iput-object p4, p0, Lcom/dooboolab/rniap/RNIapModule$c;->p:Lcom/facebook/react/bridge/ReadableArray;

    iput-object p5, p0, Lcom/dooboolab/rniap/RNIapModule$c;->q:Lcom/dooboolab/rniap/RNIapModule;

    iput-boolean p6, p0, Lcom/dooboolab/rniap/RNIapModule$c;->r:Z

    iput-object p7, p0, Lcom/dooboolab/rniap/RNIapModule$c;->s:Ljava/lang/String;

    iput p8, p0, Lcom/dooboolab/rniap/RNIapModule$c;->t:I

    iput-object p9, p0, Lcom/dooboolab/rniap/RNIapModule$c;->u:Ljava/lang/String;

    iput-object p10, p0, Lcom/dooboolab/rniap/RNIapModule$c;->v:Ljava/lang/String;

    iput-object p11, p0, Lcom/dooboolab/rniap/RNIapModule$c;->w:Landroid/app/Activity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/b;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "billingClient"

    invoke-static {v1, v2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/dooboolab/rniap/c;->a:Lcom/dooboolab/rniap/c;

    iget-object v3, v0, Lcom/dooboolab/rniap/RNIapModule$c;->m:Lcom/facebook/react/bridge/Promise;

    const-string v4, "PROMISE_BUY_ITEM"

    invoke-virtual {v2, v4, v3}, Lcom/dooboolab/rniap/c;->a(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    iget-object v2, v0, Lcom/dooboolab/rniap/RNIapModule$c;->n:Ljava/lang/String;

    const-string v3, "subs"

    invoke-static {v2, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "purchase-error"

    const-string v6, "message"

    const-string v7, "code"

    const-string v8, "debugMessage"

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/dooboolab/rniap/RNIapModule$c;->o:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    iget-object v9, v0, Lcom/dooboolab/rniap/RNIapModule$c;->p:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v9}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v9

    if-eq v2, v9, :cond_0

    iget-object v1, v0, Lcom/dooboolab/rniap/RNIapModule$c;->o:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    iget-object v2, v0, Lcom/dooboolab/rniap/RNIapModule$c;->p:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "The number of skus ("

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") must match: the number of offerTokens ("

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") for Subscriptions"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    invoke-interface {v2, v8, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v7, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v6, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/dooboolab/rniap/RNIapModule$c;->q:Lcom/dooboolab/rniap/RNIapModule;

    invoke-static {v3}, Lcom/dooboolab/rniap/RNIapModule;->access$getReactContext$p(Lcom/dooboolab/rniap/RNIapModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v6

    invoke-static {v3, v6, v5, v2}, Lcom/dooboolab/rniap/RNIapModule;->access$sendEvent(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    iget-object v2, v0, Lcom/dooboolab/rniap/RNIapModule$c;->m:Lcom/facebook/react/bridge/Promise;

    invoke-static {v2, v4, v1}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, v0, Lcom/dooboolab/rniap/RNIapModule$c;->o:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v2, v10}, Lj5/n;->q(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lcom/dooboolab/rniap/RNIapModule$c;->q:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v11, v0, Lcom/dooboolab/rniap/RNIapModule$c;->m:Lcom/facebook/react/bridge/Promise;

    iget-object v12, v0, Lcom/dooboolab/rniap/RNIapModule$c;->n:Ljava/lang/String;

    iget-object v13, v0, Lcom/dooboolab/rniap/RNIapModule$c;->p:Lcom/facebook/react/bridge/ReadableArray;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v9, v10}, Lj5/n;->q(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v14, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v15, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v17, v15, 0x1

    if-gez v15, :cond_2

    invoke-static {}, Lj5/n;->p()V

    :cond_2
    move-object/from16 v10, v16

    check-cast v10, Ljava/lang/String;

    move-object/from16 v16, v9

    invoke-static {v2}, Lcom/dooboolab/rniap/RNIapModule;->access$getSkus$p(Lcom/dooboolab/rniap/RNIapModule;)Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/android/billingclient/api/g;

    if-nez v9, :cond_3

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    const-string v3, "The sku was not found. Please fetch products first by calling getItems"

    invoke-interface {v1, v8, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v7, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v6, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "productId"

    invoke-interface {v1, v6, v10}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/dooboolab/rniap/RNIapModule;->access$getReactContext$p(Lcom/dooboolab/rniap/RNIapModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v6

    invoke-static {v2, v6, v5, v1}, Lcom/dooboolab/rniap/RNIapModule;->access$sendEvent(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    invoke-static {v11, v4, v3}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {}, Lcom/android/billingclient/api/d$b;->a()Lcom/android/billingclient/api/d$b$a;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/android/billingclient/api/d$b$a;->c(Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/d$b$a;

    move-result-object v9

    const-string v10, "setProductDetails(...)"

    invoke-static {v9, v10}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v13, v15}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v9, v10}, Lcom/android/billingclient/api/d$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d$b$a;

    move-result-object v9

    const-string v10, "setOfferToken(...)"

    invoke-static {v9, v10}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b$a;->a()Lcom/android/billingclient/api/d$b;

    move-result-object v9

    invoke-interface {v14, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v9, v16

    move/from16 v15, v17

    goto :goto_1

    :cond_5
    invoke-static {}, Lcom/android/billingclient/api/d;->a()Lcom/android/billingclient/api/d$a;

    move-result-object v2

    const-string v4, "newBuilder(...)"

    invoke-static {v2, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lcom/android/billingclient/api/d$a;->e(Ljava/util/List;)Lcom/android/billingclient/api/d$a;

    move-result-object v5

    iget-boolean v6, v0, Lcom/dooboolab/rniap/RNIapModule$c;->r:Z

    invoke-virtual {v5, v6}, Lcom/android/billingclient/api/d$a;->b(Z)Lcom/android/billingclient/api/d$a;

    invoke-static {}, Lcom/android/billingclient/api/d$c;->a()Lcom/android/billingclient/api/d$c$a;

    move-result-object v5

    invoke-static {v5, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/dooboolab/rniap/RNIapModule$c;->s:Ljava/lang/String;

    const-string v6, "build(...)"

    if-eqz v4, :cond_8

    invoke-virtual {v5, v4}, Lcom/android/billingclient/api/d$c$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d$c$a;

    iget-object v4, v0, Lcom/dooboolab/rniap/RNIapModule$c;->n:Ljava/lang/String;

    invoke-static {v4, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget v3, v0, Lcom/dooboolab/rniap/RNIapModule$c;->t:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_7

    const/4 v4, 0x1

    if-eq v3, v4, :cond_6

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    const/4 v4, 0x3

    if-eq v3, v4, :cond_6

    const/4 v4, 0x5

    if-eq v3, v4, :cond_6

    const/4 v4, 0x6

    if-eq v3, v4, :cond_6

    const/4 v10, 0x0

    goto :goto_2

    :cond_6
    move v10, v4

    :goto_2
    invoke-virtual {v5, v10}, Lcom/android/billingclient/api/d$c$a;->d(I)Lcom/android/billingclient/api/d$c$a;

    :cond_7
    iget-object v3, v0, Lcom/dooboolab/rniap/RNIapModule$c;->s:Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$c$a;->a()Lcom/android/billingclient/api/d$c;

    move-result-object v3

    invoke-static {v3, v6}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/d$a;->f(Lcom/android/billingclient/api/d$c;)Lcom/android/billingclient/api/d$a;

    :cond_8
    iget-object v3, v0, Lcom/dooboolab/rniap/RNIapModule$c;->u:Ljava/lang/String;

    if-eqz v3, :cond_9

    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/d$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;

    :cond_9
    iget-object v3, v0, Lcom/dooboolab/rniap/RNIapModule$c;->v:Ljava/lang/String;

    if-eqz v3, :cond_a

    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/d$a;->d(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;

    :cond_a
    invoke-virtual {v2}, Lcom/android/billingclient/api/d$a;->a()Lcom/android/billingclient/api/d;

    move-result-object v2

    invoke-static {v2, v6}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/dooboolab/rniap/RNIapModule$c;->w:Landroid/app/Activity;

    invoke-virtual {v1, v3, v2}, Lcom/android/billingclient/api/b;->f(Landroid/app/Activity;Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/e;->b()I

    move-result v1

    if-eqz v1, :cond_b

    sget-object v2, Lcom/dooboolab/rniap/b;->a:Lcom/dooboolab/rniap/b;

    invoke-virtual {v2, v1}, Lcom/dooboolab/rniap/b;->a(I)Lcom/dooboolab/rniap/a;

    move-result-object v1

    iget-object v2, v0, Lcom/dooboolab/rniap/RNIapModule$c;->m:Lcom/facebook/react/bridge/Promise;

    invoke-virtual {v1}, Lcom/dooboolab/rniap/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/dooboolab/rniap/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$c;->a(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
