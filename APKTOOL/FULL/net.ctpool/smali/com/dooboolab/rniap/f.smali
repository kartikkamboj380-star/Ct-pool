.class public final synthetic Lcom/dooboolab/rniap/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/dooboolab/rniap/f;->a:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/dooboolab/rniap/f;->a:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, p1}, Lcom/dooboolab/rniap/RNIapModule;->b(Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V

    return-void
.end method
