.class final Lcom/dooboolab/rniap/RNIapModule$d;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->consumeItems(Ljava/util/List;Lcom/facebook/react/bridge/Promise;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/android/billingclient/api/Purchase;

.field final synthetic n:I

.field final synthetic o:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/Purchase;ILcom/facebook/react/bridge/Promise;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$d;->m:Lcom/android/billingclient/api/Purchase;

    iput p2, p0, Lcom/dooboolab/rniap/RNIapModule$d;->n:I

    iput-object p3, p0, Lcom/dooboolab/rniap/RNIapModule$d;->o:Lcom/facebook/react/bridge/Promise;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method

.method public static synthetic a(ILcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule$d;->c(ILcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    return-void
.end method

.method private static final c(ILcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    const-string p3, "$promise"

    invoke-static {p1, p3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "billingResult"

    invoke-static {p2, p3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()I

    move-result p3

    if-eq p3, p0, :cond_0

    sget-object p0, Lcom/dooboolab/rniap/b;->a:Lcom/dooboolab/rniap/b;

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/dooboolab/rniap/b;->b(Lcom/facebook/react/bridge/Promise;I)V

    return-void

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p0}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/android/billingclient/api/b;)V
    .locals 4

    .line 1
    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LC0/d;->b()LC0/d$a;

    move-result-object v0

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule$d;->m:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LC0/d$a;->b(Ljava/lang/String;)LC0/d$a;

    move-result-object v0

    invoke-virtual {v0}, LC0/d$a;->a()LC0/d;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lcom/dooboolab/rniap/RNIapModule$d;->n:I

    iget-object v2, p0, Lcom/dooboolab/rniap/RNIapModule$d;->o:Lcom/facebook/react/bridge/Promise;

    new-instance v3, Lcom/dooboolab/rniap/h;

    invoke-direct {v3, v1, v2}, Lcom/dooboolab/rniap/h;-><init>(ILcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/b;->b(LC0/d;LC0/e;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$d;->b(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
