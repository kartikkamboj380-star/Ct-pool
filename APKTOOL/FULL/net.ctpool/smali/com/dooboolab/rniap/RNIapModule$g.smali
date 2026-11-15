.class final Lcom/dooboolab/rniap/RNIapModule$g;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->getAvailableItemsByType(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Lcom/dooboolab/rniap/RNIapModule;

.field final synthetic o:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$g;->m:Ljava/lang/String;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule$g;->n:Lcom/dooboolab/rniap/RNIapModule;

    iput-object p3, p0, Lcom/dooboolab/rniap/RNIapModule$g;->o:Lcom/facebook/react/bridge/Promise;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/dooboolab/rniap/RNIapModule$g;->c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/List;)V

    return-void
.end method

.method private static final c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 3

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$items"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$type"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p4, p1}, Lcom/dooboolab/rniap/RNIapModule;->access$isValidResult(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-eqz p5, :cond_5

    check-cast p5, Ljava/lang/Iterable;

    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/android/billingclient/api/Purchase;

    new-instance p5, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p5}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->f()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "productId"

    invoke-virtual {p5, v1, v0}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v0

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->f()Ljava/util/List;

    move-result-object v1

    const-string v2, "getProducts(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v1, "productIds"

    invoke-virtual {p5, v1, v0}, Lcom/facebook/react/bridge/WritableNativeMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v0, "transactionId"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->h()J

    move-result-wide v0

    long-to-double v0, v0

    const-string v2, "transactionDate"

    invoke-virtual {p5, v2, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    const-string v0, "transactionReceipt"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "orderId"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "purchaseToken"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "developerPayloadAndroid"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "signatureAndroid"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "purchaseStateAndroid"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->g()I

    move-result v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "isAcknowledgedAndroid"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->k()Z

    move-result v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "packageNameAndroid"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->a()Lcom/android/billingclient/api/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/billingclient/api/a;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    const-string v2, "obfuscatedAccountIdAndroid"

    invoke-virtual {p5, v2, v0}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->a()Lcom/android/billingclient/api/a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/billingclient/api/a;->b()Ljava/lang/String;

    move-result-object v1

    :cond_3
    const-string v0, "obfuscatedProfileIdAndroid"

    invoke-virtual {p5, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "subs"

    invoke-static {p3, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "autoRenewingAndroid"

    invoke-virtual {p4}, Lcom/android/billingclient/api/Purchase;->l()Z

    move-result p4

    invoke-virtual {p5, v0, p4}, Lcom/facebook/react/bridge/WritableNativeMap;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    invoke-virtual {p2, p5}, Lcom/facebook/react/bridge/WritableNativeArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_0

    :cond_5
    invoke-static {p1, p2}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/android/billingclient/api/b;)V
    .locals 6

    .line 1
    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeArray;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    invoke-static {}, LC0/k;->a()LC0/k$a;

    move-result-object v1

    iget-object v2, p0, Lcom/dooboolab/rniap/RNIapModule$g;->m:Ljava/lang/String;

    const-string v3, "subs"

    invoke-static {v2, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "inapp"

    :goto_0
    invoke-virtual {v1, v3}, LC0/k$a;->b(Ljava/lang/String;)LC0/k$a;

    move-result-object v1

    invoke-virtual {v1}, LC0/k$a;->a()LC0/k;

    move-result-object v1

    iget-object v2, p0, Lcom/dooboolab/rniap/RNIapModule$g;->n:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v3, p0, Lcom/dooboolab/rniap/RNIapModule$g;->o:Lcom/facebook/react/bridge/Promise;

    iget-object v4, p0, Lcom/dooboolab/rniap/RNIapModule$g;->m:Ljava/lang/String;

    new-instance v5, Lcom/dooboolab/rniap/k;

    invoke-direct {v5, v2, v3, v0, v4}, Lcom/dooboolab/rniap/k;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v5}, Lcom/android/billingclient/api/b;->j(LC0/k;LC0/h;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$g;->b(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
