.class final Lcom/dooboolab/rniap/RNIapModule$k;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->isFeatureSupported(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$k;->m:Ljava/lang/String;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule$k;->n:Lcom/facebook/react/bridge/Promise;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/b;)V
    .locals 2

    .line 1
    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule$k;->m:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "SUBSCRIPTIONS_UPDATE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "subscriptionsUpdate"

    goto :goto_1

    :sswitch_1
    const-string v1, "PRICE_CHANGE_CONFIRMATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "priceChangeConfirmation"

    goto :goto_1

    :sswitch_2
    const-string v1, "SUBSCRIPTIONS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "subscriptions"

    goto :goto_1

    :sswitch_3
    const-string v1, "PRODUCT_DETAILS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const-string v0, "fff"

    goto :goto_1

    :sswitch_4
    const-string v1, "IN_APP_MESSAGING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_0
    iget-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$k;->n:Lcom/facebook/react/bridge/Promise;

    const-string v0, "Invalid Feature name"

    invoke-static {p1, v0}, Lcom/dooboolab/rniap/d;->a(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v0, "bbb"

    :goto_1
    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule$k;->n:Lcom/facebook/react/bridge/Promise;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/b;->d(Ljava/lang/String;)Lcom/android/billingclient/api/e;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x57b1774 -> :sswitch_4
        0x2d0b3eb2 -> :sswitch_3
        0x3032e2d6 -> :sswitch_2
        0x67b5ec4e -> :sswitch_1
        0x6a698a52 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$k;->a(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
