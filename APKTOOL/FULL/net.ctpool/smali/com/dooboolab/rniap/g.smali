.class public final synthetic Lcom/dooboolab/rniap/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b;


# instance fields
.field public final synthetic a:Lcom/dooboolab/rniap/RNIapModule;

.field public final synthetic b:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/dooboolab/rniap/g;->a:Lcom/dooboolab/rniap/RNIapModule;

    iput-object p2, p0, Lcom/dooboolab/rniap/g;->b:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/dooboolab/rniap/g;->a:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v1, p0, Lcom/dooboolab/rniap/g;->b:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, v1, p1}, Lcom/dooboolab/rniap/RNIapModule$b;->a(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;)V

    return-void
.end method
