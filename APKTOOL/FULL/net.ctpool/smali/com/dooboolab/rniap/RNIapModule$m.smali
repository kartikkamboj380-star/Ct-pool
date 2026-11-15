.class final Lcom/dooboolab/rniap/RNIapModule$m;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->sendUnconsumedPurchases(Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/bridge/Promise;

.field final synthetic n:Lcom/dooboolab/rniap/RNIapModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Promise;Lcom/dooboolab/rniap/RNIapModule;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$m;->m:Lcom/facebook/react/bridge/Promise;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule$m;->n:Lcom/dooboolab/rniap/RNIapModule;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule$m;->c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V

    return-void
.end method

.method private static final c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lcom/dooboolab/rniap/RNIapModule;->access$isValidResult(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->k()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p2, p1}, Lcom/dooboolab/rniap/RNIapModule;->onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/android/billingclient/api/b;)V
    .locals 6

    .line 1
    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inapp"

    const-string v1, "subs"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    aget-object v2, v0, v1

    invoke-static {}, LC0/k;->a()LC0/k$a;

    move-result-object v3

    invoke-virtual {v3, v2}, LC0/k$a;->b(Ljava/lang/String;)LC0/k$a;

    move-result-object v2

    invoke-virtual {v2}, LC0/k$a;->a()LC0/k;

    move-result-object v2

    iget-object v3, p0, Lcom/dooboolab/rniap/RNIapModule$m;->n:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v4, p0, Lcom/dooboolab/rniap/RNIapModule$m;->m:Lcom/facebook/react/bridge/Promise;

    new-instance v5, Lcom/dooboolab/rniap/n;

    invoke-direct {v5, v3, v4}, Lcom/dooboolab/rniap/n;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v2, v5}, Lcom/android/billingclient/api/b;->j(LC0/k;LC0/h;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$m;->m:Lcom/facebook/react/bridge/Promise;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$m;->b(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
