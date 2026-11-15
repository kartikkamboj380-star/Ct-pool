.class public final synthetic Lg5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lg5/g;

.field public final synthetic n:Lcom/facebook/react/bridge/ReactContext;


# direct methods
.method public synthetic constructor <init>(Lg5/g;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/d;->m:Lg5/g;

    iput-object p2, p0, Lg5/d;->n:Lcom/facebook/react/bridge/ReactContext;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/d;->m:Lg5/g;

    iget-object v1, p0, Lg5/d;->n:Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v0, v1}, Lg5/g;->c(Lg5/g;Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method
