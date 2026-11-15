.class public final synthetic LG0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/g;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG0/c;->a:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, LG0/c;->a:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, p1}, LG0/d;->c(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method
