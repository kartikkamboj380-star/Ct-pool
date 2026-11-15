.class public final synthetic Lcom/dooboolab/rniap/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# instance fields
.field public final synthetic a:Lcom/dooboolab/rniap/RNIapModule;

.field public final synthetic b:Lv5/l;

.field public final synthetic c:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Lcom/dooboolab/rniap/RNIapModule;Lv5/l;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/dooboolab/rniap/e;->a:Lcom/dooboolab/rniap/RNIapModule;

    iput-object p2, p0, Lcom/dooboolab/rniap/e;->b:Lv5/l;

    iput-object p3, p0, Lcom/dooboolab/rniap/e;->c:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/dooboolab/rniap/e;->a:Lcom/dooboolab/rniap/RNIapModule;

    iget-object v1, p0, Lcom/dooboolab/rniap/e;->b:Lv5/l;

    iget-object v2, p0, Lcom/dooboolab/rniap/e;->c:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, v1, v2, p1}, Lcom/dooboolab/rniap/RNIapModule;->a(Lcom/dooboolab/rniap/RNIapModule;Lv5/l;Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V

    return-void
.end method
