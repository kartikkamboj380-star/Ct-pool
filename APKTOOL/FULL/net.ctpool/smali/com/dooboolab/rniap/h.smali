.class public final synthetic Lcom/dooboolab/rniap/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(ILcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/dooboolab/rniap/h;->a:I

    iput-object p2, p0, Lcom/dooboolab/rniap/h;->b:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/dooboolab/rniap/h;->a:I

    iget-object v1, p0, Lcom/dooboolab/rniap/h;->b:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, v1, p1, p2}, Lcom/dooboolab/rniap/RNIapModule$d;->a(ILcom/facebook/react/bridge/Promise;Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    return-void
.end method
