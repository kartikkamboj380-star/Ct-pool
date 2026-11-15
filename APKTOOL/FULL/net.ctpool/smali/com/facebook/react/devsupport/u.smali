.class public final synthetic Lcom/facebook/react/devsupport/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B;

.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/u;->m:Lcom/facebook/react/devsupport/B;

    iput p2, p0, Lcom/facebook/react/devsupport/u;->n:I

    iput-object p3, p0, Lcom/facebook/react/devsupport/u;->o:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/react/devsupport/u;->p:Lcom/facebook/react/bridge/ReadableArray;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/u;->m:Lcom/facebook/react/devsupport/B;

    iget v1, p0, Lcom/facebook/react/devsupport/u;->n:I

    iget-object v2, p0, Lcom/facebook/react/devsupport/u;->o:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/react/devsupport/u;->p:Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/react/devsupport/B;->G(Lcom/facebook/react/devsupport/B;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method
