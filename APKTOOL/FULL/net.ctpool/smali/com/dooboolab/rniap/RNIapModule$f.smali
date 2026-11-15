.class final Lcom/dooboolab/rniap/RNIapModule$f;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->flushFailedPurchasesCachedAsPending(Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/dooboolab/rniap/RNIapModule;

.field final synthetic n:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$f;->m:Lcom/dooboolab/rniap/RNIapModule;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule$f;->n:Lcom/facebook/react/bridge/Promise;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule$f;->c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V

    return-void
.end method

.method private static final c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 3

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lcom/dooboolab/rniap/RNIapModule;->access$isValidResult(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p0}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void

    :cond_1
    check-cast p3, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->g()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p0}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void

    :cond_4
    const/16 p3, 0x8

    invoke-static {p0, p2, p1, p3}, Lcom/dooboolab/rniap/RNIapModule;->access$consumeItems(Lcom/dooboolab/rniap/RNIapModule;Ljava/util/List;Lcom/facebook/react/bridge/Promise;I)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/android/billingclient/api/b;)V
    .locals 4

    .line 1
    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LC0/k;->a()LC0/k$a;

    move-result-object v0

    const-string v1, "inapp"

    invoke-virtual {v0, v1}, LC0/k$a;->b(Ljava/lang/String;)LC0/k$a;

    move-result-object v0

    invoke-virtual {v0}, LC0/k$a;->a()LC0/k;

    move-result-object v0

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule$f;->m:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v2, p0, Lcom/dooboolab/rniap/RNIapModule$f;->n:Lcom/facebook/react/bridge/Promise;

    new-instance v3, Lcom/dooboolab/rniap/j;

    invoke-direct {v3, v1, v2}, Lcom/dooboolab/rniap/j;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/b;->j(LC0/k;LC0/h;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$f;->b(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
