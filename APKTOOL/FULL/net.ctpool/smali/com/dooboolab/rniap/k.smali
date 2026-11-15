.class public final synthetic Lcom/dooboolab/rniap/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/h;


# instance fields
.field public final synthetic a:Lcom/dooboolab/rniap/RNIapModule;

.field public final synthetic b:Lcom/facebook/react/bridge/Promise;

.field public final synthetic c:Lcom/facebook/react/bridge/WritableNativeArray;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/dooboolab/rniap/k;->a:Lcom/dooboolab/rniap/RNIapModule;

    iput-object p2, p0, Lcom/dooboolab/rniap/k;->b:Lcom/facebook/react/bridge/Promise;

    iput-object p3, p0, Lcom/dooboolab/rniap/k;->c:Lcom/facebook/react/bridge/WritableNativeArray;

    iput-object p4, p0, Lcom/dooboolab/rniap/k;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/dooboolab/rniap/k;->a:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v1, p0, Lcom/dooboolab/rniap/k;->b:Lcom/facebook/react/bridge/Promise;

    iget-object v2, p0, Lcom/dooboolab/rniap/k;->c:Lcom/facebook/react/bridge/WritableNativeArray;

    iget-object v3, p0, Lcom/dooboolab/rniap/k;->d:Ljava/lang/String;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/dooboolab/rniap/RNIapModule$g;->a(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/List;)V

    return-void
.end method
