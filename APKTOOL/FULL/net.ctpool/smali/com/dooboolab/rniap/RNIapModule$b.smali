.class final Lcom/dooboolab/rniap/RNIapModule$b;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;->acknowledgePurchase(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
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

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$b;->m:Ljava/lang/String;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule$b;->n:Lcom/dooboolab/rniap/RNIapModule;

    iput-object p3, p0, Lcom/dooboolab/rniap/RNIapModule$b;->o:Lcom/facebook/react/bridge/Promise;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/dooboolab/rniap/RNIapModule$b;->c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;)V

    return-void
.end method

.method private static final c(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lcom/dooboolab/rniap/RNIapModule;->access$isValidResult(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p0

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()I

    move-result v0

    const-string v1, "responseCode"

    invoke-interface {p0, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "debugMessage"

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/dooboolab/rniap/b;->a:Lcom/dooboolab/rniap/b;

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/dooboolab/rniap/b;->a(I)Lcom/dooboolab/rniap/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/dooboolab/rniap/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "code"

    invoke-interface {p0, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-virtual {p2}, Lcom/dooboolab/rniap/a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, v0, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/android/billingclient/api/b;)V
    .locals 4

    .line 1
    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LC0/a;->b()LC0/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule$b;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, LC0/a$a;->b(Ljava/lang/String;)LC0/a$a;

    move-result-object v0

    invoke-virtual {v0}, LC0/a$a;->a()LC0/a;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule$b;->n:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v2, p0, Lcom/dooboolab/rniap/RNIapModule$b;->o:Lcom/facebook/react/bridge/Promise;

    new-instance v3, Lcom/dooboolab/rniap/g;

    invoke-direct {v3, v1, v2}, Lcom/dooboolab/rniap/g;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/b;->a(LC0/a;LC0/b;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/b;

    invoke-virtual {p0, p1}, Lcom/dooboolab/rniap/RNIapModule$b;->b(Lcom/android/billingclient/api/b;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
